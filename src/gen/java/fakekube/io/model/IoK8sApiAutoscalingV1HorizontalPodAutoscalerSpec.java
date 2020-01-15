package fakekube.io.model;

import fakekube.io.model.IoK8sApiAutoscalingV1CrossVersionObjectReference;
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
  * specification of a horizontal pod autoscaler.
 **/
@ApiModel(description="specification of a horizontal pod autoscaler.")
public class IoK8sApiAutoscalingV1HorizontalPodAutoscalerSpec  {
  
  @ApiModelProperty(required = true, value = "upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.")
 /**
   * upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.
  **/
  private Integer maxReplicas = null;

  @ApiModelProperty(value = "minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.")
 /**
   * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
  **/
  private Integer minReplicas = null;

  @ApiModelProperty(required = true, value = "reference to scaled resource; horizontal pod autoscaler will learn the current resource consumption and will set the desired number of pods by using its Scale subresource.")
  @Valid
 /**
   * reference to scaled resource; horizontal pod autoscaler will learn the current resource consumption and will set the desired number of pods by using its Scale subresource.
  **/
  private IoK8sApiAutoscalingV1CrossVersionObjectReference scaleTargetRef = null;

  @ApiModelProperty(value = "target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used.")
 /**
   * target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used.
  **/
  private Integer targetCPUUtilizationPercentage = null;
 /**
   * upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.
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

  public IoK8sApiAutoscalingV1HorizontalPodAutoscalerSpec maxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
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

  public IoK8sApiAutoscalingV1HorizontalPodAutoscalerSpec minReplicas(Integer minReplicas) {
    this.minReplicas = minReplicas;
    return this;
  }

 /**
   * reference to scaled resource; horizontal pod autoscaler will learn the current resource consumption and will set the desired number of pods by using its Scale subresource.
   * @return scaleTargetRef
  **/
  @JsonProperty("scaleTargetRef")
  @NotNull
  public IoK8sApiAutoscalingV1CrossVersionObjectReference getScaleTargetRef() {
    return scaleTargetRef;
  }

  public void setScaleTargetRef(IoK8sApiAutoscalingV1CrossVersionObjectReference scaleTargetRef) {
    this.scaleTargetRef = scaleTargetRef;
  }

  public IoK8sApiAutoscalingV1HorizontalPodAutoscalerSpec scaleTargetRef(IoK8sApiAutoscalingV1CrossVersionObjectReference scaleTargetRef) {
    this.scaleTargetRef = scaleTargetRef;
    return this;
  }

 /**
   * target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used.
   * @return targetCPUUtilizationPercentage
  **/
  @JsonProperty("targetCPUUtilizationPercentage")
  public Integer getTargetCPUUtilizationPercentage() {
    return targetCPUUtilizationPercentage;
  }

  public void setTargetCPUUtilizationPercentage(Integer targetCPUUtilizationPercentage) {
    this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
  }

  public IoK8sApiAutoscalingV1HorizontalPodAutoscalerSpec targetCPUUtilizationPercentage(Integer targetCPUUtilizationPercentage) {
    this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV1HorizontalPodAutoscalerSpec {\n");
    
    sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
    sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
    sb.append("    scaleTargetRef: ").append(toIndentedString(scaleTargetRef)).append("\n");
    sb.append("    targetCPUUtilizationPercentage: ").append(toIndentedString(targetCPUUtilizationPercentage)).append("\n");
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

