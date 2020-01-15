package fakekube.io.model;

import fakekube.io.model.IoK8sApiAdmissionregistrationV1RuleWithOperations;
import fakekube.io.model.IoK8sApiAdmissionregistrationV1WebhookClientConfig;
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
  * MutatingWebhook describes an admission webhook and the resources and operations it applies to.
 **/
@ApiModel(description="MutatingWebhook describes an admission webhook and the resources and operations it applies to.")
public class IoK8sApiAdmissionregistrationV1MutatingWebhook  {
  
  @ApiModelProperty(required = true, value = "AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy.")
 /**
   * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy.
  **/
  private List<String> admissionReviewVersions = new ArrayList<String>();

  @ApiModelProperty(required = true, value = "ClientConfig defines how to communicate with the hook. Required")
  @Valid
 /**
   * ClientConfig defines how to communicate with the hook. Required
  **/
  private IoK8sApiAdmissionregistrationV1WebhookClientConfig clientConfig = null;

  @ApiModelProperty(value = "FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Fail.")
 /**
   * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Fail.
  **/
  private String failurePolicy = null;

  @ApiModelProperty(value = "matchPolicy defines how the \"rules\" list is used to match incoming requests. Allowed values are \"Exact\" or \"Equivalent\".  - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but \"rules\" only included `apiGroups:[\"apps\"], apiVersions:[\"v1\"], resources: [\"deployments\"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.  - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and \"rules\" only included `apiGroups:[\"apps\"], apiVersions:[\"v1\"], resources: [\"deployments\"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.  Defaults to \"Equivalent\"")
 /**
   * matchPolicy defines how the \"rules\" list is used to match incoming requests. Allowed values are \"Exact\" or \"Equivalent\".  - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but \"rules\" only included `apiGroups:[\"apps\"], apiVersions:[\"v1\"], resources: [\"deployments\"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.  - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and \"rules\" only included `apiGroups:[\"apps\"], apiVersions:[\"v1\"], resources: [\"deployments\"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.  Defaults to \"Equivalent\"
  **/
  private String matchPolicy = null;

  @ApiModelProperty(required = true, value = "The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where \"imagepolicy\" is the name of the webhook, and kubernetes.io is the name of the organization. Required.")
 /**
   * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where \"imagepolicy\" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
  **/
  private String name = null;

  @ApiModelProperty(value = "NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.  For example, to run the webhook on any objects whose namespace is not associated with \"runlevel\" of \"0\" or \"1\";  you will set the selector as follows: \"namespaceSelector\": {   \"matchExpressions\": [     {       \"key\": \"runlevel\",       \"operator\": \"NotIn\",       \"values\": [         \"0\",         \"1\"       ]     }   ] }  If instead you want to only run the webhook on any objects whose namespace is associated with the \"environment\" of \"prod\" or \"staging\"; you will set the selector as follows: \"namespaceSelector\": {   \"matchExpressions\": [     {       \"key\": \"environment\",       \"operator\": \"In\",       \"values\": [         \"prod\",         \"staging\"       ]     }   ] }  See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more examples of label selectors.  Default to the empty LabelSelector, which matches everything.")
  @Valid
 /**
   * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.  For example, to run the webhook on any objects whose namespace is not associated with \"runlevel\" of \"0\" or \"1\";  you will set the selector as follows: \"namespaceSelector\": {   \"matchExpressions\": [     {       \"key\": \"runlevel\",       \"operator\": \"NotIn\",       \"values\": [         \"0\",         \"1\"       ]     }   ] }  If instead you want to only run the webhook on any objects whose namespace is associated with the \"environment\" of \"prod\" or \"staging\"; you will set the selector as follows: \"namespaceSelector\": {   \"matchExpressions\": [     {       \"key\": \"environment\",       \"operator\": \"In\",       \"values\": [         \"prod\",         \"staging\"       ]     }   ] }  See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more examples of label selectors.  Default to the empty LabelSelector, which matches everything.
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector namespaceSelector = null;

  @ApiModelProperty(value = "ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.")
  @Valid
 /**
   * ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector objectSelector = null;

  @ApiModelProperty(value = "reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission evaluation. Allowed values are \"Never\" and \"IfNeeded\".  Never: the webhook will not be called more than once in a single admission evaluation.  IfNeeded: the webhook will be called at least one additional time as part of the admission evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks that specify this option *must* be idempotent, able to process objects they previously admitted. Note: * the number of additional invocations is not guaranteed to be exactly one. * if additional invocations result in further modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks that use this option may be reordered to minimize the number of additional invocations. * to validate an object after all mutations are guaranteed complete, use a validating admission webhook instead.  Defaults to \"Never\".")
 /**
   * reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission evaluation. Allowed values are \"Never\" and \"IfNeeded\".  Never: the webhook will not be called more than once in a single admission evaluation.  IfNeeded: the webhook will be called at least one additional time as part of the admission evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks that specify this option *must* be idempotent, able to process objects they previously admitted. Note: * the number of additional invocations is not guaranteed to be exactly one. * if additional invocations result in further modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks that use this option may be reordered to minimize the number of additional invocations. * to validate an object after all mutations are guaranteed complete, use a validating admission webhook instead.  Defaults to \"Never\".
  **/
  private String reinvocationPolicy = null;

  @ApiModelProperty(value = "Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.")
  @Valid
 /**
   * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
  **/
  private List<IoK8sApiAdmissionregistrationV1RuleWithOperations> rules = null;

  @ApiModelProperty(required = true, value = "SideEffects states whether this webhook has side effects. Acceptable values are: None, NoneOnDryRun (webhooks created via v1beta1 may also specify Some or Unknown). Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some.")
 /**
   * SideEffects states whether this webhook has side effects. Acceptable values are: None, NoneOnDryRun (webhooks created via v1beta1 may also specify Some or Unknown). Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some.
  **/
  private String sideEffects = null;

  @ApiModelProperty(value = "TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 10 seconds.")
 /**
   * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 10 seconds.
  **/
  private Integer timeoutSeconds = null;
 /**
   * AdmissionReviewVersions is an ordered list of preferred &#x60;AdmissionReview&#x60; versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy.
   * @return admissionReviewVersions
  **/
  @JsonProperty("admissionReviewVersions")
  @NotNull
  public List<String> getAdmissionReviewVersions() {
    return admissionReviewVersions;
  }

  public void setAdmissionReviewVersions(List<String> admissionReviewVersions) {
    this.admissionReviewVersions = admissionReviewVersions;
  }

  public IoK8sApiAdmissionregistrationV1MutatingWebhook admissionReviewVersions(List<String> admissionReviewVersions) {
    this.admissionReviewVersions = admissionReviewVersions;
    return this;
  }

  public IoK8sApiAdmissionregistrationV1MutatingWebhook addAdmissionReviewVersionsItem(String admissionReviewVersionsItem) {
    this.admissionReviewVersions.add(admissionReviewVersionsItem);
    return this;
  }

 /**
   * ClientConfig defines how to communicate with the hook. Required
   * @return clientConfig
  **/
  @JsonProperty("clientConfig")
  @NotNull
  public IoK8sApiAdmissionregistrationV1WebhookClientConfig getClientConfig() {
    return clientConfig;
  }

  public void setClientConfig(IoK8sApiAdmissionregistrationV1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
  }

  public IoK8sApiAdmissionregistrationV1MutatingWebhook clientConfig(IoK8sApiAdmissionregistrationV1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
    return this;
  }

 /**
   * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Fail.
   * @return failurePolicy
  **/
  @JsonProperty("failurePolicy")
  public String getFailurePolicy() {
    return failurePolicy;
  }

  public void setFailurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
  }

  public IoK8sApiAdmissionregistrationV1MutatingWebhook failurePolicy(String failurePolicy) {
    this.failurePolicy = failurePolicy;
    return this;
  }

 /**
   * matchPolicy defines how the \&quot;rules\&quot; list is used to match incoming requests. Allowed values are \&quot;Exact\&quot; or \&quot;Equivalent\&quot;.  - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but \&quot;rules\&quot; only included &#x60;apiGroups:[\&quot;apps\&quot;], apiVersions:[\&quot;v1\&quot;], resources: [\&quot;deployments\&quot;]&#x60;, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.  - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and \&quot;rules\&quot; only included &#x60;apiGroups:[\&quot;apps\&quot;], apiVersions:[\&quot;v1\&quot;], resources: [\&quot;deployments\&quot;]&#x60;, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.  Defaults to \&quot;Equivalent\&quot;
   * @return matchPolicy
  **/
  @JsonProperty("matchPolicy")
  public String getMatchPolicy() {
    return matchPolicy;
  }

  public void setMatchPolicy(String matchPolicy) {
    this.matchPolicy = matchPolicy;
  }

  public IoK8sApiAdmissionregistrationV1MutatingWebhook matchPolicy(String matchPolicy) {
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

  public IoK8sApiAdmissionregistrationV1MutatingWebhook name(String name) {
    this.name = name;
    return this;
  }

 /**
   * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.  For example, to run the webhook on any objects whose namespace is not associated with \&quot;runlevel\&quot; of \&quot;0\&quot; or \&quot;1\&quot;;  you will set the selector as follows: \&quot;namespaceSelector\&quot;: {   \&quot;matchExpressions\&quot;: [     {       \&quot;key\&quot;: \&quot;runlevel\&quot;,       \&quot;operator\&quot;: \&quot;NotIn\&quot;,       \&quot;values\&quot;: [         \&quot;0\&quot;,         \&quot;1\&quot;       ]     }   ] }  If instead you want to only run the webhook on any objects whose namespace is associated with the \&quot;environment\&quot; of \&quot;prod\&quot; or \&quot;staging\&quot;; you will set the selector as follows: \&quot;namespaceSelector\&quot;: {   \&quot;matchExpressions\&quot;: [     {       \&quot;key\&quot;: \&quot;environment\&quot;,       \&quot;operator\&quot;: \&quot;In\&quot;,       \&quot;values\&quot;: [         \&quot;prod\&quot;,         \&quot;staging\&quot;       ]     }   ] }  See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more examples of label selectors.  Default to the empty LabelSelector, which matches everything.
   * @return namespaceSelector
  **/
  @JsonProperty("namespaceSelector")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getNamespaceSelector() {
    return namespaceSelector;
  }

  public void setNamespaceSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }

  public IoK8sApiAdmissionregistrationV1MutatingWebhook namespaceSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector namespaceSelector) {
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

  public IoK8sApiAdmissionregistrationV1MutatingWebhook objectSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector objectSelector) {
    this.objectSelector = objectSelector;
    return this;
  }

 /**
   * reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission evaluation. Allowed values are \&quot;Never\&quot; and \&quot;IfNeeded\&quot;.  Never: the webhook will not be called more than once in a single admission evaluation.  IfNeeded: the webhook will be called at least one additional time as part of the admission evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks that specify this option *must* be idempotent, able to process objects they previously admitted. Note: * the number of additional invocations is not guaranteed to be exactly one. * if additional invocations result in further modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks that use this option may be reordered to minimize the number of additional invocations. * to validate an object after all mutations are guaranteed complete, use a validating admission webhook instead.  Defaults to \&quot;Never\&quot;.
   * @return reinvocationPolicy
  **/
  @JsonProperty("reinvocationPolicy")
  public String getReinvocationPolicy() {
    return reinvocationPolicy;
  }

  public void setReinvocationPolicy(String reinvocationPolicy) {
    this.reinvocationPolicy = reinvocationPolicy;
  }

  public IoK8sApiAdmissionregistrationV1MutatingWebhook reinvocationPolicy(String reinvocationPolicy) {
    this.reinvocationPolicy = reinvocationPolicy;
    return this;
  }

 /**
   * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
   * @return rules
  **/
  @JsonProperty("rules")
  public List<IoK8sApiAdmissionregistrationV1RuleWithOperations> getRules() {
    return rules;
  }

  public void setRules(List<IoK8sApiAdmissionregistrationV1RuleWithOperations> rules) {
    this.rules = rules;
  }

  public IoK8sApiAdmissionregistrationV1MutatingWebhook rules(List<IoK8sApiAdmissionregistrationV1RuleWithOperations> rules) {
    this.rules = rules;
    return this;
  }

  public IoK8sApiAdmissionregistrationV1MutatingWebhook addRulesItem(IoK8sApiAdmissionregistrationV1RuleWithOperations rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

 /**
   * SideEffects states whether this webhook has side effects. Acceptable values are: None, NoneOnDryRun (webhooks created via v1beta1 may also specify Some or Unknown). Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects &#x3D;&#x3D; Unknown or Some.
   * @return sideEffects
  **/
  @JsonProperty("sideEffects")
  @NotNull
  public String getSideEffects() {
    return sideEffects;
  }

  public void setSideEffects(String sideEffects) {
    this.sideEffects = sideEffects;
  }

  public IoK8sApiAdmissionregistrationV1MutatingWebhook sideEffects(String sideEffects) {
    this.sideEffects = sideEffects;
    return this;
  }

 /**
   * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 10 seconds.
   * @return timeoutSeconds
  **/
  @JsonProperty("timeoutSeconds")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  public IoK8sApiAdmissionregistrationV1MutatingWebhook timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAdmissionregistrationV1MutatingWebhook {\n");
    
    sb.append("    admissionReviewVersions: ").append(toIndentedString(admissionReviewVersions)).append("\n");
    sb.append("    clientConfig: ").append(toIndentedString(clientConfig)).append("\n");
    sb.append("    failurePolicy: ").append(toIndentedString(failurePolicy)).append("\n");
    sb.append("    matchPolicy: ").append(toIndentedString(matchPolicy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    objectSelector: ").append(toIndentedString(objectSelector)).append("\n");
    sb.append("    reinvocationPolicy: ").append(toIndentedString(reinvocationPolicy)).append("\n");
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

