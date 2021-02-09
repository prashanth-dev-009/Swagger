package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.DateRange;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Item
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-09T16:59:56.539Z[GMT]")


public class Item   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("planId")
  private String planId = null;

  @JsonProperty("skuId")
  private String skuId = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("telephoneNumber")
  private String telephoneNumber = null;

  /**
   * Item Status
   */
  public enum StatusEnum {
    ORDERED("ordered"),
    
    SHIPPED("shipped"),
    
    DELIVERED("delivered");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("complete")
  private Boolean complete = null;

  @JsonProperty("estimatedShipDateRange")
  private DateRange estimatedShipDateRange = null;

  @JsonProperty("newEstimatedShipDateRange")
  private DateRange newEstimatedShipDateRange = null;

  @JsonProperty("userAcceptedDelay")
  private Boolean userAcceptedDelay = null;

  @JsonProperty("delayAcceptedDate")
  private String delayAcceptedDate = null;

  public Item id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "100000", description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Item name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "Apple Iphone XR", description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Item planId(String planId) {
    this.planId = planId;
    return this;
  }

  /**
   * plan identifier. Details of the Plan will be part of the catalog mS.
   * @return planId
   **/
  @Schema(example = "skup1234", description = "plan identifier. Details of the Plan will be part of the catalog mS.")
  
    public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }

  public Item skuId(String skuId) {
    this.skuId = skuId;
    return this;
  }

  /**
   * sku identifier. Details of the SKU will be part of the catalog mS.
   * @return skuId
   **/
  @Schema(example = "sku1234", description = "sku identifier. Details of the SKU will be part of the catalog mS.")
  
    public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }

  public Item quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   **/
  @Schema(example = "1", description = "")
  
    public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Item telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

  /**
   * Get telephoneNumber
   * @return telephoneNumber
   **/
  @Schema(example = "409.406.3322", description = "")
  
    public String getTelephoneNumber() {
    return telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  public Item status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Item Status
   * @return status
   **/
  @Schema(example = "ordered", description = "Item Status")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Item complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

  /**
   * Get complete
   * @return complete
   **/
  @Schema(description = "")
  
    public Boolean isComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  public Item estimatedShipDateRange(DateRange estimatedShipDateRange) {
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

  public Item newEstimatedShipDateRange(DateRange newEstimatedShipDateRange) {
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

  public Item userAcceptedDelay(Boolean userAcceptedDelay) {
    this.userAcceptedDelay = userAcceptedDelay;
    return this;
  }

  /**
   * customer has accepted the delay, so we can use this to avoid showing the delay shipment alert.
   * @return userAcceptedDelay
   **/
  @Schema(description = "customer has accepted the delay, so we can use this to avoid showing the delay shipment alert.")
  
    public Boolean isUserAcceptedDelay() {
    return userAcceptedDelay;
  }

  public void setUserAcceptedDelay(Boolean userAcceptedDelay) {
    this.userAcceptedDelay = userAcceptedDelay;
  }

  public Item delayAcceptedDate(String delayAcceptedDate) {
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
    Item item = (Item) o;
    return Objects.equals(this.id, item.id) &&
        Objects.equals(this.name, item.name) &&
        Objects.equals(this.planId, item.planId) &&
        Objects.equals(this.skuId, item.skuId) &&
        Objects.equals(this.quantity, item.quantity) &&
        Objects.equals(this.telephoneNumber, item.telephoneNumber) &&
        Objects.equals(this.status, item.status) &&
        Objects.equals(this.complete, item.complete) &&
        Objects.equals(this.estimatedShipDateRange, item.estimatedShipDateRange) &&
        Objects.equals(this.newEstimatedShipDateRange, item.newEstimatedShipDateRange) &&
        Objects.equals(this.userAcceptedDelay, item.userAcceptedDelay) &&
        Objects.equals(this.delayAcceptedDate, item.delayAcceptedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, planId, skuId, quantity, telephoneNumber, status, complete, estimatedShipDateRange, newEstimatedShipDateRange, userAcceptedDelay, delayAcceptedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    estimatedShipDateRange: ").append(toIndentedString(estimatedShipDateRange)).append("\n");
    sb.append("    newEstimatedShipDateRange: ").append(toIndentedString(newEstimatedShipDateRange)).append("\n");
    sb.append("    userAcceptedDelay: ").append(toIndentedString(userAcceptedDelay)).append("\n");
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
