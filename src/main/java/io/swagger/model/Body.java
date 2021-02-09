package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.DateRange;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-09T16:59:56.539Z[GMT]")


public class Body   {
  @JsonProperty("estimatedShipDateRange")
  private DateRange estimatedShipDateRange = null;

  @JsonProperty("newEstimatedShipDateRange")
  private DateRange newEstimatedShipDateRange = null;

  @JsonProperty("delayAcceptedDate")
  private String delayAcceptedDate = null;

  public Body estimatedShipDateRange(DateRange estimatedShipDateRange) {
    this.estimatedShipDateRange = estimatedShipDateRange;
    return this;
  }

  /**
   * Get estimatedShipDateRange
   * @return estimatedShipDateRange
   **/
  @Schema(description = "")
  
    @Valid
    public DateRange getEstimatedShipDateRange() {
    return estimatedShipDateRange;
  }

  public void setEstimatedShipDateRange(DateRange estimatedShipDateRange) {
    this.estimatedShipDateRange = estimatedShipDateRange;
  }

  public Body newEstimatedShipDateRange(DateRange newEstimatedShipDateRange) {
    this.newEstimatedShipDateRange = newEstimatedShipDateRange;
    return this;
  }

  /**
   * Get newEstimatedShipDateRange
   * @return newEstimatedShipDateRange
   **/
  @Schema(description = "")
  
    @Valid
    public DateRange getNewEstimatedShipDateRange() {
    return newEstimatedShipDateRange;
  }

  public void setNewEstimatedShipDateRange(DateRange newEstimatedShipDateRange) {
    this.newEstimatedShipDateRange = newEstimatedShipDateRange;
  }

  public Body delayAcceptedDate(String delayAcceptedDate) {
    this.delayAcceptedDate = delayAcceptedDate;
    return this;
  }

  /**
   * accepted date for the chagne in promise date.
   * @return delayAcceptedDate
   **/
  @Schema(example = "2020-10-06T13:39:52.774-05:00", description = "accepted date for the chagne in promise date.")
  
    public String getDelayAcceptedDate() {
    return delayAcceptedDate;
  }

  public void setDelayAcceptedDate(String delayAcceptedDate) {
    this.delayAcceptedDate = delayAcceptedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body body = (Body) o;
    return Objects.equals(this.estimatedShipDateRange, body.estimatedShipDateRange) &&
        Objects.equals(this.newEstimatedShipDateRange, body.newEstimatedShipDateRange) &&
        Objects.equals(this.delayAcceptedDate, body.delayAcceptedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedShipDateRange, newEstimatedShipDateRange, delayAcceptedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("    estimatedShipDateRange: ").append(toIndentedString(estimatedShipDateRange)).append("\n");
    sb.append("    newEstimatedShipDateRange: ").append(toIndentedString(newEstimatedShipDateRange)).append("\n");
    sb.append("    delayAcceptedDate: ").append(toIndentedString(delayAcceptedDate)).append("\n");
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
