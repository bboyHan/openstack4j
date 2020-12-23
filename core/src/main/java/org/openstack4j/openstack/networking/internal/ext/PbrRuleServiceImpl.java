package org.openstack4j.openstack.networking.internal.ext;

import org.openstack4j.api.networking.ext.PbrRuleService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.PbrRule;
import org.openstack4j.model.network.options.PbrRuleOptions;
import org.openstack4j.openstack.networking.domain.ext.NeutronPbrRule;
import org.openstack4j.openstack.networking.domain.ext.NeutronPbrRule.PbrRules;
import org.openstack4j.openstack.networking.internal.BaseNetworkingServices;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * {@inheritDoc}
 */
public class PbrRuleServiceImpl extends BaseNetworkingServices implements PbrRuleService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends PbrRule> list() {
        return get(PbrRules.class, uri("/pbr_rules")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends PbrRule> list(PbrRuleOptions options) {
        return get(PbrRules.class, uri("/pbr_rules")).paramLists(options.getOptions()).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PbrRule create(PbrRule pbrRule) {
        checkNotNull(pbrRule);
        return post(NeutronPbrRule.class, uri("/pbr_rules")).entity(pbrRule).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse(uri("/pbr_rules/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PbrRule get(String id) {
        checkNotNull(id);
        return get(NeutronPbrRule.class, uri("/pbr_rules/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PbrRule update(String id, PbrRule pbrRule) {
        checkNotNull(id);
        return put(NeutronPbrRule.class, uri("/pbr_rules/%s", id)).entity(pbrRule).execute();
    }
}
