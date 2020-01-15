package fakekube.io.model;

import fakekube.io.model.IoK8sApiAutoscalingV2beta2HPAScalingRules;
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
  * HorizontalPodAutoscalerBehavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively).
 **/
@ApiModel(description="HorizontalPodAutoscalerBehavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively).")
public class IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerBehavior  {
  
  @ApiModelProperty(value = "scaleDown is scaling policy for scaling Down. If not set, the default value is to allow to scale down to minReplicas pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used).")
  @Valid
 /**
   * scaleDown is scaling policy for scaling Down. If not set, the default value is to allow to scale down to minReplicas pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used).
  **/
  private IoK8sApiAutoscalingV2beta2HPAScalingRules scaleDown = null;

  @ApiModelProperty(value = "scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of:   * increase no more than 4 pods per 60 seconds   * double the number of pods per 60 seconds No stabilization is used.")
  @Valid
 /**
   * scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of:   * increase no more than 4 pods per 60 seconds   * double the number of pods per 60 seconds No stabilization is used.
  **/
  private IoK8sApiAutoscalingV2beta2HPAScalingRules scaleUp = null;
 /**
   * scaleDown is scaling policy for scaling Down. If not set, the default value is to allow to scale down to minReplicas pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used).
   * @return scaleDown
  **/
  @JsonProperty("scaleDown")
  public IoK8sApiAutoscalingV2beta2HPAScalingRules getScaleDown() {
    return scaleDown;
  }

  public void setScaleDown(IoK8sApiAutoscalingV2beta2HPAScalingRules scaleDown) {
    this.scaleDown = scaleDown;
  }

  public IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerBehavior scaleDown(IoK8sApiAutoscalingV2beta2HPAScalingRules scaleDown) {
    this.scaleDown = scaleDown;
    return this;
  }

 /**
   * scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of:   * increase no more than 4 pods per 60 seconds   * double the number of pods per 60 seconds No stabilization is used.
   * @return scaleUp
  **/
  @JsonProperty("scaleUp")
  public IoK8sApiAutoscalingV2beta2HPAScalingRules getScaleUp() {
    return scaleUp;
  }

  public void setScaleUp(IoK8sApiAutoscalingV2beta2HPAScalingRules scaleUp) {
    this.scaleUp = scaleUp;
  }

  public IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerBehavior scaleUp(IoK8sApiAutoscalingV2beta2HPAScalingRules scaleUp) {
    this.scaleUp = scaleUp;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerBehavior {\n");
    
    sb.append("    scaleDown: ").append(toIndentedString(scaleDown)).append("\n");
    sb.append("    scaleUp: ").append(toIndentedString(scaleUp)).append("\n");
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

