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
import io.swagger.client.model.NestedIPAddress;
import io.swagger.client.model.NestedVirtualMachine;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * Service
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-11T16:11:54.626-06:00[America/Chicago]")public class Service {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("device")
  private NestedDevice device = null;

  @SerializedName("virtual_machine")
  private NestedVirtualMachine virtualMachine = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("protocol")
  private Object protocol = null;

  @SerializedName("ipaddresses")
  private List<NestedIPAddress> ipaddresses = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("custom_fields")
  private Object customFields = null;

  @SerializedName("created")
  private LocalDate created = null;

  @SerializedName("last_updated")
  private OffsetDateTime lastUpdated = null;
  /**
  * Get id
  * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }
  public Service device(NestedDevice device) {
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
  public Service virtualMachine(NestedVirtualMachine virtualMachine) {
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
  public Service name(String name) {
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
  public Service port(Integer port) {
    this.port = port;
    return this;
  }

  

  /**
  * Get port
  * minimum: 1
  * maximum: 65535
  * @return port
  **/
  @Schema(required = true, description = "")
  public Integer getPort() {
    return port;
  }
  public void setPort(Integer port) {
    this.port = port;
  }
  public Service protocol(Object protocol) {
    this.protocol = protocol;
    return this;
  }

  

  /**
  * Get protocol
  * @return protocol
  **/
  @Schema(required = true, description = "")
  public Object getProtocol() {
    return protocol;
  }
  public void setProtocol(Object protocol) {
    this.protocol = protocol;
  }
  public Service ipaddresses(List<NestedIPAddress> ipaddresses) {
    this.ipaddresses = ipaddresses;
    return this;
  }

  public Service addIpaddressesItem(NestedIPAddress ipaddressesItem) {
    if (this.ipaddresses == null) {
      this.ipaddresses = new ArrayList<NestedIPAddress>();
    }
    this.ipaddresses.add(ipaddressesItem);
    return this;
  }

  /**
  * Get ipaddresses
  * @return ipaddresses
  **/
  @Schema(description = "")
  public List<NestedIPAddress> getIpaddresses() {
    return ipaddresses;
  }
  public void setIpaddresses(List<NestedIPAddress> ipaddresses) {
    this.ipaddresses = ipaddresses;
  }
  public Service description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * Get description
  * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public Service customFields(Object customFields) {
    this.customFields = customFields;
    return this;
  }

  

  /**
  * Get customFields
  * @return customFields
  **/
  @Schema(description = "")
  public Object getCustomFields() {
    return customFields;
  }
  public void setCustomFields(Object customFields) {
    this.customFields = customFields;
  }
  /**
  * Get created
  * @return created
  **/
  @Schema(description = "")
  public LocalDate getCreated() {
    return created;
  }
  /**
  * Get lastUpdated
  * @return lastUpdated
  **/
  @Schema(description = "")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.id, service.id) &&
        Objects.equals(this.device, service.device) &&
        Objects.equals(this.virtualMachine, service.virtualMachine) &&
        Objects.equals(this.name, service.name) &&
        Objects.equals(this.port, service.port) &&
        Objects.equals(this.protocol, service.protocol) &&
        Objects.equals(this.ipaddresses, service.ipaddresses) &&
        Objects.equals(this.description, service.description) &&
        Objects.equals(this.customFields, service.customFields) &&
        Objects.equals(this.created, service.created) &&
        Objects.equals(this.lastUpdated, service.lastUpdated);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, device, virtualMachine, name, port, protocol, ipaddresses, description, customFields, created, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    virtualMachine: ").append(toIndentedString(virtualMachine)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    ipaddresses: ").append(toIndentedString(ipaddresses)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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