package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1EnvVarSource;
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
  * EnvVar represents an environment variable present in a Container.
 **/
@ApiModel(description="EnvVar represents an environment variable present in a Container.")
public class IoK8sApiCoreV1EnvVar  {
  
  @ApiModelProperty(required = true, value = "Name of the environment variable. Must be a C_IDENTIFIER.")
 /**
   * Name of the environment variable. Must be a C_IDENTIFIER.
  **/
  private String name = null;

  @ApiModelProperty(value = "Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to \"\".")
 /**
   * Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to \"\".
  **/
  private String value = null;

  @ApiModelProperty(value = "Source for the environment variable's value. Cannot be used if value is not empty.")
  @Valid
 /**
   * Source for the environment variable's value. Cannot be used if value is not empty.
  **/
  private IoK8sApiCoreV1EnvVarSource valueFrom = null;
 /**
   * Name of the environment variable. Must be a C_IDENTIFIER.
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

  public IoK8sApiCoreV1EnvVar name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to \&quot;\&quot;.
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public IoK8sApiCoreV1EnvVar value(String value) {
    this.value = value;
    return this;
  }

 /**
   * Source for the environment variable&#39;s value. Cannot be used if value is not empty.
   * @return valueFrom
  **/
  @JsonProperty("valueFrom")
  public IoK8sApiCoreV1EnvVarSource getValueFrom() {
    return valueFrom;
  }

  public void setValueFrom(IoK8sApiCoreV1EnvVarSource valueFrom) {
    this.valueFrom = valueFrom;
  }

  public IoK8sApiCoreV1EnvVar valueFrom(IoK8sApiCoreV1EnvVarSource valueFrom) {
    this.valueFrom = valueFrom;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1EnvVar {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
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

