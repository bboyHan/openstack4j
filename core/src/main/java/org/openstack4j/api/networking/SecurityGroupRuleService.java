package org.openstack4j.api.networking;

import org.openstack4j.common.RestService;
import org.openstack4j.model.network.SecurityGroupRule;
import org.openstack4j.model.network.options.SecurityGroupRuleOptions;
import org.openstack4j.openstack.networking.domain.NeutronSecurityGroupRule;

import java.util.List;
import java.util.Map;


/**
 * Provides Neutron-based Security Group Rule services.
 *
 * @author Nathan Anderson
 * @author bboyHan
 */
public interface SecurityGroupRuleService extends RestService {

    /**
     * List security group rules accessible by current Tenant.
     *
     * @return the list<? extends security group rules>
     */
    List<? extends SecurityGroupRule> list();

    List<? extends SecurityGroupRule> list(SecurityGroupRuleOptions options);

    /**
     * Gets the Security Group rule by id
     *
     * @param id the id
     * @return the security group rule
     */
    SecurityGroupRule get(String id);

    /**
     * Delete security group rule by id.
     *
     * @param id the id
     */
    void delete(String id);

    /**
     * Creates a security group rule.
     *
     * @param rule the rule
     * @return the security group rule
     */
    SecurityGroupRule create(SecurityGroupRule rule);

    NeutronSecurityGroupRule.SecurityGroupRules create(NeutronSecurityGroupRule.SecurityGroupRules rules);

    /**
     * List security group rules accessible by current Tenant.
     *
     * @param filteringParams map (name, value) of filtering parameters
     * @return the list<? extends security group rules>
     */
    List<? extends SecurityGroupRule> list(Map<String, String> filteringParams);

}
