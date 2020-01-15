package fakekube.io.model;

import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
  * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
 **/
@ApiModel(description="A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.")
public class IoK8sApimachineryPkgApisMetaV1LabelSelector  {
  
  @ApiModelProperty(value = "matchExpressions is a list of label selector requirements. The requirements are ANDed.")
  @Valid
 /**
   * matchExpressions is a list of label selector requirements. The requirements are ANDed.
  **/
  private List<IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement> matchExpressions = null;

  @ApiModelProperty(value = "matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \"key\", the operator is \"In\", and the values array contains only \"value\". The requirements are ANDed.")
 /**
   * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \"key\", the operator is \"In\", and the values array contains only \"value\". The requirements are ANDed.
  **/
  private Map<String, String> matchLabels = null;
 /**
   * matchExpressions is a list of label selector requirements. The requirements are ANDed.
   * @return matchExpressions
  **/
  @JsonProperty("matchExpressions")
  public List<IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement> getMatchExpressions() {
    return matchExpressions;
  }

  public void setMatchExpressions(List<IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }

  public IoK8sApimachineryPkgApisMetaV1LabelSelector matchExpressions(List<IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
    return this;
  }

  public IoK8sApimachineryPkgApisMetaV1LabelSelector addMatchExpressionsItem(IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement matchExpressionsItem) {
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

 /**
   * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \&quot;key\&quot;, the operator is \&quot;In\&quot;, and the values array contains only \&quot;value\&quot;. The requirements are ANDed.
   * @return matchLabels
  **/
  @JsonProperty("matchLabels")
  public Map<String, String> getMatchLabels() {
    return matchLabels;
  }

  public void setMatchLabels(Map<String, String> matchLabels) {
    this.matchLabels = matchLabels;
  }

  public IoK8sApimachineryPkgApisMetaV1LabelSelector matchLabels(Map<String, String> matchLabels) {
    this.matchLabels = matchLabels;
    return this;
  }

  public IoK8sApimachineryPkgApisMetaV1LabelSelector putMatchLabelsItem(String key, String matchLabelsItem) {
    this.matchLabels.put(key, matchLabelsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1LabelSelector {\n");
    
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
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

