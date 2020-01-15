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
  * ConfigMapEnvSource selects a ConfigMap to populate the environment variables with.  The contents of the target ConfigMap's Data field will represent the key-value pairs as environment variables.
 **/
@ApiModel(description="ConfigMapEnvSource selects a ConfigMap to populate the environment variables with.  The contents of the target ConfigMap's Data field will represent the key-value pairs as environment variables.")
public class IoK8sApiCoreV1ConfigMapEnvSource  {
  
  @ApiModelProperty(value = "Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
 /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
  **/
  private String name = null;

  @ApiModelProperty(value = "Specify whether the ConfigMap must be defined")
 /**
   * Specify whether the ConfigMap must be defined
  **/
  private Boolean optional = null;
 /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiCoreV1ConfigMapEnvSource name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Specify whether the ConfigMap must be defined
   * @return optional
  **/
  @JsonProperty("optional")
  public Boolean isOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public IoK8sApiCoreV1ConfigMapEnvSource optional(Boolean optional) {
    this.optional = optional;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ConfigMapEnvSource {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
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

