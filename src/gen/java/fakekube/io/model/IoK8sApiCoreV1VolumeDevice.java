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
  * volumeDevice describes a mapping of a raw block device within a container.
 **/
@ApiModel(description="volumeDevice describes a mapping of a raw block device within a container.")
public class IoK8sApiCoreV1VolumeDevice  {
  
  @ApiModelProperty(required = true, value = "devicePath is the path inside of the container that the device will be mapped to.")
 /**
   * devicePath is the path inside of the container that the device will be mapped to.
  **/
  private String devicePath = null;

  @ApiModelProperty(required = true, value = "name must match the name of a persistentVolumeClaim in the pod")
 /**
   * name must match the name of a persistentVolumeClaim in the pod
  **/
  private String name = null;
 /**
   * devicePath is the path inside of the container that the device will be mapped to.
   * @return devicePath
  **/
  @JsonProperty("devicePath")
  @NotNull
  public String getDevicePath() {
    return devicePath;
  }

  public void setDevicePath(String devicePath) {
    this.devicePath = devicePath;
  }

  public IoK8sApiCoreV1VolumeDevice devicePath(String devicePath) {
    this.devicePath = devicePath;
    return this;
  }

 /**
   * name must match the name of a persistentVolumeClaim in the pod
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

  public IoK8sApiCoreV1VolumeDevice name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1VolumeDevice {\n");
    
    sb.append("    devicePath: ").append(toIndentedString(devicePath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

