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
 * WritableVirtualChassis
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-11T16:11:54.626-06:00[America/Chicago]")public class WritableVirtualChassis {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("master")
  private Integer master = null;

  @SerializedName("domain")
  private String domain = null;

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
  public WritableVirtualChassis master(Integer master) {
    this.master = master;
    return this;
  }

  

  /**
  * Get master
  * @return master
  **/
  @Schema(required = true, description = "")
  public Integer getMaster() {
    return master;
  }
  public void setMaster(Integer master) {
    this.master = master;
  }
  public WritableVirtualChassis domain(String domain) {
    this.domain = domain;
    return this;
  }

  

  /**
  * Get domain
  * @return domain
  **/
  @Schema(description = "")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }
  public WritableVirtualChassis tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public WritableVirtualChassis addTagsItem(String tagsItem) {
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
    WritableVirtualChassis writableVirtualChassis = (WritableVirtualChassis) o;
    return Objects.equals(this.id, writableVirtualChassis.id) &&
        Objects.equals(this.master, writableVirtualChassis.master) &&
        Objects.equals(this.domain, writableVirtualChassis.domain) &&
        Objects.equals(this.tags, writableVirtualChassis.tags);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, master, domain, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WritableVirtualChassis {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    master: ").append(toIndentedString(master)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
