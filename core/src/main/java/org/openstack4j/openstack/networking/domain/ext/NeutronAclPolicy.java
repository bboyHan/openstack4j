package org.openstack4j.openstack.networking.domain.ext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import org.openstack4j.model.network.ext.AclPolicy;
import org.openstack4j.model.network.ext.builder.AclPolicyBuilder;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;

/**
 * @author liwanjun
 *
 * {@inheritDoc}
 */
@JsonRootName("acl_policy")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeutronAclPolicy implements AclPolicy {

    private static final long serialVersionUID = 1L;

    @JsonProperty
    private String id;

    @JsonProperty
    private String name;

    @JsonProperty("tenant_id")
    private String tenantId;

    @JsonProperty
    private String description;

    @JsonProperty("admin_state_up")
    private String adminStateUp;

    @JsonProperty
    private String status;

    @JsonProperty("network_id")
    private String networkId;

    @JsonProperty("create_time")
    private String createTime;

    @JsonProperty("update_time")
    private String updateTime;

    @JsonProperty("acl_rules")
    private List<String> aclRules;

    @JsonProperty("acl_binding_list")
    private List<String> aclBindingList;

    @JsonProperty("project_id")
    private String projectId;

    @JsonProperty
    private String tag;

    @JsonProperty("vpc_name")
    private String vpcName;

    @Override
    public AclPolicyBuilder toBuilder() {
        return new AclPolicyConcreteBuilder(this);
    }

    public static AclPolicyBuilder builder() {
        return new AclPolicyConcreteBuilder();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getTenantId() {
        return tenantId;
    }

    @Override
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getAdminStateUp() {
        return adminStateUp;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public String getNetworkId() {
        return networkId;
    }

    @Override
    public String getCreateTime() {
        return createTime;
    }

    @Override
    public String getUpdateTime() {
        return updateTime;
    }

    @Override
    public List<String> getAclRules() {
        return aclRules;
    }

    @Override
    public List<String> getAclBindingList() {
        return aclBindingList;
    }

    @Override
    public String getProjectId() {
        return projectId;
    }

    @Override
    public String getTag() {
        return tag;
    }

    @Override
    public String getVpcName() {
        return vpcName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAdminStateUp(String adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setAclRules(List<String> aclRules) {
        this.aclRules = aclRules;
    }

    public void setAclBindingList(List<String> aclBindingList) {
        this.aclBindingList = aclBindingList;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues()
                .add("id", id)
                .add("name", name)
                .add("tenantId", tenantId)
                .add("description", description)
                .add("adminStateUp", adminStateUp)
                .add("status", status)
                .add("networkId", networkId)
                .add("createTime", createTime)
                .add("updateTime", updateTime)
                .add("aclRules", aclRules)
                .add("aclBindingList", aclBindingList)
                .add("projectId", projectId)
                .add("tag", tag)
                .add("vpcName", vpcName)
                .toString();
    }

    public static class AclPolicies extends ListResult<NeutronAclPolicy> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("acl_policies")
        private List<NeutronAclPolicy> aclPolicies;

        public List<NeutronAclPolicy> value() {
            return aclPolicies;
        }

    }

    public static class AclPolicyConcreteBuilder implements AclPolicyBuilder {

        private NeutronAclPolicy neutronAclPolicy;

        public AclPolicyConcreteBuilder() {
            neutronAclPolicy = new NeutronAclPolicy();
        }

        public AclPolicyConcreteBuilder(NeutronAclPolicy neutronAclPolicy) {
            this.neutronAclPolicy = neutronAclPolicy;
        }

        @Override
        public AclPolicy build() {
            return neutronAclPolicy;
        }

        @Override
        public AclPolicyBuilder from(AclPolicy in) {
            neutronAclPolicy = (NeutronAclPolicy) in;
            return this;
        }

        @Override
        public AclPolicyBuilder name(String name) {
            neutronAclPolicy.name = name;
            return this;
        }

        @Override
        public AclPolicyBuilder tenantId(String tenantId) {
            neutronAclPolicy.tenantId = tenantId;
            return this;
        }

        @Override
        public AclPolicyBuilder description(String description) {
            neutronAclPolicy.description = description;
            return this;
        }

        @Override
        public AclPolicyBuilder adminStateUp(String adminStateUp) {
            neutronAclPolicy.adminStateUp = adminStateUp;
            return this;
        }

        @Override
        public AclPolicyBuilder status(String status) {
            neutronAclPolicy.status = status;
            return this;
        }

        @Override
        public AclPolicyBuilder networkId(String networkId) {
            neutronAclPolicy.networkId = networkId;
            return this;
        }

        @Override
        public AclPolicyBuilder createTime(String createTime) {
            neutronAclPolicy.createTime = createTime;
            return this;
        }

        @Override
        public AclPolicyBuilder updateTime(String updateTime) {
            neutronAclPolicy.updateTime = updateTime;
            return this;
        }

        @Override
        public AclPolicyBuilder projectId(String projectId) {
            neutronAclPolicy.projectId = projectId;
            return this;
        }

        @Override
        public AclPolicyBuilder tag(String tag) {
            neutronAclPolicy.tag = tag;
            return this;
        }

        @Override
        public AclPolicyBuilder vpcName(String vpcName) {
            neutronAclPolicy.vpcName = vpcName;
            return this;
        }

        @Override
        public AclPolicyBuilder aclRules(List<String> aclRules) {
            neutronAclPolicy.aclRules = aclRules;
            return this;
        }

        @Override
        public AclPolicyBuilder aclBindingList(List<String> aclBindingList) {
            neutronAclPolicy.aclBindingList = aclBindingList;
            return this;
        }

    }

}
