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
  * Information about the condition of a component.
 **/
@ApiModel(description="Information about the condition of a component.")
public class IoK8sApiCoreV1ComponentCondition  {
  
  @ApiModelProperty(value = "Condition error code for a component. For example, a health check error code.")
 /**
   * Condition error code for a component. For example, a health check error code.
  **/
  private String error = null;

  @ApiModelProperty(value = "Message about the condition for a component. For example, information about a health check.")
 /**
   * Message about the condition for a component. For example, information about a health check.
  **/
  private String message = null;

  @ApiModelProperty(required = true, value = "Status of the condition for a component. Valid values for \"Healthy\": \"True\", \"False\", or \"Unknown\".")
 /**
   * Status of the condition for a component. Valid values for \"Healthy\": \"True\", \"False\", or \"Unknown\".
  **/
  private String status = null;

  @ApiModelProperty(required = true, value = "Type of condition for a component. Valid value: \"Healthy\"")
 /**
   * Type of condition for a component. Valid value: \"Healthy\"
  **/
  private String type = null;
 /**
   * Condition error code for a component. For example, a health check error code.
   * @return error
  **/
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public IoK8sApiCoreV1ComponentCondition error(String error) {
    this.error = error;
    return this;
  }

 /**
   * Message about the condition for a component. For example, information about a health check.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApiCoreV1ComponentCondition message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Status of the condition for a component. Valid values for \&quot;Healthy\&quot;: \&quot;True\&quot;, \&quot;False\&quot;, or \&quot;Unknown\&quot;.
   * @return status
  **/
  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public IoK8sApiCoreV1ComponentCondition status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Type of condition for a component. Valid value: \&quot;Healthy\&quot;
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

  public IoK8sApiCoreV1ComponentCondition type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ComponentCondition {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

