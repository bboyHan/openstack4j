package org.openstack4j.model.network.ext;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.common.Resource;
import org.openstack4j.model.network.ext.builder.SecurityGroupBlackRuleBuilder;

public interface SecurityGroupBlackRule extends Resource, Buildable<SecurityGroupBlackRuleBuilder> {

    /**
     * @return the security group id of the sg black rule
     */
    String getSecurityGroupId();

    /**
     * @return the direction of the sg black rule
     */
    String getDirection();

    /**
     * @return the protocol of the sg black rule
     */
    String getProtocol();

    /**
     * @return the port range min of the sg black rule
     */
    Integer getPortRangeMin();

    /**
     * @return the port range max of the sg black rule
     */
    Integer getPortRangeMax();

    /**
     * @return the ethertype of the sg black rule
     */
    String getEthertype();

    /**
     * @return the remote group id of the sg black rule
     */
    String getRemoteGroupId();

    /**
     * @return the remote ip prefix of the sg black rule
     */
    String getRemoteIpPrefix();

    /**
     * @return the project id of the sg black rule
     */
    String getProjectId();

    /**
     * @return the description of the sg black rule
     */
    String description();

    /**
     * @return the created at of the sg black rule
     */
    String createdAt();

    /**
     * @return the action of the sg black rule
     */
    String action();
}
