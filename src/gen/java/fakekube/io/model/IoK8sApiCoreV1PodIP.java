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
  * IP address information for entries in the (plural) PodIPs field. Each entry includes:    IP: An IP address allocated to the pod. Routable at least within the cluster.
 **/
@ApiModel(description="IP address information for entries in the (plural) PodIPs field. Each entry includes:    IP: An IP address allocated to the pod. Routable at least within the cluster.")
public class IoK8sApiCoreV1PodIP  {
  
  @ApiModelProperty(value = "ip is an IP address (IPv4 or IPv6) assigned to the pod")
 /**
   * ip is an IP address (IPv4 or IPv6) assigned to the pod
  **/
  private String ip = null;
 /**
   * ip is an IP address (IPv4 or IPv6) assigned to the pod
   * @return ip
  **/
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public IoK8sApiCoreV1PodIP ip(String ip) {
    this.ip = ip;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PodIP {\n");
    
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

