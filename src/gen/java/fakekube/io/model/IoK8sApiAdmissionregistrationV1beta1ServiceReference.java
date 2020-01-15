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
  * ServiceReference holds a reference to Service.legacy.k8s.io
 **/
@ApiModel(description="ServiceReference holds a reference to Service.legacy.k8s.io")
public class IoK8sApiAdmissionregistrationV1beta1ServiceReference  {
  
  @ApiModelProperty(required = true, value = "`name` is the name of the service. Required")
 /**
   * `name` is the name of the service. Required
  **/
  private String name = null;

  @ApiModelProperty(required = true, value = "`namespace` is the namespace of the service. Required")
 /**
   * `namespace` is the namespace of the service. Required
  **/
  private String namespace = null;

  @ApiModelProperty(value = "`path` is an optional URL path which will be sent in any request to this service.")
 /**
   * `path` is an optional URL path which will be sent in any request to this service.
  **/
  private String path = null;

  @ApiModelProperty(value = "If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).")
 /**
   * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
  **/
  private Integer port = null;
 /**
   * &#x60;name&#x60; is the name of the service. Required
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiAdmissionregistrationV1beta1ServiceReference name(String name) {
    this.name = name;
    return this;
  }

 /**
   * &#x60;namespace&#x60; is the namespace of the service. Required
   * @return namespace
  **/
  @JsonProperty("namespace")
  @NotNull
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public IoK8sApiAdmissionregistrationV1beta1ServiceReference namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

 /**
   * &#x60;path&#x60; is an optional URL path which will be sent in any request to this service.
   * @return path
  **/
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public IoK8sApiAdmissionregistrationV1beta1ServiceReference path(String path) {
    this.path = path;
    return this;
  }

 /**
   * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. &#x60;port&#x60; should be a valid port number (1-65535, inclusive).
   * @return port
  **/
  @JsonProperty("port")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public IoK8sApiAdmissionregistrationV1beta1ServiceReference port(Integer port) {
    this.port = port;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAdmissionregistrationV1beta1ServiceReference {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

