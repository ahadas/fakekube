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
  * ObjectFieldSelector selects an APIVersioned field of an object.
 **/
@ApiModel(description="ObjectFieldSelector selects an APIVersioned field of an object.")
public class IoK8sApiCoreV1ObjectFieldSelector  {
  
  @ApiModelProperty(value = "Version of the schema the FieldPath is written in terms of, defaults to \"v1\".")
 /**
   * Version of the schema the FieldPath is written in terms of, defaults to \"v1\".
  **/
  private String apiVersion = null;

  @ApiModelProperty(required = true, value = "Path of the field to select in the specified API version.")
 /**
   * Path of the field to select in the specified API version.
  **/
  private String fieldPath = null;
 /**
   * Version of the schema the FieldPath is written in terms of, defaults to \&quot;v1\&quot;.
   * @return apiVersion
  **/
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public IoK8sApiCoreV1ObjectFieldSelector apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

 /**
   * Path of the field to select in the specified API version.
   * @return fieldPath
  **/
  @JsonProperty("fieldPath")
  @NotNull
  public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  public IoK8sApiCoreV1ObjectFieldSelector fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ObjectFieldSelector {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
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

