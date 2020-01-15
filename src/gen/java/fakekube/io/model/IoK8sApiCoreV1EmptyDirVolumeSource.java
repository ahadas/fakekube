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
  * Represents an empty directory for a pod. Empty directory volumes support ownership management and SELinux relabeling.
 **/
@ApiModel(description="Represents an empty directory for a pod. Empty directory volumes support ownership management and SELinux relabeling.")
public class IoK8sApiCoreV1EmptyDirVolumeSource  {
  
  @ApiModelProperty(value = "What type of storage medium should back this directory. The default is \"\" which means to use the node's default medium. Must be an empty string (default) or Memory. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir")
 /**
   * What type of storage medium should back this directory. The default is \"\" which means to use the node's default medium. Must be an empty string (default) or Memory. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
  **/
  private String medium = null;

  @ApiModelProperty(value = "Total amount of local storage required for this EmptyDir volume. The size limit is also applicable for memory medium. The maximum usage on memory medium EmptyDir would be the minimum value between the SizeLimit specified here and the sum of memory limits of all containers in a pod. The default is nil which means that the limit is undefined. More info: http://kubernetes.io/docs/user-guide/volumes#emptydir")
 /**
   * Total amount of local storage required for this EmptyDir volume. The size limit is also applicable for memory medium. The maximum usage on memory medium EmptyDir would be the minimum value between the SizeLimit specified here and the sum of memory limits of all containers in a pod. The default is nil which means that the limit is undefined. More info: http://kubernetes.io/docs/user-guide/volumes#emptydir
  **/
  private String sizeLimit = null;
 /**
   * What type of storage medium should back this directory. The default is \&quot;\&quot; which means to use the node&#39;s default medium. Must be an empty string (default) or Memory. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
   * @return medium
  **/
  @JsonProperty("medium")
  public String getMedium() {
    return medium;
  }

  public void setMedium(String medium) {
    this.medium = medium;
  }

  public IoK8sApiCoreV1EmptyDirVolumeSource medium(String medium) {
    this.medium = medium;
    return this;
  }

 /**
   * Total amount of local storage required for this EmptyDir volume. The size limit is also applicable for memory medium. The maximum usage on memory medium EmptyDir would be the minimum value between the SizeLimit specified here and the sum of memory limits of all containers in a pod. The default is nil which means that the limit is undefined. More info: http://kubernetes.io/docs/user-guide/volumes#emptydir
   * @return sizeLimit
  **/
  @JsonProperty("sizeLimit")
  public String getSizeLimit() {
    return sizeLimit;
  }

  public void setSizeLimit(String sizeLimit) {
    this.sizeLimit = sizeLimit;
  }

  public IoK8sApiCoreV1EmptyDirVolumeSource sizeLimit(String sizeLimit) {
    this.sizeLimit = sizeLimit;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1EmptyDirVolumeSource {\n");
    
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    sizeLimit: ").append(toIndentedString(sizeLimit)).append("\n");
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

