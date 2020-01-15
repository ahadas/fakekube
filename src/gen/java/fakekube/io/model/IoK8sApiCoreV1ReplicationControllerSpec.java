package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1PodTemplateSpec;
import io.swagger.annotations.ApiModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
  * ReplicationControllerSpec is the specification of a replication controller.
 **/
@ApiModel(description="ReplicationControllerSpec is the specification of a replication controller.")
public class IoK8sApiCoreV1ReplicationControllerSpec  {
  
  @ApiModelProperty(value = "Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)")
 /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
  **/
  private Integer minReadySeconds = null;

  @ApiModelProperty(value = "Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller")
 /**
   * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
  **/
  private Integer replicas = null;

  @ApiModelProperty(value = "Selector is a label query over pods that should match the Replicas count. If Selector is empty, it is defaulted to the labels present on the Pod template. Label keys and values that must match in order to be controlled by this replication controller, if empty defaulted to labels on Pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors")
 /**
   * Selector is a label query over pods that should match the Replicas count. If Selector is empty, it is defaulted to the labels present on the Pod template. Label keys and values that must match in order to be controlled by this replication controller, if empty defaulted to labels on Pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
  **/
  private Map<String, String> selector = null;

  @ApiModelProperty(value = "Template is the object that describes the pod that will be created if insufficient replicas are detected. This takes precedence over a TemplateRef. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template")
  @Valid
 /**
   * Template is the object that describes the pod that will be created if insufficient replicas are detected. This takes precedence over a TemplateRef. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
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

  public IoK8sApiCoreV1ReplicationControllerSpec minReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

 /**
   * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
   * @return replicas
  **/
  @JsonProperty("replicas")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public IoK8sApiCoreV1ReplicationControllerSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

 /**
   * Selector is a label query over pods that should match the Replicas count. If Selector is empty, it is defaulted to the labels present on the Pod template. Label keys and values that must match in order to be controlled by this replication controller, if empty defaulted to labels on Pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
   * @return selector
  **/
  @JsonProperty("selector")
  public Map<String, String> getSelector() {
    return selector;
  }

  public void setSelector(Map<String, String> selector) {
    this.selector = selector;
  }

  public IoK8sApiCoreV1ReplicationControllerSpec selector(Map<String, String> selector) {
    this.selector = selector;
    return this;
  }

  public IoK8sApiCoreV1ReplicationControllerSpec putSelectorItem(String key, String selectorItem) {
    this.selector.put(key, selectorItem);
    return this;
  }

 /**
   * Template is the object that describes the pod that will be created if insufficient replicas are detected. This takes precedence over a TemplateRef. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
   * @return template
  **/
  @JsonProperty("template")
  public IoK8sApiCoreV1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(IoK8sApiCoreV1PodTemplateSpec template) {
    this.template = template;
  }

  public IoK8sApiCoreV1ReplicationControllerSpec template(IoK8sApiCoreV1PodTemplateSpec template) {
    this.template = template;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ReplicationControllerSpec {\n");
    
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

