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

/**
 * WritableConfigContext
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-11T16:11:54.626-06:00[America/Chicago]")public class WritableConfigContext {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("weight")
  private Integer weight = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("regions")
  private List<Integer> regions = null;

  @SerializedName("sites")
  private List<Integer> sites = null;

  @SerializedName("roles")
  private List<Integer> roles = null;

  @SerializedName("platforms")
  private List<Integer> platforms = null;

  @SerializedName("tenant_groups")
  private List<Integer> tenantGroups = null;

  @SerializedName("tenants")
  private List<Integer> tenants = null;

  @SerializedName("data")
  private String data = null;
  /**
  * Get id
  * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }
  public WritableConfigContext name(String name) {
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
  public WritableConfigContext weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  

  /**
  * Get weight
  * minimum: 0
  * maximum: 32767
  * @return weight
  **/
  @Schema(description = "")
  public Integer getWeight() {
    return weight;
  }
  public void setWeight(Integer weight) {
    this.weight = weight;
  }
  public WritableConfigContext description(String description) {
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
  public WritableConfigContext isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  

  /**
  * Get isActive
  * @return isActive
  **/
  @Schema(description = "")
  public Boolean isIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }
  public WritableConfigContext regions(List<Integer> regions) {
    this.regions = regions;
    return this;
  }

  public WritableConfigContext addRegionsItem(Integer regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<Integer>();
    }
    this.regions.add(regionsItem);
    return this;
  }

  /**
  * Get regions
  * @return regions
  **/
  @Schema(description = "")
  public List<Integer> getRegions() {
    return regions;
  }
  public void setRegions(List<Integer> regions) {
    this.regions = regions;
  }
  public WritableConfigContext sites(List<Integer> sites) {
    this.sites = sites;
    return this;
  }

  public WritableConfigContext addSitesItem(Integer sitesItem) {
    if (this.sites == null) {
      this.sites = new ArrayList<Integer>();
    }
    this.sites.add(sitesItem);
    return this;
  }

  /**
  * Get sites
  * @return sites
  **/
  @Schema(description = "")
  public List<Integer> getSites() {
    return sites;
  }
  public void setSites(List<Integer> sites) {
    this.sites = sites;
  }
  public WritableConfigContext roles(List<Integer> roles) {
    this.roles = roles;
    return this;
  }

  public WritableConfigContext addRolesItem(Integer rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<Integer>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
  * Get roles
  * @return roles
  **/
  @Schema(description = "")
  public List<Integer> getRoles() {
    return roles;
  }
  public void setRoles(List<Integer> roles) {
    this.roles = roles;
  }
  public WritableConfigContext platforms(List<Integer> platforms) {
    this.platforms = platforms;
    return this;
  }

  public WritableConfigContext addPlatformsItem(Integer platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<Integer>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

  /**
  * Get platforms
  * @return platforms
  **/
  @Schema(description = "")
  public List<Integer> getPlatforms() {
    return platforms;
  }
  public void setPlatforms(List<Integer> platforms) {
    this.platforms = platforms;
  }
  public WritableConfigContext tenantGroups(List<Integer> tenantGroups) {
    this.tenantGroups = tenantGroups;
    return this;
  }

  public WritableConfigContext addTenantGroupsItem(Integer tenantGroupsItem) {
    if (this.tenantGroups == null) {
      this.tenantGroups = new ArrayList<Integer>();
    }
    this.tenantGroups.add(tenantGroupsItem);
    return this;
  }

  /**
  * Get tenantGroups
  * @return tenantGroups
  **/
  @Schema(description = "")
  public List<Integer> getTenantGroups() {
    return tenantGroups;
  }
  public void setTenantGroups(List<Integer> tenantGroups) {
    this.tenantGroups = tenantGroups;
  }
  public WritableConfigContext tenants(List<Integer> tenants) {
    this.tenants = tenants;
    return this;
  }

  public WritableConfigContext addTenantsItem(Integer tenantsItem) {
    if (this.tenants == null) {
      this.tenants = new ArrayList<Integer>();
    }
    this.tenants.add(tenantsItem);
    return this;
  }

  /**
  * Get tenants
  * @return tenants
  **/
  @Schema(description = "")
  public List<Integer> getTenants() {
    return tenants;
  }
  public void setTenants(List<Integer> tenants) {
    this.tenants = tenants;
  }
  public WritableConfigContext data(String data) {
    this.data = data;
    return this;
  }

  

  /**
  * Get data
  * @return data
  **/
  @Schema(required = true, description = "")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WritableConfigContext writableConfigContext = (WritableConfigContext) o;
    return Objects.equals(this.id, writableConfigContext.id) &&
        Objects.equals(this.name, writableConfigContext.name) &&
        Objects.equals(this.weight, writableConfigContext.weight) &&
        Objects.equals(this.description, writableConfigContext.description) &&
        Objects.equals(this.isActive, writableConfigContext.isActive) &&
        Objects.equals(this.regions, writableConfigContext.regions) &&
        Objects.equals(this.sites, writableConfigContext.sites) &&
        Objects.equals(this.roles, writableConfigContext.roles) &&
        Objects.equals(this.platforms, writableConfigContext.platforms) &&
        Objects.equals(this.tenantGroups, writableConfigContext.tenantGroups) &&
        Objects.equals(this.tenants, writableConfigContext.tenants) &&
        Objects.equals(this.data, writableConfigContext.data);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, weight, description, isActive, regions, sites, roles, platforms, tenantGroups, tenants, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WritableConfigContext {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    tenantGroups: ").append(toIndentedString(tenantGroups)).append("\n");
    sb.append("    tenants: ").append(toIndentedString(tenants)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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