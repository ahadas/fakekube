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
  * EndpointConditions represents the current condition of an endpoint.
 **/
@ApiModel(description="EndpointConditions represents the current condition of an endpoint.")
public class IoK8sApiDiscoveryV1beta1EndpointConditions  {
  
  @ApiModelProperty(value = "ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready.")
 /**
   * ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready.
  **/
  private Boolean ready = null;
 /**
   * ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready.
   * @return ready
  **/
  @JsonProperty("ready")
  public Boolean isReady() {
    return ready;
  }

  public void setReady(Boolean ready) {
    this.ready = ready;
  }

  public IoK8sApiDiscoveryV1beta1EndpointConditions ready(Boolean ready) {
    this.ready = ready;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiDiscoveryV1beta1EndpointConditions {\n");
    
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
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

