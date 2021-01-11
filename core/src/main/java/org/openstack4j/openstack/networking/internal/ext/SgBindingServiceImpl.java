package org.openstack4j.openstack.networking.internal.ext;

import org.openstack4j.api.networking.ext.SgBindingService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.SgBinding;
import org.openstack4j.model.network.options.SgBindingOptions;
import org.openstack4j.openstack.networking.domain.ext.NeutronSgBinding;
import org.openstack4j.openstack.networking.domain.ext.NeutronSgBinding.SgBindings;
import org.openstack4j.openstack.networking.internal.BaseNetworkingServices;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Sg Binding implementation
 *
 * @author liwanjun
 */
public class SgBindingServiceImpl extends BaseNetworkingServices implements SgBindingService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends SgBinding> list() {
        return get(SgBindings.class, uri("/bmsg/sg_bindings")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends SgBinding> list(SgBindingOptions options) {
        if (options == null) {
            return list();
        }
        return get(SgBindings.class, uri("/bmsg/sg_bindings")).paramLists(options.getOptions()).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SgBinding get(String id) {
        checkNotNull(id);
        return get(NeutronSgBinding.class, uri("/bmsg/sg_bindings/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SgBinding create(SgBinding sgBinding) {
        checkNotNull(sgBinding);
        return post(NeutronSgBinding.class, uri("/bmsg/sg_bindings")).entity(sgBinding).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse(uri("/bmsg/sg_bindings/%s", id)).execute();
    }

}
