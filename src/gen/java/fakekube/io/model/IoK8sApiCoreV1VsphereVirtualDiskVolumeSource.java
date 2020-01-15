package fakekube.io.model;

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
  * Represents a vSphere volume resource.
 **/
@ApiModel(description="Represents a vSphere volume resource.")
public class IoK8sApiCoreV1VsphereVirtualDiskVolumeSource  {
  
  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
 /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.
  **/
  private String fsType = null;

  @ApiModelProperty(value = "Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.")
 /**
   * Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
  **/
  private String storagePolicyID = null;

  @ApiModelProperty(value = "Storage Policy Based Management (SPBM) profile name.")
 /**
   * Storage Policy Based Management (SPBM) profile name.
  **/
  private String storagePolicyName = null;

  @ApiModelProperty(required = true, value = "Path that identifies vSphere volume vmdk")
 /**
   * Path that identifies vSphere volume vmdk
  **/
  private String volumePath = null;
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

  public IoK8sApiCoreV1VsphereVirtualDiskVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

 /**
   * Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
   * @return storagePolicyID
  **/
  @JsonProperty("storagePolicyID")
  public String getStoragePolicyID() {
    return storagePolicyID;
  }

  public void setStoragePolicyID(String storagePolicyID) {
    this.storagePolicyID = storagePolicyID;
  }

  public IoK8sApiCoreV1VsphereVirtualDiskVolumeSource storagePolicyID(String storagePolicyID) {
    this.storagePolicyID = storagePolicyID;
    return this;
  }

 /**
   * Storage Policy Based Management (SPBM) profile name.
   * @return storagePolicyName
  **/
  @JsonProperty("storagePolicyName")
  public String getStoragePolicyName() {
    return storagePolicyName;
  }

  public void setStoragePolicyName(String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
  }

  public IoK8sApiCoreV1VsphereVirtualDiskVolumeSource storagePolicyName(String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
    return this;
  }

 /**
   * Path that identifies vSphere volume vmdk
   * @return volumePath
  **/
  @JsonProperty("volumePath")
  @NotNull
  public String getVolumePath() {
    return volumePath;
  }

  public void setVolumePath(String volumePath) {
    this.volumePath = volumePath;
  }

  public IoK8sApiCoreV1VsphereVirtualDiskVolumeSource volumePath(String volumePath) {
    this.volumePath = volumePath;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1VsphereVirtualDiskVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    storagePolicyID: ").append(toIndentedString(storagePolicyID)).append("\n");
    sb.append("    storagePolicyName: ").append(toIndentedString(storagePolicyName)).append("\n");
    sb.append("    volumePath: ").append(toIndentedString(volumePath)).append("\n");
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

