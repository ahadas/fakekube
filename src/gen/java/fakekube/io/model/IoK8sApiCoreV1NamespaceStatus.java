package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1NamespaceCondition;
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
  * NamespaceStatus is information about the current status of a Namespace.
 **/
@ApiModel(description="NamespaceStatus is information about the current status of a Namespace.")
public class IoK8sApiCoreV1NamespaceStatus  {
  
  @ApiModelProperty(value = "Represents the latest available observations of a namespace's current state.")
  @Valid
 /**
   * Represents the latest available observations of a namespace's current state.
  **/
  private List<IoK8sApiCoreV1NamespaceCondition> conditions = null;

  @ApiModelProperty(value = "Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/")
 /**
   * Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
  **/
  private String phase = null;
 /**
   * Represents the latest available observations of a namespace&#39;s current state.
   * @return conditions
  **/
  @JsonProperty("conditions")
  public List<IoK8sApiCoreV1NamespaceCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sApiCoreV1NamespaceCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sApiCoreV1NamespaceStatus conditions(List<IoK8sApiCoreV1NamespaceCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sApiCoreV1NamespaceStatus addConditionsItem(IoK8sApiCoreV1NamespaceCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

 /**
   * Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
   * @return phase
  **/
  @JsonProperty("phase")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public IoK8sApiCoreV1NamespaceStatus phase(String phase) {
    this.phase = phase;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NamespaceStatus {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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

