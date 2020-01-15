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
  * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure that all the tuple expansions are valid.
 **/
@ApiModel(description="RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure that all the tuple expansions are valid.")
public class IoK8sApiAdmissionregistrationV1beta1RuleWithOperations  {
  
  @ApiModelProperty(value = "APIGroups is the API groups the resources belong to. '*' is all groups. If '*' is present, the length of the slice must be one. Required.")
 /**
   * APIGroups is the API groups the resources belong to. '*' is all groups. If '*' is present, the length of the slice must be one. Required.
  **/
  private List<String> apiGroups = null;

  @ApiModelProperty(value = "APIVersions is the API versions the resources belong to. '*' is all versions. If '*' is present, the length of the slice must be one. Required.")
 /**
   * APIVersions is the API versions the resources belong to. '*' is all versions. If '*' is present, the length of the slice must be one. Required.
  **/
  private List<String> apiVersions = null;

  @ApiModelProperty(value = "Operations is the operations the admission hook cares about - CREATE, UPDATE, or * for all operations. If '*' is present, the length of the slice must be one. Required.")
 /**
   * Operations is the operations the admission hook cares about - CREATE, UPDATE, or * for all operations. If '*' is present, the length of the slice must be one. Required.
  **/
  private List<String> operations = null;

  @ApiModelProperty(value = "Resources is a list of resources this rule applies to.  For example: 'pods' means pods. 'pods/log' means the log subresource of pods. '*' means all resources, but not subresources. 'pods/_*' means all subresources of pods. '*_/scale' means all scale subresources. '*_/_*' means all resources and their subresources.  If wildcard is present, the validation rule will ensure resources do not overlap with each other.  Depending on the enclosing object, subresources might not be allowed. Required.")
 /**
   * Resources is a list of resources this rule applies to.  For example: 'pods' means pods. 'pods/log' means the log subresource of pods. '*' means all resources, but not subresources. 'pods/_*' means all subresources of pods. '*_/scale' means all scale subresources. '*_/_*' means all resources and their subresources.  If wildcard is present, the validation rule will ensure resources do not overlap with each other.  Depending on the enclosing object, subresources might not be allowed. Required.
  **/
  private List<String> resources = null;

  @ApiModelProperty(value = "scope specifies the scope of this rule. Valid values are \"Cluster\", \"Namespaced\", and \"*\" \"Cluster\" means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. \"Namespaced\" means that only namespaced resources will match this rule. \"*\" means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is \"*\".")
 /**
   * scope specifies the scope of this rule. Valid values are \"Cluster\", \"Namespaced\", and \"*\" \"Cluster\" means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. \"Namespaced\" means that only namespaced resources will match this rule. \"*\" means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is \"*\".
  **/
  private String scope = null;
 /**
   * APIGroups is the API groups the resources belong to. &#39;*&#39; is all groups. If &#39;*&#39; is present, the length of the slice must be one. Required.
   * @return apiGroups
  **/
  @JsonProperty("apiGroups")
  public List<String> getApiGroups() {
    return apiGroups;
  }

  public void setApiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
  }

  public IoK8sApiAdmissionregistrationV1beta1RuleWithOperations apiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
    return this;
  }

  public IoK8sApiAdmissionregistrationV1beta1RuleWithOperations addApiGroupsItem(String apiGroupsItem) {
    this.apiGroups.add(apiGroupsItem);
    return this;
  }

 /**
   * APIVersions is the API versions the resources belong to. &#39;*&#39; is all versions. If &#39;*&#39; is present, the length of the slice must be one. Required.
   * @return apiVersions
  **/
  @JsonProperty("apiVersions")
  public List<String> getApiVersions() {
    return apiVersions;
  }

  public void setApiVersions(List<String> apiVersions) {
    this.apiVersions = apiVersions;
  }

  public IoK8sApiAdmissionregistrationV1beta1RuleWithOperations apiVersions(List<String> apiVersions) {
    this.apiVersions = apiVersions;
    return this;
  }

  public IoK8sApiAdmissionregistrationV1beta1RuleWithOperations addApiVersionsItem(String apiVersionsItem) {
    this.apiVersions.add(apiVersionsItem);
    return this;
  }

 /**
   * Operations is the operations the admission hook cares about - CREATE, UPDATE, or * for all operations. If &#39;*&#39; is present, the length of the slice must be one. Required.
   * @return operations
  **/
  @JsonProperty("operations")
  public List<String> getOperations() {
    return operations;
  }

  public void setOperations(List<String> operations) {
    this.operations = operations;
  }

  public IoK8sApiAdmissionregistrationV1beta1RuleWithOperations operations(List<String> operations) {
    this.operations = operations;
    return this;
  }

  public IoK8sApiAdmissionregistrationV1beta1RuleWithOperations addOperationsItem(String operationsItem) {
    this.operations.add(operationsItem);
    return this;
  }

 /**
   * Resources is a list of resources this rule applies to.  For example: &#39;pods&#39; means pods. &#39;pods/log&#39; means the log subresource of pods. &#39;*&#39; means all resources, but not subresources. &#39;pods/_*&#39; means all subresources of pods. &#39;*_/scale&#39; means all scale subresources. &#39;*_/_*&#39; means all resources and their subresources.  If wildcard is present, the validation rule will ensure resources do not overlap with each other.  Depending on the enclosing object, subresources might not be allowed. Required.
   * @return resources
  **/
  @JsonProperty("resources")
  public List<String> getResources() {
    return resources;
  }

  public void setResources(List<String> resources) {
    this.resources = resources;
  }

  public IoK8sApiAdmissionregistrationV1beta1RuleWithOperations resources(List<String> resources) {
    this.resources = resources;
    return this;
  }

  public IoK8sApiAdmissionregistrationV1beta1RuleWithOperations addResourcesItem(String resourcesItem) {
    this.resources.add(resourcesItem);
    return this;
  }

 /**
   * scope specifies the scope of this rule. Valid values are \&quot;Cluster\&quot;, \&quot;Namespaced\&quot;, and \&quot;*\&quot; \&quot;Cluster\&quot; means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. \&quot;Namespaced\&quot; means that only namespaced resources will match this rule. \&quot;*\&quot; means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is \&quot;*\&quot;.
   * @return scope
  **/
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public IoK8sApiAdmissionregistrationV1beta1RuleWithOperations scope(String scope) {
    this.scope = scope;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAdmissionregistrationV1beta1RuleWithOperations {\n");
    
    sb.append("    apiGroups: ").append(toIndentedString(apiGroups)).append("\n");
    sb.append("    apiVersions: ").append(toIndentedString(apiVersions)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

