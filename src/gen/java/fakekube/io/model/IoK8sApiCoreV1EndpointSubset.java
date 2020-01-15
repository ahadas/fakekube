package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1EndpointAddress;
import fakekube.io.model.IoK8sApiCoreV1EndpointPort;
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
  * EndpointSubset is a group of addresses with a common set of ports. The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:   {     Addresses: [{\"ip\": \"10.10.1.1\"}, {\"ip\": \"10.10.2.2\"}],     Ports:     [{\"name\": \"a\", \"port\": 8675}, {\"name\": \"b\", \"port\": 309}]   } The resulting set of endpoints can be viewed as:     a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],     b: [ 10.10.1.1:309, 10.10.2.2:309 ]
 **/
@ApiModel(description="EndpointSubset is a group of addresses with a common set of ports. The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:   {     Addresses: [{\"ip\": \"10.10.1.1\"}, {\"ip\": \"10.10.2.2\"}],     Ports:     [{\"name\": \"a\", \"port\": 8675}, {\"name\": \"b\", \"port\": 309}]   } The resulting set of endpoints can be viewed as:     a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],     b: [ 10.10.1.1:309, 10.10.2.2:309 ]")
public class IoK8sApiCoreV1EndpointSubset  {
  
  @ApiModelProperty(value = "IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.")
  @Valid
 /**
   * IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
  **/
  private List<IoK8sApiCoreV1EndpointAddress> addresses = null;

  @ApiModelProperty(value = "IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.")
  @Valid
 /**
   * IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
  **/
  private List<IoK8sApiCoreV1EndpointAddress> notReadyAddresses = null;

  @ApiModelProperty(value = "Port numbers available on the related IP addresses.")
  @Valid
 /**
   * Port numbers available on the related IP addresses.
  **/
  private List<IoK8sApiCoreV1EndpointPort> ports = null;
 /**
   * IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
   * @return addresses
  **/
  @JsonProperty("addresses")
  public List<IoK8sApiCoreV1EndpointAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<IoK8sApiCoreV1EndpointAddress> addresses) {
    this.addresses = addresses;
  }

  public IoK8sApiCoreV1EndpointSubset addresses(List<IoK8sApiCoreV1EndpointAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public IoK8sApiCoreV1EndpointSubset addAddressesItem(IoK8sApiCoreV1EndpointAddress addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

 /**
   * IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
   * @return notReadyAddresses
  **/
  @JsonProperty("notReadyAddresses")
  public List<IoK8sApiCoreV1EndpointAddress> getNotReadyAddresses() {
    return notReadyAddresses;
  }

  public void setNotReadyAddresses(List<IoK8sApiCoreV1EndpointAddress> notReadyAddresses) {
    this.notReadyAddresses = notReadyAddresses;
  }

  public IoK8sApiCoreV1EndpointSubset notReadyAddresses(List<IoK8sApiCoreV1EndpointAddress> notReadyAddresses) {
    this.notReadyAddresses = notReadyAddresses;
    return this;
  }

  public IoK8sApiCoreV1EndpointSubset addNotReadyAddressesItem(IoK8sApiCoreV1EndpointAddress notReadyAddressesItem) {
    this.notReadyAddresses.add(notReadyAddressesItem);
    return this;
  }

 /**
   * Port numbers available on the related IP addresses.
   * @return ports
  **/
  @JsonProperty("ports")
  public List<IoK8sApiCoreV1EndpointPort> getPorts() {
    return ports;
  }

  public void setPorts(List<IoK8sApiCoreV1EndpointPort> ports) {
    this.ports = ports;
  }

  public IoK8sApiCoreV1EndpointSubset ports(List<IoK8sApiCoreV1EndpointPort> ports) {
    this.ports = ports;
    return this;
  }

  public IoK8sApiCoreV1EndpointSubset addPortsItem(IoK8sApiCoreV1EndpointPort portsItem) {
    this.ports.add(portsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1EndpointSubset {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    notReadyAddresses: ").append(toIndentedString(notReadyAddresses)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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

