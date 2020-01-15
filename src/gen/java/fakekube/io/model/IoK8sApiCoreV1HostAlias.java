package fakekube.io.model;

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
  * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.
 **/
@ApiModel(description="HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.")
public class IoK8sApiCoreV1HostAlias  {
  
  @ApiModelProperty(value = "Hostnames for the above IP address.")
 /**
   * Hostnames for the above IP address.
  **/
  private List<String> hostnames = null;

  @ApiModelProperty(value = "IP address of the host file entry.")
 /**
   * IP address of the host file entry.
  **/
  private String ip = null;
 /**
   * Hostnames for the above IP address.
   * @return hostnames
  **/
  @JsonProperty("hostnames")
  public List<String> getHostnames() {
    return hostnames;
  }

  public void setHostnames(List<String> hostnames) {
    this.hostnames = hostnames;
  }

  public IoK8sApiCoreV1HostAlias hostnames(List<String> hostnames) {
    this.hostnames = hostnames;
    return this;
  }

  public IoK8sApiCoreV1HostAlias addHostnamesItem(String hostnamesItem) {
    this.hostnames.add(hostnamesItem);
    return this;
  }

 /**
   * IP address of the host file entry.
   * @return ip
  **/
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public IoK8sApiCoreV1HostAlias ip(String ip) {
    this.ip = ip;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1HostAlias {\n");
    
    sb.append("    hostnames: ").append(toIndentedString(hostnames)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

