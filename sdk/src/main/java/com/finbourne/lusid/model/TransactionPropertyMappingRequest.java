/*
 * LUSID API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.10.1389
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

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
 * TransactionPropertyMappingRequest
 */

public class TransactionPropertyMappingRequest {
  public static final String SERIALIZED_NAME_PROPERTY_KEY = "propertyKey";
  @SerializedName(SERIALIZED_NAME_PROPERTY_KEY)
  private String propertyKey;

  public static final String SERIALIZED_NAME_MAP_FROM = "mapFrom";
  @SerializedName(SERIALIZED_NAME_MAP_FROM)
  private String mapFrom;

  public static final String SERIALIZED_NAME_SET_TO = "setTo";
  @SerializedName(SERIALIZED_NAME_SET_TO)
  private Object setTo = null;

  public TransactionPropertyMappingRequest propertyKey(String propertyKey) {
    this.propertyKey = propertyKey;
    return this;
  }

   /**
   * The Side
   * @return propertyKey
  **/
  @ApiModelProperty(required = true, value = "The Side")
  public String getPropertyKey() {
    return propertyKey;
  }

  public void setPropertyKey(String propertyKey) {
    this.propertyKey = propertyKey;
  }

  public TransactionPropertyMappingRequest mapFrom(String mapFrom) {
    this.mapFrom = mapFrom;
    return this;
  }

   /**
   * The Side
   * @return mapFrom
  **/
  @ApiModelProperty(value = "The Side")
  public String getMapFrom() {
    return mapFrom;
  }

  public void setMapFrom(String mapFrom) {
    this.mapFrom = mapFrom;
  }

  public TransactionPropertyMappingRequest setTo(Object setTo) {
    this.setTo = setTo;
    return this;
  }

   /**
   * The Side
   * @return setTo
  **/
  @ApiModelProperty(value = "The Side")
  public Object getSetTo() {
    return setTo;
  }

  public void setSetTo(Object setTo) {
    this.setTo = setTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionPropertyMappingRequest transactionPropertyMappingRequest = (TransactionPropertyMappingRequest) o;
    return Objects.equals(this.propertyKey, transactionPropertyMappingRequest.propertyKey) &&
        Objects.equals(this.mapFrom, transactionPropertyMappingRequest.mapFrom) &&
        Objects.equals(this.setTo, transactionPropertyMappingRequest.setTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyKey, mapFrom, setTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionPropertyMappingRequest {\n");
    sb.append("    propertyKey: ").append(toIndentedString(propertyKey)).append("\n");
    sb.append("    mapFrom: ").append(toIndentedString(mapFrom)).append("\n");
    sb.append("    setTo: ").append(toIndentedString(setTo)).append("\n");
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
