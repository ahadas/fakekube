package fakekube.io.model;

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
  * A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
 **/
@ApiModel(description="A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.")
public class IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement  {
  
  @ApiModelProperty(required = true, value = "key is the label key that the selector applies to.")
 /**
   * key is the label key that the selector applies to.
  **/
  private String key = null;

  @ApiModelProperty(required = true, value = "operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.")
 /**
   * operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
  **/
  private String operator = null;

  @ApiModelProperty(value = "values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.")
 /**
   * values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
  **/
  private List<String> values = null;
 /**
   * key is the label key that the selector applies to.
   * @return key
  **/
  @JsonProperty("key")
  @NotNull
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement key(String key) {
    this.key = key;
    return this;
  }

 /**
   * operator represents a key&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
   * @return operator
  **/
  @JsonProperty("operator")
  @NotNull
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement operator(String operator) {
    this.operator = operator;
    return this;
  }

 /**
   * values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
   * @return values
  **/
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement values(List<String> values) {
    this.values = values;
    return this;
  }

  public IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

