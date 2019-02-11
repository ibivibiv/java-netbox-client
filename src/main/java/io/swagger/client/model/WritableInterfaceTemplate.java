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
 * WritableInterfaceTemplate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-11T16:11:54.626-06:00[America/Chicago]")public class WritableInterfaceTemplate {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("device_type")
  private Integer deviceType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("form_factor")
  private Integer formFactor = null;

  @SerializedName("mgmt_only")
  private Boolean mgmtOnly = null;
  /**
  * Get id
  * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }
  public WritableInterfaceTemplate deviceType(Integer deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  

  /**
  * Get deviceType
  * @return deviceType
  **/
  @Schema(required = true, description = "")
  public Integer getDeviceType() {
    return deviceType;
  }
  public void setDeviceType(Integer deviceType) {
    this.deviceType = deviceType;
  }
  public WritableInterfaceTemplate name(String name) {
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
  public WritableInterfaceTemplate formFactor(Integer formFactor) {
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
  public WritableInterfaceTemplate mgmtOnly(Boolean mgmtOnly) {
    this.mgmtOnly = mgmtOnly;
    return this;
  }

  

  /**
  * Get mgmtOnly
  * @return mgmtOnly
  **/
  @Schema(description = "")
  public Boolean isMgmtOnly() {
    return mgmtOnly;
  }
  public void setMgmtOnly(Boolean mgmtOnly) {
    this.mgmtOnly = mgmtOnly;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WritableInterfaceTemplate writableInterfaceTemplate = (WritableInterfaceTemplate) o;
    return Objects.equals(this.id, writableInterfaceTemplate.id) &&
        Objects.equals(this.deviceType, writableInterfaceTemplate.deviceType) &&
        Objects.equals(this.name, writableInterfaceTemplate.name) &&
        Objects.equals(this.formFactor, writableInterfaceTemplate.formFactor) &&
        Objects.equals(this.mgmtOnly, writableInterfaceTemplate.mgmtOnly);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, deviceType, name, formFactor, mgmtOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WritableInterfaceTemplate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    formFactor: ").append(toIndentedString(formFactor)).append("\n");
    sb.append("    mgmtOnly: ").append(toIndentedString(mgmtOnly)).append("\n");
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
