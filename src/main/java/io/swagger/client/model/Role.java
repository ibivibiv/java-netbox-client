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

/**
 * Role
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-11T16:11:54.626-06:00[America/Chicago]")public class Role {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("weight")
  private Integer weight = null;
  /**
  * Get id
  * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }
  public Role name(String name) {
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
  public Role slug(String slug) {
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
  public Role weight(Integer weight) {
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
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.id, role.id) &&
        Objects.equals(this.name, role.name) &&
        Objects.equals(this.slug, role.slug) &&
        Objects.equals(this.weight, role.weight);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, slug, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
