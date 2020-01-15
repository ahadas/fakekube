package fakekube.io.model;

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
  * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running
 **/
@ApiModel(description="Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running")
public class IoK8sApiCoreV1PodAffinityTerm  {
  
  @ApiModelProperty(value = "A label query over a set of resources, in this case pods.")
  @Valid
 /**
   * A label query over a set of resources, in this case pods.
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector labelSelector = null;

  @ApiModelProperty(value = "namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means \"this pod's namespace\"")
 /**
   * namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means \"this pod's namespace\"
  **/
  private List<String> namespaces = null;

  @ApiModelProperty(required = true, value = "This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.")
 /**
   * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
  **/
  private String topologyKey = null;
 /**
   * A label query over a set of resources, in this case pods.
   * @return labelSelector
  **/
  @JsonProperty("labelSelector")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getLabelSelector() {
    return labelSelector;
  }

  public void setLabelSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }

  public IoK8sApiCoreV1PodAffinityTerm labelSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
    return this;
  }

 /**
   * namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means \&quot;this pod&#39;s namespace\&quot;
   * @return namespaces
  **/
  @JsonProperty("namespaces")
  public List<String> getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }

  public IoK8sApiCoreV1PodAffinityTerm namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public IoK8sApiCoreV1PodAffinityTerm addNamespacesItem(String namespacesItem) {
    this.namespaces.add(namespacesItem);
    return this;
  }

 /**
   * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
   * @return topologyKey
  **/
  @JsonProperty("topologyKey")
  @NotNull
  public String getTopologyKey() {
    return topologyKey;
  }

  public void setTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
  }

  public IoK8sApiCoreV1PodAffinityTerm topologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PodAffinityTerm {\n");
    
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    topologyKey: ").append(toIndentedString(topologyKey)).append("\n");
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

