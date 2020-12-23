package org.openstack4j.model.network.ext;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.common.Resource;
import org.openstack4j.model.network.ext.builder.PbrPolicyBuilder;

import java.util.List;

/**
 * A Pbr Policy Entity.
 *
 * @author bboyHan
 */
public interface PbrPolicy extends Resource, Buildable<PbrPolicyBuilder> {

    /**
     * @return description : Human readable description for the pbr
     */
    String getDescription();

    String getRouterId();

    List<String> getPbrRules();

    String getStatus();

    String getAdminStateUp();
}
