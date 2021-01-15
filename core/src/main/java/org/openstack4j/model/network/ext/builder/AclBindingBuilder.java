package org.openstack4j.model.network.ext.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.network.ext.AclBinding;

/**
 * A builder to create an acl binding
 *
 * @author liwanjun
 */
public interface AclBindingBuilder extends Builder<AclBindingBuilder, AclBinding> {

    /**
     * @param tenantId : the tenant id of the acl binding
     * @return AclBindingBuilder
     */
    AclBindingBuilder tenantId(String tenantId);

    /**
     * @param routerId : the router id of the acl binding
     * @return AclBindingBuilder
     */
    AclBindingBuilder routerId(String routerId);

    /**
     * @param networkId : the network id of the acl binding
     * @return AclBindingBuilder
     */
    AclBindingBuilder networkId(String networkId);

    /**
     * @param subnetId : the subnet id of the acl binding
     * @return AclBindingBuilder
     */
    AclBindingBuilder subnetId(String subnetId);

    /**
     * @param adminStateUp : the admin state up of the acl binding
     * @return AclBindingBuilder
     */
    AclBindingBuilder adminStateUp(String adminStateUp);

    /**
     * @param status : the status of the acl binding
     * @return AclBindingBuilder
     */
    AclBindingBuilder status(String status);

    /**
     * @param aclPolicyId : the acl policy id of the acl binding
     * @return AclBindingBuilder
     */
    AclBindingBuilder aclPolicyId(String aclPolicyId);

    /**
     * @param createTime : the create time of the acl binding
     * @return AclBindingBuilder
     */
    AclBindingBuilder createTime(String createTime);

    /**
     * @param projectId : the project id of the acl binding
     * @return AclBindingBuilder
     */
    AclBindingBuilder projectId(String projectId);

}
