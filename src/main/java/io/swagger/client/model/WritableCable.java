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
 * WritableCable
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-11T16:11:54.626-06:00[America/Chicago]")public class WritableCable {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("termination_a_type")
  private String terminationAType = null;

  @SerializedName("termination_a_id")
  private Integer terminationAId = null;

  @SerializedName("termination_a")
  private String terminationA = null;

  @SerializedName("termination_b_type")
  private String terminationBType = null;

  @SerializedName("termination_b_id")
  private Integer terminationBId = null;

  @SerializedName("termination_b")
  private String terminationB = null;

  @SerializedName("type")
  private Integer type = null;

  @SerializedName("status")
  private Boolean status = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("color")
  private String color = null;

  @SerializedName("length")
  private Integer length = null;

  @SerializedName("length_unit")
  private Integer lengthUnit = null;
  /**
  * Get id
  * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }
  public WritableCable terminationAType(String terminationAType) {
    this.terminationAType = terminationAType;
    return this;
  }

  

  /**
  * Get terminationAType
  * @return terminationAType
  **/
  @Schema(required = true, description = "")
  public String getTerminationAType() {
    return terminationAType;
  }
  public void setTerminationAType(String terminationAType) {
    this.terminationAType = terminationAType;
  }
  public WritableCable terminationAId(Integer terminationAId) {
    this.terminationAId = terminationAId;
    return this;
  }

  

  /**
  * Get terminationAId
  * minimum: 0
  * maximum: 2147483647
  * @return terminationAId
  **/
  @Schema(required = true, description = "")
  public Integer getTerminationAId() {
    return terminationAId;
  }
  public void setTerminationAId(Integer terminationAId) {
    this.terminationAId = terminationAId;
  }
  /**
  * Get terminationA
  * @return terminationA
  **/
  @Schema(description = "")
  public String getTerminationA() {
    return terminationA;
  }
  public WritableCable terminationBType(String terminationBType) {
    this.terminationBType = terminationBType;
    return this;
  }

  

  /**
  * Get terminationBType
  * @return terminationBType
  **/
  @Schema(required = true, description = "")
  public String getTerminationBType() {
    return terminationBType;
  }
  public void setTerminationBType(String terminationBType) {
    this.terminationBType = terminationBType;
  }
  public WritableCable terminationBId(Integer terminationBId) {
    this.terminationBId = terminationBId;
    return this;
  }

  

  /**
  * Get terminationBId
  * minimum: 0
  * maximum: 2147483647
  * @return terminationBId
  **/
  @Schema(required = true, description = "")
  public Integer getTerminationBId() {
    return terminationBId;
  }
  public void setTerminationBId(Integer terminationBId) {
    this.terminationBId = terminationBId;
  }
  /**
  * Get terminationB
  * @return terminationB
  **/
  @Schema(description = "")
  public String getTerminationB() {
    return terminationB;
  }
  public WritableCable type(Integer type) {
    this.type = type;
    return this;
  }

  

  /**
  * Get type
  * @return type
  **/
  @Schema(description = "")
  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }
  public WritableCable status(Boolean status) {
    this.status = status;
    return this;
  }

  

  /**
  * Get status
  * @return status
  **/
  @Schema(description = "")
  public Boolean isStatus() {
    return status;
  }
  public void setStatus(Boolean status) {
    this.status = status;
  }
  public WritableCable label(String label) {
    this.label = label;
    return this;
  }

  

  /**
  * Get label
  * @return label
  **/
  @Schema(description = "")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }
  public WritableCable color(String color) {
    this.color = color;
    return this;
  }

  

  /**
  * Get color
  * @return color
  **/
  @Schema(description = "")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public WritableCable length(Integer length) {
    this.length = length;
    return this;
  }

  

  /**
  * Get length
  * minimum: 0
  * maximum: 32767
  * @return length
  **/
  @Schema(description = "")
  public Integer getLength() {
    return length;
  }
  public void setLength(Integer length) {
    this.length = length;
  }
  public WritableCable lengthUnit(Integer lengthUnit) {
    this.lengthUnit = lengthUnit;
    return this;
  }

  

  /**
  * Get lengthUnit
  * @return lengthUnit
  **/
  @Schema(description = "")
  public Integer getLengthUnit() {
    return lengthUnit;
  }
  public void setLengthUnit(Integer lengthUnit) {
    this.lengthUnit = lengthUnit;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WritableCable writableCable = (WritableCable) o;
    return Objects.equals(this.id, writableCable.id) &&
        Objects.equals(this.terminationAType, writableCable.terminationAType) &&
        Objects.equals(this.terminationAId, writableCable.terminationAId) &&
        Objects.equals(this.terminationA, writableCable.terminationA) &&
        Objects.equals(this.terminationBType, writableCable.terminationBType) &&
        Objects.equals(this.terminationBId, writableCable.terminationBId) &&
        Objects.equals(this.terminationB, writableCable.terminationB) &&
        Objects.equals(this.type, writableCable.type) &&
        Objects.equals(this.status, writableCable.status) &&
        Objects.equals(this.label, writableCable.label) &&
        Objects.equals(this.color, writableCable.color) &&
        Objects.equals(this.length, writableCable.length) &&
        Objects.equals(this.lengthUnit, writableCable.lengthUnit);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, terminationAType, terminationAId, terminationA, terminationBType, terminationBId, terminationB, type, status, label, color, length, lengthUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WritableCable {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    terminationAType: ").append(toIndentedString(terminationAType)).append("\n");
    sb.append("    terminationAId: ").append(toIndentedString(terminationAId)).append("\n");
    sb.append("    terminationA: ").append(toIndentedString(terminationA)).append("\n");
    sb.append("    terminationBType: ").append(toIndentedString(terminationBType)).append("\n");
    sb.append("    terminationBId: ").append(toIndentedString(terminationBId)).append("\n");
    sb.append("    terminationB: ").append(toIndentedString(terminationB)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    lengthUnit: ").append(toIndentedString(lengthUnit)).append("\n");
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