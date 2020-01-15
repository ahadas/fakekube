package fakekube.io.model;

import fakekube.io.model.IoK8sApiAppsV1RollingUpdateStatefulSetStrategy;
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
  * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.
 **/
@ApiModel(description="StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.")
public class IoK8sApiAppsV1StatefulSetUpdateStrategy  {
  
  @ApiModelProperty(value = "RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.")
  @Valid
 /**
   * RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
  **/
  private IoK8sApiAppsV1RollingUpdateStatefulSetStrategy rollingUpdate = null;

  @ApiModelProperty(value = "Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.")
 /**
   * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
  **/
  private String type = null;
 /**
   * RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
   * @return rollingUpdate
  **/
  @JsonProperty("rollingUpdate")
  public IoK8sApiAppsV1RollingUpdateStatefulSetStrategy getRollingUpdate() {
    return rollingUpdate;
  }

  public void setRollingUpdate(IoK8sApiAppsV1RollingUpdateStatefulSetStrategy rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
  }

  public IoK8sApiAppsV1StatefulSetUpdateStrategy rollingUpdate(IoK8sApiAppsV1RollingUpdateStatefulSetStrategy rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
    return this;
  }

 /**
   * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiAppsV1StatefulSetUpdateStrategy type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAppsV1StatefulSetUpdateStrategy {\n");
    
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

