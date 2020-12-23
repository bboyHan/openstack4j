package org.openstack4j.model.network.options;

/**
 * @author bboyHan
 */
public class QosPolicyOptions extends BaseListOptions<QosPolicyOptions> {

    private QosPolicyOptions() {
    }

    public static QosPolicyOptions create() {
        return new QosPolicyOptions();
    }

    public QosPolicyOptions description(String description) {
        return add("description", description);
    }

    public QosPolicyOptions id(String id) {
        return add("id", id);
    }

    public QosPolicyOptions name(String name) {
        return add("name", name);
    }

    public QosPolicyOptions tenantId(String tenantId) {
        return add("tenant_id", tenantId);
    }

    public QosPolicyOptions add(String key, String value) {
        putParams(key, value);
        return this;
    }

}
