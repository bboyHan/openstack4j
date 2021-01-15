package org.openstack4j.model.network.ext;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.common.Resource;
import org.openstack4j.model.network.ext.builder.AclRuleBuilder;

/**
 * An Acl Rule entity
 *
 * @author liwanjun
 */
public interface AclRule extends Resource, Buildable<AclRuleBuilder> {

    /**
     * @return the description of the acl rule
     */
    String getDescription();

    /**
     * @return the admin state up of the acl rule
     */
    String getAdminStateUp();

    /**
     * @return the status of the acl rule
     */
    String getStatus();

    /**
     * @return the acl policy id of the acl rule
     */
    String getAclPolicyId();

    /**
     * @return the create time of the acl rule
     */
    String getCreateTime();

    /**
     * @return the update time of the acl rule
     */
    String getUpdateTime();

    /**
     * @return the project id of the acl rule
     */
    String getProjectId();

    /**
     * @return the protocol of the acl rule
     */
    String getProtocol();

    /**
     * @return the ip version of the acl rule
     */
    String getIpVersion();

    /**
     * @return the source ip address of the acl rule
     */
    String getSourceIpAddress();

    /**
     * @return the destination ip address of the acl rule
     */
    String getDestinationIpAddress();

    /**
     * @return the source port of the acl rule
     */
    String getSourcePort();

    /**
     * @return the direction of the acl rule
     */
    String getDirection();

    /**
     * @return the destination port of the acl rule
     */
    String getDestinationPort();

    /**
     * @return the action of the acl rule
     */
    String getAction();

    /**
     * @return the position of the acl rule
     */
    String getPosition();

    /**
     * @return the enabled of the acl rule
     */
    String getEnabled();

    /**
     * @return the policy id of the acl rule
     */
    String getPolicyId();

    /**
     * @return the insert before of the acl rule
     */
    String getInsertBefore();

    /**
     * @return the insert after of the acl rule
     */
    String getInsertAfter();

}
