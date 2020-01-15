package fakekube.io.model;

import fakekube.io.model.IoK8sApiAutoscalingV2beta2MetricIdentifier;
import fakekube.io.model.IoK8sApiAutoscalingV2beta2MetricValueStatus;
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
public class IoK8sApiAutoscalingV2beta2PodsMetricStatus  {
  
  @ApiModelProperty(required = true, value = "current contains the current value for the given metric")
  @Valid
 /**
   * current contains the current value for the given metric
  **/
  private IoK8sApiAutoscalingV2beta2MetricValueStatus current = null;

  @ApiModelProperty(required = true, value = "metric identifies the target metric by name and selector")
  @Valid
 /**
   * metric identifies the target metric by name and selector
  **/
  private IoK8sApiAutoscalingV2beta2MetricIdentifier metric = null;
 /**
   * current contains the current value for the given metric
   * @return current
  **/
  @JsonProperty("current")
  @NotNull
  public IoK8sApiAutoscalingV2beta2MetricValueStatus getCurrent() {
    return current;
  }

  public void setCurrent(IoK8sApiAutoscalingV2beta2MetricValueStatus current) {
    this.current = current;
  }

  public IoK8sApiAutoscalingV2beta2PodsMetricStatus current(IoK8sApiAutoscalingV2beta2MetricValueStatus current) {
    this.current = current;
    return this;
  }

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

  public IoK8sApiAutoscalingV2beta2PodsMetricStatus metric(IoK8sApiAutoscalingV2beta2MetricIdentifier metric) {
    this.metric = metric;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta2PodsMetricStatus {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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

