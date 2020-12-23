package org.openstack4j.model.network.ext;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.common.Resource;
import org.openstack4j.model.network.ext.builder.PbrRuleBuilder;

/**
 * A Pbr Policy Entity.
 *
 * @author bboyHan
 */
public interface PbrRule extends Resource, Buildable<PbrRuleBuilder> {

    String getDescription();

    String getStatus();

    String getSourcePort();

    String getDestinationPort();

    String getEnabled();

    String getPbrPolicyId();

    String getProtocol();

    String getApplyRouterPort();

    String getSourceIpAddress();

    String getDestinationIpAddress();

    String getPref();

    String getNextHop();

    String getAdminStateUp();
}
