package fakekube.io.model;

import fakekube.io.model.IoK8sApiStorageV1alpha1VolumeAttachmentSource;
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
  * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
 **/
@ApiModel(description="VolumeAttachmentSpec is the specification of a VolumeAttachment request.")
public class IoK8sApiStorageV1alpha1VolumeAttachmentSpec  {
  
  @ApiModelProperty(required = true, value = "Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().")
 /**
   * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
  **/
  private String attacher = null;

  @ApiModelProperty(required = true, value = "The node that the volume should be attached to.")
 /**
   * The node that the volume should be attached to.
  **/
  private String nodeName = null;

  @ApiModelProperty(required = true, value = "Source represents the volume that should be attached.")
  @Valid
 /**
   * Source represents the volume that should be attached.
  **/
  private IoK8sApiStorageV1alpha1VolumeAttachmentSource source = null;
 /**
   * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
   * @return attacher
  **/
  @JsonProperty("attacher")
  @NotNull
  public String getAttacher() {
    return attacher;
  }

  public void setAttacher(String attacher) {
    this.attacher = attacher;
  }

  public IoK8sApiStorageV1alpha1VolumeAttachmentSpec attacher(String attacher) {
    this.attacher = attacher;
    return this;
  }

 /**
   * The node that the volume should be attached to.
   * @return nodeName
  **/
  @JsonProperty("nodeName")
  @NotNull
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public IoK8sApiStorageV1alpha1VolumeAttachmentSpec nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

 /**
   * Source represents the volume that should be attached.
   * @return source
  **/
  @JsonProperty("source")
  @NotNull
  public IoK8sApiStorageV1alpha1VolumeAttachmentSource getSource() {
    return source;
  }

  public void setSource(IoK8sApiStorageV1alpha1VolumeAttachmentSource source) {
    this.source = source;
  }

  public IoK8sApiStorageV1alpha1VolumeAttachmentSpec source(IoK8sApiStorageV1alpha1VolumeAttachmentSource source) {
    this.source = source;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiStorageV1alpha1VolumeAttachmentSpec {\n");
    
    sb.append("    attacher: ").append(toIndentedString(attacher)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

