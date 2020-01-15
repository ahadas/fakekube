package fakekube.io.model;

import fakekube.io.model.IoK8sApiAutoscalingV2beta2MetricIdentifier;
import fakekube.io.model.IoK8sApiAutoscalingV2beta2MetricTarget;
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
public class IoK8sApiAutoscalingV2beta2PodsMetricSource  {
  
  @ApiModelProperty(required = true, value = "metric identifies the target metric by name and selector")
  @Valid
 /**
   * metric identifies the target metric by name and selector
  **/
  private IoK8sApiAutoscalingV2beta2MetricIdentifier metric = null;

  @ApiModelProperty(required = true, value = "target specifies the target value for the given metric")
  @Valid
 /**
   * target specifies the target value for the given metric
  **/
  private IoK8sApiAutoscalingV2beta2MetricTarget target = null;
 /**
   * metric identifies the target metric by name and selector
   * @return metric
  **/
  @JsonProperty("metric")
  @NotNull
  public IoK8sApiAutoscalingV2beta2MetricIdentifier getMetric() {
    return metric;
  }

  public void setMetric(IoK8sApiAutoscalingV2beta2MetricIdentifier metric) {
    this.metric = metric;
  }

  public IoK8sApiAutoscalingV2beta2PodsMetricSource metric(IoK8sApiAutoscalingV2beta2MetricIdentifier metric) {
    this.metric = metric;
    return this;
  }

 /**
   * target specifies the target value for the given metric
   * @return target
  **/
  @JsonProperty("target")
  @NotNull
  public IoK8sApiAutoscalingV2beta2MetricTarget getTarget() {
    return target;
  }

  public void setTarget(IoK8sApiAutoscalingV2beta2MetricTarget target) {
    this.target = target;
  }

  public IoK8sApiAutoscalingV2beta2PodsMetricSource target(IoK8sApiAutoscalingV2beta2MetricTarget target) {
    this.target = target;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta2PodsMetricSource {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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

