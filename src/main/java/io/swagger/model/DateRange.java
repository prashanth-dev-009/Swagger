package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Date range with from &amp; to dates. This object is used for promissed ship date range to the customer. Original Ship date promised to customer It can change based on stock availability. We need to inform customer if it changes.
 */
@Schema(description = "Date range with from & to dates. This object is used for promissed ship date range to the customer. Original Ship date promised to customer It can change based on stock availability. We need to inform customer if it changes.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-09T16:59:56.539Z[GMT]")


public class DateRange   {
  @JsonProperty("fromDate")
  private String fromDate = null;

  @JsonProperty("toDate")
  private String toDate = null;

  public DateRange fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

  /**
   * Get fromDate
   * @return fromDate
   **/
  @Schema(example = "2020-09-06T13:39:52.774-05:00", description = "")
  
    public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public DateRange toDate(String toDate) {
    this.toDate = toDate;
    return this;
  }

  /**
   * Get toDate
   * @return toDate
   **/
  @Schema(example = "2020-09-06T13:39:52.774-05:00", description = "")
  
    public String getToDate() {
    return toDate;
  }

  public void setToDate(String toDate) {
    this.toDate = toDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateRange dateRange = (DateRange) o;
    return Objects.equals(this.fromDate, dateRange.fromDate) &&
        Objects.equals(this.toDate, dateRange.toDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromDate, toDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateRange {\n");
    
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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
