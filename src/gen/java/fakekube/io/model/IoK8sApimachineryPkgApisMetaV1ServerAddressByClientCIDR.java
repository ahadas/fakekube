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
  * ServerAddressByClientCIDR helps the client to determine the server address that they should use, depending on the clientCIDR that they match.
 **/
@ApiModel(description="ServerAddressByClientCIDR helps the client to determine the server address that they should use, depending on the clientCIDR that they match.")
public class IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR  {
  
  @ApiModelProperty(required = true, value = "The CIDR with which clients can match their IP to figure out the server address that they should use.")
 /**
   * The CIDR with which clients can match their IP to figure out the server address that they should use.
  **/
  private String clientCIDR = null;

  @ApiModelProperty(required = true, value = "Address of this server, suitable for a client that matches the above CIDR. This can be a hostname, hostname:port, IP or IP:port.")
 /**
   * Address of this server, suitable for a client that matches the above CIDR. This can be a hostname, hostname:port, IP or IP:port.
  **/
  private String serverAddress = null;
 /**
   * The CIDR with which clients can match their IP to figure out the server address that they should use.
   * @return clientCIDR
  **/
  @JsonProperty("clientCIDR")
  @NotNull
  public String getClientCIDR() {
    return clientCIDR;
  }

  public void setClientCIDR(String clientCIDR) {
    this.clientCIDR = clientCIDR;
  }

  public IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR clientCIDR(String clientCIDR) {
    this.clientCIDR = clientCIDR;
    return this;
  }

 /**
   * Address of this server, suitable for a client that matches the above CIDR. This can be a hostname, hostname:port, IP or IP:port.
   * @return serverAddress
  **/
  @JsonProperty("serverAddress")
  @NotNull
  public String getServerAddress() {
    return serverAddress;
  }

  public void setServerAddress(String serverAddress) {
    this.serverAddress = serverAddress;
  }

  public IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR serverAddress(String serverAddress) {
    this.serverAddress = serverAddress;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR {\n");
    
    sb.append("    clientCIDR: ").append(toIndentedString(clientCIDR)).append("\n");
    sb.append("    serverAddress: ").append(toIndentedString(serverAddress)).append("\n");
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

