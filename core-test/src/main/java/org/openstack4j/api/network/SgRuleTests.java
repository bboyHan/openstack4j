package org.openstack4j.api.network;

import org.openstack4j.api.AbstractTest;
import org.openstack4j.api.Builders;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.SgRule;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Test(suiteName = "SgRule")
public class SgRuleTests extends AbstractTest {

    private static final String SG_RULE_ID = "78dcd363-fc23-aeb6-f44b-56dc5e2fb3ae";
    private static final String JSON_SG_RULE = "/network/sg_rule.json";
    private static final String JSON_SG_RULES = "/network/sg_rules.json";

    @Test
    public void createSgRule() throws Exception {
        respondWith(JSON_SG_RULE);
        SgRule sgRule = osv3().networking().sgRule().create(Builders.sgRule().id(SG_RULE_ID).build());
        assertEquals(sgRule.getId(), SG_RULE_ID);
    }

    @Test
    public void getSgRule() throws Exception {
        respondWith(JSON_SG_RULE);
        SgRule sgRule = osv3().networking().sgRule().get(SG_RULE_ID);
        assertEquals(sgRule.getId(), SG_RULE_ID);
    }

    @Test
    public void listSgRule() throws Exception {
        respondWith(JSON_SG_RULES);
        List<? extends SgRule> list = osv3().networking().sgRule().list();
        SgRule sgRule = list.get(0);
        assertEquals(list.size(), 1);
        assertEquals(sgRule.getId(), SG_RULE_ID);
    }

    @Test
    public void deleteSgRule() throws Exception {
        respondWith(200);
        ActionResponse result = osv3().networking().sgRule().delete(SG_RULE_ID);
        assertTrue(result.isSuccess());
    }

    @Override
    protected Service service() {
        return Service.NETWORK;
    }

}
