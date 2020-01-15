package fakekube.io.model;

import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps;
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
  * CustomResourceValidation is a list of validation methods for CustomResources.
 **/
@ApiModel(description="CustomResourceValidation is a list of validation methods for CustomResources.")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceValidation  {
  
  @ApiModelProperty(value = "openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.")
  @Valid
 /**
   * openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
  **/
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps openAPIV3Schema = null;
 /**
   * openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
   * @return openAPIV3Schema
  **/
  @JsonProperty("openAPIV3Schema")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps getOpenAPIV3Schema() {
    return openAPIV3Schema;
  }

  public void setOpenAPIV3Schema(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps openAPIV3Schema) {
    this.openAPIV3Schema = openAPIV3Schema;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceValidation openAPIV3Schema(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps openAPIV3Schema) {
    this.openAPIV3Schema = openAPIV3Schema;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceValidation {\n");
    
    sb.append("    openAPIV3Schema: ").append(toIndentedString(openAPIV3Schema)).append("\n");
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

