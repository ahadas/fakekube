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
  * VolumeError captures an error encountered during a volume operation.
 **/
@ApiModel(description="VolumeError captures an error encountered during a volume operation.")
public class IoK8sApiStorageV1alpha1VolumeError  {
  
  @ApiModelProperty(value = "String detailing the error encountered during Attach or Detach operation. This string maybe logged, so it should not contain sensitive information.")
 /**
   * String detailing the error encountered during Attach or Detach operation. This string maybe logged, so it should not contain sensitive information.
  **/
  private String message = null;

  @ApiModelProperty(value = "Time the error was encountered.")
 /**
   * Time the error was encountered.
  **/
  private String time = null;
 /**
   * String detailing the error encountered during Attach or Detach operation. This string maybe logged, so it should not contain sensitive information.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApiStorageV1alpha1VolumeError message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Time the error was encountered.
   * @return time
  **/
  @JsonProperty("time")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public IoK8sApiStorageV1alpha1VolumeError time(String time) {
    this.time = time;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiStorageV1alpha1VolumeError {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

