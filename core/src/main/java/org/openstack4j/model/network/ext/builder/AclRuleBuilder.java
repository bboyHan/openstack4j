package org.openstack4j.model.network.ext.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.network.ext.AclRule;

/**
 * A builder to create an acl rule
 *
 * @author liwanjun
 */
public interface AclRuleBuilder extends Builder<AclRuleBuilder, AclRule> {

    /**
     * @param id : the identifier of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder id(String id);

    /**
     * @param name : the name of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder name(String name);

    /**
     * @param tenantId : the tenant id of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder tenantId(String tenantId);

    /**
     * @param description : the description of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder description(String description);

    /**
     * @param adminStateUp : the admin state up of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder adminStateUp(String adminStateUp);

    /**
     * @param status : the status of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder status(String status);

    /**
     * @param aclPolicyId : the acl policy id of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder aclPolicyId(String aclPolicyId);

    /**
     * @param createTime : the create time of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder createTime(String createTime);

    /**
     * @param updateTime : the update time of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder updateTime(String updateTime);

    /**
     * @param projectId : the project id of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder projectId(String projectId);

    /**
     * @param protocol : the protocol of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder protocol(String protocol);

    /**
     * @param ipVersion : the ip version of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder ipVersion(String ipVersion);

    /**
     * @param sourceIpAddress : the source ip address of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder sourceIpAddress(String sourceIpAddress);

    /**
     * @param destinationIpAddress : the destination ip address of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder destinationIpAddress(String destinationIpAddress);

    /**
     * @param sourcePort : the source port of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder sourcePort(String sourcePort);

    /**
     * @param direction : the direction of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder direction(String direction);

    /**
     * @param destinationPort : the destination port of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder destinationPort(String destinationPort);

    /**
     * @param action : the action of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder action(String action);

    /**
     * @param position : the position of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder position(String position);

    /**
     * @param enabled : the enabled of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder enabled(String enabled);

    /**
     * @param policyId : the policy id of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder policyId(String policyId);

    /**
     * @param insertBefore : the insert before of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder insertBefore(String insertBefore);

    /**
     * @param insertAfter : the insert after of the acl rule
     * @return AclRuleBuilder
     */
    AclRuleBuilder insertAfter(String insertAfter);

}
