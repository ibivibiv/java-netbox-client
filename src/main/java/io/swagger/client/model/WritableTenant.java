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
 * WritableTenant
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-11T16:11:54.626-06:00[America/Chicago]")public class WritableTenant {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("group")
  private Integer group = null;

  @SerializedName("description")
  private String description = null;

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
  /**
  * Get id
  * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }
  public WritableTenant name(String name) {
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
  public WritableTenant slug(String slug) {
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
  public WritableTenant group(Integer group) {
    this.group = group;
    return this;
  }

  

  /**
  * Get group
  * @return group
  **/
  @Schema(description = "")
  public Integer getGroup() {
    return group;
  }
  public void setGroup(Integer group) {
    this.group = group;
  }
  public WritableTenant description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * Long-form name (optional)
  * @return description
  **/
  @Schema(description = "Long-form name (optional)")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public WritableTenant comments(String comments) {
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
  public WritableTenant tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public WritableTenant addTagsItem(String tagsItem) {
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
  public WritableTenant customFields(Object customFields) {
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
    WritableTenant writableTenant = (WritableTenant) o;
    return Objects.equals(this.id, writableTenant.id) &&
        Objects.equals(this.name, writableTenant.name) &&
        Objects.equals(this.slug, writableTenant.slug) &&
        Objects.equals(this.group, writableTenant.group) &&
        Objects.equals(this.description, writableTenant.description) &&
        Objects.equals(this.comments, writableTenant.comments) &&
        Objects.equals(this.tags, writableTenant.tags) &&
        Objects.equals(this.customFields, writableTenant.customFields) &&
        Objects.equals(this.created, writableTenant.created) &&
        Objects.equals(this.lastUpdated, writableTenant.lastUpdated);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, slug, group, description, comments, tags, customFields, created, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WritableTenant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
