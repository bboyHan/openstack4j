package org.openstack4j.model.network.ext.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.network.ext.PbrRule;

/**
 * A builder to create a pbr rule
 *
 * @author bboyHan
 */
public interface PbrRuleBuilder extends Builder<PbrRuleBuilder, PbrRule> {

    PbrRuleBuilder id(String id);

    PbrRuleBuilder name(String name);

    PbrRuleBuilder description(String description);

    PbrRuleBuilder projectId(String projectId);

    PbrRuleBuilder status(String status);

    PbrRuleBuilder pbrPolicyId(String pbrPolicyId);

    PbrRuleBuilder applyRouterPort(String applyRouterPort);

    PbrRuleBuilder pref(String pref);

    PbrRuleBuilder nextHop(String nextHop);

    PbrRuleBuilder sourceIpAddress(String sourceIpAddress);

    PbrRuleBuilder destinationIpAddress(String destinationIpAddress);

}
