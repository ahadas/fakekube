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
  * Adapts a ConfigMap into a projected volume.  The contents of the target ConfigMap's Data field will be presented in a projected volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. Note that this is identical to a configmap volume source without the default mode.
 **/
@ApiModel(description="Adapts a ConfigMap into a projected volume.  The contents of the target ConfigMap's Data field will be presented in a projected volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. Note that this is identical to a configmap volume source without the default mode.")
public class IoK8sApiCoreV1ConfigMapProjection  {
  
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

  public IoK8sApiCoreV1ConfigMapProjection items(List<IoK8sApiCoreV1KeyToPath> items) {
    this.items = items;
    return this;
  }

  public IoK8sApiCoreV1ConfigMapProjection addItemsItem(IoK8sApiCoreV1KeyToPath itemsItem) {
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

  public IoK8sApiCoreV1ConfigMapProjection name(String name) {
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

  public IoK8sApiCoreV1ConfigMapProjection optional(Boolean optional) {
    this.optional = optional;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ConfigMapProjection {\n");
    
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

