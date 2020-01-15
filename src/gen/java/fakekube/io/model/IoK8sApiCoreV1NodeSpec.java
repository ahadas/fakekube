package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1NodeConfigSource;
import fakekube.io.model.IoK8sApiCoreV1Taint;
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
  * NodeSpec describes the attributes that a node is created with.
 **/
@ApiModel(description="NodeSpec describes the attributes that a node is created with.")
public class IoK8sApiCoreV1NodeSpec  {
  
  @ApiModelProperty(value = "If specified, the source to get node configuration from The DynamicKubeletConfig feature gate must be enabled for the Kubelet to use this field")
  @Valid
 /**
   * If specified, the source to get node configuration from The DynamicKubeletConfig feature gate must be enabled for the Kubelet to use this field
  **/
  private IoK8sApiCoreV1NodeConfigSource configSource = null;

  @ApiModelProperty(value = "Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966")
 /**
   * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
  **/
  private String externalID = null;

  @ApiModelProperty(value = "PodCIDR represents the pod IP range assigned to the node.")
 /**
   * PodCIDR represents the pod IP range assigned to the node.
  **/
  private String podCIDR = null;

  @ApiModelProperty(value = "podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.")
 /**
   * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
  **/
  private List<String> podCIDRs = null;

  @ApiModelProperty(value = "ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>")
 /**
   * ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>
  **/
  private String providerID = null;

  @ApiModelProperty(value = "If specified, the node's taints.")
  @Valid
 /**
   * If specified, the node's taints.
  **/
  private List<IoK8sApiCoreV1Taint> taints = null;

  @ApiModelProperty(value = "Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration")
 /**
   * Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
  **/
  private Boolean unschedulable = null;
 /**
   * If specified, the source to get node configuration from The DynamicKubeletConfig feature gate must be enabled for the Kubelet to use this field
   * @return configSource
  **/
  @JsonProperty("configSource")
  public IoK8sApiCoreV1NodeConfigSource getConfigSource() {
    return configSource;
  }

  public void setConfigSource(IoK8sApiCoreV1NodeConfigSource configSource) {
    this.configSource = configSource;
  }

  public IoK8sApiCoreV1NodeSpec configSource(IoK8sApiCoreV1NodeConfigSource configSource) {
    this.configSource = configSource;
    return this;
  }

 /**
   * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
   * @return externalID
  **/
  @JsonProperty("externalID")
  public String getExternalID() {
    return externalID;
  }

  public void setExternalID(String externalID) {
    this.externalID = externalID;
  }

  public IoK8sApiCoreV1NodeSpec externalID(String externalID) {
    this.externalID = externalID;
    return this;
  }

 /**
   * PodCIDR represents the pod IP range assigned to the node.
   * @return podCIDR
  **/
  @JsonProperty("podCIDR")
  public String getPodCIDR() {
    return podCIDR;
  }

  public void setPodCIDR(String podCIDR) {
    this.podCIDR = podCIDR;
  }

  public IoK8sApiCoreV1NodeSpec podCIDR(String podCIDR) {
    this.podCIDR = podCIDR;
    return this;
  }

 /**
   * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
   * @return podCIDRs
  **/
  @JsonProperty("podCIDRs")
  public List<String> getPodCIDRs() {
    return podCIDRs;
  }

  public void setPodCIDRs(List<String> podCIDRs) {
    this.podCIDRs = podCIDRs;
  }

  public IoK8sApiCoreV1NodeSpec podCIDRs(List<String> podCIDRs) {
    this.podCIDRs = podCIDRs;
    return this;
  }

  public IoK8sApiCoreV1NodeSpec addPodCIDRsItem(String podCIDRsItem) {
    this.podCIDRs.add(podCIDRsItem);
    return this;
  }

 /**
   * ID of the node assigned by the cloud provider in the format: &lt;ProviderName&gt;://&lt;ProviderSpecificNodeID&gt;
   * @return providerID
  **/
  @JsonProperty("providerID")
  public String getProviderID() {
    return providerID;
  }

  public void setProviderID(String providerID) {
    this.providerID = providerID;
  }

  public IoK8sApiCoreV1NodeSpec providerID(String providerID) {
    this.providerID = providerID;
    return this;
  }

 /**
   * If specified, the node&#39;s taints.
   * @return taints
  **/
  @JsonProperty("taints")
  public List<IoK8sApiCoreV1Taint> getTaints() {
    return taints;
  }

  public void setTaints(List<IoK8sApiCoreV1Taint> taints) {
    this.taints = taints;
  }

  public IoK8sApiCoreV1NodeSpec taints(List<IoK8sApiCoreV1Taint> taints) {
    this.taints = taints;
    return this;
  }

  public IoK8sApiCoreV1NodeSpec addTaintsItem(IoK8sApiCoreV1Taint taintsItem) {
    this.taints.add(taintsItem);
    return this;
  }

 /**
   * Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
   * @return unschedulable
  **/
  @JsonProperty("unschedulable")
  public Boolean isUnschedulable() {
    return unschedulable;
  }

  public void setUnschedulable(Boolean unschedulable) {
    this.unschedulable = unschedulable;
  }

  public IoK8sApiCoreV1NodeSpec unschedulable(Boolean unschedulable) {
    this.unschedulable = unschedulable;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NodeSpec {\n");
    
    sb.append("    configSource: ").append(toIndentedString(configSource)).append("\n");
    sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
    sb.append("    podCIDR: ").append(toIndentedString(podCIDR)).append("\n");
    sb.append("    podCIDRs: ").append(toIndentedString(podCIDRs)).append("\n");
    sb.append("    providerID: ").append(toIndentedString(providerID)).append("\n");
    sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
    sb.append("    unschedulable: ").append(toIndentedString(unschedulable)).append("\n");
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

