package fakekube.io.model;

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
  * ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config source for the Node.
 **/
@ApiModel(description="ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config source for the Node.")
public class IoK8sApiCoreV1ConfigMapNodeConfigSource  {
  
  @ApiModelProperty(required = true, value = "KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This field is required in all cases.")
 /**
   * KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This field is required in all cases.
  **/
  private String kubeletConfigKey = null;

  @ApiModelProperty(required = true, value = "Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.")
 /**
   * Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.
  **/
  private String name = null;

  @ApiModelProperty(required = true, value = "Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases.")
 /**
   * Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases.
  **/
  private String namespace = null;

  @ApiModelProperty(value = "ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.")
 /**
   * ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
  **/
  private String resourceVersion = null;

  @ApiModelProperty(value = "UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.")
 /**
   * UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
  **/
  private String uid = null;
 /**
   * KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This field is required in all cases.
   * @return kubeletConfigKey
  **/
  @JsonProperty("kubeletConfigKey")
  @NotNull
  public String getKubeletConfigKey() {
    return kubeletConfigKey;
  }

  public void setKubeletConfigKey(String kubeletConfigKey) {
    this.kubeletConfigKey = kubeletConfigKey;
  }

  public IoK8sApiCoreV1ConfigMapNodeConfigSource kubeletConfigKey(String kubeletConfigKey) {
    this.kubeletConfigKey = kubeletConfigKey;
    return this;
  }

 /**
   * Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.
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

  public IoK8sApiCoreV1ConfigMapNodeConfigSource name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases.
   * @return namespace
  **/
  @JsonProperty("namespace")
  @NotNull
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public IoK8sApiCoreV1ConfigMapNodeConfigSource namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

 /**
   * ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
   * @return resourceVersion
  **/
  @JsonProperty("resourceVersion")
  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public IoK8sApiCoreV1ConfigMapNodeConfigSource resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

 /**
   * UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
   * @return uid
  **/
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public IoK8sApiCoreV1ConfigMapNodeConfigSource uid(String uid) {
    this.uid = uid;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ConfigMapNodeConfigSource {\n");
    
    sb.append("    kubeletConfigKey: ").append(toIndentedString(kubeletConfigKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

