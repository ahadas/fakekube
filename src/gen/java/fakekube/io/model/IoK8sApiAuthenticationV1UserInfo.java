package fakekube.io.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
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
  * UserInfo holds the information about the user needed to implement the user.Info interface.
 **/
@ApiModel(description="UserInfo holds the information about the user needed to implement the user.Info interface.")
public class IoK8sApiAuthenticationV1UserInfo  {
  
  @ApiModelProperty(value = "Any additional information provided by the authenticator.")
  @Valid
 /**
   * Any additional information provided by the authenticator.
  **/
  private Map<String, List<String>> extra = null;

  @ApiModelProperty(value = "The names of groups this user is a part of.")
 /**
   * The names of groups this user is a part of.
  **/
  private List<String> groups = null;

  @ApiModelProperty(value = "A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs.")
 /**
   * A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs.
  **/
  private String uid = null;

  @ApiModelProperty(value = "The name that uniquely identifies this user among all active users.")
 /**
   * The name that uniquely identifies this user among all active users.
  **/
  private String username = null;
 /**
   * Any additional information provided by the authenticator.
   * @return extra
  **/
  @JsonProperty("extra")
  public Map<String, List<String>> getExtra() {
    return extra;
  }

  public void setExtra(Map<String, List<String>> extra) {
    this.extra = extra;
  }

  public IoK8sApiAuthenticationV1UserInfo extra(Map<String, List<String>> extra) {
    this.extra = extra;
    return this;
  }

  public IoK8sApiAuthenticationV1UserInfo putExtraItem(String key, List<String> extraItem) {
    this.extra.put(key, extraItem);
    return this;
  }

 /**
   * The names of groups this user is a part of.
   * @return groups
  **/
  @JsonProperty("groups")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public IoK8sApiAuthenticationV1UserInfo groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public IoK8sApiAuthenticationV1UserInfo addGroupsItem(String groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

 /**
   * A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs.
   * @return uid
  **/
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public IoK8sApiAuthenticationV1UserInfo uid(String uid) {
    this.uid = uid;
    return this;
  }

 /**
   * The name that uniquely identifies this user among all active users.
   * @return username
  **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public IoK8sApiAuthenticationV1UserInfo username(String username) {
    this.username = username;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthenticationV1UserInfo {\n");
    
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

