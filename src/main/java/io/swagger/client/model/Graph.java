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
 * Graph
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-11T16:11:54.626-06:00[America/Chicago]")public class Graph {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("type")
  private Object type = null;

  @SerializedName("weight")
  private Integer weight = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("link")
  private String link = null;
  /**
  * Get id
  * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }
  public Graph type(Object type) {
    this.type = type;
    return this;
  }

  

  /**
  * Get type
  * @return type
  **/
  @Schema(required = true, description = "")
  public Object getType() {
    return type;
  }
  public void setType(Object type) {
    this.type = type;
  }
  public Graph weight(Integer weight) {
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
  public Graph name(String name) {
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
  public Graph source(String source) {
    this.source = source;
    return this;
  }

  

  /**
  * Get source
  * @return source
  **/
  @Schema(required = true, description = "")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }
  public Graph link(String link) {
    this.link = link;
    return this;
  }

  

  /**
  * Get link
  * @return link
  **/
  @Schema(description = "")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Graph graph = (Graph) o;
    return Objects.equals(this.id, graph.id) &&
        Objects.equals(this.type, graph.type) &&
        Objects.equals(this.weight, graph.weight) &&
        Objects.equals(this.name, graph.name) &&
        Objects.equals(this.source, graph.source) &&
        Objects.equals(this.link, graph.link);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, type, weight, name, source, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Graph {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
