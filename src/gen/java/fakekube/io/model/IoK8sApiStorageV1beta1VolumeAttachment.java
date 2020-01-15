package fakekube.io.model;

import fakekube.io.model.IoK8sApiStorageV1beta1VolumeAttachmentSpec;
import fakekube.io.model.IoK8sApiStorageV1beta1VolumeAttachmentStatus;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1ObjectMeta;
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
  * VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.  VolumeAttachment objects are non-namespaced.
 **/
@ApiModel(description="VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.  VolumeAttachment objects are non-namespaced.")
public class IoK8sApiStorageV1beta1VolumeAttachment  {
  
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
 /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
  **/
  private String apiVersion = null;

  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
 /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
  **/
  private String kind = null;

  @ApiModelProperty(value = "Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata")
  @Valid
 /**
   * Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
  **/
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  @ApiModelProperty(required = true, value = "Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.")
  @Valid
 /**
   * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
  **/
  private IoK8sApiStorageV1beta1VolumeAttachmentSpec spec = null;

  @ApiModelProperty(value = "Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.")
  @Valid
 /**
   * Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.
  **/
  private IoK8sApiStorageV1beta1VolumeAttachmentStatus status = null;
 /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public IoK8sApiStorageV1beta1VolumeAttachment apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

 /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoK8sApiStorageV1beta1VolumeAttachment kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
   * @return metadata
  **/
  @JsonProperty("metadata")
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public IoK8sApiStorageV1beta1VolumeAttachment metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
   * @return spec
  **/
  @JsonProperty("spec")
  @NotNull
  public IoK8sApiStorageV1beta1VolumeAttachmentSpec getSpec() {
    return spec;
  }

  public void setSpec(IoK8sApiStorageV1beta1VolumeAttachmentSpec spec) {
    this.spec = spec;
  }

  public IoK8sApiStorageV1beta1VolumeAttachment spec(IoK8sApiStorageV1beta1VolumeAttachmentSpec spec) {
    this.spec = spec;
    return this;
  }

 /**
   * Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.
   * @return status
  **/
  @JsonProperty("status")
  public IoK8sApiStorageV1beta1VolumeAttachmentStatus getStatus() {
    return status;
  }

  public void setStatus(IoK8sApiStorageV1beta1VolumeAttachmentStatus status) {
    this.status = status;
  }

  public IoK8sApiStorageV1beta1VolumeAttachment status(IoK8sApiStorageV1beta1VolumeAttachmentStatus status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiStorageV1beta1VolumeAttachment {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

