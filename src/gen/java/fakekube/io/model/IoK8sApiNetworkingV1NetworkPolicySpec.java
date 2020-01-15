package fakekube.io.model;

import fakekube.io.model.IoK8sApiNetworkingV1NetworkPolicyEgressRule;
import fakekube.io.model.IoK8sApiNetworkingV1NetworkPolicyIngressRule;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1LabelSelector;
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
  * NetworkPolicySpec provides the specification of a NetworkPolicy
 **/
@ApiModel(description="NetworkPolicySpec provides the specification of a NetworkPolicy")
public class IoK8sApiNetworkingV1NetworkPolicySpec  {
  
  @ApiModelProperty(value = "List of egress rules to be applied to the selected pods. Outgoing traffic is allowed if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic matches at least one egress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it selects are isolated by default). This field is beta-level in 1.8")
  @Valid
 /**
   * List of egress rules to be applied to the selected pods. Outgoing traffic is allowed if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic matches at least one egress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it selects are isolated by default). This field is beta-level in 1.8
  **/
  private List<IoK8sApiNetworkingV1NetworkPolicyEgressRule> egress = null;

  @ApiModelProperty(value = "List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic source is the pod's local node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and serves solely to ensure that the pods it selects are isolated by default)")
  @Valid
 /**
   * List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic source is the pod's local node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and serves solely to ensure that the pods it selects are isolated by default)
  **/
  private List<IoK8sApiNetworkingV1NetworkPolicyIngressRule> ingress = null;

  @ApiModelProperty(required = true, value = "Selects the pods to which this NetworkPolicy object applies. The array of ingress rules is applied to any pods selected by this field. Multiple network policies can select the same set of pods. In this case, the ingress rules for each are combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector matches all pods in this namespace.")
  @Valid
 /**
   * Selects the pods to which this NetworkPolicy object applies. The array of ingress rules is applied to any pods selected by this field. Multiple network policies can select the same set of pods. In this case, the ingress rules for each are combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector matches all pods in this namespace.
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector podSelector = null;

  @ApiModelProperty(value = "List of rule types that the NetworkPolicy relates to. Valid options are \"Ingress\", \"Egress\", or \"Ingress,Egress\". If this field is not specified, it will default based on the existence of Ingress or Egress rules; policies that contain an Egress section are assumed to affect Egress, and all policies (whether or not they contain an Ingress section) are assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [ \"Egress\" ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a policyTypes value that include \"Egress\" (since such a policy would not include an Egress section and would otherwise default to just [ \"Ingress\" ]). This field is beta-level in 1.8")
 /**
   * List of rule types that the NetworkPolicy relates to. Valid options are \"Ingress\", \"Egress\", or \"Ingress,Egress\". If this field is not specified, it will default based on the existence of Ingress or Egress rules; policies that contain an Egress section are assumed to affect Egress, and all policies (whether or not they contain an Ingress section) are assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [ \"Egress\" ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a policyTypes value that include \"Egress\" (since such a policy would not include an Egress section and would otherwise default to just [ \"Ingress\" ]). This field is beta-level in 1.8
  **/
  private List<String> policyTypes = null;
 /**
   * List of egress rules to be applied to the selected pods. Outgoing traffic is allowed if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic matches at least one egress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it selects are isolated by default). This field is beta-level in 1.8
   * @return egress
  **/
  @JsonProperty("egress")
  public List<IoK8sApiNetworkingV1NetworkPolicyEgressRule> getEgress() {
    return egress;
  }

  public void setEgress(List<IoK8sApiNetworkingV1NetworkPolicyEgressRule> egress) {
    this.egress = egress;
  }

  public IoK8sApiNetworkingV1NetworkPolicySpec egress(List<IoK8sApiNetworkingV1NetworkPolicyEgressRule> egress) {
    this.egress = egress;
    return this;
  }

  public IoK8sApiNetworkingV1NetworkPolicySpec addEgressItem(IoK8sApiNetworkingV1NetworkPolicyEgressRule egressItem) {
    this.egress.add(egressItem);
    return this;
  }

 /**
   * List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic source is the pod&#39;s local node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and serves solely to ensure that the pods it selects are isolated by default)
   * @return ingress
  **/
  @JsonProperty("ingress")
  public List<IoK8sApiNetworkingV1NetworkPolicyIngressRule> getIngress() {
    return ingress;
  }

  public void setIngress(List<IoK8sApiNetworkingV1NetworkPolicyIngressRule> ingress) {
    this.ingress = ingress;
  }

  public IoK8sApiNetworkingV1NetworkPolicySpec ingress(List<IoK8sApiNetworkingV1NetworkPolicyIngressRule> ingress) {
    this.ingress = ingress;
    return this;
  }

  public IoK8sApiNetworkingV1NetworkPolicySpec addIngressItem(IoK8sApiNetworkingV1NetworkPolicyIngressRule ingressItem) {
    this.ingress.add(ingressItem);
    return this;
  }

 /**
   * Selects the pods to which this NetworkPolicy object applies. The array of ingress rules is applied to any pods selected by this field. Multiple network policies can select the same set of pods. In this case, the ingress rules for each are combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector matches all pods in this namespace.
   * @return podSelector
  **/
  @JsonProperty("podSelector")
  @NotNull
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getPodSelector() {
    return podSelector;
  }

  public void setPodSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector podSelector) {
    this.podSelector = podSelector;
  }

  public IoK8sApiNetworkingV1NetworkPolicySpec podSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector podSelector) {
    this.podSelector = podSelector;
    return this;
  }

 /**
   * List of rule types that the NetworkPolicy relates to. Valid options are \&quot;Ingress\&quot;, \&quot;Egress\&quot;, or \&quot;Ingress,Egress\&quot;. If this field is not specified, it will default based on the existence of Ingress or Egress rules; policies that contain an Egress section are assumed to affect Egress, and all policies (whether or not they contain an Ingress section) are assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [ \&quot;Egress\&quot; ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a policyTypes value that include \&quot;Egress\&quot; (since such a policy would not include an Egress section and would otherwise default to just [ \&quot;Ingress\&quot; ]). This field is beta-level in 1.8
   * @return policyTypes
  **/
  @JsonProperty("policyTypes")
  public List<String> getPolicyTypes() {
    return policyTypes;
  }

  public void setPolicyTypes(List<String> policyTypes) {
    this.policyTypes = policyTypes;
  }

  public IoK8sApiNetworkingV1NetworkPolicySpec policyTypes(List<String> policyTypes) {
    this.policyTypes = policyTypes;
    return this;
  }

  public IoK8sApiNetworkingV1NetworkPolicySpec addPolicyTypesItem(String policyTypesItem) {
    this.policyTypes.add(policyTypesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiNetworkingV1NetworkPolicySpec {\n");
    
    sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    podSelector: ").append(toIndentedString(podSelector)).append("\n");
    sb.append("    policyTypes: ").append(toIndentedString(policyTypes)).append("\n");
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

