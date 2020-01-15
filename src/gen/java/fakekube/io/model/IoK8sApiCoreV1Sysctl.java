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
  * Sysctl defines a kernel parameter to be set
 **/
@ApiModel(description="Sysctl defines a kernel parameter to be set")
public class IoK8sApiCoreV1Sysctl  {
  
  @ApiModelProperty(required = true, value = "Name of a property to set")
 /**
   * Name of a property to set
  **/
  private String name = null;

  @ApiModelProperty(required = true, value = "Value of a property to set")
 /**
   * Value of a property to set
  **/
  private String value = null;
 /**
   * Name of a property to set
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiCoreV1Sysctl name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Value of a property to set
   * @return value
  **/
  @JsonProperty("value")
  @NotNull
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public IoK8sApiCoreV1Sysctl value(String value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Sysctl {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

