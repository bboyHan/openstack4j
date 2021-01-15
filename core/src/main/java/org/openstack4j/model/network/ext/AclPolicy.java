package org.openstack4j.model.network.ext;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.common.Resource;
import org.openstack4j.model.network.ext.builder.AclPolicyBuilder;

import java.util.List;

/**
 * An Acl Policy entity
 *
 * @author liwanjun
 */
public interface AclPolicy extends Resource, Buildable<AclPolicyBuilder> {

    /**
     * @return the description of the acl policy
     */
    String getDescription();

    /**
     * @return the admin state up of the acl policy
     */
    String getAdminStateUp();

    /**
     * @return the status of the acl policy
     */
    String getStatus();

    /**
     * @return the network id of the acl policy
     */
    String getNetworkId();

    /**
     * @return the create time of the acl policy
     */
    String getCreateTime();

    /**
     * @return the update time of the acl policy
     */
    String getUpdateTime();

    /**
     * @return the acl rules of the acl policy
     */
    List<String> getAclRules();

    /**
     * @return the acl binding list of the acl policy
     */
    List<String> getAclBindingList();

    /**
     * @return the project id of the acl policy
     */
    String getProjectId();

    /**
     * @return the tag of the acl policy
     */
    String getTag();

    /**
     * @return the vpc name of the acl policy
     */
    String getVpcName();

}
