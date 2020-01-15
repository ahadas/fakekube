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
  * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
 **/
@ApiModel(description="AzureFile represents an Azure File Service mount on the host and bind mount to the pod.")
public class IoK8sApiCoreV1AzureFilePersistentVolumeSource  {
  
  @ApiModelProperty(value = "Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
 /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
  **/
  private Boolean readOnly = null;

  @ApiModelProperty(required = true, value = "the name of secret that contains Azure Storage Account Name and Key")
 /**
   * the name of secret that contains Azure Storage Account Name and Key
  **/
  private String secretName = null;

  @ApiModelProperty(value = "the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod")
 /**
   * the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod
  **/
  private String secretNamespace = null;

  @ApiModelProperty(required = true, value = "Share Name")
 /**
   * Share Name
  **/
  private String shareName = null;
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

  public IoK8sApiCoreV1AzureFilePersistentVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

 /**
   * the name of secret that contains Azure Storage Account Name and Key
   * @return secretName
  **/
  @JsonProperty("secretName")
  @NotNull
  public String getSecretName() {
    return secretName;
  }

  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }

  public IoK8sApiCoreV1AzureFilePersistentVolumeSource secretName(String secretName) {
    this.secretName = secretName;
    return this;
  }

 /**
   * the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod
   * @return secretNamespace
  **/
  @JsonProperty("secretNamespace")
  public String getSecretNamespace() {
    return secretNamespace;
  }

  public void setSecretNamespace(String secretNamespace) {
    this.secretNamespace = secretNamespace;
  }

  public IoK8sApiCoreV1AzureFilePersistentVolumeSource secretNamespace(String secretNamespace) {
    this.secretNamespace = secretNamespace;
    return this;
  }

 /**
   * Share Name
   * @return shareName
  **/
  @JsonProperty("shareName")
  @NotNull
  public String getShareName() {
    return shareName;
  }

  public void setShareName(String shareName) {
    this.shareName = shareName;
  }

  public IoK8sApiCoreV1AzureFilePersistentVolumeSource shareName(String shareName) {
    this.shareName = shareName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1AzureFilePersistentVolumeSource {\n");
    
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    secretNamespace: ").append(toIndentedString(secretNamespace)).append("\n");
    sb.append("    shareName: ").append(toIndentedString(shareName)).append("\n");
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

