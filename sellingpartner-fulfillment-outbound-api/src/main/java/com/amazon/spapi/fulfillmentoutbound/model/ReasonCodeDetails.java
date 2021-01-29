/*
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.fulfillmentoutbound.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A return reason code, a description, and an optional description translation.
 */
@ApiModel(description = "A return reason code, a description, and an optional description translation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:44:18.412+08:00")
public class ReasonCodeDetails {
  @SerializedName("returnReasonCode")
  private String returnReasonCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("translatedDescription")
  private String translatedDescription = null;

  public ReasonCodeDetails returnReasonCode(String returnReasonCode) {
    this.returnReasonCode = returnReasonCode;
    return this;
  }

   /**
   * A code that indicates a valid return reason.
   * @return returnReasonCode
  **/
  @ApiModelProperty(required = true, value = "A code that indicates a valid return reason.")
  public String getReturnReasonCode() {
    return returnReasonCode;
  }

  public void setReturnReasonCode(String returnReasonCode) {
    this.returnReasonCode = returnReasonCode;
  }

  public ReasonCodeDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human readable description of the return reason code.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "A human readable description of the return reason code.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ReasonCodeDetails translatedDescription(String translatedDescription) {
    this.translatedDescription = translatedDescription;
    return this;
  }

   /**
   * A translation of the description. The translation is in the language specified in the Language request parameter.
   * @return translatedDescription
  **/
  @ApiModelProperty(value = "A translation of the description. The translation is in the language specified in the Language request parameter.")
  public String getTranslatedDescription() {
    return translatedDescription;
  }

  public void setTranslatedDescription(String translatedDescription) {
    this.translatedDescription = translatedDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReasonCodeDetails reasonCodeDetails = (ReasonCodeDetails) o;
    return Objects.equals(this.returnReasonCode, reasonCodeDetails.returnReasonCode) &&
        Objects.equals(this.description, reasonCodeDetails.description) &&
        Objects.equals(this.translatedDescription, reasonCodeDetails.translatedDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnReasonCode, description, translatedDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReasonCodeDetails {\n");
    
    sb.append("    returnReasonCode: ").append(toIndentedString(returnReasonCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    translatedDescription: ").append(toIndentedString(translatedDescription)).append("\n");
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
