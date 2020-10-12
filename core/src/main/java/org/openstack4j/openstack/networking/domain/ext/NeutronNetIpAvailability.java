package org.openstack4j.openstack.networking.domain.ext;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import org.openstack4j.model.network.NetIpAvailability;
import org.openstack4j.model.network.SubnetIpAvailability;
import org.openstack4j.openstack.common.ListEntity;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;

/**
 * An OpenStack (Neutron) network ip availabilities
 *
 * @author bboyHan
 */
@JsonRootName("network_ip_availability")
public class NeutronNetIpAvailability implements NetIpAvailability {

    private static final long serialVersionUID = 1L;

    @JsonProperty("network_id")
    private String networkId;
    @JsonProperty("network_name")
    private String networkName;
    @JsonProperty("tenant_id")
    private String tenantId;
    @JsonProperty("project_id")
    private String projectId;
    @JsonProperty("total_ips")
    private String totalIps;
    @JsonProperty("used_ips")
    private String usedIps;
    @JsonProperty("subnet_ip_availability")
    private List<NeutronSubnetIpAvailability> subnetIpAvailabilities;

    public NeutronNetIpAvailability() {
    }

    public NeutronNetIpAvailability(String networkId, String networkName, String tenantId,
                                    String projectId, String totalIps, String usedIps,
                                    List<NeutronSubnetIpAvailability> subnetIpAvailabilities) {
        this.networkId = networkId;
        this.networkName = networkName;
        this.tenantId = tenantId;
        this.projectId = projectId;
        this.totalIps = totalIps;
        this.usedIps = usedIps;
        this.subnetIpAvailabilities = subnetIpAvailabilities;
    }

    @Override
    public String getNetworkId() {
        return networkId;
    }

    @Override
    public String getNetworkName() {
        return networkName;
    }

    @Override
    public String getTenantId() {
        return tenantId;
    }

    @Override
    public String getProjectId() {
        return projectId;
    }

    @Override
    public String getTotalIps() {
        return totalIps;
    }

    @Override
    public String getUsedIps() {
        return usedIps;
    }

    @Override
    public List<NeutronSubnetIpAvailability> getSubnetIpAvailabilities() {
        return subnetIpAvailabilities;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues()
                .add("networkId", networkId)
                .add("networkName", networkName)
                .add("tenantId", tenantId)
                .add("projectId", projectId)
                .add("totalIps", totalIps)
                .add("usedIps", usedIps)
                .add("tenantId", tenantId)
                .add("subnetIpAvailabilities", subnetIpAvailabilities)
                .toString();
    }

    @SuppressWarnings("unchecked")
    public static NeutronNetIpAvailability fromNeutronNetIpAvailability(NetIpAvailability netIpAvailability) {
        NeutronNetIpAvailability n = new NeutronNetIpAvailability();
        n.networkId = netIpAvailability.getNetworkId();
        n.networkName = netIpAvailability.getNetworkName();
        n.tenantId = netIpAvailability.getTenantId();
        n.projectId = netIpAvailability.getProjectId();
        n.totalIps = netIpAvailability.getTotalIps();
        n.usedIps = netIpAvailability.getUsedIps();
        n.subnetIpAvailabilities = (List<NeutronSubnetIpAvailability>) netIpAvailability.getSubnetIpAvailabilities();
        return n;
    }

    public static class NetIpAvailabilities extends ListResult<NeutronNetIpAvailability> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("network_ip_availabilities")
        private List<NeutronNetIpAvailability> netIpAvailabilities;

        public NetIpAvailabilities() {
            netIpAvailabilities = new ListEntity<>();
        }

        @Override
        public List<NeutronNetIpAvailability> value() {
            return netIpAvailabilities;
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(this).omitNullValues()
                    .add("netIpAvailabilities", netIpAvailabilities).toString();
        }

        @SuppressWarnings("unchecked")
        public static NetIpAvailabilities fromNetsIpAvailabilities(List<? extends NetIpAvailability> netsIpAvailabilities) {
            NetIpAvailabilities n = new NetIpAvailabilities();
            for (NetIpAvailability netIpAvailability : netsIpAvailabilities) {
                n.netIpAvailabilities.add(NeutronNetIpAvailability.fromNeutronNetIpAvailability(netIpAvailability));
            }
            return n;
        }
    }
}
