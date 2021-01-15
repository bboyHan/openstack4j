package org.openstack4j.openstack.networking.internal.ext;

import org.openstack4j.api.networking.ext.AclBindingService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.AclBinding;
import org.openstack4j.model.network.options.AclBindingOptions;
import org.openstack4j.openstack.networking.domain.ext.NeutronAclBinding;
import org.openstack4j.openstack.networking.domain.ext.NeutronAclBinding.AclBindings;
import org.openstack4j.openstack.networking.internal.BaseNetworkingServices;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Acl Binding implementation
 *
 * @author liwanjun
 */
public class AclBindingServiceImpl extends BaseNetworkingServices implements AclBindingService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends AclBinding> list() {
        return get(AclBindings.class, uri("/acl/acl_bindings")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends AclBinding> list(AclBindingOptions options) {
        if (options == null) {
            return list();
        }
        return get(AclBindings.class, uri("/acl/acl_bindings")).paramLists(options.getOptions()).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclBinding get(String id) {
        checkNotNull(id);
        return get(NeutronAclBinding.class, uri("/acl/acl_bindings/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclBinding create(AclBinding aclBinding) {
        checkNotNull(aclBinding);
        return post(NeutronAclBinding.class, uri("/acl/acl_bindings")).entity(aclBinding).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse(uri("/acl/acl_bindings/%s", id)).execute();
    }

}
