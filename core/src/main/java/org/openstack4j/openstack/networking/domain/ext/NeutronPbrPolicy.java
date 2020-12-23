package org.openstack4j.openstack.networking.domain.ext;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import org.openstack4j.model.network.ext.PbrPolicy;
import org.openstack4j.model.network.ext.builder.PbrPolicyBuilder;
import org.openstack4j.openstack.common.ListResult;
import org.openstack4j.openstack.common.TimeEntity;

import java.util.List;

/**
 * @author bboyHan
 *
 * {@inheritDoc}
 */
@JsonRootName("pbr_policy")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeutronPbrPolicy extends TimeEntity implements PbrPolicy {

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
    @JsonProperty("router_id")
    private String routerId;
    @JsonProperty("admin_state_up")
    private String adminStateUp;
    @JsonProperty("pbr_rules")
    private List<String> pbrRules;

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

    @Override
    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    @Override
    public List<String> getPbrRules() {
        return pbrRules;
    }

    public void setPbrRules(List<String> pbrRules) {
        this.pbrRules = pbrRules;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues()
                .add("id", id).add("pbrRules", pbrRules).add("projectId", projectId).add("description", description)
                .add("name", name).add("routerId", routerId).add("adminStateUp", adminStateUp)
                .add("status", status).toString();
    }

    @Override
    public PbrPolicyBuilder toBuilder() {
        return new PbrPolicyConcreteBuilder(this);
    }

    public static PbrPolicyBuilder builder() {
        return new PbrPolicyConcreteBuilder();
    }

    public static class PbrPolicies extends ListResult<NeutronPbrPolicy> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("pbr_policies")
        private List<NeutronPbrPolicy> pbrPolicies;

        public List<NeutronPbrPolicy> value() {
            return pbrPolicies;
        }
    }

    public static class PbrPolicyConcreteBuilder implements PbrPolicyBuilder {

        private NeutronPbrPolicy neutronPbrPolicy;

        public PbrPolicyConcreteBuilder() {
            this.neutronPbrPolicy = new NeutronPbrPolicy();
        }

        public PbrPolicyConcreteBuilder(NeutronPbrPolicy neutronPbrPolicy) {
            this.neutronPbrPolicy = neutronPbrPolicy;
        }

        public PbrPolicyBuilder id(String id) {
            this.neutronPbrPolicy.id = id;
            return this;
        }

        @Override
        public PbrPolicyBuilder name(String name) {
            this.neutronPbrPolicy.name = name;
            return this;
        }

        @Override
        public PbrPolicyBuilder description(String description) {
            this.neutronPbrPolicy.description = description;
            return this;
        }

        @Override
        public PbrPolicyBuilder routerId(String routerId) {
            this.neutronPbrPolicy.routerId = routerId;
            return this;
        }

        @Override
        public PbrPolicyBuilder projectId(String projectId) {
            this.neutronPbrPolicy.projectId = projectId;
            return this;
        }

        @Override
        public PbrPolicyBuilder status(String status) {
            this.neutronPbrPolicy.status = status;
            return this;
        }

        @Override
        public PbrPolicy build() {
            return this.neutronPbrPolicy;
        }

        @Override
        public PbrPolicyBuilder from(PbrPolicy in) {
            this.neutronPbrPolicy = (NeutronPbrPolicy) in;
            return this;
        }
    }
}
