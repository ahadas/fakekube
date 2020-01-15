package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1PersistentVolumeClaimCondition;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
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
  * PersistentVolumeClaimStatus is the current status of a persistent volume claim.
 **/
@ApiModel(description="PersistentVolumeClaimStatus is the current status of a persistent volume claim.")
public class IoK8sApiCoreV1PersistentVolumeClaimStatus  {
  
  @ApiModelProperty(value = "AccessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1")
 /**
   * AccessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
  **/
  private List<String> accessModes = null;

  @ApiModelProperty(value = "Represents the actual resources of the underlying volume.")
 /**
   * Represents the actual resources of the underlying volume.
  **/
  private Map<String, String> capacity = null;

  @ApiModelProperty(value = "Current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to 'ResizeStarted'.")
  @Valid
 /**
   * Current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to 'ResizeStarted'.
  **/
  private List<IoK8sApiCoreV1PersistentVolumeClaimCondition> conditions = null;

  @ApiModelProperty(value = "Phase represents the current phase of PersistentVolumeClaim.")
 /**
   * Phase represents the current phase of PersistentVolumeClaim.
  **/
  private String phase = null;
 /**
   * AccessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
   * @return accessModes
  **/
  @JsonProperty("accessModes")
  public List<String> getAccessModes() {
    return accessModes;
  }

  public void setAccessModes(List<String> accessModes) {
    this.accessModes = accessModes;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimStatus accessModes(List<String> accessModes) {
    this.accessModes = accessModes;
    return this;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimStatus addAccessModesItem(String accessModesItem) {
    this.accessModes.add(accessModesItem);
    return this;
  }

 /**
   * Represents the actual resources of the underlying volume.
   * @return capacity
  **/
  @JsonProperty("capacity")
  public Map<String, String> getCapacity() {
    return capacity;
  }

  public void setCapacity(Map<String, String> capacity) {
    this.capacity = capacity;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimStatus capacity(Map<String, String> capacity) {
    this.capacity = capacity;
    return this;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimStatus putCapacityItem(String key, String capacityItem) {
    this.capacity.put(key, capacityItem);
    return this;
  }

 /**
   * Current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to &#39;ResizeStarted&#39;.
   * @return conditions
  **/
  @JsonProperty("conditions")
  public List<IoK8sApiCoreV1PersistentVolumeClaimCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sApiCoreV1PersistentVolumeClaimCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimStatus conditions(List<IoK8sApiCoreV1PersistentVolumeClaimCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimStatus addConditionsItem(IoK8sApiCoreV1PersistentVolumeClaimCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

 /**
   * Phase represents the current phase of PersistentVolumeClaim.
   * @return phase
  **/
  @JsonProperty("phase")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimStatus phase(String phase) {
    this.phase = phase;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PersistentVolumeClaimStatus {\n");
    
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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

