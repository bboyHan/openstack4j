package org.openstack4j.api.network;

import org.openstack4j.api.AbstractTest;
import org.openstack4j.api.Builders;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.SgBinding;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Test(suiteName = "SgBinding")
public class SgBindingTests extends AbstractTest {

    private static final String SG_BINDING_ID = "4512d643-24fc-4fae-af4b-321c5e2eb3d1";
    private static final String SG_BINDING_NAME = "sg1";
    private static final String JSON_SG_BINDING = "/network/sg_binding.json";
    private static final String JSON_SG_BINDINGS = "/network/sg_bindings.json";

    @Test
    public void createSgBinding() throws Exception {
        respondWith(JSON_SG_BINDING);
        SgBinding sgBinding = osv3().networking().sgBinding().create(Builders.sgBinding().name(SG_BINDING_NAME).build());
        assertEquals(sgBinding.getName(), SG_BINDING_NAME);
    }

    @Test
    public void getSgBinding() throws Exception {
        respondWith(JSON_SG_BINDING);
        SgBinding sgBinding = osv3().networking().sgBinding().get(SG_BINDING_ID);
        assertEquals(sgBinding.getId(), SG_BINDING_ID);
    }

    @Test
    public void listSgBinding() throws Exception {
        respondWith(JSON_SG_BINDINGS);
        List<? extends SgBinding> list = osv3().networking().sgBinding().list();
        SgBinding sgBinding = list.get(0);
        assertEquals(list.size(), 1);
        assertEquals(sgBinding.getId(), SG_BINDING_ID);
    }

    @Test
    public void deleteSgBinding() throws Exception {
        respondWith(200);
        ActionResponse result = osv3().networking().sgBinding().delete(SG_BINDING_ID);
        assertTrue(result.isSuccess());
    }

    @Override
    protected Service service() {
        return Service.NETWORK;
    }

}
