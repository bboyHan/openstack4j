package org.openstack4j.openstack.networking.domain.ext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import org.openstack4j.model.network.ext.AclRule;
import org.openstack4j.model.network.ext.builder.AclRuleBuilder;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;

/**
 * @author liwanjun
 *
 * {@inheritDoc}
 */
@JsonRootName("acl_rule")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeutronAclRule implements AclRule {

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

    @JsonProperty("acl_policy_id")
    private String aclPolicyId;

    @JsonProperty("create_time")
    private String createTime;

    @JsonProperty("update_time")
    private String updateTime;

    @JsonProperty("project_id")
    private String projectId;

    @JsonProperty
    private String protocol;

    @JsonProperty("ip_version")
    private String ipVersion;

    @JsonProperty("source_ip_address")
    private String sourceIpAddress;

    @JsonProperty("destination_ip_address")
    private String destinationIpAddress;

    @JsonProperty("source_port")
    private String sourcePort;

    @JsonProperty
    private String direction;

    @JsonProperty("destination_port")
    private String destinationPort;

    @JsonProperty
    private String action;

    @JsonProperty
    private String position;

    @JsonProperty
    private String enabled;

    @JsonProperty("policy_id")
    private String policyId;

    @JsonProperty("insert_before")
    private String insertBefore;

    @JsonProperty("insert_after")
    private String insertAfter;

    @Override
    public AclRuleBuilder toBuilder() {
        return new AclRuleConcreteBuilder(this);
    }

    public static AclRuleBuilder builder() {
        return new AclRuleConcreteBuilder();
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
    public String getAclPolicyId() {
        return aclPolicyId;
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
    public String getProjectId() {
        return projectId;
    }

    @Override
    public String getProtocol() {
        return protocol;
    }

    @Override
    public String getIpVersion() {
        return ipVersion;
    }

    @Override
    public String getSourceIpAddress() {
        return sourceIpAddress;
    }

    @Override
    public String getDestinationIpAddress() {
        return destinationIpAddress;
    }

    @Override
    public String getSourcePort() {
        return sourcePort;
    }

    @Override
    public String getDirection() {
        return direction;
    }

    @Override
    public String getDestinationPort() {
        return destinationPort;
    }

    @Override
    public String getAction() {
        return action;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public String getEnabled() {
        return enabled;
    }

    @Override
    public String getPolicyId() {
        return policyId;
    }

    @Override
    public String getInsertBefore() {
        return insertBefore;
    }

    @Override
    public String getInsertAfter() {
        return insertAfter;
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

    public void setAclPolicyId(String aclPolicyId) {
        this.aclPolicyId = aclPolicyId;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    public void setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
    }

    public void setDestinationIpAddress(String destinationIpAddress) {
        this.destinationIpAddress = destinationIpAddress;
    }

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public void setInsertBefore(String insertBefore) {
        this.insertBefore = insertBefore;
    }

    public void setInsertAfter(String insertAfter) {
        this.insertAfter = insertAfter;
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
                .add("aclPolicyId", aclPolicyId)
                .add("createTime", createTime)
                .add("updateTime", updateTime)
                .add("protocol", protocol)
                .add("ipVersion", ipVersion)
                .add("projectId", projectId)
                .add("sourceIpAddress", sourceIpAddress)
                .add("destinationIpAddress", destinationIpAddress)
                .add("sourcePort", sourcePort)
                .add("destinationPort", destinationPort)
                .add("direction", direction)
                .add("action", action)
                .add("position", position)
                .add("enabled", enabled)
                .add("policyId", policyId)
                .add("insertBefore", insertBefore)
                .add("insertAfter", insertAfter)
                .toString();
    }

    public static class AclRules extends ListResult<NeutronAclRule> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("acl_rules")
        private List<NeutronAclRule> aclRules;

        public List<NeutronAclRule> value() {
            return aclRules;
        }

    }

    public static class AclRuleConcreteBuilder implements AclRuleBuilder {

        private NeutronAclRule neutronAclRule;

        public AclRuleConcreteBuilder() {
            neutronAclRule = new NeutronAclRule();
        }

        public AclRuleConcreteBuilder(NeutronAclRule neutronAclRule) {
            this.neutronAclRule = neutronAclRule;
        }

        @Override
        public AclRule build() {
            return neutronAclRule;
        }

        @Override
        public AclRuleBuilder from(AclRule in) {
            neutronAclRule = (NeutronAclRule) in;
            return this;
        }

        @Override
        public AclRuleBuilder id(String id) {
            neutronAclRule.id = id;
            return this;
        }

        @Override
        public AclRuleBuilder name(String name) {
            neutronAclRule.name = name;
            return this;
        }

        @Override
        public AclRuleBuilder tenantId(String tenantId) {
            neutronAclRule.tenantId = tenantId;
            return this;
        }

        @Override
        public AclRuleBuilder description(String description) {
            neutronAclRule.description = description;
            return this;
        }

        @Override
        public AclRuleBuilder adminStateUp(String adminStateUp) {
            neutronAclRule.adminStateUp = adminStateUp;
            return this;
        }

        @Override
        public AclRuleBuilder status(String status) {
            neutronAclRule.status = status;
            return this;
        }

        @Override
        public AclRuleBuilder aclPolicyId(String aclPolicyId) {
            neutronAclRule.aclPolicyId = aclPolicyId;
            return this;
        }

        @Override
        public AclRuleBuilder createTime(String createTime) {
            neutronAclRule.createTime = createTime;
            return this;
        }

        @Override
        public AclRuleBuilder updateTime(String updateTime) {
            neutronAclRule.updateTime = updateTime;
            return this;
        }

        @Override
        public AclRuleBuilder projectId(String projectId) {
            neutronAclRule.projectId = projectId;
            return this;
        }

        @Override
        public AclRuleBuilder protocol(String protocol) {
            neutronAclRule.protocol = protocol;
            return this;
        }

        @Override
        public AclRuleBuilder ipVersion(String ipVersion) {
            neutronAclRule.ipVersion = ipVersion;
            return this;
        }

        @Override
        public AclRuleBuilder sourceIpAddress(String sourceIpAddress) {
            neutronAclRule.sourceIpAddress = sourceIpAddress;
            return this;
        }

        @Override
        public AclRuleBuilder destinationIpAddress(String destinationIpAddress) {
            neutronAclRule.destinationIpAddress = destinationIpAddress;
            return this;
        }

        @Override
        public AclRuleBuilder sourcePort(String sourcePort) {
            neutronAclRule.sourcePort = sourcePort;
            return this;
        }

        @Override
        public AclRuleBuilder direction(String direction) {
            neutronAclRule.direction = direction;
            return this;
        }

        @Override
        public AclRuleBuilder destinationPort(String destinationPort) {
            neutronAclRule.destinationPort = destinationPort;
            return this;
        }

        @Override
        public AclRuleBuilder action(String action) {
            neutronAclRule.action = action;
            return this;
        }

        @Override
        public AclRuleBuilder position(String position) {
            neutronAclRule.position = position;
            return this;
        }

        @Override
        public AclRuleBuilder enabled(String enabled) {
            neutronAclRule.enabled = enabled;
            return this;
        }

        @Override
        public AclRuleBuilder policyId(String policyId) {
            neutronAclRule.policyId = policyId;
            return this;
        }

        @Override
        public AclRuleBuilder insertBefore(String insertBefore) {
            neutronAclRule.insertBefore = insertBefore;
            return this;
        }

        @Override
        public AclRuleBuilder insertAfter(String insertAfter) {
            neutronAclRule.insertAfter = insertAfter;
            return this;
        }

    }

}
