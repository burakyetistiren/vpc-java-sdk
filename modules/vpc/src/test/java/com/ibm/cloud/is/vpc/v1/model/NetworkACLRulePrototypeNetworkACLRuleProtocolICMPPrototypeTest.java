/*
 * (C) Copyright IBM Corp. 2020, 2021, 2022.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.is.vpc.v1.model;

import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolICMPPrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetworkACLRulePrototypeNetworkACLRuleProtocolICMPPrototype model.
 */
public class NetworkACLRulePrototypeNetworkACLRuleProtocolICMPPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetworkACLRulePrototypeNetworkACLRuleProtocolICMPPrototype() throws Throwable {
    NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById networkAclRuleBeforePrototypeModel = new NetworkACLRuleBeforePrototypeNetworkACLRuleIdentityById.Builder()
      .id("8daca77a-4980-4d33-8f3e-7038797be8f9")
      .build();
    assertEquals(networkAclRuleBeforePrototypeModel.id(), "8daca77a-4980-4d33-8f3e-7038797be8f9");

    NetworkACLRulePrototypeNetworkACLRuleProtocolICMPPrototype networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModel = new NetworkACLRulePrototypeNetworkACLRuleProtocolICMPPrototype.Builder()
      .action("allow")
      .before(networkAclRuleBeforePrototypeModel)
      .destination("192.168.3.2/32")
      .direction("inbound")
      .name("my-rule-2")
      .source("192.168.3.2/32")
      .code(Long.valueOf("0"))
      .protocol("icmp")
      .type(Long.valueOf("8"))
      .build();
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModel.before(), networkAclRuleBeforePrototypeModel);
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModel.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModel.code(), Long.valueOf("0"));
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModel.protocol(), "icmp");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModel.type(), Long.valueOf("8"));

    String json = TestUtilities.serialize(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModel);

    NetworkACLRulePrototypeNetworkACLRuleProtocolICMPPrototype networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModelNew = TestUtilities.deserialize(json, NetworkACLRulePrototypeNetworkACLRuleProtocolICMPPrototype.class);
    assertTrue(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModelNew instanceof NetworkACLRulePrototypeNetworkACLRuleProtocolICMPPrototype);
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModelNew.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModelNew.before().toString(), networkAclRuleBeforePrototypeModel.toString());
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModelNew.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModelNew.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModelNew.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModelNew.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModelNew.code(), Long.valueOf("0"));
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModelNew.protocol(), "icmp");
    assertEquals(networkAclRulePrototypeNetworkAclRuleProtocolIcmpPrototypeModelNew.type(), Long.valueOf("8"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNetworkACLRulePrototypeNetworkACLRuleProtocolICMPPrototypeError() throws Throwable {
    new NetworkACLRulePrototypeNetworkACLRuleProtocolICMPPrototype.Builder().build();
  }

}