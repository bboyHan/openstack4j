package org.openstack4j.openstack.networking.internal.ext;

import org.openstack4j.api.networking.ext.AclRuleService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.AclRule;
import org.openstack4j.model.network.options.AclRuleOptions;
import org.openstack4j.openstack.networking.domain.ext.NeutronAclRule;
import org.openstack4j.openstack.networking.domain.ext.NeutronAclRule.AclRules;
import org.openstack4j.openstack.networking.internal.BaseNetworkingServices;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Acl Rule implementation
 *
 * @author liwanjun
 */
public class AclRuleServiceImpl extends BaseNetworkingServices implements AclRuleService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends AclRule> list() {
        return get(AclRules.class, uri("/acl/acl_rules")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends AclRule> list(AclRuleOptions options) {
        if (options == null) {
            return list();
        }
        return get(AclRules.class, uri("/acl/acl_rules")).paramLists(options.getOptions()).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRule get(String id) {
        checkNotNull(id);
        return get(NeutronAclRule.class, uri("/acl/acl_rules/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRule create(AclRule aclRule) {
        checkNotNull(aclRule);
        return post(NeutronAclRule.class, uri("/acl/acl_rules")).entity(aclRule).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRule update(String id, AclRule aclRule) {
        checkNotNull(id);
        checkNotNull(aclRule);
        AclRule rule = aclRule.toBuilder().tenantId(null).aclPolicyId(null).position(null)
                .createTime(null).updateTime(null).projectId(null).build();
        return put(NeutronAclRule.class, uri("/acl/acl_rules/%s", getAndClearIdentifier(rule))).entity(rule).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse(uri("/acl/acl_rules/%s", id)).execute();
    }

    private String getAndClearIdentifier(AclRule aclRule) {
        String aclRuleId = aclRule.getId();
        aclRule.setId(null);
        return aclRuleId;
    }

}
