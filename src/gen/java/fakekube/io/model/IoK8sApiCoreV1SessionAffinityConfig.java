package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ClientIPConfig;
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
  * SessionAffinityConfig represents the configurations of session affinity.
 **/
@ApiModel(description="SessionAffinityConfig represents the configurations of session affinity.")
public class IoK8sApiCoreV1SessionAffinityConfig  {
  
  @ApiModelProperty(value = "clientIP contains the configurations of Client IP based session affinity.")
  @Valid
 /**
   * clientIP contains the configurations of Client IP based session affinity.
  **/
  private IoK8sApiCoreV1ClientIPConfig clientIP = null;
 /**
   * clientIP contains the configurations of Client IP based session affinity.
   * @return clientIP
  **/
  @JsonProperty("clientIP")
  public IoK8sApiCoreV1ClientIPConfig getClientIP() {
    return clientIP;
  }

  public void setClientIP(IoK8sApiCoreV1ClientIPConfig clientIP) {
    this.clientIP = clientIP;
  }

  public IoK8sApiCoreV1SessionAffinityConfig clientIP(IoK8sApiCoreV1ClientIPConfig clientIP) {
    this.clientIP = clientIP;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1SessionAffinityConfig {\n");
    
    sb.append("    clientIP: ").append(toIndentedString(clientIP)).append("\n");
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

