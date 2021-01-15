package org.openstack4j.openstack.networking.domain.ext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import org.openstack4j.model.network.ext.AclBinding;
import org.openstack4j.model.network.ext.builder.AclBindingBuilder;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;

/**
 * @author liwanjun
 *
 * {@inheritDoc}
 */
@JsonRootName("acl_binding")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeutronAclBinding implements AclBinding {

    private static final long serialVersionUID = 1L;

    @JsonProperty
    private String id;

    @JsonProperty("tenant_id")
    private String tenantId;

    @JsonProperty("router_id")
    private String routerId;

    @JsonProperty("network_id")
    private String networkId;

    @JsonProperty("subnet_id")
    private String subnetId;

    @JsonProperty("admin_state_up")
    private String adminStateUp;

    @JsonProperty
    private String status;

    @JsonProperty("acl_policy_id")
    private String aclPolicyId;

    @JsonProperty("create_time")
    private String createTime;

    @JsonProperty("project_id")
    private String projectId;

    @Override
    public AclBindingBuilder toBuilder() {
        return new AclBindingConcreteBuilder(this);
    }

    public static AclBindingBuilder builder() {
        return new AclBindingConcreteBuilder();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getTenantId() {
        return tenantId;
    }

    @Override
    public String getRouterId() {
        return routerId;
    }

    @Override
    public String getNetworkId() {
        return networkId;
    }

    @Override
    public String getSubnetId() {
        return subnetId;
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
    public String getAclPolicyId() {
        return aclPolicyId;
    }

    @Override
    public String getCreateTime() {
        return createTime;
    }

    @Override
    public String getProjectId() {
        return projectId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public void setAdminStateUp(String adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAclPolicyId(String aclPolicyId) {
        this.aclPolicyId = aclPolicyId;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues()
                .add("id", id)
                .add("tenantId", tenantId)
                .add("routerId", routerId)
                .add("networkId", networkId)
                .add("subnetId", subnetId)
                .add("adminStateUp", adminStateUp)
                .add("status", status)
                .add("aclPolicyId", aclPolicyId)
                .add("createTime", createTime)
                .add("projectId", projectId)
                .toString();
    }

    public static class AclBindings extends ListResult<NeutronAclBinding> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("acl_bindings")
        private List<NeutronAclBinding> aclBindings;

        public List<NeutronAclBinding> value() {
            return aclBindings;
        }

    }

    public static class AclBindingConcreteBuilder implements AclBindingBuilder {

        private NeutronAclBinding neutronAclBinding;

        public AclBindingConcreteBuilder() {
            neutronAclBinding = new NeutronAclBinding();
        }

        public AclBindingConcreteBuilder(NeutronAclBinding neutronAclBinding) {
            this.neutronAclBinding = neutronAclBinding;
        }

        @Override
        public AclBinding build() {
            return neutronAclBinding;
        }

        @Override
        public AclBindingBuilder from(AclBinding in) {
            neutronAclBinding = (NeutronAclBinding) in;
            return this;
        }

        @Override
        public AclBindingBuilder tenantId(String tenantId) {
            neutronAclBinding.tenantId = tenantId;
            return this;
        }

        @Override
        public AclBindingBuilder routerId(String routerId) {
            neutronAclBinding.routerId = routerId;
            return this;
        }

        @Override
        public AclBindingBuilder networkId(String networkId) {
            neutronAclBinding.networkId = networkId;
            return this;
        }

        @Override
        public AclBindingBuilder subnetId(String subnetId) {
            neutronAclBinding.subnetId = subnetId;
            return this;
        }

        @Override
        public AclBindingBuilder adminStateUp(String adminStateUp) {
            neutronAclBinding.adminStateUp = adminStateUp;
            return this;
        }

        @Override
        public AclBindingBuilder status(String status) {
            neutronAclBinding.status = status;
            return this;
        }

        @Override
        public AclBindingBuilder aclPolicyId(String aclPolicyId) {
            neutronAclBinding.aclPolicyId = aclPolicyId;
            return this;
        }

        @Override
        public AclBindingBuilder createTime(String createTime) {
            neutronAclBinding.createTime = createTime;
            return this;
        }

        @Override
        public AclBindingBuilder projectId(String projectId) {
            neutronAclBinding.projectId = projectId;
            return this;
        }

    }

}
