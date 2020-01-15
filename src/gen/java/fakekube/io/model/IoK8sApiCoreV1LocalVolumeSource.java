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
  * Local represents directly-attached storage with node affinity (Beta feature)
 **/
@ApiModel(description="Local represents directly-attached storage with node affinity (Beta feature)")
public class IoK8sApiCoreV1LocalVolumeSource  {
  
  @ApiModelProperty(value = "Filesystem type to mount. It applies only when the Path is a block device. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". The default value is to auto-select a fileystem if unspecified.")
 /**
   * Filesystem type to mount. It applies only when the Path is a block device. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". The default value is to auto-select a fileystem if unspecified.
  **/
  private String fsType = null;

  @ApiModelProperty(required = true, value = "The full path to the volume on the node. It can be either a directory or block device (disk, partition, ...).")
 /**
   * The full path to the volume on the node. It can be either a directory or block device (disk, partition, ...).
  **/
  private String path = null;
 /**
   * Filesystem type to mount. It applies only when the Path is a block device. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. The default value is to auto-select a fileystem if unspecified.
   * @return fsType
  **/
  @JsonProperty("fsType")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public IoK8sApiCoreV1LocalVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

 /**
   * The full path to the volume on the node. It can be either a directory or block device (disk, partition, ...).
   * @return path
  **/
  @JsonProperty("path")
  @NotNull
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public IoK8sApiCoreV1LocalVolumeSource path(String path) {
    this.path = path;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1LocalVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

