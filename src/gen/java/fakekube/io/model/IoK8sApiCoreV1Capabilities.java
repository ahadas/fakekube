package fakekube.io.model;

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
  * Adds and removes POSIX capabilities from running containers.
 **/
@ApiModel(description="Adds and removes POSIX capabilities from running containers.")
public class IoK8sApiCoreV1Capabilities  {
  
  @ApiModelProperty(value = "Added capabilities")
 /**
   * Added capabilities
  **/
  private List<String> add = null;

  @ApiModelProperty(value = "Removed capabilities")
 /**
   * Removed capabilities
  **/
  private List<String> drop = null;
 /**
   * Added capabilities
   * @return add
  **/
  @JsonProperty("add")
  public List<String> getAdd() {
    return add;
  }

  public void setAdd(List<String> add) {
    this.add = add;
  }

  public IoK8sApiCoreV1Capabilities add(List<String> add) {
    this.add = add;
    return this;
  }

  public IoK8sApiCoreV1Capabilities addAddItem(String addItem) {
    this.add.add(addItem);
    return this;
  }

 /**
   * Removed capabilities
   * @return drop
  **/
  @JsonProperty("drop")
  public List<String> getDrop() {
    return drop;
  }

  public void setDrop(List<String> drop) {
    this.drop = drop;
  }

  public IoK8sApiCoreV1Capabilities drop(List<String> drop) {
    this.drop = drop;
    return this;
  }

  public IoK8sApiCoreV1Capabilities addDropItem(String dropItem) {
    this.drop.add(dropItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Capabilities {\n");
    
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    drop: ").append(toIndentedString(drop)).append("\n");
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

