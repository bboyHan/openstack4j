package org.openstack4j.model.network.ext.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.network.ext.SgBinding;

import java.util.List;

/**
 * A builder to create an sg binding
 *
 * @author liwanjun
 */
public interface SgBindingBuilder extends Builder<SgBindingBuilder, SgBinding> {

    /**
     * @param id : the identifier of the sg binding
     * @return SgBindingBuilder
     */
    SgBindingBuilder id(String id);

    /**
     * @param name : the name of the sg binding
     * @return SgBindingBuilder
     */
    SgBindingBuilder name(String name);

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

    /**
     * @param vni : the vni of the sg binding
     * @return SgBindingBuilder
     */
    SgBindingBuilder vni(String vni);

    /**
     * @param sgRules : the sg rules of the sg binding
     * @return SgBindingBuilder
     */
    SgBindingBuilder sgRules(List<String> sgRules);

}
