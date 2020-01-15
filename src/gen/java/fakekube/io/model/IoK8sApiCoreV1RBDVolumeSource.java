package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1LocalObjectReference;
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
  * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.
 **/
@ApiModel(description="Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.")
public class IoK8sApiCoreV1RBDVolumeSource  {
  
  @ApiModelProperty(value = "Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd")
 /**
   * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
  **/
  private String fsType = null;

  @ApiModelProperty(required = true, value = "The rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
 /**
   * The rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
  **/
  private String image = null;

  @ApiModelProperty(value = "Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
 /**
   * Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
  **/
  private String keyring = null;

  @ApiModelProperty(required = true, value = "A collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
 /**
   * A collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
  **/
  private List<String> monitors = new ArrayList<String>();

  @ApiModelProperty(value = "The rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
 /**
   * The rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
  **/
  private String pool = null;

  @ApiModelProperty(value = "ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
 /**
   * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
  **/
  private Boolean readOnly = null;

  @ApiModelProperty(value = "SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
  @Valid
 /**
   * SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
  **/
  private IoK8sApiCoreV1LocalObjectReference secretRef = null;

  @ApiModelProperty(value = "The rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it")
 /**
   * The rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
  **/
  private String user = null;
 /**
   * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
   * @return fsType
  **/
  @JsonProperty("fsType")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public IoK8sApiCoreV1RBDVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

 /**
   * The rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return image
  **/
  @JsonProperty("image")
  @NotNull
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public IoK8sApiCoreV1RBDVolumeSource image(String image) {
    this.image = image;
    return this;
  }

 /**
   * Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return keyring
  **/
  @JsonProperty("keyring")
  public String getKeyring() {
    return keyring;
  }

  public void setKeyring(String keyring) {
    this.keyring = keyring;
  }

  public IoK8sApiCoreV1RBDVolumeSource keyring(String keyring) {
    this.keyring = keyring;
    return this;
  }

 /**
   * A collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return monitors
  **/
  @JsonProperty("monitors")
  @NotNull
  public List<String> getMonitors() {
    return monitors;
  }

  public void setMonitors(List<String> monitors) {
    this.monitors = monitors;
  }

  public IoK8sApiCoreV1RBDVolumeSource monitors(List<String> monitors) {
    this.monitors = monitors;
    return this;
  }

  public IoK8sApiCoreV1RBDVolumeSource addMonitorsItem(String monitorsItem) {
    this.monitors.add(monitorsItem);
    return this;
  }

 /**
   * The rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return pool
  **/
  @JsonProperty("pool")
  public String getPool() {
    return pool;
  }

  public void setPool(String pool) {
    this.pool = pool;
  }

  public IoK8sApiCoreV1RBDVolumeSource pool(String pool) {
    this.pool = pool;
    return this;
  }

 /**
   * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return readOnly
  **/
  @JsonProperty("readOnly")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public IoK8sApiCoreV1RBDVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

 /**
   * SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return secretRef
  **/
  @JsonProperty("secretRef")
  public IoK8sApiCoreV1LocalObjectReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }

  public IoK8sApiCoreV1RBDVolumeSource secretRef(IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

 /**
   * The rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
   * @return user
  **/
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public IoK8sApiCoreV1RBDVolumeSource user(String user) {
    this.user = user;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1RBDVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    keyring: ").append(toIndentedString(keyring)).append("\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

