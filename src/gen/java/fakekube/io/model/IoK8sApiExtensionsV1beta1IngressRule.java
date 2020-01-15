package fakekube.io.model;

import fakekube.io.model.IoK8sApiExtensionsV1beta1HTTPIngressRuleValue;
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
  * IngressRule represents the rules mapping the paths under a specified host to the related backend services. Incoming requests are first evaluated for a host match, then routed to the backend associated with the matching IngressRuleValue.
 **/
@ApiModel(description="IngressRule represents the rules mapping the paths under a specified host to the related backend services. Incoming requests are first evaluated for a host match, then routed to the backend associated with the matching IngressRuleValue.")
public class IoK8sApiExtensionsV1beta1IngressRule  {
  
  @ApiModelProperty(value = "Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from the \"host\" part of the URI as defined in the RFC: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to the    IP in the Spec of the parent Ingress. 2. The `:` delimiter is not respected because ports are not allowed.    Currently the port of an Ingress is implicitly :80 for http and    :443 for https. Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.")
 /**
   * Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from the \"host\" part of the URI as defined in the RFC: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to the    IP in the Spec of the parent Ingress. 2. The `:` delimiter is not respected because ports are not allowed.    Currently the port of an Ingress is implicitly :80 for http and    :443 for https. Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
  **/
  private String host = null;

  @ApiModelProperty(value = "")
  @Valid
  private IoK8sApiExtensionsV1beta1HTTPIngressRuleValue http = null;
 /**
   * Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from the \&quot;host\&quot; part of the URI as defined in the RFC: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to the    IP in the Spec of the parent Ingress. 2. The &#x60;:&#x60; delimiter is not respected because ports are not allowed.    Currently the port of an Ingress is implicitly :80 for http and    :443 for https. Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
   * @return host
  **/
  @JsonProperty("host")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public IoK8sApiExtensionsV1beta1IngressRule host(String host) {
    this.host = host;
    return this;
  }

 /**
   * Get http
   * @return http
  **/
  @JsonProperty("http")
  public IoK8sApiExtensionsV1beta1HTTPIngressRuleValue getHttp() {
    return http;
  }

  public void setHttp(IoK8sApiExtensionsV1beta1HTTPIngressRuleValue http) {
    this.http = http;
  }

  public IoK8sApiExtensionsV1beta1IngressRule http(IoK8sApiExtensionsV1beta1HTTPIngressRuleValue http) {
    this.http = http;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiExtensionsV1beta1IngressRule {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
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

