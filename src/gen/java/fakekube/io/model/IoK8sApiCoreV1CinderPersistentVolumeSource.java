package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1SecretReference;
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
  * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
 **/
@ApiModel(description="Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.")
public class IoK8sApiCoreV1CinderPersistentVolumeSource  {
  
  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
 /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
  **/
  private String fsType = null;

  @ApiModelProperty(value = "Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
 /**
   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
  **/
  private Boolean readOnly = null;

  @ApiModelProperty(value = "Optional: points to a secret object containing parameters used to connect to OpenStack.")
  @Valid
 /**
   * Optional: points to a secret object containing parameters used to connect to OpenStack.
  **/
  private IoK8sApiCoreV1SecretReference secretRef = null;

  @ApiModelProperty(required = true, value = "volume id used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
 /**
   * volume id used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
  **/
  private String volumeID = null;
 /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   * @return fsType
  **/
  @JsonProperty("fsType")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public IoK8sApiCoreV1CinderPersistentVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

 /**
   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   * @return readOnly
  **/
  @JsonProperty("readOnly")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public IoK8sApiCoreV1CinderPersistentVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

 /**
   * Optional: points to a secret object containing parameters used to connect to OpenStack.
   * @return secretRef
  **/
  @JsonProperty("secretRef")
  public IoK8sApiCoreV1SecretReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(IoK8sApiCoreV1SecretReference secretRef) {
    this.secretRef = secretRef;
  }

  public IoK8sApiCoreV1CinderPersistentVolumeSource secretRef(IoK8sApiCoreV1SecretReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

 /**
   * volume id used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   * @return volumeID
  **/
  @JsonProperty("volumeID")
  @NotNull
  public String getVolumeID() {
    return volumeID;
  }

  public void setVolumeID(String volumeID) {
    this.volumeID = volumeID;
  }

  public IoK8sApiCoreV1CinderPersistentVolumeSource volumeID(String volumeID) {
    this.volumeID = volumeID;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1CinderPersistentVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    volumeID: ").append(toIndentedString(volumeID)).append("\n");
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

