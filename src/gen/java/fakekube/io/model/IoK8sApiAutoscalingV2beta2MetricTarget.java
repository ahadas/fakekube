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
  * MetricTarget defines the target value, average value, or average utilization of a specific metric
 **/
@ApiModel(description="MetricTarget defines the target value, average value, or average utilization of a specific metric")
public class IoK8sApiAutoscalingV2beta2MetricTarget  {
  
  @ApiModelProperty(value = "averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods. Currently only valid for Resource metric source type")
 /**
   * averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods. Currently only valid for Resource metric source type
  **/
  private Integer averageUtilization = null;

  @ApiModelProperty(value = "averageValue is the target value of the average of the metric across all relevant pods (as a quantity)")
 /**
   * averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
  **/
  private String averageValue = null;

  @ApiModelProperty(required = true, value = "type represents whether the metric type is Utilization, Value, or AverageValue")
 /**
   * type represents whether the metric type is Utilization, Value, or AverageValue
  **/
  private String type = null;

  @ApiModelProperty(value = "value is the target value of the metric (as a quantity).")
 /**
   * value is the target value of the metric (as a quantity).
  **/
  private String value = null;
 /**
   * averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods. Currently only valid for Resource metric source type
   * @return averageUtilization
  **/
  @JsonProperty("averageUtilization")
  public Integer getAverageUtilization() {
    return averageUtilization;
  }

  public void setAverageUtilization(Integer averageUtilization) {
    this.averageUtilization = averageUtilization;
  }

  public IoK8sApiAutoscalingV2beta2MetricTarget averageUtilization(Integer averageUtilization) {
    this.averageUtilization = averageUtilization;
    return this;
  }

 /**
   * averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
   * @return averageValue
  **/
  @JsonProperty("averageValue")
  public String getAverageValue() {
    return averageValue;
  }

  public void setAverageValue(String averageValue) {
    this.averageValue = averageValue;
  }

  public IoK8sApiAutoscalingV2beta2MetricTarget averageValue(String averageValue) {
    this.averageValue = averageValue;
    return this;
  }

 /**
   * type represents whether the metric type is Utilization, Value, or AverageValue
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

  public IoK8sApiAutoscalingV2beta2MetricTarget type(String type) {
    this.type = type;
    return this;
  }

 /**
   * value is the target value of the metric (as a quantity).
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public IoK8sApiAutoscalingV2beta2MetricTarget value(String value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta2MetricTarget {\n");
    
    sb.append("    averageUtilization: ").append(toIndentedString(averageUtilization)).append("\n");
    sb.append("    averageValue: ").append(toIndentedString(averageValue)).append("\n");
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

