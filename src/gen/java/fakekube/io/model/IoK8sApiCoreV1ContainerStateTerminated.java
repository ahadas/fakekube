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
  * ContainerStateTerminated is a terminated state of a container.
 **/
@ApiModel(description="ContainerStateTerminated is a terminated state of a container.")
public class IoK8sApiCoreV1ContainerStateTerminated  {
  
  @ApiModelProperty(value = "Container's ID in the format 'docker://<container_id>'")
 /**
   * Container's ID in the format 'docker://<container_id>'
  **/
  private String containerID = null;

  @ApiModelProperty(required = true, value = "Exit status from the last termination of the container")
 /**
   * Exit status from the last termination of the container
  **/
  private Integer exitCode = null;

  @ApiModelProperty(value = "Time at which the container last terminated")
 /**
   * Time at which the container last terminated
  **/
  private String finishedAt = null;

  @ApiModelProperty(value = "Message regarding the last termination of the container")
 /**
   * Message regarding the last termination of the container
  **/
  private String message = null;

  @ApiModelProperty(value = "(brief) reason from the last termination of the container")
 /**
   * (brief) reason from the last termination of the container
  **/
  private String reason = null;

  @ApiModelProperty(value = "Signal from the last termination of the container")
 /**
   * Signal from the last termination of the container
  **/
  private Integer signal = null;

  @ApiModelProperty(value = "Time at which previous execution of the container started")
 /**
   * Time at which previous execution of the container started
  **/
  private String startedAt = null;
 /**
   * Container&#39;s ID in the format &#39;docker://&lt;container_id&gt;&#39;
   * @return containerID
  **/
  @JsonProperty("containerID")
  public String getContainerID() {
    return containerID;
  }

  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }

  public IoK8sApiCoreV1ContainerStateTerminated containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

 /**
   * Exit status from the last termination of the container
   * @return exitCode
  **/
  @JsonProperty("exitCode")
  @NotNull
  public Integer getExitCode() {
    return exitCode;
  }

  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }

  public IoK8sApiCoreV1ContainerStateTerminated exitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

 /**
   * Time at which the container last terminated
   * @return finishedAt
  **/
  @JsonProperty("finishedAt")
  public String getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(String finishedAt) {
    this.finishedAt = finishedAt;
  }

  public IoK8sApiCoreV1ContainerStateTerminated finishedAt(String finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

 /**
   * Message regarding the last termination of the container
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApiCoreV1ContainerStateTerminated message(String message) {
    this.message = message;
    return this;
  }

 /**
   * (brief) reason from the last termination of the container
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sApiCoreV1ContainerStateTerminated reason(String reason) {
    this.reason = reason;
    return this;
  }

 /**
   * Signal from the last termination of the container
   * @return signal
  **/
  @JsonProperty("signal")
  public Integer getSignal() {
    return signal;
  }

  public void setSignal(Integer signal) {
    this.signal = signal;
  }

  public IoK8sApiCoreV1ContainerStateTerminated signal(Integer signal) {
    this.signal = signal;
    return this;
  }

 /**
   * Time at which previous execution of the container started
   * @return startedAt
  **/
  @JsonProperty("startedAt")
  public String getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }

  public IoK8sApiCoreV1ContainerStateTerminated startedAt(String startedAt) {
    this.startedAt = startedAt;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ContainerStateTerminated {\n");
    
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    signal: ").append(toIndentedString(signal)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
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

