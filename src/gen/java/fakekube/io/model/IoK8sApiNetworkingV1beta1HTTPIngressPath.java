package fakekube.io.model;

import fakekube.io.model.IoK8sApiNetworkingV1beta1IngressBackend;
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
  * HTTPIngressPath associates a path regex with a backend. Incoming urls matching the path are forwarded to the backend.
 **/
@ApiModel(description="HTTPIngressPath associates a path regex with a backend. Incoming urls matching the path are forwarded to the backend.")
public class IoK8sApiNetworkingV1beta1HTTPIngressPath  {
  
  @ApiModelProperty(required = true, value = "Backend defines the referenced service endpoint to which the traffic will be forwarded to.")
  @Valid
 /**
   * Backend defines the referenced service endpoint to which the traffic will be forwarded to.
  **/
  private IoK8sApiNetworkingV1beta1IngressBackend backend = null;

  @ApiModelProperty(value = "Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional \"path\" part of a URL as defined by RFC 3986. Paths must begin with a '/'. If unspecified, the path defaults to a catch all sending traffic to the backend.")
 /**
   * Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional \"path\" part of a URL as defined by RFC 3986. Paths must begin with a '/'. If unspecified, the path defaults to a catch all sending traffic to the backend.
  **/
  private String path = null;
 /**
   * Backend defines the referenced service endpoint to which the traffic will be forwarded to.
   * @return backend
  **/
  @JsonProperty("backend")
  @NotNull
  public IoK8sApiNetworkingV1beta1IngressBackend getBackend() {
    return backend;
  }

  public void setBackend(IoK8sApiNetworkingV1beta1IngressBackend backend) {
    this.backend = backend;
  }

  public IoK8sApiNetworkingV1beta1HTTPIngressPath backend(IoK8sApiNetworkingV1beta1IngressBackend backend) {
    this.backend = backend;
    return this;
  }

 /**
   * Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional \&quot;path\&quot; part of a URL as defined by RFC 3986. Paths must begin with a &#39;/&#39;. If unspecified, the path defaults to a catch all sending traffic to the backend.
   * @return path
  **/
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public IoK8sApiNetworkingV1beta1HTTPIngressPath path(String path) {
    this.path = path;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiNetworkingV1beta1HTTPIngressPath {\n");
    
    sb.append("    backend: ").append(toIndentedString(backend)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

