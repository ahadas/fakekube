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
  * StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.
 **/
@ApiModel(description="StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.")
public class IoK8sApimachineryPkgApisMetaV1StatusCause  {
  
  @ApiModelProperty(value = "The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.  Examples:   \"name\" - the field \"name\" on the current resource   \"items[0].name\" - the field \"name\" on the first array entry in \"items\"")
 /**
   * The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.  Examples:   \"name\" - the field \"name\" on the current resource   \"items[0].name\" - the field \"name\" on the first array entry in \"items\"
  **/
  private String field = null;

  @ApiModelProperty(value = "A human-readable description of the cause of the error.  This field may be presented as-is to a reader.")
 /**
   * A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
  **/
  private String message = null;

  @ApiModelProperty(value = "A machine-readable description of the cause of the error. If this value is empty there is no information available.")
 /**
   * A machine-readable description of the cause of the error. If this value is empty there is no information available.
  **/
  private String reason = null;
 /**
   * The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.  Examples:   \&quot;name\&quot; - the field \&quot;name\&quot; on the current resource   \&quot;items[0].name\&quot; - the field \&quot;name\&quot; on the first array entry in \&quot;items\&quot;
   * @return field
  **/
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public IoK8sApimachineryPkgApisMetaV1StatusCause field(String field) {
    this.field = field;
    return this;
  }

 /**
   * A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApimachineryPkgApisMetaV1StatusCause message(String message) {
    this.message = message;
    return this;
  }

 /**
   * A machine-readable description of the cause of the error. If this value is empty there is no information available.
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sApimachineryPkgApisMetaV1StatusCause reason(String reason) {
    this.reason = reason;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1StatusCause {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

