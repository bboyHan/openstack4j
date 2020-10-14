package org.openstack4j.model.compute.options;

import org.openstack4j.model.compute.ServerDiskConfigType;
import org.openstack4j.model.network.options.BaseListOptions;

/**
 * @author bboyHan
 */
public class ServerListOptions extends BaseListOptions<ServerListOptions> {

    private ServerListOptions(){}

    public static ServerListOptions create(){
        return new ServerListOptions();}

    public ServerListOptions accessIpV4(String accessIpV4) {
        return add("access_ip_v4", accessIpV4);
    }

    public ServerListOptions accessIpV6(String accessIpV6) {
        return add("access_ip_v6", accessIpV6);
    }

    public ServerListOptions allTenants(Boolean allTenants) {
        return add("all_tenants", String.valueOf(allTenants));
    }

    public ServerListOptions availabilityZone(String availabilityZone) {
        return add("availability_zone", availabilityZone);
    }

    public ServerListOptions tags(String tags) {
        return add("tags", tags);
    }

    /**
     * This parameter is only valid when specified by administrators
     *
     * @param autoDiskConfig auto_disk_config
     */
    public ServerListOptions autoDiskConfig(ServerDiskConfigType autoDiskConfig) {
        return add("auto_disk_config", autoDiskConfig.getAutoDiskConfig());
    }

    public ServerListOptions add(String key, String value) {
        putParams(key, value);
        return this;
    }
}
