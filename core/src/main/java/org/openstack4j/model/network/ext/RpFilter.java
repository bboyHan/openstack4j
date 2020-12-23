package org.openstack4j.model.network.ext;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.common.IdEntity;
import org.openstack4j.model.network.ext.builder.RpFilterBuilder;

/**
 * A RpFilter Entity.
 *
 * @author bboyHan
 */
public interface RpFilter extends IdEntity, Buildable<RpFilterBuilder> {


    String getPref();

    String getValue();

    String getRouterId();

    String getPortId();

    String getTenantId();
}
