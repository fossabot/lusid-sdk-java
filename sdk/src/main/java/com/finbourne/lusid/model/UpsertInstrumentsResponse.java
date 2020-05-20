/*
 * LUSID API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.10.1391
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.ErrorDetail;
import com.finbourne.lusid.model.Instrument;
import com.finbourne.lusid.model.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UpsertInstrumentsResponse
 */

public class UpsertInstrumentsResponse {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private Map<String, Instrument> values = new HashMap<>();

  public static final String SERIALIZED_NAME_FAILED = "failed";
  @SerializedName(SERIALIZED_NAME_FAILED)
  private Map<String, ErrorDetail> failed = new HashMap<>();

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = new ArrayList<>();

  public UpsertInstrumentsResponse href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime.
   * @return href
  **/
  @ApiModelProperty(value = "The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime.")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public UpsertInstrumentsResponse values(Map<String, Instrument> values) {
    this.values = values;
    return this;
  }

  public UpsertInstrumentsResponse putValuesItem(String key, Instrument valuesItem) {
    if (this.values == null) {
      this.values = new HashMap<>();
    }
    this.values.put(key, valuesItem);
    return this;
  }

   /**
   * The instruments which have been successfully updated or inserted.
   * @return values
  **/
  @ApiModelProperty(value = "The instruments which have been successfully updated or inserted.")
  public Map<String, Instrument> getValues() {
    return values;
  }

  public void setValues(Map<String, Instrument> values) {
    this.values = values;
  }

  public UpsertInstrumentsResponse failed(Map<String, ErrorDetail> failed) {
    this.failed = failed;
    return this;
  }

  public UpsertInstrumentsResponse putFailedItem(String key, ErrorDetail failedItem) {
    if (this.failed == null) {
      this.failed = new HashMap<>();
    }
    this.failed.put(key, failedItem);
    return this;
  }

   /**
   * The instruments that could not be updated or inserted along with a reason for their failure.
   * @return failed
  **/
  @ApiModelProperty(value = "The instruments that could not be updated or inserted along with a reason for their failure.")
  public Map<String, ErrorDetail> getFailed() {
    return failed;
  }

  public void setFailed(Map<String, ErrorDetail> failed) {
    this.failed = failed;
  }

  public UpsertInstrumentsResponse links(List<Link> links) {
    this.links = links;
    return this;
  }

  public UpsertInstrumentsResponse addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertInstrumentsResponse upsertInstrumentsResponse = (UpsertInstrumentsResponse) o;
    return Objects.equals(this.href, upsertInstrumentsResponse.href) &&
        Objects.equals(this.values, upsertInstrumentsResponse.values) &&
        Objects.equals(this.failed, upsertInstrumentsResponse.failed) &&
        Objects.equals(this.links, upsertInstrumentsResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, values, failed, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertInstrumentsResponse {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
