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
  * ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface
 **/
@ApiModel(description="ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface")
public class IoK8sApiAuthorizationV1ResourceAttributes  {
  
  @ApiModelProperty(value = "Group is the API Group of the Resource.  \"*\" means all.")
 /**
   * Group is the API Group of the Resource.  \"*\" means all.
  **/
  private String group = null;

  @ApiModelProperty(value = "Name is the name of the resource being requested for a \"get\" or deleted for a \"delete\". \"\" (empty) means all.")
 /**
   * Name is the name of the resource being requested for a \"get\" or deleted for a \"delete\". \"\" (empty) means all.
  **/
  private String name = null;

  @ApiModelProperty(value = "Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces \"\" (empty) is defaulted for LocalSubjectAccessReviews \"\" (empty) is empty for cluster-scoped resources \"\" (empty) means \"all\" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview")
 /**
   * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces \"\" (empty) is defaulted for LocalSubjectAccessReviews \"\" (empty) is empty for cluster-scoped resources \"\" (empty) means \"all\" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
  **/
  private String namespace = null;

  @ApiModelProperty(value = "Resource is one of the existing resource types.  \"*\" means all.")
 /**
   * Resource is one of the existing resource types.  \"*\" means all.
  **/
  private String resource = null;

  @ApiModelProperty(value = "Subresource is one of the existing resource types.  \"\" means none.")
 /**
   * Subresource is one of the existing resource types.  \"\" means none.
  **/
  private String subresource = null;

  @ApiModelProperty(value = "Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  \"*\" means all.")
 /**
   * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  \"*\" means all.
  **/
  private String verb = null;

  @ApiModelProperty(value = "Version is the API Version of the Resource.  \"*\" means all.")
 /**
   * Version is the API Version of the Resource.  \"*\" means all.
  **/
  private String version = null;
 /**
   * Group is the API Group of the Resource.  \&quot;*\&quot; means all.
   * @return group
  **/
  @JsonProperty("group")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public IoK8sApiAuthorizationV1ResourceAttributes group(String group) {
    this.group = group;
    return this;
  }

 /**
   * Name is the name of the resource being requested for a \&quot;get\&quot; or deleted for a \&quot;delete\&quot;. \&quot;\&quot; (empty) means all.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiAuthorizationV1ResourceAttributes name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces \&quot;\&quot; (empty) is defaulted for LocalSubjectAccessReviews \&quot;\&quot; (empty) is empty for cluster-scoped resources \&quot;\&quot; (empty) means \&quot;all\&quot; for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
   * @return namespace
  **/
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public IoK8sApiAuthorizationV1ResourceAttributes namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

 /**
   * Resource is one of the existing resource types.  \&quot;*\&quot; means all.
   * @return resource
  **/
  @JsonProperty("resource")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public IoK8sApiAuthorizationV1ResourceAttributes resource(String resource) {
    this.resource = resource;
    return this;
  }

 /**
   * Subresource is one of the existing resource types.  \&quot;\&quot; means none.
   * @return subresource
  **/
  @JsonProperty("subresource")
  public String getSubresource() {
    return subresource;
  }

  public void setSubresource(String subresource) {
    this.subresource = subresource;
  }

  public IoK8sApiAuthorizationV1ResourceAttributes subresource(String subresource) {
    this.subresource = subresource;
    return this;
  }

 /**
   * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  \&quot;*\&quot; means all.
   * @return verb
  **/
  @JsonProperty("verb")
  public String getVerb() {
    return verb;
  }

  public void setVerb(String verb) {
    this.verb = verb;
  }

  public IoK8sApiAuthorizationV1ResourceAttributes verb(String verb) {
    this.verb = verb;
    return this;
  }

 /**
   * Version is the API Version of the Resource.  \&quot;*\&quot; means all.
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public IoK8sApiAuthorizationV1ResourceAttributes version(String version) {
    this.version = version;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthorizationV1ResourceAttributes {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    subresource: ").append(toIndentedString(subresource)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

