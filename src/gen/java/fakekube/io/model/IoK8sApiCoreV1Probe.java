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
  * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
 **/
@ApiModel(description="Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.")
public class IoK8sApiCoreV1Probe  {
  
  @ApiModelProperty(value = "One and only one of the following should be specified. Exec specifies the action to take.")
  @Valid
 /**
   * One and only one of the following should be specified. Exec specifies the action to take.
  **/
  private IoK8sApiCoreV1ExecAction exec = null;

  @ApiModelProperty(value = "Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.")
 /**
   * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
  **/
  private Integer failureThreshold = null;

  @ApiModelProperty(value = "HTTPGet specifies the http request to perform.")
  @Valid
 /**
   * HTTPGet specifies the http request to perform.
  **/
  private IoK8sApiCoreV1HTTPGetAction httpGet = null;

  @ApiModelProperty(value = "Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
 /**
   * Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
  **/
  private Integer initialDelaySeconds = null;

  @ApiModelProperty(value = "How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.")
 /**
   * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
  **/
  private Integer periodSeconds = null;

  @ApiModelProperty(value = "Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.")
 /**
   * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
  **/
  private Integer successThreshold = null;

  @ApiModelProperty(value = "TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported")
  @Valid
 /**
   * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
  **/
  private IoK8sApiCoreV1TCPSocketAction tcpSocket = null;

  @ApiModelProperty(value = "Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
 /**
   * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
  **/
  private Integer timeoutSeconds = null;
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

  public IoK8sApiCoreV1Probe exec(IoK8sApiCoreV1ExecAction exec) {
    this.exec = exec;
    return this;
  }

 /**
   * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
   * @return failureThreshold
  **/
  @JsonProperty("failureThreshold")
  public Integer getFailureThreshold() {
    return failureThreshold;
  }

  public void setFailureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
  }

  public IoK8sApiCoreV1Probe failureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
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

  public IoK8sApiCoreV1Probe httpGet(IoK8sApiCoreV1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
    return this;
  }

 /**
   * Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * @return initialDelaySeconds
  **/
  @JsonProperty("initialDelaySeconds")
  public Integer getInitialDelaySeconds() {
    return initialDelaySeconds;
  }

  public void setInitialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
  }

  public IoK8sApiCoreV1Probe initialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
    return this;
  }

 /**
   * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
   * @return periodSeconds
  **/
  @JsonProperty("periodSeconds")
  public Integer getPeriodSeconds() {
    return periodSeconds;
  }

  public void setPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
  }

  public IoK8sApiCoreV1Probe periodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
    return this;
  }

 /**
   * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
   * @return successThreshold
  **/
  @JsonProperty("successThreshold")
  public Integer getSuccessThreshold() {
    return successThreshold;
  }

  public void setSuccessThreshold(Integer successThreshold) {
    this.successThreshold = successThreshold;
  }

  public IoK8sApiCoreV1Probe successThreshold(Integer successThreshold) {
    this.successThreshold = successThreshold;
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

  public IoK8sApiCoreV1Probe tcpSocket(IoK8sApiCoreV1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
    return this;
  }

 /**
   * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * @return timeoutSeconds
  **/
  @JsonProperty("timeoutSeconds")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  public IoK8sApiCoreV1Probe timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Probe {\n");
    
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
    sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    successThreshold: ").append(toIndentedString(successThreshold)).append("\n");
    sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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

