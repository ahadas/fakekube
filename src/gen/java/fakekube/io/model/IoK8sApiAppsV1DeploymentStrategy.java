package fakekube.io.model;

import fakekube.io.model.IoK8sApiAppsV1RollingUpdateDeployment;
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
  * DeploymentStrategy describes how to replace existing pods with new ones.
 **/
@ApiModel(description="DeploymentStrategy describes how to replace existing pods with new ones.")
public class IoK8sApiAppsV1DeploymentStrategy  {
  
  @ApiModelProperty(value = "Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.")
  @Valid
 /**
   * Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
  **/
  private IoK8sApiAppsV1RollingUpdateDeployment rollingUpdate = null;

  @ApiModelProperty(value = "Type of deployment. Can be \"Recreate\" or \"RollingUpdate\". Default is RollingUpdate.")
 /**
   * Type of deployment. Can be \"Recreate\" or \"RollingUpdate\". Default is RollingUpdate.
  **/
  private String type = null;
 /**
   * Rolling update config params. Present only if DeploymentStrategyType &#x3D; RollingUpdate.
   * @return rollingUpdate
  **/
  @JsonProperty("rollingUpdate")
  public IoK8sApiAppsV1RollingUpdateDeployment getRollingUpdate() {
    return rollingUpdate;
  }

  public void setRollingUpdate(IoK8sApiAppsV1RollingUpdateDeployment rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
  }

  public IoK8sApiAppsV1DeploymentStrategy rollingUpdate(IoK8sApiAppsV1RollingUpdateDeployment rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
    return this;
  }

 /**
   * Type of deployment. Can be \&quot;Recreate\&quot; or \&quot;RollingUpdate\&quot;. Default is RollingUpdate.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiAppsV1DeploymentStrategy type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAppsV1DeploymentStrategy {\n");
    
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

