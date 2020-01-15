package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ExecAction;
import fakekube.io.model.IoK8sApiCoreV1HTTPGetAction;
import fakekube.io.model.IoK8sApiCoreV1TCPSocketAction;
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
  * Handler defines a specific action that should be taken
 **/
@ApiModel(description="Handler defines a specific action that should be taken")
public class IoK8sApiCoreV1Handler  {
  
  @ApiModelProperty(value = "One and only one of the following should be specified. Exec specifies the action to take.")
  @Valid
 /**
   * One and only one of the following should be specified. Exec specifies the action to take.
  **/
  private IoK8sApiCoreV1ExecAction exec = null;

  @ApiModelProperty(value = "HTTPGet specifies the http request to perform.")
  @Valid
 /**
   * HTTPGet specifies the http request to perform.
  **/
  private IoK8sApiCoreV1HTTPGetAction httpGet = null;

  @ApiModelProperty(value = "TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported")
  @Valid
 /**
   * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
  **/
  private IoK8sApiCoreV1TCPSocketAction tcpSocket = null;
 /**
   * One and only one of the following should be specified. Exec specifies the action to take.
   * @return exec
  **/
  @JsonProperty("exec")
  public IoK8sApiCoreV1ExecAction getExec() {
    return exec;
  }

  public void setExec(IoK8sApiCoreV1ExecAction exec) {
    this.exec = exec;
  }

  public IoK8sApiCoreV1Handler exec(IoK8sApiCoreV1ExecAction exec) {
    this.exec = exec;
    return this;
  }

 /**
   * HTTPGet specifies the http request to perform.
   * @return httpGet
  **/
  @JsonProperty("httpGet")
  public IoK8sApiCoreV1HTTPGetAction getHttpGet() {
    return httpGet;
  }

  public void setHttpGet(IoK8sApiCoreV1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
  }

  public IoK8sApiCoreV1Handler httpGet(IoK8sApiCoreV1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
    return this;
  }

 /**
   * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
   * @return tcpSocket
  **/
  @JsonProperty("tcpSocket")
  public IoK8sApiCoreV1TCPSocketAction getTcpSocket() {
    return tcpSocket;
  }

  public void setTcpSocket(IoK8sApiCoreV1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
  }

  public IoK8sApiCoreV1Handler tcpSocket(IoK8sApiCoreV1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Handler {\n");
    
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
    sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
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

