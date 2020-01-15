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
  * MetricValueStatus holds the current value for a metric
 **/
@ApiModel(description="MetricValueStatus holds the current value for a metric")
public class IoK8sApiAutoscalingV2beta2MetricValueStatus  {
  
  @ApiModelProperty(value = "currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.")
 /**
   * currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
  **/
  private Integer averageUtilization = null;

  @ApiModelProperty(value = "averageValue is the current value of the average of the metric across all relevant pods (as a quantity)")
 /**
   * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
  **/
  private String averageValue = null;

  @ApiModelProperty(value = "value is the current value of the metric (as a quantity).")
 /**
   * value is the current value of the metric (as a quantity).
  **/
  private String value = null;
 /**
   * currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
   * @return averageUtilization
  **/
  @JsonProperty("averageUtilization")
  public Integer getAverageUtilization() {
    return averageUtilization;
  }

  public void setAverageUtilization(Integer averageUtilization) {
    this.averageUtilization = averageUtilization;
  }

  public IoK8sApiAutoscalingV2beta2MetricValueStatus averageUtilization(Integer averageUtilization) {
    this.averageUtilization = averageUtilization;
    return this;
  }

 /**
   * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
   * @return averageValue
  **/
  @JsonProperty("averageValue")
  public String getAverageValue() {
    return averageValue;
  }

  public void setAverageValue(String averageValue) {
    this.averageValue = averageValue;
  }

  public IoK8sApiAutoscalingV2beta2MetricValueStatus averageValue(String averageValue) {
    this.averageValue = averageValue;
    return this;
  }

 /**
   * value is the current value of the metric (as a quantity).
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public IoK8sApiAutoscalingV2beta2MetricValueStatus value(String value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta2MetricValueStatus {\n");
    
    sb.append("    averageUtilization: ").append(toIndentedString(averageUtilization)).append("\n");
    sb.append("    averageValue: ").append(toIndentedString(averageValue)).append("\n");
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

