package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-09T16:59:56.539Z[GMT]")


public class Body1   {
  @JsonProperty("cancelReason")
  private String cancelReason = null;

  @JsonProperty("cancelDate")
  private String cancelDate = null;

  public Body1 cancelReason(String cancelReason) {
    this.cancelReason = cancelReason;
    return this;
  }

  /**
   * Get cancelReason
   * @return cancelReason
   **/
  @Schema(description = "")
  
    public String getCancelReason() {
    return cancelReason;
  }

  public void setCancelReason(String cancelReason) {
    this.cancelReason = cancelReason;
  }

  public Body1 cancelDate(String cancelDate) {
    this.cancelDate = cancelDate;
    return this;
  }

  /**
   * user cancelaton request date
   * @return cancelDate
   **/
  @Schema(example = "2020-10-06T13:39:52.774-05:00", description = "user cancelaton request date")
  
    public String getCancelDate() {
    return cancelDate;
  }

  public void setCancelDate(String cancelDate) {
    this.cancelDate = cancelDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body1 body1 = (Body1) o;
    return Objects.equals(this.cancelReason, body1.cancelReason) &&
        Objects.equals(this.cancelDate, body1.cancelDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelReason, cancelDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body1 {\n");
    
    sb.append("    cancelReason: ").append(toIndentedString(cancelReason)).append("\n");
    sb.append("    cancelDate: ").append(toIndentedString(cancelDate)).append("\n");
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
