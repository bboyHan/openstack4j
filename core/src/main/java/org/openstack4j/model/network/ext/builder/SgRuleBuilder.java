package org.openstack4j.model.network.ext.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.network.ext.SgRule;

/**
 * A builder to create an sg rule
 *
 * @author liwanjun
 */
public interface SgRuleBuilder extends Builder<SgRuleBuilder, SgRule> {

    /**
     * @param id : the identifier of the sg rule
     * @return SgRuleBuilder
     */
    SgRuleBuilder id(String id);

    /**
     * @param name : the name of the sg rule
     * @return SgRuleBuilder
     */
    SgRuleBuilder name(String name);

    /**
     * @param type : the type of the sg rule
     * @return SgRuleBuilder
     */
    SgRuleBuilder type(String type);

    /**
     * @param direction : the direction of the sg rule
     * @return SgRuleBuilder
     */
    SgRuleBuilder direction(String direction);

    /**
     * @param protocol : the protocol of the sg rule
     * @return SgRuleBuilder
     */
    SgRuleBuilder protocol(String protocol);

    /**
     * @param ipVersion : the ip version of the sg rule
     * @return SgRuleBuilder
     */
    SgRuleBuilder ipVersion(String ipVersion);

    /**
     * @param sourceIpAddress : the source ip address of the sg rule
     * @return SgRuleBuilder
     */
    SgRuleBuilder sourceIpAddress(String sourceIpAddress);

    /**
     * @param destinationIpAddress : the destination ip address of the sg rule
     * @return SgRuleBuilder
     */
    SgRuleBuilder destinationIpAddress(String destinationIpAddress);

    /**
     * @param portRangeMax : the port range max of the sg rule
     * @return SgRuleBuilder
     */
    SgRuleBuilder portRangeMax(String portRangeMax);

    /**
     * @param portRangeMin : the port range min of the sg rule
     * @return SgRuleBuilder
     */
    SgRuleBuilder portRangeMin(String portRangeMin);

    /**
     * @param sgBindingId : the sg binding id of the sg rule
     * @return SgRuleBuilder
     */
    SgRuleBuilder sgBindingId(String sgBindingId);

}
