package fakekube.io.model;

import fakekube.io.model.IoK8sApiFlowcontrolV1alpha1NonResourcePolicyRule;
import fakekube.io.model.IoK8sApiFlowcontrolV1alpha1ResourcePolicyRule;
import fakekube.io.model.IoK8sApiFlowcontrolV1alpha1Subject;
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
  * PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.
 **/
@ApiModel(description="PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.")
public class IoK8sApiFlowcontrolV1alpha1PolicyRulesWithSubjects  {
  
  @ApiModelProperty(value = "`nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.")
  @Valid
 /**
   * `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
  **/
  private List<IoK8sApiFlowcontrolV1alpha1NonResourcePolicyRule> nonResourceRules = null;

  @ApiModelProperty(value = "`resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.")
  @Valid
 /**
   * `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
  **/
  private List<IoK8sApiFlowcontrolV1alpha1ResourcePolicyRule> resourceRules = null;

  @ApiModelProperty(required = true, value = "subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.")
  @Valid
 /**
   * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
  **/
  private List<IoK8sApiFlowcontrolV1alpha1Subject> subjects = new ArrayList<IoK8sApiFlowcontrolV1alpha1Subject>();
 /**
   * &#x60;nonResourceRules&#x60; is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
   * @return nonResourceRules
  **/
  @JsonProperty("nonResourceRules")
  public List<IoK8sApiFlowcontrolV1alpha1NonResourcePolicyRule> getNonResourceRules() {
    return nonResourceRules;
  }

  public void setNonResourceRules(List<IoK8sApiFlowcontrolV1alpha1NonResourcePolicyRule> nonResourceRules) {
    this.nonResourceRules = nonResourceRules;
  }

  public IoK8sApiFlowcontrolV1alpha1PolicyRulesWithSubjects nonResourceRules(List<IoK8sApiFlowcontrolV1alpha1NonResourcePolicyRule> nonResourceRules) {
    this.nonResourceRules = nonResourceRules;
    return this;
  }

  public IoK8sApiFlowcontrolV1alpha1PolicyRulesWithSubjects addNonResourceRulesItem(IoK8sApiFlowcontrolV1alpha1NonResourcePolicyRule nonResourceRulesItem) {
    this.nonResourceRules.add(nonResourceRulesItem);
    return this;
  }

 /**
   * &#x60;resourceRules&#x60; is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of &#x60;resourceRules&#x60; and &#x60;nonResourceRules&#x60; has to be non-empty.
   * @return resourceRules
  **/
  @JsonProperty("resourceRules")
  public List<IoK8sApiFlowcontrolV1alpha1ResourcePolicyRule> getResourceRules() {
    return resourceRules;
  }

  public void setResourceRules(List<IoK8sApiFlowcontrolV1alpha1ResourcePolicyRule> resourceRules) {
    this.resourceRules = resourceRules;
  }

  public IoK8sApiFlowcontrolV1alpha1PolicyRulesWithSubjects resourceRules(List<IoK8sApiFlowcontrolV1alpha1ResourcePolicyRule> resourceRules) {
    this.resourceRules = resourceRules;
    return this;
  }

  public IoK8sApiFlowcontrolV1alpha1PolicyRulesWithSubjects addResourceRulesItem(IoK8sApiFlowcontrolV1alpha1ResourcePolicyRule resourceRulesItem) {
    this.resourceRules.add(resourceRulesItem);
    return this;
  }

 /**
   * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
   * @return subjects
  **/
  @JsonProperty("subjects")
  @NotNull
  public List<IoK8sApiFlowcontrolV1alpha1Subject> getSubjects() {
    return subjects;
  }

  public void setSubjects(List<IoK8sApiFlowcontrolV1alpha1Subject> subjects) {
    this.subjects = subjects;
  }

  public IoK8sApiFlowcontrolV1alpha1PolicyRulesWithSubjects subjects(List<IoK8sApiFlowcontrolV1alpha1Subject> subjects) {
    this.subjects = subjects;
    return this;
  }

  public IoK8sApiFlowcontrolV1alpha1PolicyRulesWithSubjects addSubjectsItem(IoK8sApiFlowcontrolV1alpha1Subject subjectsItem) {
    this.subjects.add(subjectsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiFlowcontrolV1alpha1PolicyRulesWithSubjects {\n");
    
    sb.append("    nonResourceRules: ").append(toIndentedString(nonResourceRules)).append("\n");
    sb.append("    resourceRules: ").append(toIndentedString(resourceRules)).append("\n");
    sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
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

