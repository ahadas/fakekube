package fakekube.io.model;

import io.swagger.annotations.ApiModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
  * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.
 **/
@ApiModel(description="PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.")
public class IoK8sApiPolicyV1beta1PodDisruptionBudgetStatus  {
  
  @ApiModelProperty(required = true, value = "current number of healthy pods")
 /**
   * current number of healthy pods
  **/
  private Integer currentHealthy = null;

  @ApiModelProperty(required = true, value = "minimum desired number of healthy pods")
 /**
   * minimum desired number of healthy pods
  **/
  private Integer desiredHealthy = null;

  @ApiModelProperty(value = "DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn't occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.")
 /**
   * DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn't occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
  **/
  private Map<String, String> disruptedPods = null;

  @ApiModelProperty(required = true, value = "Number of pod disruptions that are currently allowed.")
 /**
   * Number of pod disruptions that are currently allowed.
  **/
  private Integer disruptionsAllowed = null;

  @ApiModelProperty(required = true, value = "total number of pods counted by this disruption budget")
 /**
   * total number of pods counted by this disruption budget
  **/
  private Integer expectedPods = null;

  @ApiModelProperty(value = "Most recent generation observed when updating this PDB status. DisruptionsAllowed and other status information is valid only if observedGeneration equals to PDB's object generation.")
 /**
   * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other status information is valid only if observedGeneration equals to PDB's object generation.
  **/
  private Long observedGeneration = null;
 /**
   * current number of healthy pods
   * @return currentHealthy
  **/
  @JsonProperty("currentHealthy")
  @NotNull
  public Integer getCurrentHealthy() {
    return currentHealthy;
  }

  public void setCurrentHealthy(Integer currentHealthy) {
    this.currentHealthy = currentHealthy;
  }

  public IoK8sApiPolicyV1beta1PodDisruptionBudgetStatus currentHealthy(Integer currentHealthy) {
    this.currentHealthy = currentHealthy;
    return this;
  }

 /**
   * minimum desired number of healthy pods
   * @return desiredHealthy
  **/
  @JsonProperty("desiredHealthy")
  @NotNull
  public Integer getDesiredHealthy() {
    return desiredHealthy;
  }

  public void setDesiredHealthy(Integer desiredHealthy) {
    this.desiredHealthy = desiredHealthy;
  }

  public IoK8sApiPolicyV1beta1PodDisruptionBudgetStatus desiredHealthy(Integer desiredHealthy) {
    this.desiredHealthy = desiredHealthy;
    return this;
  }

 /**
   * DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn&#39;t occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
   * @return disruptedPods
  **/
  @JsonProperty("disruptedPods")
  public Map<String, String> getDisruptedPods() {
    return disruptedPods;
  }

  public void setDisruptedPods(Map<String, String> disruptedPods) {
    this.disruptedPods = disruptedPods;
  }

  public IoK8sApiPolicyV1beta1PodDisruptionBudgetStatus disruptedPods(Map<String, String> disruptedPods) {
    this.disruptedPods = disruptedPods;
    return this;
  }

  public IoK8sApiPolicyV1beta1PodDisruptionBudgetStatus putDisruptedPodsItem(String key, String disruptedPodsItem) {
    this.disruptedPods.put(key, disruptedPodsItem);
    return this;
  }

 /**
   * Number of pod disruptions that are currently allowed.
   * @return disruptionsAllowed
  **/
  @JsonProperty("disruptionsAllowed")
  @NotNull
  public Integer getDisruptionsAllowed() {
    return disruptionsAllowed;
  }

  public void setDisruptionsAllowed(Integer disruptionsAllowed) {
    this.disruptionsAllowed = disruptionsAllowed;
  }

  public IoK8sApiPolicyV1beta1PodDisruptionBudgetStatus disruptionsAllowed(Integer disruptionsAllowed) {
    this.disruptionsAllowed = disruptionsAllowed;
    return this;
  }

 /**
   * total number of pods counted by this disruption budget
   * @return expectedPods
  **/
  @JsonProperty("expectedPods")
  @NotNull
  public Integer getExpectedPods() {
    return expectedPods;
  }

  public void setExpectedPods(Integer expectedPods) {
    this.expectedPods = expectedPods;
  }

  public IoK8sApiPolicyV1beta1PodDisruptionBudgetStatus expectedPods(Integer expectedPods) {
    this.expectedPods = expectedPods;
    return this;
  }

 /**
   * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other status information is valid only if observedGeneration equals to PDB&#39;s object generation.
   * @return observedGeneration
  **/
  @JsonProperty("observedGeneration")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public IoK8sApiPolicyV1beta1PodDisruptionBudgetStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiPolicyV1beta1PodDisruptionBudgetStatus {\n");
    
    sb.append("    currentHealthy: ").append(toIndentedString(currentHealthy)).append("\n");
    sb.append("    desiredHealthy: ").append(toIndentedString(desiredHealthy)).append("\n");
    sb.append("    disruptedPods: ").append(toIndentedString(disruptedPods)).append("\n");
    sb.append("    disruptionsAllowed: ").append(toIndentedString(disruptionsAllowed)).append("\n");
    sb.append("    expectedPods: ").append(toIndentedString(expectedPods)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
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

