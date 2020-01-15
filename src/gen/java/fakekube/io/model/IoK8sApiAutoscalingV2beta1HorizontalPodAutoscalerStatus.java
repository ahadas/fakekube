package fakekube.io.model;

import fakekube.io.model.IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition;
import fakekube.io.model.IoK8sApiAutoscalingV2beta1MetricStatus;
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
  * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
 **/
@ApiModel(description="HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.")
public class IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerStatus  {
  
  @ApiModelProperty(required = true, value = "conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.")
  @Valid
 /**
   * conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
  **/
  private List<IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition> conditions = new ArrayList<IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition>();

  @ApiModelProperty(value = "currentMetrics is the last read state of the metrics used by this autoscaler.")
  @Valid
 /**
   * currentMetrics is the last read state of the metrics used by this autoscaler.
  **/
  private List<IoK8sApiAutoscalingV2beta1MetricStatus> currentMetrics = null;

  @ApiModelProperty(required = true, value = "currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.")
 /**
   * currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
  **/
  private Integer currentReplicas = null;

  @ApiModelProperty(required = true, value = "desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.")
 /**
   * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
  **/
  private Integer desiredReplicas = null;

  @ApiModelProperty(value = "lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.")
 /**
   * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.
  **/
  private String lastScaleTime = null;

  @ApiModelProperty(value = "observedGeneration is the most recent generation observed by this autoscaler.")
 /**
   * observedGeneration is the most recent generation observed by this autoscaler.
  **/
  private Long observedGeneration = null;
 /**
   * conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
   * @return conditions
  **/
  @JsonProperty("conditions")
  @NotNull
  public List<IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerStatus conditions(List<IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerStatus addConditionsItem(IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

 /**
   * currentMetrics is the last read state of the metrics used by this autoscaler.
   * @return currentMetrics
  **/
  @JsonProperty("currentMetrics")
  public List<IoK8sApiAutoscalingV2beta1MetricStatus> getCurrentMetrics() {
    return currentMetrics;
  }

  public void setCurrentMetrics(List<IoK8sApiAutoscalingV2beta1MetricStatus> currentMetrics) {
    this.currentMetrics = currentMetrics;
  }

  public IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerStatus currentMetrics(List<IoK8sApiAutoscalingV2beta1MetricStatus> currentMetrics) {
    this.currentMetrics = currentMetrics;
    return this;
  }

  public IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerStatus addCurrentMetricsItem(IoK8sApiAutoscalingV2beta1MetricStatus currentMetricsItem) {
    this.currentMetrics.add(currentMetricsItem);
    return this;
  }

 /**
   * currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
   * @return currentReplicas
  **/
  @JsonProperty("currentReplicas")
  @NotNull
  public Integer getCurrentReplicas() {
    return currentReplicas;
  }

  public void setCurrentReplicas(Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
  }

  public IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerStatus currentReplicas(Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
    return this;
  }

 /**
   * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
   * @return desiredReplicas
  **/
  @JsonProperty("desiredReplicas")
  @NotNull
  public Integer getDesiredReplicas() {
    return desiredReplicas;
  }

  public void setDesiredReplicas(Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
  }

  public IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerStatus desiredReplicas(Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
    return this;
  }

 /**
   * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.
   * @return lastScaleTime
  **/
  @JsonProperty("lastScaleTime")
  public String getLastScaleTime() {
    return lastScaleTime;
  }

  public void setLastScaleTime(String lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
  }

  public IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerStatus lastScaleTime(String lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
    return this;
  }

 /**
   * observedGeneration is the most recent generation observed by this autoscaler.
   * @return observedGeneration
  **/
  @JsonProperty("observedGeneration")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerStatus {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    currentMetrics: ").append(toIndentedString(currentMetrics)).append("\n");
    sb.append("    currentReplicas: ").append(toIndentedString(currentReplicas)).append("\n");
    sb.append("    desiredReplicas: ").append(toIndentedString(desiredReplicas)).append("\n");
    sb.append("    lastScaleTime: ").append(toIndentedString(lastScaleTime)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
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

