package org.openstack4j.model.network.ext.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.network.ext.RpFilter;

/**
 * A builder to create a pbr policy
 *
 * @author bboyHan
 */
public interface RpFilterBuilder extends Builder<RpFilterBuilder, RpFilter> {

    RpFilterBuilder id(String id);

    RpFilterBuilder pref(String pref);

    RpFilterBuilder projectId(String projectId);

    RpFilterBuilder routerId(String routerId);

    RpFilterBuilder value(String value);

    RpFilterBuilder portId(String portId);

}
