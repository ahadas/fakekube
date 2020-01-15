package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1TopologySelectorTerm;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1ObjectMeta;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
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
  * StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.  StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.
 **/
@ApiModel(description="StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.  StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.")
public class IoK8sApiStorageV1StorageClass  {
  
  @ApiModelProperty(value = "AllowVolumeExpansion shows whether the storage class allow volume expand")
 /**
   * AllowVolumeExpansion shows whether the storage class allow volume expand
  **/
  private Boolean allowVolumeExpansion = null;

  @ApiModelProperty(value = "Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.")
  @Valid
 /**
   * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
  **/
  private List<IoK8sApiCoreV1TopologySelectorTerm> allowedTopologies = null;

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

  @ApiModelProperty(value = "Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. [\"ro\", \"soft\"]. Not validated - mount of the PVs will simply fail if one is invalid.")
 /**
   * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. [\"ro\", \"soft\"]. Not validated - mount of the PVs will simply fail if one is invalid.
  **/
  private List<String> mountOptions = null;

  @ApiModelProperty(value = "Parameters holds the parameters for the provisioner that should create volumes of this storage class.")
 /**
   * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
  **/
  private Map<String, String> parameters = null;

  @ApiModelProperty(required = true, value = "Provisioner indicates the type of the provisioner.")
 /**
   * Provisioner indicates the type of the provisioner.
  **/
  private String provisioner = null;

  @ApiModelProperty(value = "Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.")
 /**
   * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
  **/
  private String reclaimPolicy = null;

  @ApiModelProperty(value = "VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.")
 /**
   * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
  **/
  private String volumeBindingMode = null;
 /**
   * AllowVolumeExpansion shows whether the storage class allow volume expand
   * @return allowVolumeExpansion
  **/
  @JsonProperty("allowVolumeExpansion")
  public Boolean isAllowVolumeExpansion() {
    return allowVolumeExpansion;
  }

  public void setAllowVolumeExpansion(Boolean allowVolumeExpansion) {
    this.allowVolumeExpansion = allowVolumeExpansion;
  }

  public IoK8sApiStorageV1StorageClass allowVolumeExpansion(Boolean allowVolumeExpansion) {
    this.allowVolumeExpansion = allowVolumeExpansion;
    return this;
  }

 /**
   * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
   * @return allowedTopologies
  **/
  @JsonProperty("allowedTopologies")
  public List<IoK8sApiCoreV1TopologySelectorTerm> getAllowedTopologies() {
    return allowedTopologies;
  }

  public void setAllowedTopologies(List<IoK8sApiCoreV1TopologySelectorTerm> allowedTopologies) {
    this.allowedTopologies = allowedTopologies;
  }

  public IoK8sApiStorageV1StorageClass allowedTopologies(List<IoK8sApiCoreV1TopologySelectorTerm> allowedTopologies) {
    this.allowedTopologies = allowedTopologies;
    return this;
  }

  public IoK8sApiStorageV1StorageClass addAllowedTopologiesItem(IoK8sApiCoreV1TopologySelectorTerm allowedTopologiesItem) {
    this.allowedTopologies.add(allowedTopologiesItem);
    return this;
  }

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

  public IoK8sApiStorageV1StorageClass apiVersion(String apiVersion) {
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

  public IoK8sApiStorageV1StorageClass kind(String kind) {
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

  public IoK8sApiStorageV1StorageClass metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. [\&quot;ro\&quot;, \&quot;soft\&quot;]. Not validated - mount of the PVs will simply fail if one is invalid.
   * @return mountOptions
  **/
  @JsonProperty("mountOptions")
  public List<String> getMountOptions() {
    return mountOptions;
  }

  public void setMountOptions(List<String> mountOptions) {
    this.mountOptions = mountOptions;
  }

  public IoK8sApiStorageV1StorageClass mountOptions(List<String> mountOptions) {
    this.mountOptions = mountOptions;
    return this;
  }

  public IoK8sApiStorageV1StorageClass addMountOptionsItem(String mountOptionsItem) {
    this.mountOptions.add(mountOptionsItem);
    return this;
  }

 /**
   * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
   * @return parameters
  **/
  @JsonProperty("parameters")
  public Map<String, String> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }

  public IoK8sApiStorageV1StorageClass parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public IoK8sApiStorageV1StorageClass putParametersItem(String key, String parametersItem) {
    this.parameters.put(key, parametersItem);
    return this;
  }

 /**
   * Provisioner indicates the type of the provisioner.
   * @return provisioner
  **/
  @JsonProperty("provisioner")
  @NotNull
  public String getProvisioner() {
    return provisioner;
  }

  public void setProvisioner(String provisioner) {
    this.provisioner = provisioner;
  }

  public IoK8sApiStorageV1StorageClass provisioner(String provisioner) {
    this.provisioner = provisioner;
    return this;
  }

 /**
   * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
   * @return reclaimPolicy
  **/
  @JsonProperty("reclaimPolicy")
  public String getReclaimPolicy() {
    return reclaimPolicy;
  }

  public void setReclaimPolicy(String reclaimPolicy) {
    this.reclaimPolicy = reclaimPolicy;
  }

  public IoK8sApiStorageV1StorageClass reclaimPolicy(String reclaimPolicy) {
    this.reclaimPolicy = reclaimPolicy;
    return this;
  }

 /**
   * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
   * @return volumeBindingMode
  **/
  @JsonProperty("volumeBindingMode")
  public String getVolumeBindingMode() {
    return volumeBindingMode;
  }

  public void setVolumeBindingMode(String volumeBindingMode) {
    this.volumeBindingMode = volumeBindingMode;
  }

  public IoK8sApiStorageV1StorageClass volumeBindingMode(String volumeBindingMode) {
    this.volumeBindingMode = volumeBindingMode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiStorageV1StorageClass {\n");
    
    sb.append("    allowVolumeExpansion: ").append(toIndentedString(allowVolumeExpansion)).append("\n");
    sb.append("    allowedTopologies: ").append(toIndentedString(allowedTopologies)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    mountOptions: ").append(toIndentedString(mountOptions)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    provisioner: ").append(toIndentedString(provisioner)).append("\n");
    sb.append("    reclaimPolicy: ").append(toIndentedString(reclaimPolicy)).append("\n");
    sb.append("    volumeBindingMode: ").append(toIndentedString(volumeBindingMode)).append("\n");
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

