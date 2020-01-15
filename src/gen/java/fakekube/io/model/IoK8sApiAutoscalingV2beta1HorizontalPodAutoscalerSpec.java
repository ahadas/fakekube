package fakekube.io.model;

import fakekube.io.model.IoK8sApiAutoscalingV2beta1CrossVersionObjectReference;
import fakekube.io.model.IoK8sApiAutoscalingV2beta1MetricSpec;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
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
  * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
 **/
@ApiModel(description="HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.")
public class IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerSpec  {
  
  @ApiModelProperty(required = true, value = "maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.")
 /**
   * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.
  **/
  private Integer maxReplicas = null;

  @ApiModelProperty(value = "metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond.")
  @Valid
 /**
   * metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond.
  **/
  private List<IoK8sApiAutoscalingV2beta1MetricSpec> metrics = null;

  @ApiModelProperty(value = "minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.")
 /**
   * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
  **/
  private Integer minReplicas = null;

  @ApiModelProperty(required = true, value = "scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count.")
  @Valid
 /**
   * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count.
  **/
  private IoK8sApiAutoscalingV2beta1CrossVersionObjectReference scaleTargetRef = null;
 /**
   * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.
   * @return maxReplicas
  **/
  @JsonProperty("maxReplicas")
  @NotNull
  public Integer getMaxReplicas() {
    return maxReplicas;
  }

  public void setMaxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
  }

  public IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerSpec maxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
    return this;
  }

 /**
   * metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond.
   * @return metrics
  **/
  @JsonProperty("metrics")
  public List<IoK8sApiAutoscalingV2beta1MetricSpec> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<IoK8sApiAutoscalingV2beta1MetricSpec> metrics) {
    this.metrics = metrics;
  }

  public IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerSpec metrics(List<IoK8sApiAutoscalingV2beta1MetricSpec> metrics) {
    this.metrics = metrics;
    return this;
  }

  public IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerSpec addMetricsItem(IoK8sApiAutoscalingV2beta1MetricSpec metricsItem) {
    this.metrics.add(metricsItem);
    return this;
  }

 /**
   * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
   * @return minReplicas
  **/
  @JsonProperty("minReplicas")
  public Integer getMinReplicas() {
    return minReplicas;
  }

  public void setMinReplicas(Integer minReplicas) {
    this.minReplicas = minReplicas;
  }

  public IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerSpec minReplicas(Integer minReplicas) {
    this.minReplicas = minReplicas;
    return this;
  }

 /**
   * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count.
   * @return scaleTargetRef
  **/
  @JsonProperty("scaleTargetRef")
  @NotNull
  public IoK8sApiAutoscalingV2beta1CrossVersionObjectReference getScaleTargetRef() {
    return scaleTargetRef;
  }

  public void setScaleTargetRef(IoK8sApiAutoscalingV2beta1CrossVersionObjectReference scaleTargetRef) {
    this.scaleTargetRef = scaleTargetRef;
  }

  public IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerSpec scaleTargetRef(IoK8sApiAutoscalingV2beta1CrossVersionObjectReference scaleTargetRef) {
    this.scaleTargetRef = scaleTargetRef;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerSpec {\n");
    
    sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
    sb.append("    scaleTargetRef: ").append(toIndentedString(scaleTargetRef)).append("\n");
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

