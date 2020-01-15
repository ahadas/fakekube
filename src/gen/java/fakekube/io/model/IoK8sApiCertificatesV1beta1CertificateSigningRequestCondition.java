package fakekube.io.model;

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

public class IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition  {
  
  @ApiModelProperty(value = "timestamp for the last update to this condition")
 /**
   * timestamp for the last update to this condition
  **/
  private String lastUpdateTime = null;

  @ApiModelProperty(value = "human readable message with details about the request state")
 /**
   * human readable message with details about the request state
  **/
  private String message = null;

  @ApiModelProperty(value = "brief reason for the request state")
 /**
   * brief reason for the request state
  **/
  private String reason = null;

  @ApiModelProperty(required = true, value = "request approval state, currently Approved or Denied.")
 /**
   * request approval state, currently Approved or Denied.
  **/
  private String type = null;
 /**
   * timestamp for the last update to this condition
   * @return lastUpdateTime
  **/
  @JsonProperty("lastUpdateTime")
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

 /**
   * human readable message with details about the request state
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition message(String message) {
    this.message = message;
    return this;
  }

 /**
   * brief reason for the request state
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

 /**
   * request approval state, currently Approved or Denied.
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

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition {\n");
    
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

