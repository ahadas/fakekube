package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1PodTemplateSpec;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1LabelSelector;
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
  * JobSpec describes how the job execution will look like.
 **/
@ApiModel(description="JobSpec describes how the job execution will look like.")
public class IoK8sApiBatchV1JobSpec  {
  
  @ApiModelProperty(value = "Specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it; value must be positive integer")
 /**
   * Specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it; value must be positive integer
  **/
  private Long activeDeadlineSeconds = null;

  @ApiModelProperty(value = "Specifies the number of retries before marking this job failed. Defaults to 6")
 /**
   * Specifies the number of retries before marking this job failed. Defaults to 6
  **/
  private Integer backoffLimit = null;

  @ApiModelProperty(value = "Specifies the desired number of successfully finished pods the job should be run with.  Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/")
 /**
   * Specifies the desired number of successfully finished pods the job should be run with.  Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
  **/
  private Integer completions = null;

  @ApiModelProperty(value = "manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see `manualSelector=true` in jobs that were created with the old `extensions/v1beta1` API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector")
 /**
   * manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see `manualSelector=true` in jobs that were created with the old `extensions/v1beta1` API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
  **/
  private Boolean manualSelector = null;

  @ApiModelProperty(value = "Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/")
 /**
   * Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
  **/
  private Integer parallelism = null;

  @ApiModelProperty(value = "A label query over pods that should match the pod count. Normally, the system sets this field for you. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors")
  @Valid
 /**
   * A label query over pods that should match the pod count. Normally, the system sets this field for you. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector selector = null;

  @ApiModelProperty(required = true, value = "Describes the pod that will be created when executing a job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/")
  @Valid
 /**
   * Describes the pod that will be created when executing a job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
  **/
  private IoK8sApiCoreV1PodTemplateSpec template = null;

  @ApiModelProperty(value = "ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes. This field is alpha-level and is only honored by servers that enable the TTLAfterFinished feature.")
 /**
   * ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes. This field is alpha-level and is only honored by servers that enable the TTLAfterFinished feature.
  **/
  private Integer ttlSecondsAfterFinished = null;
 /**
   * Specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it; value must be positive integer
   * @return activeDeadlineSeconds
  **/
  @JsonProperty("activeDeadlineSeconds")
  public Long getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }

  public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }

  public IoK8sApiBatchV1JobSpec activeDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

 /**
   * Specifies the number of retries before marking this job failed. Defaults to 6
   * @return backoffLimit
  **/
  @JsonProperty("backoffLimit")
  public Integer getBackoffLimit() {
    return backoffLimit;
  }

  public void setBackoffLimit(Integer backoffLimit) {
    this.backoffLimit = backoffLimit;
  }

  public IoK8sApiBatchV1JobSpec backoffLimit(Integer backoffLimit) {
    this.backoffLimit = backoffLimit;
    return this;
  }

 /**
   * Specifies the desired number of successfully finished pods the job should be run with.  Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   * @return completions
  **/
  @JsonProperty("completions")
  public Integer getCompletions() {
    return completions;
  }

  public void setCompletions(Integer completions) {
    this.completions = completions;
  }

  public IoK8sApiBatchV1JobSpec completions(Integer completions) {
    this.completions = completions;
    return this;
  }

 /**
   * manualSelector controls generation of pod labels and pod selectors. Leave &#x60;manualSelector&#x60; unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see &#x60;manualSelector&#x3D;true&#x60; in jobs that were created with the old &#x60;extensions/v1beta1&#x60; API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
   * @return manualSelector
  **/
  @JsonProperty("manualSelector")
  public Boolean isManualSelector() {
    return manualSelector;
  }

  public void setManualSelector(Boolean manualSelector) {
    this.manualSelector = manualSelector;
  }

  public IoK8sApiBatchV1JobSpec manualSelector(Boolean manualSelector) {
    this.manualSelector = manualSelector;
    return this;
  }

 /**
   * Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) &lt; .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   * @return parallelism
  **/
  @JsonProperty("parallelism")
  public Integer getParallelism() {
    return parallelism;
  }

  public void setParallelism(Integer parallelism) {
    this.parallelism = parallelism;
  }

  public IoK8sApiBatchV1JobSpec parallelism(Integer parallelism) {
    this.parallelism = parallelism;
    return this;
  }

 /**
   * A label query over pods that should match the pod count. Normally, the system sets this field for you. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
   * @return selector
  **/
  @JsonProperty("selector")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
  }

  public IoK8sApiBatchV1JobSpec selector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

 /**
   * Describes the pod that will be created when executing a job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   * @return template
  **/
  @JsonProperty("template")
  @NotNull
  public IoK8sApiCoreV1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(IoK8sApiCoreV1PodTemplateSpec template) {
    this.template = template;
  }

  public IoK8sApiBatchV1JobSpec template(IoK8sApiCoreV1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

 /**
   * ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won&#39;t be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes. This field is alpha-level and is only honored by servers that enable the TTLAfterFinished feature.
   * @return ttlSecondsAfterFinished
  **/
  @JsonProperty("ttlSecondsAfterFinished")
  public Integer getTtlSecondsAfterFinished() {
    return ttlSecondsAfterFinished;
  }

  public void setTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
  }

  public IoK8sApiBatchV1JobSpec ttlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiBatchV1JobSpec {\n");
    
    sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
    sb.append("    backoffLimit: ").append(toIndentedString(backoffLimit)).append("\n");
    sb.append("    completions: ").append(toIndentedString(completions)).append("\n");
    sb.append("    manualSelector: ").append(toIndentedString(manualSelector)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    ttlSecondsAfterFinished: ").append(toIndentedString(ttlSecondsAfterFinished)).append("\n");
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

