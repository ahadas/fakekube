package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1PersistentVolumeSpec;
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
  * VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
 **/
@ApiModel(description="VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.")
public class IoK8sApiStorageV1VolumeAttachmentSource  {
  
  @ApiModelProperty(value = "inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.")
  @Valid
 /**
   * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.
  **/
  private IoK8sApiCoreV1PersistentVolumeSpec inlineVolumeSpec = null;

  @ApiModelProperty(value = "Name of the persistent volume to attach.")
 /**
   * Name of the persistent volume to attach.
  **/
  private String persistentVolumeName = null;
 /**
   * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod&#39;s inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod&#39;s inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.
   * @return inlineVolumeSpec
  **/
  @JsonProperty("inlineVolumeSpec")
  public IoK8sApiCoreV1PersistentVolumeSpec getInlineVolumeSpec() {
    return inlineVolumeSpec;
  }

  public void setInlineVolumeSpec(IoK8sApiCoreV1PersistentVolumeSpec inlineVolumeSpec) {
    this.inlineVolumeSpec = inlineVolumeSpec;
  }

  public IoK8sApiStorageV1VolumeAttachmentSource inlineVolumeSpec(IoK8sApiCoreV1PersistentVolumeSpec inlineVolumeSpec) {
    this.inlineVolumeSpec = inlineVolumeSpec;
    return this;
  }

 /**
   * Name of the persistent volume to attach.
   * @return persistentVolumeName
  **/
  @JsonProperty("persistentVolumeName")
  public String getPersistentVolumeName() {
    return persistentVolumeName;
  }

  public void setPersistentVolumeName(String persistentVolumeName) {
    this.persistentVolumeName = persistentVolumeName;
  }

  public IoK8sApiStorageV1VolumeAttachmentSource persistentVolumeName(String persistentVolumeName) {
    this.persistentVolumeName = persistentVolumeName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiStorageV1VolumeAttachmentSource {\n");
    
    sb.append("    inlineVolumeSpec: ").append(toIndentedString(inlineVolumeSpec)).append("\n");
    sb.append("    persistentVolumeName: ").append(toIndentedString(persistentVolumeName)).append("\n");
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

