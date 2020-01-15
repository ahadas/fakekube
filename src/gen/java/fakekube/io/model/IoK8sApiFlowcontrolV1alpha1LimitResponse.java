package fakekube.io.model;

import fakekube.io.model.IoK8sApiFlowcontrolV1alpha1QueuingConfiguration;
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
  * LimitResponse defines how to handle requests that can not be executed right now.
 **/
@ApiModel(description="LimitResponse defines how to handle requests that can not be executed right now.")
public class IoK8sApiFlowcontrolV1alpha1LimitResponse  {
  
  @ApiModelProperty(value = "`queuing` holds the configuration parameters for queuing. This field may be non-empty only if `type` is `\"Queue\"`.")
  @Valid
 /**
   * `queuing` holds the configuration parameters for queuing. This field may be non-empty only if `type` is `\"Queue\"`.
  **/
  private IoK8sApiFlowcontrolV1alpha1QueuingConfiguration queuing = null;

  @ApiModelProperty(required = true, value = "`type` is \"Queue\" or \"Reject\". \"Queue\" means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. \"Reject\" means that requests that can not be executed upon arrival are rejected. Required.")
 /**
   * `type` is \"Queue\" or \"Reject\". \"Queue\" means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. \"Reject\" means that requests that can not be executed upon arrival are rejected. Required.
  **/
  private String type = null;
 /**
   * &#x60;queuing&#x60; holds the configuration parameters for queuing. This field may be non-empty only if &#x60;type&#x60; is &#x60;\&quot;Queue\&quot;&#x60;.
   * @return queuing
  **/
  @JsonProperty("queuing")
  public IoK8sApiFlowcontrolV1alpha1QueuingConfiguration getQueuing() {
    return queuing;
  }

  public void setQueuing(IoK8sApiFlowcontrolV1alpha1QueuingConfiguration queuing) {
    this.queuing = queuing;
  }

  public IoK8sApiFlowcontrolV1alpha1LimitResponse queuing(IoK8sApiFlowcontrolV1alpha1QueuingConfiguration queuing) {
    this.queuing = queuing;
    return this;
  }

 /**
   * &#x60;type&#x60; is \&quot;Queue\&quot; or \&quot;Reject\&quot;. \&quot;Queue\&quot; means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. \&quot;Reject\&quot; means that requests that can not be executed upon arrival are rejected. Required.
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

  public IoK8sApiFlowcontrolV1alpha1LimitResponse type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiFlowcontrolV1alpha1LimitResponse {\n");
    
    sb.append("    queuing: ").append(toIndentedString(queuing)).append("\n");
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

