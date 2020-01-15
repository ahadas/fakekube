package fakekube.io.model;

import fakekube.io.model.IoK8sApiAppsV1DaemonSetCondition;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
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
  * DaemonSetStatus represents the current status of a daemon set.
 **/
@ApiModel(description="DaemonSetStatus represents the current status of a daemon set.")
public class IoK8sApiAppsV1DaemonSetStatus  {
  
  @ApiModelProperty(value = "Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.")
 /**
   * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
  **/
  private Integer collisionCount = null;

  @ApiModelProperty(value = "Represents the latest available observations of a DaemonSet's current state.")
  @Valid
 /**
   * Represents the latest available observations of a DaemonSet's current state.
  **/
  private List<IoK8sApiAppsV1DaemonSetCondition> conditions = null;

  @ApiModelProperty(required = true, value = "The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/")
 /**
   * The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
  **/
  private Integer currentNumberScheduled = null;

  @ApiModelProperty(required = true, value = "The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/")
 /**
   * The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
  **/
  private Integer desiredNumberScheduled = null;

  @ApiModelProperty(value = "The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)")
 /**
   * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)
  **/
  private Integer numberAvailable = null;

  @ApiModelProperty(required = true, value = "The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/")
 /**
   * The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
  **/
  private Integer numberMisscheduled = null;

  @ApiModelProperty(required = true, value = "The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready.")
 /**
   * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready.
  **/
  private Integer numberReady = null;

  @ApiModelProperty(value = "The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)")
 /**
   * The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)
  **/
  private Integer numberUnavailable = null;

  @ApiModelProperty(value = "The most recent generation observed by the daemon set controller.")
 /**
   * The most recent generation observed by the daemon set controller.
  **/
  private Long observedGeneration = null;

  @ApiModelProperty(value = "The total number of nodes that are running updated daemon pod")
 /**
   * The total number of nodes that are running updated daemon pod
  **/
  private Integer updatedNumberScheduled = null;
 /**
   * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
   * @return collisionCount
  **/
  @JsonProperty("collisionCount")
  public Integer getCollisionCount() {
    return collisionCount;
  }

  public void setCollisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
  }

  public IoK8sApiAppsV1DaemonSetStatus collisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
    return this;
  }

 /**
   * Represents the latest available observations of a DaemonSet&#39;s current state.
   * @return conditions
  **/
  @JsonProperty("conditions")
  public List<IoK8sApiAppsV1DaemonSetCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sApiAppsV1DaemonSetCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sApiAppsV1DaemonSetStatus conditions(List<IoK8sApiAppsV1DaemonSetCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sApiAppsV1DaemonSetStatus addConditionsItem(IoK8sApiAppsV1DaemonSetCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

 /**
   * The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
   * @return currentNumberScheduled
  **/
  @JsonProperty("currentNumberScheduled")
  @NotNull
  public Integer getCurrentNumberScheduled() {
    return currentNumberScheduled;
  }

  public void setCurrentNumberScheduled(Integer currentNumberScheduled) {
    this.currentNumberScheduled = currentNumberScheduled;
  }

  public IoK8sApiAppsV1DaemonSetStatus currentNumberScheduled(Integer currentNumberScheduled) {
    this.currentNumberScheduled = currentNumberScheduled;
    return this;
  }

 /**
   * The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
   * @return desiredNumberScheduled
  **/
  @JsonProperty("desiredNumberScheduled")
  @NotNull
  public Integer getDesiredNumberScheduled() {
    return desiredNumberScheduled;
  }

  public void setDesiredNumberScheduled(Integer desiredNumberScheduled) {
    this.desiredNumberScheduled = desiredNumberScheduled;
  }

  public IoK8sApiAppsV1DaemonSetStatus desiredNumberScheduled(Integer desiredNumberScheduled) {
    this.desiredNumberScheduled = desiredNumberScheduled;
    return this;
  }

 /**
   * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds)
   * @return numberAvailable
  **/
  @JsonProperty("numberAvailable")
  public Integer getNumberAvailable() {
    return numberAvailable;
  }

  public void setNumberAvailable(Integer numberAvailable) {
    this.numberAvailable = numberAvailable;
  }

  public IoK8sApiAppsV1DaemonSetStatus numberAvailable(Integer numberAvailable) {
    this.numberAvailable = numberAvailable;
    return this;
  }

 /**
   * The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
   * @return numberMisscheduled
  **/
  @JsonProperty("numberMisscheduled")
  @NotNull
  public Integer getNumberMisscheduled() {
    return numberMisscheduled;
  }

  public void setNumberMisscheduled(Integer numberMisscheduled) {
    this.numberMisscheduled = numberMisscheduled;
  }

  public IoK8sApiAppsV1DaemonSetStatus numberMisscheduled(Integer numberMisscheduled) {
    this.numberMisscheduled = numberMisscheduled;
    return this;
  }

 /**
   * The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready.
   * @return numberReady
  **/
  @JsonProperty("numberReady")
  @NotNull
  public Integer getNumberReady() {
    return numberReady;
  }

  public void setNumberReady(Integer numberReady) {
    this.numberReady = numberReady;
  }

  public IoK8sApiAppsV1DaemonSetStatus numberReady(Integer numberReady) {
    this.numberReady = numberReady;
    return this;
  }

 /**
   * The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds)
   * @return numberUnavailable
  **/
  @JsonProperty("numberUnavailable")
  public Integer getNumberUnavailable() {
    return numberUnavailable;
  }

  public void setNumberUnavailable(Integer numberUnavailable) {
    this.numberUnavailable = numberUnavailable;
  }

  public IoK8sApiAppsV1DaemonSetStatus numberUnavailable(Integer numberUnavailable) {
    this.numberUnavailable = numberUnavailable;
    return this;
  }

 /**
   * The most recent generation observed by the daemon set controller.
   * @return observedGeneration
  **/
  @JsonProperty("observedGeneration")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public IoK8sApiAppsV1DaemonSetStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

 /**
   * The total number of nodes that are running updated daemon pod
   * @return updatedNumberScheduled
  **/
  @JsonProperty("updatedNumberScheduled")
  public Integer getUpdatedNumberScheduled() {
    return updatedNumberScheduled;
  }

  public void setUpdatedNumberScheduled(Integer updatedNumberScheduled) {
    this.updatedNumberScheduled = updatedNumberScheduled;
  }

  public IoK8sApiAppsV1DaemonSetStatus updatedNumberScheduled(Integer updatedNumberScheduled) {
    this.updatedNumberScheduled = updatedNumberScheduled;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAppsV1DaemonSetStatus {\n");
    
    sb.append("    collisionCount: ").append(toIndentedString(collisionCount)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    currentNumberScheduled: ").append(toIndentedString(currentNumberScheduled)).append("\n");
    sb.append("    desiredNumberScheduled: ").append(toIndentedString(desiredNumberScheduled)).append("\n");
    sb.append("    numberAvailable: ").append(toIndentedString(numberAvailable)).append("\n");
    sb.append("    numberMisscheduled: ").append(toIndentedString(numberMisscheduled)).append("\n");
    sb.append("    numberReady: ").append(toIndentedString(numberReady)).append("\n");
    sb.append("    numberUnavailable: ").append(toIndentedString(numberUnavailable)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    updatedNumberScheduled: ").append(toIndentedString(updatedNumberScheduled)).append("\n");
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

