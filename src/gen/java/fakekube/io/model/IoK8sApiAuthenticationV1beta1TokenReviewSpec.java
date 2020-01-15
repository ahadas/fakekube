package fakekube.io.model;

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
  * TokenReviewSpec is a description of the token authentication request.
 **/
@ApiModel(description="TokenReviewSpec is a description of the token authentication request.")
public class IoK8sApiAuthenticationV1beta1TokenReviewSpec  {
  
  @ApiModelProperty(value = "Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.")
 /**
   * Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
  **/
  private List<String> audiences = null;

  @ApiModelProperty(value = "Token is the opaque bearer token.")
 /**
   * Token is the opaque bearer token.
  **/
  private String token = null;
 /**
   * Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
   * @return audiences
  **/
  @JsonProperty("audiences")
  public List<String> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<String> audiences) {
    this.audiences = audiences;
  }

  public IoK8sApiAuthenticationV1beta1TokenReviewSpec audiences(List<String> audiences) {
    this.audiences = audiences;
    return this;
  }

  public IoK8sApiAuthenticationV1beta1TokenReviewSpec addAudiencesItem(String audiencesItem) {
    this.audiences.add(audiencesItem);
    return this;
  }

 /**
   * Token is the opaque bearer token.
   * @return token
  **/
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public IoK8sApiAuthenticationV1beta1TokenReviewSpec token(String token) {
    this.token = token;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthenticationV1beta1TokenReviewSpec {\n");
    
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
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

