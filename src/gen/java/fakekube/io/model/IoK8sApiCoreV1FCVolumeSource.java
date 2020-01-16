package fakekube.io.model;

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
  * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
 **/
@ApiModel(description="Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.")
public class IoK8sApiCoreV1FCVolumeSource  {
  
  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
 /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.
  **/
  private String fsType = null;

  @ApiModelProperty(value = "Optional: FC target lun number")
 /**
   * Optional: FC target lun number
  **/
  private Integer lun = null;

  @ApiModelProperty(value = "Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
 /**
   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
  **/
  private Boolean readOnly = null;

  @ApiModelProperty(value = "Optional: FC target worldwide names (WWNs)")
 /**
   * Optional: FC target worldwide names (WWNs)
  **/
  private List<String> targetWWNs = null;

  @ApiModelProperty(value = "Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.")
 /**
   * Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
  **/
  private List<String> wwids = null;
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

  public IoK8sApiCoreV1FCVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

 /**
   * Optional: FC target lun number
   * @return lun
  **/
  @JsonProperty("lun")
  public Integer getLun() {
    return lun;
  }

  public void setLun(Integer lun) {
    this.lun = lun;
  }

  public IoK8sApiCoreV1FCVolumeSource lun(Integer lun) {
    this.lun = lun;
    return this;
  }

 /**
   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/
  @JsonProperty("readOnly")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public IoK8sApiCoreV1FCVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

 /**
   * Optional: FC target worldwide names (WWNs)
   * @return targetWWNs
  **/
  @JsonProperty("targetWWNs")
  public List<String> getTargetWWNs() {
    return targetWWNs;
  }

  public void setTargetWWNs(List<String> targetWWNs) {
    this.targetWWNs = targetWWNs;
  }

  public IoK8sApiCoreV1FCVolumeSource targetWWNs(List<String> targetWWNs) {
    this.targetWWNs = targetWWNs;
    return this;
  }

  public IoK8sApiCoreV1FCVolumeSource addTargetWWNsItem(String targetWWNsItem) {
    this.targetWWNs.add(targetWWNsItem);
    return this;
  }

 /**
   * Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
   * @return wwids
  **/
  @JsonProperty("wwids")
  public List<String> getWwids() {
    return wwids;
  }

  public void setWwids(List<String> wwids) {
    this.wwids = wwids;
  }

  public IoK8sApiCoreV1FCVolumeSource wwids(List<String> wwids) {
    this.wwids = wwids;
    return this;
  }

  public IoK8sApiCoreV1FCVolumeSource addWwidsItem(String wwidsItem) {
    this.wwids.add(wwidsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1FCVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    targetWWNs: ").append(toIndentedString(targetWWNs)).append("\n");
    sb.append("    wwids: ").append(toIndentedString(wwids)).append("\n");
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

