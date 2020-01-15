package fakekube.io.model;

import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1LabelSelector;
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
  * ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.
 **/
@ApiModel(description="ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.")
public class IoK8sApiAutoscalingV2beta1ExternalMetricStatus  {
  
  @ApiModelProperty(value = "currentAverageValue is the current value of metric averaged over autoscaled pods.")
 /**
   * currentAverageValue is the current value of metric averaged over autoscaled pods.
  **/
  private String currentAverageValue = null;

  @ApiModelProperty(required = true, value = "currentValue is the current value of the metric (as a quantity)")
 /**
   * currentValue is the current value of the metric (as a quantity)
  **/
  private String currentValue = null;

  @ApiModelProperty(required = true, value = "metricName is the name of a metric used for autoscaling in metric system.")
 /**
   * metricName is the name of a metric used for autoscaling in metric system.
  **/
  private String metricName = null;

  @ApiModelProperty(value = "metricSelector is used to identify a specific time series within a given metric.")
  @Valid
 /**
   * metricSelector is used to identify a specific time series within a given metric.
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector metricSelector = null;
 /**
   * currentAverageValue is the current value of metric averaged over autoscaled pods.
   * @return currentAverageValue
  **/
  @JsonProperty("currentAverageValue")
  public String getCurrentAverageValue() {
    return currentAverageValue;
  }

  public void setCurrentAverageValue(String currentAverageValue) {
    this.currentAverageValue = currentAverageValue;
  }

  public IoK8sApiAutoscalingV2beta1ExternalMetricStatus currentAverageValue(String currentAverageValue) {
    this.currentAverageValue = currentAverageValue;
    return this;
  }

 /**
   * currentValue is the current value of the metric (as a quantity)
   * @return currentValue
  **/
  @JsonProperty("currentValue")
  @NotNull
  public String getCurrentValue() {
    return currentValue;
  }

  public void setCurrentValue(String currentValue) {
    this.currentValue = currentValue;
  }

  public IoK8sApiAutoscalingV2beta1ExternalMetricStatus currentValue(String currentValue) {
    this.currentValue = currentValue;
    return this;
  }

 /**
   * metricName is the name of a metric used for autoscaling in metric system.
   * @return metricName
  **/
  @JsonProperty("metricName")
  @NotNull
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public IoK8sApiAutoscalingV2beta1ExternalMetricStatus metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

 /**
   * metricSelector is used to identify a specific time series within a given metric.
   * @return metricSelector
  **/
  @JsonProperty("metricSelector")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getMetricSelector() {
    return metricSelector;
  }

  public void setMetricSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector metricSelector) {
    this.metricSelector = metricSelector;
  }

  public IoK8sApiAutoscalingV2beta1ExternalMetricStatus metricSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector metricSelector) {
    this.metricSelector = metricSelector;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta1ExternalMetricStatus {\n");
    
    sb.append("    currentAverageValue: ").append(toIndentedString(currentAverageValue)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    metricSelector: ").append(toIndentedString(metricSelector)).append("\n");
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

