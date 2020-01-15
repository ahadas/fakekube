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
  * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster). Exactly one \"target\" type should be set.
 **/
@ApiModel(description="ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster). Exactly one \"target\" type should be set.")
public class IoK8sApiAutoscalingV2beta1ExternalMetricSource  {
  
  @ApiModelProperty(required = true, value = "metricName is the name of the metric in question.")
 /**
   * metricName is the name of the metric in question.
  **/
  private String metricName = null;

  @ApiModelProperty(value = "metricSelector is used to identify a specific time series within a given metric.")
  @Valid
 /**
   * metricSelector is used to identify a specific time series within a given metric.
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector metricSelector = null;

  @ApiModelProperty(value = "targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually exclusive with TargetValue.")
 /**
   * targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually exclusive with TargetValue.
  **/
  private String targetAverageValue = null;

  @ApiModelProperty(value = "targetValue is the target value of the metric (as a quantity). Mutually exclusive with TargetAverageValue.")
 /**
   * targetValue is the target value of the metric (as a quantity). Mutually exclusive with TargetAverageValue.
  **/
  private String targetValue = null;
 /**
   * metricName is the name of the metric in question.
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

  public IoK8sApiAutoscalingV2beta1ExternalMetricSource metricName(String metricName) {
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

  public IoK8sApiAutoscalingV2beta1ExternalMetricSource metricSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector metricSelector) {
    this.metricSelector = metricSelector;
    return this;
  }

 /**
   * targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually exclusive with TargetValue.
   * @return targetAverageValue
  **/
  @JsonProperty("targetAverageValue")
  public String getTargetAverageValue() {
    return targetAverageValue;
  }

  public void setTargetAverageValue(String targetAverageValue) {
    this.targetAverageValue = targetAverageValue;
  }

  public IoK8sApiAutoscalingV2beta1ExternalMetricSource targetAverageValue(String targetAverageValue) {
    this.targetAverageValue = targetAverageValue;
    return this;
  }

 /**
   * targetValue is the target value of the metric (as a quantity). Mutually exclusive with TargetAverageValue.
   * @return targetValue
  **/
  @JsonProperty("targetValue")
  public String getTargetValue() {
    return targetValue;
  }

  public void setTargetValue(String targetValue) {
    this.targetValue = targetValue;
  }

  public IoK8sApiAutoscalingV2beta1ExternalMetricSource targetValue(String targetValue) {
    this.targetValue = targetValue;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta1ExternalMetricSource {\n");
    
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    metricSelector: ").append(toIndentedString(metricSelector)).append("\n");
    sb.append("    targetAverageValue: ").append(toIndentedString(targetAverageValue)).append("\n");
    sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
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

