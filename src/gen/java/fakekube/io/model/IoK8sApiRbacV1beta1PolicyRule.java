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
  * PolicyRule holds information that describes a policy rule, but does not contain information about who the rule applies to or which namespace the rule applies to.
 **/
@ApiModel(description="PolicyRule holds information that describes a policy rule, but does not contain information about who the rule applies to or which namespace the rule applies to.")
public class IoK8sApiRbacV1beta1PolicyRule  {
  
  @ApiModelProperty(value = "APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.")
 /**
   * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
  **/
  private List<String> apiGroups = null;

  @ApiModelProperty(value = "NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as \"pods\" or \"secrets\") or non-resource URL paths (such as \"/api\"),  but not both.")
 /**
   * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as \"pods\" or \"secrets\") or non-resource URL paths (such as \"/api\"),  but not both.
  **/
  private List<String> nonResourceURLs = null;

  @ApiModelProperty(value = "ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.")
 /**
   * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
  **/
  private List<String> resourceNames = null;

  @ApiModelProperty(value = "Resources is a list of resources this rule applies to.  '*' represents all resources in the specified apiGroups. '*_/foo' represents the subresource 'foo' for all resources in the specified apiGroups.")
 /**
   * Resources is a list of resources this rule applies to.  '*' represents all resources in the specified apiGroups. '*_/foo' represents the subresource 'foo' for all resources in the specified apiGroups.
  **/
  private List<String> resources = null;

  @ApiModelProperty(required = true, value = "Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds.")
 /**
   * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds.
  **/
  private List<String> verbs = new ArrayList<String>();
 /**
   * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
   * @return apiGroups
  **/
  @JsonProperty("apiGroups")
  public List<String> getApiGroups() {
    return apiGroups;
  }

  public void setApiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
  }

  public IoK8sApiRbacV1beta1PolicyRule apiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
    return this;
  }

  public IoK8sApiRbacV1beta1PolicyRule addApiGroupsItem(String apiGroupsItem) {
    this.apiGroups.add(apiGroupsItem);
    return this;
  }

 /**
   * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as \&quot;pods\&quot; or \&quot;secrets\&quot;) or non-resource URL paths (such as \&quot;/api\&quot;),  but not both.
   * @return nonResourceURLs
  **/
  @JsonProperty("nonResourceURLs")
  public List<String> getNonResourceURLs() {
    return nonResourceURLs;
  }

  public void setNonResourceURLs(List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
  }

  public IoK8sApiRbacV1beta1PolicyRule nonResourceURLs(List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
    return this;
  }

  public IoK8sApiRbacV1beta1PolicyRule addNonResourceURLsItem(String nonResourceURLsItem) {
    this.nonResourceURLs.add(nonResourceURLsItem);
    return this;
  }

 /**
   * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
   * @return resourceNames
  **/
  @JsonProperty("resourceNames")
  public List<String> getResourceNames() {
    return resourceNames;
  }

  public void setResourceNames(List<String> resourceNames) {
    this.resourceNames = resourceNames;
  }

  public IoK8sApiRbacV1beta1PolicyRule resourceNames(List<String> resourceNames) {
    this.resourceNames = resourceNames;
    return this;
  }

  public IoK8sApiRbacV1beta1PolicyRule addResourceNamesItem(String resourceNamesItem) {
    this.resourceNames.add(resourceNamesItem);
    return this;
  }

 /**
   * Resources is a list of resources this rule applies to.  &#39;*&#39; represents all resources in the specified apiGroups. &#39;*_/foo&#39; represents the subresource &#39;foo&#39; for all resources in the specified apiGroups.
   * @return resources
  **/
  @JsonProperty("resources")
  public List<String> getResources() {
    return resources;
  }

  public void setResources(List<String> resources) {
    this.resources = resources;
  }

  public IoK8sApiRbacV1beta1PolicyRule resources(List<String> resources) {
    this.resources = resources;
    return this;
  }

  public IoK8sApiRbacV1beta1PolicyRule addResourcesItem(String resourcesItem) {
    this.resources.add(resourcesItem);
    return this;
  }

 /**
   * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds.
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

  public IoK8sApiRbacV1beta1PolicyRule verbs(List<String> verbs) {
    this.verbs = verbs;
    return this;
  }

  public IoK8sApiRbacV1beta1PolicyRule addVerbsItem(String verbsItem) {
    this.verbs.add(verbsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiRbacV1beta1PolicyRule {\n");
    
    sb.append("    apiGroups: ").append(toIndentedString(apiGroups)).append("\n");
    sb.append("    nonResourceURLs: ").append(toIndentedString(nonResourceURLs)).append("\n");
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

