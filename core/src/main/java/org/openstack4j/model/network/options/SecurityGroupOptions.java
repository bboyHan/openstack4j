package org.openstack4j.model.network.options;

/**
 * @author bboyHan
 */
public class SecurityGroupOptions extends BaseListOptions<SecurityGroupOptions> {

    private SecurityGroupOptions() {
    }

    public SecurityGroupOptions name(String name) {
        return add("name", name);
    }

    public SecurityGroupOptions projectId(String projectId) {
        return add("project_id", projectId);
    }

    public SecurityGroupOptions tenantId(String tenantId) {
        return add("tenant_id", tenantId);
    }

    public SecurityGroupOptions tags(String tags) {
        return add("tags", tags);
    }

    public SecurityGroupOptions id(String id) {
        return add("id", id);
    }

    public SecurityGroupOptions direction(String direction) {
        return add("direction", direction);
    }

    public SecurityGroupOptions securityGroupId(String securityGroupId) { return add("security_group_id", securityGroupId); }

    public static SecurityGroupOptions create() {
        return new SecurityGroupOptions();
    }

    public SecurityGroupOptions add(String key, Object value) {
        putParams(key, value);
        return this;
    }

}
