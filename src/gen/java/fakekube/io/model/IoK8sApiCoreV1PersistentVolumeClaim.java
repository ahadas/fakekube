package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1PersistentVolumeClaimSpec;
import fakekube.io.model.IoK8sApiCoreV1PersistentVolumeClaimStatus;
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
  * PersistentVolumeClaim is a user's request for and claim to a persistent volume
 **/
@ApiModel(description="PersistentVolumeClaim is a user's request for and claim to a persistent volume")
public class IoK8sApiCoreV1PersistentVolumeClaim  {
  
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

  @ApiModelProperty(value = "Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata")
  @Valid
 /**
   * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
  **/
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  @ApiModelProperty(value = "Spec defines the desired characteristics of a volume requested by a pod author. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
  @Valid
 /**
   * Spec defines the desired characteristics of a volume requested by a pod author. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
  **/
  private IoK8sApiCoreV1PersistentVolumeClaimSpec spec = null;

  @ApiModelProperty(value = "Status represents the current information/status of a persistent volume claim. Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
  @Valid
 /**
   * Status represents the current information/status of a persistent volume claim. Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
  **/
  private IoK8sApiCoreV1PersistentVolumeClaimStatus status = null;
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

  public IoK8sApiCoreV1PersistentVolumeClaim apiVersion(String apiVersion) {
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

  public IoK8sApiCoreV1PersistentVolumeClaim kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
   * @return metadata
  **/
  @JsonProperty("metadata")
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public IoK8sApiCoreV1PersistentVolumeClaim metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * Spec defines the desired characteristics of a volume requested by a pod author. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
   * @return spec
  **/
  @JsonProperty("spec")
  public IoK8sApiCoreV1PersistentVolumeClaimSpec getSpec() {
    return spec;
  }

  public void setSpec(IoK8sApiCoreV1PersistentVolumeClaimSpec spec) {
    this.spec = spec;
  }

  public IoK8sApiCoreV1PersistentVolumeClaim spec(IoK8sApiCoreV1PersistentVolumeClaimSpec spec) {
    this.spec = spec;
    return this;
  }

 /**
   * Status represents the current information/status of a persistent volume claim. Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
   * @return status
  **/
  @JsonProperty("status")
  public IoK8sApiCoreV1PersistentVolumeClaimStatus getStatus() {
    return status;
  }

  public void setStatus(IoK8sApiCoreV1PersistentVolumeClaimStatus status) {
    this.status = status;
  }

  public IoK8sApiCoreV1PersistentVolumeClaim status(IoK8sApiCoreV1PersistentVolumeClaimStatus status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PersistentVolumeClaim {\n");
    
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

