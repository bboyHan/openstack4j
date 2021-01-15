package org.openstack4j.api.network;

import org.openstack4j.api.AbstractTest;
import org.openstack4j.api.Builders;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.AclRule;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Test(suiteName = "AclRule")
public class AclRuleTests extends AbstractTest {

    private static final String ACL_RULE_ID = "0012b505-4853-4c40-8c65-907ff3e9bcc9";
    private static final String ACL_RULE_NAME = "test-rule";
    private static final String JSON_ACL_RULE = "/network/acl_rule.json";
    private static final String JSON_ACL_RULES = "/network/acl_rules.json";

    @Test
    public void createAclRule() throws Exception {
        respondWith(JSON_ACL_RULE);
        AclRule aclRule = osv3().networking().aclRule().create(Builders.aclRule().name(ACL_RULE_NAME).build());
        assertEquals(aclRule.getName(), ACL_RULE_NAME);
    }

    @Test
    public void getAclRule() throws Exception {
        respondWith(JSON_ACL_RULE);
        AclRule aclRule = osv3().networking().aclRule().get(ACL_RULE_ID);
        assertEquals(aclRule.getId(), ACL_RULE_ID);
    }

    @Test
    public void listAclRule() throws Exception {
        respondWith(JSON_ACL_RULES);
        List<? extends AclRule> list = osv3().networking().aclRule().list();
        AclRule aclRule = list.get(0);
        assertEquals(list.size(), 1);
        assertEquals(aclRule.getId(), ACL_RULE_ID);
    }

    @Test
    public void updateAclRule() throws Exception {
        respondWith(JSON_ACL_RULE);
        AclRule aclRule = osv3().networking().aclRule().update(ACL_RULE_ID, Builders.aclRule().name(ACL_RULE_NAME).build());
        assertEquals(aclRule.getName(), ACL_RULE_NAME);
    }

    @Test
    public void deleteAclRule() throws Exception {
        respondWith(200);
        ActionResponse result = osv3().networking().aclRule().delete(ACL_RULE_ID);
        assertTrue(result.isSuccess());
    }

    @Override
    protected Service service() {
        return Service.NETWORK;
    }

}
