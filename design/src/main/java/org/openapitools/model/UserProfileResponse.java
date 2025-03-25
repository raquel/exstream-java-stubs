package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.ResourceVersion;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UserProfileResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-25T22:31:49.764173764Z[Europe/Lisbon]")
public class UserProfileResponse {

  @Valid
  private Map<String, List<@Valid ResourceVersion>> recents = new HashMap<>();

  @Valid
  private Map<String, List<@Valid ResourceVersion>> favorites = new HashMap<>();

  private String user;

  private String userConfig;

  public UserProfileResponse recents(Map<String, List<@Valid ResourceVersion>> recents) {
    this.recents = recents;
    return this;
  }

  public UserProfileResponse putRecentsItem(String key, List<@Valid ResourceVersion> recentsItem) {
    if (this.recents == null) {
      this.recents = new HashMap<>();
    }
    this.recents.put(key, recentsItem);
    return this;
  }

  /**
   * Get recents
   * @return recents
  */
  @Valid 
  @Schema(name = "recents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recents")
  public Map<String, List<@Valid ResourceVersion>> getRecents() {
    return recents;
  }

  public void setRecents(Map<String, List<@Valid ResourceVersion>> recents) {
    this.recents = recents;
  }

  public UserProfileResponse favorites(Map<String, List<@Valid ResourceVersion>> favorites) {
    this.favorites = favorites;
    return this;
  }

  public UserProfileResponse putFavoritesItem(String key, List<@Valid ResourceVersion> favoritesItem) {
    if (this.favorites == null) {
      this.favorites = new HashMap<>();
    }
    this.favorites.put(key, favoritesItem);
    return this;
  }

  /**
   * Get favorites
   * @return favorites
  */
  @Valid 
  @Schema(name = "favorites", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favorites")
  public Map<String, List<@Valid ResourceVersion>> getFavorites() {
    return favorites;
  }

  public void setFavorites(Map<String, List<@Valid ResourceVersion>> favorites) {
    this.favorites = favorites;
  }

  public UserProfileResponse user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public UserProfileResponse userConfig(String userConfig) {
    this.userConfig = userConfig;
    return this;
  }

  /**
   * Get userConfig
   * @return userConfig
  */
  
  @Schema(name = "userConfig", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userConfig")
  public String getUserConfig() {
    return userConfig;
  }

  public void setUserConfig(String userConfig) {
    this.userConfig = userConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfileResponse userProfileResponse = (UserProfileResponse) o;
    return Objects.equals(this.recents, userProfileResponse.recents) &&
        Objects.equals(this.favorites, userProfileResponse.favorites) &&
        Objects.equals(this.user, userProfileResponse.user) &&
        Objects.equals(this.userConfig, userProfileResponse.userConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recents, favorites, user, userConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfileResponse {\n");
    sb.append("    recents: ").append(toIndentedString(recents)).append("\n");
    sb.append("    favorites: ").append(toIndentedString(favorites)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userConfig: ").append(toIndentedString(userConfig)).append("\n");
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

