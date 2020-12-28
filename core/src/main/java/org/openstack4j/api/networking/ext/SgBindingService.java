package org.openstack4j.api.networking.ext;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.SgBinding;
import org.openstack4j.model.network.options.SgBindingOptions;

import java.util.List;

/**
 * Sg Binding API
 *
 * @author liwanjun
 */
public interface SgBindingService extends RestService {

    /**
     * List sg bindings
     *
     * @return the list of sg bindings
     */
    List<? extends SgBinding> list();

    List<? extends SgBinding> list(SgBindingOptions options);

    /**
     * Get the sg binding by id
     *
     * @param id sg binding id
     * @return the sg binding
     */
    SgBinding get(String id);

    /**
     * Create sg binding
     *
     * @param sgBinding sg binding object
     * @return the response object
     */
    SgBinding create(SgBinding sgBinding);

    /**
     * Delete the sg binding by id
     *
     * @param id sg binding id
     * @return the action response
     */
    ActionResponse delete(String id);

}
