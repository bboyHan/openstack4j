package org.openstack4j.api.network;

import org.openstack4j.api.AbstractTest;
import org.openstack4j.api.Builders;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.network.ext.AclBinding;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Test(suiteName = "AclBinding")
public class AclBindingTests extends AbstractTest {

    private static final String ACL_BINDING_ID = "708a1012-0bcf-43d4-a8dd-2458dde96679";
    private static final String ACL_BINDING_SUBNET_ID = "74841564-9f95-48d5-b83b-263cb994ec2b";
    private static final String JSON_ACL_BINDING = "/network/acl_binding.json";
    private static final String JSON_ACL_BINDINGS = "/network/acl_bindings.json";

    @Test
    public void createAclBinding() throws Exception {
        respondWith(JSON_ACL_BINDING);
        AclBinding aclBinding = osv3().networking().aclBinding().create(Builders.aclBinding().subnetId(ACL_BINDING_SUBNET_ID).build());
        assertEquals(aclBinding.getSubnetId(), ACL_BINDING_SUBNET_ID);
    }

    @Test
    public void getAclBinding() throws Exception {
        respondWith(JSON_ACL_BINDING);
        AclBinding aclBinding = osv3().networking().aclBinding().get(ACL_BINDING_ID);
        assertEquals(aclBinding.getId(), ACL_BINDING_ID);
    }

    @Test
    public void listAclBinding() throws Exception {
        respondWith(JSON_ACL_BINDINGS);
        List<? extends AclBinding> list = osv3().networking().aclBinding().list();
        AclBinding aclBinding = list.get(0);
        assertEquals(list.size(), 1);
        assertEquals(aclBinding.getId(), ACL_BINDING_ID);
    }

    @Test
    public void deleteAclBinding() throws Exception {
        respondWith(200);
        ActionResponse result = osv3().networking().aclBinding().delete(ACL_BINDING_ID);
        assertTrue(result.isSuccess());
    }

    @Override
    protected Service service() {
        return Service.NETWORK;
    }

}
