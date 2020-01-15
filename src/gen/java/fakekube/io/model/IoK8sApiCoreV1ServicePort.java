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
  * ServicePort contains information on service's port.
 **/
@ApiModel(description="ServicePort contains information on service's port.")
public class IoK8sApiCoreV1ServicePort  {
  
  @ApiModelProperty(value = "The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.")
 /**
   * The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.
  **/
  private String name = null;

  @ApiModelProperty(value = "The port on each node on which this service is exposed when type=NodePort or LoadBalancer. Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport")
 /**
   * The port on each node on which this service is exposed when type=NodePort or LoadBalancer. Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
  **/
  private Integer nodePort = null;

  @ApiModelProperty(required = true, value = "The port that will be exposed by this service.")
 /**
   * The port that will be exposed by this service.
  **/
  private Integer port = null;

  @ApiModelProperty(value = "The IP protocol for this port. Supports \"TCP\", \"UDP\", and \"SCTP\". Default is TCP.")
 /**
   * The IP protocol for this port. Supports \"TCP\", \"UDP\", and \"SCTP\". Default is TCP.
  **/
  private String protocol = null;

  @ApiModelProperty(value = "Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service")
 /**
   * Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
  **/
  private String targetPort = null;
 /**
   * The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the &#39;name&#39; field in the EndpointPort. Optional if only one ServicePort is defined on this service.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiCoreV1ServicePort name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The port on each node on which this service is exposed when type&#x3D;NodePort or LoadBalancer. Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
   * @return nodePort
  **/
  @JsonProperty("nodePort")
  public Integer getNodePort() {
    return nodePort;
  }

  public void setNodePort(Integer nodePort) {
    this.nodePort = nodePort;
  }

  public IoK8sApiCoreV1ServicePort nodePort(Integer nodePort) {
    this.nodePort = nodePort;
    return this;
  }

 /**
   * The port that will be exposed by this service.
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

  public IoK8sApiCoreV1ServicePort port(Integer port) {
    this.port = port;
    return this;
  }

 /**
   * The IP protocol for this port. Supports \&quot;TCP\&quot;, \&quot;UDP\&quot;, and \&quot;SCTP\&quot;. Default is TCP.
   * @return protocol
  **/
  @JsonProperty("protocol")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public IoK8sApiCoreV1ServicePort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

 /**
   * Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod&#39;s container ports. If this is not specified, the value of the &#39;port&#39; field is used (an identity map). This field is ignored for services with clusterIP&#x3D;None, and should be omitted or set equal to the &#39;port&#39; field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
   * @return targetPort
  **/
  @JsonProperty("targetPort")
  public String getTargetPort() {
    return targetPort;
  }

  public void setTargetPort(String targetPort) {
    this.targetPort = targetPort;
  }

  public IoK8sApiCoreV1ServicePort targetPort(String targetPort) {
    this.targetPort = targetPort;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ServicePort {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodePort: ").append(toIndentedString(nodePort)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
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

