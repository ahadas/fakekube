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
  * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
 **/
@ApiModel(description="AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.")
public class IoK8sApiCoreV1AzureDiskVolumeSource  {
  
  @ApiModelProperty(value = "Host Caching mode: None, Read Only, Read Write.")
 /**
   * Host Caching mode: None, Read Only, Read Write.
  **/
  private String cachingMode = null;

  @ApiModelProperty(required = true, value = "The Name of the data disk in the blob storage")
 /**
   * The Name of the data disk in the blob storage
  **/
  private String diskName = null;

  @ApiModelProperty(required = true, value = "The URI the data disk in the blob storage")
 /**
   * The URI the data disk in the blob storage
  **/
  private String diskURI = null;

  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
 /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.
  **/
  private String fsType = null;

  @ApiModelProperty(value = "Expected values Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared")
 /**
   * Expected values Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared
  **/
  private String kind = null;

  @ApiModelProperty(value = "Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
 /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
  **/
  private Boolean readOnly = null;
 /**
   * Host Caching mode: None, Read Only, Read Write.
   * @return cachingMode
  **/
  @JsonProperty("cachingMode")
  public String getCachingMode() {
    return cachingMode;
  }

  public void setCachingMode(String cachingMode) {
    this.cachingMode = cachingMode;
  }

  public IoK8sApiCoreV1AzureDiskVolumeSource cachingMode(String cachingMode) {
    this.cachingMode = cachingMode;
    return this;
  }

 /**
   * The Name of the data disk in the blob storage
   * @return diskName
  **/
  @JsonProperty("diskName")
  @NotNull
  public String getDiskName() {
    return diskName;
  }

  public void setDiskName(String diskName) {
    this.diskName = diskName;
  }

  public IoK8sApiCoreV1AzureDiskVolumeSource diskName(String diskName) {
    this.diskName = diskName;
    return this;
  }

 /**
   * The URI the data disk in the blob storage
   * @return diskURI
  **/
  @JsonProperty("diskURI")
  @NotNull
  public String getDiskURI() {
    return diskURI;
  }

  public void setDiskURI(String diskURI) {
    this.diskURI = diskURI;
  }

  public IoK8sApiCoreV1AzureDiskVolumeSource diskURI(String diskURI) {
    this.diskURI = diskURI;
    return this;
  }

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

  public IoK8sApiCoreV1AzureDiskVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

 /**
   * Expected values Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared
   * @return kind
  **/
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoK8sApiCoreV1AzureDiskVolumeSource kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/
  @JsonProperty("readOnly")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public IoK8sApiCoreV1AzureDiskVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1AzureDiskVolumeSource {\n");
    
    sb.append("    cachingMode: ").append(toIndentedString(cachingMode)).append("\n");
    sb.append("    diskName: ").append(toIndentedString(diskName)).append("\n");
    sb.append("    diskURI: ").append(toIndentedString(diskURI)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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

