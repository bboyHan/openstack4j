package org.openstack4j.api.network;

import org.openstack4j.api.AbstractTest;
import org.openstack4j.api.Builders;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.AclPolicy;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Test(suiteName = "AclPolicy")
public class AclPolicyTests extends AbstractTest {

    private static final String ACL_POLICY_ID = "150c2398-2263-48d4-a88b-25afc9ef7b81";
    private static final String ACL_POLICY_NAME = "test-policy";
    private static final String JSON_ACL_POLICY = "/network/acl_policy.json";
    private static final String JSON_ACL_POLICIES = "/network/acl_policies.json";

    @Test
    public void createAclPolicy() throws Exception {
        respondWith(JSON_ACL_POLICY);
        AclPolicy aclPolicy = osv3().networking().aclPolicy().create(Builders.aclPolicy().name(ACL_POLICY_NAME).build());
        assertEquals(aclPolicy.getName(), ACL_POLICY_NAME);
    }

    @Test
    public void getAclPolicy() throws Exception {
        respondWith(JSON_ACL_POLICY);
        AclPolicy aclPolicy = osv3().networking().aclPolicy().get(ACL_POLICY_ID);
        assertEquals(aclPolicy.getId(), ACL_POLICY_ID);
    }

    @Test
    public void listAclPolicy() throws Exception {
        respondWith(JSON_ACL_POLICIES);
        List<? extends AclPolicy> list = osv3().networking().aclPolicy().list();
        AclPolicy aclPolicy = list.get(0);
        assertEquals(list.size(), 1);
        assertEquals(aclPolicy.getId(), ACL_POLICY_ID);
    }

    @Test
    public void updateAclPolicy() throws Exception {
        respondWith(JSON_ACL_POLICY);
        AclPolicy aclPolicy = osv3().networking().aclPolicy().update(ACL_POLICY_ID, Builders.aclPolicy().name(ACL_POLICY_NAME).build());
        assertEquals(aclPolicy.getName(), ACL_POLICY_NAME);
    }

    @Test
    public void deleteAclPolicy() throws Exception {
        respondWith(200);
        ActionResponse result = osv3().networking().aclPolicy().delete(ACL_POLICY_ID);
        assertTrue(result.isSuccess());
    }

    @Override
    protected Service service() {
        return Service.NETWORK;
    }

}
