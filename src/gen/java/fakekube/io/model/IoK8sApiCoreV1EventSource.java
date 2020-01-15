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
  * EventSource contains information for an event.
 **/
@ApiModel(description="EventSource contains information for an event.")
public class IoK8sApiCoreV1EventSource  {
  
  @ApiModelProperty(value = "Component from which the event is generated.")
 /**
   * Component from which the event is generated.
  **/
  private String component = null;

  @ApiModelProperty(value = "Node name on which the event is generated.")
 /**
   * Node name on which the event is generated.
  **/
  private String host = null;
 /**
   * Component from which the event is generated.
   * @return component
  **/
  @JsonProperty("component")
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public IoK8sApiCoreV1EventSource component(String component) {
    this.component = component;
    return this;
  }

 /**
   * Node name on which the event is generated.
   * @return host
  **/
  @JsonProperty("host")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public IoK8sApiCoreV1EventSource host(String host) {
    this.host = host;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1EventSource {\n");
    
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
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

