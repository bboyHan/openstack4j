package org.openstack4j.openstack.networking.internal.ext;

import org.openstack4j.api.networking.ext.SecurityGroupBlackRuleService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.SecurityGroupBlackRule;
import org.openstack4j.model.network.options.SecurityGroupBlackRuleOptions;
import org.openstack4j.openstack.networking.domain.ext.NeutronSecurityGroupBlackRule;
import org.openstack4j.openstack.networking.domain.ext.NeutronSecurityGroupBlackRule.SecurityGroupBlackRules;
import org.openstack4j.openstack.networking.internal.BaseNetworkingServices;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Security group black rule API
 */
public class SecurityGroupBlackRuleServiceImpl extends BaseNetworkingServices implements SecurityGroupBlackRuleService {

    @Override
    public List<? extends SecurityGroupBlackRule> list() {
        return get(SecurityGroupBlackRules.class, uri("/sgb/securitygroupblacklistrules")).execute().getList();
    }

    @Override
    public List<? extends SecurityGroupBlackRule> list(SecurityGroupBlackRuleOptions options) {
        if (options == null) {
            return list();
        }
        return get(SecurityGroupBlackRules.class, uri("/sgb/securitygroupblacklistrules")).paramLists(options.getOptions()).execute().getList();
    }

    @Override
    public SecurityGroupBlackRule get(String id) {
        checkNotNull(id);
        return get(NeutronSecurityGroupBlackRule.class, uri("/sgb/securitygroupblacklistrules/%s", id)).execute();
    }

    @Override
    public SecurityGroupBlackRule create(SecurityGroupBlackRule sgRule) {
        checkNotNull(sgRule);
        return post(NeutronSecurityGroupBlackRule.class, uri("/sgb/securitygroupblacklistrules")).entity(sgRule).execute();
    }

    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse(uri("/sgb/securitygroupblacklistrules/%s", id)).execute();
    }

    private String getAndClearIdentifier(SecurityGroupBlackRule sgRule) {
        String sgRuleId = sgRule.getId();
        sgRule.setId(null);
        return sgRuleId;
    }
}
