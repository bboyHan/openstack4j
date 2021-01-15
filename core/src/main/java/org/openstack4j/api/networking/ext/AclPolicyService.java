package org.openstack4j.api.networking.ext;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.AclPolicy;
import org.openstack4j.model.network.options.AclPolicyOptions;

import java.util.List;

/**
 * Acl Policy API
 *
 * @author liwanjun
 */
public interface AclPolicyService extends RestService {

    /**
     * List acl policies
     *
     * @return the list of acl policies
     */
    List<? extends AclPolicy> list();

    List<? extends AclPolicy> list(AclPolicyOptions options);

    /**
     * Get the acl policy by id
     *
     * @param id acl policy id
     * @return the acl policy
     */
    AclPolicy get(String id);

    /**
     * Create acl policy
     *
     * @param aclPolicy acl policy object
     * @return the response object
     */
    AclPolicy create(AclPolicy aclPolicy);

    /**
     * Update acl policy
     *
     * @param id acl policy id
     * @param aclPolicy acl policy object
     * @return the response object
     */
    AclPolicy update(String id, AclPolicy aclPolicy);

    /**
     * Delete the acl policy by id
     *
     * @param id acl policy id
     * @return the action response
     */
    ActionResponse delete(String id);

}
