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
  * ResourceRule is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
 **/
@ApiModel(description="ResourceRule is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.")
public class IoK8sApiAuthorizationV1beta1ResourceRule  {
  
  @ApiModelProperty(value = "APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.  \"*\" means all.")
 /**
   * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.  \"*\" means all.
  **/
  private List<String> apiGroups = null;

  @ApiModelProperty(value = "ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  \"*\" means all.")
 /**
   * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  \"*\" means all.
  **/
  private List<String> resourceNames = null;

  @ApiModelProperty(value = "Resources is a list of resources this rule applies to.  \"*\" means all in the specified apiGroups.  \"*_/foo\" represents the subresource 'foo' for all resources in the specified apiGroups.")
 /**
   * Resources is a list of resources this rule applies to.  \"*\" means all in the specified apiGroups.  \"*_/foo\" represents the subresource 'foo' for all resources in the specified apiGroups.
  **/
  private List<String> resources = null;

  @ApiModelProperty(required = true, value = "Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  \"*\" means all.")
 /**
   * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  \"*\" means all.
  **/
  private List<String> verbs = new ArrayList<String>();
 /**
   * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.  \&quot;*\&quot; means all.
   * @return apiGroups
  **/
  @JsonProperty("apiGroups")
  public List<String> getApiGroups() {
    return apiGroups;
  }

  public void setApiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
  }

  public IoK8sApiAuthorizationV1beta1ResourceRule apiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
    return this;
  }

  public IoK8sApiAuthorizationV1beta1ResourceRule addApiGroupsItem(String apiGroupsItem) {
    this.apiGroups.add(apiGroupsItem);
    return this;
  }

 /**
   * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  \&quot;*\&quot; means all.
   * @return resourceNames
  **/
  @JsonProperty("resourceNames")
  public List<String> getResourceNames() {
    return resourceNames;
  }

  public void setResourceNames(List<String> resourceNames) {
    this.resourceNames = resourceNames;
  }

  public IoK8sApiAuthorizationV1beta1ResourceRule resourceNames(List<String> resourceNames) {
    this.resourceNames = resourceNames;
    return this;
  }

  public IoK8sApiAuthorizationV1beta1ResourceRule addResourceNamesItem(String resourceNamesItem) {
    this.resourceNames.add(resourceNamesItem);
    return this;
  }

 /**
   * Resources is a list of resources this rule applies to.  \&quot;*\&quot; means all in the specified apiGroups.  \&quot;*_/foo\&quot; represents the subresource &#39;foo&#39; for all resources in the specified apiGroups.
   * @return resources
  **/
  @JsonProperty("resources")
  public List<String> getResources() {
    return resources;
  }

  public void setResources(List<String> resources) {
    this.resources = resources;
  }

  public IoK8sApiAuthorizationV1beta1ResourceRule resources(List<String> resources) {
    this.resources = resources;
    return this;
  }

  public IoK8sApiAuthorizationV1beta1ResourceRule addResourcesItem(String resourcesItem) {
    this.resources.add(resourcesItem);
    return this;
  }

 /**
   * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  \&quot;*\&quot; means all.
   * @return verbs
  **/
  @JsonProperty("verbs")
  @NotNull
  public List<String> getVerbs() {
    return verbs;
  }

  public void setVerbs(List<String> verbs) {
    this.verbs = verbs;
  }

  public IoK8sApiAuthorizationV1beta1ResourceRule verbs(List<String> verbs) {
    this.verbs = verbs;
    return this;
  }

  public IoK8sApiAuthorizationV1beta1ResourceRule addVerbsItem(String verbsItem) {
    this.verbs.add(verbsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthorizationV1beta1ResourceRule {\n");
    
    sb.append("    apiGroups: ").append(toIndentedString(apiGroups)).append("\n");
    sb.append("    resourceNames: ").append(toIndentedString(resourceNames)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    verbs: ").append(toIndentedString(verbs)).append("\n");
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

