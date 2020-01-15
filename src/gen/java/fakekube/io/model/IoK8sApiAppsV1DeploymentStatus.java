package fakekube.io.model;

import fakekube.io.model.IoK8sApiAppsV1DeploymentCondition;
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
  * DeploymentStatus is the most recently observed status of the Deployment.
 **/
@ApiModel(description="DeploymentStatus is the most recently observed status of the Deployment.")
public class IoK8sApiAppsV1DeploymentStatus  {
  
  @ApiModelProperty(value = "Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.")
 /**
   * Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
  **/
  private Integer availableReplicas = null;

  @ApiModelProperty(value = "Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.")
 /**
   * Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
  **/
  private Integer collisionCount = null;

  @ApiModelProperty(value = "Represents the latest available observations of a deployment's current state.")
  @Valid
 /**
   * Represents the latest available observations of a deployment's current state.
  **/
  private List<IoK8sApiAppsV1DeploymentCondition> conditions = null;

  @ApiModelProperty(value = "The generation observed by the deployment controller.")
 /**
   * The generation observed by the deployment controller.
  **/
  private Long observedGeneration = null;

  @ApiModelProperty(value = "Total number of ready pods targeted by this deployment.")
 /**
   * Total number of ready pods targeted by this deployment.
  **/
  private Integer readyReplicas = null;

  @ApiModelProperty(value = "Total number of non-terminated pods targeted by this deployment (their labels match the selector).")
 /**
   * Total number of non-terminated pods targeted by this deployment (their labels match the selector).
  **/
  private Integer replicas = null;

  @ApiModelProperty(value = "Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.")
 /**
   * Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.
  **/
  private Integer unavailableReplicas = null;

  @ApiModelProperty(value = "Total number of non-terminated pods targeted by this deployment that have the desired template spec.")
 /**
   * Total number of non-terminated pods targeted by this deployment that have the desired template spec.
  **/
  private Integer updatedReplicas = null;
 /**
   * Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
   * @return availableReplicas
  **/
  @JsonProperty("availableReplicas")
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }

  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }

  public IoK8sApiAppsV1DeploymentStatus availableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
    return this;
  }

 /**
   * Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
   * @return collisionCount
  **/
  @JsonProperty("collisionCount")
  public Integer getCollisionCount() {
    return collisionCount;
  }

  public void setCollisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
  }

  public IoK8sApiAppsV1DeploymentStatus collisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
    return this;
  }

 /**
   * Represents the latest available observations of a deployment&#39;s current state.
   * @return conditions
  **/
  @JsonProperty("conditions")
  public List<IoK8sApiAppsV1DeploymentCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sApiAppsV1DeploymentCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sApiAppsV1DeploymentStatus conditions(List<IoK8sApiAppsV1DeploymentCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sApiAppsV1DeploymentStatus addConditionsItem(IoK8sApiAppsV1DeploymentCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

 /**
   * The generation observed by the deployment controller.
   * @return observedGeneration
  **/
  @JsonProperty("observedGeneration")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public IoK8sApiAppsV1DeploymentStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

 /**
   * Total number of ready pods targeted by this deployment.
   * @return readyReplicas
  **/
  @JsonProperty("readyReplicas")
  public Integer getReadyReplicas() {
    return readyReplicas;
  }

  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }

  public IoK8sApiAppsV1DeploymentStatus readyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
    return this;
  }

 /**
   * Total number of non-terminated pods targeted by this deployment (their labels match the selector).
   * @return replicas
  **/
  @JsonProperty("replicas")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public IoK8sApiAppsV1DeploymentStatus replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

 /**
   * Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.
   * @return unavailableReplicas
  **/
  @JsonProperty("unavailableReplicas")
  public Integer getUnavailableReplicas() {
    return unavailableReplicas;
  }

  public void setUnavailableReplicas(Integer unavailableReplicas) {
    this.unavailableReplicas = unavailableReplicas;
  }

  public IoK8sApiAppsV1DeploymentStatus unavailableReplicas(Integer unavailableReplicas) {
    this.unavailableReplicas = unavailableReplicas;
    return this;
  }

 /**
   * Total number of non-terminated pods targeted by this deployment that have the desired template spec.
   * @return updatedReplicas
  **/
  @JsonProperty("updatedReplicas")
  public Integer getUpdatedReplicas() {
    return updatedReplicas;
  }

  public void setUpdatedReplicas(Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
  }

  public IoK8sApiAppsV1DeploymentStatus updatedReplicas(Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAppsV1DeploymentStatus {\n");
    
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    collisionCount: ").append(toIndentedString(collisionCount)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    unavailableReplicas: ").append(toIndentedString(unavailableReplicas)).append("\n");
    sb.append("    updatedReplicas: ").append(toIndentedString(updatedReplicas)).append("\n");
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

