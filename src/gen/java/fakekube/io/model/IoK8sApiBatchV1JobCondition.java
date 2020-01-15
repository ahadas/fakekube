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
  * JobCondition describes current state of a job.
 **/
@ApiModel(description="JobCondition describes current state of a job.")
public class IoK8sApiBatchV1JobCondition  {
  
  @ApiModelProperty(value = "Last time the condition was checked.")
 /**
   * Last time the condition was checked.
  **/
  private String lastProbeTime = null;

  @ApiModelProperty(value = "Last time the condition transit from one status to another.")
 /**
   * Last time the condition transit from one status to another.
  **/
  private String lastTransitionTime = null;

  @ApiModelProperty(value = "Human readable message indicating details about last transition.")
 /**
   * Human readable message indicating details about last transition.
  **/
  private String message = null;

  @ApiModelProperty(value = "(brief) reason for the condition's last transition.")
 /**
   * (brief) reason for the condition's last transition.
  **/
  private String reason = null;

  @ApiModelProperty(required = true, value = "Status of the condition, one of True, False, Unknown.")
 /**
   * Status of the condition, one of True, False, Unknown.
  **/
  private String status = null;

  @ApiModelProperty(required = true, value = "Type of job condition, Complete or Failed.")
 /**
   * Type of job condition, Complete or Failed.
  **/
  private String type = null;
 /**
   * Last time the condition was checked.
   * @return lastProbeTime
  **/
  @JsonProperty("lastProbeTime")
  public String getLastProbeTime() {
    return lastProbeTime;
  }

  public void setLastProbeTime(String lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
  }

  public IoK8sApiBatchV1JobCondition lastProbeTime(String lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
    return this;
  }

 /**
   * Last time the condition transit from one status to another.
   * @return lastTransitionTime
  **/
  @JsonProperty("lastTransitionTime")
  public String getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public IoK8sApiBatchV1JobCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

 /**
   * Human readable message indicating details about last transition.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApiBatchV1JobCondition message(String message) {
    this.message = message;
    return this;
  }

 /**
   * (brief) reason for the condition&#39;s last transition.
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sApiBatchV1JobCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

 /**
   * Status of the condition, one of True, False, Unknown.
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

  public IoK8sApiBatchV1JobCondition status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Type of job condition, Complete or Failed.
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

  public IoK8sApiBatchV1JobCondition type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiBatchV1JobCondition {\n");
    
    sb.append("    lastProbeTime: ").append(toIndentedString(lastProbeTime)).append("\n");
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

