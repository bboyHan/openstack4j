package org.openstack4j.api.networking.ext;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.AclBinding;
import org.openstack4j.model.network.options.AclBindingOptions;

import java.util.List;

/**
 * Acl Binding API
 *
 * @author liwanjun
 */
public interface AclBindingService extends RestService {

    /**
     * List acl bindings
     *
     * @return the list of acl bindings
     */
    List<? extends AclBinding> list();

    List<? extends AclBinding> list(AclBindingOptions options);

    /**
     * Get the acl binding by id
     *
     * @param id acl binding id
     * @return the acl binding
     */
    AclBinding get(String id);

    /**
     * Create acl binding
     *
     * @param aclBinding acl binding object
     * @return the response object
     */
    AclBinding create(AclBinding aclBinding);

    /**
     * Delete the acl binding by id
     *
     * @param id acl binding id
     * @return the action response
     */
    ActionResponse delete(String id);

}
