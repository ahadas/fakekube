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
  * SELinuxOptions are the labels to be applied to the container
 **/
@ApiModel(description="SELinuxOptions are the labels to be applied to the container")
public class IoK8sApiCoreV1SELinuxOptions  {
  
  @ApiModelProperty(value = "Level is SELinux level label that applies to the container.")
 /**
   * Level is SELinux level label that applies to the container.
  **/
  private String level = null;

  @ApiModelProperty(value = "Role is a SELinux role label that applies to the container.")
 /**
   * Role is a SELinux role label that applies to the container.
  **/
  private String role = null;

  @ApiModelProperty(value = "Type is a SELinux type label that applies to the container.")
 /**
   * Type is a SELinux type label that applies to the container.
  **/
  private String type = null;

  @ApiModelProperty(value = "User is a SELinux user label that applies to the container.")
 /**
   * User is a SELinux user label that applies to the container.
  **/
  private String user = null;
 /**
   * Level is SELinux level label that applies to the container.
   * @return level
  **/
  @JsonProperty("level")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public IoK8sApiCoreV1SELinuxOptions level(String level) {
    this.level = level;
    return this;
  }

 /**
   * Role is a SELinux role label that applies to the container.
   * @return role
  **/
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public IoK8sApiCoreV1SELinuxOptions role(String role) {
    this.role = role;
    return this;
  }

 /**
   * Type is a SELinux type label that applies to the container.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiCoreV1SELinuxOptions type(String type) {
    this.type = type;
    return this;
  }

 /**
   * User is a SELinux user label that applies to the container.
   * @return user
  **/
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public IoK8sApiCoreV1SELinuxOptions user(String user) {
    this.user = user;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1SELinuxOptions {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

