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
  * EndpointPort is a tuple that describes a single port.
 **/
@ApiModel(description="EndpointPort is a tuple that describes a single port.")
public class IoK8sApiCoreV1EndpointPort  {
  
  @ApiModelProperty(value = "The name of this port.  This must match the 'name' field in the corresponding ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.")
 /**
   * The name of this port.  This must match the 'name' field in the corresponding ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.
  **/
  private String name = null;

  @ApiModelProperty(required = true, value = "The port number of the endpoint.")
 /**
   * The port number of the endpoint.
  **/
  private Integer port = null;

  @ApiModelProperty(value = "The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.")
 /**
   * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
  **/
  private String protocol = null;
 /**
   * The name of this port.  This must match the &#39;name&#39; field in the corresponding ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiCoreV1EndpointPort name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The port number of the endpoint.
   * @return port
  **/
  @JsonProperty("port")
  @NotNull
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public IoK8sApiCoreV1EndpointPort port(Integer port) {
    this.port = port;
    return this;
  }

 /**
   * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
   * @return protocol
  **/
  @JsonProperty("protocol")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public IoK8sApiCoreV1EndpointPort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1EndpointPort {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

