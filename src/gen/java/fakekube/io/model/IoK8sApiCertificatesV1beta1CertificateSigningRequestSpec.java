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
  * This information is immutable after the request is created. Only the Request and Usages fields can be set on creation, other fields are derived by Kubernetes and cannot be modified by users.
 **/
@ApiModel(description="This information is immutable after the request is created. Only the Request and Usages fields can be set on creation, other fields are derived by Kubernetes and cannot be modified by users.")
public class IoK8sApiCertificatesV1beta1CertificateSigningRequestSpec  {
  
  @ApiModelProperty(value = "Extra information about the requesting user. See user.Info interface for details.")
  @Valid
 /**
   * Extra information about the requesting user. See user.Info interface for details.
  **/
  private Map<String, List<String>> extra = null;

  @ApiModelProperty(value = "Group information about the requesting user. See user.Info interface for details.")
 /**
   * Group information about the requesting user. See user.Info interface for details.
  **/
  private List<String> groups = null;

  @ApiModelProperty(required = true, value = "Base64-encoded PKCS#10 CSR data")
 /**
   * Base64-encoded PKCS#10 CSR data
  **/
  private byte[] request = null;

  @ApiModelProperty(value = "UID information about the requesting user. See user.Info interface for details.")
 /**
   * UID information about the requesting user. See user.Info interface for details.
  **/
  private String uid = null;

  @ApiModelProperty(value = "allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3      https://tools.ietf.org/html/rfc5280#section-4.2.1.12")
 /**
   * allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
  **/
  private List<String> usages = null;

  @ApiModelProperty(value = "Information about the requesting user. See user.Info interface for details.")
 /**
   * Information about the requesting user. See user.Info interface for details.
  **/
  private String username = null;
 /**
   * Extra information about the requesting user. See user.Info interface for details.
   * @return extra
  **/
  @JsonProperty("extra")
  public Map<String, List<String>> getExtra() {
    return extra;
  }

  public void setExtra(Map<String, List<String>> extra) {
    this.extra = extra;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestSpec extra(Map<String, List<String>> extra) {
    this.extra = extra;
    return this;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestSpec putExtraItem(String key, List<String> extraItem) {
    this.extra.put(key, extraItem);
    return this;
  }

 /**
   * Group information about the requesting user. See user.Info interface for details.
   * @return groups
  **/
  @JsonProperty("groups")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestSpec groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestSpec addGroupsItem(String groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

 /**
   * Base64-encoded PKCS#10 CSR data
   * @return request
  **/
  @JsonProperty("request")
  @NotNull
 @Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")  public byte[] getRequest() {
    return request;
  }

  public void setRequest(byte[] request) {
    this.request = request;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestSpec request(byte[] request) {
    this.request = request;
    return this;
  }

 /**
   * UID information about the requesting user. See user.Info interface for details.
   * @return uid
  **/
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestSpec uid(String uid) {
    this.uid = uid;
    return this;
  }

 /**
   * allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
   * @return usages
  **/
  @JsonProperty("usages")
  public List<String> getUsages() {
    return usages;
  }

  public void setUsages(List<String> usages) {
    this.usages = usages;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestSpec usages(List<String> usages) {
    this.usages = usages;
    return this;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestSpec addUsagesItem(String usagesItem) {
    this.usages.add(usagesItem);
    return this;
  }

 /**
   * Information about the requesting user. See user.Info interface for details.
   * @return username
  **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestSpec username(String username) {
    this.username = username;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCertificatesV1beta1CertificateSigningRequestSpec {\n");
    
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
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

