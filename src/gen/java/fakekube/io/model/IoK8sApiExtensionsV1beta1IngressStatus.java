package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1LoadBalancerStatus;
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
  * IngressStatus describe the current state of the Ingress.
 **/
@ApiModel(description="IngressStatus describe the current state of the Ingress.")
public class IoK8sApiExtensionsV1beta1IngressStatus  {
  
  @ApiModelProperty(value = "LoadBalancer contains the current status of the load-balancer.")
  @Valid
 /**
   * LoadBalancer contains the current status of the load-balancer.
  **/
  private IoK8sApiCoreV1LoadBalancerStatus loadBalancer = null;
 /**
   * LoadBalancer contains the current status of the load-balancer.
   * @return loadBalancer
  **/
  @JsonProperty("loadBalancer")
  public IoK8sApiCoreV1LoadBalancerStatus getLoadBalancer() {
    return loadBalancer;
  }

  public void setLoadBalancer(IoK8sApiCoreV1LoadBalancerStatus loadBalancer) {
    this.loadBalancer = loadBalancer;
  }

  public IoK8sApiExtensionsV1beta1IngressStatus loadBalancer(IoK8sApiCoreV1LoadBalancerStatus loadBalancer) {
    this.loadBalancer = loadBalancer;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiExtensionsV1beta1IngressStatus {\n");
    
    sb.append("    loadBalancer: ").append(toIndentedString(loadBalancer)).append("\n");
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

