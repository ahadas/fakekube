package fakekube.io.model;

import fakekube.io.model.IoK8sApiFlowcontrolV1alpha1GroupSubject;
import fakekube.io.model.IoK8sApiFlowcontrolV1alpha1ServiceAccountSubject;
import fakekube.io.model.IoK8sApiFlowcontrolV1alpha1UserSubject;
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
  * Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
 **/
@ApiModel(description="Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.")
public class IoK8sApiFlowcontrolV1alpha1Subject  {
  
  @ApiModelProperty(value = "")
  @Valid
  private IoK8sApiFlowcontrolV1alpha1GroupSubject group = null;

  @ApiModelProperty(required = true, value = "Required")
 /**
   * Required
  **/
  private String kind = null;

  @ApiModelProperty(value = "")
  @Valid
  private IoK8sApiFlowcontrolV1alpha1ServiceAccountSubject serviceAccount = null;

  @ApiModelProperty(value = "")
  @Valid
  private IoK8sApiFlowcontrolV1alpha1UserSubject user = null;
 /**
   * Get group
   * @return group
  **/
  @JsonProperty("group")
  public IoK8sApiFlowcontrolV1alpha1GroupSubject getGroup() {
    return group;
  }

  public void setGroup(IoK8sApiFlowcontrolV1alpha1GroupSubject group) {
    this.group = group;
  }

  public IoK8sApiFlowcontrolV1alpha1Subject group(IoK8sApiFlowcontrolV1alpha1GroupSubject group) {
    this.group = group;
    return this;
  }

 /**
   * Required
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

  public IoK8sApiFlowcontrolV1alpha1Subject kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * Get serviceAccount
   * @return serviceAccount
  **/
  @JsonProperty("serviceAccount")
  public IoK8sApiFlowcontrolV1alpha1ServiceAccountSubject getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(IoK8sApiFlowcontrolV1alpha1ServiceAccountSubject serviceAccount) {
    this.serviceAccount = serviceAccount;
  }

  public IoK8sApiFlowcontrolV1alpha1Subject serviceAccount(IoK8sApiFlowcontrolV1alpha1ServiceAccountSubject serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

 /**
   * Get user
   * @return user
  **/
  @JsonProperty("user")
  public IoK8sApiFlowcontrolV1alpha1UserSubject getUser() {
    return user;
  }

  public void setUser(IoK8sApiFlowcontrolV1alpha1UserSubject user) {
    this.user = user;
  }

  public IoK8sApiFlowcontrolV1alpha1Subject user(IoK8sApiFlowcontrolV1alpha1UserSubject user) {
    this.user = user;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiFlowcontrolV1alpha1Subject {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
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

