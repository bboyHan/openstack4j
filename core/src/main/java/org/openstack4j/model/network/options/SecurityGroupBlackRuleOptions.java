package org.openstack4j.model.network.options;

/**
 * Security group black rule options
 */
public class SecurityGroupBlackRuleOptions extends BaseListOptions<SecurityGroupBlackRuleOptions>{

    private SecurityGroupBlackRuleOptions(){
    }

    public static SecurityGroupBlackRuleOptions create() { return new SecurityGroupBlackRuleOptions(); }

    public SecurityGroupBlackRuleOptions add(String key, String value) {
        putParams(key, value);
        return this;
    }

    /**
     * @param id the identifier of the sg black rule
     * @return options
     */
    public SecurityGroupBlackRuleOptions id(String id) { return add("id", id);}

    /**
     * @param securityGroupId the sg group id of the sg black rule
     * @return options
     */
    public SecurityGroupBlackRuleOptions securityGroupId(String securityGroupId){ return add("security_group_id", securityGroupId);}

    /**
     * @param direction the identifier of the sg black rule
     * @return options
     */
    public SecurityGroupBlackRuleOptions direction(String direction){ return add("direction", direction);}

    /**
     * @param protocol the protocol of the sg black rule
     * @return options
     */
    public SecurityGroupBlackRuleOptions protocol(String protocol){ return add("protocol", protocol);}

    /**
     * @param etherType the ethertype of the sg black rule
     * @return options
     */
    public SecurityGroupBlackRuleOptions etherType(String etherType){ return add("ethertype", etherType);}

    /**
     * @param portRangeMin the port range min of the sg black rule
     * @return options
     */
    public SecurityGroupBlackRuleOptions portRangeMin(String portRangeMin){ return add("port_range_min", portRangeMin);}

    /**
     * @param portRangeMax the port range max of the sg black rule
     * @return options
     */
    public SecurityGroupBlackRuleOptions portRangeMax(String portRangeMax){ return add("port_range_max", portRangeMax);}

    /**
     * @param remoteGroupId the remote group id of the sg black rule
     * @return options
     */
    public SecurityGroupBlackRuleOptions remoteGroupId(String remoteGroupId){ return add("remote_group_id", remoteGroupId);}

    /**
     * @param remoteIpPrefix the remote ip prefix of the sg black rule
     * @return options
     */
    public SecurityGroupBlackRuleOptions remoteIpPrefix(String remoteIpPrefix){ return add("remote_ip_prefix", remoteIpPrefix);}

}
