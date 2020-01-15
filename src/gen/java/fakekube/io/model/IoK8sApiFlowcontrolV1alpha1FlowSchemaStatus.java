package fakekube.io.model;

import fakekube.io.model.IoK8sApiFlowcontrolV1alpha1FlowSchemaCondition;
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
  * FlowSchemaStatus represents the current state of a FlowSchema.
 **/
@ApiModel(description="FlowSchemaStatus represents the current state of a FlowSchema.")
public class IoK8sApiFlowcontrolV1alpha1FlowSchemaStatus  {
  
  @ApiModelProperty(value = "`conditions` is a list of the current states of FlowSchema.")
  @Valid
 /**
   * `conditions` is a list of the current states of FlowSchema.
  **/
  private List<IoK8sApiFlowcontrolV1alpha1FlowSchemaCondition> conditions = null;
 /**
   * &#x60;conditions&#x60; is a list of the current states of FlowSchema.
   * @return conditions
  **/
  @JsonProperty("conditions")
  public List<IoK8sApiFlowcontrolV1alpha1FlowSchemaCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sApiFlowcontrolV1alpha1FlowSchemaCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sApiFlowcontrolV1alpha1FlowSchemaStatus conditions(List<IoK8sApiFlowcontrolV1alpha1FlowSchemaCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sApiFlowcontrolV1alpha1FlowSchemaStatus addConditionsItem(IoK8sApiFlowcontrolV1alpha1FlowSchemaCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiFlowcontrolV1alpha1FlowSchemaStatus {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

