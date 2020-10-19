package org.openstack4j.model.network.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.network.NetQosPolicy;
import org.openstack4j.model.network.NetQosPolicyBandwidthLimitRule;

/**
 * A Builder which creates a NetQosPolicyBandwidthLimitRule entity
 *
 * @author bboyHan
 */
public interface NetQosPolicyBandwidthLimitRuleBuilder extends Builder<NetQosPolicyBandwidthLimitRuleBuilder, NetQosPolicyBandwidthLimitRule> {

    /**
     * See {@link NetQosPolicyBandwidthLimitRule#getMaxKbps()} for details
     *
     * @param maxKbps maxKbps
     * @return NetQosPolicyBandwidthLimitRuleBuilder
     */
    NetQosPolicyBandwidthLimitRuleBuilder maxKbps(String maxKbps);

    /**
     * See {@link NetQosPolicyBandwidthLimitRule#getMaxBurstKbps()} for details
     *
     * @param maxBurstKbps maxBurstKbps
     * @return NetQosPolicyBandwidthLimitRuleBuilder
     */
    NetQosPolicyBandwidthLimitRuleBuilder maxBurstKbps(String maxBurstKbps);

    /**
     * See {@link NetQosPolicyBandwidthLimitRule#getDirection()} for details
     *
     * @param direction direction
     * @return NetQosPolicyBandwidthLimitRuleBuilder
     */
    NetQosPolicyBandwidthLimitRuleBuilder direction(String direction);

}
