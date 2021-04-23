package org.openstack4j.api.network;

import org.openstack4j.api.AbstractTest;
import org.openstack4j.api.Builders;
import org.openstack4j.model.network.ext.SecurityGroupBlackRule;
import org.openstack4j.model.network.options.SecurityGroupBlackRuleOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

@Test(suiteName = "SecurityGroupBlackRule")
public class SecurityGroupBlackRuleTests extends AbstractTest{

    private static final String SG_ID = "52bcd9c3-bc81-4846-9d1c-a6de79b65ed4";
    private static final String SG_BLACK_RULE_ID = "23c7a45e-7630-437b-852d-be70f18c8bae";
    private static final String JSON_SG_BLACK_RULE = "/network/security_group_black_rule.json";
    private static final String JSON_SG_BLACK_RULES =  "/network/security_group_black_rules.json";

    @Test
    public void testListSgBlackRule() throws Exception{
        respondWith(JSON_SG_BLACK_RULES);
        List<? extends SecurityGroupBlackRule> list = osv3().networking().sgBlackRule().list();
        SecurityGroupBlackRule sgRule = list.get(0);
        Assert.assertEquals(list.size(), 1);
        Assert.assertEquals(sgRule.getId(), SG_BLACK_RULE_ID);
    }

    @Test
    public void testListSgBlackRuleByOption() throws Exception{
        respondWith(JSON_SG_BLACK_RULES);
        SecurityGroupBlackRuleOptions options = SecurityGroupBlackRuleOptions.create();
        options.securityGroupId(SG_ID);
        List<? extends SecurityGroupBlackRule> list = osv3().networking().sgBlackRule().list(options);
        SecurityGroupBlackRule sgRule = list.get(0);
        Assert.assertEquals(list.size(), 1);
        Assert.assertEquals(sgRule.getId(), SG_BLACK_RULE_ID);
    }

    @Test
    public void testGetSgBlackRule() throws Exception{
        respondWith(JSON_SG_BLACK_RULE);
        SecurityGroupBlackRule sgRule = osv3().networking().sgBlackRule().get(SG_BLACK_RULE_ID);
        Assert.assertEquals(sgRule.getId(), SG_BLACK_RULE_ID);
    }

    @Test
    public void testCreateSgBlackRule() throws Exception{
        respondWith(JSON_SG_BLACK_RULE);
        SecurityGroupBlackRule rule = Builders.sgBlackRule().securityGroupId(SG_ID).direction("ingress").etherType("IPv4").portRangeMin(22).
                portRangeMax(22).protocol("TCP").build();
        SecurityGroupBlackRule sgRule = osv3().networking().sgBlackRule().create(rule);
        assertEquals(sgRule.getSecurityGroupId(), SG_ID);
    }

    @Test
    public void testDeleteSgBlackRule() throws Exception{
        respondWith(JSON_SG_BLACK_RULE);
        SecurityGroupBlackRule rule = Builders.sgBlackRule().securityGroupId(SG_ID).direction("ingress").etherType("IPv4").portRangeMin(22).
                portRangeMax(22).protocol("TCP").build();
        SecurityGroupBlackRule sgRule = osv3().networking().sgBlackRule().create(rule);
        assertEquals(sgRule.getSecurityGroupId(), SG_ID);
    }

    @Override
    protected Service service() {
        return Service.NETWORK;
    }
}
