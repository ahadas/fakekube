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
  * ServiceAccountTokenProjection represents a projected service account token volume. This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).
 **/
@ApiModel(description="ServiceAccountTokenProjection represents a projected service account token volume. This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).")
public class IoK8sApiCoreV1ServiceAccountTokenProjection  {
  
  @ApiModelProperty(value = "Audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.")
 /**
   * Audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.
  **/
  private String audience = null;

  @ApiModelProperty(value = "ExpirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.")
 /**
   * ExpirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.
  **/
  private Long expirationSeconds = null;

  @ApiModelProperty(required = true, value = "Path is the path relative to the mount point of the file to project the token into.")
 /**
   * Path is the path relative to the mount point of the file to project the token into.
  **/
  private String path = null;
 /**
   * Audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.
   * @return audience
  **/
  @JsonProperty("audience")
  public String getAudience() {
    return audience;
  }

  public void setAudience(String audience) {
    this.audience = audience;
  }

  public IoK8sApiCoreV1ServiceAccountTokenProjection audience(String audience) {
    this.audience = audience;
    return this;
  }

 /**
   * ExpirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.
   * @return expirationSeconds
  **/
  @JsonProperty("expirationSeconds")
  public Long getExpirationSeconds() {
    return expirationSeconds;
  }

  public void setExpirationSeconds(Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
  }

  public IoK8sApiCoreV1ServiceAccountTokenProjection expirationSeconds(Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
    return this;
  }

 /**
   * Path is the path relative to the mount point of the file to project the token into.
   * @return path
  **/
  @JsonProperty("path")
  @NotNull
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public IoK8sApiCoreV1ServiceAccountTokenProjection path(String path) {
    this.path = path;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ServiceAccountTokenProjection {\n");
    
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    expirationSeconds: ").append(toIndentedString(expirationSeconds)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

