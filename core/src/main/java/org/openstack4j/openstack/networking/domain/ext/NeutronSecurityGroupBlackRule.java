package org.openstack4j.openstack.networking.domain.ext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import org.openstack4j.model.network.ext.SecurityGroupBlackRule;
import org.openstack4j.model.network.ext.builder.SecurityGroupBlackRuleBuilder;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;

@JsonRootName("securitygroupblacklistrule")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeutronSecurityGroupBlackRule implements SecurityGroupBlackRule {

    private static final long serialVersionUID = 1L;

    @JsonProperty
    private String id;

    @JsonProperty
    private String name;

    @JsonProperty("tenant_id")
    private String tenantId;

    @JsonProperty("security_group_id")
    private String securityGroupId;

    @JsonProperty
    private String direction;

    @JsonProperty
    private String protocol;

    @JsonProperty("ethertype")
    private String etherType;

    @JsonProperty("port_range_min")
    private Integer portRangeMin;

    @JsonProperty("port_range_max")
    private Integer portRangeMax;

    @JsonProperty("remote_group_id")
    private String remoteGroupId;

    @JsonProperty("remote_ip_prefix")
    private String remoteIpPrefix;

    @JsonProperty("project_id")
    private String projectId;

    @JsonProperty
    private String description;

    @JsonProperty("created_time")
    private String createdAt;

    @Override
    public SecurityGroupBlackRuleBuilder toBuilder() {
       return new SecurityGroupConcreteBulider(this);
    }

    public static SecurityGroupBlackRuleBuilder builder() { return new SecurityGroupConcreteBulider(); }

    @Override
    public String getTenantId() { return tenantId; }

    @Override
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }

    @Override
    public String getName() { return name; }

    @Override
    public void setName(String name) { this.name = name;}

    @Override
    public String getId() { return id; }

    @Override
    public void setId(String id) { this.id = id; }

    @Override
    public String getSecurityGroupId() { return securityGroupId; }

    @Override
    public String getDirection() { return direction; }

    @Override
    public String getProtocol() { return protocol; }

    @Override
    public String getEtherType() { return etherType; }

    @Override
    public Integer getPortRangeMin() { return portRangeMin; }

    @Override
    public Integer getPortRangeMax() { return portRangeMax; }

    @Override
    public String getRemoteGroupId() { return remoteGroupId; }

    @Override
    public String getRemoteIpPrefix() { return remoteIpPrefix; }

    @Override
    public String getProjectId() { return projectId; }

    @Override
    public String getDescription() { return description;  }

    @Override
    public String getCreatedAt() { return createdAt; }

    public void setSecurityGroupId(String securityGroupId) { this.securityGroupId = securityGroupId; }

    public void setDirection(String direction) { this.direction = direction; }

    public void setProtocol(String protocol) {  this.protocol = protocol; }

    public void setPortRangeMin(Integer portRangeMin) { this.portRangeMin = portRangeMin; }

    public void setPortRangeMax(Integer portRangeMax) { this.portRangeMax = portRangeMax; }

    public void setEtherType(String etherType) { this.etherType = etherType; }

    public void setRemoteGroupId(String remoteGroupId) { this.remoteGroupId = remoteGroupId; }

    public void setRemoteIpPrefix(String remoteIpPrefix) { this.remoteIpPrefix = remoteIpPrefix; }

    public void setProjectId(String projectId) { this.projectId = projectId; }

    public void setDescription(String description) { this.description = description; }

    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues()
                .add("id", id)
                .add("securityGroupId", securityGroupId)
                .add("direction", direction)
                .add("protocol", protocol)
                .add("etherType", etherType)
                .add("portRangeMin", portRangeMin)
                .add("portRangeMax", portRangeMax)
                .add("remoteGroupId", remoteGroupId)
                .add("remoteIpPrefix", remoteIpPrefix)
                .add("projectId", projectId)
                .add("description", description)
                .add("createdAt", createdAt)
                .toString();
    }

    public static class SecurityGroupBlackRules extends ListResult<NeutronSecurityGroupBlackRule> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("securitygroupblacklistrules")
        private List<NeutronSecurityGroupBlackRule> securityGroupBlackRules;

        public List<NeutronSecurityGroupBlackRule> value() { return securityGroupBlackRules; }
    }

    public static class SecurityGroupConcreteBulider implements SecurityGroupBlackRuleBuilder {

        private NeutronSecurityGroupBlackRule neutronSgBlackRule;

        public SecurityGroupConcreteBulider() { neutronSgBlackRule = new NeutronSecurityGroupBlackRule(); }

        public SecurityGroupConcreteBulider(NeutronSecurityGroupBlackRule neutronSecurityGroupBlackRule){
            this.neutronSgBlackRule = neutronSecurityGroupBlackRule;
        }

        @Override
        public SecurityGroupBlackRule build() { return neutronSgBlackRule; }

        @Override
        public SecurityGroupBlackRuleBuilder from(SecurityGroupBlackRule in) {
            neutronSgBlackRule = (NeutronSecurityGroupBlackRule) in;
            return this;
        }

        @Override
        public SecurityGroupBlackRuleBuilder id(String id) {
            neutronSgBlackRule.id = id;
            return this;
        }

        @Override
        public SecurityGroupBlackRuleBuilder securityGroupId(String securityGroupId) {
            neutronSgBlackRule.securityGroupId = securityGroupId;
            return this;
        }

        @Override
        public SecurityGroupBlackRuleBuilder direction(String direction) {
            neutronSgBlackRule.direction = direction;
            return this;
        }

        @Override
        public SecurityGroupBlackRuleBuilder protocol(String protocol) {
            neutronSgBlackRule.protocol = protocol;
            return this;
        }

        @Override
        public SecurityGroupBlackRuleBuilder portRangeMin(Integer portRangeMin) {
            neutronSgBlackRule.portRangeMin = portRangeMin;
            return this;
        }

        @Override
        public SecurityGroupBlackRuleBuilder portRangeMax(Integer portRangeMax) {
            neutronSgBlackRule.portRangeMax = portRangeMax;
            return this;
        }

        @Override
        public SecurityGroupBlackRuleBuilder etherType(String etherType) {
            neutronSgBlackRule.etherType = etherType;
            return this;
        }

        @Override
        public SecurityGroupBlackRuleBuilder remoteGroupId(String remoteGroupId) {
            neutronSgBlackRule.remoteGroupId = remoteGroupId;
            return this;
        }

        @Override
        public SecurityGroupBlackRuleBuilder remoteIpPrefix(String remoteIpPrefix) {
            neutronSgBlackRule.remoteIpPrefix = remoteIpPrefix;
            return this;
        }

        @Override
        public SecurityGroupBlackRuleBuilder projectId(String projectId) {
            neutronSgBlackRule.projectId = projectId;
            return this;
        }

        @Override
        public SecurityGroupBlackRuleBuilder description(String description) {
            neutronSgBlackRule.description = description;
            return this;
        }

        @Override
        public SecurityGroupBlackRuleBuilder createdAt(String createdAt) {
            neutronSgBlackRule.createdAt = createdAt;
            return this;
        }
    }
}
