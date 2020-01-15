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
  * OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be cluster-scoped, so there is no namespace field.
 **/
@ApiModel(description="OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be cluster-scoped, so there is no namespace field.")
public class IoK8sApimachineryPkgApisMetaV1OwnerReference  {
  
  @ApiModelProperty(required = true, value = "API version of the referent.")
 /**
   * API version of the referent.
  **/
  private String apiVersion = null;

  @ApiModelProperty(value = "If true, AND if the owner has the \"foregroundDeletion\" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs \"delete\" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.")
 /**
   * If true, AND if the owner has the \"foregroundDeletion\" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs \"delete\" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
  **/
  private Boolean blockOwnerDeletion = null;

  @ApiModelProperty(value = "If true, this reference points to the managing controller.")
 /**
   * If true, this reference points to the managing controller.
  **/
  private Boolean controller = null;

  @ApiModelProperty(required = true, value = "Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
 /**
   * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
  **/
  private String kind = null;

  @ApiModelProperty(required = true, value = "Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names")
 /**
   * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
  **/
  private String name = null;

  @ApiModelProperty(required = true, value = "UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids")
 /**
   * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
  **/
  private String uid = null;
 /**
   * API version of the referent.
   * @return apiVersion
  **/
  @JsonProperty("apiVersion")
  @NotNull
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public IoK8sApimachineryPkgApisMetaV1OwnerReference apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

 /**
   * If true, AND if the owner has the \&quot;foregroundDeletion\&quot; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs \&quot;delete\&quot; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
   * @return blockOwnerDeletion
  **/
  @JsonProperty("blockOwnerDeletion")
  public Boolean isBlockOwnerDeletion() {
    return blockOwnerDeletion;
  }

  public void setBlockOwnerDeletion(Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
  }

  public IoK8sApimachineryPkgApisMetaV1OwnerReference blockOwnerDeletion(Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
    return this;
  }

 /**
   * If true, this reference points to the managing controller.
   * @return controller
  **/
  @JsonProperty("controller")
  public Boolean isController() {
    return controller;
  }

  public void setController(Boolean controller) {
    this.controller = controller;
  }

  public IoK8sApimachineryPkgApisMetaV1OwnerReference controller(Boolean controller) {
    this.controller = controller;
    return this;
  }

 /**
   * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @JsonProperty("kind")
  @NotNull
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoK8sApimachineryPkgApisMetaV1OwnerReference kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
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

  public IoK8sApimachineryPkgApisMetaV1OwnerReference name(String name) {
    this.name = name;
    return this;
  }

 /**
   * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
   * @return uid
  **/
  @JsonProperty("uid")
  @NotNull
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public IoK8sApimachineryPkgApisMetaV1OwnerReference uid(String uid) {
    this.uid = uid;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1OwnerReference {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    blockOwnerDeletion: ").append(toIndentedString(blockOwnerDeletion)).append("\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

