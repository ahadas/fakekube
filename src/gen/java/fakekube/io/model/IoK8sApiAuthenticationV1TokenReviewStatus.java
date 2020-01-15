package fakekube.io.model;

import fakekube.io.model.IoK8sApiAuthenticationV1UserInfo;
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
  * TokenReviewStatus is the result of the token authentication request.
 **/
@ApiModel(description="TokenReviewStatus is the result of the token authentication request.")
public class IoK8sApiAuthenticationV1TokenReviewStatus  {
  
  @ApiModelProperty(value = "Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token. An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token's audiences. A client of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns an empty status.audience field where status.authenticated is \"true\", the token is valid against the audience of the Kubernetes API server.")
 /**
   * Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token. An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token's audiences. A client of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns an empty status.audience field where status.authenticated is \"true\", the token is valid against the audience of the Kubernetes API server.
  **/
  private List<String> audiences = null;

  @ApiModelProperty(value = "Authenticated indicates that the token was associated with a known user.")
 /**
   * Authenticated indicates that the token was associated with a known user.
  **/
  private Boolean authenticated = null;

  @ApiModelProperty(value = "Error indicates that the token couldn't be checked")
 /**
   * Error indicates that the token couldn't be checked
  **/
  private String error = null;

  @ApiModelProperty(value = "User is the UserInfo associated with the provided token.")
  @Valid
 /**
   * User is the UserInfo associated with the provided token.
  **/
  private IoK8sApiAuthenticationV1UserInfo user = null;
 /**
   * Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token. An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token&#39;s audiences. A client of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns an empty status.audience field where status.authenticated is \&quot;true\&quot;, the token is valid against the audience of the Kubernetes API server.
   * @return audiences
  **/
  @JsonProperty("audiences")
  public List<String> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<String> audiences) {
    this.audiences = audiences;
  }

  public IoK8sApiAuthenticationV1TokenReviewStatus audiences(List<String> audiences) {
    this.audiences = audiences;
    return this;
  }

  public IoK8sApiAuthenticationV1TokenReviewStatus addAudiencesItem(String audiencesItem) {
    this.audiences.add(audiencesItem);
    return this;
  }

 /**
   * Authenticated indicates that the token was associated with a known user.
   * @return authenticated
  **/
  @JsonProperty("authenticated")
  public Boolean isAuthenticated() {
    return authenticated;
  }

  public void setAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
  }

  public IoK8sApiAuthenticationV1TokenReviewStatus authenticated(Boolean authenticated) {
    this.authenticated = authenticated;
    return this;
  }

 /**
   * Error indicates that the token couldn&#39;t be checked
   * @return error
  **/
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public IoK8sApiAuthenticationV1TokenReviewStatus error(String error) {
    this.error = error;
    return this;
  }

 /**
   * User is the UserInfo associated with the provided token.
   * @return user
  **/
  @JsonProperty("user")
  public IoK8sApiAuthenticationV1UserInfo getUser() {
    return user;
  }

  public void setUser(IoK8sApiAuthenticationV1UserInfo user) {
    this.user = user;
  }

  public IoK8sApiAuthenticationV1TokenReviewStatus user(IoK8sApiAuthenticationV1UserInfo user) {
    this.user = user;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthenticationV1TokenReviewStatus {\n");
    
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

