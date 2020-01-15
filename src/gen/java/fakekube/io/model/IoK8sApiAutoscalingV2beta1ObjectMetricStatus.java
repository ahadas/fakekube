package fakekube.io.model;

import fakekube.io.model.IoK8sApiAutoscalingV2beta1CrossVersionObjectReference;
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
  * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 **/
@ApiModel(description="ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).")
public class IoK8sApiAutoscalingV2beta1ObjectMetricStatus  {
  
  @ApiModelProperty(value = "averageValue is the current value of the average of the metric across all relevant pods (as a quantity)")
 /**
   * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
  **/
  private String averageValue = null;

  @ApiModelProperty(required = true, value = "currentValue is the current value of the metric (as a quantity).")
 /**
   * currentValue is the current value of the metric (as a quantity).
  **/
  private String currentValue = null;

  @ApiModelProperty(required = true, value = "metricName is the name of the metric in question.")
 /**
   * metricName is the name of the metric in question.
  **/
  private String metricName = null;

  @ApiModelProperty(value = "selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.")
  @Valid
 /**
   * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector selector = null;

  @ApiModelProperty(required = true, value = "target is the described Kubernetes object.")
  @Valid
 /**
   * target is the described Kubernetes object.
  **/
  private IoK8sApiAutoscalingV2beta1CrossVersionObjectReference target = null;
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

  public IoK8sApiAutoscalingV2beta1ObjectMetricStatus averageValue(String averageValue) {
    this.averageValue = averageValue;
    return this;
  }

 /**
   * currentValue is the current value of the metric (as a quantity).
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

  public IoK8sApiAutoscalingV2beta1ObjectMetricStatus currentValue(String currentValue) {
    this.currentValue = currentValue;
    return this;
  }

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

  public IoK8sApiAutoscalingV2beta1ObjectMetricStatus metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

 /**
   * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
   * @return selector
  **/
  @JsonProperty("selector")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
  }

  public IoK8sApiAutoscalingV2beta1ObjectMetricStatus selector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

 /**
   * target is the described Kubernetes object.
   * @return target
  **/
  @JsonProperty("target")
  @NotNull
  public IoK8sApiAutoscalingV2beta1CrossVersionObjectReference getTarget() {
    return target;
  }

  public void setTarget(IoK8sApiAutoscalingV2beta1CrossVersionObjectReference target) {
    this.target = target;
  }

  public IoK8sApiAutoscalingV2beta1ObjectMetricStatus target(IoK8sApiAutoscalingV2beta1CrossVersionObjectReference target) {
    this.target = target;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta1ObjectMetricStatus {\n");
    
    sb.append("    averageValue: ").append(toIndentedString(averageValue)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

