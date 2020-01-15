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
  * NodeAddress contains information for the node's address.
 **/
@ApiModel(description="NodeAddress contains information for the node's address.")
public class IoK8sApiCoreV1NodeAddress  {
  
  @ApiModelProperty(required = true, value = "The node address.")
 /**
   * The node address.
  **/
  private String address = null;

  @ApiModelProperty(required = true, value = "Node address type, one of Hostname, ExternalIP or InternalIP.")
 /**
   * Node address type, one of Hostname, ExternalIP or InternalIP.
  **/
  private String type = null;
 /**
   * The node address.
   * @return address
  **/
  @JsonProperty("address")
  @NotNull
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public IoK8sApiCoreV1NodeAddress address(String address) {
    this.address = address;
    return this;
  }

 /**
   * Node address type, one of Hostname, ExternalIP or InternalIP.
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiCoreV1NodeAddress type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NodeAddress {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

