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
  * IngressBackend describes all endpoints for a given service and port.
 **/
@ApiModel(description="IngressBackend describes all endpoints for a given service and port.")
public class IoK8sApiNetworkingV1beta1IngressBackend  {
  
  @ApiModelProperty(required = true, value = "Specifies the name of the referenced service.")
 /**
   * Specifies the name of the referenced service.
  **/
  private String serviceName = null;

  @ApiModelProperty(required = true, value = "Specifies the port of the referenced service.")
 /**
   * Specifies the port of the referenced service.
  **/
  private String servicePort = null;
 /**
   * Specifies the name of the referenced service.
   * @return serviceName
  **/
  @JsonProperty("serviceName")
  @NotNull
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public IoK8sApiNetworkingV1beta1IngressBackend serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

 /**
   * Specifies the port of the referenced service.
   * @return servicePort
  **/
  @JsonProperty("servicePort")
  @NotNull
  public String getServicePort() {
    return servicePort;
  }

  public void setServicePort(String servicePort) {
    this.servicePort = servicePort;
  }

  public IoK8sApiNetworkingV1beta1IngressBackend servicePort(String servicePort) {
    this.servicePort = servicePort;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiNetworkingV1beta1IngressBackend {\n");
    
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    servicePort: ").append(toIndentedString(servicePort)).append("\n");
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

