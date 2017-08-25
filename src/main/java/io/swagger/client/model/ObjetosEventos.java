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
public class ObjetosEventos {
  @SerializedName("codigoObjeto")
  private String codigoObjeto = null;

  @SerializedName("tipoEvento")
  private String tipoEvento = null;

  @SerializedName("statusEvento")
  private Integer statusEvento = null;

  @SerializedName("descricaoEvento")
  private String descricaoEvento = null;

  @SerializedName("nomeUnidade")
  private String nomeUnidade = null;

  @SerializedName("codigoSRO")
  private String codigoSRO = null;

  @SerializedName("municipio")
  private String municipio = null;

  @SerializedName("uf")
  private String uf = null;

  @SerializedName("codigoMCU")
  private String codigoMCU = null;

  @SerializedName("codigoDR")
  private String codigoDR = null;

  @SerializedName("siglaDR")
  private String siglaDR = null;

  @SerializedName("numeroLista")
  private String numeroLista = null;

  @SerializedName("estacao")
  private Integer estacao = null;

  @SerializedName("usuario")
  private String usuario = null;

  @SerializedName("dataGravacao")
  private String dataGravacao = null;

  @SerializedName("entregador")
  private String entregador = null;

  @SerializedName("dataCriacao")
  private String dataCriacao = null;

  @SerializedName("acaoBloqueio")
  private Integer acaoBloqueio = null;

  public ObjetosEventos codigoObjeto(String codigoObjeto) {
    this.codigoObjeto = codigoObjeto;
    return this;
  }

   /**
   * Código do Objeto
   * @return codigoObjeto
  **/
  @ApiModelProperty(example = "PL177497655BR", value = "Código do Objeto")
  public String getCodigoObjeto() {
    return codigoObjeto;
  }

  public void setCodigoObjeto(String codigoObjeto) {
    this.codigoObjeto = codigoObjeto;
  }

  public ObjetosEventos tipoEvento(String tipoEvento) {
    this.tipoEvento = tipoEvento;
    return this;
  }

   /**
   * Tipo do Evento
   * @return tipoEvento
  **/
  @ApiModelProperty(example = "OEC", value = "Tipo do Evento")
  public String getTipoEvento() {
    return tipoEvento;
  }

  public void setTipoEvento(String tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  public ObjetosEventos statusEvento(Integer statusEvento) {
    this.statusEvento = statusEvento;
    return this;
  }

   /**
   * Status do Evento
   * @return statusEvento
  **/
  @ApiModelProperty(example = "1", value = "Status do Evento")
  public Integer getStatusEvento() {
    return statusEvento;
  }

  public void setStatusEvento(Integer statusEvento) {
    this.statusEvento = statusEvento;
  }

  public ObjetosEventos descricaoEvento(String descricaoEvento) {
    this.descricaoEvento = descricaoEvento;
    return this;
  }

   /**
   * Descrição do Evento
   * @return descricaoEvento
  **/
  @ApiModelProperty(example = "Saiu para entrega ao destinatário", value = "Descrição do Evento")
  public String getDescricaoEvento() {
    return descricaoEvento;
  }

  public void setDescricaoEvento(String descricaoEvento) {
    this.descricaoEvento = descricaoEvento;
  }

  public ObjetosEventos nomeUnidade(String nomeUnidade) {
    this.nomeUnidade = nomeUnidade;
    return this;
  }

   /**
   * Nome da Unidade
   * @return nomeUnidade
  **/
  @ApiModelProperty(example = "CEE PAMPULHA", value = "Nome da Unidade")
  public String getNomeUnidade() {
    return nomeUnidade;
  }

  public void setNomeUnidade(String nomeUnidade) {
    this.nomeUnidade = nomeUnidade;
  }

  public ObjetosEventos codigoSRO(String codigoSRO) {
    this.codigoSRO = codigoSRO;
    return this;
  }

   /**
   * Código do SRO
   * @return codigoSRO
  **/
  @ApiModelProperty(example = "31277971", value = "Código do SRO")
  public String getCodigoSRO() {
    return codigoSRO;
  }

  public void setCodigoSRO(String codigoSRO) {
    this.codigoSRO = codigoSRO;
  }

  public ObjetosEventos municipio(String municipio) {
    this.municipio = municipio;
    return this;
  }

   /**
   * Nome do Municipio
   * @return municipio
  **/
  @ApiModelProperty(example = "BELO HORIZONTE", value = "Nome do Municipio")
  public String getMunicipio() {
    return municipio;
  }

  public void setMunicipio(String municipio) {
    this.municipio = municipio;
  }

  public ObjetosEventos uf(String uf) {
    this.uf = uf;
    return this;
  }

   /**
   * Sigla do Estado
   * @return uf
  **/
  @ApiModelProperty(example = "MG", value = "Sigla do Estado")
  public String getUf() {
    return uf;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }

  public ObjetosEventos codigoMCU(String codigoMCU) {
    this.codigoMCU = codigoMCU;
    return this;
  }

   /**
   * Código do MCU
   * @return codigoMCU
  **/
  @ApiModelProperty(example = "", value = "Código do MCU")
  public String getCodigoMCU() {
    return codigoMCU;
  }

  public void setCodigoMCU(String codigoMCU) {
    this.codigoMCU = codigoMCU;
  }

  public ObjetosEventos codigoDR(String codigoDR) {
    this.codigoDR = codigoDR;
    return this;
  }

   /**
   * Código DR
   * @return codigoDR
  **/
  @ApiModelProperty(example = "", value = "Código DR")
  public String getCodigoDR() {
    return codigoDR;
  }

  public void setCodigoDR(String codigoDR) {
    this.codigoDR = codigoDR;
  }

  public ObjetosEventos siglaDR(String siglaDR) {
    this.siglaDR = siglaDR;
    return this;
  }

   /**
   * Sigla do DR
   * @return siglaDR
  **/
  @ApiModelProperty(example = "", value = "Sigla do DR")
  public String getSiglaDR() {
    return siglaDR;
  }

  public void setSiglaDR(String siglaDR) {
    this.siglaDR = siglaDR;
  }

  public ObjetosEventos numeroLista(String numeroLista) {
    this.numeroLista = numeroLista;
    return this;
  }

   /**
   * Número na Lista
   * @return numeroLista
  **/
  @ApiModelProperty(example = "", value = "Número na Lista")
  public String getNumeroLista() {
    return numeroLista;
  }

  public void setNumeroLista(String numeroLista) {
    this.numeroLista = numeroLista;
  }

  public ObjetosEventos estacao(Integer estacao) {
    this.estacao = estacao;
    return this;
  }

   /**
   * Estação
   * @return estacao
  **/
  @ApiModelProperty(example = "", value = "Estação")
  public Integer getEstacao() {
    return estacao;
  }

  public void setEstacao(Integer estacao) {
    this.estacao = estacao;
  }

  public ObjetosEventos usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }

   /**
   * Nome do Usuário
   * @return usuario
  **/
  @ApiModelProperty(example = "", value = "Nome do Usuário")
  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public ObjetosEventos dataGravacao(String dataGravacao) {
    this.dataGravacao = dataGravacao;
    return this;
  }

   /**
   * Data da Gravação
   * @return dataGravacao
  **/
  @ApiModelProperty(example = "", value = "Data da Gravação")
  public String getDataGravacao() {
    return dataGravacao;
  }

  public void setDataGravacao(String dataGravacao) {
    this.dataGravacao = dataGravacao;
  }

  public ObjetosEventos entregador(String entregador) {
    this.entregador = entregador;
    return this;
  }

   /**
   * Entregador
   * @return entregador
  **/
  @ApiModelProperty(example = "", value = "Entregador")
  public String getEntregador() {
    return entregador;
  }

  public void setEntregador(String entregador) {
    this.entregador = entregador;
  }

  public ObjetosEventos dataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
    return this;
  }

   /**
   * Data de Criação
   * @return dataCriacao
  **/
  @ApiModelProperty(example = "11/05/2017 12:16:54", value = "Data de Criação")
  public String getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public ObjetosEventos acaoBloqueio(Integer acaoBloqueio) {
    this.acaoBloqueio = acaoBloqueio;
    return this;
  }

   /**
   * Ação de Bloqueio
   * @return acaoBloqueio
  **/
  @ApiModelProperty(example = "", value = "Ação de Bloqueio")
  public Integer getAcaoBloqueio() {
    return acaoBloqueio;
  }

  public void setAcaoBloqueio(Integer acaoBloqueio) {
    this.acaoBloqueio = acaoBloqueio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjetosEventos objetosEventos = (ObjetosEventos) o;
    return Objects.equals(this.codigoObjeto, objetosEventos.codigoObjeto) &&
        Objects.equals(this.tipoEvento, objetosEventos.tipoEvento) &&
        Objects.equals(this.statusEvento, objetosEventos.statusEvento) &&
        Objects.equals(this.descricaoEvento, objetosEventos.descricaoEvento) &&
        Objects.equals(this.nomeUnidade, objetosEventos.nomeUnidade) &&
        Objects.equals(this.codigoSRO, objetosEventos.codigoSRO) &&
        Objects.equals(this.municipio, objetosEventos.municipio) &&
        Objects.equals(this.uf, objetosEventos.uf) &&
        Objects.equals(this.codigoMCU, objetosEventos.codigoMCU) &&
        Objects.equals(this.codigoDR, objetosEventos.codigoDR) &&
        Objects.equals(this.siglaDR, objetosEventos.siglaDR) &&
        Objects.equals(this.numeroLista, objetosEventos.numeroLista) &&
        Objects.equals(this.estacao, objetosEventos.estacao) &&
        Objects.equals(this.usuario, objetosEventos.usuario) &&
        Objects.equals(this.dataGravacao, objetosEventos.dataGravacao) &&
        Objects.equals(this.entregador, objetosEventos.entregador) &&
        Objects.equals(this.dataCriacao, objetosEventos.dataCriacao) &&
        Objects.equals(this.acaoBloqueio, objetosEventos.acaoBloqueio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoObjeto, tipoEvento, statusEvento, descricaoEvento, nomeUnidade, codigoSRO, municipio, uf, codigoMCU, codigoDR, siglaDR, numeroLista, estacao, usuario, dataGravacao, entregador, dataCriacao, acaoBloqueio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjetosEventos {\n");
    
    sb.append("    codigoObjeto: ").append(toIndentedString(codigoObjeto)).append("\n");
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
    sb.append("    statusEvento: ").append(toIndentedString(statusEvento)).append("\n");
    sb.append("    descricaoEvento: ").append(toIndentedString(descricaoEvento)).append("\n");
    sb.append("    nomeUnidade: ").append(toIndentedString(nomeUnidade)).append("\n");
    sb.append("    codigoSRO: ").append(toIndentedString(codigoSRO)).append("\n");
    sb.append("    municipio: ").append(toIndentedString(municipio)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    codigoMCU: ").append(toIndentedString(codigoMCU)).append("\n");
    sb.append("    codigoDR: ").append(toIndentedString(codigoDR)).append("\n");
    sb.append("    siglaDR: ").append(toIndentedString(siglaDR)).append("\n");
    sb.append("    numeroLista: ").append(toIndentedString(numeroLista)).append("\n");
    sb.append("    estacao: ").append(toIndentedString(estacao)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    dataGravacao: ").append(toIndentedString(dataGravacao)).append("\n");
    sb.append("    entregador: ").append(toIndentedString(entregador)).append("\n");
    sb.append("    dataCriacao: ").append(toIndentedString(dataCriacao)).append("\n");
    sb.append("    acaoBloqueio: ").append(toIndentedString(acaoBloqueio)).append("\n");
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

