package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1KeyToPath;
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
  * Adapts a Secret into a volume.  The contents of the target Secret's Data field will be presented in a volume as files using the keys in the Data field as the file names. Secret volumes support ownership management and SELinux relabeling.
 **/
@ApiModel(description="Adapts a Secret into a volume.  The contents of the target Secret's Data field will be presented in a volume as files using the keys in the Data field as the file names. Secret volumes support ownership management and SELinux relabeling.")
public class IoK8sApiCoreV1SecretVolumeSource  {
  
  @ApiModelProperty(value = "Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
 /**
   * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
  **/
  private Integer defaultMode = null;

  @ApiModelProperty(value = "If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.")
  @Valid
 /**
   * If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
  **/
  private List<IoK8sApiCoreV1KeyToPath> items = null;

  @ApiModelProperty(value = "Specify whether the Secret or its keys must be defined")
 /**
   * Specify whether the Secret or its keys must be defined
  **/
  private Boolean optional = null;

  @ApiModelProperty(value = "Name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret")
 /**
   * Name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
  **/
  private String secretName = null;
 /**
   * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   * @return defaultMode
  **/
  @JsonProperty("defaultMode")
  public Integer getDefaultMode() {
    return defaultMode;
  }

  public void setDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
  }

  public IoK8sApiCoreV1SecretVolumeSource defaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
    return this;
  }

 /**
   * If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
   * @return items
  **/
  @JsonProperty("items")
  public List<IoK8sApiCoreV1KeyToPath> getItems() {
    return items;
  }

  public void setItems(List<IoK8sApiCoreV1KeyToPath> items) {
    this.items = items;
  }

  public IoK8sApiCoreV1SecretVolumeSource items(List<IoK8sApiCoreV1KeyToPath> items) {
    this.items = items;
    return this;
  }

  public IoK8sApiCoreV1SecretVolumeSource addItemsItem(IoK8sApiCoreV1KeyToPath itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Specify whether the Secret or its keys must be defined
   * @return optional
  **/
  @JsonProperty("optional")
  public Boolean isOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public IoK8sApiCoreV1SecretVolumeSource optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

 /**
   * Name of the secret in the pod&#39;s namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
   * @return secretName
  **/
  @JsonProperty("secretName")
  public String getSecretName() {
    return secretName;
  }

  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }

  public IoK8sApiCoreV1SecretVolumeSource secretName(String secretName) {
    this.secretName = secretName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1SecretVolumeSource {\n");
    
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
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

