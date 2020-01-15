package fakekube.io.model;

import fakekube.io.model.IoK8sApiAdmissionregistrationV1beta1RuleWithOperations;
import fakekube.io.model.IoK8sApiAdmissionregistrationV1beta1WebhookClientConfig;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1LabelSelector;
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
  * ValidatingWebhook describes an admission webhook and the resources and operations it applies to.
 **/
@ApiModel(description="ValidatingWebhook describes an admission webhook and the resources and operations it applies to.")
public class IoK8sApiAdmissionregistrationV1beta1ValidatingWebhook  {
  
  @ApiModelProperty(value = "AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `['v1beta1']`.")
 /**
   * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `['v1beta1']`.
  **/
  private List<String> admissionReviewVersions = null;

  @ApiModelProperty(required = true, value = "ClientConfig defines how to communicate with the hook. Required")
  @Valid
 /**
   * ClientConfig defines how to communicate with the hook. Required
  **/
  private IoK8sApiAdmissionregistrationV1beta1WebhookClientConfig clientConfig = null;

  @ApiModelProperty(value = "FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.")
 /**
   * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
  **/
  private String failurePolicy = null;

  @ApiModelProperty(value = "matchPolicy defines how the \"rules\" list is used to match incoming requests. Allowed values are \"Exact\" or \"Equivalent\".  - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but \"rules\" only included `apiGroups:[\"apps\"], apiVersions:[\"v1\"], resources: [\"deployments\"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.  - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and \"rules\" only included `apiGroups:[\"apps\"], apiVersions:[\"v1\"], resources: [\"deployments\"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.  Defaults to \"Exact\"")
 /**
   * matchPolicy defines how the \"rules\" list is used to match incoming requests. Allowed values are \"Exact\" or \"Equivalent\".  - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but \"rules\" only included `apiGroups:[\"apps\"], apiVersions:[\"v1\"], resources: [\"deployments\"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.  - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and \"rules\" only included `apiGroups:[\"apps\"], apiVersions:[\"v1\"], resources: [\"deployments\"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.  Defaults to \"Exact\"
  **/
  private String matchPolicy = null;

  @ApiModelProperty(required = true, value = "The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where \"imagepolicy\" is the name of the webhook, and kubernetes.io is the name of the organization. Required.")
 /**
   * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where \"imagepolicy\" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
  **/
  private String name = null;

  @ApiModelProperty(value = "NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.  For example, to run the webhook on any objects whose namespace is not associated with \"runlevel\" of \"0\" or \"1\";  you will set the selector as follows: \"namespaceSelector\": {   \"matchExpressions\": [     {       \"key\": \"runlevel\",       \"operator\": \"NotIn\",       \"values\": [         \"0\",         \"1\"       ]     }   ] }  If instead you want to only run the webhook on any objects whose namespace is associated with the \"environment\" of \"prod\" or \"staging\"; you will set the selector as follows: \"namespaceSelector\": {   \"matchExpressions\": [     {       \"key\": \"environment\",       \"operator\": \"In\",       \"values\": [         \"prod\",         \"staging\"       ]     }   ] }  See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels for more examples of label selectors.  Default to the empty LabelSelector, which matches everything.")
  @Valid
 /**
   * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.  For example, to run the webhook on any objects whose namespace is not associated with \"runlevel\" of \"0\" or \"1\";  you will set the selector as follows: \"namespaceSelector\": {   \"matchExpressions\": [     {       \"key\": \"runlevel\",       \"operator\": \"NotIn\",       \"values\": [         \"0\",         \"1\"       ]     }   ] }  If instead you want to only run the webhook on any objects whose namespace is associated with the \"environment\" of \"prod\" or \"staging\"; you will set the selector as follows: \"namespaceSelector\": {   \"matchExpressions\": [     {       \"key\": \"environment\",       \"operator\": \"In\",       \"values\": [         \"prod\",         \"staging\"       ]     }   ] }  See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels for more examples of label selectors.  Default to the empty LabelSelector, which matches everything.
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector namespaceSelector = null;

  @ApiModelProperty(value = "ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.")
  @Valid
 /**
   * ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector objectSelector = null;

  @ApiModelProperty(value = "Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.")
  @Valid
 /**
   * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
  **/
  private List<IoK8sApiAdmissionregistrationV1beta1RuleWithOperations> rules = null;

  @ApiModelProperty(value = "SideEffects states whether this webhook has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.")
 /**
   * SideEffects states whether this webhook has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.
  **/
  private String sideEffects = null;

  @ApiModelProperty(value = "TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.")
 /**
   * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
  **/
  private Integer timeoutSeconds = null;
 /**
   * AdmissionReviewVersions is an ordered list of preferred &#x60;AdmissionReview&#x60; versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to &#x60;[&#39;v1beta1&#39;]&#x60;.
   * @return admissionReviewVersions
  **/
  @JsonProperty("admissionReviewVersions")
  public List<String> getAdmissionReviewVersions() {
    return admissionReviewVersions;
  }

  public void setAdmissionReviewVersions(List<String> admissionReviewVersions) {
    this.admissionReviewVersions = admissionReviewVersions;
  }

  public IoK8sApiAdmissionregistrationV1beta1ValidatingWebhook admissionReviewVersions(List<String> admissionReviewVersions) {
    this.admissionReviewVersions = admissionReviewVersions;
    return this;
  }

  public IoK8sApiAdmissionregistrationV1beta1ValidatingWebhook addAdmissionReviewVersionsItem(String admissionReviewVersionsItem) {
    this.admissionReviewVersions.add(admissionReviewVersionsItem);
    return this;
  }

 /**
   * ClientConfig defines how to communicate with the hook. Required
   * @return clientConfig
  **/
  @JsonProperty("clientConfig")
  @NotNull
  public IoK8sApiAdmissionregistrationV1beta1WebhookClientConfig getClientConfig() {
    return clientConfig;
  }

  public void setClientConfig(IoK8sApiAdmissionregistrationV1beta1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
  }

  public IoK8sApiAdmissionregistrationV1beta1ValidatingWebhook clientConfig(IoK8sApiAdmissionregistrationV1beta1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
    return this;
  }

 /**
   * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
   * @return failurePolicy
  **/
  @JsonProperty("failurePolicy")
  public String getFailurePolicy() {
    return failurePolicy;
  }

  public void setFailurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
  }

  public IoK8sApiAdmissionregistrationV1beta1ValidatingWebhook failurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
    return this;
  }

 /**
   * matchPolicy defines how the \&quot;rules\&quot; list is used to match incoming requests. Allowed values are \&quot;Exact\&quot; or \&quot;Equivalent\&quot;.  - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but \&quot;rules\&quot; only included &#x60;apiGroups:[\&quot;apps\&quot;], apiVersions:[\&quot;v1\&quot;], resources: [\&quot;deployments\&quot;]&#x60;, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.  - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and \&quot;rules\&quot; only included &#x60;apiGroups:[\&quot;apps\&quot;], apiVersions:[\&quot;v1\&quot;], resources: [\&quot;deployments\&quot;]&#x60;, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.  Defaults to \&quot;Exact\&quot;
   * @return matchPolicy
  **/
  @JsonProperty("matchPolicy")
  public String getMatchPolicy() {
    return matchPolicy;
  }

  public void setMatchPolicy(String matchPolicy) {
    this.matchPolicy = matchPolicy;
  }

  public IoK8sApiAdmissionregistrationV1beta1ValidatingWebhook matchPolicy(String matchPolicy) {
    this.matchPolicy = matchPolicy;
    return this;
  }

 /**
   * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where \&quot;imagepolicy\&quot; is the name of the webhook, and kubernetes.io is the name of the organization. Required.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiAdmissionregistrationV1beta1ValidatingWebhook name(String name) {
    this.name = name;
    return this;
  }

 /**
   * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.  For example, to run the webhook on any objects whose namespace is not associated with \&quot;runlevel\&quot; of \&quot;0\&quot; or \&quot;1\&quot;;  you will set the selector as follows: \&quot;namespaceSelector\&quot;: {   \&quot;matchExpressions\&quot;: [     {       \&quot;key\&quot;: \&quot;runlevel\&quot;,       \&quot;operator\&quot;: \&quot;NotIn\&quot;,       \&quot;values\&quot;: [         \&quot;0\&quot;,         \&quot;1\&quot;       ]     }   ] }  If instead you want to only run the webhook on any objects whose namespace is associated with the \&quot;environment\&quot; of \&quot;prod\&quot; or \&quot;staging\&quot;; you will set the selector as follows: \&quot;namespaceSelector\&quot;: {   \&quot;matchExpressions\&quot;: [     {       \&quot;key\&quot;: \&quot;environment\&quot;,       \&quot;operator\&quot;: \&quot;In\&quot;,       \&quot;values\&quot;: [         \&quot;prod\&quot;,         \&quot;staging\&quot;       ]     }   ] }  See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels for more examples of label selectors.  Default to the empty LabelSelector, which matches everything.
   * @return namespaceSelector
  **/
  @JsonProperty("namespaceSelector")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getNamespaceSelector() {
    return namespaceSelector;
  }

  public void setNamespaceSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }

  public IoK8sApiAdmissionregistrationV1beta1ValidatingWebhook namespaceSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
    return this;
  }

 /**
   * ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
   * @return objectSelector
  **/
  @JsonProperty("objectSelector")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getObjectSelector() {
    return objectSelector;
  }

  public void setObjectSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector objectSelector) {
    this.objectSelector = objectSelector;
  }

  public IoK8sApiAdmissionregistrationV1beta1ValidatingWebhook objectSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector objectSelector) {
    this.objectSelector = objectSelector;
    return this;
  }

 /**
   * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
   * @return rules
  **/
  @JsonProperty("rules")
  public List<IoK8sApiAdmissionregistrationV1beta1RuleWithOperations> getRules() {
    return rules;
  }

  public void setRules(List<IoK8sApiAdmissionregistrationV1beta1RuleWithOperations> rules) {
    this.rules = rules;
  }

  public IoK8sApiAdmissionregistrationV1beta1ValidatingWebhook rules(List<IoK8sApiAdmissionregistrationV1beta1RuleWithOperations> rules) {
    this.rules = rules;
    return this;
  }

  public IoK8sApiAdmissionregistrationV1beta1ValidatingWebhook addRulesItem(IoK8sApiAdmissionregistrationV1beta1RuleWithOperations rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

 /**
   * SideEffects states whether this webhook has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects &#x3D;&#x3D; Unknown or Some. Defaults to Unknown.
   * @return sideEffects
  **/
  @JsonProperty("sideEffects")
  public String getSideEffects() {
    return sideEffects;
  }

  public void setSideEffects(String sideEffects) {
    this.sideEffects = sideEffects;
  }

  public IoK8sApiAdmissionregistrationV1beta1ValidatingWebhook sideEffects(String sideEffects) {
    this.sideEffects = sideEffects;
    return this;
  }

 /**
   * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
   * @return timeoutSeconds
  **/
  @JsonProperty("timeoutSeconds")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  public IoK8sApiAdmissionregistrationV1beta1ValidatingWebhook timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAdmissionregistrationV1beta1ValidatingWebhook {\n");
    
    sb.append("    admissionReviewVersions: ").append(toIndentedString(admissionReviewVersions)).append("\n");
    sb.append("    clientConfig: ").append(toIndentedString(clientConfig)).append("\n");
    sb.append("    failurePolicy: ").append(toIndentedString(failurePolicy)).append("\n");
    sb.append("    matchPolicy: ").append(toIndentedString(matchPolicy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    objectSelector: ").append(toIndentedString(objectSelector)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    sideEffects: ").append(toIndentedString(sideEffects)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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

