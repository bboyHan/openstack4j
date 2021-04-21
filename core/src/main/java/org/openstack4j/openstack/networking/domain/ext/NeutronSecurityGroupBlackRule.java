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

    @JsonProperty("id")
    private String id;

    @JsonProperty("security_group_id")
    private String securityGroupId;

    @JsonProperty("direction")
    private String direction;

    @JsonProperty("protocol")
    private String protocol;

    @JsonProperty("ethertype")
    private String ethertype;

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

    @JsonProperty("description")
    private String description;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("action")
    private String action = "reject";

    @Override
    public SecurityGroupBlackRuleBuilder toBuilder() {
       return new SecurityGroupConcreteBulider(this);
    }

    public static SecurityGroupBlackRuleBuilder builder() { return new SecurityGroupConcreteBulider();}

    @Override
    public String getTenantId() { return null; }

    @Override
    public void setTenantId(String tenantId) { }

    @Override
    public String getName() { return null; }

    @Override
    public void setName(String name) { }

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
    public Integer getPortRangeMin() { return portRangeMin; }

    @Override
    public Integer getPortRangeMax() { return portRangeMax; }

    @Override
    public String getEthertype() { return ethertype; }

    @Override
    public String getRemoteGroupId() { return remoteGroupId; }

    @Override
    public String getRemoteIpPrefix() { return remoteIpPrefix; }

    @Override
    public String getProjectId() { return projectId; }

    @Override
    public String description() { return description; }

    @Override
    public String createdAt() { return createdAt; }

    @Override
    public String action() { return action; }

    public void setSecurityGroupId() { this.securityGroupId = securityGroupId; }

    public void setDirection() { this.direction = direction; }

    public void setProtocol() {  this.protocol = protocol; }

    public void setPortRangeMin() { this.portRangeMin = portRangeMin; }

    public void setPortRangeMax() { this.portRangeMax = portRangeMax; }

    public void setEthertype() { this.ethertype = ethertype; }

    public void setRemoteGroupId() { this.remoteGroupId = remoteGroupId; }

    public void setRemoteIpPrefix() { this.remoteIpPrefix = remoteIpPrefix; }

    public void setProjectId() { this.projectId = projectId; }

    public void setDescription() { this.description = description; }

    public void setCreatedAt() { this.createdAt = createdAt; }

    public void setAction() { this.action = action; }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues()
                .add("id", id)
                .add("securityGroupId", securityGroupId)
                .add("direction", direction)
                .add("protocol", protocol)
                .add("ethertype", ethertype)
                .add("portRangeMin", portRangeMin)
                .add("portRangeMax", portRangeMax)
                .add("remoteGroupId", remoteGroupId)
                .add("remoteIpPrefix", remoteIpPrefix)
                .add("projectId", projectId)
                .add("description", description)
                .add("createdAt", createdAt)
                .add("action", action)
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
        public SecurityGroupBlackRuleBuilder ethertype(String ethertype) {
            neutronSgBlackRule.ethertype = ethertype;
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

        @Override
        public SecurityGroupBlackRuleBuilder action(String action) {
            neutronSgBlackRule.action = action;
            return this;
        }
    }
}
