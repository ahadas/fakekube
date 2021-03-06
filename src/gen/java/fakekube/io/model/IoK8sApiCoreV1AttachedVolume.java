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
  * AttachedVolume describes a volume attached to a node
 **/
@ApiModel(description="AttachedVolume describes a volume attached to a node")
public class IoK8sApiCoreV1AttachedVolume  {
  
  @ApiModelProperty(required = true, value = "DevicePath represents the device path where the volume should be available")
 /**
   * DevicePath represents the device path where the volume should be available
  **/
  private String devicePath = null;

  @ApiModelProperty(required = true, value = "Name of the attached volume")
 /**
   * Name of the attached volume
  **/
  private String name = null;
 /**
   * DevicePath represents the device path where the volume should be available
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

  public IoK8sApiCoreV1AttachedVolume devicePath(String devicePath) {
    this.devicePath = devicePath;
    return this;
  }

 /**
   * Name of the attached volume
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

  public IoK8sApiCoreV1AttachedVolume name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1AttachedVolume {\n");
    
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

