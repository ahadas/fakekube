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
  * current status of a horizontal pod autoscaler
 **/
@ApiModel(description="current status of a horizontal pod autoscaler")
public class IoK8sApiAutoscalingV1HorizontalPodAutoscalerStatus  {
  
  @ApiModelProperty(value = "current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.")
 /**
   * current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
  **/
  private Integer currentCPUUtilizationPercentage = null;

  @ApiModelProperty(required = true, value = "current number of replicas of pods managed by this autoscaler.")
 /**
   * current number of replicas of pods managed by this autoscaler.
  **/
  private Integer currentReplicas = null;

  @ApiModelProperty(required = true, value = "desired number of replicas of pods managed by this autoscaler.")
 /**
   * desired number of replicas of pods managed by this autoscaler.
  **/
  private Integer desiredReplicas = null;

  @ApiModelProperty(value = "last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.")
 /**
   * last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.
  **/
  private String lastScaleTime = null;

  @ApiModelProperty(value = "most recent generation observed by this autoscaler.")
 /**
   * most recent generation observed by this autoscaler.
  **/
  private Long observedGeneration = null;
 /**
   * current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
   * @return currentCPUUtilizationPercentage
  **/
  @JsonProperty("currentCPUUtilizationPercentage")
  public Integer getCurrentCPUUtilizationPercentage() {
    return currentCPUUtilizationPercentage;
  }

  public void setCurrentCPUUtilizationPercentage(Integer currentCPUUtilizationPercentage) {
    this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
  }

  public IoK8sApiAutoscalingV1HorizontalPodAutoscalerStatus currentCPUUtilizationPercentage(Integer currentCPUUtilizationPercentage) {
    this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
    return this;
  }

 /**
   * current number of replicas of pods managed by this autoscaler.
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

  public IoK8sApiAutoscalingV1HorizontalPodAutoscalerStatus currentReplicas(Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
    return this;
  }

 /**
   * desired number of replicas of pods managed by this autoscaler.
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

  public IoK8sApiAutoscalingV1HorizontalPodAutoscalerStatus desiredReplicas(Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
    return this;
  }

 /**
   * last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.
   * @return lastScaleTime
  **/
  @JsonProperty("lastScaleTime")
  public String getLastScaleTime() {
    return lastScaleTime;
  }

  public void setLastScaleTime(String lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
  }

  public IoK8sApiAutoscalingV1HorizontalPodAutoscalerStatus lastScaleTime(String lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
    return this;
  }

 /**
   * most recent generation observed by this autoscaler.
   * @return observedGeneration
  **/
  @JsonProperty("observedGeneration")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public IoK8sApiAutoscalingV1HorizontalPodAutoscalerStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV1HorizontalPodAutoscalerStatus {\n");
    
    sb.append("    currentCPUUtilizationPercentage: ").append(toIndentedString(currentCPUUtilizationPercentage)).append("\n");
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

