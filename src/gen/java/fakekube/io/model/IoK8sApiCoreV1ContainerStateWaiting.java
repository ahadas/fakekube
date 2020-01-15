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
  * ContainerStateWaiting is a waiting state of a container.
 **/
@ApiModel(description="ContainerStateWaiting is a waiting state of a container.")
public class IoK8sApiCoreV1ContainerStateWaiting  {
  
  @ApiModelProperty(value = "Message regarding why the container is not yet running.")
 /**
   * Message regarding why the container is not yet running.
  **/
  private String message = null;

  @ApiModelProperty(value = "(brief) reason the container is not yet running.")
 /**
   * (brief) reason the container is not yet running.
  **/
  private String reason = null;
 /**
   * Message regarding why the container is not yet running.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApiCoreV1ContainerStateWaiting message(String message) {
    this.message = message;
    return this;
  }

 /**
   * (brief) reason the container is not yet running.
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sApiCoreV1ContainerStateWaiting reason(String reason) {
    this.reason = reason;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ContainerStateWaiting {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

