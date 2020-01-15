package fakekube.io.model;

import fakekube.io.model.IoK8sKubeAggregatorPkgApisApiregistrationV1APIServiceCondition;
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
  * APIServiceStatus contains derived information about an API server
 **/
@ApiModel(description="APIServiceStatus contains derived information about an API server")
public class IoK8sKubeAggregatorPkgApisApiregistrationV1APIServiceStatus  {
  
  @ApiModelProperty(value = "Current service state of apiService.")
  @Valid
 /**
   * Current service state of apiService.
  **/
  private List<IoK8sKubeAggregatorPkgApisApiregistrationV1APIServiceCondition> conditions = null;
 /**
   * Current service state of apiService.
   * @return conditions
  **/
  @JsonProperty("conditions")
  public List<IoK8sKubeAggregatorPkgApisApiregistrationV1APIServiceCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sKubeAggregatorPkgApisApiregistrationV1APIServiceCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1APIServiceStatus conditions(List<IoK8sKubeAggregatorPkgApisApiregistrationV1APIServiceCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1APIServiceStatus addConditionsItem(IoK8sKubeAggregatorPkgApisApiregistrationV1APIServiceCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubeAggregatorPkgApisApiregistrationV1APIServiceStatus {\n");
    
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

