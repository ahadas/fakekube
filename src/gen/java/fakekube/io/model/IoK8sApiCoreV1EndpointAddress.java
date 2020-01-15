package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ObjectReference;
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
  * EndpointAddress is a tuple that describes single IP address.
 **/
@ApiModel(description="EndpointAddress is a tuple that describes single IP address.")
public class IoK8sApiCoreV1EndpointAddress  {
  
  @ApiModelProperty(value = "The Hostname of this endpoint")
 /**
   * The Hostname of this endpoint
  **/
  private String hostname = null;

  @ApiModelProperty(required = true, value = "The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.")
 /**
   * The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
  **/
  private String ip = null;

  @ApiModelProperty(value = "Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.")
 /**
   * Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.
  **/
  private String nodeName = null;

  @ApiModelProperty(value = "Reference to object providing the endpoint.")
  @Valid
 /**
   * Reference to object providing the endpoint.
  **/
  private IoK8sApiCoreV1ObjectReference targetRef = null;
 /**
   * The Hostname of this endpoint
   * @return hostname
  **/
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public IoK8sApiCoreV1EndpointAddress hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

 /**
   * The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
   * @return ip
  **/
  @JsonProperty("ip")
  @NotNull
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public IoK8sApiCoreV1EndpointAddress ip(String ip) {
    this.ip = ip;
    return this;
  }

 /**
   * Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.
   * @return nodeName
  **/
  @JsonProperty("nodeName")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public IoK8sApiCoreV1EndpointAddress nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

 /**
   * Reference to object providing the endpoint.
   * @return targetRef
  **/
  @JsonProperty("targetRef")
  public IoK8sApiCoreV1ObjectReference getTargetRef() {
    return targetRef;
  }

  public void setTargetRef(IoK8sApiCoreV1ObjectReference targetRef) {
    this.targetRef = targetRef;
  }

  public IoK8sApiCoreV1EndpointAddress targetRef(IoK8sApiCoreV1ObjectReference targetRef) {
    this.targetRef = targetRef;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1EndpointAddress {\n");
    
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
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

