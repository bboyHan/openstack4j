package org.openstack4j.openstack.networking.domain.ext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.base.MoreObjects;
import org.openstack4j.model.network.ext.SgBinding;
import org.openstack4j.model.network.ext.builder.SgBindingBuilder;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;

/**
 * @author liwanjun
 *
 * {@inheritDoc}
 */
@JsonRootName("sg_binding")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeutronSgBinding implements SgBinding {

    private static final long serialVersionUID = 1L;

    @JsonProperty
    private String id;

    @JsonProperty
    private String name;

    @JsonProperty("tenant_id")
    private String tenantId;

    @JsonProperty("switch_ip")
    private String switchIp;

    @JsonProperty("interface")
    private String sgBindingInterface;

    @JsonProperty("interface_ip")
    private String interfaceIp;

    @JsonProperty("acl_rules")
    private List<String> aclRules;

    @Override
    public SgBindingBuilder toBuilder() {
        return new SgBindingConcreteBuilder(this);
    }

    public static SgBindingBuilder builder() {
        return new SgBindingConcreteBuilder();
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
    public String getSwitchIp() {
        return switchIp;
    }

    public void setSwitchIp(String switchIp) {
        this.switchIp = switchIp;
    }

    @Override
    public String getInterface() {
        return sgBindingInterface;
    }

    public void setInterface(String sgBindingInterface) {
        this.sgBindingInterface = sgBindingInterface;
    }

    @Override
    public String getInterfaceIp() {
        return interfaceIp;
    }

    public void setInterfaceIp(String interfaceIp) {
        this.interfaceIp = interfaceIp;
    }

    @Override
    public List<String> getAclRules() {
        return aclRules;
    }

    public void setAclRules(List<String> aclRules) {
        this.aclRules = aclRules;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).omitNullValues()
                .add("id", id)
                .add("name", name)
                .add("tenantId", tenantId)
                .add("switchIp", switchIp)
                .add("sgBindingInterface", sgBindingInterface)
                .add("interfaceIp", interfaceIp)
                .add("aclRules", aclRules)
                .toString();
    }

    public static class SgBindings extends ListResult<NeutronSgBinding> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("sg_bindings")
        private List<NeutronSgBinding> sgBindings;

        public List<NeutronSgBinding> value() {
            return sgBindings;
        }

    }

    public static class SgBindingConcreteBuilder implements SgBindingBuilder {

        private NeutronSgBinding neutronSgBinding;

        public SgBindingConcreteBuilder() {
            neutronSgBinding = new NeutronSgBinding();
        }

        public SgBindingConcreteBuilder(NeutronSgBinding neutronSgBinding) {
            this.neutronSgBinding = neutronSgBinding;
        }

        @Override
        public SgBinding build() {
            return neutronSgBinding;
        }

        @Override
        public SgBindingBuilder from(SgBinding in) {
            neutronSgBinding = (NeutronSgBinding) in;
            return this;
        }

        @Override
        public SgBindingBuilder name(String name) {
            neutronSgBinding.name = name;
            return this;
        }

        @Override
        public SgBindingBuilder tenantId(String tenantId) {
            neutronSgBinding.tenantId = tenantId;
            return this;
        }

        @Override
        public SgBindingBuilder switchIp(String switchIp) {
            neutronSgBinding.switchIp = switchIp;
            return this;
        }

        @Override
        public SgBindingBuilder sgBindingInterface(String sgBindingInterface) {
            neutronSgBinding.sgBindingInterface = sgBindingInterface;
            return this;
        }

        @Override
        public SgBindingBuilder interfaceIp(String interfaceIp) {
            neutronSgBinding.interfaceIp = interfaceIp;
            return this;
        }

    }

}
