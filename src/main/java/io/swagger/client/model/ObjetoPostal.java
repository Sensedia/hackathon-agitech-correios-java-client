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
import io.swagger.client.model.ObjetosEventos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Postal Object model
 */
@ApiModel(description = "Postal Object model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T11:14:49.586Z")
public class ObjetoPostal {
  @SerializedName("numero")
  private String numero = null;

  @SerializedName("eventos")
  private List<ObjetosEventos> eventos = null;

  public ObjetoPostal numero(String numero) {
    this.numero = numero;
    return this;
  }

   /**
   * Número do Objeto Postal
   * @return numero
  **/
  @ApiModelProperty(example = "PL177497655BR", value = "Número do Objeto Postal")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public ObjetoPostal eventos(List<ObjetosEventos> eventos) {
    this.eventos = eventos;
    return this;
  }

  public ObjetoPostal addEventosItem(ObjetosEventos eventosItem) {
    if (this.eventos == null) {
      this.eventos = new ArrayList<ObjetosEventos>();
    }
    this.eventos.add(eventosItem);
    return this;
  }

   /**
   * Get eventos
   * @return eventos
  **/
  @ApiModelProperty(value = "")
  public List<ObjetosEventos> getEventos() {
    return eventos;
  }

  public void setEventos(List<ObjetosEventos> eventos) {
    this.eventos = eventos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjetoPostal objetoPostal = (ObjetoPostal) o;
    return Objects.equals(this.numero, objetoPostal.numero) &&
        Objects.equals(this.eventos, objetoPostal.eventos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numero, eventos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjetoPostal {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    eventos: ").append(toIndentedString(eventos)).append("\n");
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
