package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Grammar;
import org.openapitools.model.Readability;
import org.openapitools.model.Sentiment;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AugmentedAuthoring
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T17:54:43.132703260Z[Europe/Lisbon]")
public class AugmentedAuthoring {

  private Grammar grammar;

  private Readability readability;

  private Sentiment sentiment;

  public AugmentedAuthoring grammar(Grammar grammar) {
    this.grammar = grammar;
    return this;
  }

  /**
   * Get grammar
   * @return grammar
  */
  @Valid 
  @Schema(name = "grammar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("grammar")
  public Grammar getGrammar() {
    return grammar;
  }

  public void setGrammar(Grammar grammar) {
    this.grammar = grammar;
  }

  public AugmentedAuthoring readability(Readability readability) {
    this.readability = readability;
    return this;
  }

  /**
   * Get readability
   * @return readability
  */
  @Valid 
  @Schema(name = "readability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("readability")
  public Readability getReadability() {
    return readability;
  }

  public void setReadability(Readability readability) {
    this.readability = readability;
  }

  public AugmentedAuthoring sentiment(Sentiment sentiment) {
    this.sentiment = sentiment;
    return this;
  }

  /**
   * Get sentiment
   * @return sentiment
  */
  @Valid 
  @Schema(name = "sentiment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sentiment")
  public Sentiment getSentiment() {
    return sentiment;
  }

  public void setSentiment(Sentiment sentiment) {
    this.sentiment = sentiment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AugmentedAuthoring augmentedAuthoring = (AugmentedAuthoring) o;
    return Objects.equals(this.grammar, augmentedAuthoring.grammar) &&
        Objects.equals(this.readability, augmentedAuthoring.readability) &&
        Objects.equals(this.sentiment, augmentedAuthoring.sentiment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grammar, readability, sentiment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AugmentedAuthoring {\n");
    sb.append("    grammar: ").append(toIndentedString(grammar)).append("\n");
    sb.append("    readability: ").append(toIndentedString(readability)).append("\n");
    sb.append("    sentiment: ").append(toIndentedString(sentiment)).append("\n");
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

