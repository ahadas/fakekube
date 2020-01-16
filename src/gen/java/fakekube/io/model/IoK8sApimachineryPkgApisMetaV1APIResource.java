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
  * APIResource specifies the name of a resource and whether it is namespaced.
 **/
@ApiModel(description="APIResource specifies the name of a resource and whether it is namespaced.")
public class IoK8sApimachineryPkgApisMetaV1APIResource  {
  
  @ApiModelProperty(value = "categories is a list of the grouped resources this resource belongs to (e.g. 'all')")
 /**
   * categories is a list of the grouped resources this resource belongs to (e.g. 'all')
  **/
  private List<String> categories = null;

  @ApiModelProperty(value = "group is the preferred group of the resource.  Empty implies the group of the containing resource list. For subresources, this may have a different value, for example: Scale\".")
 /**
   * group is the preferred group of the resource.  Empty implies the group of the containing resource list. For subresources, this may have a different value, for example: Scale\".
  **/
  private String group = null;

  @ApiModelProperty(required = true, value = "kind is the kind for the resource (e.g. 'Foo' is the kind for a resource 'foo')")
 /**
   * kind is the kind for the resource (e.g. 'Foo' is the kind for a resource 'foo')
  **/
  private String kind = null;

  @ApiModelProperty(required = true, value = "name is the plural name of the resource.")
 /**
   * name is the plural name of the resource.
  **/
  private String name = null;

  @ApiModelProperty(required = true, value = "namespaced indicates if a resource is namespaced or not.")
 /**
   * namespaced indicates if a resource is namespaced or not.
  **/
  private boolean namespaced = false;

  @ApiModelProperty(value = "shortNames is a list of suggested short names of the resource.")
 /**
   * shortNames is a list of suggested short names of the resource.
  **/
  private List<String> shortNames = null;

  @ApiModelProperty(required = true, value = "singularName is the singular name of the resource.  This allows clients to handle plural and singular opaquely. The singularName is more correct for reporting status on a single item and both singular and plural are allowed from the kubectl CLI interface.")
 /**
   * singularName is the singular name of the resource.  This allows clients to handle plural and singular opaquely. The singularName is more correct for reporting status on a single item and both singular and plural are allowed from the kubectl CLI interface.
  **/
  private String singularName = null;

  @ApiModelProperty(value = "The hash value of the storage version, the version this resource is converted to when written to the data store. Value must be treated as opaque by clients. Only equality comparison on the value is valid. This is an alpha feature and may change or be removed in the future. The field is populated by the apiserver only if the StorageVersionHash feature gate is enabled. This field will remain optional even if it graduates.")
 /**
   * The hash value of the storage version, the version this resource is converted to when written to the data store. Value must be treated as opaque by clients. Only equality comparison on the value is valid. This is an alpha feature and may change or be removed in the future. The field is populated by the apiserver only if the StorageVersionHash feature gate is enabled. This field will remain optional even if it graduates.
  **/
  private String storageVersionHash = null;

  @ApiModelProperty(required = true, value = "verbs is a list of supported kube verbs (this includes get, list, watch, create, update, patch, delete, deletecollection, and proxy)")
 /**
   * verbs is a list of supported kube verbs (this includes get, list, watch, create, update, patch, delete, deletecollection, and proxy)
  **/
  private List<String> verbs = new ArrayList<String>();

  @ApiModelProperty(value = "version is the preferred version of the resource.  Empty implies the version of the containing resource list For subresources, this may have a different value, for example: v1 (while inside a v1beta1 version of the core resource's group)\".")
 /**
   * version is the preferred version of the resource.  Empty implies the version of the containing resource list For subresources, this may have a different value, for example: v1 (while inside a v1beta1 version of the core resource's group)\".
  **/
  private String version = null;
 /**
   * categories is a list of the grouped resources this resource belongs to (e.g. &#39;all&#39;)
   * @return categories
  **/
  @JsonProperty("categories")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public IoK8sApimachineryPkgApisMetaV1APIResource categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public IoK8sApimachineryPkgApisMetaV1APIResource addCategoriesItem(String categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * group is the preferred group of the resource.  Empty implies the group of the containing resource list. For subresources, this may have a different value, for example: Scale\&quot;.
   * @return group
  **/
  @JsonProperty("group")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public IoK8sApimachineryPkgApisMetaV1APIResource group(String group) {
    this.group = group;
    return this;
  }

 /**
   * kind is the kind for the resource (e.g. &#39;Foo&#39; is the kind for a resource &#39;foo&#39;)
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

  public IoK8sApimachineryPkgApisMetaV1APIResource kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * name is the plural name of the resource.
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

  public IoK8sApimachineryPkgApisMetaV1APIResource name(String name) {
    this.name = name;
    return this;
  }

 /**
   * namespaced indicates if a resource is namespaced or not.
   * @return namespaced
  **/
  @JsonProperty("namespaced")
  @NotNull
  public boolean isNamespaced() {
    return namespaced;
  }

  public void setNamespaced(boolean namespaced) {
    this.namespaced = namespaced;
  }

  public IoK8sApimachineryPkgApisMetaV1APIResource namespaced(boolean namespaced) {
    this.namespaced = namespaced;
    return this;
  }

 /**
   * shortNames is a list of suggested short names of the resource.
   * @return shortNames
  **/
  @JsonProperty("shortNames")
  public List<String> getShortNames() {
    return shortNames;
  }

  public void setShortNames(List<String> shortNames) {
    this.shortNames = shortNames;
  }

  public IoK8sApimachineryPkgApisMetaV1APIResource shortNames(List<String> shortNames) {
    this.shortNames = shortNames;
    return this;
  }

  public IoK8sApimachineryPkgApisMetaV1APIResource addShortNamesItem(String shortNamesItem) {
    this.shortNames.add(shortNamesItem);
    return this;
  }

 /**
   * singularName is the singular name of the resource.  This allows clients to handle plural and singular opaquely. The singularName is more correct for reporting status on a single item and both singular and plural are allowed from the kubectl CLI interface.
   * @return singularName
  **/
  @JsonProperty("singularName")
  @NotNull
  public String getSingularName() {
    return singularName;
  }

  public void setSingularName(String singularName) {
    this.singularName = singularName;
  }

  public IoK8sApimachineryPkgApisMetaV1APIResource singularName(String singularName) {
    this.singularName = singularName;
    return this;
  }

 /**
   * The hash value of the storage version, the version this resource is converted to when written to the data store. Value must be treated as opaque by clients. Only equality comparison on the value is valid. This is an alpha feature and may change or be removed in the future. The field is populated by the apiserver only if the StorageVersionHash feature gate is enabled. This field will remain optional even if it graduates.
   * @return storageVersionHash
  **/
  @JsonProperty("storageVersionHash")
  public String getStorageVersionHash() {
    return storageVersionHash;
  }

  public void setStorageVersionHash(String storageVersionHash) {
    this.storageVersionHash = storageVersionHash;
  }

  public IoK8sApimachineryPkgApisMetaV1APIResource storageVersionHash(String storageVersionHash) {
    this.storageVersionHash = storageVersionHash;
    return this;
  }

 /**
   * verbs is a list of supported kube verbs (this includes get, list, watch, create, update, patch, delete, deletecollection, and proxy)
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

  public IoK8sApimachineryPkgApisMetaV1APIResource verbs(List<String> verbs) {
    this.verbs = verbs;
    return this;
  }

  public IoK8sApimachineryPkgApisMetaV1APIResource addVerbsItem(String verbsItem) {
    this.verbs.add(verbsItem);
    return this;
  }

 /**
   * version is the preferred version of the resource.  Empty implies the version of the containing resource list For subresources, this may have a different value, for example: v1 (while inside a v1beta1 version of the core resource&#39;s group)\&quot;.
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public IoK8sApimachineryPkgApisMetaV1APIResource version(String version) {
    this.version = version;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1APIResource {\n");
    
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaced: ").append(toIndentedString(namespaced)).append("\n");
    sb.append("    shortNames: ").append(toIndentedString(shortNames)).append("\n");
    sb.append("    singularName: ").append(toIndentedString(singularName)).append("\n");
    sb.append("    storageVersionHash: ").append(toIndentedString(storageVersionHash)).append("\n");
    sb.append("    verbs: ").append(toIndentedString(verbs)).append("\n");
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

