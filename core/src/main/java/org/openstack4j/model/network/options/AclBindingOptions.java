package org.openstack4j.model.network.options;

/**
 * @author liwanjun
 */
public class AclBindingOptions extends BaseListOptions<AclBindingOptions> {

    private AclBindingOptions() {
    }

    public static AclBindingOptions create() {
        return new AclBindingOptions();
    }

    /**
     * @param tenantId : the tenant id of the acl binding
     * @return options
     */
    public AclBindingOptions tenantId(String tenantId) {
        return add("tenant_id", tenantId);
    }

    /**
     * @param routerId : the router id of the acl binding
     * @return options
     */
    public AclBindingOptions routerId(String routerId) {
        return add("router_id", routerId);
    }

    /**
     * @param networkId : the network id of the acl binding
     * @return options
     */
    public AclBindingOptions networkId(String networkId) {
        return add("network_id", networkId);
    }

    /**
     * @param subnetId : the subnet id of the acl binding
     * @return options
     */
    public AclBindingOptions subnetId(String subnetId) {
        return add("subnet_id", subnetId);
    }

    /**
     * @param adminStateUp : the admin state up of the acl binding
     * @return options
     */
    public AclBindingOptions adminStateUp(String adminStateUp) {
        return add("admin_state_up", adminStateUp);
    }

    /**
     * @param status : the status of the acl binding
     * @return options
     */
    public AclBindingOptions status(String status) {
        return add("status", status);
    }

    /**
     * @param aclPolicyId : the acl policy id of the acl binding
     * @return options
     */
    public AclBindingOptions aclPolicyId(String aclPolicyId) {
        return add("acl_policy_id", aclPolicyId);
    }

    /**
     * @param createTime : the create time of the acl binding
     * @return options
     */
    public AclBindingOptions createTime(String createTime) {
        return add("create_time", createTime);
    }

    /**
     * @param projectId : the project id of the acl binding
     * @return options
     */
    public AclBindingOptions projectId(String projectId) {
        return add("project_id", projectId);
    }

    /**
     * @param id : the identifier of the acl binding
     * @return options
     */
    public AclBindingOptions id(String id) {
        return add("id", id);
    }

    public AclBindingOptions add(String key, String value) {
        putParams(key, value);
        return this;
    }

}
