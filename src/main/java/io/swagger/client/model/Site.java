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
import io.swagger.client.model.NestedRegion;
import io.swagger.client.model.NestedTenant;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * Site
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-11T16:11:54.626-06:00[America/Chicago]")public class Site {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("status")
  private Object status = null;

  @SerializedName("region")
  private NestedRegion region = null;

  @SerializedName("tenant")
  private NestedTenant tenant = null;

  @SerializedName("facility")
  private String facility = null;

  @SerializedName("asn")
  private Integer asn = null;

  @SerializedName("time_zone")
  private String timeZone = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("physical_address")
  private String physicalAddress = null;

  @SerializedName("shipping_address")
  private String shippingAddress = null;

  @SerializedName("latitude")
  private String latitude = null;

  @SerializedName("longitude")
  private String longitude = null;

  @SerializedName("contact_name")
  private String contactName = null;

  @SerializedName("contact_phone")
  private String contactPhone = null;

  @SerializedName("contact_email")
  private String contactEmail = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("custom_fields")
  private Object customFields = null;

  @SerializedName("created")
  private LocalDate created = null;

  @SerializedName("last_updated")
  private OffsetDateTime lastUpdated = null;

  @SerializedName("count_prefixes")
  private Integer countPrefixes = null;

  @SerializedName("count_vlans")
  private Integer countVlans = null;

  @SerializedName("count_racks")
  private Integer countRacks = null;

  @SerializedName("count_devices")
  private Integer countDevices = null;

  @SerializedName("count_circuits")
  private Integer countCircuits = null;
  /**
  * Get id
  * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }
  public Site name(String name) {
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
  public Site slug(String slug) {
    this.slug = slug;
    return this;
  }

  

  /**
  * Get slug
  * @return slug
  **/
  @Schema(required = true, description = "")
  public String getSlug() {
    return slug;
  }
  public void setSlug(String slug) {
    this.slug = slug;
  }
  public Site status(Object status) {
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
  public Site region(NestedRegion region) {
    this.region = region;
    return this;
  }

  

  /**
  * Get region
  * @return region
  **/
  @Schema(description = "")
  public NestedRegion getRegion() {
    return region;
  }
  public void setRegion(NestedRegion region) {
    this.region = region;
  }
  public Site tenant(NestedTenant tenant) {
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
  public Site facility(String facility) {
    this.facility = facility;
    return this;
  }

  

  /**
  * Get facility
  * @return facility
  **/
  @Schema(description = "")
  public String getFacility() {
    return facility;
  }
  public void setFacility(String facility) {
    this.facility = facility;
  }
  public Site asn(Integer asn) {
    this.asn = asn;
    return this;
  }

  

  /**
  * Get asn
  * minimum: 1
  * maximum: 4294967295
  * @return asn
  **/
  @Schema(description = "")
  public Integer getAsn() {
    return asn;
  }
  public void setAsn(Integer asn) {
    this.asn = asn;
  }
  public Site timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  

  /**
  * Get timeZone
  * @return timeZone
  **/
  @Schema(description = "")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }
  public Site description(String description) {
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
  public Site physicalAddress(String physicalAddress) {
    this.physicalAddress = physicalAddress;
    return this;
  }

  

  /**
  * Get physicalAddress
  * @return physicalAddress
  **/
  @Schema(description = "")
  public String getPhysicalAddress() {
    return physicalAddress;
  }
  public void setPhysicalAddress(String physicalAddress) {
    this.physicalAddress = physicalAddress;
  }
  public Site shippingAddress(String shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

  

  /**
  * Get shippingAddress
  * @return shippingAddress
  **/
  @Schema(description = "")
  public String getShippingAddress() {
    return shippingAddress;
  }
  public void setShippingAddress(String shippingAddress) {
    this.shippingAddress = shippingAddress;
  }
  public Site latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  

  /**
  * Get latitude
  * @return latitude
  **/
  @Schema(description = "")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }
  public Site longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  

  /**
  * Get longitude
  * @return longitude
  **/
  @Schema(description = "")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }
  public Site contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

  

  /**
  * Get contactName
  * @return contactName
  **/
  @Schema(description = "")
  public String getContactName() {
    return contactName;
  }
  public void setContactName(String contactName) {
    this.contactName = contactName;
  }
  public Site contactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
    return this;
  }

  

  /**
  * Get contactPhone
  * @return contactPhone
  **/
  @Schema(description = "")
  public String getContactPhone() {
    return contactPhone;
  }
  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }
  public Site contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

  

  /**
  * Get contactEmail
  * @return contactEmail
  **/
  @Schema(description = "")
  public String getContactEmail() {
    return contactEmail;
  }
  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }
  public Site comments(String comments) {
    this.comments = comments;
    return this;
  }

  

  /**
  * Get comments
  * @return comments
  **/
  @Schema(description = "")
  public String getComments() {
    return comments;
  }
  public void setComments(String comments) {
    this.comments = comments;
  }
  public Site tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Site addTagsItem(String tagsItem) {
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
  public Site customFields(Object customFields) {
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
  /**
  * Get countPrefixes
  * @return countPrefixes
  **/
  @Schema(description = "")
  public Integer getCountPrefixes() {
    return countPrefixes;
  }
  /**
  * Get countVlans
  * @return countVlans
  **/
  @Schema(description = "")
  public Integer getCountVlans() {
    return countVlans;
  }
  /**
  * Get countRacks
  * @return countRacks
  **/
  @Schema(description = "")
  public Integer getCountRacks() {
    return countRacks;
  }
  /**
  * Get countDevices
  * @return countDevices
  **/
  @Schema(description = "")
  public Integer getCountDevices() {
    return countDevices;
  }
  /**
  * Get countCircuits
  * @return countCircuits
  **/
  @Schema(description = "")
  public Integer getCountCircuits() {
    return countCircuits;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Site site = (Site) o;
    return Objects.equals(this.id, site.id) &&
        Objects.equals(this.name, site.name) &&
        Objects.equals(this.slug, site.slug) &&
        Objects.equals(this.status, site.status) &&
        Objects.equals(this.region, site.region) &&
        Objects.equals(this.tenant, site.tenant) &&
        Objects.equals(this.facility, site.facility) &&
        Objects.equals(this.asn, site.asn) &&
        Objects.equals(this.timeZone, site.timeZone) &&
        Objects.equals(this.description, site.description) &&
        Objects.equals(this.physicalAddress, site.physicalAddress) &&
        Objects.equals(this.shippingAddress, site.shippingAddress) &&
        Objects.equals(this.latitude, site.latitude) &&
        Objects.equals(this.longitude, site.longitude) &&
        Objects.equals(this.contactName, site.contactName) &&
        Objects.equals(this.contactPhone, site.contactPhone) &&
        Objects.equals(this.contactEmail, site.contactEmail) &&
        Objects.equals(this.comments, site.comments) &&
        Objects.equals(this.tags, site.tags) &&
        Objects.equals(this.customFields, site.customFields) &&
        Objects.equals(this.created, site.created) &&
        Objects.equals(this.lastUpdated, site.lastUpdated) &&
        Objects.equals(this.countPrefixes, site.countPrefixes) &&
        Objects.equals(this.countVlans, site.countVlans) &&
        Objects.equals(this.countRacks, site.countRacks) &&
        Objects.equals(this.countDevices, site.countDevices) &&
        Objects.equals(this.countCircuits, site.countCircuits);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, slug, status, region, tenant, facility, asn, timeZone, description, physicalAddress, shippingAddress, latitude, longitude, contactName, contactPhone, contactEmail, comments, tags, customFields, created, lastUpdated, countPrefixes, countVlans, countRacks, countDevices, countCircuits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Site {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    facility: ").append(toIndentedString(facility)).append("\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    physicalAddress: ").append(toIndentedString(physicalAddress)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    countPrefixes: ").append(toIndentedString(countPrefixes)).append("\n");
    sb.append("    countVlans: ").append(toIndentedString(countVlans)).append("\n");
    sb.append("    countRacks: ").append(toIndentedString(countRacks)).append("\n");
    sb.append("    countDevices: ").append(toIndentedString(countDevices)).append("\n");
    sb.append("    countCircuits: ").append(toIndentedString(countCircuits)).append("\n");
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