package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1PodAffinityTerm;
import fakekube.io.model.IoK8sApiCoreV1WeightedPodAffinityTerm;
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
  * Pod anti affinity is a group of inter pod anti affinity scheduling rules.
 **/
@ApiModel(description="Pod anti affinity is a group of inter pod anti affinity scheduling rules.")
public class IoK8sApiCoreV1PodAntiAffinity  {
  
  @ApiModelProperty(value = "The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding \"weight\" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.")
  @Valid
 /**
   * The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding \"weight\" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
  **/
  private List<IoK8sApiCoreV1WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution = null;

  @ApiModelProperty(value = "If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.")
  @Valid
 /**
   * If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
  **/
  private List<IoK8sApiCoreV1PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution = null;
 /**
   * The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding \&quot;weight\&quot; to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
   * @return preferredDuringSchedulingIgnoredDuringExecution
  **/
  @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
  public List<IoK8sApiCoreV1WeightedPodAffinityTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution;
  }

  public void setPreferredDuringSchedulingIgnoredDuringExecution(List<IoK8sApiCoreV1WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
    this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
  }

  public IoK8sApiCoreV1PodAntiAffinity preferredDuringSchedulingIgnoredDuringExecution(List<IoK8sApiCoreV1WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
    this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

  public IoK8sApiCoreV1PodAntiAffinity addPreferredDuringSchedulingIgnoredDuringExecutionItem(IoK8sApiCoreV1WeightedPodAffinityTerm preferredDuringSchedulingIgnoredDuringExecutionItem) {
    this.preferredDuringSchedulingIgnoredDuringExecution.add(preferredDuringSchedulingIgnoredDuringExecutionItem);
    return this;
  }

 /**
   * If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
   * @return requiredDuringSchedulingIgnoredDuringExecution
  **/
  @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
  public List<IoK8sApiCoreV1PodAffinityTerm> getRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution;
  }

  public void setRequiredDuringSchedulingIgnoredDuringExecution(List<IoK8sApiCoreV1PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
    this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
  }

  public IoK8sApiCoreV1PodAntiAffinity requiredDuringSchedulingIgnoredDuringExecution(List<IoK8sApiCoreV1PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
    this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

  public IoK8sApiCoreV1PodAntiAffinity addRequiredDuringSchedulingIgnoredDuringExecutionItem(IoK8sApiCoreV1PodAffinityTerm requiredDuringSchedulingIgnoredDuringExecutionItem) {
    this.requiredDuringSchedulingIgnoredDuringExecution.add(requiredDuringSchedulingIgnoredDuringExecutionItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PodAntiAffinity {\n");
    
    sb.append("    preferredDuringSchedulingIgnoredDuringExecution: ").append(toIndentedString(preferredDuringSchedulingIgnoredDuringExecution)).append("\n");
    sb.append("    requiredDuringSchedulingIgnoredDuringExecution: ").append(toIndentedString(requiredDuringSchedulingIgnoredDuringExecution)).append("\n");
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

