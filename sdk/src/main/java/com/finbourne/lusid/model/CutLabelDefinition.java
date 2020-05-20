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
import com.finbourne.lusid.model.CutLocalTime;
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
import java.util.List;

/**
 * CutLabelDefinition
 */

public class CutLabelDefinition {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CUT_LOCAL_TIME = "cutLocalTime";
  @SerializedName(SERIALIZED_NAME_CUT_LOCAL_TIME)
  private CutLocalTime cutLocalTime = null;

  public static final String SERIALIZED_NAME_TIME_ZONE = "timeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = new ArrayList<>();

  public CutLabelDefinition code(String code) {
    this.code = code;
    return this;
  }

   /**
   * 
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CutLabelDefinition displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * 
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CutLabelDefinition description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CutLabelDefinition cutLocalTime(CutLocalTime cutLocalTime) {
    this.cutLocalTime = cutLocalTime;
    return this;
  }

   /**
   * Get cutLocalTime
   * @return cutLocalTime
  **/
  @ApiModelProperty(value = "")
  public CutLocalTime getCutLocalTime() {
    return cutLocalTime;
  }

  public void setCutLocalTime(CutLocalTime cutLocalTime) {
    this.cutLocalTime = cutLocalTime;
  }

  public CutLabelDefinition timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * 
   * @return timeZone
  **/
  @ApiModelProperty(value = "")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(value = "")
  public String getHref() {
    return href;
  }

  public CutLabelDefinition links(List<Link> links) {
    this.links = links;
    return this;
  }

  public CutLabelDefinition addLinksItem(Link linksItem) {
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
    CutLabelDefinition cutLabelDefinition = (CutLabelDefinition) o;
    return Objects.equals(this.code, cutLabelDefinition.code) &&
        Objects.equals(this.displayName, cutLabelDefinition.displayName) &&
        Objects.equals(this.description, cutLabelDefinition.description) &&
        Objects.equals(this.cutLocalTime, cutLabelDefinition.cutLocalTime) &&
        Objects.equals(this.timeZone, cutLabelDefinition.timeZone) &&
        Objects.equals(this.href, cutLabelDefinition.href) &&
        Objects.equals(this.links, cutLabelDefinition.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, displayName, description, cutLocalTime, timeZone, href, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CutLabelDefinition {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cutLocalTime: ").append(toIndentedString(cutLocalTime)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
