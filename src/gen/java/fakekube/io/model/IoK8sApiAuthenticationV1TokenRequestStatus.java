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
  * TokenRequestStatus is the result of a token request.
 **/
@ApiModel(description="TokenRequestStatus is the result of a token request.")
public class IoK8sApiAuthenticationV1TokenRequestStatus  {
  
  @ApiModelProperty(required = true, value = "ExpirationTimestamp is the time of expiration of the returned token.")
 /**
   * ExpirationTimestamp is the time of expiration of the returned token.
  **/
  private String expirationTimestamp = null;

  @ApiModelProperty(required = true, value = "Token is the opaque bearer token.")
 /**
   * Token is the opaque bearer token.
  **/
  private String token = null;
 /**
   * ExpirationTimestamp is the time of expiration of the returned token.
   * @return expirationTimestamp
  **/
  @JsonProperty("expirationTimestamp")
  @NotNull
  public String getExpirationTimestamp() {
    return expirationTimestamp;
  }

  public void setExpirationTimestamp(String expirationTimestamp) {
    this.expirationTimestamp = expirationTimestamp;
  }

  public IoK8sApiAuthenticationV1TokenRequestStatus expirationTimestamp(String expirationTimestamp) {
    this.expirationTimestamp = expirationTimestamp;
    return this;
  }

 /**
   * Token is the opaque bearer token.
   * @return token
  **/
  @JsonProperty("token")
  @NotNull
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public IoK8sApiAuthenticationV1TokenRequestStatus token(String token) {
    this.token = token;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthenticationV1TokenRequestStatus {\n");
    
    sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

