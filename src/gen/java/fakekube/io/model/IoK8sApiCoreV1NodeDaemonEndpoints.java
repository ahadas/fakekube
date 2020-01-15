package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1DaemonEndpoint;
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
  * NodeDaemonEndpoints lists ports opened by daemons running on the Node.
 **/
@ApiModel(description="NodeDaemonEndpoints lists ports opened by daemons running on the Node.")
public class IoK8sApiCoreV1NodeDaemonEndpoints  {
  
  @ApiModelProperty(value = "Endpoint on which Kubelet is listening.")
  @Valid
 /**
   * Endpoint on which Kubelet is listening.
  **/
  private IoK8sApiCoreV1DaemonEndpoint kubeletEndpoint = null;
 /**
   * Endpoint on which Kubelet is listening.
   * @return kubeletEndpoint
  **/
  @JsonProperty("kubeletEndpoint")
  public IoK8sApiCoreV1DaemonEndpoint getKubeletEndpoint() {
    return kubeletEndpoint;
  }

  public void setKubeletEndpoint(IoK8sApiCoreV1DaemonEndpoint kubeletEndpoint) {
    this.kubeletEndpoint = kubeletEndpoint;
  }

  public IoK8sApiCoreV1NodeDaemonEndpoints kubeletEndpoint(IoK8sApiCoreV1DaemonEndpoint kubeletEndpoint) {
    this.kubeletEndpoint = kubeletEndpoint;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NodeDaemonEndpoints {\n");
    
    sb.append("    kubeletEndpoint: ").append(toIndentedString(kubeletEndpoint)).append("\n");
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

