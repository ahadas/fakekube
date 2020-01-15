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
  * A topology selector requirement is a selector that matches given label. This is an alpha feature and may change in the future.
 **/
@ApiModel(description="A topology selector requirement is a selector that matches given label. This is an alpha feature and may change in the future.")
public class IoK8sApiCoreV1TopologySelectorLabelRequirement  {
  
  @ApiModelProperty(required = true, value = "The label key that the selector applies to.")
 /**
   * The label key that the selector applies to.
  **/
  private String key = null;

  @ApiModelProperty(required = true, value = "An array of string values. One value must match the label to be selected. Each entry in Values is ORed.")
 /**
   * An array of string values. One value must match the label to be selected. Each entry in Values is ORed.
  **/
  private List<String> values = new ArrayList<String>();
 /**
   * The label key that the selector applies to.
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

  public IoK8sApiCoreV1TopologySelectorLabelRequirement key(String key) {
    this.key = key;
    return this;
  }

 /**
   * An array of string values. One value must match the label to be selected. Each entry in Values is ORed.
   * @return values
  **/
  @JsonProperty("values")
  @NotNull
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public IoK8sApiCoreV1TopologySelectorLabelRequirement values(List<String> values) {
    this.values = values;
    return this;
  }

  public IoK8sApiCoreV1TopologySelectorLabelRequirement addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1TopologySelectorLabelRequirement {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

