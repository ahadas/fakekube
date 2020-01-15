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
  * LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.
 **/
@ApiModel(description="LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.")
public class IoK8sApiCoreV1LoadBalancerIngress  {
  
  @ApiModelProperty(value = "Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers)")
 /**
   * Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers)
  **/
  private String hostname = null;

  @ApiModelProperty(value = "IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)")
 /**
   * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)
  **/
  private String ip = null;
 /**
   * Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers)
   * @return hostname
  **/
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public IoK8sApiCoreV1LoadBalancerIngress hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

 /**
   * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)
   * @return ip
  **/
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public IoK8sApiCoreV1LoadBalancerIngress ip(String ip) {
    this.ip = ip;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1LoadBalancerIngress {\n");
    
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
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

