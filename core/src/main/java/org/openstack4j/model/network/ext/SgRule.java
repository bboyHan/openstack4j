package org.openstack4j.model.network.ext;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.common.BasicResource;
import org.openstack4j.model.network.ext.builder.SgRuleBuilder;

/**
 * An Sg Rule entity
 *
 * @author liwanjun
 */
public interface SgRule extends BasicResource, Buildable<SgRuleBuilder> {

    /**
     * @return the type of the sg rule
     */
    String getType();

    /**
     * @return the direction of the sg rule
     */
    String getDirection();

    /**
     * @return the protocol of the sg rule
     */
    String getProtocol();

    /**
     * @return the ip version of the sg rule
     */
    String getIpVersion();

    /**
     * @return the source ip address of the sg rule
     */
    String getSourceIpAddress();

    /**
     * @return the destination ip address of the sg rule
     */
    String getDestinationIpAddress();

    /**
     * @return the port range max of the sg rule
     */
    String getPortRangeMax();

    /**
     * @return the port range min of the sg rule
     */
    String getPortRangeMin();

    /**
     * @return the sg binding id of the sg rule
     */
    String getSgBindingId();

}
