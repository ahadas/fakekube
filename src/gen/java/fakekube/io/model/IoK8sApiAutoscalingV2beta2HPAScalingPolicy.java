package fakekube.io.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * HPAScalingPolicy is a single policy which must hold true for a specified past interval.
 **/
@ApiModel(description="HPAScalingPolicy is a single policy which must hold true for a specified past interval.")
public class IoK8sApiAutoscalingV2beta2HPAScalingPolicy  {
  
  @ApiModelProperty(required = true, value = "PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).")
 /**
   * PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
  **/
  private Integer periodSeconds = null;

  @ApiModelProperty(required = true, value = "Type is used to specify the scaling policy.")
 /**
   * Type is used to specify the scaling policy.
  **/
  private String type = null;

  @ApiModelProperty(required = true, value = "Value contains the amount of change which is permitted by the policy. It must be greater than zero")
 /**
   * Value contains the amount of change which is permitted by the policy. It must be greater than zero
  **/
  private Integer value = null;
 /**
   * PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
   * @return periodSeconds
  **/
  @JsonProperty("periodSeconds")
  @NotNull
  public Integer getPeriodSeconds() {
    return periodSeconds;
  }

  public void setPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
  }

  public IoK8sApiAutoscalingV2beta2HPAScalingPolicy periodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
    return this;
  }

 /**
   * Type is used to specify the scaling policy.
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiAutoscalingV2beta2HPAScalingPolicy type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Value contains the amount of change which is permitted by the policy. It must be greater than zero
   * @return value
  **/
  @JsonProperty("value")
  @NotNull
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public IoK8sApiAutoscalingV2beta2HPAScalingPolicy value(Integer value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta2HPAScalingPolicy {\n");
    
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

