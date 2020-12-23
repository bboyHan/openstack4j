package org.openstack4j.model.network.options;

/**
 * @author bboyHan
 */
public class RpFilterOptions extends BaseListOptions<RpFilterOptions> {

    private RpFilterOptions() {
    }

    public static RpFilterOptions create() {
        return new RpFilterOptions();
    }

    public RpFilterOptions value(String value) {
        return add("value", value);
    }

    public RpFilterOptions routerId(String routerId) {
        return add("router_id", routerId);
    }

    public RpFilterOptions portId(String portId) {
        return add("port_id", portId);
    }

    public RpFilterOptions pref(String pref) {
        return add("pref", pref);
    }

    public RpFilterOptions id(String id) {
        return add("id", id);
    }

    public RpFilterOptions tenantId(String tenantId) {
        return add("tenant_id", tenantId);
    }

    public RpFilterOptions add(String key, String value) {
        putParams(key, value);
        return this;
    }

}
