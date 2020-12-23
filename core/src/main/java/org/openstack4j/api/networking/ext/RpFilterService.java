package org.openstack4j.api.networking.ext;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.RpFilter;
import org.openstack4j.model.network.options.RpFilterOptions;

import java.util.List;

/**
 * RpFilter
 *
 * @author bboyHan
 */
public interface RpFilterService extends RestService {

    List<? extends RpFilter> list();

    List<? extends RpFilter> list(RpFilterOptions options);

    RpFilter get(String id);

    RpFilter update(String id, RpFilter pbrPolicy);

    RpFilter create(RpFilter pbrPolicy);

    ActionResponse delete(String id);

}
