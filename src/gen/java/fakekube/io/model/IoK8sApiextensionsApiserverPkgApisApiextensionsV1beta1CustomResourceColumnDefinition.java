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
  * CustomResourceColumnDefinition specifies a column for server side printing.
 **/
@ApiModel(description="CustomResourceColumnDefinition specifies a column for server side printing.")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition  {
  
  @ApiModelProperty(required = true, value = "JSONPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.")
 /**
   * JSONPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.
  **/
  private String jsONPath = null;

  @ApiModelProperty(value = "description is a human readable description of this column.")
 /**
   * description is a human readable description of this column.
  **/
  private String description = null;

  @ApiModelProperty(value = "format is an optional OpenAPI type definition for this column. The 'name' format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.")
 /**
   * format is an optional OpenAPI type definition for this column. The 'name' format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
  **/
  private String format = null;

  @ApiModelProperty(required = true, value = "name is a human readable name for the column.")
 /**
   * name is a human readable name for the column.
  **/
  private String name = null;

  @ApiModelProperty(value = "priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.")
 /**
   * priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
  **/
  private Integer priority = null;

  @ApiModelProperty(required = true, value = "type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.")
 /**
   * type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
  **/
  private String type = null;
 /**
   * JSONPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.
   * @return jsONPath
  **/
  @JsonProperty("JSONPath")
  @NotNull
  public String getJsONPath() {
    return jsONPath;
  }

  public void setJsONPath(String jsONPath) {
    this.jsONPath = jsONPath;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition jsONPath(String jsONPath) {
    this.jsONPath = jsONPath;
    return this;
  }

 /**
   * description is a human readable description of this column.
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition description(String description) {
    this.description = description;
    return this;
  }

 /**
   * format is an optional OpenAPI type definition for this column. The &#39;name&#39; format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
   * @return format
  **/
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition format(String format) {
    this.format = format;
    return this;
  }

 /**
   * name is a human readable name for the column.
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

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition name(String name) {
    this.name = name;
    return this;
  }

 /**
   * priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
   * @return priority
  **/
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition priority(Integer priority) {
    this.priority = priority;
    return this;
  }

 /**
   * type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition {\n");
    
    sb.append("    jsONPath: ").append(toIndentedString(jsONPath)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

