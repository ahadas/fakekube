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
  * PriorityLevelConfigurationReference contains information that points to the \"request-priority\" being used.
 **/
@ApiModel(description="PriorityLevelConfigurationReference contains information that points to the \"request-priority\" being used.")
public class IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationReference  {
  
  @ApiModelProperty(required = true, value = "`name` is the name of the priority level configuration being referenced Required.")
 /**
   * `name` is the name of the priority level configuration being referenced Required.
  **/
  private String name = null;
 /**
   * &#x60;name&#x60; is the name of the priority level configuration being referenced Required.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationReference name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationReference {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

