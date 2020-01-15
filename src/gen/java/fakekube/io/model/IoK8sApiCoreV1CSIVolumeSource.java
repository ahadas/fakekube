package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1LocalObjectReference;
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
  * Represents a source location of a volume to mount, managed by an external CSI driver
 **/
@ApiModel(description="Represents a source location of a volume to mount, managed by an external CSI driver")
public class IoK8sApiCoreV1CSIVolumeSource  {
  
  @ApiModelProperty(required = true, value = "Driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.")
 /**
   * Driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.
  **/
  private String driver = null;

  @ApiModelProperty(value = "Filesystem type to mount. Ex. \"ext4\", \"xfs\", \"ntfs\". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.")
 /**
   * Filesystem type to mount. Ex. \"ext4\", \"xfs\", \"ntfs\". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
  **/
  private String fsType = null;

  @ApiModelProperty(value = "NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.")
  @Valid
 /**
   * NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.
  **/
  private IoK8sApiCoreV1LocalObjectReference nodePublishSecretRef = null;

  @ApiModelProperty(value = "Specifies a read-only configuration for the volume. Defaults to false (read/write).")
 /**
   * Specifies a read-only configuration for the volume. Defaults to false (read/write).
  **/
  private Boolean readOnly = null;

  @ApiModelProperty(value = "VolumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's documentation for supported values.")
 /**
   * VolumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's documentation for supported values.
  **/
  private Map<String, String> volumeAttributes = null;
 /**
   * Driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.
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

  public IoK8sApiCoreV1CSIVolumeSource driver(String driver) {
    this.driver = driver;
    return this;
  }

 /**
   * Filesystem type to mount. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
   * @return fsType
  **/
  @JsonProperty("fsType")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public IoK8sApiCoreV1CSIVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

 /**
   * NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.
   * @return nodePublishSecretRef
  **/
  @JsonProperty("nodePublishSecretRef")
  public IoK8sApiCoreV1LocalObjectReference getNodePublishSecretRef() {
    return nodePublishSecretRef;
  }

  public void setNodePublishSecretRef(IoK8sApiCoreV1LocalObjectReference nodePublishSecretRef) {
    this.nodePublishSecretRef = nodePublishSecretRef;
  }

  public IoK8sApiCoreV1CSIVolumeSource nodePublishSecretRef(IoK8sApiCoreV1LocalObjectReference nodePublishSecretRef) {
    this.nodePublishSecretRef = nodePublishSecretRef;
    return this;
  }

 /**
   * Specifies a read-only configuration for the volume. Defaults to false (read/write).
   * @return readOnly
  **/
  @JsonProperty("readOnly")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public IoK8sApiCoreV1CSIVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

 /**
   * VolumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver&#39;s documentation for supported values.
   * @return volumeAttributes
  **/
  @JsonProperty("volumeAttributes")
  public Map<String, String> getVolumeAttributes() {
    return volumeAttributes;
  }

  public void setVolumeAttributes(Map<String, String> volumeAttributes) {
    this.volumeAttributes = volumeAttributes;
  }

  public IoK8sApiCoreV1CSIVolumeSource volumeAttributes(Map<String, String> volumeAttributes) {
    this.volumeAttributes = volumeAttributes;
    return this;
  }

  public IoK8sApiCoreV1CSIVolumeSource putVolumeAttributesItem(String key, String volumeAttributesItem) {
    this.volumeAttributes.put(key, volumeAttributesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1CSIVolumeSource {\n");
    
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    nodePublishSecretRef: ").append(toIndentedString(nodePublishSecretRef)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    volumeAttributes: ").append(toIndentedString(volumeAttributes)).append("\n");
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

