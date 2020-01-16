package fakekube.io.model;

import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition;
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
  * CustomResourceDefinitionVersion describes a version for CRD.
 **/
@ApiModel(description="CustomResourceDefinitionVersion describes a version for CRD.")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionVersion  {
  
  @ApiModelProperty(value = "additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. Top-level and per-version columns are mutually exclusive. Per-version columns must not all be set to identical values (top-level columns should be used instead). If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used.")
  @Valid
 /**
   * additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. Top-level and per-version columns are mutually exclusive. Per-version columns must not all be set to identical values (top-level columns should be used instead). If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used.
  **/
  private List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition> additionalPrinterColumns = null;

  @ApiModelProperty(required = true, value = "name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at `/apis/<group>/<version>/...` if `served` is true.")
 /**
   * name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at `/apis/<group>/<version>/...` if `served` is true.
  **/
  private String name = null;

  @ApiModelProperty(value = "schema describes the schema used for validation and pruning of this version of the custom resource. Top-level and per-version schemas are mutually exclusive. Per-version schemas must not all be set to identical values (top-level validation schema should be used instead).")
  @Valid
 /**
   * schema describes the schema used for validation and pruning of this version of the custom resource. Top-level and per-version schemas are mutually exclusive. Per-version schemas must not all be set to identical values (top-level validation schema should be used instead).
  **/
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceValidation schema = null;

  @ApiModelProperty(required = true, value = "served is a flag enabling/disabling this version from being served via REST APIs")
 /**
   * served is a flag enabling/disabling this version from being served via REST APIs
  **/
  private Boolean served = null;

  @ApiModelProperty(required = true, value = "storage indicates this version should be used when persisting custom resources to storage. There must be exactly one version with storage=true.")
 /**
   * storage indicates this version should be used when persisting custom resources to storage. There must be exactly one version with storage=true.
  **/
  private Boolean storage = null;

  @ApiModelProperty(value = "subresources specify what subresources this version of the defined custom resource have. Top-level and per-version subresources are mutually exclusive. Per-version subresources must not all be set to identical values (top-level subresources should be used instead).")
  @Valid
 /**
   * subresources specify what subresources this version of the defined custom resource have. Top-level and per-version subresources are mutually exclusive. Per-version subresources must not all be set to identical values (top-level subresources should be used instead).
  **/
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceSubresources subresources = null;
 /**
   * additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. Top-level and per-version columns are mutually exclusive. Per-version columns must not all be set to identical values (top-level columns should be used instead). If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used.
   * @return additionalPrinterColumns
  **/
  @JsonProperty("additionalPrinterColumns")
  public List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
    return additionalPrinterColumns;
  }

  public void setAdditionalPrinterColumns(List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition> additionalPrinterColumns) {
    this.additionalPrinterColumns = additionalPrinterColumns;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionVersion additionalPrinterColumns(List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition> additionalPrinterColumns) {
    this.additionalPrinterColumns = additionalPrinterColumns;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionVersion addAdditionalPrinterColumnsItem(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceColumnDefinition additionalPrinterColumnsItem) {
    this.additionalPrinterColumns.add(additionalPrinterColumnsItem);
    return this;
  }

 /**
   * name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at &#x60;/apis/&lt;group&gt;/&lt;version&gt;/...&#x60; if &#x60;served&#x60; is true.
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

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionVersion name(String name) {
    this.name = name;
    return this;
  }

 /**
   * schema describes the schema used for validation and pruning of this version of the custom resource. Top-level and per-version schemas are mutually exclusive. Per-version schemas must not all be set to identical values (top-level validation schema should be used instead).
   * @return schema
  **/
  @JsonProperty("schema")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceValidation getSchema() {
    return schema;
  }

  public void setSchema(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceValidation schema) {
    this.schema = schema;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionVersion schema(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceValidation schema) {
    this.schema = schema;
    return this;
  }

 /**
   * served is a flag enabling/disabling this version from being served via REST APIs
   * @return served
  **/
  @JsonProperty("served")
  @NotNull
  public Boolean getServed() {
    return served;
  }

  public void setServed(Boolean served) {
    this.served = served;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionVersion served(Boolean served) {
    this.served = served;
    return this;
  }

 /**
   * storage indicates this version should be used when persisting custom resources to storage. There must be exactly one version with storage&#x3D;true.
   * @return storage
  **/
  @JsonProperty("storage")
  @NotNull
  public Boolean getStorage() {
    return storage;
  }

  public void setStorage(Boolean storage) {
    this.storage = storage;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionVersion storage(Boolean storage) {
    this.storage = storage;
    return this;
  }

 /**
   * subresources specify what subresources this version of the defined custom resource have. Top-level and per-version subresources are mutually exclusive. Per-version subresources must not all be set to identical values (top-level subresources should be used instead).
   * @return subresources
  **/
  @JsonProperty("subresources")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceSubresources getSubresources() {
    return subresources;
  }

  public void setSubresources(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceSubresources subresources) {
    this.subresources = subresources;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionVersion subresources(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceSubresources subresources) {
    this.subresources = subresources;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionVersion {\n");
    
    sb.append("    additionalPrinterColumns: ").append(toIndentedString(additionalPrinterColumns)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    served: ").append(toIndentedString(served)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    subresources: ").append(toIndentedString(subresources)).append("\n");
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

