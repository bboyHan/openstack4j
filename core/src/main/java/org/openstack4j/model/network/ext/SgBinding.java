package org.openstack4j.model.network.ext;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.common.Resource;
import org.openstack4j.model.network.ext.builder.SgBindingBuilder;

import java.util.List;

/**
 * An Sg Binding entity
 *
 * @author liwanjun
 */
public interface SgBinding extends Resource, Buildable<SgBindingBuilder> {

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
     * @return the acl rule list of the sg binding
     */
    List<String> getAclRules();

}
