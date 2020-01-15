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
  * A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.
 **/
@ApiModel(description="A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.")
public class IoK8sApiCoreV1ScopedResourceSelectorRequirement  {
  
  @ApiModelProperty(required = true, value = "Represents a scope's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.")
 /**
   * Represents a scope's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
  **/
  private String operator = null;

  @ApiModelProperty(required = true, value = "The name of the scope that the selector applies to.")
 /**
   * The name of the scope that the selector applies to.
  **/
  private String scopeName = null;

  @ApiModelProperty(value = "An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.")
 /**
   * An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
  **/
  private List<String> values = null;
 /**
   * Represents a scope&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
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

  public IoK8sApiCoreV1ScopedResourceSelectorRequirement operator(String operator) {
    this.operator = operator;
    return this;
  }

 /**
   * The name of the scope that the selector applies to.
   * @return scopeName
  **/
  @JsonProperty("scopeName")
  @NotNull
  public String getScopeName() {
    return scopeName;
  }

  public void setScopeName(String scopeName) {
    this.scopeName = scopeName;
  }

  public IoK8sApiCoreV1ScopedResourceSelectorRequirement scopeName(String scopeName) {
    this.scopeName = scopeName;
    return this;
  }

 /**
   * An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
   * @return values
  **/
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public IoK8sApiCoreV1ScopedResourceSelectorRequirement values(List<String> values) {
    this.values = values;
    return this;
  }

  public IoK8sApiCoreV1ScopedResourceSelectorRequirement addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ScopedResourceSelectorRequirement {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    scopeName: ").append(toIndentedString(scopeName)).append("\n");
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

