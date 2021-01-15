package org.openstack4j.model.network.ext.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.network.ext.SgBinding;

/**
 * A builder to create an sg binding
 *
 * @author liwanjun
 */
public interface SgBindingBuilder extends Builder<SgBindingBuilder, SgBinding> {

    /**
     * @param name : the name of the sg binding
     * @return SgBindingBuilder
     */
    SgBindingBuilder name(String name);

    /**
     * @param tenantId : the tenant id of the sg binding
     * @return SgBindingBuilder
     */
    SgBindingBuilder tenantId(String tenantId);

    /**
     * @param switchIp : the switch ip of the sg binding
     * @return SgBindingBuilder
     */
    SgBindingBuilder switchIp(String switchIp);

    /**
     * @param sgBindingInterface : the interface of the sg binding
     * @return SgBindingBuilder
     */
    SgBindingBuilder sgBindingInterface(String sgBindingInterface);

    /**
     * @param interfaceIp : the interface ip of the sg binding
     * @return SgBindingBuilder
     */
    SgBindingBuilder interfaceIp(String interfaceIp);

}
