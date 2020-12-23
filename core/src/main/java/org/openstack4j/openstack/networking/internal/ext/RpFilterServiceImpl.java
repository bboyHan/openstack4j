package org.openstack4j.openstack.networking.internal.ext;

import org.openstack4j.api.networking.ext.RpFilterService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.RpFilter;
import org.openstack4j.model.network.options.RpFilterOptions;
import org.openstack4j.openstack.networking.domain.ext.NeutronRpFilter;
import org.openstack4j.openstack.networking.domain.ext.NeutronRpFilter.RpFilters;
import org.openstack4j.openstack.networking.internal.BaseNetworkingServices;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * {@inheritDoc}
 */
public class RpFilterServiceImpl extends BaseNetworkingServices implements RpFilterService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends RpFilter> list() {
        return get(RpFilters.class, uri("/rp_filters")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends RpFilter> list(RpFilterOptions options) {
        return get(RpFilters.class, uri("/rp_filters")).paramLists(options.getOptions()).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RpFilter create(RpFilter pbrPolicy) {
        checkNotNull(pbrPolicy);
        return post(NeutronRpFilter.class, uri("/rp_filters")).entity(pbrPolicy).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String portChainId) {
        checkNotNull(portChainId);
        return deleteWithResponse(uri("/rp_filters/%s", portChainId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RpFilter get(String id) {
        checkNotNull(id);
        return get(NeutronRpFilter.class, uri("/rp_filters/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RpFilter update(String id, RpFilter rpFilter) {
        checkNotNull(id);
        return put(NeutronRpFilter.class, uri("/rp_filters/%s", id)).entity(rpFilter).execute();
    }
}
