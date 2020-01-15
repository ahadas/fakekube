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
  * SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace
 **/
@ApiModel(description="SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace")
public class IoK8sApiCoreV1SecretReference  {
  
  @ApiModelProperty(value = "Name is unique within a namespace to reference a secret resource.")
 /**
   * Name is unique within a namespace to reference a secret resource.
  **/
  private String name = null;

  @ApiModelProperty(value = "Namespace defines the space within which the secret name must be unique.")
 /**
   * Namespace defines the space within which the secret name must be unique.
  **/
  private String namespace = null;
 /**
   * Name is unique within a namespace to reference a secret resource.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiCoreV1SecretReference name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Namespace defines the space within which the secret name must be unique.
   * @return namespace
  **/
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public IoK8sApiCoreV1SecretReference namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1SecretReference {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

