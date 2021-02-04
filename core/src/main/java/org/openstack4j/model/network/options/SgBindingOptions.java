package org.openstack4j.model.network.options;

/**
 * @author liwanjun
 */
public class SgBindingOptions extends BaseListOptions<SgBindingOptions> {

    private SgBindingOptions() {
    }

    public static SgBindingOptions create() {
        return new SgBindingOptions();
    }

    /**
     * @param name : the name of the sg binding
     * @return options
     */
    public SgBindingOptions name(String name) {
        return add("name", name);
    }

    /**
     * @param switchIp : the switch ip of the sg binding
     * @return options
     */
    public SgBindingOptions switchIp(String switchIp) {
        return add("switch_ip", switchIp);
    }

    /**
     * @param sgBindingInterface : the interface of the sg binding
     * @return options
     */
    public SgBindingOptions sgBindingInterface(String sgBindingInterface) {
        return add("interface", sgBindingInterface);
    }

    /**
     * @param interfaceIp : the interface ip of the sg binding
     * @return options
     */
    public SgBindingOptions interfaceIp(String interfaceIp) {
        return add("interface_ip", interfaceIp);
    }

    /**
     * @param vni : the vni of the sg binding
     * @return options
     */
    public SgBindingOptions vni(String vni) {
        return add("vni", vni);
    }

    /**
     * @param id : the identifier of the sg binding
     * @return options
     */
    public SgBindingOptions id(String id) {
        return add("id", id);
    }

    public SgBindingOptions add(String key, String value) {
        putParams(key, value);
        return this;
    }

}
