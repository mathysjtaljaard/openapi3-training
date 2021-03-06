/*
 * API Title
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-30T12:41:59.174138Z[Etc/UTC]")
public class InlineObject {
  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private UUID orderId;

  public static final String SERIALIZED_NAME_ORDER_STATUS = "orderStatus";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
  private String orderStatus;


  public InlineObject orderId(UUID orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getOrderId() {
    return orderId;
  }


  public void setOrderId(UUID orderId) {
    this.orderId = orderId;
  }


  public InlineObject orderStatus(String orderStatus) {
    
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * Get orderStatus
   * @return orderStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrderStatus() {
    return orderStatus;
  }


  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.orderId, inlineObject.orderId) &&
        Objects.equals(this.orderStatus, inlineObject.orderStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, orderStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
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

