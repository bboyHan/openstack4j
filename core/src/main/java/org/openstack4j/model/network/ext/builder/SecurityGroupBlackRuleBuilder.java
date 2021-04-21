package org.openstack4j.model.network.ext.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.network.ext.SecurityGroupBlackRule;

/**
 * A Builder to create a security group black rule
 */
public interface SecurityGroupBlackRuleBuilder extends Builder<SecurityGroupBlackRuleBuilder, SecurityGroupBlackRule> {

    /**
     * @param id the identifier of the sg black rule
     * @return the security group black rule builder
     */
    SecurityGroupBlackRuleBuilder id(String id);

    /**
     * @param securityGroupId the security group id of the sg black rule
     * @return the security group black rule builder
     */
    SecurityGroupBlackRuleBuilder securityGroupId(String securityGroupId);

    /**
     * @param direction value is ingress or egress
     * @return the security group black rule builder
     */
    SecurityGroupBlackRuleBuilder direction(String direction);

    /**
     * @param protocol the IP protocol
     * @return the security group black rule builder
     */
    SecurityGroupBlackRuleBuilder protocol(String protocol);

    /**\
     *
     * @param portRangeMin the port range min of the sg black rule
     * @return the security group black rule builder
     */
    SecurityGroupBlackRuleBuilder portRangeMin(String portRangeMin);

    /**
     * @param portRangeMax port range max of the sg black rule
     * @return the security group black rule builder
     */
    SecurityGroupBlackRuleBuilder portRangeMax(String portRangeMax);

    /**
     * @param ethertype the ethertype of the sg black rule
     * @return the security group black rule builder
     */
    SecurityGroupBlackRuleBuilder ethertype(String ethertype);

    /**
     * @param remoteGroupId the remote group id of the sg black rule
     * @return the security group black rule builder
     */
    SecurityGroupBlackRuleBuilder remoteGroupId(String remoteGroupId);

    /**
     * @param remoteIpPrefix the remote ip prefix of the sg black rule
     * @return the security group black rule builder
     */
    SecurityGroupBlackRuleBuilder remoteIpPrefix(String remoteIpPrefix);

    /**
     * @param projectId the project id of the sg black rule
     * @return the security group black rule builder
     */
    SecurityGroupBlackRuleBuilder projectId(String projectId);

    /**
     * @param description the description of the sg black rule
     * @return the security group black rule builder
     */
    SecurityGroupBlackRuleBuilder description(String description);

    /**
     * @param createdAt the created at the sg black rule
     * @return the security group black rule builder
     */
    SecurityGroupBlackRuleBuilder createdAt(String createdAt);

    /**
     * @param action the action the sg black rule
     * @return the security group black rule builder
     */
    SecurityGroupBlackRuleBuilder action(String action);
}
