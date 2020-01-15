package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ContainerStateRunning;
import fakekube.io.model.IoK8sApiCoreV1ContainerStateTerminated;
import fakekube.io.model.IoK8sApiCoreV1ContainerStateWaiting;
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
  * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
 **/
@ApiModel(description="ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.")
public class IoK8sApiCoreV1ContainerState  {
  
  @ApiModelProperty(value = "Details about a running container")
  @Valid
 /**
   * Details about a running container
  **/
  private IoK8sApiCoreV1ContainerStateRunning running = null;

  @ApiModelProperty(value = "Details about a terminated container")
  @Valid
 /**
   * Details about a terminated container
  **/
  private IoK8sApiCoreV1ContainerStateTerminated terminated = null;

  @ApiModelProperty(value = "Details about a waiting container")
  @Valid
 /**
   * Details about a waiting container
  **/
  private IoK8sApiCoreV1ContainerStateWaiting waiting = null;
 /**
   * Details about a running container
   * @return running
  **/
  @JsonProperty("running")
  public IoK8sApiCoreV1ContainerStateRunning getRunning() {
    return running;
  }

  public void setRunning(IoK8sApiCoreV1ContainerStateRunning running) {
    this.running = running;
  }

  public IoK8sApiCoreV1ContainerState running(IoK8sApiCoreV1ContainerStateRunning running) {
    this.running = running;
    return this;
  }

 /**
   * Details about a terminated container
   * @return terminated
  **/
  @JsonProperty("terminated")
  public IoK8sApiCoreV1ContainerStateTerminated getTerminated() {
    return terminated;
  }

  public void setTerminated(IoK8sApiCoreV1ContainerStateTerminated terminated) {
    this.terminated = terminated;
  }

  public IoK8sApiCoreV1ContainerState terminated(IoK8sApiCoreV1ContainerStateTerminated terminated) {
    this.terminated = terminated;
    return this;
  }

 /**
   * Details about a waiting container
   * @return waiting
  **/
  @JsonProperty("waiting")
  public IoK8sApiCoreV1ContainerStateWaiting getWaiting() {
    return waiting;
  }

  public void setWaiting(IoK8sApiCoreV1ContainerStateWaiting waiting) {
    this.waiting = waiting;
  }

  public IoK8sApiCoreV1ContainerState waiting(IoK8sApiCoreV1ContainerStateWaiting waiting) {
    this.waiting = waiting;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ContainerState {\n");
    
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    terminated: ").append(toIndentedString(terminated)).append("\n");
    sb.append("    waiting: ").append(toIndentedString(waiting)).append("\n");
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

