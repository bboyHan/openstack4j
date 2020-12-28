package org.openstack4j.model.network.options;

/**
 * @author liwanjun
 */
public class SgRuleOptions extends BaseListOptions<SgRuleOptions> {

    private SgRuleOptions() {
    }

    public static SgRuleOptions create() {
        return new SgRuleOptions();
    }

    /**
     * @param name : the name of the sg rule
     * @return options
     */
    public SgRuleOptions name(String name) {
        return add("name", name);
    }

    /**
     * @param tenantId : the tenant id of the sg rule
     * @return options
     */
    public SgRuleOptions tenantId(String tenantId) {
        return add("tenant_id", tenantId);
    }

    /**
     * @param type : the type of the sg rule
     * @return options
     */
    public SgRuleOptions type(String type) {
        return add("type", type);
    }

    /**
     * @param direction : the direction of the sg rule
     * @return options
     */
    public SgRuleOptions direction(String direction) {
        return add("direction", direction);
    }

    /**
     * @param protocol : the protocol of the sg rule
     * @return options
     */
    public SgRuleOptions protocol(String protocol) {
        return add("protocol", protocol);
    }

    /**
     * @param ipVersion : the ip version of the sg rule
     * @return options
     */
    public SgRuleOptions ipVersion(String ipVersion) {
        return add("ip_version", ipVersion);
    }

    /**
     * @param sourceIpAddress : the source ip address of the sg rule
     * @return options
     */
    public SgRuleOptions sourceIpAddress(String sourceIpAddress) {
        return add("source_ip_address", sourceIpAddress);
    }

    /**
     * @param destinationIpAddress : the destination ip address of the sg rule
     * @return options
     */
    public SgRuleOptions destinationIpAddress(String destinationIpAddress) {
        return add("destination_ip_address", destinationIpAddress);
    }

    /**
     * @param portRangeMax : the port range max of the sg rule
     * @return options
     */
    public SgRuleOptions portRangeMax(String portRangeMax) {
        return add("port_range_max", portRangeMax);
    }

    /**
     * @param portRangeMin : the port range min of the sg rule
     * @return options
     */
    public SgRuleOptions portRangeMin(String portRangeMin) {
        return add("port_range_min", portRangeMin);
    }

    /**
     * @param id : the identifier of the sg rule
     * @return options
     */
    public SgRuleOptions id(String id) {
        return add("id", id);
    }

    public SgRuleOptions add(String key, String value) {
        putParams(key, value);
        return this;
    }

}
