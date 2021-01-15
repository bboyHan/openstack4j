package org.openstack4j.model.network.ext;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.network.ext.builder.AclBindingBuilder;

/**
 * An Acl Binding entity
 *
 * @author liwanjun
 */
public interface AclBinding extends ModelEntity, Buildable<AclBindingBuilder> {

    /**
     * @return the identifier of the acl binding
     */
    String getId();

    /**
     * @return the tenant id of the acl binding
     */
    String getTenantId();

    /**
     * @return the router id of the acl binding
     */
    String getRouterId();

    /**
     * @return the network id of the acl binding
     */
    String getNetworkId();

    /**
     * @return the subnet id of the acl binding
     */
    String getSubnetId();

    /**
     * @return the admin state up of the acl binding
     */
    String getAdminStateUp();

    /**
     * @return the status of the acl binding
     */
    String getStatus();

    /**
     * @return the acl policy id of the acl binding
     */
    String getAclPolicyId();

    /**
     * @return the create time of the acl binding
     */
    String getCreateTime();

    /**
     * @return the project id of the acl binding
     */
    String getProjectId();

}
