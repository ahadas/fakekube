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
  * EndpointPort represents a Port used by an EndpointSlice
 **/
@ApiModel(description="EndpointPort represents a Port used by an EndpointSlice")
public class IoK8sApiDiscoveryV1beta1EndpointPort  {
  
  @ApiModelProperty(value = "The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names. Default is empty string.")
 /**
   * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names. Default is empty string.
  **/
  private String appProtocol = null;

  @ApiModelProperty(value = "The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or '-'. * must start and end with an alphanumeric character. Default is empty string.")
 /**
   * The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or '-'. * must start and end with an alphanumeric character. Default is empty string.
  **/
  private String name = null;

  @ApiModelProperty(value = "The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.")
 /**
   * The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
  **/
  private Integer port = null;

  @ApiModelProperty(value = "The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.")
 /**
   * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
  **/
  private String protocol = null;
 /**
   * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names. Default is empty string.
   * @return appProtocol
  **/
  @JsonProperty("appProtocol")
  public String getAppProtocol() {
    return appProtocol;
  }

  public void setAppProtocol(String appProtocol) {
    this.appProtocol = appProtocol;
  }

  public IoK8sApiDiscoveryV1beta1EndpointPort appProtocol(String appProtocol) {
    this.appProtocol = appProtocol;
    return this;
  }

 /**
   * The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or &#39;-&#39;. * must start and end with an alphanumeric character. Default is empty string.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiDiscoveryV1beta1EndpointPort name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
   * @return port
  **/
  @JsonProperty("port")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public IoK8sApiDiscoveryV1beta1EndpointPort port(Integer port) {
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

  public IoK8sApiDiscoveryV1beta1EndpointPort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiDiscoveryV1beta1EndpointPort {\n");
    
    sb.append("    appProtocol: ").append(toIndentedString(appProtocol)).append("\n");
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

