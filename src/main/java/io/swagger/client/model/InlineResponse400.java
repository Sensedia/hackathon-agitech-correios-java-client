/*
 * API dos Correios
 * API de rastreios de Objetos Postais
 *
 * OpenAPI spec version: 1.0
 * 
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse400
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T11:14:49.586Z")
public class InlineResponse400 {
  @SerializedName("resultado")
  private String resultado = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("detalhes")
  private String detalhes = null;

  public InlineResponse400 resultado(String resultado) {
    this.resultado = resultado;
    return this;
  }

   /**
   * Get resultado
   * @return resultado
  **/
  @ApiModelProperty(value = "")
  public String getResultado() {
    return resultado;
  }

  public void setResultado(String resultado) {
    this.resultado = resultado;
  }

  public InlineResponse400 status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse400 detalhes(String detalhes) {
    this.detalhes = detalhes;
    return this;
  }

   /**
   * Get detalhes
   * @return detalhes
  **/
  @ApiModelProperty(value = "")
  public String getDetalhes() {
    return detalhes;
  }

  public void setDetalhes(String detalhes) {
    this.detalhes = detalhes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse400 inlineResponse400 = (InlineResponse400) o;
    return Objects.equals(this.resultado, inlineResponse400.resultado) &&
        Objects.equals(this.status, inlineResponse400.status) &&
        Objects.equals(this.detalhes, inlineResponse400.detalhes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultado, status, detalhes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400 {\n");
    
    sb.append("    resultado: ").append(toIndentedString(resultado)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detalhes: ").append(toIndentedString(detalhes)).append("\n");
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

