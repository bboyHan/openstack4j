package org.openstack4j.api.networking.ext;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.AclRule;
import org.openstack4j.model.network.options.AclRuleOptions;

import java.util.List;

/**
 * Acl Rule API
 *
 * @author liwanjun
 */
public interface AclRuleService extends RestService {

    /**
     * List acl rules
     *
     * @return the list of acl rules
     */
    List<? extends AclRule> list();

    List<? extends AclRule> list(AclRuleOptions options);

    /**
     * Get the acl rule by id
     *
     * @param id acl rule id
     * @return the acl rule
     */
    AclRule get(String id);

    /**
     * Create acl rule
     *
     * @param aclRule acl rule object
     * @return the response object
     */
    AclRule create(AclRule aclRule);

    /**
     * Update acl rule
     *
     * @param id acl rule id
     * @param aclRule acl rule object
     * @return the response object
     */
    AclRule update(String id, AclRule aclRule);

    /**
     * Delete the acl rule by id
     *
     * @param id acl rule id
     * @return the action response
     */
    ActionResponse delete(String id);

}
