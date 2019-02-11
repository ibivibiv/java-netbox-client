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
 * ExportTemplate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-11T16:11:54.626-06:00[America/Chicago]")public class ExportTemplate {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("content_type")
  private Integer contentType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("template_code")
  private String templateCode = null;

  @SerializedName("mime_type")
  private String mimeType = null;

  @SerializedName("file_extension")
  private String fileExtension = null;
  /**
  * Get id
  * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }
  public ExportTemplate contentType(Integer contentType) {
    this.contentType = contentType;
    return this;
  }

  

  /**
  * Get contentType
  * @return contentType
  **/
  @Schema(required = true, description = "")
  public Integer getContentType() {
    return contentType;
  }
  public void setContentType(Integer contentType) {
    this.contentType = contentType;
  }
  public ExportTemplate name(String name) {
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
  public ExportTemplate description(String description) {
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
  public ExportTemplate templateCode(String templateCode) {
    this.templateCode = templateCode;
    return this;
  }

  

  /**
  * Get templateCode
  * @return templateCode
  **/
  @Schema(required = true, description = "")
  public String getTemplateCode() {
    return templateCode;
  }
  public void setTemplateCode(String templateCode) {
    this.templateCode = templateCode;
  }
  public ExportTemplate mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  

  /**
  * Get mimeType
  * @return mimeType
  **/
  @Schema(description = "")
  public String getMimeType() {
    return mimeType;
  }
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }
  public ExportTemplate fileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }

  

  /**
  * Get fileExtension
  * @return fileExtension
  **/
  @Schema(description = "")
  public String getFileExtension() {
    return fileExtension;
  }
  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportTemplate exportTemplate = (ExportTemplate) o;
    return Objects.equals(this.id, exportTemplate.id) &&
        Objects.equals(this.contentType, exportTemplate.contentType) &&
        Objects.equals(this.name, exportTemplate.name) &&
        Objects.equals(this.description, exportTemplate.description) &&
        Objects.equals(this.templateCode, exportTemplate.templateCode) &&
        Objects.equals(this.mimeType, exportTemplate.mimeType) &&
        Objects.equals(this.fileExtension, exportTemplate.fileExtension);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, contentType, name, description, templateCode, mimeType, fileExtension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportTemplate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    templateCode: ").append(toIndentedString(templateCode)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
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
