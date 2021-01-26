package org.openstack4j.openstack.networking.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openstack4j.model.ModelEntity;

import java.util.List;

public class NeutronSecurityGroupRules implements ModelEntity {

    @JsonProperty("security_group_rules")
    List<NeutronSecurityGroupRule> ruleList;

    public List<NeutronSecurityGroupRule> getRuleList() {
        return this.ruleList;
    }

    public void setRuleList(List<NeutronSecurityGroupRule> ruleList) {
        this.ruleList = ruleList;
    }

    public void addRule(NeutronSecurityGroupRule rule) {
        this.ruleList.add(rule);
    }
}
