package fakekube.io.model;

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
  * TopologySpreadConstraint specifies how to spread matching pods among the given topology.
 **/
@ApiModel(description="TopologySpreadConstraint specifies how to spread matching pods among the given topology.")
public class IoK8sApiCoreV1TopologySpreadConstraint  {
  
  @ApiModelProperty(value = "LabelSelector is used to find matching pods. Pods that match this label selector are counted to determine the number of pods in their corresponding topology domain.")
  @Valid
 /**
   * LabelSelector is used to find matching pods. Pods that match this label selector are counted to determine the number of pods in their corresponding topology domain.
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector labelSelector = null;

  @ApiModelProperty(required = true, value = "MaxSkew describes the degree to which pods may be unevenly distributed. It's the maximum permitted difference between the number of matching pods in any two topology domains of a given topology type. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | |   P   |   P   |       | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. It's a required field. Default value is 1 and 0 is not allowed.")
 /**
   * MaxSkew describes the degree to which pods may be unevenly distributed. It's the maximum permitted difference between the number of matching pods in any two topology domains of a given topology type. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | |   P   |   P   |       | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. It's a required field. Default value is 1 and 0 is not allowed.
  **/
  private Integer maxSkew = null;

  @ApiModelProperty(required = true, value = "TopologyKey is the key of node labels. Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each <key, value> as a \"bucket\", and try to put balanced number of pods into each bucket. It's a required field.")
 /**
   * TopologyKey is the key of node labels. Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each <key, value> as a \"bucket\", and try to put balanced number of pods into each bucket. It's a required field.
  **/
  private String topologyKey = null;

  @ApiModelProperty(required = true, value = "WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy the spread constraint. - DoNotSchedule (default) tells the scheduler not to schedule it - ScheduleAnyway tells the scheduler to still schedule it It's considered as \"Unsatisfiable\" if and only if placing incoming pod on any topology violates \"MaxSkew\". For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won't make it *more* imbalanced. It's a required field.")
 /**
   * WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy the spread constraint. - DoNotSchedule (default) tells the scheduler not to schedule it - ScheduleAnyway tells the scheduler to still schedule it It's considered as \"Unsatisfiable\" if and only if placing incoming pod on any topology violates \"MaxSkew\". For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won't make it *more* imbalanced. It's a required field.
  **/
  private String whenUnsatisfiable = null;
 /**
   * LabelSelector is used to find matching pods. Pods that match this label selector are counted to determine the number of pods in their corresponding topology domain.
   * @return labelSelector
  **/
  @JsonProperty("labelSelector")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getLabelSelector() {
    return labelSelector;
  }

  public void setLabelSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }

  public IoK8sApiCoreV1TopologySpreadConstraint labelSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
    return this;
  }

 /**
   * MaxSkew describes the degree to which pods may be unevenly distributed. It&#39;s the maximum permitted difference between the number of matching pods in any two topology domains of a given topology type. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | |   P   |   P   |       | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. It&#39;s a required field. Default value is 1 and 0 is not allowed.
   * @return maxSkew
  **/
  @JsonProperty("maxSkew")
  @NotNull
  public Integer getMaxSkew() {
    return maxSkew;
  }

  public void setMaxSkew(Integer maxSkew) {
    this.maxSkew = maxSkew;
  }

  public IoK8sApiCoreV1TopologySpreadConstraint maxSkew(Integer maxSkew) {
    this.maxSkew = maxSkew;
    return this;
  }

 /**
   * TopologyKey is the key of node labels. Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each &lt;key, value&gt; as a \&quot;bucket\&quot;, and try to put balanced number of pods into each bucket. It&#39;s a required field.
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

  public IoK8sApiCoreV1TopologySpreadConstraint topologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
    return this;
  }

 /**
   * WhenUnsatisfiable indicates how to deal with a pod if it doesn&#39;t satisfy the spread constraint. - DoNotSchedule (default) tells the scheduler not to schedule it - ScheduleAnyway tells the scheduler to still schedule it It&#39;s considered as \&quot;Unsatisfiable\&quot; if and only if placing incoming pod on any topology violates \&quot;MaxSkew\&quot;. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won&#39;t make it *more* imbalanced. It&#39;s a required field.
   * @return whenUnsatisfiable
  **/
  @JsonProperty("whenUnsatisfiable")
  @NotNull
  public String getWhenUnsatisfiable() {
    return whenUnsatisfiable;
  }

  public void setWhenUnsatisfiable(String whenUnsatisfiable) {
    this.whenUnsatisfiable = whenUnsatisfiable;
  }

  public IoK8sApiCoreV1TopologySpreadConstraint whenUnsatisfiable(String whenUnsatisfiable) {
    this.whenUnsatisfiable = whenUnsatisfiable;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1TopologySpreadConstraint {\n");
    
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    maxSkew: ").append(toIndentedString(maxSkew)).append("\n");
    sb.append("    topologyKey: ").append(toIndentedString(topologyKey)).append("\n");
    sb.append("    whenUnsatisfiable: ").append(toIndentedString(whenUnsatisfiable)).append("\n");
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

