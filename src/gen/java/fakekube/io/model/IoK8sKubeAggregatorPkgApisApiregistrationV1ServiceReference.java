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
public class IoK8sKubeAggregatorPkgApisApiregistrationV1ServiceReference  {
  
  @ApiModelProperty(value = "Name is the name of the service")
 /**
   * Name is the name of the service
  **/
  private String name = null;

  @ApiModelProperty(value = "Namespace is the namespace of the service")
 /**
   * Namespace is the namespace of the service
  **/
  private String namespace = null;

  @ApiModelProperty(value = "If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).")
 /**
   * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
  **/
  private Integer port = null;
 /**
   * Name is the name of the service
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1ServiceReference name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Namespace is the namespace of the service
   * @return namespace
  **/
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1ServiceReference namespace(String namespace) {
    this.namespace = namespace;
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

  public IoK8sKubeAggregatorPkgApisApiregistrationV1ServiceReference port(Integer port) {
    this.port = port;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubeAggregatorPkgApisApiregistrationV1ServiceReference {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

