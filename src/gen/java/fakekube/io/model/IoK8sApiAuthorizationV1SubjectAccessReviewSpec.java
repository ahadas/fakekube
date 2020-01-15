package fakekube.io.model;

import fakekube.io.model.IoK8sApiAuthorizationV1NonResourceAttributes;
import fakekube.io.model.IoK8sApiAuthorizationV1ResourceAttributes;
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
  * SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 **/
@ApiModel(description="SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set")
public class IoK8sApiAuthorizationV1SubjectAccessReviewSpec  {
  
  @ApiModelProperty(value = "Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.")
  @Valid
 /**
   * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
  **/
  private Map<String, List<String>> extra = null;

  @ApiModelProperty(value = "Groups is the groups you're testing for.")
 /**
   * Groups is the groups you're testing for.
  **/
  private List<String> groups = null;

  @ApiModelProperty(value = "NonResourceAttributes describes information for a non-resource access request")
  @Valid
 /**
   * NonResourceAttributes describes information for a non-resource access request
  **/
  private IoK8sApiAuthorizationV1NonResourceAttributes nonResourceAttributes = null;

  @ApiModelProperty(value = "ResourceAuthorizationAttributes describes information for a resource access request")
  @Valid
 /**
   * ResourceAuthorizationAttributes describes information for a resource access request
  **/
  private IoK8sApiAuthorizationV1ResourceAttributes resourceAttributes = null;

  @ApiModelProperty(value = "UID information about the requesting user.")
 /**
   * UID information about the requesting user.
  **/
  private String uid = null;

  @ApiModelProperty(value = "User is the user you're testing for. If you specify \"User\" but not \"Groups\", then is it interpreted as \"What if User were not a member of any groups")
 /**
   * User is the user you're testing for. If you specify \"User\" but not \"Groups\", then is it interpreted as \"What if User were not a member of any groups
  **/
  private String user = null;
 /**
   * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
   * @return extra
  **/
  @JsonProperty("extra")
  public Map<String, List<String>> getExtra() {
    return extra;
  }

  public void setExtra(Map<String, List<String>> extra) {
    this.extra = extra;
  }

  public IoK8sApiAuthorizationV1SubjectAccessReviewSpec extra(Map<String, List<String>> extra) {
    this.extra = extra;
    return this;
  }

  public IoK8sApiAuthorizationV1SubjectAccessReviewSpec putExtraItem(String key, List<String> extraItem) {
    this.extra.put(key, extraItem);
    return this;
  }

 /**
   * Groups is the groups you&#39;re testing for.
   * @return groups
  **/
  @JsonProperty("groups")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public IoK8sApiAuthorizationV1SubjectAccessReviewSpec groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public IoK8sApiAuthorizationV1SubjectAccessReviewSpec addGroupsItem(String groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

 /**
   * NonResourceAttributes describes information for a non-resource access request
   * @return nonResourceAttributes
  **/
  @JsonProperty("nonResourceAttributes")
  public IoK8sApiAuthorizationV1NonResourceAttributes getNonResourceAttributes() {
    return nonResourceAttributes;
  }

  public void setNonResourceAttributes(IoK8sApiAuthorizationV1NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
  }

  public IoK8sApiAuthorizationV1SubjectAccessReviewSpec nonResourceAttributes(IoK8sApiAuthorizationV1NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
    return this;
  }

 /**
   * ResourceAuthorizationAttributes describes information for a resource access request
   * @return resourceAttributes
  **/
  @JsonProperty("resourceAttributes")
  public IoK8sApiAuthorizationV1ResourceAttributes getResourceAttributes() {
    return resourceAttributes;
  }

  public void setResourceAttributes(IoK8sApiAuthorizationV1ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
  }

  public IoK8sApiAuthorizationV1SubjectAccessReviewSpec resourceAttributes(IoK8sApiAuthorizationV1ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
    return this;
  }

 /**
   * UID information about the requesting user.
   * @return uid
  **/
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public IoK8sApiAuthorizationV1SubjectAccessReviewSpec uid(String uid) {
    this.uid = uid;
    return this;
  }

 /**
   * User is the user you&#39;re testing for. If you specify \&quot;User\&quot; but not \&quot;Groups\&quot;, then is it interpreted as \&quot;What if User were not a member of any groups
   * @return user
  **/
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public IoK8sApiAuthorizationV1SubjectAccessReviewSpec user(String user) {
    this.user = user;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthorizationV1SubjectAccessReviewSpec {\n");
    
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    nonResourceAttributes: ").append(toIndentedString(nonResourceAttributes)).append("\n");
    sb.append("    resourceAttributes: ").append(toIndentedString(resourceAttributes)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

