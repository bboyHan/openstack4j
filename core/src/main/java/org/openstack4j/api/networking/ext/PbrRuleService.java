package org.openstack4j.api.networking.ext;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.PbrRule;
import org.openstack4j.model.network.options.PbrRuleOptions;

import java.util.List;

/**
 * Pbr Rule
 *
 * @author bboyHan
 */
public interface PbrRuleService extends RestService {

    List<? extends PbrRule> list();

    List<? extends PbrRule> list(PbrRuleOptions options);

    PbrRule get(String id);

    PbrRule update(String id, PbrRule pbrRule);

    PbrRule create(PbrRule pbrRule);

    ActionResponse delete(String id);

}
