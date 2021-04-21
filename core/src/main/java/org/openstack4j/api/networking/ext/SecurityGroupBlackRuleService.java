package org.openstack4j.api.networking.ext;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.SecurityGroupBlackRule;
import org.openstack4j.model.network.options.SecurityGroupBlackRuleOptions;

import java.util.List;

/**
 * Security Group Black Rule API
 */
public interface SecurityGroupBlackRuleService extends RestService {

    /**
     * List Security Group black rules
     *
     * @return the list of security group black rules
     */
    List<? extends SecurityGroupBlackRule> list();

    List<? extends SecurityGroupBlackRule> list(SecurityGroupBlackRuleOptions options);

    /**
     * Get the sg black rule by id
     *
     * @param id sg black rule id
     * @return the security group black rule
     */
    SecurityGroupBlackRule get(String id);

    /**
     * Create sg black rule
     *
     * @param sgRule
     * @return the response object
     */
    SecurityGroupBlackRule create(SecurityGroupBlackRule sgRule);

    /**
     * Delete the sg black rule by id
     *
     * @param id
     * @return the action response
     */
    ActionResponse delete(String id);
}
