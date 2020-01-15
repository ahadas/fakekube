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
  * PodsMetricStatus indicates the current value of a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
 **/
@ApiModel(description="PodsMetricStatus indicates the current value of a metric describing each pod in the current scale target (for example, transactions-processed-per-second).")
public class IoK8sApiAutoscalingV2beta1PodsMetricStatus  {
  
  @ApiModelProperty(required = true, value = "currentAverageValue is the current value of the average of the metric across all relevant pods (as a quantity)")
 /**
   * currentAverageValue is the current value of the average of the metric across all relevant pods (as a quantity)
  **/
  private String currentAverageValue = null;

  @ApiModelProperty(required = true, value = "metricName is the name of the metric in question")
 /**
   * metricName is the name of the metric in question
  **/
  private String metricName = null;

  @ApiModelProperty(value = "selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.")
  @Valid
 /**
   * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector selector = null;
 /**
   * currentAverageValue is the current value of the average of the metric across all relevant pods (as a quantity)
   * @return currentAverageValue
  **/
  @JsonProperty("currentAverageValue")
  @NotNull
  public String getCurrentAverageValue() {
    return currentAverageValue;
  }

  public void setCurrentAverageValue(String currentAverageValue) {
    this.currentAverageValue = currentAverageValue;
  }

  public IoK8sApiAutoscalingV2beta1PodsMetricStatus currentAverageValue(String currentAverageValue) {
    this.currentAverageValue = currentAverageValue;
    return this;
  }

 /**
   * metricName is the name of the metric in question
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

  public IoK8sApiAutoscalingV2beta1PodsMetricStatus metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

 /**
   * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
   * @return selector
  **/
  @JsonProperty("selector")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
  }

  public IoK8sApiAutoscalingV2beta1PodsMetricStatus selector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta1PodsMetricStatus {\n");
    
    sb.append("    currentAverageValue: ").append(toIndentedString(currentAverageValue)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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

