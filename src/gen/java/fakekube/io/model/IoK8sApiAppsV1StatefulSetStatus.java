package fakekube.io.model;

import fakekube.io.model.IoK8sApiAppsV1StatefulSetCondition;
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
  * StatefulSetStatus represents the current state of a StatefulSet.
 **/
@ApiModel(description="StatefulSetStatus represents the current state of a StatefulSet.")
public class IoK8sApiAppsV1StatefulSetStatus  {
  
  @ApiModelProperty(value = "collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.")
 /**
   * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
  **/
  private Integer collisionCount = null;

  @ApiModelProperty(value = "Represents the latest available observations of a statefulset's current state.")
  @Valid
 /**
   * Represents the latest available observations of a statefulset's current state.
  **/
  private List<IoK8sApiAppsV1StatefulSetCondition> conditions = null;

  @ApiModelProperty(value = "currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.")
 /**
   * currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
  **/
  private Integer currentReplicas = null;

  @ApiModelProperty(value = "currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).")
 /**
   * currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
  **/
  private String currentRevision = null;

  @ApiModelProperty(value = "observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet's generation, which is updated on mutation by the API Server.")
 /**
   * observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet's generation, which is updated on mutation by the API Server.
  **/
  private Long observedGeneration = null;

  @ApiModelProperty(value = "readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready Condition.")
 /**
   * readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready Condition.
  **/
  private Integer readyReplicas = null;

  @ApiModelProperty(required = true, value = "replicas is the number of Pods created by the StatefulSet controller.")
 /**
   * replicas is the number of Pods created by the StatefulSet controller.
  **/
  private Integer replicas = null;

  @ApiModelProperty(value = "updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)")
 /**
   * updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
  **/
  private String updateRevision = null;

  @ApiModelProperty(value = "updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.")
 /**
   * updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
  **/
  private Integer updatedReplicas = null;
 /**
   * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
   * @return collisionCount
  **/
  @JsonProperty("collisionCount")
  public Integer getCollisionCount() {
    return collisionCount;
  }

  public void setCollisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
  }

  public IoK8sApiAppsV1StatefulSetStatus collisionCount(Integer collisionCount) {
    this.collisionCount = collisionCount;
    return this;
  }

 /**
   * Represents the latest available observations of a statefulset&#39;s current state.
   * @return conditions
  **/
  @JsonProperty("conditions")
  public List<IoK8sApiAppsV1StatefulSetCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sApiAppsV1StatefulSetCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sApiAppsV1StatefulSetStatus conditions(List<IoK8sApiAppsV1StatefulSetCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sApiAppsV1StatefulSetStatus addConditionsItem(IoK8sApiAppsV1StatefulSetCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

 /**
   * currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
   * @return currentReplicas
  **/
  @JsonProperty("currentReplicas")
  public Integer getCurrentReplicas() {
    return currentReplicas;
  }

  public void setCurrentReplicas(Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
  }

  public IoK8sApiAppsV1StatefulSetStatus currentReplicas(Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
    return this;
  }

 /**
   * currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
   * @return currentRevision
  **/
  @JsonProperty("currentRevision")
  public String getCurrentRevision() {
    return currentRevision;
  }

  public void setCurrentRevision(String currentRevision) {
    this.currentRevision = currentRevision;
  }

  public IoK8sApiAppsV1StatefulSetStatus currentRevision(String currentRevision) {
    this.currentRevision = currentRevision;
    return this;
  }

 /**
   * observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet&#39;s generation, which is updated on mutation by the API Server.
   * @return observedGeneration
  **/
  @JsonProperty("observedGeneration")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public IoK8sApiAppsV1StatefulSetStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

 /**
   * readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready Condition.
   * @return readyReplicas
  **/
  @JsonProperty("readyReplicas")
  public Integer getReadyReplicas() {
    return readyReplicas;
  }

  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }

  public IoK8sApiAppsV1StatefulSetStatus readyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
    return this;
  }

 /**
   * replicas is the number of Pods created by the StatefulSet controller.
   * @return replicas
  **/
  @JsonProperty("replicas")
  @NotNull
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public IoK8sApiAppsV1StatefulSetStatus replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

 /**
   * updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
   * @return updateRevision
  **/
  @JsonProperty("updateRevision")
  public String getUpdateRevision() {
    return updateRevision;
  }

  public void setUpdateRevision(String updateRevision) {
    this.updateRevision = updateRevision;
  }

  public IoK8sApiAppsV1StatefulSetStatus updateRevision(String updateRevision) {
    this.updateRevision = updateRevision;
    return this;
  }

 /**
   * updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
   * @return updatedReplicas
  **/
  @JsonProperty("updatedReplicas")
  public Integer getUpdatedReplicas() {
    return updatedReplicas;
  }

  public void setUpdatedReplicas(Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
  }

  public IoK8sApiAppsV1StatefulSetStatus updatedReplicas(Integer updatedReplicas) {
    this.updatedReplicas = updatedReplicas;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAppsV1StatefulSetStatus {\n");
    
    sb.append("    collisionCount: ").append(toIndentedString(collisionCount)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    currentReplicas: ").append(toIndentedString(currentReplicas)).append("\n");
    sb.append("    currentRevision: ").append(toIndentedString(currentRevision)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    updateRevision: ").append(toIndentedString(updateRevision)).append("\n");
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

