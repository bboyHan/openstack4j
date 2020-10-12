package org.openstack4j.openstack.networking.internal.ext;

import org.openstack4j.api.Apis;
import org.openstack4j.api.networking.ext.NetIpAvailabilitiesService;
import org.openstack4j.model.network.NetIpAvailability;
import org.openstack4j.model.network.SubnetIpAvailability;
import org.openstack4j.model.network.options.NetIpAvailListOptions;
import org.openstack4j.openstack.networking.domain.ext.NeutronNetIpAvailability;
import org.openstack4j.openstack.networking.domain.ext.NeutronNetIpAvailability.NetIpAvailabilities;
import org.openstack4j.openstack.networking.domain.ext.NeutronSubnetIpAvailability;
import org.openstack4j.openstack.networking.internal.BaseNetworkingServices;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author bboyHan
 */
public class NetIpAvailabilitiesServiceImpl extends BaseNetworkingServices implements NetIpAvailabilitiesService {

    @Override
    public List<? extends NetIpAvailability> list() {
        return get(NetIpAvailabilities.class, uri("/network-ip-availabilities")).execute().getList();
    }

    @Override
    public List<? extends NetIpAvailability> list(NetIpAvailListOptions options) {
        if (options == null)
            return list();

        return get(NetIpAvailabilities.class, uri("/network-ip-availabilities")).paramLists(options.getOptions())
                .execute().getList();
    }

    @Override
    public NetIpAvailability get(String networkId) {
        checkNotNull(networkId);
        return get(NeutronNetIpAvailability.class, uri("/network-ip-availabilities/%s", networkId)).execute();
    }

    @Override
    @SuppressWarnings("unchecked")
    public SubnetIpAvailability getSubnetIpAvail(String subnetId) {
        String networkId = Apis.getNetworkingServices().subnet().get(subnetId).getNetworkId();
        List<NeutronSubnetIpAvailability> subnetIpAvailabilities = (List<NeutronSubnetIpAvailability>) get(networkId).getSubnetIpAvailabilities();
        for (NeutronSubnetIpAvailability subnetIpAvailability : subnetIpAvailabilities) {
            if (subnetIpAvailability.getSubnetId().equalsIgnoreCase(subnetId)) {
                return subnetIpAvailability;
            }
        }
        return null;
    }
}
