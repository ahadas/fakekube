package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1NodeSelectorRequirement;
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
  * A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
 **/
@ApiModel(description="A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.")
public class IoK8sApiCoreV1NodeSelectorTerm  {
  
  @ApiModelProperty(value = "A list of node selector requirements by node's labels.")
  @Valid
 /**
   * A list of node selector requirements by node's labels.
  **/
  private List<IoK8sApiCoreV1NodeSelectorRequirement> matchExpressions = null;

  @ApiModelProperty(value = "A list of node selector requirements by node's fields.")
  @Valid
 /**
   * A list of node selector requirements by node's fields.
  **/
  private List<IoK8sApiCoreV1NodeSelectorRequirement> matchFields = null;
 /**
   * A list of node selector requirements by node&#39;s labels.
   * @return matchExpressions
  **/
  @JsonProperty("matchExpressions")
  public List<IoK8sApiCoreV1NodeSelectorRequirement> getMatchExpressions() {
    return matchExpressions;
  }

  public void setMatchExpressions(List<IoK8sApiCoreV1NodeSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }

  public IoK8sApiCoreV1NodeSelectorTerm matchExpressions(List<IoK8sApiCoreV1NodeSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
    return this;
  }

  public IoK8sApiCoreV1NodeSelectorTerm addMatchExpressionsItem(IoK8sApiCoreV1NodeSelectorRequirement matchExpressionsItem) {
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

 /**
   * A list of node selector requirements by node&#39;s fields.
   * @return matchFields
  **/
  @JsonProperty("matchFields")
  public List<IoK8sApiCoreV1NodeSelectorRequirement> getMatchFields() {
    return matchFields;
  }

  public void setMatchFields(List<IoK8sApiCoreV1NodeSelectorRequirement> matchFields) {
    this.matchFields = matchFields;
  }

  public IoK8sApiCoreV1NodeSelectorTerm matchFields(List<IoK8sApiCoreV1NodeSelectorRequirement> matchFields) {
    this.matchFields = matchFields;
    return this;
  }

  public IoK8sApiCoreV1NodeSelectorTerm addMatchFieldsItem(IoK8sApiCoreV1NodeSelectorRequirement matchFieldsItem) {
    this.matchFields.add(matchFieldsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NodeSelectorTerm {\n");
    
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    matchFields: ").append(toIndentedString(matchFields)).append("\n");
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

