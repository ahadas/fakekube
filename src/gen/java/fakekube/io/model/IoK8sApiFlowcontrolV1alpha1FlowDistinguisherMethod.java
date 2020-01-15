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
  * FlowDistinguisherMethod specifies the method of a flow distinguisher.
 **/
@ApiModel(description="FlowDistinguisherMethod specifies the method of a flow distinguisher.")
public class IoK8sApiFlowcontrolV1alpha1FlowDistinguisherMethod  {
  
  @ApiModelProperty(required = true, value = "`type` is the type of flow distinguisher method The supported types are \"ByUser\" and \"ByNamespace\". Required.")
 /**
   * `type` is the type of flow distinguisher method The supported types are \"ByUser\" and \"ByNamespace\". Required.
  **/
  private String type = null;
 /**
   * &#x60;type&#x60; is the type of flow distinguisher method The supported types are \&quot;ByUser\&quot; and \&quot;ByNamespace\&quot;. Required.
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiFlowcontrolV1alpha1FlowDistinguisherMethod type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiFlowcontrolV1alpha1FlowDistinguisherMethod {\n");
    
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

