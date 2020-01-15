package fakekube.io.model;

import fakekube.io.model.IoK8sApiNetworkingV1NetworkPolicyPeer;
import fakekube.io.model.IoK8sApiNetworkingV1NetworkPolicyPort;
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
  * NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and to. This type is beta-level in 1.8
 **/
@ApiModel(description="NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and to. This type is beta-level in 1.8")
public class IoK8sApiNetworkingV1NetworkPolicyEgressRule  {
  
  @ApiModelProperty(value = "List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.")
  @Valid
 /**
   * List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
  **/
  private List<IoK8sApiNetworkingV1NetworkPolicyPort> ports = null;

  @ApiModelProperty(value = "List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.")
  @Valid
 /**
   * List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.
  **/
  private List<IoK8sApiNetworkingV1NetworkPolicyPeer> to = null;
 /**
   * List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
   * @return ports
  **/
  @JsonProperty("ports")
  public List<IoK8sApiNetworkingV1NetworkPolicyPort> getPorts() {
    return ports;
  }

  public void setPorts(List<IoK8sApiNetworkingV1NetworkPolicyPort> ports) {
    this.ports = ports;
  }

  public IoK8sApiNetworkingV1NetworkPolicyEgressRule ports(List<IoK8sApiNetworkingV1NetworkPolicyPort> ports) {
    this.ports = ports;
    return this;
  }

  public IoK8sApiNetworkingV1NetworkPolicyEgressRule addPortsItem(IoK8sApiNetworkingV1NetworkPolicyPort portsItem) {
    this.ports.add(portsItem);
    return this;
  }

 /**
   * List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.
   * @return to
  **/
  @JsonProperty("to")
  public List<IoK8sApiNetworkingV1NetworkPolicyPeer> getTo() {
    return to;
  }

  public void setTo(List<IoK8sApiNetworkingV1NetworkPolicyPeer> to) {
    this.to = to;
  }

  public IoK8sApiNetworkingV1NetworkPolicyEgressRule to(List<IoK8sApiNetworkingV1NetworkPolicyPeer> to) {
    this.to = to;
    return this;
  }

  public IoK8sApiNetworkingV1NetworkPolicyEgressRule addToItem(IoK8sApiNetworkingV1NetworkPolicyPeer toItem) {
    this.to.add(toItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiNetworkingV1NetworkPolicyEgressRule {\n");
    
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

