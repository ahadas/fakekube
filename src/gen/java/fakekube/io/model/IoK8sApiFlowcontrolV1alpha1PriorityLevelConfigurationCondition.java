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
  * PriorityLevelConfigurationCondition defines the condition of priority level.
 **/
@ApiModel(description="PriorityLevelConfigurationCondition defines the condition of priority level.")
public class IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationCondition  {
  
  @ApiModelProperty(value = "`lastTransitionTime` is the last time the condition transitioned from one status to another.")
 /**
   * `lastTransitionTime` is the last time the condition transitioned from one status to another.
  **/
  private String lastTransitionTime = null;

  @ApiModelProperty(value = "`message` is a human-readable message indicating details about last transition.")
 /**
   * `message` is a human-readable message indicating details about last transition.
  **/
  private String message = null;

  @ApiModelProperty(value = "`reason` is a unique, one-word, CamelCase reason for the condition's last transition.")
 /**
   * `reason` is a unique, one-word, CamelCase reason for the condition's last transition.
  **/
  private String reason = null;

  @ApiModelProperty(value = "`status` is the status of the condition. Can be True, False, Unknown. Required.")
 /**
   * `status` is the status of the condition. Can be True, False, Unknown. Required.
  **/
  private String status = null;

  @ApiModelProperty(value = "`type` is the type of the condition. Required.")
 /**
   * `type` is the type of the condition. Required.
  **/
  private String type = null;
 /**
   * &#x60;lastTransitionTime&#x60; is the last time the condition transitioned from one status to another.
   * @return lastTransitionTime
  **/
  @JsonProperty("lastTransitionTime")
  public String getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

 /**
   * &#x60;message&#x60; is a human-readable message indicating details about last transition.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationCondition message(String message) {
    this.message = message;
    return this;
  }

 /**
   * &#x60;reason&#x60; is a unique, one-word, CamelCase reason for the condition&#39;s last transition.
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

 /**
   * &#x60;status&#x60; is the status of the condition. Can be True, False, Unknown. Required.
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationCondition status(String status) {
    this.status = status;
    return this;
  }

 /**
   * &#x60;type&#x60; is the type of the condition. Required.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationCondition type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationCondition {\n");
    
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

