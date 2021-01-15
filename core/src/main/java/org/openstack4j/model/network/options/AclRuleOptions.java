package org.openstack4j.model.network.options;

/**
 * @author liwanjun
 */
public class AclRuleOptions extends BaseListOptions<AclRuleOptions> {

    private AclRuleOptions() {
    }

    public static AclRuleOptions create() {
        return new AclRuleOptions();
    }

    /**
     * @param name : the name of the acl rule
     * @return options
     */
    public AclRuleOptions name(String name) {
        return add("name", name);
    }

    /**
     * @param tenantId : the tenant id of the acl rule
     * @return options
     */
    public AclRuleOptions tenantId(String tenantId) {
        return add("tenant_id", tenantId);
    }

    /**
     * @param description : the description of the acl rule
     * @return options
     */
    public AclRuleOptions description(String description) {
        return add("description", description);
    }

    /**
     * @param adminStateUp : the admin state up of the acl rule
     * @return options
     */
    public AclRuleOptions adminStateUp(String adminStateUp) {
        return add("admin_state_up", adminStateUp);
    }

    /**
     * @param status : the status of the acl rule
     * @return options
     */
    public AclRuleOptions status(String status) {
        return add("status", status);
    }

    /**
     * @param aclPolicyId : the acl policy id of the acl rule
     * @return options
     */
    public AclRuleOptions aclPolicyId(String aclPolicyId) {
        return add("acl_policy_id", aclPolicyId);
    }

    /**
     * @param createTime : the create time of the acl rule
     * @return options
     */
    public AclRuleOptions createTime(String createTime) {
        return add("create_time", createTime);
    }

    /**
     * @param updateTime : the update time of the acl rule
     * @return options
     */
    public AclRuleOptions updateTime(String updateTime) {
        return add("update_time", updateTime);
    }

    /**
     * @param projectId : the project id of the acl rule
     * @return options
     */
    public AclRuleOptions projectId(String projectId) {
        return add("project_id", projectId);
    }

    /**
     * @param protocol : the protocol of the acl rule
     * @return options
     */
    public AclRuleOptions protocol(String protocol) {
        return add("protocol", protocol);
    }

    /**
     * @param ipVersion : the ip version of the acl rule
     * @return options
     */
    public AclRuleOptions ipVersion(String ipVersion) {
        return add("ip_version", ipVersion);
    }

    /**
     * @param sourceIpAddress : the source ip address of the acl rule
     * @return options
     */
    public AclRuleOptions sourceIpAddress(String sourceIpAddress) {
        return add("source_ip_address", sourceIpAddress);
    }

    /**
     * @param destinationIpAddress : the destination ip address of the acl rule
     * @return options
     */
    public AclRuleOptions destinationIpAddress(String destinationIpAddress) {
        return add("destination_ip_address", destinationIpAddress);
    }

    /**
     * @param sourcePort : the source port of the acl rule
     * @return options
     */
    public AclRuleOptions sourcePort(String sourcePort) {
        return add("source_port", sourcePort);
    }

    /**
     * @param direction : the direction of the acl rule
     * @return options
     */
    public AclRuleOptions direction(String direction) {
        return add("direction", direction);
    }

    /**
     * @param destinationPort : the destination port of the acl rule
     * @return options
     */
    public AclRuleOptions destinationPort(String destinationPort) {
        return add("destination_port", destinationPort);
    }

    /**
     * @param action : the action of the acl rule
     * @return options
     */
    public AclRuleOptions action(String action) {
        return add("action", action);
    }

    /**
     * @param position : the position of the acl rule
     * @return options
     */
    public AclRuleOptions position(String position) {
        return add("position", position);
    }

    /**
     * @param enabled : the enabled of the acl rule
     * @return options
     */
    public AclRuleOptions enabled(String enabled) {
        return add("enabled", enabled);
    }

    /**
     * @param policyId : the policy id of the acl rule
     * @return options
     */
    public AclRuleOptions policyId(String policyId) {
        return add("policy_id", policyId);
    }

    /**
     * @param insertBefore : the insert before of the acl rule
     * @return options
     */
    public AclRuleOptions insertBefore(String insertBefore) {
        return add("insert_before", insertBefore);
    }

    /**
     * @param insertAfter : the insert after of the acl rule
     * @return options
     */
    public AclRuleOptions insertAfter(String insertAfter) {
        return add("insert_after", insertAfter);
    }

    /**
     * @param id : the identifier of the acl rule
     * @return options
     */
    public AclRuleOptions id(String id) {
        return add("id", id);
    }

    public AclRuleOptions add(String key, String value) {
        putParams(key, value);
        return this;
    }

}
