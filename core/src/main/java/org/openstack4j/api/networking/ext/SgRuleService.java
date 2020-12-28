package org.openstack4j.api.networking.ext;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.SgRule;
import org.openstack4j.model.network.options.SgRuleOptions;

import java.util.List;

/**
 * Sg Rule API
 *
 * @author liwanjun
 */
public interface SgRuleService extends RestService {

    /**
     * List sg rules
     *
     * @return the list of sg rules
     */
    List<? extends SgRule> list();

    List<? extends SgRule> list(SgRuleOptions options);

    /**
     * Get the sg rule by id
     *
     * @param id sg rule id
     * @return the sg rule
     */
    SgRule get(String id);

    /**
     * Create sg rule
     *
     * @param sgRule sg rule object
     * @return the response object
     */
    SgRule create(SgRule sgRule);

    /**
     * Delete the sg rule by id
     *
     * @param id sg rule id
     * @return the action response
     */
    ActionResponse delete(String id);

}
