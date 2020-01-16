package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ContainerState;
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
  * ContainerStatus contains details for the current status of this container.
 **/
@ApiModel(description="ContainerStatus contains details for the current status of this container.")
public class IoK8sApiCoreV1ContainerStatus  {
  
  @ApiModelProperty(value = "Container's ID in the format 'docker://<container_id>'.")
 /**
   * Container's ID in the format 'docker://<container_id>'.
  **/
  private String containerID = null;

  @ApiModelProperty(required = true, value = "The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images")
 /**
   * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images
  **/
  private String image = null;

  @ApiModelProperty(required = true, value = "ImageID of the container's image.")
 /**
   * ImageID of the container's image.
  **/
  private String imageID = null;

  @ApiModelProperty(value = "Details about the container's last termination condition.")
  @Valid
 /**
   * Details about the container's last termination condition.
  **/
  private IoK8sApiCoreV1ContainerState lastState = null;

  @ApiModelProperty(required = true, value = "This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.")
 /**
   * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
  **/
  private String name = null;

  @ApiModelProperty(required = true, value = "Specifies whether the container has passed its readiness probe.")
 /**
   * Specifies whether the container has passed its readiness probe.
  **/
  private Boolean ready = null;

  @ApiModelProperty(required = true, value = "The number of times the container has been restarted, currently based on the number of dead containers that have not yet been removed. Note that this is calculated from dead containers. But those containers are subject to garbage collection. This value will get capped at 5 by GC.")
 /**
   * The number of times the container has been restarted, currently based on the number of dead containers that have not yet been removed. Note that this is calculated from dead containers. But those containers are subject to garbage collection. This value will get capped at 5 by GC.
  **/
  private Integer restartCount = null;

  @ApiModelProperty(value = "Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.")
 /**
   * Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.
  **/
  private Boolean started = null;

  @ApiModelProperty(value = "Details about the container's current condition.")
  @Valid
 /**
   * Details about the container's current condition.
  **/
  private IoK8sApiCoreV1ContainerState state = null;
 /**
   * Container&#39;s ID in the format &#39;docker://&lt;container_id&gt;&#39;.
   * @return containerID
  **/
  @JsonProperty("containerID")
  public String getContainerID() {
    return containerID;
  }

  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }

  public IoK8sApiCoreV1ContainerStatus containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

 /**
   * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images
   * @return image
  **/
  @JsonProperty("image")
  @NotNull
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public IoK8sApiCoreV1ContainerStatus image(String image) {
    this.image = image;
    return this;
  }

 /**
   * ImageID of the container&#39;s image.
   * @return imageID
  **/
  @JsonProperty("imageID")
  @NotNull
  public String getImageID() {
    return imageID;
  }

  public void setImageID(String imageID) {
    this.imageID = imageID;
  }

  public IoK8sApiCoreV1ContainerStatus imageID(String imageID) {
    this.imageID = imageID;
    return this;
  }

 /**
   * Details about the container&#39;s last termination condition.
   * @return lastState
  **/
  @JsonProperty("lastState")
  public IoK8sApiCoreV1ContainerState getLastState() {
    return lastState;
  }

  public void setLastState(IoK8sApiCoreV1ContainerState lastState) {
    this.lastState = lastState;
  }

  public IoK8sApiCoreV1ContainerStatus lastState(IoK8sApiCoreV1ContainerState lastState) {
    this.lastState = lastState;
    return this;
  }

 /**
   * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiCoreV1ContainerStatus name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Specifies whether the container has passed its readiness probe.
   * @return ready
  **/
  @JsonProperty("ready")
  @NotNull
  public Boolean getReady() {
    return ready;
  }

  public void setReady(Boolean ready) {
    this.ready = ready;
  }

  public IoK8sApiCoreV1ContainerStatus ready(Boolean ready) {
    this.ready = ready;
    return this;
  }

 /**
   * The number of times the container has been restarted, currently based on the number of dead containers that have not yet been removed. Note that this is calculated from dead containers. But those containers are subject to garbage collection. This value will get capped at 5 by GC.
   * @return restartCount
  **/
  @JsonProperty("restartCount")
  @NotNull
  public Integer getRestartCount() {
    return restartCount;
  }

  public void setRestartCount(Integer restartCount) {
    this.restartCount = restartCount;
  }

  public IoK8sApiCoreV1ContainerStatus restartCount(Integer restartCount) {
    this.restartCount = restartCount;
    return this;
  }

 /**
   * Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.
   * @return started
  **/
  @JsonProperty("started")
  public Boolean getStarted() {
    return started;
  }

  public void setStarted(Boolean started) {
    this.started = started;
  }

  public IoK8sApiCoreV1ContainerStatus started(Boolean started) {
    this.started = started;
    return this;
  }

 /**
   * Details about the container&#39;s current condition.
   * @return state
  **/
  @JsonProperty("state")
  public IoK8sApiCoreV1ContainerState getState() {
    return state;
  }

  public void setState(IoK8sApiCoreV1ContainerState state) {
    this.state = state;
  }

  public IoK8sApiCoreV1ContainerStatus state(IoK8sApiCoreV1ContainerState state) {
    this.state = state;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ContainerStatus {\n");
    
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageID: ").append(toIndentedString(imageID)).append("\n");
    sb.append("    lastState: ").append(toIndentedString(lastState)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    restartCount: ").append(toIndentedString(restartCount)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

