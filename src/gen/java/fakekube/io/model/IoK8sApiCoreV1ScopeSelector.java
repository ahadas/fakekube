package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ScopedResourceSelectorRequirement;
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
  * A scope selector represents the AND of the selectors represented by the scoped-resource selector requirements.
 **/
@ApiModel(description="A scope selector represents the AND of the selectors represented by the scoped-resource selector requirements.")
public class IoK8sApiCoreV1ScopeSelector  {
  
  @ApiModelProperty(value = "A list of scope selector requirements by scope of the resources.")
  @Valid
 /**
   * A list of scope selector requirements by scope of the resources.
  **/
  private List<IoK8sApiCoreV1ScopedResourceSelectorRequirement> matchExpressions = null;
 /**
   * A list of scope selector requirements by scope of the resources.
   * @return matchExpressions
  **/
  @JsonProperty("matchExpressions")
  public List<IoK8sApiCoreV1ScopedResourceSelectorRequirement> getMatchExpressions() {
    return matchExpressions;
  }

  public void setMatchExpressions(List<IoK8sApiCoreV1ScopedResourceSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }

  public IoK8sApiCoreV1ScopeSelector matchExpressions(List<IoK8sApiCoreV1ScopedResourceSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
    return this;
  }

  public IoK8sApiCoreV1ScopeSelector addMatchExpressionsItem(IoK8sApiCoreV1ScopedResourceSelectorRequirement matchExpressionsItem) {
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ScopeSelector {\n");
    
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
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

