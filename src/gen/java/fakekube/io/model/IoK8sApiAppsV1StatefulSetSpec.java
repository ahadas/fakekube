package fakekube.io.model;

import fakekube.io.model.IoK8sApiAppsV1StatefulSetUpdateStrategy;
import fakekube.io.model.IoK8sApiCoreV1PersistentVolumeClaim;
import fakekube.io.model.IoK8sApiCoreV1PodTemplateSpec;
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
  * A StatefulSetSpec is the specification of a StatefulSet.
 **/
@ApiModel(description="A StatefulSetSpec is the specification of a StatefulSet.")
public class IoK8sApiAppsV1StatefulSetSpec  {
  
  @ApiModelProperty(value = "podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.")
 /**
   * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
  **/
  private String podManagementPolicy = null;

  @ApiModelProperty(value = "replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.")
 /**
   * replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
  **/
  private Integer replicas = null;

  @ApiModelProperty(value = "revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.")
 /**
   * revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
  **/
  private Integer revisionHistoryLimit = null;

  @ApiModelProperty(required = true, value = "selector is a label query over pods that should match the replica count. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors")
  @Valid
 /**
   * selector is a label query over pods that should match the replica count. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector selector = null;

  @ApiModelProperty(required = true, value = "serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where \"pod-specific-string\" is managed by the StatefulSet controller.")
 /**
   * serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where \"pod-specific-string\" is managed by the StatefulSet controller.
  **/
  private String serviceName = null;

  @ApiModelProperty(required = true, value = "template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.")
  @Valid
 /**
   * template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
  **/
  private IoK8sApiCoreV1PodTemplateSpec template = null;

  @ApiModelProperty(value = "updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.")
  @Valid
 /**
   * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
  **/
  private IoK8sApiAppsV1StatefulSetUpdateStrategy updateStrategy = null;

  @ApiModelProperty(value = "volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.")
  @Valid
 /**
   * volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
  **/
  private List<IoK8sApiCoreV1PersistentVolumeClaim> volumeClaimTemplates = null;
 /**
   * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is &#x60;OrderedReady&#x60;, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is &#x60;Parallel&#x60; which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
   * @return podManagementPolicy
  **/
  @JsonProperty("podManagementPolicy")
  public String getPodManagementPolicy() {
    return podManagementPolicy;
  }

  public void setPodManagementPolicy(String podManagementPolicy) {
    this.podManagementPolicy = podManagementPolicy;
  }

  public IoK8sApiAppsV1StatefulSetSpec podManagementPolicy(String podManagementPolicy) {
    this.podManagementPolicy = podManagementPolicy;
    return this;
  }

 /**
   * replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
   * @return replicas
  **/
  @JsonProperty("replicas")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public IoK8sApiAppsV1StatefulSetSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

 /**
   * revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet&#39;s revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
   * @return revisionHistoryLimit
  **/
  @JsonProperty("revisionHistoryLimit")
  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }

  public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }

  public IoK8sApiAppsV1StatefulSetSpec revisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

 /**
   * selector is a label query over pods that should match the replica count. It must match the pod template&#39;s labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
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

  public IoK8sApiAppsV1StatefulSetSpec selector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

 /**
   * serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where \&quot;pod-specific-string\&quot; is managed by the StatefulSet controller.
   * @return serviceName
  **/
  @JsonProperty("serviceName")
  @NotNull
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public IoK8sApiAppsV1StatefulSetSpec serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

 /**
   * template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
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

  public IoK8sApiAppsV1StatefulSetSpec template(IoK8sApiCoreV1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

 /**
   * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
   * @return updateStrategy
  **/
  @JsonProperty("updateStrategy")
  public IoK8sApiAppsV1StatefulSetUpdateStrategy getUpdateStrategy() {
    return updateStrategy;
  }

  public void setUpdateStrategy(IoK8sApiAppsV1StatefulSetUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
  }

  public IoK8sApiAppsV1StatefulSetSpec updateStrategy(IoK8sApiAppsV1StatefulSetUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
    return this;
  }

 /**
   * volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
   * @return volumeClaimTemplates
  **/
  @JsonProperty("volumeClaimTemplates")
  public List<IoK8sApiCoreV1PersistentVolumeClaim> getVolumeClaimTemplates() {
    return volumeClaimTemplates;
  }

  public void setVolumeClaimTemplates(List<IoK8sApiCoreV1PersistentVolumeClaim> volumeClaimTemplates) {
    this.volumeClaimTemplates = volumeClaimTemplates;
  }

  public IoK8sApiAppsV1StatefulSetSpec volumeClaimTemplates(List<IoK8sApiCoreV1PersistentVolumeClaim> volumeClaimTemplates) {
    this.volumeClaimTemplates = volumeClaimTemplates;
    return this;
  }

  public IoK8sApiAppsV1StatefulSetSpec addVolumeClaimTemplatesItem(IoK8sApiCoreV1PersistentVolumeClaim volumeClaimTemplatesItem) {
    this.volumeClaimTemplates.add(volumeClaimTemplatesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAppsV1StatefulSetSpec {\n");
    
    sb.append("    podManagementPolicy: ").append(toIndentedString(podManagementPolicy)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    updateStrategy: ").append(toIndentedString(updateStrategy)).append("\n");
    sb.append("    volumeClaimTemplates: ").append(toIndentedString(volumeClaimTemplates)).append("\n");
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

