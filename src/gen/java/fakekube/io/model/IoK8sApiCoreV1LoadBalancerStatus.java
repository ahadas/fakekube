package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1LoadBalancerIngress;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
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
  * LoadBalancerStatus represents the status of a load-balancer.
 **/
@ApiModel(description="LoadBalancerStatus represents the status of a load-balancer.")
public class IoK8sApiCoreV1LoadBalancerStatus  {
  
  @ApiModelProperty(value = "Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.")
  @Valid
 /**
   * Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.
  **/
  private List<IoK8sApiCoreV1LoadBalancerIngress> ingress = null;
 /**
   * Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.
   * @return ingress
  **/
  @JsonProperty("ingress")
  public List<IoK8sApiCoreV1LoadBalancerIngress> getIngress() {
    return ingress;
  }

  public void setIngress(List<IoK8sApiCoreV1LoadBalancerIngress> ingress) {
    this.ingress = ingress;
  }

  public IoK8sApiCoreV1LoadBalancerStatus ingress(List<IoK8sApiCoreV1LoadBalancerIngress> ingress) {
    this.ingress = ingress;
    return this;
  }

  public IoK8sApiCoreV1LoadBalancerStatus addIngressItem(IoK8sApiCoreV1LoadBalancerIngress ingressItem) {
    this.ingress.add(ingressItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1LoadBalancerStatus {\n");
    
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
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

