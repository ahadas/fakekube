package fakekube.io.model;

import fakekube.io.model.IoK8sKubeAggregatorPkgApisApiregistrationV1beta1ServiceReference;
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
  * APIServiceSpec contains information for locating and communicating with a server. Only https is supported, though you are able to disable certificate verification.
 **/
@ApiModel(description="APIServiceSpec contains information for locating and communicating with a server. Only https is supported, though you are able to disable certificate verification.")
public class IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceSpec  {
  
  @ApiModelProperty(value = "CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving certificate. If unspecified, system trust roots on the apiserver are used.")
 /**
   * CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving certificate. If unspecified, system trust roots on the apiserver are used.
  **/
  private byte[] caBundle = null;

  @ApiModelProperty(value = "Group is the API group name this server hosts")
 /**
   * Group is the API group name this server hosts
  **/
  private String group = null;

  @ApiModelProperty(required = true, value = "GroupPriorityMininum is the priority this group should have at least. Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We'd recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s")
 /**
   * GroupPriorityMininum is the priority this group should have at least. Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We'd recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
  **/
  private Integer groupPriorityMinimum = null;

  @ApiModelProperty(value = "InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly discouraged.  You should use the CABundle instead.")
 /**
   * InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly discouraged.  You should use the CABundle instead.
  **/
  private Boolean insecureSkipTLSVerify = null;

  @ApiModelProperty(value = "Service is a reference to the service for this API server.  It must communicate on port 443 If the Service is nil, that means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the normal handler chain to be fulfilled.")
  @Valid
 /**
   * Service is a reference to the service for this API server.  It must communicate on port 443 If the Service is nil, that means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the normal handler chain to be fulfilled.
  **/
  private IoK8sKubeAggregatorPkgApisApiregistrationV1beta1ServiceReference service = null;

  @ApiModelProperty(value = "Version is the API version this server hosts.  For example, \"v1\"")
 /**
   * Version is the API version this server hosts.  For example, \"v1\"
  **/
  private String version = null;

  @ApiModelProperty(required = true, value = "VersionPriority controls the ordering of this API version inside of its group.  Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it's inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is \"kube-like\", it will sort above non \"kube-like\" version strings, which are ordered lexicographically. \"Kube-like\" versions start with a \"v\", then are followed by a number (the major version), then optionally the string \"alpha\" or \"beta\" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.")
 /**
   * VersionPriority controls the ordering of this API version inside of its group.  Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it's inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is \"kube-like\", it will sort above non \"kube-like\" version strings, which are ordered lexicographically. \"Kube-like\" versions start with a \"v\", then are followed by a number (the major version), then optionally the string \"alpha\" or \"beta\" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
  **/
  private Integer versionPriority = null;
 /**
   * CABundle is a PEM encoded CA bundle which will be used to validate an API server&#39;s serving certificate. If unspecified, system trust roots on the apiserver are used.
   * @return caBundle
  **/
  @JsonProperty("caBundle")
 @Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")  public byte[] getCaBundle() {
    return caBundle;
  }

  public void setCaBundle(byte[] caBundle) {
    this.caBundle = caBundle;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceSpec caBundle(byte[] caBundle) {
    this.caBundle = caBundle;
    return this;
  }

 /**
   * Group is the API group name this server hosts
   * @return group
  **/
  @JsonProperty("group")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceSpec group(String group) {
    this.group = group;
    return this;
  }

 /**
   * GroupPriorityMininum is the priority this group should have at least. Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We&#39;d recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
   * @return groupPriorityMinimum
  **/
  @JsonProperty("groupPriorityMinimum")
  @NotNull
  public Integer getGroupPriorityMinimum() {
    return groupPriorityMinimum;
  }

  public void setGroupPriorityMinimum(Integer groupPriorityMinimum) {
    this.groupPriorityMinimum = groupPriorityMinimum;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceSpec groupPriorityMinimum(Integer groupPriorityMinimum) {
    this.groupPriorityMinimum = groupPriorityMinimum;
    return this;
  }

 /**
   * InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly discouraged.  You should use the CABundle instead.
   * @return insecureSkipTLSVerify
  **/
  @JsonProperty("insecureSkipTLSVerify")
  public Boolean isInsecureSkipTLSVerify() {
    return insecureSkipTLSVerify;
  }

  public void setInsecureSkipTLSVerify(Boolean insecureSkipTLSVerify) {
    this.insecureSkipTLSVerify = insecureSkipTLSVerify;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceSpec insecureSkipTLSVerify(Boolean insecureSkipTLSVerify) {
    this.insecureSkipTLSVerify = insecureSkipTLSVerify;
    return this;
  }

 /**
   * Service is a reference to the service for this API server.  It must communicate on port 443 If the Service is nil, that means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the normal handler chain to be fulfilled.
   * @return service
  **/
  @JsonProperty("service")
  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1ServiceReference getService() {
    return service;
  }

  public void setService(IoK8sKubeAggregatorPkgApisApiregistrationV1beta1ServiceReference service) {
    this.service = service;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceSpec service(IoK8sKubeAggregatorPkgApisApiregistrationV1beta1ServiceReference service) {
    this.service = service;
    return this;
  }

 /**
   * Version is the API version this server hosts.  For example, \&quot;v1\&quot;
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceSpec version(String version) {
    this.version = version;
    return this;
  }

 /**
   * VersionPriority controls the ordering of this API version inside of its group.  Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it&#39;s inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is \&quot;kube-like\&quot;, it will sort above non \&quot;kube-like\&quot; version strings, which are ordered lexicographically. \&quot;Kube-like\&quot; versions start with a \&quot;v\&quot;, then are followed by a number (the major version), then optionally the string \&quot;alpha\&quot; or \&quot;beta\&quot; and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
   * @return versionPriority
  **/
  @JsonProperty("versionPriority")
  @NotNull
  public Integer getVersionPriority() {
    return versionPriority;
  }

  public void setVersionPriority(Integer versionPriority) {
    this.versionPriority = versionPriority;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceSpec versionPriority(Integer versionPriority) {
    this.versionPriority = versionPriority;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceSpec {\n");
    
    sb.append("    caBundle: ").append(toIndentedString(caBundle)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    groupPriorityMinimum: ").append(toIndentedString(groupPriorityMinimum)).append("\n");
    sb.append("    insecureSkipTLSVerify: ").append(toIndentedString(insecureSkipTLSVerify)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionPriority: ").append(toIndentedString(versionPriority)).append("\n");
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

