package fakekube.io.model;

import fakekube.io.model.IoK8sApiAutoscalingV2beta1ExternalMetricStatus;
import fakekube.io.model.IoK8sApiAutoscalingV2beta1ObjectMetricStatus;
import fakekube.io.model.IoK8sApiAutoscalingV2beta1PodsMetricStatus;
import fakekube.io.model.IoK8sApiAutoscalingV2beta1ResourceMetricStatus;
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
  * MetricStatus describes the last-read state of a single metric.
 **/
@ApiModel(description="MetricStatus describes the last-read state of a single metric.")
public class IoK8sApiAutoscalingV2beta1MetricStatus  {
  
  @ApiModelProperty(value = "external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).")
  @Valid
 /**
   * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
  **/
  private IoK8sApiAutoscalingV2beta1ExternalMetricStatus external = null;

  @ApiModelProperty(value = "object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).")
  @Valid
 /**
   * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
  **/
  private IoK8sApiAutoscalingV2beta1ObjectMetricStatus object = null;

  @ApiModelProperty(value = "pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.")
  @Valid
 /**
   * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
  **/
  private IoK8sApiAutoscalingV2beta1PodsMetricStatus pods = null;

  @ApiModelProperty(value = "resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \"pods\" source.")
  @Valid
 /**
   * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \"pods\" source.
  **/
  private IoK8sApiAutoscalingV2beta1ResourceMetricStatus resource = null;

  @ApiModelProperty(required = true, value = "type is the type of metric source.  It will be one of \"Object\", \"Pods\" or \"Resource\", each corresponds to a matching field in the object.")
 /**
   * type is the type of metric source.  It will be one of \"Object\", \"Pods\" or \"Resource\", each corresponds to a matching field in the object.
  **/
  private String type = null;
 /**
   * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
   * @return external
  **/
  @JsonProperty("external")
  public IoK8sApiAutoscalingV2beta1ExternalMetricStatus getExternal() {
    return external;
  }

  public void setExternal(IoK8sApiAutoscalingV2beta1ExternalMetricStatus external) {
    this.external = external;
  }

  public IoK8sApiAutoscalingV2beta1MetricStatus external(IoK8sApiAutoscalingV2beta1ExternalMetricStatus external) {
    this.external = external;
    return this;
  }

 /**
   * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
   * @return object
  **/
  @JsonProperty("object")
  public IoK8sApiAutoscalingV2beta1ObjectMetricStatus getObject() {
    return object;
  }

  public void setObject(IoK8sApiAutoscalingV2beta1ObjectMetricStatus object) {
    this.object = object;
  }

  public IoK8sApiAutoscalingV2beta1MetricStatus object(IoK8sApiAutoscalingV2beta1ObjectMetricStatus object) {
    this.object = object;
    return this;
  }

 /**
   * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
   * @return pods
  **/
  @JsonProperty("pods")
  public IoK8sApiAutoscalingV2beta1PodsMetricStatus getPods() {
    return pods;
  }

  public void setPods(IoK8sApiAutoscalingV2beta1PodsMetricStatus pods) {
    this.pods = pods;
  }

  public IoK8sApiAutoscalingV2beta1MetricStatus pods(IoK8sApiAutoscalingV2beta1PodsMetricStatus pods) {
    this.pods = pods;
    return this;
  }

 /**
   * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \&quot;pods\&quot; source.
   * @return resource
  **/
  @JsonProperty("resource")
  public IoK8sApiAutoscalingV2beta1ResourceMetricStatus getResource() {
    return resource;
  }

  public void setResource(IoK8sApiAutoscalingV2beta1ResourceMetricStatus resource) {
    this.resource = resource;
  }

  public IoK8sApiAutoscalingV2beta1MetricStatus resource(IoK8sApiAutoscalingV2beta1ResourceMetricStatus resource) {
    this.resource = resource;
    return this;
  }

 /**
   * type is the type of metric source.  It will be one of \&quot;Object\&quot;, \&quot;Pods\&quot; or \&quot;Resource\&quot;, each corresponds to a matching field in the object.
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiAutoscalingV2beta1MetricStatus type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta1MetricStatus {\n");
    
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    pods: ").append(toIndentedString(pods)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

