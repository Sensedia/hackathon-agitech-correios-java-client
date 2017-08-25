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
 * Customer Model
 */
@ApiModel(description = "Customer Model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-23T11:14:49.586Z")
public class InlineResponse200 {
  @SerializedName("nome")
  private String nome = null;

  @SerializedName("inicio")
  private String inicio = null;

  @SerializedName("fim")
  private String fim = null;

  public InlineResponse200 nome(String nome) {
    this.nome = nome;
    return this;
  }

   /**
   * Nome do municipio
   * @return nome
  **/
  @ApiModelProperty(example = "Campinas", value = "Nome do municipio")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public InlineResponse200 inicio(String inicio) {
    this.inicio = inicio;
    return this;
  }

   /**
   * inicio da faixa de CEP
   * @return inicio
  **/
  @ApiModelProperty(example = "13000001", value = "inicio da faixa de CEP")
  public String getInicio() {
    return inicio;
  }

  public void setInicio(String inicio) {
    this.inicio = inicio;
  }

  public InlineResponse200 fim(String fim) {
    this.fim = fim;
    return this;
  }

   /**
   * Fim da faixa de CEP
   * @return fim
  **/
  @ApiModelProperty(example = "13139999", value = "Fim da faixa de CEP")
  public String getFim() {
    return fim;
  }

  public void setFim(String fim) {
    this.fim = fim;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.nome, inlineResponse200.nome) &&
        Objects.equals(this.inicio, inlineResponse200.inicio) &&
        Objects.equals(this.fim, inlineResponse200.fim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, inicio, fim);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    inicio: ").append(toIndentedString(inicio)).append("\n");
    sb.append("    fim: ").append(toIndentedString(fim)).append("\n");
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

