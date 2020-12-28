package org.openstack4j.openstack.networking.domain.ext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import org.openstack4j.model.network.ext.SgRule;
import org.openstack4j.model.network.ext.builder.SgRuleBuilder;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;

/**
 * @author liwanjun
 *
 * {@inheritDoc}
 */
@JsonRootName("sg_rule")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeutronSgRule implements SgRule {

    private static final long serialVersionUID = 1L;

    @JsonProperty
    private String id;

    @JsonProperty
    private String name;

    @JsonProperty("tenant_id")
    private String tenantId;

    @JsonProperty
    private String type;

    @JsonProperty
    private String direction;

    @JsonProperty
    private String protocol;

    @JsonProperty("ip_version")
    private String ipVersion;

    @JsonProperty("source_ip_address")
    private String sourceIpAddress;

    @JsonProperty("destination_ip_address")
    private String destinationIpAddress;

    @JsonProperty("port_range_max")
    private String portRangeMax;

    @JsonProperty("port_range_min")
    private String portRangeMin;

    @Override
    public SgRuleBuilder toBuilder() {
        return new SgRuleConcreteBuilder(this);
    }

    public static SgRuleBuilder builder() {
        return new SgRuleConcreteBuilder();
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
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public String getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    @Override
    public String getSourceIpAddress() {
        return sourceIpAddress;
    }

    public void setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
    }

    @Override
    public String getDestinationIpAddress() {
        return destinationIpAddress;
    }

    public void setDestinationIpAddress(String destinationIpAddress) {
        this.destinationIpAddress = destinationIpAddress;
    }

    @Override
    public String getPortRangeMax() {
        return portRangeMax;
    }

    public void setPortRangeMax(String portRangeMax) {
        this.portRangeMax = portRangeMax;
    }

    @Override
    public String getPortRangeMin() {
        return portRangeMin;
    }

    public void setPortRangeMin(String portRangeMin) {
        this.portRangeMin = portRangeMin;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues()
                .add("id", id)
                .add("name", name)
                .add("tenantId", tenantId)
                .add("type", type)
                .add("direction", direction)
                .add("protocol", protocol)
                .add("ipVersion", ipVersion)
                .add("sourceIpAddress", sourceIpAddress)
                .add("destinationIpAddress", destinationIpAddress)
                .add("portRangeMax", portRangeMax)
                .add("portRangeMin", portRangeMin)
                .toString();
    }

    public static class SgRules extends ListResult<NeutronSgRule> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("sg_rules")
        private List<NeutronSgRule> sgRules;

        public List<NeutronSgRule> value() {
            return sgRules;
        }

    }

    public static class SgRuleConcreteBuilder implements SgRuleBuilder {

        private NeutronSgRule neutronSgRule;

        public SgRuleConcreteBuilder() {
            this.neutronSgRule = new NeutronSgRule();
        }

        public SgRuleConcreteBuilder(NeutronSgRule neutronSgRule) {
            this.neutronSgRule = neutronSgRule;
        }

        @Override
        public SgRule build() {
            return this.neutronSgRule;
        }

        @Override
        public SgRuleBuilder from(SgRule in) {
            this.neutronSgRule = (NeutronSgRule) in;
            return this;
        }

        @Override
        public SgRuleBuilder id(String id) {
            this.neutronSgRule.id = id;
            return this;
        }

        @Override
        public SgRuleBuilder name(String name) {
            this.neutronSgRule.name = name;
            return this;
        }

        @Override
        public SgRuleBuilder tenantId(String tenantId) {
            this.neutronSgRule.tenantId = tenantId;
            return this;
        }

        @Override
        public SgRuleBuilder type(String type) {
            this.neutronSgRule.type = type;
            return this;
        }

        @Override
        public SgRuleBuilder direction(String direction) {
            this.neutronSgRule.direction = direction;
            return this;
        }

        @Override
        public SgRuleBuilder protocol(String protocol) {
            this.neutronSgRule.protocol = protocol;
            return this;
        }

        @Override
        public SgRuleBuilder ipVersion(String ipVersion) {
            this.neutronSgRule.ipVersion = ipVersion;
            return this;
        }

        @Override
        public SgRuleBuilder sourceIpAddress(String sourceIpAddress) {
            this.neutronSgRule.sourceIpAddress = sourceIpAddress;
            return this;
        }

        @Override
        public SgRuleBuilder destinationIpAddress(String destinationIpAddress) {
            this.neutronSgRule.destinationIpAddress = destinationIpAddress;
            return this;
        }

        @Override
        public SgRuleBuilder portRangeMax(String portRangeMax) {
            this.neutronSgRule.portRangeMax = portRangeMax;
            return this;
        }

        @Override
        public SgRuleBuilder portRangeMin(String portRangeMin) {
            this.neutronSgRule.portRangeMin = portRangeMin;
            return this;
        }

    }

}
