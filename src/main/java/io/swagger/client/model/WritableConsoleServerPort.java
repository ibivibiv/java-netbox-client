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
import io.swagger.client.model.NestedCable;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WritableConsoleServerPort
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-11T16:11:54.626-06:00[America/Chicago]")public class WritableConsoleServerPort {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("device")
  private Integer device = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("connected_endpoint_type")
  private String connectedEndpointType = null;

  @SerializedName("connected_endpoint")
  private String connectedEndpoint = null;

  @SerializedName("connection_status")
  private Boolean connectionStatus = null;

  @SerializedName("cable")
  private NestedCable cable = null;

  @SerializedName("tags")
  private List<String> tags = null;
  /**
  * Get id
  * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }
  public WritableConsoleServerPort device(Integer device) {
    this.device = device;
    return this;
  }

  

  /**
  * Get device
  * @return device
  **/
  @Schema(required = true, description = "")
  public Integer getDevice() {
    return device;
  }
  public void setDevice(Integer device) {
    this.device = device;
  }
  public WritableConsoleServerPort name(String name) {
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
  /**
  * Get connectedEndpointType
  * @return connectedEndpointType
  **/
  @Schema(description = "")
  public String getConnectedEndpointType() {
    return connectedEndpointType;
  }
  /**
  * Get connectedEndpoint
  * @return connectedEndpoint
  **/
  @Schema(description = "")
  public String getConnectedEndpoint() {
    return connectedEndpoint;
  }
  public WritableConsoleServerPort connectionStatus(Boolean connectionStatus) {
    this.connectionStatus = connectionStatus;
    return this;
  }

  

  /**
  * Get connectionStatus
  * @return connectionStatus
  **/
  @Schema(description = "")
  public Boolean isConnectionStatus() {
    return connectionStatus;
  }
  public void setConnectionStatus(Boolean connectionStatus) {
    this.connectionStatus = connectionStatus;
  }
  public WritableConsoleServerPort cable(NestedCable cable) {
    this.cable = cable;
    return this;
  }

  

  /**
  * Get cable
  * @return cable
  **/
  @Schema(description = "")
  public NestedCable getCable() {
    return cable;
  }
  public void setCable(NestedCable cable) {
    this.cable = cable;
  }
  public WritableConsoleServerPort tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public WritableConsoleServerPort addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
  * Get tags
  * @return tags
  **/
  @Schema(description = "")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WritableConsoleServerPort writableConsoleServerPort = (WritableConsoleServerPort) o;
    return Objects.equals(this.id, writableConsoleServerPort.id) &&
        Objects.equals(this.device, writableConsoleServerPort.device) &&
        Objects.equals(this.name, writableConsoleServerPort.name) &&
        Objects.equals(this.connectedEndpointType, writableConsoleServerPort.connectedEndpointType) &&
        Objects.equals(this.connectedEndpoint, writableConsoleServerPort.connectedEndpoint) &&
        Objects.equals(this.connectionStatus, writableConsoleServerPort.connectionStatus) &&
        Objects.equals(this.cable, writableConsoleServerPort.cable) &&
        Objects.equals(this.tags, writableConsoleServerPort.tags);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, device, name, connectedEndpointType, connectedEndpoint, connectionStatus, cable, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WritableConsoleServerPort {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    connectedEndpointType: ").append(toIndentedString(connectedEndpointType)).append("\n");
    sb.append("    connectedEndpoint: ").append(toIndentedString(connectedEndpoint)).append("\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
    sb.append("    cable: ").append(toIndentedString(cable)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
