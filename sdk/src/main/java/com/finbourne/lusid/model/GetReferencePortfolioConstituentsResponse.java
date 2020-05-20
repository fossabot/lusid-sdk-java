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
import com.finbourne.lusid.model.Link;
import com.finbourne.lusid.model.ReferencePortfolioConstituent;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * GetReferencePortfolioConstituentsResponse
 */

public class GetReferencePortfolioConstituentsResponse {
  public static final String SERIALIZED_NAME_EFFECTIVE_FROM = "effectiveFrom";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_FROM)
  private OffsetDateTime effectiveFrom;

  /**
   * 
   */
  @JsonAdapter(WeightTypeEnum.Adapter.class)
  public enum WeightTypeEnum {
    STATIC("Static"),
    
    FLOATING("Floating"),
    
    PERIODICAL("Periodical");

    private String value;

    WeightTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WeightTypeEnum fromValue(String value) {
      for (WeightTypeEnum b : WeightTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WeightTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WeightTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WeightTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WeightTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WEIGHT_TYPE = "weightType";
  @SerializedName(SERIALIZED_NAME_WEIGHT_TYPE)
  private WeightTypeEnum weightType;

  /**
   * 
   */
  @JsonAdapter(PeriodTypeEnum.Adapter.class)
  public enum PeriodTypeEnum {
    DAILY("Daily"),
    
    WEEKLY("Weekly"),
    
    MONTHLY("Monthly"),
    
    QUARTERLY("Quarterly"),
    
    ANNUALLY("Annually");

    private String value;

    PeriodTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PeriodTypeEnum fromValue(String value) {
      for (PeriodTypeEnum b : PeriodTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PeriodTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PeriodTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PeriodTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PERIOD_TYPE = "periodType";
  @SerializedName(SERIALIZED_NAME_PERIOD_TYPE)
  private PeriodTypeEnum periodType;

  public static final String SERIALIZED_NAME_PERIOD_COUNT = "periodCount";
  @SerializedName(SERIALIZED_NAME_PERIOD_COUNT)
  private Integer periodCount;

  public static final String SERIALIZED_NAME_CONSTITUENTS = "constituents";
  @SerializedName(SERIALIZED_NAME_CONSTITUENTS)
  private List<ReferencePortfolioConstituent> constituents = new ArrayList<>();

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = new ArrayList<>();

  public GetReferencePortfolioConstituentsResponse effectiveFrom(OffsetDateTime effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
    return this;
  }

   /**
   * 
   * @return effectiveFrom
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getEffectiveFrom() {
    return effectiveFrom;
  }

  public void setEffectiveFrom(OffsetDateTime effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
  }

  public GetReferencePortfolioConstituentsResponse weightType(WeightTypeEnum weightType) {
    this.weightType = weightType;
    return this;
  }

   /**
   * 
   * @return weightType
  **/
  @ApiModelProperty(required = true, value = "")
  public WeightTypeEnum getWeightType() {
    return weightType;
  }

  public void setWeightType(WeightTypeEnum weightType) {
    this.weightType = weightType;
  }

  public GetReferencePortfolioConstituentsResponse periodType(PeriodTypeEnum periodType) {
    this.periodType = periodType;
    return this;
  }

   /**
   * 
   * @return periodType
  **/
  @ApiModelProperty(value = "")
  public PeriodTypeEnum getPeriodType() {
    return periodType;
  }

  public void setPeriodType(PeriodTypeEnum periodType) {
    this.periodType = periodType;
  }

  public GetReferencePortfolioConstituentsResponse periodCount(Integer periodCount) {
    this.periodCount = periodCount;
    return this;
  }

   /**
   * 
   * @return periodCount
  **/
  @ApiModelProperty(value = "")
  public Integer getPeriodCount() {
    return periodCount;
  }

  public void setPeriodCount(Integer periodCount) {
    this.periodCount = periodCount;
  }

  public GetReferencePortfolioConstituentsResponse constituents(List<ReferencePortfolioConstituent> constituents) {
    this.constituents = constituents;
    return this;
  }

  public GetReferencePortfolioConstituentsResponse addConstituentsItem(ReferencePortfolioConstituent constituentsItem) {
    this.constituents.add(constituentsItem);
    return this;
  }

   /**
   * Set of constituents (instrument/weight pairings)
   * @return constituents
  **/
  @ApiModelProperty(required = true, value = "Set of constituents (instrument/weight pairings)")
  public List<ReferencePortfolioConstituent> getConstituents() {
    return constituents;
  }

  public void setConstituents(List<ReferencePortfolioConstituent> constituents) {
    this.constituents = constituents;
  }

  public GetReferencePortfolioConstituentsResponse href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The Uri that returns the same result as the original request,  but may include resolved as at time(s).
   * @return href
  **/
  @ApiModelProperty(value = "The Uri that returns the same result as the original request,  but may include resolved as at time(s).")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public GetReferencePortfolioConstituentsResponse links(List<Link> links) {
    this.links = links;
    return this;
  }

  public GetReferencePortfolioConstituentsResponse addLinksItem(Link linksItem) {
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
    GetReferencePortfolioConstituentsResponse getReferencePortfolioConstituentsResponse = (GetReferencePortfolioConstituentsResponse) o;
    return Objects.equals(this.effectiveFrom, getReferencePortfolioConstituentsResponse.effectiveFrom) &&
        Objects.equals(this.weightType, getReferencePortfolioConstituentsResponse.weightType) &&
        Objects.equals(this.periodType, getReferencePortfolioConstituentsResponse.periodType) &&
        Objects.equals(this.periodCount, getReferencePortfolioConstituentsResponse.periodCount) &&
        Objects.equals(this.constituents, getReferencePortfolioConstituentsResponse.constituents) &&
        Objects.equals(this.href, getReferencePortfolioConstituentsResponse.href) &&
        Objects.equals(this.links, getReferencePortfolioConstituentsResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveFrom, weightType, periodType, periodCount, constituents, href, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReferencePortfolioConstituentsResponse {\n");
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
    sb.append("    weightType: ").append(toIndentedString(weightType)).append("\n");
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
    sb.append("    periodCount: ").append(toIndentedString(periodCount)).append("\n");
    sb.append("    constituents: ").append(toIndentedString(constituents)).append("\n");
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
