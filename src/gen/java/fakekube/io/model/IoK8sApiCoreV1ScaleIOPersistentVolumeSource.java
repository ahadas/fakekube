package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1SecretReference;
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
  * ScaleIOPersistentVolumeSource represents a persistent ScaleIO volume
 **/
@ApiModel(description="ScaleIOPersistentVolumeSource represents a persistent ScaleIO volume")
public class IoK8sApiCoreV1ScaleIOPersistentVolumeSource  {
  
  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Default is \"xfs\"")
 /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Default is \"xfs\"
  **/
  private String fsType = null;

  @ApiModelProperty(required = true, value = "The host address of the ScaleIO API Gateway.")
 /**
   * The host address of the ScaleIO API Gateway.
  **/
  private String gateway = null;

  @ApiModelProperty(value = "The name of the ScaleIO Protection Domain for the configured storage.")
 /**
   * The name of the ScaleIO Protection Domain for the configured storage.
  **/
  private String protectionDomain = null;

  @ApiModelProperty(value = "Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
 /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
  **/
  private Boolean readOnly = null;

  @ApiModelProperty(required = true, value = "SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.")
  @Valid
 /**
   * SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
  **/
  private IoK8sApiCoreV1SecretReference secretRef = null;

  @ApiModelProperty(value = "Flag to enable/disable SSL communication with Gateway, default false")
 /**
   * Flag to enable/disable SSL communication with Gateway, default false
  **/
  private Boolean sslEnabled = null;

  @ApiModelProperty(value = "Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.")
 /**
   * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
  **/
  private String storageMode = null;

  @ApiModelProperty(value = "The ScaleIO Storage Pool associated with the protection domain.")
 /**
   * The ScaleIO Storage Pool associated with the protection domain.
  **/
  private String storagePool = null;

  @ApiModelProperty(required = true, value = "The name of the storage system as configured in ScaleIO.")
 /**
   * The name of the storage system as configured in ScaleIO.
  **/
  private String system = null;

  @ApiModelProperty(value = "The name of a volume already created in the ScaleIO system that is associated with this volume source.")
 /**
   * The name of a volume already created in the ScaleIO system that is associated with this volume source.
  **/
  private String volumeName = null;
 /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Default is \&quot;xfs\&quot;
   * @return fsType
  **/
  @JsonProperty("fsType")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public IoK8sApiCoreV1ScaleIOPersistentVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

 /**
   * The host address of the ScaleIO API Gateway.
   * @return gateway
  **/
  @JsonProperty("gateway")
  @NotNull
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  public IoK8sApiCoreV1ScaleIOPersistentVolumeSource gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

 /**
   * The name of the ScaleIO Protection Domain for the configured storage.
   * @return protectionDomain
  **/
  @JsonProperty("protectionDomain")
  public String getProtectionDomain() {
    return protectionDomain;
  }

  public void setProtectionDomain(String protectionDomain) {
    this.protectionDomain = protectionDomain;
  }

  public IoK8sApiCoreV1ScaleIOPersistentVolumeSource protectionDomain(String protectionDomain) {
    this.protectionDomain = protectionDomain;
    return this;
  }

 /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/
  @JsonProperty("readOnly")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public IoK8sApiCoreV1ScaleIOPersistentVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

 /**
   * SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
   * @return secretRef
  **/
  @JsonProperty("secretRef")
  @NotNull
  public IoK8sApiCoreV1SecretReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(IoK8sApiCoreV1SecretReference secretRef) {
    this.secretRef = secretRef;
  }

  public IoK8sApiCoreV1ScaleIOPersistentVolumeSource secretRef(IoK8sApiCoreV1SecretReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

 /**
   * Flag to enable/disable SSL communication with Gateway, default false
   * @return sslEnabled
  **/
  @JsonProperty("sslEnabled")
  public Boolean isSslEnabled() {
    return sslEnabled;
  }

  public void setSslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
  }

  public IoK8sApiCoreV1ScaleIOPersistentVolumeSource sslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
    return this;
  }

 /**
   * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
   * @return storageMode
  **/
  @JsonProperty("storageMode")
  public String getStorageMode() {
    return storageMode;
  }

  public void setStorageMode(String storageMode) {
    this.storageMode = storageMode;
  }

  public IoK8sApiCoreV1ScaleIOPersistentVolumeSource storageMode(String storageMode) {
    this.storageMode = storageMode;
    return this;
  }

 /**
   * The ScaleIO Storage Pool associated with the protection domain.
   * @return storagePool
  **/
  @JsonProperty("storagePool")
  public String getStoragePool() {
    return storagePool;
  }

  public void setStoragePool(String storagePool) {
    this.storagePool = storagePool;
  }

  public IoK8sApiCoreV1ScaleIOPersistentVolumeSource storagePool(String storagePool) {
    this.storagePool = storagePool;
    return this;
  }

 /**
   * The name of the storage system as configured in ScaleIO.
   * @return system
  **/
  @JsonProperty("system")
  @NotNull
  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public IoK8sApiCoreV1ScaleIOPersistentVolumeSource system(String system) {
    this.system = system;
    return this;
  }

 /**
   * The name of a volume already created in the ScaleIO system that is associated with this volume source.
   * @return volumeName
  **/
  @JsonProperty("volumeName")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }

  public IoK8sApiCoreV1ScaleIOPersistentVolumeSource volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ScaleIOPersistentVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    protectionDomain: ").append(toIndentedString(protectionDomain)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    sslEnabled: ").append(toIndentedString(sslEnabled)).append("\n");
    sb.append("    storageMode: ").append(toIndentedString(storageMode)).append("\n");
    sb.append("    storagePool: ").append(toIndentedString(storagePool)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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

