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
import io.swagger.client.model.NestedRole;
import io.swagger.client.model.NestedSite;
import io.swagger.client.model.NestedTenant;
import io.swagger.client.model.NestedVLANGroup;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * VLAN
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-11T16:11:54.626-06:00[America/Chicago]")public class VLAN {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("site")
  private NestedSite site = null;

  @SerializedName("group")
  private NestedVLANGroup group = null;

  @SerializedName("vid")
  private Integer vid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tenant")
  private NestedTenant tenant = null;

  @SerializedName("status")
  private Object status = null;

  @SerializedName("role")
  private NestedRole role = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("display_name")
  private String displayName = null;

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
  public VLAN site(NestedSite site) {
    this.site = site;
    return this;
  }

  

  /**
  * Get site
  * @return site
  **/
  @Schema(description = "")
  public NestedSite getSite() {
    return site;
  }
  public void setSite(NestedSite site) {
    this.site = site;
  }
  public VLAN group(NestedVLANGroup group) {
    this.group = group;
    return this;
  }

  

  /**
  * Get group
  * @return group
  **/
  @Schema(description = "")
  public NestedVLANGroup getGroup() {
    return group;
  }
  public void setGroup(NestedVLANGroup group) {
    this.group = group;
  }
  public VLAN vid(Integer vid) {
    this.vid = vid;
    return this;
  }

  

  /**
  * Get vid
  * minimum: 1
  * maximum: 4094
  * @return vid
  **/
  @Schema(required = true, description = "")
  public Integer getVid() {
    return vid;
  }
  public void setVid(Integer vid) {
    this.vid = vid;
  }
  public VLAN name(String name) {
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
  public VLAN tenant(NestedTenant tenant) {
    this.tenant = tenant;
    return this;
  }

  

  /**
  * Get tenant
  * @return tenant
  **/
  @Schema(description = "")
  public NestedTenant getTenant() {
    return tenant;
  }
  public void setTenant(NestedTenant tenant) {
    this.tenant = tenant;
  }
  public VLAN status(Object status) {
    this.status = status;
    return this;
  }

  

  /**
  * Get status
  * @return status
  **/
  @Schema(description = "")
  public Object getStatus() {
    return status;
  }
  public void setStatus(Object status) {
    this.status = status;
  }
  public VLAN role(NestedRole role) {
    this.role = role;
    return this;
  }

  

  /**
  * Get role
  * @return role
  **/
  @Schema(description = "")
  public NestedRole getRole() {
    return role;
  }
  public void setRole(NestedRole role) {
    this.role = role;
  }
  public VLAN description(String description) {
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
  public VLAN tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public VLAN addTagsItem(String tagsItem) {
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
  * Get displayName
  * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }
  public VLAN customFields(Object customFields) {
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
    VLAN VLAN = (VLAN) o;
    return Objects.equals(this.id, VLAN.id) &&
        Objects.equals(this.site, VLAN.site) &&
        Objects.equals(this.group, VLAN.group) &&
        Objects.equals(this.vid, VLAN.vid) &&
        Objects.equals(this.name, VLAN.name) &&
        Objects.equals(this.tenant, VLAN.tenant) &&
        Objects.equals(this.status, VLAN.status) &&
        Objects.equals(this.role, VLAN.role) &&
        Objects.equals(this.description, VLAN.description) &&
        Objects.equals(this.tags, VLAN.tags) &&
        Objects.equals(this.displayName, VLAN.displayName) &&
        Objects.equals(this.customFields, VLAN.customFields) &&
        Objects.equals(this.created, VLAN.created) &&
        Objects.equals(this.lastUpdated, VLAN.lastUpdated);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, site, group, vid, name, tenant, status, role, description, tags, displayName, customFields, created, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VLAN {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
