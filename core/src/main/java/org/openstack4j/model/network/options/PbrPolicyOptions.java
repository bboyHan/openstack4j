package org.openstack4j.model.network.options;

/**
 * @author bboyHan
 */
public class PbrPolicyOptions extends BaseListOptions<PbrPolicyOptions> {

    private PbrPolicyOptions() {
    }

    public static PbrPolicyOptions create() {
        return new PbrPolicyOptions();
    }

    public PbrPolicyOptions description(String description) {
        return add("description", description);
    }

    public PbrPolicyOptions routerId(String routerId) {
        return add("router_id", routerId);
    }

    public PbrPolicyOptions adminStateUp(String adminStateUp) {
        return add("admin_state_up", adminStateUp);
    }

    public PbrPolicyOptions status(String status) {
        return add("status", status);
    }

    public PbrPolicyOptions id(String id) {
        return add("id", id);
    }

    public PbrPolicyOptions name(String name) {
        return add("name", name);
    }

    public PbrPolicyOptions tenantId(String tenantId) {
        return add("tenant_id", tenantId);
    }

    public PbrPolicyOptions add(String key, String value) {
        putParams(key, value);
        return this;
    }

}
