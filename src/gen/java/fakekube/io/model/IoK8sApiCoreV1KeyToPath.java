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
  * Maps a string key to a path within a volume.
 **/
@ApiModel(description="Maps a string key to a path within a volume.")
public class IoK8sApiCoreV1KeyToPath  {
  
  @ApiModelProperty(required = true, value = "The key to project.")
 /**
   * The key to project.
  **/
  private String key = null;

  @ApiModelProperty(value = "Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
 /**
   * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
  **/
  private Integer mode = null;

  @ApiModelProperty(required = true, value = "The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.")
 /**
   * The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
  **/
  private String path = null;
 /**
   * The key to project.
   * @return key
  **/
  @JsonProperty("key")
  @NotNull
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public IoK8sApiCoreV1KeyToPath key(String key) {
    this.key = key;
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

  public IoK8sApiCoreV1KeyToPath mode(Integer mode) {
    this.mode = mode;
    return this;
  }

 /**
   * The relative path of the file to map the key to. May not be an absolute path. May not contain the path element &#39;..&#39;. May not start with the string &#39;..&#39;.
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

  public IoK8sApiCoreV1KeyToPath path(String path) {
    this.path = path;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1KeyToPath {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

