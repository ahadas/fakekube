package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1SecretReference;
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
  * Represents storage that is managed by an external CSI volume driver (Beta feature)
 **/
@ApiModel(description="Represents storage that is managed by an external CSI volume driver (Beta feature)")
public class IoK8sApiCoreV1CSIPersistentVolumeSource  {
  
  @ApiModelProperty(value = "ControllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerExpandVolume call. This is an alpha field and requires enabling ExpandCSIVolumes feature gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.")
  @Valid
 /**
   * ControllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerExpandVolume call. This is an alpha field and requires enabling ExpandCSIVolumes feature gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
  **/
  private IoK8sApiCoreV1SecretReference controllerExpandSecretRef = null;

  @ApiModelProperty(value = "ControllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.")
  @Valid
 /**
   * ControllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
  **/
  private IoK8sApiCoreV1SecretReference controllerPublishSecretRef = null;

  @ApiModelProperty(required = true, value = "Driver is the name of the driver to use for this volume. Required.")
 /**
   * Driver is the name of the driver to use for this volume. Required.
  **/
  private String driver = null;

  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\".")
 /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\".
  **/
  private String fsType = null;

  @ApiModelProperty(value = "NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.")
  @Valid
 /**
   * NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
  **/
  private IoK8sApiCoreV1SecretReference nodePublishSecretRef = null;

  @ApiModelProperty(value = "NodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.")
  @Valid
 /**
   * NodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
  **/
  private IoK8sApiCoreV1SecretReference nodeStageSecretRef = null;

  @ApiModelProperty(value = "Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).")
 /**
   * Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).
  **/
  private Boolean readOnly = null;

  @ApiModelProperty(value = "Attributes of the volume to publish.")
 /**
   * Attributes of the volume to publish.
  **/
  private Map<String, String> volumeAttributes = null;

  @ApiModelProperty(required = true, value = "VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.")
 /**
   * VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.
  **/
  private String volumeHandle = null;
 /**
   * ControllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerExpandVolume call. This is an alpha field and requires enabling ExpandCSIVolumes feature gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
   * @return controllerExpandSecretRef
  **/
  @JsonProperty("controllerExpandSecretRef")
  public IoK8sApiCoreV1SecretReference getControllerExpandSecretRef() {
    return controllerExpandSecretRef;
  }

  public void setControllerExpandSecretRef(IoK8sApiCoreV1SecretReference controllerExpandSecretRef) {
    this.controllerExpandSecretRef = controllerExpandSecretRef;
  }

  public IoK8sApiCoreV1CSIPersistentVolumeSource controllerExpandSecretRef(IoK8sApiCoreV1SecretReference controllerExpandSecretRef) {
    this.controllerExpandSecretRef = controllerExpandSecretRef;
    return this;
  }

 /**
   * ControllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
   * @return controllerPublishSecretRef
  **/
  @JsonProperty("controllerPublishSecretRef")
  public IoK8sApiCoreV1SecretReference getControllerPublishSecretRef() {
    return controllerPublishSecretRef;
  }

  public void setControllerPublishSecretRef(IoK8sApiCoreV1SecretReference controllerPublishSecretRef) {
    this.controllerPublishSecretRef = controllerPublishSecretRef;
  }

  public IoK8sApiCoreV1CSIPersistentVolumeSource controllerPublishSecretRef(IoK8sApiCoreV1SecretReference controllerPublishSecretRef) {
    this.controllerPublishSecretRef = controllerPublishSecretRef;
    return this;
  }

 /**
   * Driver is the name of the driver to use for this volume. Required.
   * @return driver
  **/
  @JsonProperty("driver")
  @NotNull
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public IoK8sApiCoreV1CSIPersistentVolumeSource driver(String driver) {
    this.driver = driver;
    return this;
  }

 /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;.
   * @return fsType
  **/
  @JsonProperty("fsType")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public IoK8sApiCoreV1CSIPersistentVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

 /**
   * NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
   * @return nodePublishSecretRef
  **/
  @JsonProperty("nodePublishSecretRef")
  public IoK8sApiCoreV1SecretReference getNodePublishSecretRef() {
    return nodePublishSecretRef;
  }

  public void setNodePublishSecretRef(IoK8sApiCoreV1SecretReference nodePublishSecretRef) {
    this.nodePublishSecretRef = nodePublishSecretRef;
  }

  public IoK8sApiCoreV1CSIPersistentVolumeSource nodePublishSecretRef(IoK8sApiCoreV1SecretReference nodePublishSecretRef) {
    this.nodePublishSecretRef = nodePublishSecretRef;
    return this;
  }

 /**
   * NodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
   * @return nodeStageSecretRef
  **/
  @JsonProperty("nodeStageSecretRef")
  public IoK8sApiCoreV1SecretReference getNodeStageSecretRef() {
    return nodeStageSecretRef;
  }

  public void setNodeStageSecretRef(IoK8sApiCoreV1SecretReference nodeStageSecretRef) {
    this.nodeStageSecretRef = nodeStageSecretRef;
  }

  public IoK8sApiCoreV1CSIPersistentVolumeSource nodeStageSecretRef(IoK8sApiCoreV1SecretReference nodeStageSecretRef) {
    this.nodeStageSecretRef = nodeStageSecretRef;
    return this;
  }

 /**
   * Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).
   * @return readOnly
  **/
  @JsonProperty("readOnly")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public IoK8sApiCoreV1CSIPersistentVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

 /**
   * Attributes of the volume to publish.
   * @return volumeAttributes
  **/
  @JsonProperty("volumeAttributes")
  public Map<String, String> getVolumeAttributes() {
    return volumeAttributes;
  }

  public void setVolumeAttributes(Map<String, String> volumeAttributes) {
    this.volumeAttributes = volumeAttributes;
  }

  public IoK8sApiCoreV1CSIPersistentVolumeSource volumeAttributes(Map<String, String> volumeAttributes) {
    this.volumeAttributes = volumeAttributes;
    return this;
  }

  public IoK8sApiCoreV1CSIPersistentVolumeSource putVolumeAttributesItem(String key, String volumeAttributesItem) {
    this.volumeAttributes.put(key, volumeAttributesItem);
    return this;
  }

 /**
   * VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.
   * @return volumeHandle
  **/
  @JsonProperty("volumeHandle")
  @NotNull
  public String getVolumeHandle() {
    return volumeHandle;
  }

  public void setVolumeHandle(String volumeHandle) {
    this.volumeHandle = volumeHandle;
  }

  public IoK8sApiCoreV1CSIPersistentVolumeSource volumeHandle(String volumeHandle) {
    this.volumeHandle = volumeHandle;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1CSIPersistentVolumeSource {\n");
    
    sb.append("    controllerExpandSecretRef: ").append(toIndentedString(controllerExpandSecretRef)).append("\n");
    sb.append("    controllerPublishSecretRef: ").append(toIndentedString(controllerPublishSecretRef)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    nodePublishSecretRef: ").append(toIndentedString(nodePublishSecretRef)).append("\n");
    sb.append("    nodeStageSecretRef: ").append(toIndentedString(nodeStageSecretRef)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    volumeAttributes: ").append(toIndentedString(volumeAttributes)).append("\n");
    sb.append("    volumeHandle: ").append(toIndentedString(volumeHandle)).append("\n");
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

