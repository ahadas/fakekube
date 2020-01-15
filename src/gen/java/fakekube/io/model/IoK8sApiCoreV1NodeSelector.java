package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1NodeSelectorTerm;
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
  * A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.
 **/
@ApiModel(description="A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.")
public class IoK8sApiCoreV1NodeSelector  {
  
  @ApiModelProperty(required = true, value = "Required. A list of node selector terms. The terms are ORed.")
  @Valid
 /**
   * Required. A list of node selector terms. The terms are ORed.
  **/
  private List<IoK8sApiCoreV1NodeSelectorTerm> nodeSelectorTerms = new ArrayList<IoK8sApiCoreV1NodeSelectorTerm>();
 /**
   * Required. A list of node selector terms. The terms are ORed.
   * @return nodeSelectorTerms
  **/
  @JsonProperty("nodeSelectorTerms")
  @NotNull
  public List<IoK8sApiCoreV1NodeSelectorTerm> getNodeSelectorTerms() {
    return nodeSelectorTerms;
  }

  public void setNodeSelectorTerms(List<IoK8sApiCoreV1NodeSelectorTerm> nodeSelectorTerms) {
    this.nodeSelectorTerms = nodeSelectorTerms;
  }

  public IoK8sApiCoreV1NodeSelector nodeSelectorTerms(List<IoK8sApiCoreV1NodeSelectorTerm> nodeSelectorTerms) {
    this.nodeSelectorTerms = nodeSelectorTerms;
    return this;
  }

  public IoK8sApiCoreV1NodeSelector addNodeSelectorTermsItem(IoK8sApiCoreV1NodeSelectorTerm nodeSelectorTermsItem) {
    this.nodeSelectorTerms.add(nodeSelectorTermsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NodeSelector {\n");
    
    sb.append("    nodeSelectorTerms: ").append(toIndentedString(nodeSelectorTerms)).append("\n");
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

