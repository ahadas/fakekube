package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1TopologySelectorLabelRequirement;
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
  * A topology selector term represents the result of label queries. A null or empty topology selector term matches no objects. The requirements of them are ANDed. It provides a subset of functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.
 **/
@ApiModel(description="A topology selector term represents the result of label queries. A null or empty topology selector term matches no objects. The requirements of them are ANDed. It provides a subset of functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.")
public class IoK8sApiCoreV1TopologySelectorTerm  {
  
  @ApiModelProperty(value = "A list of topology selector requirements by labels.")
  @Valid
 /**
   * A list of topology selector requirements by labels.
  **/
  private List<IoK8sApiCoreV1TopologySelectorLabelRequirement> matchLabelExpressions = null;
 /**
   * A list of topology selector requirements by labels.
   * @return matchLabelExpressions
  **/
  @JsonProperty("matchLabelExpressions")
  public List<IoK8sApiCoreV1TopologySelectorLabelRequirement> getMatchLabelExpressions() {
    return matchLabelExpressions;
  }

  public void setMatchLabelExpressions(List<IoK8sApiCoreV1TopologySelectorLabelRequirement> matchLabelExpressions) {
    this.matchLabelExpressions = matchLabelExpressions;
  }

  public IoK8sApiCoreV1TopologySelectorTerm matchLabelExpressions(List<IoK8sApiCoreV1TopologySelectorLabelRequirement> matchLabelExpressions) {
    this.matchLabelExpressions = matchLabelExpressions;
    return this;
  }

  public IoK8sApiCoreV1TopologySelectorTerm addMatchLabelExpressionsItem(IoK8sApiCoreV1TopologySelectorLabelRequirement matchLabelExpressionsItem) {
    this.matchLabelExpressions.add(matchLabelExpressionsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1TopologySelectorTerm {\n");
    
    sb.append("    matchLabelExpressions: ").append(toIndentedString(matchLabelExpressions)).append("\n");
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

