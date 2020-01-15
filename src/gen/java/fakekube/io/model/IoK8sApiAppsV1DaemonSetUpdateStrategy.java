package fakekube.io.model;

import fakekube.io.model.IoK8sApiAppsV1RollingUpdateDaemonSet;
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
  * DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
 **/
@ApiModel(description="DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.")
public class IoK8sApiAppsV1DaemonSetUpdateStrategy  {
  
  @ApiModelProperty(value = "Rolling update config params. Present only if type = \"RollingUpdate\".")
  @Valid
 /**
   * Rolling update config params. Present only if type = \"RollingUpdate\".
  **/
  private IoK8sApiAppsV1RollingUpdateDaemonSet rollingUpdate = null;

  @ApiModelProperty(value = "Type of daemon set update. Can be \"RollingUpdate\" or \"OnDelete\". Default is RollingUpdate.")
 /**
   * Type of daemon set update. Can be \"RollingUpdate\" or \"OnDelete\". Default is RollingUpdate.
  **/
  private String type = null;
 /**
   * Rolling update config params. Present only if type &#x3D; \&quot;RollingUpdate\&quot;.
   * @return rollingUpdate
  **/
  @JsonProperty("rollingUpdate")
  public IoK8sApiAppsV1RollingUpdateDaemonSet getRollingUpdate() {
    return rollingUpdate;
  }

  public void setRollingUpdate(IoK8sApiAppsV1RollingUpdateDaemonSet rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
  }

  public IoK8sApiAppsV1DaemonSetUpdateStrategy rollingUpdate(IoK8sApiAppsV1RollingUpdateDaemonSet rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
    return this;
  }

 /**
   * Type of daemon set update. Can be \&quot;RollingUpdate\&quot; or \&quot;OnDelete\&quot;. Default is RollingUpdate.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiAppsV1DaemonSetUpdateStrategy type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAppsV1DaemonSetUpdateStrategy {\n");
    
    sb.append("    rollingUpdate: ").append(toIndentedString(rollingUpdate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

