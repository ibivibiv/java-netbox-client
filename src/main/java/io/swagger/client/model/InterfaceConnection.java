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
import io.swagger.client.model.NestedInterface;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * InterfaceConnection
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-11T16:11:54.626-06:00[America/Chicago]")public class InterfaceConnection {

  @SerializedName("interface_a")
  private String interfaceA = null;

  @SerializedName("interface_b")
  private NestedInterface interfaceB = null;

  @SerializedName("connection_status")
  private Object connectionStatus = null;
  /**
  * Get interfaceA
  * @return interfaceA
  **/
  @Schema(description = "")
  public String getInterfaceA() {
    return interfaceA;
  }
  public InterfaceConnection interfaceB(NestedInterface interfaceB) {
    this.interfaceB = interfaceB;
    return this;
  }

  

  /**
  * Get interfaceB
  * @return interfaceB
  **/
  @Schema(required = true, description = "")
  public NestedInterface getInterfaceB() {
    return interfaceB;
  }
  public void setInterfaceB(NestedInterface interfaceB) {
    this.interfaceB = interfaceB;
  }
  public InterfaceConnection connectionStatus(Object connectionStatus) {
    this.connectionStatus = connectionStatus;
    return this;
  }

  

  /**
  * Get connectionStatus
  * @return connectionStatus
  **/
  @Schema(description = "")
  public Object getConnectionStatus() {
    return connectionStatus;
  }
  public void setConnectionStatus(Object connectionStatus) {
    this.connectionStatus = connectionStatus;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterfaceConnection interfaceConnection = (InterfaceConnection) o;
    return Objects.equals(this.interfaceA, interfaceConnection.interfaceA) &&
        Objects.equals(this.interfaceB, interfaceConnection.interfaceB) &&
        Objects.equals(this.connectionStatus, interfaceConnection.connectionStatus);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(interfaceA, interfaceB, connectionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterfaceConnection {\n");
    
    sb.append("    interfaceA: ").append(toIndentedString(interfaceA)).append("\n");
    sb.append("    interfaceB: ").append(toIndentedString(interfaceB)).append("\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
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