package org.openstack4j.model.network.options;

/**
 * @author bboyHan
 */
public class PbrRuleOptions extends BaseListOptions<PbrRuleOptions> {

    private PbrRuleOptions() {
    }

    public static PbrRuleOptions create() {
        return new PbrRuleOptions();
    }

    public PbrRuleOptions description(String description) {
        return add("description", description);
    }

    public PbrRuleOptions applyRouterPort(String applyRouterPort) {
        return add("apply_router_port", applyRouterPort);
    }

    public PbrRuleOptions adminStateUp(String adminStateUp) {
        return add("admin_state_up", adminStateUp);
    }

    public PbrRuleOptions status(String status) {
        return add("status", status);
    }

    public PbrRuleOptions id(String id) {
        return add("id", id);
    }

    public PbrRuleOptions name(String name) {
        return add("name", name);
    }

    public PbrRuleOptions tenantId(String tenantId) {
        return add("tenant_id", tenantId);
    }

    public PbrRuleOptions pbrPolicyId(String pbrPolicyId) {
        return add("pbr_policy_id", pbrPolicyId);
    }

    public PbrRuleOptions enabled(String enabled) {
        return add("enabled", enabled);
    }

    public PbrRuleOptions protocol(String protocol) {
        return add("protocol", protocol);
    }

    public PbrRuleOptions sourceIpAddress(String sourceIpAddress) {
        return add("source_ip_address", sourceIpAddress);
    }

    public PbrRuleOptions destinationIpAddress(String destinationIpAddress) {
        return add("destination_ip_address", destinationIpAddress);
    }

    public PbrRuleOptions sourcePort(String sourcePort) {
        return add("source_port", sourcePort);
    }

    public PbrRuleOptions destinationPort(String destinationPort) {
        return add("destination_port", destinationPort);
    }

    public PbrRuleOptions nextHop(String nextHop) {
        return add("next_hop", nextHop);
    }

    public PbrRuleOptions pref(String pref) {
        return add("pref", pref);
    }

    public PbrRuleOptions add(String key, String value) {
        putParams(key, value);
        return this;
    }

}
