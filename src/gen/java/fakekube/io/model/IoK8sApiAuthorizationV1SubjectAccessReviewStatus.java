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
  * SubjectAccessReviewStatus
 **/
@ApiModel(description="SubjectAccessReviewStatus")
public class IoK8sApiAuthorizationV1SubjectAccessReviewStatus  {
  
  @ApiModelProperty(required = true, value = "Allowed is required. True if the action would be allowed, false otherwise.")
 /**
   * Allowed is required. True if the action would be allowed, false otherwise.
  **/
  private Boolean allowed = null;

  @ApiModelProperty(value = "Denied is optional. True if the action would be denied, otherwise false. If both allowed is false and denied is false, then the authorizer has no opinion on whether to authorize the action. Denied may not be true if Allowed is true.")
 /**
   * Denied is optional. True if the action would be denied, otherwise false. If both allowed is false and denied is false, then the authorizer has no opinion on whether to authorize the action. Denied may not be true if Allowed is true.
  **/
  private Boolean denied = null;

  @ApiModelProperty(value = "EvaluationError is an indication that some error occurred during the authorization check. It is entirely possible to get an error and be able to continue determine authorization status in spite of it. For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.")
 /**
   * EvaluationError is an indication that some error occurred during the authorization check. It is entirely possible to get an error and be able to continue determine authorization status in spite of it. For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
  **/
  private String evaluationError = null;

  @ApiModelProperty(value = "Reason is optional.  It indicates why a request was allowed or denied.")
 /**
   * Reason is optional.  It indicates why a request was allowed or denied.
  **/
  private String reason = null;
 /**
   * Allowed is required. True if the action would be allowed, false otherwise.
   * @return allowed
  **/
  @JsonProperty("allowed")
  @NotNull
  public Boolean isAllowed() {
    return allowed;
  }

  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }

  public IoK8sApiAuthorizationV1SubjectAccessReviewStatus allowed(Boolean allowed) {
    this.allowed = allowed;
    return this;
  }

 /**
   * Denied is optional. True if the action would be denied, otherwise false. If both allowed is false and denied is false, then the authorizer has no opinion on whether to authorize the action. Denied may not be true if Allowed is true.
   * @return denied
  **/
  @JsonProperty("denied")
  public Boolean isDenied() {
    return denied;
  }

  public void setDenied(Boolean denied) {
    this.denied = denied;
  }

  public IoK8sApiAuthorizationV1SubjectAccessReviewStatus denied(Boolean denied) {
    this.denied = denied;
    return this;
  }

 /**
   * EvaluationError is an indication that some error occurred during the authorization check. It is entirely possible to get an error and be able to continue determine authorization status in spite of it. For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
   * @return evaluationError
  **/
  @JsonProperty("evaluationError")
  public String getEvaluationError() {
    return evaluationError;
  }

  public void setEvaluationError(String evaluationError) {
    this.evaluationError = evaluationError;
  }

  public IoK8sApiAuthorizationV1SubjectAccessReviewStatus evaluationError(String evaluationError) {
    this.evaluationError = evaluationError;
    return this;
  }

 /**
   * Reason is optional.  It indicates why a request was allowed or denied.
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sApiAuthorizationV1SubjectAccessReviewStatus reason(String reason) {
    this.reason = reason;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthorizationV1SubjectAccessReviewStatus {\n");
    
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    denied: ").append(toIndentedString(denied)).append("\n");
    sb.append("    evaluationError: ").append(toIndentedString(evaluationError)).append("\n");
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

