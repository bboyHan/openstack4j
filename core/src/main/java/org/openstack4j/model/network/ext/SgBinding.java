package org.openstack4j.model.network.ext;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.common.BasicResource;
import org.openstack4j.model.network.ext.builder.SgBindingBuilder;

import java.util.List;

/**
 * An Sg Binding entity
 *
 * @author liwanjun
 */
public interface SgBinding extends BasicResource, Buildable<SgBindingBuilder> {

    /**
     * @return the switch ip of the sg binding
     */
    String getSwitchIp();

    /**
     * @return the interface of the sg binding
     */
    String getInterface();

    /**
     * @return the interface ip of the sg binding
     */
    String getInterfaceIp();

    /**
     * @return the vni of the sg binding
     */
    String getVni();

    /**
     * @return the sg rules of the sg binding
     */
    List<String> getSgRules();

}
