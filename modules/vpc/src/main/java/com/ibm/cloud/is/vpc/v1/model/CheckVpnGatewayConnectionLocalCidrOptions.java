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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The checkVpnGatewayConnectionLocalCidr options.
 */
public class CheckVpnGatewayConnectionLocalCidrOptions extends GenericModel {

  protected String vpnGatewayId;
  protected String id;
  protected String cidrPrefix;
  protected String prefixLength;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpnGatewayId;
    private String id;
    private String cidrPrefix;
    private String prefixLength;

    /**
     * Instantiates a new Builder from an existing CheckVpnGatewayConnectionLocalCidrOptions instance.
     *
     * @param checkVpnGatewayConnectionLocalCidrOptions the instance to initialize the Builder with
     */
    private Builder(CheckVpnGatewayConnectionLocalCidrOptions checkVpnGatewayConnectionLocalCidrOptions) {
      this.vpnGatewayId = checkVpnGatewayConnectionLocalCidrOptions.vpnGatewayId;
      this.id = checkVpnGatewayConnectionLocalCidrOptions.id;
      this.cidrPrefix = checkVpnGatewayConnectionLocalCidrOptions.cidrPrefix;
      this.prefixLength = checkVpnGatewayConnectionLocalCidrOptions.prefixLength;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vpnGatewayId the vpnGatewayId
     * @param id the id
     * @param cidrPrefix the cidrPrefix
     * @param prefixLength the prefixLength
     */
    public Builder(String vpnGatewayId, String id, String cidrPrefix, String prefixLength) {
      this.vpnGatewayId = vpnGatewayId;
      this.id = id;
      this.cidrPrefix = cidrPrefix;
      this.prefixLength = prefixLength;
    }

    /**
     * Builds a CheckVpnGatewayConnectionLocalCidrOptions.
     *
     * @return the new CheckVpnGatewayConnectionLocalCidrOptions instance
     */
    public CheckVpnGatewayConnectionLocalCidrOptions build() {
      return new CheckVpnGatewayConnectionLocalCidrOptions(this);
    }

    /**
     * Set the vpnGatewayId.
     *
     * @param vpnGatewayId the vpnGatewayId
     * @return the CheckVpnGatewayConnectionLocalCidrOptions builder
     */
    public Builder vpnGatewayId(String vpnGatewayId) {
      this.vpnGatewayId = vpnGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CheckVpnGatewayConnectionLocalCidrOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the cidrPrefix.
     *
     * @param cidrPrefix the cidrPrefix
     * @return the CheckVpnGatewayConnectionLocalCidrOptions builder
     */
    public Builder cidrPrefix(String cidrPrefix) {
      this.cidrPrefix = cidrPrefix;
      return this;
    }

    /**
     * Set the prefixLength.
     *
     * @param prefixLength the prefixLength
     * @return the CheckVpnGatewayConnectionLocalCidrOptions builder
     */
    public Builder prefixLength(String prefixLength) {
      this.prefixLength = prefixLength;
      return this;
    }
  }

  protected CheckVpnGatewayConnectionLocalCidrOptions() { }

  protected CheckVpnGatewayConnectionLocalCidrOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpnGatewayId,
      "vpnGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.cidrPrefix,
      "cidrPrefix cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.prefixLength,
      "prefixLength cannot be empty");
    vpnGatewayId = builder.vpnGatewayId;
    id = builder.id;
    cidrPrefix = builder.cidrPrefix;
    prefixLength = builder.prefixLength;
  }

  /**
   * New builder.
   *
   * @return a CheckVpnGatewayConnectionLocalCidrOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the vpnGatewayId.
   *
   * The VPN gateway identifier.
   *
   * @return the vpnGatewayId
   */
  public String vpnGatewayId() {
    return vpnGatewayId;
  }

  /**
   * Gets the id.
   *
   * The VPN gateway connection identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the cidrPrefix.
   *
   * The address prefix part of the CIDR.
   *
   * @return the cidrPrefix
   */
  public String cidrPrefix() {
    return cidrPrefix;
  }

  /**
   * Gets the prefixLength.
   *
   * The prefix length part of the CIDR.
   *
   * @return the prefixLength
   */
  public String prefixLength() {
    return prefixLength;
  }
}

