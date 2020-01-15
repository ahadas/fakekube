package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ObjectFieldSelector;
import fakekube.io.model.IoK8sApiCoreV1ResourceFieldSelector;
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
  * DownwardAPIVolumeFile represents information to create the file containing the pod field
 **/
@ApiModel(description="DownwardAPIVolumeFile represents information to create the file containing the pod field")
public class IoK8sApiCoreV1DownwardAPIVolumeFile  {
  
  @ApiModelProperty(value = "Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.")
  @Valid
 /**
   * Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
  **/
  private IoK8sApiCoreV1ObjectFieldSelector fieldRef = null;

  @ApiModelProperty(value = "Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
 /**
   * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
  **/
  private Integer mode = null;

  @ApiModelProperty(required = true, value = "Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'")
 /**
   * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
  **/
  private String path = null;

  @ApiModelProperty(value = "Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.")
  @Valid
 /**
   * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
  **/
  private IoK8sApiCoreV1ResourceFieldSelector resourceFieldRef = null;
 /**
   * Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
   * @return fieldRef
  **/
  @JsonProperty("fieldRef")
  public IoK8sApiCoreV1ObjectFieldSelector getFieldRef() {
    return fieldRef;
  }

  public void setFieldRef(IoK8sApiCoreV1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
  }

  public IoK8sApiCoreV1DownwardAPIVolumeFile fieldRef(IoK8sApiCoreV1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
    return this;
  }

 /**
   * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   * @return mode
  **/
  @JsonProperty("mode")
  public Integer getMode() {
    return mode;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }

  public IoK8sApiCoreV1DownwardAPIVolumeFile mode(Integer mode) {
    this.mode = mode;
    return this;
  }

 /**
   * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the &#39;..&#39; path. Must be utf-8 encoded. The first item of the relative path must not start with &#39;..&#39;
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

  public IoK8sApiCoreV1DownwardAPIVolumeFile path(String path) {
    this.path = path;
    return this;
  }

 /**
   * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
   * @return resourceFieldRef
  **/
  @JsonProperty("resourceFieldRef")
  public IoK8sApiCoreV1ResourceFieldSelector getResourceFieldRef() {
    return resourceFieldRef;
  }

  public void setResourceFieldRef(IoK8sApiCoreV1ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }

  public IoK8sApiCoreV1DownwardAPIVolumeFile resourceFieldRef(IoK8sApiCoreV1ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1DownwardAPIVolumeFile {\n");
    
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
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

