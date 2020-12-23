package org.openstack4j.openstack.networking.internal.ext;

import org.openstack4j.api.networking.ext.PbrPolicyService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.PbrPolicy;
import org.openstack4j.model.network.options.PbrPolicyOptions;
import org.openstack4j.openstack.networking.domain.ext.NeutronPbrPolicy;
import org.openstack4j.openstack.networking.domain.ext.NeutronPbrPolicy.PbrPolicies;
import org.openstack4j.openstack.networking.internal.BaseNetworkingServices;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * {@inheritDoc}
 */
public class PbrPolicyServiceImpl extends BaseNetworkingServices implements PbrPolicyService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends PbrPolicy> list() {
        return get(PbrPolicies.class, uri("/pbr_policies")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends PbrPolicy> list(PbrPolicyOptions options) {
        return get(PbrPolicies.class, uri("/pbr_policies")).paramLists(options.getOptions()).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PbrPolicy create(PbrPolicy pbrPolicy) {
        checkNotNull(pbrPolicy);
        return post(NeutronPbrPolicy.class, uri("/pbr_policies")).entity(pbrPolicy).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String portChainId) {
        checkNotNull(portChainId);
        return deleteWithResponse(uri("/pbr_policies/%s", portChainId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PbrPolicy get(String id) {
        checkNotNull(id);
        return get(NeutronPbrPolicy.class, uri("/pbr_policies/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PbrPolicy update(String pbrId, PbrPolicy pbrPolicy) {
        checkNotNull(pbrId);
        return put(NeutronPbrPolicy.class, uri("/pbr_policies/%s", pbrId)).entity(pbrPolicy).execute();
    }
}
