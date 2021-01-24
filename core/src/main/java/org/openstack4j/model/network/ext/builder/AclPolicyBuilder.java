package org.openstack4j.model.network.ext.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.network.ext.AclPolicy;

import java.util.List;

/**
 * A builder to create an acl policy
 *
 * @author liwanjun
 */
public interface AclPolicyBuilder extends Builder<AclPolicyBuilder, AclPolicy> {

    /**
     * @param id : the identifier of the acl policy
     * @return AclPolicyBuilder
     */
    AclPolicyBuilder id(String id);

    /**
     * @param name : the name of the acl policy
     * @return AclPolicyBuilder
     */
    AclPolicyBuilder name(String name);

    /**
     * @param tenantId : the tenant id of the acl policy
     * @return AclPolicyBuilder
     */
    AclPolicyBuilder tenantId(String tenantId);

    /**
     * @param description : the description of the acl policy
     * @return AclPolicyBuilder
     */
    AclPolicyBuilder description(String description);

    /**
     * @param adminStateUp : the admin state up of the acl policy
     * @return AclPolicyBuilder
     */
    AclPolicyBuilder adminStateUp(String adminStateUp);

    /**
     * @param status : the status of the acl policy
     * @return AclPolicyBuilder
     */
    AclPolicyBuilder status(String status);

    /**
     * @param networkId : the network id of the acl policy
     * @return AclPolicyBuilder
     */
    AclPolicyBuilder networkId(String networkId);

    /**
     * @param createTime : the create time of the acl policy
     * @return AclPolicyBuilder
     */
    AclPolicyBuilder createTime(String createTime);

    /**
     * @param updateTime : the update time of the acl policy
     * @return AclPolicyBuilder
     */
    AclPolicyBuilder updateTime(String updateTime);

    /**
     * @param projectId : the project id of the acl policy
     * @return AclPolicyBuilder
     */
    AclPolicyBuilder projectId(String projectId);

    /**
     * @param tag : the tag of the acl policy
     * @return AclPolicyBuilder
     */
    AclPolicyBuilder tag(String tag);

    /**
     * @param vpcName : the vpc name of the acl policy
     * @return AclPolicyBuilder
     */
    AclPolicyBuilder vpcName(String vpcName);

    /**
     * @param aclRules : the acl rules of the acl policy
     * @return AclPolicyBuilder
     */
    AclPolicyBuilder aclRules(List<String> aclRules);

    /**
     * @param aclBindingList : the acl binding list of the acl policy
     * @return AclPolicyBuilder
     */
    AclPolicyBuilder aclBindingList(List<String> aclBindingList);

}
