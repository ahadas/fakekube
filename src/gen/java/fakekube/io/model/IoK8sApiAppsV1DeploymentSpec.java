package fakekube.io.model;

import fakekube.io.model.IoK8sApiAppsV1DeploymentStrategy;
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
  * DeploymentSpec is the specification of the desired behavior of the Deployment.
 **/
@ApiModel(description="DeploymentSpec is the specification of the desired behavior of the Deployment.")
public class IoK8sApiAppsV1DeploymentSpec  {
  
  @ApiModelProperty(value = "Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)")
 /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
  **/
  private Integer minReadySeconds = null;

  @ApiModelProperty(value = "Indicates that the deployment is paused.")
 /**
   * Indicates that the deployment is paused.
  **/
  private Boolean paused = null;

  @ApiModelProperty(value = "The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.")
 /**
   * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
  **/
  private Integer progressDeadlineSeconds = null;

  @ApiModelProperty(value = "Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.")
 /**
   * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
  **/
  private Integer replicas = null;

  @ApiModelProperty(value = "The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.")
 /**
   * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
  **/
  private Integer revisionHistoryLimit = null;

  @ApiModelProperty(required = true, value = "Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template's labels.")
  @Valid
 /**
   * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template's labels.
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector selector = null;

  @ApiModelProperty(value = "The deployment strategy to use to replace existing pods with new ones.")
  @Valid
 /**
   * The deployment strategy to use to replace existing pods with new ones.
  **/
  private IoK8sApiAppsV1DeploymentStrategy strategy = null;

  @ApiModelProperty(required = true, value = "Template describes the pods that will be created.")
  @Valid
 /**
   * Template describes the pods that will be created.
  **/
  private IoK8sApiCoreV1PodTemplateSpec template = null;
 /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
   * @return minReadySeconds
  **/
  @JsonProperty("minReadySeconds")
  public Integer getMinReadySeconds() {
    return minReadySeconds;
  }

  public void setMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
  }

  public IoK8sApiAppsV1DeploymentSpec minReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

 /**
   * Indicates that the deployment is paused.
   * @return paused
  **/
  @JsonProperty("paused")
  public Boolean isPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public IoK8sApiAppsV1DeploymentSpec paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

 /**
   * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
   * @return progressDeadlineSeconds
  **/
  @JsonProperty("progressDeadlineSeconds")
  public Integer getProgressDeadlineSeconds() {
    return progressDeadlineSeconds;
  }

  public void setProgressDeadlineSeconds(Integer progressDeadlineSeconds) {
    this.progressDeadlineSeconds = progressDeadlineSeconds;
  }

  public IoK8sApiAppsV1DeploymentSpec progressDeadlineSeconds(Integer progressDeadlineSeconds) {
    this.progressDeadlineSeconds = progressDeadlineSeconds;
    return this;
  }

 /**
   * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
   * @return replicas
  **/
  @JsonProperty("replicas")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public IoK8sApiAppsV1DeploymentSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

 /**
   * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
   * @return revisionHistoryLimit
  **/
  @JsonProperty("revisionHistoryLimit")
  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }

  public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }

  public IoK8sApiAppsV1DeploymentSpec revisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

 /**
   * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template&#39;s labels.
   * @return selector
  **/
  @JsonProperty("selector")
  @NotNull
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
  }

  public IoK8sApiAppsV1DeploymentSpec selector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

 /**
   * The deployment strategy to use to replace existing pods with new ones.
   * @return strategy
  **/
  @JsonProperty("strategy")
  public IoK8sApiAppsV1DeploymentStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(IoK8sApiAppsV1DeploymentStrategy strategy) {
    this.strategy = strategy;
  }

  public IoK8sApiAppsV1DeploymentSpec strategy(IoK8sApiAppsV1DeploymentStrategy strategy) {
    this.strategy = strategy;
    return this;
  }

 /**
   * Template describes the pods that will be created.
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

  public IoK8sApiAppsV1DeploymentSpec template(IoK8sApiCoreV1PodTemplateSpec template) {
    this.template = template;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAppsV1DeploymentSpec {\n");
    
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    progressDeadlineSeconds: ").append(toIndentedString(progressDeadlineSeconds)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

