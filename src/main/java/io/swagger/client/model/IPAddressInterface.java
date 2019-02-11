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
import io.swagger.client.model.NestedDevice;
import io.swagger.client.model.NestedVirtualMachine;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * IPAddressInterface
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-11T16:11:54.626-06:00[America/Chicago]")public class IPAddressInterface {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("device")
  private NestedDevice device = null;

  @SerializedName("virtual_machine")
  private NestedVirtualMachine virtualMachine = null;

  @SerializedName("name")
  private String name = null;
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
  public IPAddressInterface device(NestedDevice device) {
    this.device = device;
    return this;
  }

  

  /**
  * Get device
  * @return device
  **/
  @Schema(description = "")
  public NestedDevice getDevice() {
    return device;
  }
  public void setDevice(NestedDevice device) {
    this.device = device;
  }
  public IPAddressInterface virtualMachine(NestedVirtualMachine virtualMachine) {
    this.virtualMachine = virtualMachine;
    return this;
  }

  

  /**
  * Get virtualMachine
  * @return virtualMachine
  **/
  @Schema(description = "")
  public NestedVirtualMachine getVirtualMachine() {
    return virtualMachine;
  }
  public void setVirtualMachine(NestedVirtualMachine virtualMachine) {
    this.virtualMachine = virtualMachine;
  }
  public IPAddressInterface name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * Get name
  * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAddressInterface ipAddressInterface = (IPAddressInterface) o;
    return Objects.equals(this.id, ipAddressInterface.id) &&
        Objects.equals(this.url, ipAddressInterface.url) &&
        Objects.equals(this.device, ipAddressInterface.device) &&
        Objects.equals(this.virtualMachine, ipAddressInterface.virtualMachine) &&
        Objects.equals(this.name, ipAddressInterface.name);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, url, device, virtualMachine, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAddressInterface {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    virtualMachine: ").append(toIndentedString(virtualMachine)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
