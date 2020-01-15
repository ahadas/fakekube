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
  * PersistentVolumeClaimCondition contails details about state of pvc
 **/
@ApiModel(description="PersistentVolumeClaimCondition contails details about state of pvc")
public class IoK8sApiCoreV1PersistentVolumeClaimCondition  {
  
  @ApiModelProperty(value = "Last time we probed the condition.")
 /**
   * Last time we probed the condition.
  **/
  private String lastProbeTime = null;

  @ApiModelProperty(value = "Last time the condition transitioned from one status to another.")
 /**
   * Last time the condition transitioned from one status to another.
  **/
  private String lastTransitionTime = null;

  @ApiModelProperty(value = "Human-readable message indicating details about last transition.")
 /**
   * Human-readable message indicating details about last transition.
  **/
  private String message = null;

  @ApiModelProperty(value = "Unique, this should be a short, machine understandable string that gives the reason for condition's last transition. If it reports \"ResizeStarted\" that means the underlying persistent volume is being resized.")
 /**
   * Unique, this should be a short, machine understandable string that gives the reason for condition's last transition. If it reports \"ResizeStarted\" that means the underlying persistent volume is being resized.
  **/
  private String reason = null;

  @ApiModelProperty(required = true, value = "")
  private String status = null;

  @ApiModelProperty(required = true, value = "")
  private String type = null;
 /**
   * Last time we probed the condition.
   * @return lastProbeTime
  **/
  @JsonProperty("lastProbeTime")
  public String getLastProbeTime() {
    return lastProbeTime;
  }

  public void setLastProbeTime(String lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimCondition lastProbeTime(String lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
    return this;
  }

 /**
   * Last time the condition transitioned from one status to another.
   * @return lastTransitionTime
  **/
  @JsonProperty("lastTransitionTime")
  public String getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

 /**
   * Human-readable message indicating details about last transition.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimCondition message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Unique, this should be a short, machine understandable string that gives the reason for condition&#39;s last transition. If it reports \&quot;ResizeStarted\&quot; that means the underlying persistent volume is being resized.
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

 /**
   * Get status
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

  public IoK8sApiCoreV1PersistentVolumeClaimCondition status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Get type
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

  public IoK8sApiCoreV1PersistentVolumeClaimCondition type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PersistentVolumeClaimCondition {\n");
    
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

