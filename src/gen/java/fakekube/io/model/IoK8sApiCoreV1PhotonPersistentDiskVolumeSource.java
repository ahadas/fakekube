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
  * Represents a Photon Controller persistent disk resource.
 **/
@ApiModel(description="Represents a Photon Controller persistent disk resource.")
public class IoK8sApiCoreV1PhotonPersistentDiskVolumeSource  {
  
  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
 /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.
  **/
  private String fsType = null;

  @ApiModelProperty(required = true, value = "ID that identifies Photon Controller persistent disk")
 /**
   * ID that identifies Photon Controller persistent disk
  **/
  private String pdID = null;
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

  public IoK8sApiCoreV1PhotonPersistentDiskVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

 /**
   * ID that identifies Photon Controller persistent disk
   * @return pdID
  **/
  @JsonProperty("pdID")
  @NotNull
  public String getPdID() {
    return pdID;
  }

  public void setPdID(String pdID) {
    this.pdID = pdID;
  }

  public IoK8sApiCoreV1PhotonPersistentDiskVolumeSource pdID(String pdID) {
    this.pdID = pdID;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PhotonPersistentDiskVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    pdID: ").append(toIndentedString(pdID)).append("\n");
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

