/*
 * NetBox API
 * API to access NetBox
 *
 * OpenAPI spec version: 2.5
 * Contact: netbox@digitalocean.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * NestedIPAddress
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-11T16:11:54.626-06:00[America/Chicago]")public class NestedIPAddress {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("family")
  private Integer family = null;

  @SerializedName("address")
  private String address = null;
  /**
  * Get id
  * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }
  /**
  * Get url
  * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }
  /**
  * Get family
  * @return family
  **/
  @Schema(description = "")
  public Integer getFamily() {
    return family;
  }
  public NestedIPAddress address(String address) {
    this.address = address;
    return this;
  }

  

  /**
  * IPv4 or IPv6 address (with mask)
  * @return address
  **/
  @Schema(required = true, description = "IPv4 or IPv6 address (with mask)")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedIPAddress nestedIPAddress = (NestedIPAddress) o;
    return Objects.equals(this.id, nestedIPAddress.id) &&
        Objects.equals(this.url, nestedIPAddress.url) &&
        Objects.equals(this.family, nestedIPAddress.family) &&
        Objects.equals(this.address, nestedIPAddress.address);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, url, family, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedIPAddress {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}