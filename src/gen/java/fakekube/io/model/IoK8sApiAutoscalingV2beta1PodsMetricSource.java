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
  * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
 **/
@ApiModel(description="PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.")
public class IoK8sApiAutoscalingV2beta1PodsMetricSource  {
  
  @ApiModelProperty(required = true, value = "metricName is the name of the metric in question")
 /**
   * metricName is the name of the metric in question
  **/
  private String metricName = null;

  @ApiModelProperty(value = "selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.")
  @Valid
 /**
   * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector selector = null;

  @ApiModelProperty(required = true, value = "targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity)")
 /**
   * targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity)
  **/
  private String targetAverageValue = null;
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

  public IoK8sApiAutoscalingV2beta1PodsMetricSource metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

 /**
   * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
   * @return selector
  **/
  @JsonProperty("selector")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
  }

  public IoK8sApiAutoscalingV2beta1PodsMetricSource selector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

 /**
   * targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity)
   * @return targetAverageValue
  **/
  @JsonProperty("targetAverageValue")
  @NotNull
  public String getTargetAverageValue() {
    return targetAverageValue;
  }

  public void setTargetAverageValue(String targetAverageValue) {
    this.targetAverageValue = targetAverageValue;
  }

  public IoK8sApiAutoscalingV2beta1PodsMetricSource targetAverageValue(String targetAverageValue) {
    this.targetAverageValue = targetAverageValue;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta1PodsMetricSource {\n");
    
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    targetAverageValue: ").append(toIndentedString(targetAverageValue)).append("\n");
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

