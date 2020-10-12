package org.openstack4j.api.networking.ext;

import org.openstack4j.common.RestService;
import org.openstack4j.model.network.NetIpAvailability;
import org.openstack4j.model.network.SubnetIpAvailability;
import org.openstack4j.model.network.options.NetIpAvailListOptions;

import java.util.List;

/**
 * Networking (Neutron) ip-availabilities Extension API
 *
 * @author bboyHan
 */
public interface NetIpAvailabilitiesService extends RestService {

    List<? extends NetIpAvailability> list();

    List<? extends NetIpAvailability> list(NetIpAvailListOptions options);

    NetIpAvailability get(String networkId);

    /**
     * extension about subnet
     * @param subnetId subnet id
     */
    SubnetIpAvailability getSubnetIpAvail(String subnetId);
}
