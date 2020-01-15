package fakekube.io.model;

import fakekube.io.model.IoK8sApiAppsV1DaemonSetUpdateStrategy;
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
  * DaemonSetSpec is the specification of a daemon set.
 **/
@ApiModel(description="DaemonSetSpec is the specification of a daemon set.")
public class IoK8sApiAppsV1DaemonSetSpec  {
  
  @ApiModelProperty(value = "The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).")
 /**
   * The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).
  **/
  private Integer minReadySeconds = null;

  @ApiModelProperty(value = "The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.")
 /**
   * The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
  **/
  private Integer revisionHistoryLimit = null;

  @ApiModelProperty(required = true, value = "A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors")
  @Valid
 /**
   * A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector selector = null;

  @ApiModelProperty(required = true, value = "An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every node that matches the template's node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template")
  @Valid
 /**
   * An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every node that matches the template's node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
  **/
  private IoK8sApiCoreV1PodTemplateSpec template = null;

  @ApiModelProperty(value = "An update strategy to replace existing DaemonSet pods with new pods.")
  @Valid
 /**
   * An update strategy to replace existing DaemonSet pods with new pods.
  **/
  private IoK8sApiAppsV1DaemonSetUpdateStrategy updateStrategy = null;
 /**
   * The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).
   * @return minReadySeconds
  **/
  @JsonProperty("minReadySeconds")
  public Integer getMinReadySeconds() {
    return minReadySeconds;
  }

  public void setMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
  }

  public IoK8sApiAppsV1DaemonSetSpec minReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

 /**
   * The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
   * @return revisionHistoryLimit
  **/
  @JsonProperty("revisionHistoryLimit")
  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }

  public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }

  public IoK8sApiAppsV1DaemonSetSpec revisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

 /**
   * A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod template&#39;s labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
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

  public IoK8sApiAppsV1DaemonSetSpec selector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

 /**
   * An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every node that matches the template&#39;s node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
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

  public IoK8sApiAppsV1DaemonSetSpec template(IoK8sApiCoreV1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

 /**
   * An update strategy to replace existing DaemonSet pods with new pods.
   * @return updateStrategy
  **/
  @JsonProperty("updateStrategy")
  public IoK8sApiAppsV1DaemonSetUpdateStrategy getUpdateStrategy() {
    return updateStrategy;
  }

  public void setUpdateStrategy(IoK8sApiAppsV1DaemonSetUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
  }

  public IoK8sApiAppsV1DaemonSetSpec updateStrategy(IoK8sApiAppsV1DaemonSetUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAppsV1DaemonSetSpec {\n");
    
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    updateStrategy: ").append(toIndentedString(updateStrategy)).append("\n");
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

