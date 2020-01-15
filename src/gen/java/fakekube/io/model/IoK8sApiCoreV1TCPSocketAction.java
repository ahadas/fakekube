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
  * TCPSocketAction describes an action based on opening a socket
 **/
@ApiModel(description="TCPSocketAction describes an action based on opening a socket")
public class IoK8sApiCoreV1TCPSocketAction  {
  
  @ApiModelProperty(value = "Optional: Host name to connect to, defaults to the pod IP.")
 /**
   * Optional: Host name to connect to, defaults to the pod IP.
  **/
  private String host = null;

  @ApiModelProperty(required = true, value = "Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.")
 /**
   * Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
  **/
  private String port = null;
 /**
   * Optional: Host name to connect to, defaults to the pod IP.
   * @return host
  **/
  @JsonProperty("host")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public IoK8sApiCoreV1TCPSocketAction host(String host) {
    this.host = host;
    return this;
  }

 /**
   * Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
   * @return port
  **/
  @JsonProperty("port")
  @NotNull
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public IoK8sApiCoreV1TCPSocketAction port(String port) {
    this.port = port;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1TCPSocketAction {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

