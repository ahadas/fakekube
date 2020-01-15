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
  * HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a certain point.
 **/
@ApiModel(description="HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a certain point.")
public class IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerCondition  {
  
  @ApiModelProperty(value = "lastTransitionTime is the last time the condition transitioned from one status to another")
 /**
   * lastTransitionTime is the last time the condition transitioned from one status to another
  **/
  private String lastTransitionTime = null;

  @ApiModelProperty(value = "message is a human-readable explanation containing details about the transition")
 /**
   * message is a human-readable explanation containing details about the transition
  **/
  private String message = null;

  @ApiModelProperty(value = "reason is the reason for the condition's last transition.")
 /**
   * reason is the reason for the condition's last transition.
  **/
  private String reason = null;

  @ApiModelProperty(required = true, value = "status is the status of the condition (True, False, Unknown)")
 /**
   * status is the status of the condition (True, False, Unknown)
  **/
  private String status = null;

  @ApiModelProperty(required = true, value = "type describes the current condition")
 /**
   * type describes the current condition
  **/
  private String type = null;
 /**
   * lastTransitionTime is the last time the condition transitioned from one status to another
   * @return lastTransitionTime
  **/
  @JsonProperty("lastTransitionTime")
  public String getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

 /**
   * message is a human-readable explanation containing details about the transition
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerCondition message(String message) {
    this.message = message;
    return this;
  }

 /**
   * reason is the reason for the condition&#39;s last transition.
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

 /**
   * status is the status of the condition (True, False, Unknown)
   * @return status
  **/
  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerCondition status(String status) {
    this.status = status;
    return this;
  }

 /**
   * type describes the current condition
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerCondition type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerCondition {\n");
    
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

