package fakekube.io.model;

import fakekube.io.model.IoK8sApimachineryPkgRuntimeRawExtension;
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
  * Event represents a single event to a watched resource.
 **/
@ApiModel(description="Event represents a single event to a watched resource.")
public class IoK8sApimachineryPkgApisMetaV1WatchEvent  {
  
  @ApiModelProperty(required = true, value = "Object is:  * If Type is Added or Modified: the new state of the object.  * If Type is Deleted: the state of the object immediately before deletion.  * If Type is Error: *Status is recommended; other types may make sense    depending on context.")
  @Valid
 /**
   * Object is:  * If Type is Added or Modified: the new state of the object.  * If Type is Deleted: the state of the object immediately before deletion.  * If Type is Error: *Status is recommended; other types may make sense    depending on context.
  **/
  private IoK8sApimachineryPkgRuntimeRawExtension object = null;

  @ApiModelProperty(required = true, value = "")
  private String type = null;
 /**
   * Object is:  * If Type is Added or Modified: the new state of the object.  * If Type is Deleted: the state of the object immediately before deletion.  * If Type is Error: *Status is recommended; other types may make sense    depending on context.
   * @return object
  **/
  @JsonProperty("object")
  @NotNull
  public IoK8sApimachineryPkgRuntimeRawExtension getObject() {
    return object;
  }

  public void setObject(IoK8sApimachineryPkgRuntimeRawExtension object) {
    this.object = object;
  }

  public IoK8sApimachineryPkgApisMetaV1WatchEvent object(IoK8sApimachineryPkgRuntimeRawExtension object) {
    this.object = object;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApimachineryPkgApisMetaV1WatchEvent type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1WatchEvent {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

