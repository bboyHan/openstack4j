package org.openstack4j.openstack.networking.internal.ext;

import org.openstack4j.api.networking.ext.SgRuleService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.SgRule;
import org.openstack4j.model.network.options.SgRuleOptions;
import org.openstack4j.openstack.networking.domain.ext.NeutronSgRule;
import org.openstack4j.openstack.networking.domain.ext.NeutronSgRule.SgRules;
import org.openstack4j.openstack.networking.internal.BaseNetworkingServices;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Sg Rule implementation
 *
 * @author liwanjun
 */
public class SgRuleServiceImpl extends BaseNetworkingServices implements SgRuleService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends SgRule> list() {
        return get(SgRules.class, uri("/sg_rules")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends SgRule> list(SgRuleOptions options) {
        return get(SgRules.class, uri("/sg_rules")).paramLists(options.getOptions()).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SgRule get(String id) {
        checkNotNull(id);
        return get(NeutronSgRule.class, uri("/sg_rules/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SgRule create(SgRule sgRule) {
        checkNotNull(sgRule);
        return post(NeutronSgRule.class, uri("/sg_rules")).entity(sgRule).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse(uri("/sg_rules/%s", id)).execute();
    }

}
