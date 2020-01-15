package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ResourceRequirements;
import fakekube.io.model.IoK8sApiCoreV1TypedLocalObjectReference;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1LabelSelector;
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
  * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
 **/
@ApiModel(description="PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes")
public class IoK8sApiCoreV1PersistentVolumeClaimSpec  {
  
  @ApiModelProperty(value = "AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1")
 /**
   * AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
  **/
  private List<String> accessModes = null;

  @ApiModelProperty(value = "This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and currently VolumeSnapshot is the only supported data source. If the provisioner can support VolumeSnapshot data source, it will create a new volume and data will be restored to the volume at the same time. If the provisioner does not support VolumeSnapshot data source, volume will not be created and the failure will be reported as an event. In the future, we plan to support more data source types and the behavior of the provisioner may change.")
  @Valid
 /**
   * This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and currently VolumeSnapshot is the only supported data source. If the provisioner can support VolumeSnapshot data source, it will create a new volume and data will be restored to the volume at the same time. If the provisioner does not support VolumeSnapshot data source, volume will not be created and the failure will be reported as an event. In the future, we plan to support more data source types and the behavior of the provisioner may change.
  **/
  private IoK8sApiCoreV1TypedLocalObjectReference dataSource = null;

  @ApiModelProperty(value = "Resources represents the minimum resources the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources")
  @Valid
 /**
   * Resources represents the minimum resources the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
  **/
  private IoK8sApiCoreV1ResourceRequirements resources = null;

  @ApiModelProperty(value = "A label query over volumes to consider for binding.")
  @Valid
 /**
   * A label query over volumes to consider for binding.
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector selector = null;

  @ApiModelProperty(value = "Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1")
 /**
   * Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
  **/
  private String storageClassName = null;

  @ApiModelProperty(value = "volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec. This is a beta feature.")
 /**
   * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec. This is a beta feature.
  **/
  private String volumeMode = null;

  @ApiModelProperty(value = "VolumeName is the binding reference to the PersistentVolume backing this claim.")
 /**
   * VolumeName is the binding reference to the PersistentVolume backing this claim.
  **/
  private String volumeName = null;
 /**
   * AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
   * @return accessModes
  **/
  @JsonProperty("accessModes")
  public List<String> getAccessModes() {
    return accessModes;
  }

  public void setAccessModes(List<String> accessModes) {
    this.accessModes = accessModes;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimSpec accessModes(List<String> accessModes) {
    this.accessModes = accessModes;
    return this;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimSpec addAccessModesItem(String accessModesItem) {
    this.accessModes.add(accessModesItem);
    return this;
  }

 /**
   * This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and currently VolumeSnapshot is the only supported data source. If the provisioner can support VolumeSnapshot data source, it will create a new volume and data will be restored to the volume at the same time. If the provisioner does not support VolumeSnapshot data source, volume will not be created and the failure will be reported as an event. In the future, we plan to support more data source types and the behavior of the provisioner may change.
   * @return dataSource
  **/
  @JsonProperty("dataSource")
  public IoK8sApiCoreV1TypedLocalObjectReference getDataSource() {
    return dataSource;
  }

  public void setDataSource(IoK8sApiCoreV1TypedLocalObjectReference dataSource) {
    this.dataSource = dataSource;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimSpec dataSource(IoK8sApiCoreV1TypedLocalObjectReference dataSource) {
    this.dataSource = dataSource;
    return this;
  }

 /**
   * Resources represents the minimum resources the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
   * @return resources
  **/
  @JsonProperty("resources")
  public IoK8sApiCoreV1ResourceRequirements getResources() {
    return resources;
  }

  public void setResources(IoK8sApiCoreV1ResourceRequirements resources) {
    this.resources = resources;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimSpec resources(IoK8sApiCoreV1ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

 /**
   * A label query over volumes to consider for binding.
   * @return selector
  **/
  @JsonProperty("selector")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimSpec selector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

 /**
   * Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
   * @return storageClassName
  **/
  @JsonProperty("storageClassName")
  public String getStorageClassName() {
    return storageClassName;
  }

  public void setStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimSpec storageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
    return this;
  }

 /**
   * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec. This is a beta feature.
   * @return volumeMode
  **/
  @JsonProperty("volumeMode")
  public String getVolumeMode() {
    return volumeMode;
  }

  public void setVolumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimSpec volumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
    return this;
  }

 /**
   * VolumeName is the binding reference to the PersistentVolume backing this claim.
   * @return volumeName
  **/
  @JsonProperty("volumeName")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimSpec volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PersistentVolumeClaimSpec {\n");
    
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
    sb.append("    volumeMode: ").append(toIndentedString(volumeMode)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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

