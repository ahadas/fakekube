package fakekube.io.model;

import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1StatusCause;
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
  * StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
 **/
@ApiModel(description="StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.")
public class IoK8sApimachineryPkgApisMetaV1StatusDetails  {
  
  @ApiModelProperty(value = "The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.")
  @Valid
 /**
   * The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
  **/
  private List<IoK8sApimachineryPkgApisMetaV1StatusCause> causes = null;

  @ApiModelProperty(value = "The group attribute of the resource associated with the status StatusReason.")
 /**
   * The group attribute of the resource associated with the status StatusReason.
  **/
  private String group = null;

  @ApiModelProperty(value = "The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
 /**
   * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
  **/
  private String kind = null;

  @ApiModelProperty(value = "The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).")
 /**
   * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
  **/
  private String name = null;

  @ApiModelProperty(value = "If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.")
 /**
   * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
  **/
  private Integer retryAfterSeconds = null;

  @ApiModelProperty(value = "UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids")
 /**
   * UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
  **/
  private String uid = null;
 /**
   * The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
   * @return causes
  **/
  @JsonProperty("causes")
  public List<IoK8sApimachineryPkgApisMetaV1StatusCause> getCauses() {
    return causes;
  }

  public void setCauses(List<IoK8sApimachineryPkgApisMetaV1StatusCause> causes) {
    this.causes = causes;
  }

  public IoK8sApimachineryPkgApisMetaV1StatusDetails causes(List<IoK8sApimachineryPkgApisMetaV1StatusCause> causes) {
    this.causes = causes;
    return this;
  }

  public IoK8sApimachineryPkgApisMetaV1StatusDetails addCausesItem(IoK8sApimachineryPkgApisMetaV1StatusCause causesItem) {
    this.causes.add(causesItem);
    return this;
  }

 /**
   * The group attribute of the resource associated with the status StatusReason.
   * @return group
  **/
  @JsonProperty("group")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public IoK8sApimachineryPkgApisMetaV1StatusDetails group(String group) {
    this.group = group;
    return this;
  }

 /**
   * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoK8sApimachineryPkgApisMetaV1StatusDetails kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApimachineryPkgApisMetaV1StatusDetails name(String name) {
    this.name = name;
    return this;
  }

 /**
   * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
   * @return retryAfterSeconds
  **/
  @JsonProperty("retryAfterSeconds")
  public Integer getRetryAfterSeconds() {
    return retryAfterSeconds;
  }

  public void setRetryAfterSeconds(Integer retryAfterSeconds) {
    this.retryAfterSeconds = retryAfterSeconds;
  }

  public IoK8sApimachineryPkgApisMetaV1StatusDetails retryAfterSeconds(Integer retryAfterSeconds) {
    this.retryAfterSeconds = retryAfterSeconds;
    return this;
  }

 /**
   * UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
   * @return uid
  **/
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public IoK8sApimachineryPkgApisMetaV1StatusDetails uid(String uid) {
    this.uid = uid;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1StatusDetails {\n");
    
    sb.append("    causes: ").append(toIndentedString(causes)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    retryAfterSeconds: ").append(toIndentedString(retryAfterSeconds)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

