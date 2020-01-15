package fakekube.io.model;

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
  * PodReadinessGate contains the reference to a pod condition
 **/
@ApiModel(description="PodReadinessGate contains the reference to a pod condition")
public class IoK8sApiCoreV1PodReadinessGate  {
  
  @ApiModelProperty(required = true, value = "ConditionType refers to a condition in the pod's condition list with matching type.")
 /**
   * ConditionType refers to a condition in the pod's condition list with matching type.
  **/
  private String conditionType = null;
 /**
   * ConditionType refers to a condition in the pod&#39;s condition list with matching type.
   * @return conditionType
  **/
  @JsonProperty("conditionType")
  @NotNull
  public String getConditionType() {
    return conditionType;
  }

  public void setConditionType(String conditionType) {
    this.conditionType = conditionType;
  }

  public IoK8sApiCoreV1PodReadinessGate conditionType(String conditionType) {
    this.conditionType = conditionType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PodReadinessGate {\n");
    
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
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

