package org.openstack4j.openstack.networking.internal.ext;

import org.openstack4j.api.Apis;
import org.openstack4j.api.networking.ext.PortChainService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.PortChain;
import org.openstack4j.model.network.ext.PortPairGroup;
import org.openstack4j.openstack.networking.domain.ext.NeutronPortChain;
import org.openstack4j.openstack.networking.domain.ext.NeutronPortChain.PortChains;
import org.openstack4j.openstack.networking.internal.BaseNetworkingServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * {@inheritDoc}
 */
public class PortChainServiceImpl extends BaseNetworkingServices implements PortChainService {

    private static final Logger LOG = LoggerFactory.getLogger(PortChainServiceImpl.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends PortChain> list() {
        return get(PortChains.class, uri("/sfc/port_chains")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortChain create(PortChain portChain) {
        checkNotNull(portChain);
        return post(NeutronPortChain.class, uri("/sfc/port_chains")).entity(portChain).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String portChainId) {
        checkNotNull(portChainId);
        return deleteWithResponse(uri("/sfc/port_chains/%s", portChainId)).execute();
    }

    @Override
    public ActionResponse clear(String portChainId) {
        checkNotNull(portChainId);
        PortChain portChain = get(portChainId);
        checkNotNull(portChain, "not found the port chain");
        ActionResponse actionResponse = delete(portChain.getId());
        if (!actionResponse.isSuccess()) LOG.error("port chain del failed.");
        List<String> flowClassifiers = portChain.getFlowClassifiers();
        for (String flowClassifier : flowClassifiers) {
            actionResponse = Apis.getSfcServices().flowclassifiers().delete(flowClassifier);
            if (!actionResponse.isSuccess()) LOG.error("flow classifier del failed.");
        }
        List<String> portPairGroups = portChain.getPortPairGroups();
        for (String portPairGroup : portPairGroups) {
            PortPairGroup ppg = Apis.getSfcServices().portpairgroups().get(portPairGroup);
            List<String> portPairs = ppg.getPortPairs();
            actionResponse = Apis.getSfcServices().portpairgroups().delete(portPairGroup);
            if (!actionResponse.isSuccess()) LOG.error("port pair group del failed.");
            for (String portPair : portPairs) {
                actionResponse = Apis.getSfcServices().portpairs().delete(portPair);
                if (!actionResponse.isSuccess()) LOG.error("port pair del failed.");
            }
        }
        LOG.warn("sfc resources have been cleaned up, port chain info : {}", portChain);
        return actionResponse;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortChain get(String portChainId) {
        checkNotNull(portChainId);
        return get(NeutronPortChain.class, uri("/sfc/port_chains/%s", portChainId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortChain update(String portChainId, PortChain portChain) {
        checkNotNull(portChainId);
        return put(NeutronPortChain.class, uri("/sfc/port_chains/%s", portChainId)).entity(portChain).execute();
    }
}
