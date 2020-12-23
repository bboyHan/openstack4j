package org.openstack4j.model.network.ext.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.network.ext.PbrPolicy;
import org.openstack4j.model.network.ext.PortChain;

import java.util.List;
import java.util.Map;

/**
 * A builder to create a pbr policy
 *
 * @author bboyHan
 */
public interface PbrPolicyBuilder extends Builder<PbrPolicyBuilder, PbrPolicy> {

    /**
     * @param id : Port Chain identifer
     * @return PbrPolicyBuilder
     */
    PbrPolicyBuilder id(String id);

    /**
     * @param name : Human readable name for the port chain
     * @return PbrPolicyBuilder
     */
    PbrPolicyBuilder name(String name);

    /**
     * @return description : Human readable description for the port chain
     */
    PbrPolicyBuilder description(String description);

    PbrPolicyBuilder routerId(String routerId);

    /**
     * @param projectId : project identifer
     * @return PbrPolicyBuilder
     */
    PbrPolicyBuilder projectId(String projectId);

    /**
     * @param status status
     * @return PbrPolicyBuilder
     */
    PbrPolicyBuilder status(String status);

}
