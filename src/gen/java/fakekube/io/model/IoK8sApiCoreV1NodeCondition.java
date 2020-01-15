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
  * NodeCondition contains condition information for a node.
 **/
@ApiModel(description="NodeCondition contains condition information for a node.")
public class IoK8sApiCoreV1NodeCondition  {
  
  @ApiModelProperty(value = "Last time we got an update on a given condition.")
 /**
   * Last time we got an update on a given condition.
  **/
  private String lastHeartbeatTime = null;

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

  @ApiModelProperty(required = true, value = "Type of node condition.")
 /**
   * Type of node condition.
  **/
  private String type = null;
 /**
   * Last time we got an update on a given condition.
   * @return lastHeartbeatTime
  **/
  @JsonProperty("lastHeartbeatTime")
  public String getLastHeartbeatTime() {
    return lastHeartbeatTime;
  }

  public void setLastHeartbeatTime(String lastHeartbeatTime) {
    this.lastHeartbeatTime = lastHeartbeatTime;
  }

  public IoK8sApiCoreV1NodeCondition lastHeartbeatTime(String lastHeartbeatTime) {
    this.lastHeartbeatTime = lastHeartbeatTime;
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

  public IoK8sApiCoreV1NodeCondition lastTransitionTime(String lastTransitionTime) {
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

  public IoK8sApiCoreV1NodeCondition message(String message) {
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

  public IoK8sApiCoreV1NodeCondition reason(String reason) {
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

  public IoK8sApiCoreV1NodeCondition status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Type of node condition.
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

  public IoK8sApiCoreV1NodeCondition type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NodeCondition {\n");
    
    sb.append("    lastHeartbeatTime: ").append(toIndentedString(lastHeartbeatTime)).append("\n");
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

