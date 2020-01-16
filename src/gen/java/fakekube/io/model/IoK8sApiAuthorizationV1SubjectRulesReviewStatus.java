package fakekube.io.model;

import fakekube.io.model.IoK8sApiAuthorizationV1NonResourceRule;
import fakekube.io.model.IoK8sApiAuthorizationV1ResourceRule;
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
  * SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete depending on the set of authorizers the server is configured with and any errors experienced during evaluation. Because authorization rules are additive, if a rule appears in a list it's safe to assume the subject has that permission, even if that list is incomplete.
 **/
@ApiModel(description="SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete depending on the set of authorizers the server is configured with and any errors experienced during evaluation. Because authorization rules are additive, if a rule appears in a list it's safe to assume the subject has that permission, even if that list is incomplete.")
public class IoK8sApiAuthorizationV1SubjectRulesReviewStatus  {
  
  @ApiModelProperty(value = "EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn't support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.")
 /**
   * EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn't support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.
  **/
  private String evaluationError = null;

  @ApiModelProperty(required = true, value = "Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.")
 /**
   * Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.
  **/
  private Boolean incomplete = null;

  @ApiModelProperty(required = true, value = "NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.")
  @Valid
 /**
   * NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
  **/
  private List<IoK8sApiAuthorizationV1NonResourceRule> nonResourceRules = new ArrayList<IoK8sApiAuthorizationV1NonResourceRule>();

  @ApiModelProperty(required = true, value = "ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.")
  @Valid
 /**
   * ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
  **/
  private List<IoK8sApiAuthorizationV1ResourceRule> resourceRules = new ArrayList<IoK8sApiAuthorizationV1ResourceRule>();
 /**
   * EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn&#39;t support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.
   * @return evaluationError
  **/
  @JsonProperty("evaluationError")
  public String getEvaluationError() {
    return evaluationError;
  }

  public void setEvaluationError(String evaluationError) {
    this.evaluationError = evaluationError;
  }

  public IoK8sApiAuthorizationV1SubjectRulesReviewStatus evaluationError(String evaluationError) {
    this.evaluationError = evaluationError;
    return this;
  }

 /**
   * Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn&#39;t support rules evaluation.
   * @return incomplete
  **/
  @JsonProperty("incomplete")
  @NotNull
  public Boolean getIncomplete() {
    return incomplete;
  }

  public void setIncomplete(Boolean incomplete) {
    this.incomplete = incomplete;
  }

  public IoK8sApiAuthorizationV1SubjectRulesReviewStatus incomplete(Boolean incomplete) {
    this.incomplete = incomplete;
    return this;
  }

 /**
   * NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete.
   * @return nonResourceRules
  **/
  @JsonProperty("nonResourceRules")
  @NotNull
  public List<IoK8sApiAuthorizationV1NonResourceRule> getNonResourceRules() {
    return nonResourceRules;
  }

  public void setNonResourceRules(List<IoK8sApiAuthorizationV1NonResourceRule> nonResourceRules) {
    this.nonResourceRules = nonResourceRules;
  }

  public IoK8sApiAuthorizationV1SubjectRulesReviewStatus nonResourceRules(List<IoK8sApiAuthorizationV1NonResourceRule> nonResourceRules) {
    this.nonResourceRules = nonResourceRules;
    return this;
  }

  public IoK8sApiAuthorizationV1SubjectRulesReviewStatus addNonResourceRulesItem(IoK8sApiAuthorizationV1NonResourceRule nonResourceRulesItem) {
    this.nonResourceRules.add(nonResourceRulesItem);
    return this;
  }

 /**
   * ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete.
   * @return resourceRules
  **/
  @JsonProperty("resourceRules")
  @NotNull
  public List<IoK8sApiAuthorizationV1ResourceRule> getResourceRules() {
    return resourceRules;
  }

  public void setResourceRules(List<IoK8sApiAuthorizationV1ResourceRule> resourceRules) {
    this.resourceRules = resourceRules;
  }

  public IoK8sApiAuthorizationV1SubjectRulesReviewStatus resourceRules(List<IoK8sApiAuthorizationV1ResourceRule> resourceRules) {
    this.resourceRules = resourceRules;
    return this;
  }

  public IoK8sApiAuthorizationV1SubjectRulesReviewStatus addResourceRulesItem(IoK8sApiAuthorizationV1ResourceRule resourceRulesItem) {
    this.resourceRules.add(resourceRulesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthorizationV1SubjectRulesReviewStatus {\n");
    
    sb.append("    evaluationError: ").append(toIndentedString(evaluationError)).append("\n");
    sb.append("    incomplete: ").append(toIndentedString(incomplete)).append("\n");
    sb.append("    nonResourceRules: ").append(toIndentedString(nonResourceRules)).append("\n");
    sb.append("    resourceRules: ").append(toIndentedString(resourceRules)).append("\n");
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

