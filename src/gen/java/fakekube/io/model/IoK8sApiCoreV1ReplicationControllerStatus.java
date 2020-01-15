package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ReplicationControllerCondition;
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
  * ReplicationControllerStatus represents the current status of a replication controller.
 **/
@ApiModel(description="ReplicationControllerStatus represents the current status of a replication controller.")
public class IoK8sApiCoreV1ReplicationControllerStatus  {
  
  @ApiModelProperty(value = "The number of available replicas (ready for at least minReadySeconds) for this replication controller.")
 /**
   * The number of available replicas (ready for at least minReadySeconds) for this replication controller.
  **/
  private Integer availableReplicas = null;

  @ApiModelProperty(value = "Represents the latest available observations of a replication controller's current state.")
  @Valid
 /**
   * Represents the latest available observations of a replication controller's current state.
  **/
  private List<IoK8sApiCoreV1ReplicationControllerCondition> conditions = null;

  @ApiModelProperty(value = "The number of pods that have labels matching the labels of the pod template of the replication controller.")
 /**
   * The number of pods that have labels matching the labels of the pod template of the replication controller.
  **/
  private Integer fullyLabeledReplicas = null;

  @ApiModelProperty(value = "ObservedGeneration reflects the generation of the most recently observed replication controller.")
 /**
   * ObservedGeneration reflects the generation of the most recently observed replication controller.
  **/
  private Long observedGeneration = null;

  @ApiModelProperty(value = "The number of ready replicas for this replication controller.")
 /**
   * The number of ready replicas for this replication controller.
  **/
  private Integer readyReplicas = null;

  @ApiModelProperty(required = true, value = "Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller")
 /**
   * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
  **/
  private Integer replicas = null;
 /**
   * The number of available replicas (ready for at least minReadySeconds) for this replication controller.
   * @return availableReplicas
  **/
  @JsonProperty("availableReplicas")
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }

  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }

  public IoK8sApiCoreV1ReplicationControllerStatus availableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
    return this;
  }

 /**
   * Represents the latest available observations of a replication controller&#39;s current state.
   * @return conditions
  **/
  @JsonProperty("conditions")
  public List<IoK8sApiCoreV1ReplicationControllerCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sApiCoreV1ReplicationControllerCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sApiCoreV1ReplicationControllerStatus conditions(List<IoK8sApiCoreV1ReplicationControllerCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sApiCoreV1ReplicationControllerStatus addConditionsItem(IoK8sApiCoreV1ReplicationControllerCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

 /**
   * The number of pods that have labels matching the labels of the pod template of the replication controller.
   * @return fullyLabeledReplicas
  **/
  @JsonProperty("fullyLabeledReplicas")
  public Integer getFullyLabeledReplicas() {
    return fullyLabeledReplicas;
  }

  public void setFullyLabeledReplicas(Integer fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
  }

  public IoK8sApiCoreV1ReplicationControllerStatus fullyLabeledReplicas(Integer fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
    return this;
  }

 /**
   * ObservedGeneration reflects the generation of the most recently observed replication controller.
   * @return observedGeneration
  **/
  @JsonProperty("observedGeneration")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public IoK8sApiCoreV1ReplicationControllerStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

 /**
   * The number of ready replicas for this replication controller.
   * @return readyReplicas
  **/
  @JsonProperty("readyReplicas")
  public Integer getReadyReplicas() {
    return readyReplicas;
  }

  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }

  public IoK8sApiCoreV1ReplicationControllerStatus readyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
    return this;
  }

 /**
   * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
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

  public IoK8sApiCoreV1ReplicationControllerStatus replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ReplicationControllerStatus {\n");
    
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

