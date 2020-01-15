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
  * PersistentVolumeStatus is the current status of a persistent volume.
 **/
@ApiModel(description="PersistentVolumeStatus is the current status of a persistent volume.")
public class IoK8sApiCoreV1PersistentVolumeStatus  {
  
  @ApiModelProperty(value = "A human-readable message indicating details about why the volume is in this state.")
 /**
   * A human-readable message indicating details about why the volume is in this state.
  **/
  private String message = null;

  @ApiModelProperty(value = "Phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase")
 /**
   * Phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
  **/
  private String phase = null;

  @ApiModelProperty(value = "Reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.")
 /**
   * Reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.
  **/
  private String reason = null;
 /**
   * A human-readable message indicating details about why the volume is in this state.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApiCoreV1PersistentVolumeStatus message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
   * @return phase
  **/
  @JsonProperty("phase")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public IoK8sApiCoreV1PersistentVolumeStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

 /**
   * Reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sApiCoreV1PersistentVolumeStatus reason(String reason) {
    this.reason = reason;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PersistentVolumeStatus {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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

