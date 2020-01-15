package fakekube.io.model;

import fakekube.io.model.IoK8sApiFlowcontrolV1alpha1FlowDistinguisherMethod;
import fakekube.io.model.IoK8sApiFlowcontrolV1alpha1PolicyRulesWithSubjects;
import fakekube.io.model.IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationReference;
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
  * FlowSchemaSpec describes how the FlowSchema's specification looks like.
 **/
@ApiModel(description="FlowSchemaSpec describes how the FlowSchema's specification looks like.")
public class IoK8sApiFlowcontrolV1alpha1FlowSchemaSpec  {
  
  @ApiModelProperty(value = "`distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.")
  @Valid
 /**
   * `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
  **/
  private IoK8sApiFlowcontrolV1alpha1FlowDistinguisherMethod distinguisherMethod = null;

  @ApiModelProperty(value = "`matchingPrecedence` is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.")
 /**
   * `matchingPrecedence` is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.
  **/
  private Integer matchingPrecedence = null;

  @ApiModelProperty(required = true, value = "`priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.")
  @Valid
 /**
   * `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
  **/
  private IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationReference priorityLevelConfiguration = null;

  @ApiModelProperty(value = "`rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.")
  @Valid
 /**
   * `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
  **/
  private List<IoK8sApiFlowcontrolV1alpha1PolicyRulesWithSubjects> rules = null;
 /**
   * &#x60;distinguisherMethod&#x60; defines how to compute the flow distinguisher for requests that match this schema. &#x60;nil&#x60; specifies that the distinguisher is disabled and thus will always be the empty string.
   * @return distinguisherMethod
  **/
  @JsonProperty("distinguisherMethod")
  public IoK8sApiFlowcontrolV1alpha1FlowDistinguisherMethod getDistinguisherMethod() {
    return distinguisherMethod;
  }

  public void setDistinguisherMethod(IoK8sApiFlowcontrolV1alpha1FlowDistinguisherMethod distinguisherMethod) {
    this.distinguisherMethod = distinguisherMethod;
  }

  public IoK8sApiFlowcontrolV1alpha1FlowSchemaSpec distinguisherMethod(IoK8sApiFlowcontrolV1alpha1FlowDistinguisherMethod distinguisherMethod) {
    this.distinguisherMethod = distinguisherMethod;
    return this;
  }

 /**
   * &#x60;matchingPrecedence&#x60; is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.
   * @return matchingPrecedence
  **/
  @JsonProperty("matchingPrecedence")
  public Integer getMatchingPrecedence() {
    return matchingPrecedence;
  }

  public void setMatchingPrecedence(Integer matchingPrecedence) {
    this.matchingPrecedence = matchingPrecedence;
  }

  public IoK8sApiFlowcontrolV1alpha1FlowSchemaSpec matchingPrecedence(Integer matchingPrecedence) {
    this.matchingPrecedence = matchingPrecedence;
    return this;
  }

 /**
   * &#x60;priorityLevelConfiguration&#x60; should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
   * @return priorityLevelConfiguration
  **/
  @JsonProperty("priorityLevelConfiguration")
  @NotNull
  public IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationReference getPriorityLevelConfiguration() {
    return priorityLevelConfiguration;
  }

  public void setPriorityLevelConfiguration(IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationReference priorityLevelConfiguration) {
    this.priorityLevelConfiguration = priorityLevelConfiguration;
  }

  public IoK8sApiFlowcontrolV1alpha1FlowSchemaSpec priorityLevelConfiguration(IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationReference priorityLevelConfiguration) {
    this.priorityLevelConfiguration = priorityLevelConfiguration;
    return this;
  }

 /**
   * &#x60;rules&#x60; describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
   * @return rules
  **/
  @JsonProperty("rules")
  public List<IoK8sApiFlowcontrolV1alpha1PolicyRulesWithSubjects> getRules() {
    return rules;
  }

  public void setRules(List<IoK8sApiFlowcontrolV1alpha1PolicyRulesWithSubjects> rules) {
    this.rules = rules;
  }

  public IoK8sApiFlowcontrolV1alpha1FlowSchemaSpec rules(List<IoK8sApiFlowcontrolV1alpha1PolicyRulesWithSubjects> rules) {
    this.rules = rules;
    return this;
  }

  public IoK8sApiFlowcontrolV1alpha1FlowSchemaSpec addRulesItem(IoK8sApiFlowcontrolV1alpha1PolicyRulesWithSubjects rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiFlowcontrolV1alpha1FlowSchemaSpec {\n");
    
    sb.append("    distinguisherMethod: ").append(toIndentedString(distinguisherMethod)).append("\n");
    sb.append("    matchingPrecedence: ").append(toIndentedString(matchingPrecedence)).append("\n");
    sb.append("    priorityLevelConfiguration: ").append(toIndentedString(priorityLevelConfiguration)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

