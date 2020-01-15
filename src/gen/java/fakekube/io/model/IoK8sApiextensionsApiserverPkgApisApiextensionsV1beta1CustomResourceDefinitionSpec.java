package fakekube.io.model;

import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition;
import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceConversion;
import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames;
import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionVersion;
import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceSubresources;
import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceValidation;
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
  * CustomResourceDefinitionSpec describes how a user wants their resource to appear
 **/
@ApiModel(description="CustomResourceDefinitionSpec describes how a user wants their resource to appear")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec  {
  
  @ApiModelProperty(value = "additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If present, this field configures columns for all versions. Top-level and per-version columns are mutually exclusive. If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used.")
  @Valid
 /**
   * additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If present, this field configures columns for all versions. Top-level and per-version columns are mutually exclusive. If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used.
  **/
  private List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition> additionalPrinterColumns = null;

  @ApiModelProperty(value = "conversion defines conversion settings for the CRD.")
  @Valid
 /**
   * conversion defines conversion settings for the CRD.
  **/
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceConversion conversion = null;

  @ApiModelProperty(required = true, value = "group is the API group of the defined custom resource. The custom resources are served under `/apis/<group>/...`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`).")
 /**
   * group is the API group of the defined custom resource. The custom resources are served under `/apis/<group>/...`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`).
  **/
  private String group = null;

  @ApiModelProperty(required = true, value = "names specify the resource and kind names for the custom resource.")
  @Valid
 /**
   * names specify the resource and kind names for the custom resource.
  **/
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames names = null;

  @ApiModelProperty(value = "preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage. apiVersion, kind, metadata and known fields inside metadata are always preserved. If false, schemas must be defined for all versions. Defaults to true in v1beta for backwards compatibility. Deprecated: will be required to be false in v1. Preservation of unknown fields can be specified in the validation schema using the `x-kubernetes-preserve-unknown-fields: true` extension. See https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields for details.")
 /**
   * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage. apiVersion, kind, metadata and known fields inside metadata are always preserved. If false, schemas must be defined for all versions. Defaults to true in v1beta for backwards compatibility. Deprecated: will be required to be false in v1. Preservation of unknown fields can be specified in the validation schema using the `x-kubernetes-preserve-unknown-fields: true` extension. See https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields for details.
  **/
  private Boolean preserveUnknownFields = null;

  @ApiModelProperty(required = true, value = "scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed values are `Cluster` and `Namespaced`. Default is `Namespaced`.")
 /**
   * scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed values are `Cluster` and `Namespaced`. Default is `Namespaced`.
  **/
  private String scope = null;

  @ApiModelProperty(value = "subresources specify what subresources the defined custom resource has. If present, this field configures subresources for all versions. Top-level and per-version subresources are mutually exclusive.")
  @Valid
 /**
   * subresources specify what subresources the defined custom resource has. If present, this field configures subresources for all versions. Top-level and per-version subresources are mutually exclusive.
  **/
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceSubresources subresources = null;

  @ApiModelProperty(value = "validation describes the schema used for validation and pruning of the custom resource. If present, this validation schema is used to validate all versions. Top-level and per-version schemas are mutually exclusive.")
  @Valid
 /**
   * validation describes the schema used for validation and pruning of the custom resource. If present, this validation schema is used to validate all versions. Top-level and per-version schemas are mutually exclusive.
  **/
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceValidation validation = null;

  @ApiModelProperty(value = "version is the API version of the defined custom resource. The custom resources are served under `/apis/<group>/<version>/...`. Must match the name of the first item in the `versions` list if `version` and `versions` are both specified. Optional if `versions` is specified. Deprecated: use `versions` instead.")
 /**
   * version is the API version of the defined custom resource. The custom resources are served under `/apis/<group>/<version>/...`. Must match the name of the first item in the `versions` list if `version` and `versions` are both specified. Optional if `versions` is specified. Deprecated: use `versions` instead.
  **/
  private String version = null;

  @ApiModelProperty(value = "versions is the list of all API versions of the defined custom resource. Optional if `version` is specified. The name of the first item in the `versions` list must match the `version` field if `version` and `versions` are both specified. Version names are used to compute the order in which served versions are listed in API discovery. If the version string is \"kube-like\", it will sort above non \"kube-like\" version strings, which are ordered lexicographically. \"Kube-like\" versions start with a \"v\", then are followed by a number (the major version), then optionally the string \"alpha\" or \"beta\" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.")
  @Valid
 /**
   * versions is the list of all API versions of the defined custom resource. Optional if `version` is specified. The name of the first item in the `versions` list must match the `version` field if `version` and `versions` are both specified. Version names are used to compute the order in which served versions are listed in API discovery. If the version string is \"kube-like\", it will sort above non \"kube-like\" version strings, which are ordered lexicographically. \"Kube-like\" versions start with a \"v\", then are followed by a number (the major version), then optionally the string \"alpha\" or \"beta\" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
  **/
  private List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionVersion> versions = null;
 /**
   * additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If present, this field configures columns for all versions. Top-level and per-version columns are mutually exclusive. If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used.
   * @return additionalPrinterColumns
  **/
  @JsonProperty("additionalPrinterColumns")
  public List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
    return additionalPrinterColumns;
  }

  public void setAdditionalPrinterColumns(List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition> additionalPrinterColumns) {
    this.additionalPrinterColumns = additionalPrinterColumns;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec additionalPrinterColumns(List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition> additionalPrinterColumns) {
    this.additionalPrinterColumns = additionalPrinterColumns;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec addAdditionalPrinterColumnsItem(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition additionalPrinterColumnsItem) {
    this.additionalPrinterColumns.add(additionalPrinterColumnsItem);
    return this;
  }

 /**
   * conversion defines conversion settings for the CRD.
   * @return conversion
  **/
  @JsonProperty("conversion")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceConversion getConversion() {
    return conversion;
  }

  public void setConversion(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceConversion conversion) {
    this.conversion = conversion;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec conversion(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceConversion conversion) {
    this.conversion = conversion;
    return this;
  }

 /**
   * group is the API group of the defined custom resource. The custom resources are served under &#x60;/apis/&lt;group&gt;/...&#x60;. Must match the name of the CustomResourceDefinition (in the form &#x60;&lt;names.plural&gt;.&lt;group&gt;&#x60;).
   * @return group
  **/
  @JsonProperty("group")
  @NotNull
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec group(String group) {
    this.group = group;
    return this;
  }

 /**
   * names specify the resource and kind names for the custom resource.
   * @return names
  **/
  @JsonProperty("names")
  @NotNull
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames getNames() {
    return names;
  }

  public void setNames(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames names) {
    this.names = names;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec names(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames names) {
    this.names = names;
    return this;
  }

 /**
   * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage. apiVersion, kind, metadata and known fields inside metadata are always preserved. If false, schemas must be defined for all versions. Defaults to true in v1beta for backwards compatibility. Deprecated: will be required to be false in v1. Preservation of unknown fields can be specified in the validation schema using the &#x60;x-kubernetes-preserve-unknown-fields: true&#x60; extension. See https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields for details.
   * @return preserveUnknownFields
  **/
  @JsonProperty("preserveUnknownFields")
  public Boolean isPreserveUnknownFields() {
    return preserveUnknownFields;
  }

  public void setPreserveUnknownFields(Boolean preserveUnknownFields) {
    this.preserveUnknownFields = preserveUnknownFields;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec preserveUnknownFields(Boolean preserveUnknownFields) {
    this.preserveUnknownFields = preserveUnknownFields;
    return this;
  }

 /**
   * scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed values are &#x60;Cluster&#x60; and &#x60;Namespaced&#x60;. Default is &#x60;Namespaced&#x60;.
   * @return scope
  **/
  @JsonProperty("scope")
  @NotNull
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec scope(String scope) {
    this.scope = scope;
    return this;
  }

 /**
   * subresources specify what subresources the defined custom resource has. If present, this field configures subresources for all versions. Top-level and per-version subresources are mutually exclusive.
   * @return subresources
  **/
  @JsonProperty("subresources")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceSubresources getSubresources() {
    return subresources;
  }

  public void setSubresources(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceSubresources subresources) {
    this.subresources = subresources;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec subresources(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceSubresources subresources) {
    this.subresources = subresources;
    return this;
  }

 /**
   * validation describes the schema used for validation and pruning of the custom resource. If present, this validation schema is used to validate all versions. Top-level and per-version schemas are mutually exclusive.
   * @return validation
  **/
  @JsonProperty("validation")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceValidation getValidation() {
    return validation;
  }

  public void setValidation(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceValidation validation) {
    this.validation = validation;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec validation(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceValidation validation) {
    this.validation = validation;
    return this;
  }

 /**
   * version is the API version of the defined custom resource. The custom resources are served under &#x60;/apis/&lt;group&gt;/&lt;version&gt;/...&#x60;. Must match the name of the first item in the &#x60;versions&#x60; list if &#x60;version&#x60; and &#x60;versions&#x60; are both specified. Optional if &#x60;versions&#x60; is specified. Deprecated: use &#x60;versions&#x60; instead.
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec version(String version) {
    this.version = version;
    return this;
  }

 /**
   * versions is the list of all API versions of the defined custom resource. Optional if &#x60;version&#x60; is specified. The name of the first item in the &#x60;versions&#x60; list must match the &#x60;version&#x60; field if &#x60;version&#x60; and &#x60;versions&#x60; are both specified. Version names are used to compute the order in which served versions are listed in API discovery. If the version string is \&quot;kube-like\&quot;, it will sort above non \&quot;kube-like\&quot; version strings, which are ordered lexicographically. \&quot;Kube-like\&quot; versions start with a \&quot;v\&quot;, then are followed by a number (the major version), then optionally the string \&quot;alpha\&quot; or \&quot;beta\&quot; and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
   * @return versions
  **/
  @JsonProperty("versions")
  public List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionVersion> getVersions() {
    return versions;
  }

  public void setVersions(List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionVersion> versions) {
    this.versions = versions;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec versions(List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionVersion> versions) {
    this.versions = versions;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec addVersionsItem(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionVersion versionsItem) {
    this.versions.add(versionsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec {\n");
    
    sb.append("    additionalPrinterColumns: ").append(toIndentedString(additionalPrinterColumns)).append("\n");
    sb.append("    conversion: ").append(toIndentedString(conversion)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    preserveUnknownFields: ").append(toIndentedString(preserveUnknownFields)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    subresources: ").append(toIndentedString(subresources)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

