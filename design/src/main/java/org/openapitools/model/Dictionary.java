package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Dictionary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class Dictionary {

  private String languageCode;

  private String locale;

  @Valid
  private List<byte[]> dic;

  @Valid
  private List<byte[]> aff;

  public Dictionary languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Get languageCode
   * @return languageCode
  */
  @Size(min = 1, max = 255) 
  @Schema(name = "languageCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("languageCode")
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public Dictionary locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
  */
  @Size(min = 1, max = 255) 
  @Schema(name = "locale", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public Dictionary dic(List<byte[]> dic) {
    this.dic = dic;
    return this;
  }

  public Dictionary addDicItem(byte[] dicItem) {
    if (this.dic == null) {
      this.dic = new ArrayList<>();
    }
    this.dic.add(dicItem);
    return this;
  }

  /**
   * Get dic
   * @return dic
  */
  
  @Schema(name = "dic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dic")
  public List<byte[]> getDic() {
    return dic;
  }

  public void setDic(List<byte[]> dic) {
    this.dic = dic;
  }

  public Dictionary aff(List<byte[]> aff) {
    this.aff = aff;
    return this;
  }

  public Dictionary addAffItem(byte[] affItem) {
    if (this.aff == null) {
      this.aff = new ArrayList<>();
    }
    this.aff.add(affItem);
    return this;
  }

  /**
   * Get aff
   * @return aff
  */
  
  @Schema(name = "aff", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aff")
  public List<byte[]> getAff() {
    return aff;
  }

  public void setAff(List<byte[]> aff) {
    this.aff = aff;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dictionary dictionary = (Dictionary) o;
    return Objects.equals(this.languageCode, dictionary.languageCode) &&
        Objects.equals(this.locale, dictionary.locale) &&
        Objects.equals(this.dic, dictionary.dic) &&
        Objects.equals(this.aff, dictionary.aff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageCode, locale, dic, aff);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dictionary {\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dic: ").append(toIndentedString(dic)).append("\n");
    sb.append("    aff: ").append(toIndentedString(aff)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

