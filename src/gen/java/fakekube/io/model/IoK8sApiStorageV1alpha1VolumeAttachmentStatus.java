package fakekube.io.model;

import fakekube.io.model.IoK8sApiStorageV1alpha1VolumeError;
import io.swagger.annotations.ApiModel;
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
  * VolumeAttachmentStatus is the status of a VolumeAttachment request.
 **/
@ApiModel(description="VolumeAttachmentStatus is the status of a VolumeAttachment request.")
public class IoK8sApiStorageV1alpha1VolumeAttachmentStatus  {
  
  @ApiModelProperty(value = "The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.")
  @Valid
 /**
   * The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
  **/
  private IoK8sApiStorageV1alpha1VolumeError attachError = null;

  @ApiModelProperty(required = true, value = "Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.")
 /**
   * Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
  **/
  private Boolean attached = null;

  @ApiModelProperty(value = "Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.")
 /**
   * Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
  **/
  private Map<String, String> attachmentMetadata = null;

  @ApiModelProperty(value = "The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.")
  @Valid
 /**
   * The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.
  **/
  private IoK8sApiStorageV1alpha1VolumeError detachError = null;
 /**
   * The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
   * @return attachError
  **/
  @JsonProperty("attachError")
  public IoK8sApiStorageV1alpha1VolumeError getAttachError() {
    return attachError;
  }

  public void setAttachError(IoK8sApiStorageV1alpha1VolumeError attachError) {
    this.attachError = attachError;
  }

  public IoK8sApiStorageV1alpha1VolumeAttachmentStatus attachError(IoK8sApiStorageV1alpha1VolumeError attachError) {
    this.attachError = attachError;
    return this;
  }

 /**
   * Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
   * @return attached
  **/
  @JsonProperty("attached")
  @NotNull
  public Boolean isAttached() {
    return attached;
  }

  public void setAttached(Boolean attached) {
    this.attached = attached;
  }

  public IoK8sApiStorageV1alpha1VolumeAttachmentStatus attached(Boolean attached) {
    this.attached = attached;
    return this;
  }

 /**
   * Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
   * @return attachmentMetadata
  **/
  @JsonProperty("attachmentMetadata")
  public Map<String, String> getAttachmentMetadata() {
    return attachmentMetadata;
  }

  public void setAttachmentMetadata(Map<String, String> attachmentMetadata) {
    this.attachmentMetadata = attachmentMetadata;
  }

  public IoK8sApiStorageV1alpha1VolumeAttachmentStatus attachmentMetadata(Map<String, String> attachmentMetadata) {
    this.attachmentMetadata = attachmentMetadata;
    return this;
  }

  public IoK8sApiStorageV1alpha1VolumeAttachmentStatus putAttachmentMetadataItem(String key, String attachmentMetadataItem) {
    this.attachmentMetadata.put(key, attachmentMetadataItem);
    return this;
  }

 /**
   * The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.
   * @return detachError
  **/
  @JsonProperty("detachError")
  public IoK8sApiStorageV1alpha1VolumeError getDetachError() {
    return detachError;
  }

  public void setDetachError(IoK8sApiStorageV1alpha1VolumeError detachError) {
    this.detachError = detachError;
  }

  public IoK8sApiStorageV1alpha1VolumeAttachmentStatus detachError(IoK8sApiStorageV1alpha1VolumeError detachError) {
    this.detachError = detachError;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiStorageV1alpha1VolumeAttachmentStatus {\n");
    
    sb.append("    attachError: ").append(toIndentedString(attachError)).append("\n");
    sb.append("    attached: ").append(toIndentedString(attached)).append("\n");
    sb.append("    attachmentMetadata: ").append(toIndentedString(attachmentMetadata)).append("\n");
    sb.append("    detachError: ").append(toIndentedString(detachError)).append("\n");
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

