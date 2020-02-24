package fakekube.io.sim.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
  * DeploymentSpec is the specification of the desired behavior of the Deployment.
 **/
@ApiModel(description="DeploymentSpec is the specification of the desired behavior of the Deployment.")
public class IoK8sApiMonitoringV1PrometheusSpec  {
  
  @ApiModelProperty(value = "Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)")
 /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
  **/
  private IoK8sApiMonitoringV1RemoteWrite[] remoteWrite = null;

 /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
   * @return minReadySeconds
  **/
  @JsonProperty("remoteWrite")
  public IoK8sApiMonitoringV1RemoteWrite[] getRemoteWrite() {
    return remoteWrite;
  }

  public void setRemoteWrite(IoK8sApiMonitoringV1RemoteWrite[] remoteWrite) {
    this.remoteWrite = remoteWrite;
  }

  public IoK8sApiMonitoringV1PrometheusSpec remoteWrite(IoK8sApiMonitoringV1RemoteWrite[] remoteWrite) {
    this.remoteWrite = remoteWrite;
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiMonitoringV1PrometheusSpec {\n");
    
    sb.append("    remoteWrite: ").append(toIndentedString(remoteWrite)).append("\n");
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

