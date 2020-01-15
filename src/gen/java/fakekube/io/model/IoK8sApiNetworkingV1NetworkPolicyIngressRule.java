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
  * NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and from.
 **/
@ApiModel(description="NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and from.")
public class IoK8sApiNetworkingV1NetworkPolicyIngressRule  {
  
  @ApiModelProperty(value = "List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.")
  @Valid
 /**
   * List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
  **/
  private List<IoK8sApiNetworkingV1NetworkPolicyPeer> from = null;

  @ApiModelProperty(value = "List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.")
  @Valid
 /**
   * List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
  **/
  private List<IoK8sApiNetworkingV1NetworkPolicyPort> ports = null;
 /**
   * List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
   * @return from
  **/
  @JsonProperty("from")
  public List<IoK8sApiNetworkingV1NetworkPolicyPeer> getFrom() {
    return from;
  }

  public void setFrom(List<IoK8sApiNetworkingV1NetworkPolicyPeer> from) {
    this.from = from;
  }

  public IoK8sApiNetworkingV1NetworkPolicyIngressRule from(List<IoK8sApiNetworkingV1NetworkPolicyPeer> from) {
    this.from = from;
    return this;
  }

  public IoK8sApiNetworkingV1NetworkPolicyIngressRule addFromItem(IoK8sApiNetworkingV1NetworkPolicyPeer fromItem) {
    this.from.add(fromItem);
    return this;
  }

 /**
   * List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
   * @return ports
  **/
  @JsonProperty("ports")
  public List<IoK8sApiNetworkingV1NetworkPolicyPort> getPorts() {
    return ports;
  }

  public void setPorts(List<IoK8sApiNetworkingV1NetworkPolicyPort> ports) {
    this.ports = ports;
  }

  public IoK8sApiNetworkingV1NetworkPolicyIngressRule ports(List<IoK8sApiNetworkingV1NetworkPolicyPort> ports) {
    this.ports = ports;
    return this;
  }

  public IoK8sApiNetworkingV1NetworkPolicyIngressRule addPortsItem(IoK8sApiNetworkingV1NetworkPolicyPort portsItem) {
    this.ports.add(portsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiNetworkingV1NetworkPolicyIngressRule {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
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

