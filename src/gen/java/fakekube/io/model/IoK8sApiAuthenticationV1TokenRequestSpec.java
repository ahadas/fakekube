package fakekube.io.model;

import fakekube.io.model.IoK8sApiAuthenticationV1BoundObjectReference;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
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
  * TokenRequestSpec contains client provided parameters of a token request.
 **/
@ApiModel(description="TokenRequestSpec contains client provided parameters of a token request.")
public class IoK8sApiAuthenticationV1TokenRequestSpec  {
  
  @ApiModelProperty(required = true, value = "Audiences are the intendend audiences of the token. A recipient of a token must identitfy themself with an identifier in the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be used to authenticate against any of the audiences listed but implies a high degree of trust between the target audiences.")
 /**
   * Audiences are the intendend audiences of the token. A recipient of a token must identitfy themself with an identifier in the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be used to authenticate against any of the audiences listed but implies a high degree of trust between the target audiences.
  **/
  private List<String> audiences = new ArrayList<String>();

  @ApiModelProperty(value = "BoundObjectRef is a reference to an object that the token will be bound to. The token will only be valid for as long as the bound object exists. NOTE: The API server's TokenReview endpoint will validate the BoundObjectRef, but other audiences may not. Keep ExpirationSeconds small if you want prompt revocation.")
  @Valid
 /**
   * BoundObjectRef is a reference to an object that the token will be bound to. The token will only be valid for as long as the bound object exists. NOTE: The API server's TokenReview endpoint will validate the BoundObjectRef, but other audiences may not. Keep ExpirationSeconds small if you want prompt revocation.
  **/
  private IoK8sApiAuthenticationV1BoundObjectReference boundObjectRef = null;

  @ApiModelProperty(value = "ExpirationSeconds is the requested duration of validity of the request. The token issuer may return a token with a different validity duration so a client needs to check the 'expiration' field in a response.")
 /**
   * ExpirationSeconds is the requested duration of validity of the request. The token issuer may return a token with a different validity duration so a client needs to check the 'expiration' field in a response.
  **/
  private Long expirationSeconds = null;
 /**
   * Audiences are the intendend audiences of the token. A recipient of a token must identitfy themself with an identifier in the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be used to authenticate against any of the audiences listed but implies a high degree of trust between the target audiences.
   * @return audiences
  **/
  @JsonProperty("audiences")
  @NotNull
  public List<String> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<String> audiences) {
    this.audiences = audiences;
  }

  public IoK8sApiAuthenticationV1TokenRequestSpec audiences(List<String> audiences) {
    this.audiences = audiences;
    return this;
  }

  public IoK8sApiAuthenticationV1TokenRequestSpec addAudiencesItem(String audiencesItem) {
    this.audiences.add(audiencesItem);
    return this;
  }

 /**
   * BoundObjectRef is a reference to an object that the token will be bound to. The token will only be valid for as long as the bound object exists. NOTE: The API server&#39;s TokenReview endpoint will validate the BoundObjectRef, but other audiences may not. Keep ExpirationSeconds small if you want prompt revocation.
   * @return boundObjectRef
  **/
  @JsonProperty("boundObjectRef")
  public IoK8sApiAuthenticationV1BoundObjectReference getBoundObjectRef() {
    return boundObjectRef;
  }

  public void setBoundObjectRef(IoK8sApiAuthenticationV1BoundObjectReference boundObjectRef) {
    this.boundObjectRef = boundObjectRef;
  }

  public IoK8sApiAuthenticationV1TokenRequestSpec boundObjectRef(IoK8sApiAuthenticationV1BoundObjectReference boundObjectRef) {
    this.boundObjectRef = boundObjectRef;
    return this;
  }

 /**
   * ExpirationSeconds is the requested duration of validity of the request. The token issuer may return a token with a different validity duration so a client needs to check the &#39;expiration&#39; field in a response.
   * @return expirationSeconds
  **/
  @JsonProperty("expirationSeconds")
  public Long getExpirationSeconds() {
    return expirationSeconds;
  }

  public void setExpirationSeconds(Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
  }

  public IoK8sApiAuthenticationV1TokenRequestSpec expirationSeconds(Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthenticationV1TokenRequestSpec {\n");
    
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
    sb.append("    boundObjectRef: ").append(toIndentedString(boundObjectRef)).append("\n");
    sb.append("    expirationSeconds: ").append(toIndentedString(expirationSeconds)).append("\n");
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

