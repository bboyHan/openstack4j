package org.openstack4j.model.network.options;

import org.openstack4j.model.network.DirectionType;
import org.openstack4j.model.network.IPVersionStrType;

/**
 * @author bboyHan
 */
public class SecurityGroupRuleOptions extends BaseListOptions<SecurityGroupRuleOptions> {

    private SecurityGroupRuleOptions() {
    }

    public SecurityGroupRuleOptions id(String id) {
        return add("id", id);
    }

    public SecurityGroupRuleOptions name(String name) {
        return add("name", name);
    }

    public SecurityGroupRuleOptions projectId(String projectId) {
        return add("project_id", projectId);
    }

    public SecurityGroupRuleOptions tenantId(String tenantId) {
        return add("tenant_id", tenantId);
    }

    public SecurityGroupRuleOptions securityGroupId(String securityGroupId) {
        return add("security_group_id", securityGroupId);
    }

    public SecurityGroupRuleOptions direction(DirectionType direction) {
        return add("direction", direction.getDirection());
    }

    public SecurityGroupRuleOptions etherType(IPVersionStrType type) {
        return add("ethertype", type.getVersion());
    }

    public SecurityGroupRuleOptions protocol(String protocol) {
        return add("protocol", protocol);
    }

    public SecurityGroupRuleOptions portRangeMin(String portRangeMin) {
        return add("port_range_min", portRangeMin);
    }

    public SecurityGroupRuleOptions portRangeMax(String portRangeMax) {
        return add("port_range_max", portRangeMax);
    }

    public SecurityGroupRuleOptions remoteIpPrefix(String remoteIpPrefix) {
        return add("remote_ip_prefix", remoteIpPrefix);
    }

    public SecurityGroupRuleOptions remoteGroupId(String remoteGroupId) {
        return add("remote_group_id", remoteGroupId);
    }

    public SecurityGroupRuleOptions description(String description) {
        return add("description", description);
    }

    public static SecurityGroupRuleOptions create() {
        return new SecurityGroupRuleOptions();
    }

    public SecurityGroupRuleOptions add(String key, Object value) {
        putParams(key, value);
        return this;
    }

}
