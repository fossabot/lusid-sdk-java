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
 * VersionSummaryDto
 */

public class VersionSummaryDto {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_BUILD_VERSION = "buildVersion";
  @SerializedName(SERIALIZED_NAME_BUILD_VERSION)
  private String buildVersion;

  public static final String SERIALIZED_NAME_EXCEL_VERSION = "excelVersion";
  @SerializedName(SERIALIZED_NAME_EXCEL_VERSION)
  private String excelVersion;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = new ArrayList<>();

   /**
   * Get apiVersion
   * @return apiVersion
  **/
  @ApiModelProperty(value = "")
  public String getApiVersion() {
    return apiVersion;
  }

   /**
   * Get buildVersion
   * @return buildVersion
  **/
  @ApiModelProperty(value = "")
  public String getBuildVersion() {
    return buildVersion;
  }

   /**
   * Get excelVersion
   * @return excelVersion
  **/
  @ApiModelProperty(value = "")
  public String getExcelVersion() {
    return excelVersion;
  }

  public VersionSummaryDto links(List<Link> links) {
    this.links = links;
    return this;
  }

  public VersionSummaryDto addLinksItem(Link linksItem) {
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
    VersionSummaryDto versionSummaryDto = (VersionSummaryDto) o;
    return Objects.equals(this.apiVersion, versionSummaryDto.apiVersion) &&
        Objects.equals(this.buildVersion, versionSummaryDto.buildVersion) &&
        Objects.equals(this.excelVersion, versionSummaryDto.excelVersion) &&
        Objects.equals(this.links, versionSummaryDto.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, buildVersion, excelVersion, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionSummaryDto {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    buildVersion: ").append(toIndentedString(buildVersion)).append("\n");
    sb.append("    excelVersion: ").append(toIndentedString(excelVersion)).append("\n");
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
