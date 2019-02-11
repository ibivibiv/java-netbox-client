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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * WritableIPAddress
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-11T16:11:54.626-06:00[America/Chicago]")public class WritableIPAddress {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("family")
  private Integer family = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("vrf")
  private Integer vrf = null;

  @SerializedName("tenant")
  private Integer tenant = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("role")
  private Integer role = null;

  @SerializedName("interface")
  private Integer _interface = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("nat_inside")
  private Integer natInside = null;

  @SerializedName("nat_outside")
  private Integer natOutside = null;

  @SerializedName("tags")
  private List<String> tags = null;

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
  /**
  * Get family
  * @return family
  **/
  @Schema(description = "")
  public Integer getFamily() {
    return family;
  }
  public WritableIPAddress address(String address) {
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
  public WritableIPAddress vrf(Integer vrf) {
    this.vrf = vrf;
    return this;
  }

  

  /**
  * Get vrf
  * @return vrf
  **/
  @Schema(description = "")
  public Integer getVrf() {
    return vrf;
  }
  public void setVrf(Integer vrf) {
    this.vrf = vrf;
  }
  public WritableIPAddress tenant(Integer tenant) {
    this.tenant = tenant;
    return this;
  }

  

  /**
  * Get tenant
  * @return tenant
  **/
  @Schema(description = "")
  public Integer getTenant() {
    return tenant;
  }
  public void setTenant(Integer tenant) {
    this.tenant = tenant;
  }
  public WritableIPAddress status(Integer status) {
    this.status = status;
    return this;
  }

  

  /**
  * The operational status of this IP
  * @return status
  **/
  @Schema(description = "The operational status of this IP")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }
  public WritableIPAddress role(Integer role) {
    this.role = role;
    return this;
  }

  

  /**
  * The functional role of this IP
  * @return role
  **/
  @Schema(description = "The functional role of this IP")
  public Integer getRole() {
    return role;
  }
  public void setRole(Integer role) {
    this.role = role;
  }
  public WritableIPAddress _interface(Integer _interface) {
    this._interface = _interface;
    return this;
  }

  

  /**
  * Get _interface
  * @return _interface
  **/
  @Schema(description = "")
  public Integer getInterface() {
    return _interface;
  }
  public void setInterface(Integer _interface) {
    this._interface = _interface;
  }
  public WritableIPAddress description(String description) {
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
  public WritableIPAddress natInside(Integer natInside) {
    this.natInside = natInside;
    return this;
  }

  

  /**
  * The IP for which this address is the \&quot;outside\&quot; IP
  * @return natInside
  **/
  @Schema(description = "The IP for which this address is the \"outside\" IP")
  public Integer getNatInside() {
    return natInside;
  }
  public void setNatInside(Integer natInside) {
    this.natInside = natInside;
  }
  public WritableIPAddress natOutside(Integer natOutside) {
    this.natOutside = natOutside;
    return this;
  }

  

  /**
  * Get natOutside
  * @return natOutside
  **/
  @Schema(required = true, description = "")
  public Integer getNatOutside() {
    return natOutside;
  }
  public void setNatOutside(Integer natOutside) {
    this.natOutside = natOutside;
  }
  public WritableIPAddress tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public WritableIPAddress addTagsItem(String tagsItem) {
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
  public WritableIPAddress customFields(Object customFields) {
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
    WritableIPAddress writableIPAddress = (WritableIPAddress) o;
    return Objects.equals(this.id, writableIPAddress.id) &&
        Objects.equals(this.family, writableIPAddress.family) &&
        Objects.equals(this.address, writableIPAddress.address) &&
        Objects.equals(this.vrf, writableIPAddress.vrf) &&
        Objects.equals(this.tenant, writableIPAddress.tenant) &&
        Objects.equals(this.status, writableIPAddress.status) &&
        Objects.equals(this.role, writableIPAddress.role) &&
        Objects.equals(this._interface, writableIPAddress._interface) &&
        Objects.equals(this.description, writableIPAddress.description) &&
        Objects.equals(this.natInside, writableIPAddress.natInside) &&
        Objects.equals(this.natOutside, writableIPAddress.natOutside) &&
        Objects.equals(this.tags, writableIPAddress.tags) &&
        Objects.equals(this.customFields, writableIPAddress.customFields) &&
        Objects.equals(this.created, writableIPAddress.created) &&
        Objects.equals(this.lastUpdated, writableIPAddress.lastUpdated);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, family, address, vrf, tenant, status, role, _interface, description, natInside, natOutside, tags, customFields, created, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WritableIPAddress {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    vrf: ").append(toIndentedString(vrf)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    natInside: ").append(toIndentedString(natInside)).append("\n");
    sb.append("    natOutside: ").append(toIndentedString(natOutside)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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