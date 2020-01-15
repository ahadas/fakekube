package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ConfigMapKeySelector;
import fakekube.io.model.IoK8sApiCoreV1ObjectFieldSelector;
import fakekube.io.model.IoK8sApiCoreV1ResourceFieldSelector;
import fakekube.io.model.IoK8sApiCoreV1SecretKeySelector;
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
  * EnvVarSource represents a source for the value of an EnvVar.
 **/
@ApiModel(description="EnvVarSource represents a source for the value of an EnvVar.")
public class IoK8sApiCoreV1EnvVarSource  {
  
  @ApiModelProperty(value = "Selects a key of a ConfigMap.")
  @Valid
 /**
   * Selects a key of a ConfigMap.
  **/
  private IoK8sApiCoreV1ConfigMapKeySelector configMapKeyRef = null;

  @ApiModelProperty(value = "Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.")
  @Valid
 /**
   * Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
  **/
  private IoK8sApiCoreV1ObjectFieldSelector fieldRef = null;

  @ApiModelProperty(value = "Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.")
  @Valid
 /**
   * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
  **/
  private IoK8sApiCoreV1ResourceFieldSelector resourceFieldRef = null;

  @ApiModelProperty(value = "Selects a key of a secret in the pod's namespace")
  @Valid
 /**
   * Selects a key of a secret in the pod's namespace
  **/
  private IoK8sApiCoreV1SecretKeySelector secretKeyRef = null;
 /**
   * Selects a key of a ConfigMap.
   * @return configMapKeyRef
  **/
  @JsonProperty("configMapKeyRef")
  public IoK8sApiCoreV1ConfigMapKeySelector getConfigMapKeyRef() {
    return configMapKeyRef;
  }

  public void setConfigMapKeyRef(IoK8sApiCoreV1ConfigMapKeySelector configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
  }

  public IoK8sApiCoreV1EnvVarSource configMapKeyRef(IoK8sApiCoreV1ConfigMapKeySelector configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
    return this;
  }

 /**
   * Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
   * @return fieldRef
  **/
  @JsonProperty("fieldRef")
  public IoK8sApiCoreV1ObjectFieldSelector getFieldRef() {
    return fieldRef;
  }

  public void setFieldRef(IoK8sApiCoreV1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
  }

  public IoK8sApiCoreV1EnvVarSource fieldRef(IoK8sApiCoreV1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
    return this;
  }

 /**
   * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
   * @return resourceFieldRef
  **/
  @JsonProperty("resourceFieldRef")
  public IoK8sApiCoreV1ResourceFieldSelector getResourceFieldRef() {
    return resourceFieldRef;
  }

  public void setResourceFieldRef(IoK8sApiCoreV1ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }

  public IoK8sApiCoreV1EnvVarSource resourceFieldRef(IoK8sApiCoreV1ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

 /**
   * Selects a key of a secret in the pod&#39;s namespace
   * @return secretKeyRef
  **/
  @JsonProperty("secretKeyRef")
  public IoK8sApiCoreV1SecretKeySelector getSecretKeyRef() {
    return secretKeyRef;
  }

  public void setSecretKeyRef(IoK8sApiCoreV1SecretKeySelector secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
  }

  public IoK8sApiCoreV1EnvVarSource secretKeyRef(IoK8sApiCoreV1SecretKeySelector secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1EnvVarSource {\n");
    
    sb.append("    configMapKeyRef: ").append(toIndentedString(configMapKeyRef)).append("\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
    sb.append("    secretKeyRef: ").append(toIndentedString(secretKeyRef)).append("\n");
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

