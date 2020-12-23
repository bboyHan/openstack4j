package org.openstack4j.api.networking.ext;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.PbrPolicy;
import org.openstack4j.model.network.options.PbrPolicyOptions;

import java.util.List;

/**
 * Pbr Policy
 *
 * @author bboyHan
 */
public interface PbrPolicyService extends RestService {

    List<? extends PbrPolicy> list();

    List<? extends PbrPolicy> list(PbrPolicyOptions options);

    PbrPolicy get(String id);

    PbrPolicy update(String id, PbrPolicy pbrPolicy);

    PbrPolicy create(PbrPolicy pbrPolicy);

    ActionResponse delete(String id);

}
