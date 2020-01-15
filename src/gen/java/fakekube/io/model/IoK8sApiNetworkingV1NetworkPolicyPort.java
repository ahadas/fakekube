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
  * NetworkPolicyPort describes a port to allow traffic on
 **/
@ApiModel(description="NetworkPolicyPort describes a port to allow traffic on")
public class IoK8sApiNetworkingV1NetworkPolicyPort  {
  
  @ApiModelProperty(value = "The port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers.")
 /**
   * The port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers.
  **/
  private String port = null;

  @ApiModelProperty(value = "The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.")
 /**
   * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
  **/
  private String protocol = null;
 /**
   * The port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers.
   * @return port
  **/
  @JsonProperty("port")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public IoK8sApiNetworkingV1NetworkPolicyPort port(String port) {
    this.port = port;
    return this;
  }

 /**
   * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
   * @return protocol
  **/
  @JsonProperty("protocol")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public IoK8sApiNetworkingV1NetworkPolicyPort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiNetworkingV1NetworkPolicyPort {\n");
    
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

