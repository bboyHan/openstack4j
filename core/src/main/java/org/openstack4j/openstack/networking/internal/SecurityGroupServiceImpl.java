package org.openstack4j.openstack.networking.internal;

import org.openstack4j.api.networking.SecurityGroupService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.SecurityGroup;
import org.openstack4j.model.network.SecurityGroupUpdate;
import org.openstack4j.model.network.options.SecurityGroupOptions;
import org.openstack4j.openstack.networking.domain.NeutronSecurityGroup;
import org.openstack4j.openstack.networking.domain.NeutronSecurityGroup.SecurityGroups;
import org.openstack4j.openstack.networking.domain.NeutronSecurityGroupTag;

import java.util.List;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * FloatingIPService implementation that provides Neutron Floating-IP based Service Operations.
 *
 * @author Nathan Anderson
 * @author bboyHan
 */
public class SecurityGroupServiceImpl extends BaseNetworkingServices implements SecurityGroupService {

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityGroup get(String id) {
        checkNotNull(id);
        return get(NeutronSecurityGroup.class, uri("/security-groups/%s", id)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse delete(String groupId) {
        checkNotNull(groupId);
        return deleteWithResponse(uri("/security-groups/%s", groupId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityGroup create(SecurityGroup securityGroup) {
        checkNotNull(securityGroup);
        return post(NeutronSecurityGroup.class, uri("/security-groups")).entity(securityGroup).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityGroup update(String securityGroupId, SecurityGroupUpdate securityGroupUpdate) {
        checkNotNull(securityGroupId);
        checkNotNull(securityGroupUpdate);
        return put(NeutronSecurityGroup.class, uri("/security-groups/%s", securityGroupId)).entity(securityGroupUpdate).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends SecurityGroup> list() {
        return get(SecurityGroups.class, uri("/security-groups")).execute().getList();
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends SecurityGroup> list(Map<String, String> filteringParams) {
        Invocation<SecurityGroups> securityGroupInvocation = get(SecurityGroups.class, "/security-groups");
        if (filteringParams != null) {
            for (Map.Entry<String, String> entry : filteringParams.entrySet()) {
                securityGroupInvocation = securityGroupInvocation.param(entry.getKey(), entry.getValue());
            }
        }
        return securityGroupInvocation.execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<? extends SecurityGroup> list(SecurityGroupOptions options) {
        if (options == null) return list();
        return get(SecurityGroups.class, uri("/security-groups")).paramLists(options.getOptions()).execute().getList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NeutronSecurityGroupTag getTag(String securityGroupId) {
        checkNotNull(securityGroupId);
        return get(NeutronSecurityGroupTag.class, uri("/security-groups/%s/tags", securityGroupId)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse updateTag(String securityGroupId, String tag) {
        checkNotNull(securityGroupId);
        checkNotNull(tag);
        return put(ActionResponse.class, uri("/security-groups/%s/tags/%s", securityGroupId, tag)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NeutronSecurityGroupTag resetTags(String securityGroupId, NeutronSecurityGroupTag tags) {
        checkNotNull(securityGroupId);
        checkNotNull(tags);
        return put(NeutronSecurityGroupTag.class, uri("/security-groups/%s/tags", securityGroupId)).entity(tags).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse deleteTag(String securityGroupId, String tag) {
        checkNotNull(securityGroupId);
        checkNotNull(tag);
        return deleteWithResponse(uri("/security-groups/%s/tags/%s", securityGroupId, tag)).execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActionResponse deleteAllTags(String securityGroupId) {
        checkNotNull(securityGroupId);
        return deleteWithResponse(uri("/security-groups/%s/tags", securityGroupId)).execute();
    }
}
