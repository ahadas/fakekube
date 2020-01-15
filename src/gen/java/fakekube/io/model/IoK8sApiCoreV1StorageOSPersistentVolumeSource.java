package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ObjectReference;
import io.swagger.annotations.ApiModel;
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
  * Represents a StorageOS persistent volume resource.
 **/
@ApiModel(description="Represents a StorageOS persistent volume resource.")
public class IoK8sApiCoreV1StorageOSPersistentVolumeSource  {
  
  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
 /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.
  **/
  private String fsType = null;

  @ApiModelProperty(value = "Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
 /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
  **/
  private Boolean readOnly = null;

  @ApiModelProperty(value = "SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.")
  @Valid
 /**
   * SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.
  **/
  private IoK8sApiCoreV1ObjectReference secretRef = null;

  @ApiModelProperty(value = "VolumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.")
 /**
   * VolumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
  **/
  private String volumeName = null;

  @ApiModelProperty(value = "VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to \"default\" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.")
 /**
   * VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to \"default\" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
  **/
  private String volumeNamespace = null;
 /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   * @return fsType
  **/
  @JsonProperty("fsType")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public IoK8sApiCoreV1StorageOSPersistentVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

 /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/
  @JsonProperty("readOnly")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public IoK8sApiCoreV1StorageOSPersistentVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

 /**
   * SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.
   * @return secretRef
  **/
  @JsonProperty("secretRef")
  public IoK8sApiCoreV1ObjectReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(IoK8sApiCoreV1ObjectReference secretRef) {
    this.secretRef = secretRef;
  }

  public IoK8sApiCoreV1StorageOSPersistentVolumeSource secretRef(IoK8sApiCoreV1ObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

 /**
   * VolumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
   * @return volumeName
  **/
  @JsonProperty("volumeName")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }

  public IoK8sApiCoreV1StorageOSPersistentVolumeSource volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

 /**
   * VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod&#39;s namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to \&quot;default\&quot; if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
   * @return volumeNamespace
  **/
  @JsonProperty("volumeNamespace")
  public String getVolumeNamespace() {
    return volumeNamespace;
  }

  public void setVolumeNamespace(String volumeNamespace) {
    this.volumeNamespace = volumeNamespace;
  }

  public IoK8sApiCoreV1StorageOSPersistentVolumeSource volumeNamespace(String volumeNamespace) {
    this.volumeNamespace = volumeNamespace;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1StorageOSPersistentVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
    sb.append("    volumeNamespace: ").append(toIndentedString(volumeNamespace)).append("\n");
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

