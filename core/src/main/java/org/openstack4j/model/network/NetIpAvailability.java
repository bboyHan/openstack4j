package org.openstack4j.model.network;

import org.openstack4j.model.ModelEntity;

import java.util.List;

/**
 * @author bboyHan
 */
public interface NetIpAvailability extends ModelEntity {

    String getNetworkId();

    String getNetworkName();

    String getTenantId();

    String getProjectId();

    String getTotalIps();

    String getUsedIps();

    List<? extends SubnetIpAvailability> getSubnetIpAvailabilities();
}
