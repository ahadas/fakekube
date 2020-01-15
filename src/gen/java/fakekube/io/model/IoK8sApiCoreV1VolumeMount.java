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
  * VolumeMount describes a mounting of a Volume within a container.
 **/
@ApiModel(description="VolumeMount describes a mounting of a Volume within a container.")
public class IoK8sApiCoreV1VolumeMount  {
  
  @ApiModelProperty(required = true, value = "Path within the container at which the volume should be mounted.  Must not contain ':'.")
 /**
   * Path within the container at which the volume should be mounted.  Must not contain ':'.
  **/
  private String mountPath = null;

  @ApiModelProperty(value = "mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.")
 /**
   * mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
  **/
  private String mountPropagation = null;

  @ApiModelProperty(required = true, value = "This must match the Name of a Volume.")
 /**
   * This must match the Name of a Volume.
  **/
  private String name = null;

  @ApiModelProperty(value = "Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.")
 /**
   * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
  **/
  private Boolean readOnly = null;

  @ApiModelProperty(value = "Path within the volume from which the container's volume should be mounted. Defaults to \"\" (volume's root).")
 /**
   * Path within the volume from which the container's volume should be mounted. Defaults to \"\" (volume's root).
  **/
  private String subPath = null;

  @ApiModelProperty(value = "Expanded path within the volume from which the container's volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to \"\" (volume's root). SubPathExpr and SubPath are mutually exclusive.")
 /**
   * Expanded path within the volume from which the container's volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to \"\" (volume's root). SubPathExpr and SubPath are mutually exclusive.
  **/
  private String subPathExpr = null;
 /**
   * Path within the container at which the volume should be mounted.  Must not contain &#39;:&#39;.
   * @return mountPath
  **/
  @JsonProperty("mountPath")
  @NotNull
  public String getMountPath() {
    return mountPath;
  }

  public void setMountPath(String mountPath) {
    this.mountPath = mountPath;
  }

  public IoK8sApiCoreV1VolumeMount mountPath(String mountPath) {
    this.mountPath = mountPath;
    return this;
  }

 /**
   * mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
   * @return mountPropagation
  **/
  @JsonProperty("mountPropagation")
  public String getMountPropagation() {
    return mountPropagation;
  }

  public void setMountPropagation(String mountPropagation) {
    this.mountPropagation = mountPropagation;
  }

  public IoK8sApiCoreV1VolumeMount mountPropagation(String mountPropagation) {
    this.mountPropagation = mountPropagation;
    return this;
  }

 /**
   * This must match the Name of a Volume.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiCoreV1VolumeMount name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
   * @return readOnly
  **/
  @JsonProperty("readOnly")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public IoK8sApiCoreV1VolumeMount readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

 /**
   * Path within the volume from which the container&#39;s volume should be mounted. Defaults to \&quot;\&quot; (volume&#39;s root).
   * @return subPath
  **/
  @JsonProperty("subPath")
  public String getSubPath() {
    return subPath;
  }

  public void setSubPath(String subPath) {
    this.subPath = subPath;
  }

  public IoK8sApiCoreV1VolumeMount subPath(String subPath) {
    this.subPath = subPath;
    return this;
  }

 /**
   * Expanded path within the volume from which the container&#39;s volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container&#39;s environment. Defaults to \&quot;\&quot; (volume&#39;s root). SubPathExpr and SubPath are mutually exclusive.
   * @return subPathExpr
  **/
  @JsonProperty("subPathExpr")
  public String getSubPathExpr() {
    return subPathExpr;
  }

  public void setSubPathExpr(String subPathExpr) {
    this.subPathExpr = subPathExpr;
  }

  public IoK8sApiCoreV1VolumeMount subPathExpr(String subPathExpr) {
    this.subPathExpr = subPathExpr;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1VolumeMount {\n");
    
    sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
    sb.append("    mountPropagation: ").append(toIndentedString(mountPropagation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
    sb.append("    subPathExpr: ").append(toIndentedString(subPathExpr)).append("\n");
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

