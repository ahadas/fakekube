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
  * AllowedHostPath defines the host volume conditions that will be enabled by a policy for pods to use. It requires the path prefix to be defined.
 **/
@ApiModel(description="AllowedHostPath defines the host volume conditions that will be enabled by a policy for pods to use. It requires the path prefix to be defined.")
public class IoK8sApiPolicyV1beta1AllowedHostPath  {
  
  @ApiModelProperty(value = "pathPrefix is the path prefix that the host volume must match. It does not support `*`. Trailing slashes are trimmed when validating the path prefix with a host path.  Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food` or `/etc/foo`")
 /**
   * pathPrefix is the path prefix that the host volume must match. It does not support `*`. Trailing slashes are trimmed when validating the path prefix with a host path.  Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food` or `/etc/foo`
  **/
  private String pathPrefix = null;

  @ApiModelProperty(value = "when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.")
 /**
   * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
  **/
  private Boolean readOnly = null;
 /**
   * pathPrefix is the path prefix that the host volume must match. It does not support &#x60;*&#x60;. Trailing slashes are trimmed when validating the path prefix with a host path.  Examples: &#x60;/foo&#x60; would allow &#x60;/foo&#x60;, &#x60;/foo/&#x60; and &#x60;/foo/bar&#x60; &#x60;/foo&#x60; would not allow &#x60;/food&#x60; or &#x60;/etc/foo&#x60;
   * @return pathPrefix
  **/
  @JsonProperty("pathPrefix")
  public String getPathPrefix() {
    return pathPrefix;
  }

  public void setPathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
  }

  public IoK8sApiPolicyV1beta1AllowedHostPath pathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
    return this;
  }

 /**
   * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts are readOnly.
   * @return readOnly
  **/
  @JsonProperty("readOnly")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public IoK8sApiPolicyV1beta1AllowedHostPath readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiPolicyV1beta1AllowedHostPath {\n");
    
    sb.append("    pathPrefix: ").append(toIndentedString(pathPrefix)).append("\n");
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

