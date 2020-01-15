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
  * CustomResourceDefinitionCondition contains details for the current condition of this pod.
 **/
@ApiModel(description="CustomResourceDefinitionCondition contains details for the current condition of this pod.")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionCondition  {
  
  @ApiModelProperty(value = "lastTransitionTime last time the condition transitioned from one status to another.")
 /**
   * lastTransitionTime last time the condition transitioned from one status to another.
  **/
  private String lastTransitionTime = null;

  @ApiModelProperty(value = "message is a human-readable message indicating details about last transition.")
 /**
   * message is a human-readable message indicating details about last transition.
  **/
  private String message = null;

  @ApiModelProperty(value = "reason is a unique, one-word, CamelCase reason for the condition's last transition.")
 /**
   * reason is a unique, one-word, CamelCase reason for the condition's last transition.
  **/
  private String reason = null;

  @ApiModelProperty(required = true, value = "status is the status of the condition. Can be True, False, Unknown.")
 /**
   * status is the status of the condition. Can be True, False, Unknown.
  **/
  private String status = null;

  @ApiModelProperty(required = true, value = "type is the type of the condition. Types include Established, NamesAccepted and Terminating.")
 /**
   * type is the type of the condition. Types include Established, NamesAccepted and Terminating.
  **/
  private String type = null;
 /**
   * lastTransitionTime last time the condition transitioned from one status to another.
   * @return lastTransitionTime
  **/
  @JsonProperty("lastTransitionTime")
  public String getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

 /**
   * message is a human-readable message indicating details about last transition.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionCondition message(String message) {
    this.message = message;
    return this;
  }

 /**
   * reason is a unique, one-word, CamelCase reason for the condition&#39;s last transition.
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

 /**
   * status is the status of the condition. Can be True, False, Unknown.
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

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionCondition status(String status) {
    this.status = status;
    return this;
  }

 /**
   * type is the type of the condition. Types include Established, NamesAccepted and Terminating.
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

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionCondition type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionCondition {\n");
    
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

