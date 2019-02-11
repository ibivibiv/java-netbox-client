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
 * WritableInterface
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-11T16:11:54.626-06:00[America/Chicago]")public class WritableInterface {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("device")
  private Integer device = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("form_factor")
  private Integer formFactor = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("lag")
  private Integer lag = null;

  @SerializedName("mtu")
  private Integer mtu = null;

  @SerializedName("mac_address")
  private String macAddress = null;

  @SerializedName("mgmt_only")
  private Boolean mgmtOnly = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("connected_endpoint_type")
  private String connectedEndpointType = null;

  @SerializedName("connected_endpoint")
  private String connectedEndpoint = null;

  @SerializedName("connection_status")
  private Boolean connectionStatus = null;

  @SerializedName("cable")
  private NestedCable cable = null;

  @SerializedName("mode")
  private Integer mode = null;

  @SerializedName("untagged_vlan")
  private Integer untaggedVlan = null;

  @SerializedName("tagged_vlans")
  private List<Integer> taggedVlans = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("count_ipaddresses")
  private String countIpaddresses = null;
  /**
  * Get id
  * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }
  public WritableInterface device(Integer device) {
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
  public WritableInterface name(String name) {
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
  public WritableInterface formFactor(Integer formFactor) {
    this.formFactor = formFactor;
    return this;
  }

  

  /**
  * Get formFactor
  * @return formFactor
  **/
  @Schema(description = "")
  public Integer getFormFactor() {
    return formFactor;
  }
  public void setFormFactor(Integer formFactor) {
    this.formFactor = formFactor;
  }
  public WritableInterface enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  

  /**
  * Get enabled
  * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public WritableInterface lag(Integer lag) {
    this.lag = lag;
    return this;
  }

  

  /**
  * Get lag
  * @return lag
  **/
  @Schema(description = "")
  public Integer getLag() {
    return lag;
  }
  public void setLag(Integer lag) {
    this.lag = lag;
  }
  public WritableInterface mtu(Integer mtu) {
    this.mtu = mtu;
    return this;
  }

  

  /**
  * Get mtu
  * minimum: 1
  * maximum: 65536
  * @return mtu
  **/
  @Schema(description = "")
  public Integer getMtu() {
    return mtu;
  }
  public void setMtu(Integer mtu) {
    this.mtu = mtu;
  }
  public WritableInterface macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  

  /**
  * Get macAddress
  * @return macAddress
  **/
  @Schema(description = "")
  public String getMacAddress() {
    return macAddress;
  }
  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }
  public WritableInterface mgmtOnly(Boolean mgmtOnly) {
    this.mgmtOnly = mgmtOnly;
    return this;
  }

  

  /**
  * This interface is used only for out-of-band management
  * @return mgmtOnly
  **/
  @Schema(description = "This interface is used only for out-of-band management")
  public Boolean isMgmtOnly() {
    return mgmtOnly;
  }
  public void setMgmtOnly(Boolean mgmtOnly) {
    this.mgmtOnly = mgmtOnly;
  }
  public WritableInterface description(String description) {
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
  public WritableInterface connectionStatus(Boolean connectionStatus) {
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
  public WritableInterface cable(NestedCable cable) {
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
  public WritableInterface mode(Integer mode) {
    this.mode = mode;
    return this;
  }

  

  /**
  * Get mode
  * @return mode
  **/
  @Schema(description = "")
  public Integer getMode() {
    return mode;
  }
  public void setMode(Integer mode) {
    this.mode = mode;
  }
  public WritableInterface untaggedVlan(Integer untaggedVlan) {
    this.untaggedVlan = untaggedVlan;
    return this;
  }

  

  /**
  * Get untaggedVlan
  * @return untaggedVlan
  **/
  @Schema(description = "")
  public Integer getUntaggedVlan() {
    return untaggedVlan;
  }
  public void setUntaggedVlan(Integer untaggedVlan) {
    this.untaggedVlan = untaggedVlan;
  }
  public WritableInterface taggedVlans(List<Integer> taggedVlans) {
    this.taggedVlans = taggedVlans;
    return this;
  }

  public WritableInterface addTaggedVlansItem(Integer taggedVlansItem) {
    if (this.taggedVlans == null) {
      this.taggedVlans = new ArrayList<Integer>();
    }
    this.taggedVlans.add(taggedVlansItem);
    return this;
  }

  /**
  * Get taggedVlans
  * @return taggedVlans
  **/
  @Schema(description = "")
  public List<Integer> getTaggedVlans() {
    return taggedVlans;
  }
  public void setTaggedVlans(List<Integer> taggedVlans) {
    this.taggedVlans = taggedVlans;
  }
  public WritableInterface tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public WritableInterface addTagsItem(String tagsItem) {
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
  /**
  * Get countIpaddresses
  * @return countIpaddresses
  **/
  @Schema(description = "")
  public String getCountIpaddresses() {
    return countIpaddresses;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WritableInterface writableInterface = (WritableInterface) o;
    return Objects.equals(this.id, writableInterface.id) &&
        Objects.equals(this.device, writableInterface.device) &&
        Objects.equals(this.name, writableInterface.name) &&
        Objects.equals(this.formFactor, writableInterface.formFactor) &&
        Objects.equals(this.enabled, writableInterface.enabled) &&
        Objects.equals(this.lag, writableInterface.lag) &&
        Objects.equals(this.mtu, writableInterface.mtu) &&
        Objects.equals(this.macAddress, writableInterface.macAddress) &&
        Objects.equals(this.mgmtOnly, writableInterface.mgmtOnly) &&
        Objects.equals(this.description, writableInterface.description) &&
        Objects.equals(this.connectedEndpointType, writableInterface.connectedEndpointType) &&
        Objects.equals(this.connectedEndpoint, writableInterface.connectedEndpoint) &&
        Objects.equals(this.connectionStatus, writableInterface.connectionStatus) &&
        Objects.equals(this.cable, writableInterface.cable) &&
        Objects.equals(this.mode, writableInterface.mode) &&
        Objects.equals(this.untaggedVlan, writableInterface.untaggedVlan) &&
        Objects.equals(this.taggedVlans, writableInterface.taggedVlans) &&
        Objects.equals(this.tags, writableInterface.tags) &&
        Objects.equals(this.countIpaddresses, writableInterface.countIpaddresses);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, device, name, formFactor, enabled, lag, mtu, macAddress, mgmtOnly, description, connectedEndpointType, connectedEndpoint, connectionStatus, cable, mode, untaggedVlan, taggedVlans, tags, countIpaddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WritableInterface {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    formFactor: ").append(toIndentedString(formFactor)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    lag: ").append(toIndentedString(lag)).append("\n");
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    mgmtOnly: ").append(toIndentedString(mgmtOnly)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    connectedEndpointType: ").append(toIndentedString(connectedEndpointType)).append("\n");
    sb.append("    connectedEndpoint: ").append(toIndentedString(connectedEndpoint)).append("\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
    sb.append("    cable: ").append(toIndentedString(cable)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    untaggedVlan: ").append(toIndentedString(untaggedVlan)).append("\n");
    sb.append("    taggedVlans: ").append(toIndentedString(taggedVlans)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    countIpaddresses: ").append(toIndentedString(countIpaddresses)).append("\n");
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