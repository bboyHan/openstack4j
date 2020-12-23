package org.openstack4j.openstack.networking.domain.ext;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import org.openstack4j.model.network.ext.PbrPolicy;
import org.openstack4j.model.network.ext.PbrRule;
import org.openstack4j.model.network.ext.builder.PbrPolicyBuilder;
import org.openstack4j.model.network.ext.builder.PbrRuleBuilder;
import org.openstack4j.openstack.common.ListResult;
import org.openstack4j.openstack.common.TimeEntity;

import java.util.List;

/**
 * @author bboyHan
 *
 * {@inheritDoc}
 */
@JsonRootName("pbr_rule")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeutronPbrRule extends TimeEntity implements PbrRule {

    private static final long serialVersionUID = 1L;

    @JsonProperty
    private String id;
    @JsonProperty
    private String name;
    @JsonProperty("project_id")
    private String projectId;
    @JsonProperty
    private String description;
    @JsonProperty
    private String status;
    @JsonProperty("pbr_policy_id")
    private String pbrPolicyId;
    @JsonProperty("admin_state_up")
    private String adminStateUp;
    @JsonProperty("apply_router_port")
    private String applyRouterPort;
    @JsonProperty("source_ip_address")
    private String sourceIpAddress;
    @JsonProperty("destination_ip_address")
    private String destinationIpAddress;
    @JsonProperty("source_port")
    private String sourcePort;
    @JsonProperty("destination_port")
    private String destinationPort;
    @JsonProperty("next_hop")
    private String nextHop;
    @JsonProperty
    private String protocol;
    @JsonProperty
    private String pref;
    @JsonProperty
    private String enabled;

    @Override
    public String getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(String adminStateUp) {
        this.adminStateUp = adminStateUp;
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
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @JsonIgnore
    @Override
    public String getTenantId() {
        return projectId;
    }

    @Override
    public void setTenantId(String tenantId) {
        this.projectId = tenantId;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPbrPolicyId() {
        return pbrPolicyId;
    }

    public void setPbrPolicyId(String pbrPolicyId) {
        this.pbrPolicyId = pbrPolicyId;
    }

    public String getApplyRouterPort() {
        return applyRouterPort;
    }

    public void setApplyRouterPort(String applyRouterPort) {
        this.applyRouterPort = applyRouterPort;
    }

    public String getSourceIpAddress() {
        return sourceIpAddress;
    }

    public void setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
    }

    public String getDestinationIpAddress() {
        return destinationIpAddress;
    }

    public void setDestinationIpAddress(String destinationIpAddress) {
        this.destinationIpAddress = destinationIpAddress;
    }

    public String getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    public String getNextHop() {
        return nextHop;
    }

    public void setNextHop(String nextHop) {
        this.nextHop = nextHop;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getPref() {
        return pref;
    }

    public void setPref(String pref) {
        this.pref = pref;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues()
                .add("id", id).add("pref", pref).add("projectId", projectId).add("description", description)
                .add("name", name).add("pbrPolicyId", pbrPolicyId).add("adminStateUp", adminStateUp)
                .add("applyRouterPort", applyRouterPort).add("sourceIpAddress", sourceIpAddress).add("destinationIpAddress", destinationIpAddress)
                .add("sourcePort", sourcePort).add("destinationPort", destinationPort).add("nextHop", nextHop)
                .add("protocol", protocol).add("enabled", enabled).toString();
    }

    @Override
    public PbrRuleBuilder toBuilder() {
        return new PbrRuleBuilderConcreteBuilder(this);
    }

    public static PbrRuleBuilder builder() {
        return new PbrRuleBuilderConcreteBuilder();
    }

    public static class PbrRules extends ListResult<NeutronPbrRule> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("pbr_rules")
        private List<NeutronPbrRule> pbrRules;

        public List<NeutronPbrRule> value() {
            return pbrRules;
        }
    }

    public static class PbrRuleBuilderConcreteBuilder implements PbrRuleBuilder {

        private NeutronPbrRule neutronPbrRule;

        public PbrRuleBuilderConcreteBuilder() {
            this.neutronPbrRule = new NeutronPbrRule();
        }

        public PbrRuleBuilderConcreteBuilder(NeutronPbrRule neutronPbrRule) {
            this.neutronPbrRule = neutronPbrRule;
        }

        public PbrRuleBuilder id(String id) {
            this.neutronPbrRule.id = id;
            return this;
        }

        @Override
        public PbrRuleBuilder name(String name) {
            this.neutronPbrRule.name = name;
            return this;
        }

        @Override
        public PbrRuleBuilder description(String description) {
            this.neutronPbrRule.description = description;
            return this;
        }

        @Override
        public PbrRuleBuilder projectId(String projectId) {
            this.neutronPbrRule.projectId = projectId;
            return this;
        }

        @Override
        public PbrRuleBuilder status(String status) {
            this.neutronPbrRule.status = status;
            return this;
        }

        @Override
        public PbrRuleBuilder pbrPolicyId(String pbrPolicyId) {
            this.neutronPbrRule.pbrPolicyId = pbrPolicyId;
            return this;
        }

        @Override
        public PbrRuleBuilder applyRouterPort(String applyRouterPort) {
            this.neutronPbrRule.applyRouterPort = applyRouterPort;
            return this;
        }

        @Override
        public PbrRuleBuilder pref(String pref) {
            this.neutronPbrRule.pref = pref;
            return this;
        }

        @Override
        public PbrRuleBuilder nextHop(String nextHop) {
            this.neutronPbrRule.nextHop = nextHop;
            return this;
        }

        @Override
        public PbrRuleBuilder sourceIpAddress(String sourceIpAddress) {
            this.neutronPbrRule.sourceIpAddress = sourceIpAddress;
            return this;
        }

        @Override
        public PbrRuleBuilder destinationIpAddress(String destinationIpAddress) {
            this.neutronPbrRule.destinationIpAddress = destinationIpAddress;
            return this;
        }

        @Override
        public PbrRule build() {
            return this.neutronPbrRule;
        }

        @Override
        public PbrRuleBuilder from(PbrRule in) {
            this.neutronPbrRule = (NeutronPbrRule) in;
            return this;
        }
    }
}
