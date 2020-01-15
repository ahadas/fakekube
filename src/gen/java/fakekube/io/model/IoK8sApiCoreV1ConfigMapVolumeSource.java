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
  * Adapts a ConfigMap into a volume.  The contents of the target ConfigMap's Data field will be presented in a volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. ConfigMap volumes support ownership management and SELinux relabeling.
 **/
@ApiModel(description="Adapts a ConfigMap into a volume.  The contents of the target ConfigMap's Data field will be presented in a volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. ConfigMap volumes support ownership management and SELinux relabeling.")
public class IoK8sApiCoreV1ConfigMapVolumeSource  {
  
  @ApiModelProperty(value = "Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
 /**
   * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
  **/
  private Integer defaultMode = null;

  @ApiModelProperty(value = "If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.")
  @Valid
 /**
   * If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
  **/
  private List<IoK8sApiCoreV1KeyToPath> items = null;

  @ApiModelProperty(value = "Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
 /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
  **/
  private String name = null;

  @ApiModelProperty(value = "Specify whether the ConfigMap or its keys must be defined")
 /**
   * Specify whether the ConfigMap or its keys must be defined
  **/
  private Boolean optional = null;
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

  public IoK8sApiCoreV1ConfigMapVolumeSource defaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
    return this;
  }

 /**
   * If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
   * @return items
  **/
  @JsonProperty("items")
  public List<IoK8sApiCoreV1KeyToPath> getItems() {
    return items;
  }

  public void setItems(List<IoK8sApiCoreV1KeyToPath> items) {
    this.items = items;
  }

  public IoK8sApiCoreV1ConfigMapVolumeSource items(List<IoK8sApiCoreV1KeyToPath> items) {
    this.items = items;
    return this;
  }

  public IoK8sApiCoreV1ConfigMapVolumeSource addItemsItem(IoK8sApiCoreV1KeyToPath itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiCoreV1ConfigMapVolumeSource name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Specify whether the ConfigMap or its keys must be defined
   * @return optional
  **/
  @JsonProperty("optional")
  public Boolean isOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public IoK8sApiCoreV1ConfigMapVolumeSource optional(Boolean optional) {
    this.optional = optional;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ConfigMapVolumeSource {\n");
    
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
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

