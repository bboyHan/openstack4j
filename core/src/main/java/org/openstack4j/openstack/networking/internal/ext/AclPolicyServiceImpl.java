package org.openstack4j.openstack.networking.internal.ext;

import org.openstack4j.api.networking.ext.AclPolicyService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.AclPolicy;
import org.openstack4j.model.network.options.AclPolicyOptions;
import org.openstack4j.openstack.networking.domain.ext.NeutronAclPolicy;
import org.openstack4j.openstack.networking.domain.ext.NeutronAclPolicy.AclPolicies;
import org.openstack4j.openstack.networking.internal.BaseNetworkingServices;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Acl Policy implementation
 *
 * @author liwanjun
 */
public class AclPolicyServiceImpl extends BaseNetworkingServices implements AclPolicyService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends AclPolicy> list() {
        return get(AclPolicies.class, uri("/acl/acl_policies")).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends AclPolicy> list(AclPolicyOptions options) {
        if (options == null) {
            return list();
        }
        return get(AclPolicies.class, uri("/acl/acl_policies")).paramLists(options.getOptions()).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclPolicy get(String id) {
        checkNotNull(id);
        return get(NeutronAclPolicy.class, uri("/acl/acl_policies/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclPolicy create(AclPolicy aclPolicy) {
        checkNotNull(aclPolicy);
        return post(NeutronAclPolicy.class, uri("/acl/acl_policies")).entity(aclPolicy).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclPolicy update(String id, AclPolicy aclPolicy) {
        checkNotNull(id);
        checkNotNull(aclPolicy);
        AclPolicy policy = aclPolicy.toBuilder().tenantId(null).createTime(null).updateTime(null)
                .projectId(null).aclRules(null).aclBindingList(null).build();
        return put(NeutronAclPolicy.class, uri("/acl/acl_policies/%s", getAndClearIdentifier(policy))).entity(policy).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse(uri("/acl/acl_policies/%s", id)).execute();
    }

    private String getAndClearIdentifier(AclPolicy aclPolicy) {
        String aclPolicyId = aclPolicy.getId();
        aclPolicy.setId(null);
        return aclPolicyId;
    }

}
