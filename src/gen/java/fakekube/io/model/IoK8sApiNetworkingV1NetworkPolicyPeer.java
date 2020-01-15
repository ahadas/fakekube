package fakekube.io.model;

import fakekube.io.model.IoK8sApiNetworkingV1IPBlock;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1LabelSelector;
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
  * NetworkPolicyPeer describes a peer to allow traffic from. Only certain combinations of fields are allowed
 **/
@ApiModel(description="NetworkPolicyPeer describes a peer to allow traffic from. Only certain combinations of fields are allowed")
public class IoK8sApiNetworkingV1NetworkPolicyPeer  {
  
  @ApiModelProperty(value = "IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.")
  @Valid
 /**
   * IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.
  **/
  private IoK8sApiNetworkingV1IPBlock ipBlock = null;

  @ApiModelProperty(value = "Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.  If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.")
  @Valid
 /**
   * Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.  If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector namespaceSelector = null;

  @ApiModelProperty(value = "This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty, it selects all pods.  If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.")
  @Valid
 /**
   * This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty, it selects all pods.  If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector podSelector = null;
 /**
   * IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.
   * @return ipBlock
  **/
  @JsonProperty("ipBlock")
  public IoK8sApiNetworkingV1IPBlock getIpBlock() {
    return ipBlock;
  }

  public void setIpBlock(IoK8sApiNetworkingV1IPBlock ipBlock) {
    this.ipBlock = ipBlock;
  }

  public IoK8sApiNetworkingV1NetworkPolicyPeer ipBlock(IoK8sApiNetworkingV1IPBlock ipBlock) {
    this.ipBlock = ipBlock;
    return this;
  }

 /**
   * Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.  If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
   * @return namespaceSelector
  **/
  @JsonProperty("namespaceSelector")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getNamespaceSelector() {
    return namespaceSelector;
  }

  public void setNamespaceSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }

  public IoK8sApiNetworkingV1NetworkPolicyPeer namespaceSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
    return this;
  }

 /**
   * This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty, it selects all pods.  If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy&#39;s own Namespace.
   * @return podSelector
  **/
  @JsonProperty("podSelector")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getPodSelector() {
    return podSelector;
  }

  public void setPodSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector podSelector) {
    this.podSelector = podSelector;
  }

  public IoK8sApiNetworkingV1NetworkPolicyPeer podSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector podSelector) {
    this.podSelector = podSelector;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiNetworkingV1NetworkPolicyPeer {\n");
    
    sb.append("    ipBlock: ").append(toIndentedString(ipBlock)).append("\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    podSelector: ").append(toIndentedString(podSelector)).append("\n");
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

