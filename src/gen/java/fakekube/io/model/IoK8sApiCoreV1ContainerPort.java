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
  * ContainerPort represents a network port in a single container.
 **/
@ApiModel(description="ContainerPort represents a network port in a single container.")
public class IoK8sApiCoreV1ContainerPort  {
  
  @ApiModelProperty(required = true, value = "Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.")
 /**
   * Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.
  **/
  private Integer containerPort = null;

  @ApiModelProperty(value = "What host IP to bind the external port to.")
 /**
   * What host IP to bind the external port to.
  **/
  private String hostIP = null;

  @ApiModelProperty(value = "Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.")
 /**
   * Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
  **/
  private Integer hostPort = null;

  @ApiModelProperty(value = "If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.")
 /**
   * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
  **/
  private String name = null;

  @ApiModelProperty(value = "Protocol for port. Must be UDP, TCP, or SCTP. Defaults to \"TCP\".")
 /**
   * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to \"TCP\".
  **/
  private String protocol = null;
 /**
   * Number of port to expose on the pod&#39;s IP address. This must be a valid port number, 0 &lt; x &lt; 65536.
   * @return containerPort
  **/
  @JsonProperty("containerPort")
  @NotNull
  public Integer getContainerPort() {
    return containerPort;
  }

  public void setContainerPort(Integer containerPort) {
    this.containerPort = containerPort;
  }

  public IoK8sApiCoreV1ContainerPort containerPort(Integer containerPort) {
    this.containerPort = containerPort;
    return this;
  }

 /**
   * What host IP to bind the external port to.
   * @return hostIP
  **/
  @JsonProperty("hostIP")
  public String getHostIP() {
    return hostIP;
  }

  public void setHostIP(String hostIP) {
    this.hostIP = hostIP;
  }

  public IoK8sApiCoreV1ContainerPort hostIP(String hostIP) {
    this.hostIP = hostIP;
    return this;
  }

 /**
   * Number of port to expose on the host. If specified, this must be a valid port number, 0 &lt; x &lt; 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
   * @return hostPort
  **/
  @JsonProperty("hostPort")
  public Integer getHostPort() {
    return hostPort;
  }

  public void setHostPort(Integer hostPort) {
    this.hostPort = hostPort;
  }

  public IoK8sApiCoreV1ContainerPort hostPort(Integer hostPort) {
    this.hostPort = hostPort;
    return this;
  }

 /**
   * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiCoreV1ContainerPort name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to \&quot;TCP\&quot;.
   * @return protocol
  **/
  @JsonProperty("protocol")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public IoK8sApiCoreV1ContainerPort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ContainerPort {\n");
    
    sb.append("    containerPort: ").append(toIndentedString(containerPort)).append("\n");
    sb.append("    hostIP: ").append(toIndentedString(hostIP)).append("\n");
    sb.append("    hostPort: ").append(toIndentedString(hostPort)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

