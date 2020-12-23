package org.openstack4j.openstack.networking.domain.ext;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import org.openstack4j.model.network.ext.RpFilter;
import org.openstack4j.model.network.ext.builder.RpFilterBuilder;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;

/**
 * @author bboyHan
 */
@JsonRootName("rp_filter")
public class NeutronRpFilter implements RpFilter {

    private static final long serialVersionUID = 1L;

    @JsonProperty
    private String id;
    @JsonProperty
    private String pref;
    @JsonProperty("project_id")
    private String projectId;
    @JsonProperty("tenant_id")
    private String tenantId;
    @JsonProperty("port_id")
    private String portId;
    @JsonProperty
    private String value;
    @JsonProperty("router_id")
    private String routerId;

    @Override
    public String getPref() {
        return pref;
    }

    public void setPref(String pref) {
        this.pref = pref;
    }

    @Override
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    @Override
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues()
                .add("id", id).add("pref", pref).add("projectId", projectId).add("tenantId", tenantId)
                .add("portId", portId).add("value", value).add("routerId", routerId)
                .toString();
    }

    @Override
    public RpFilterBuilder toBuilder() {
        return new RpFilterConcreteBuilder(this);
    }

    public static RpFilterBuilder builder() {
        return new RpFilterConcreteBuilder();
    }

    public static class RpFilters extends ListResult<NeutronRpFilter> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("rp_filters")
        private List<NeutronRpFilter> rpFilters;

        public List<NeutronRpFilter> value() {
            return rpFilters;
        }
    }

    public static class RpFilterConcreteBuilder implements RpFilterBuilder {

        private NeutronRpFilter neutronRpFilter;

        public RpFilterConcreteBuilder() {
            this.neutronRpFilter = new NeutronRpFilter();
        }

        public RpFilterConcreteBuilder(NeutronRpFilter neutronRpFilter) {
            this.neutronRpFilter = neutronRpFilter;
        }

        public RpFilterBuilder id(String id) {
            this.neutronRpFilter.id = id;
            return this;
        }

        @Override
        public RpFilterBuilder pref(String pref) {
            this.neutronRpFilter.pref = pref;
            return this;
        }


        @Override
        public RpFilterBuilder projectId(String projectId) {
            this.neutronRpFilter.projectId = projectId;
            return this;
        }

        @Override
        public RpFilterBuilder routerId(String routerId) {
            this.neutronRpFilter.routerId = routerId;
            return this;
        }

        @Override
        public RpFilterBuilder value(String value) {
            this.neutronRpFilter.value = value;
            return this;
        }

        @Override
        public RpFilterBuilder portId(String portId) {
            this.neutronRpFilter.portId = portId;
            return this;
        }

        @Override
        public RpFilter build() {
            return this.neutronRpFilter;
        }

        @Override
        public RpFilterBuilder from(RpFilter in) {
            this.neutronRpFilter = (NeutronRpFilter) in;
            return this;
        }
    }
}
