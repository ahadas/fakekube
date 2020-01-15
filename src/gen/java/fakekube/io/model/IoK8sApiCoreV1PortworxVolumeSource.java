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
  * PortworxVolumeSource represents a Portworx volume resource.
 **/
@ApiModel(description="PortworxVolumeSource represents a Portworx volume resource.")
public class IoK8sApiCoreV1PortworxVolumeSource  {
  
  @ApiModelProperty(value = "FSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\". Implicitly inferred to be \"ext4\" if unspecified.")
 /**
   * FSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\". Implicitly inferred to be \"ext4\" if unspecified.
  **/
  private String fsType = null;

  @ApiModelProperty(value = "Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
 /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
  **/
  private Boolean readOnly = null;

  @ApiModelProperty(required = true, value = "VolumeID uniquely identifies a Portworx volume")
 /**
   * VolumeID uniquely identifies a Portworx volume
  **/
  private String volumeID = null;
 /**
   * FSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   * @return fsType
  **/
  @JsonProperty("fsType")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public IoK8sApiCoreV1PortworxVolumeSource fsType(String fsType) {
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

  public IoK8sApiCoreV1PortworxVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

 /**
   * VolumeID uniquely identifies a Portworx volume
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

  public IoK8sApiCoreV1PortworxVolumeSource volumeID(String volumeID) {
    this.volumeID = volumeID;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PortworxVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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

