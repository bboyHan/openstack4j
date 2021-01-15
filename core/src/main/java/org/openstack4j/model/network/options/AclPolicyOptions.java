package org.openstack4j.model.network.options;

/**
 * @author liwanjun
 */
public class AclPolicyOptions extends BaseListOptions<AclPolicyOptions> {

    private AclPolicyOptions() {
    }

    public static AclPolicyOptions create() {
        return new AclPolicyOptions();
    }

    /**
     * @param name : the name of the acl policy
     * @return options
     */
    public AclPolicyOptions name(String name) {
        return add("name", name);
    }

    /**
     * @param tenantId : the tenant id of the acl policy
     * @return options
     */
    public AclPolicyOptions tenantId(String tenantId) {
        return add("tenant_id", tenantId);
    }

    /**
     * @param description : the description of the acl policy
     * @return options
     */
    public AclPolicyOptions description(String description) {
        return add("description", description);
    }

    /**
     * @param adminStateUp : the admin state up of the acl policy
     * @return options
     */
    public AclPolicyOptions adminStateUp(String adminStateUp) {
        return add("admin_state_up", adminStateUp);
    }

    /**
     * @param status : the status of the acl policy
     * @return options
     */
    public AclPolicyOptions status(String status) {
        return add("status", status);
    }

    /**
     * @param networkId : the network id of the acl policy
     * @return options
     */
    public AclPolicyOptions networkId(String networkId) {
        return add("network_id", networkId);
    }

    /**
     * @param createTime : the create time of the acl policy
     * @return options
     */
    public AclPolicyOptions createTime(String createTime) {
        return add("create_time", createTime);
    }

    /**
     * @param updateTime : the update time of the acl policy
     * @return options
     */
    public AclPolicyOptions updateTime(String updateTime) {
        return add("update_time", updateTime);
    }

    /**
     * @param projectId : the project id of the acl policy
     * @return options
     */
    public AclPolicyOptions projectId(String projectId) {
        return add("project_id", projectId);
    }

    /**
     * @param tag : the tag of the acl policy
     * @return options
     */
    public AclPolicyOptions tag(String tag) {
        return add("tag", tag);
    }

    /**
     * @param vpcName : the vpc name of the acl policy
     * @return options
     */
    public AclPolicyOptions vpcName(String vpcName) {
        return add("vpc_name", vpcName);
    }

    /**
     * @param id : the identifier of the acl policy
     * @return options
     */
    public AclPolicyOptions id(String id) {
        return add("id", id);
    }

    public AclPolicyOptions add(String key, String value) {
        putParams(key, value);
        return this;
    }

}
