package fakekube.io.model;

import fakekube.io.model.IoK8sApiAppsV1ReplicaSetCondition;
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
  * ReplicaSetStatus represents the current status of a ReplicaSet.
 **/
@ApiModel(description="ReplicaSetStatus represents the current status of a ReplicaSet.")
public class IoK8sApiAppsV1ReplicaSetStatus  {
  
  @ApiModelProperty(value = "The number of available replicas (ready for at least minReadySeconds) for this replica set.")
 /**
   * The number of available replicas (ready for at least minReadySeconds) for this replica set.
  **/
  private Integer availableReplicas = null;

  @ApiModelProperty(value = "Represents the latest available observations of a replica set's current state.")
  @Valid
 /**
   * Represents the latest available observations of a replica set's current state.
  **/
  private List<IoK8sApiAppsV1ReplicaSetCondition> conditions = null;

  @ApiModelProperty(value = "The number of pods that have labels matching the labels of the pod template of the replicaset.")
 /**
   * The number of pods that have labels matching the labels of the pod template of the replicaset.
  **/
  private Integer fullyLabeledReplicas = null;

  @ApiModelProperty(value = "ObservedGeneration reflects the generation of the most recently observed ReplicaSet.")
 /**
   * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
  **/
  private Long observedGeneration = null;

  @ApiModelProperty(value = "The number of ready replicas for this replica set.")
 /**
   * The number of ready replicas for this replica set.
  **/
  private Integer readyReplicas = null;

  @ApiModelProperty(required = true, value = "Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller")
 /**
   * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
  **/
  private Integer replicas = null;
 /**
   * The number of available replicas (ready for at least minReadySeconds) for this replica set.
   * @return availableReplicas
  **/
  @JsonProperty("availableReplicas")
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }

  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }

  public IoK8sApiAppsV1ReplicaSetStatus availableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
    return this;
  }

 /**
   * Represents the latest available observations of a replica set&#39;s current state.
   * @return conditions
  **/
  @JsonProperty("conditions")
  public List<IoK8sApiAppsV1ReplicaSetCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sApiAppsV1ReplicaSetCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sApiAppsV1ReplicaSetStatus conditions(List<IoK8sApiAppsV1ReplicaSetCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sApiAppsV1ReplicaSetStatus addConditionsItem(IoK8sApiAppsV1ReplicaSetCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

 /**
   * The number of pods that have labels matching the labels of the pod template of the replicaset.
   * @return fullyLabeledReplicas
  **/
  @JsonProperty("fullyLabeledReplicas")
  public Integer getFullyLabeledReplicas() {
    return fullyLabeledReplicas;
  }

  public void setFullyLabeledReplicas(Integer fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
  }

  public IoK8sApiAppsV1ReplicaSetStatus fullyLabeledReplicas(Integer fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
    return this;
  }

 /**
   * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
   * @return observedGeneration
  **/
  @JsonProperty("observedGeneration")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public IoK8sApiAppsV1ReplicaSetStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

 /**
   * The number of ready replicas for this replica set.
   * @return readyReplicas
  **/
  @JsonProperty("readyReplicas")
  public Integer getReadyReplicas() {
    return readyReplicas;
  }

  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }

  public IoK8sApiAppsV1ReplicaSetStatus readyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
    return this;
  }

 /**
   * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
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

  public IoK8sApiAppsV1ReplicaSetStatus replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAppsV1ReplicaSetStatus {\n");
    
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    fullyLabeledReplicas: ").append(toIndentedString(fullyLabeledReplicas)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
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

