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
  * ReplicaSetSpec is the specification of a ReplicaSet.
 **/
@ApiModel(description="ReplicaSetSpec is the specification of a ReplicaSet.")
public class IoK8sApiAppsV1ReplicaSetSpec  {
  
  @ApiModelProperty(value = "Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)")
 /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
  **/
  private Integer minReadySeconds = null;

  @ApiModelProperty(value = "Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller")
 /**
   * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
  **/
  private Integer replicas = null;

  @ApiModelProperty(required = true, value = "Selector is a label query over pods that should match the replica count. Label keys and values that must match in order to be controlled by this replica set. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors")
  @Valid
 /**
   * Selector is a label query over pods that should match the replica count. Label keys and values that must match in order to be controlled by this replica set. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector selector = null;

  @ApiModelProperty(value = "Template is the object that describes the pod that will be created if insufficient replicas are detected. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template")
  @Valid
 /**
   * Template is the object that describes the pod that will be created if insufficient replicas are detected. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
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

  public IoK8sApiAppsV1ReplicaSetSpec minReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

 /**
   * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
   * @return replicas
  **/
  @JsonProperty("replicas")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public IoK8sApiAppsV1ReplicaSetSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

 /**
   * Selector is a label query over pods that should match the replica count. Label keys and values that must match in order to be controlled by this replica set. It must match the pod template&#39;s labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
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

  public IoK8sApiAppsV1ReplicaSetSpec selector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

 /**
   * Template is the object that describes the pod that will be created if insufficient replicas are detected. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
   * @return template
  **/
  @JsonProperty("template")
  public IoK8sApiCoreV1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(IoK8sApiCoreV1PodTemplateSpec template) {
    this.template = template;
  }

  public IoK8sApiAppsV1ReplicaSetSpec template(IoK8sApiCoreV1PodTemplateSpec template) {
    this.template = template;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAppsV1ReplicaSetSpec {\n");
    
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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

