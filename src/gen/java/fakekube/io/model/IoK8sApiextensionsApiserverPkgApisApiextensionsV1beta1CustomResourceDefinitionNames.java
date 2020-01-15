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
  * CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition
 **/
@ApiModel(description="CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames  {
  
  @ApiModelProperty(value = "categories is a list of grouped resources this custom resource belongs to (e.g. 'all'). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.")
 /**
   * categories is a list of grouped resources this custom resource belongs to (e.g. 'all'). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.
  **/
  private List<String> categories = null;

  @ApiModelProperty(required = true, value = "kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the `kind` attribute in API calls.")
 /**
   * kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the `kind` attribute in API calls.
  **/
  private String kind = null;

  @ApiModelProperty(value = "listKind is the serialized kind of the list for this resource. Defaults to \"`kind`List\".")
 /**
   * listKind is the serialized kind of the list for this resource. Defaults to \"`kind`List\".
  **/
  private String listKind = null;

  @ApiModelProperty(required = true, value = "plural is the plural name of the resource to serve. The custom resources are served under `/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`). Must be all lowercase.")
 /**
   * plural is the plural name of the resource to serve. The custom resources are served under `/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`). Must be all lowercase.
  **/
  private String plural = null;

  @ApiModelProperty(value = "shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get <shortname>`. It must be all lowercase.")
 /**
   * shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get <shortname>`. It must be all lowercase.
  **/
  private List<String> shortNames = null;

  @ApiModelProperty(value = "singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`.")
 /**
   * singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`.
  **/
  private String singular = null;
 /**
   * categories is a list of grouped resources this custom resource belongs to (e.g. &#39;all&#39;). This is published in API discovery documents, and used by clients to support invocations like &#x60;kubectl get all&#x60;.
   * @return categories
  **/
  @JsonProperty("categories")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames addCategoriesItem(String categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the &#x60;kind&#x60; attribute in API calls.
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

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * listKind is the serialized kind of the list for this resource. Defaults to \&quot;&#x60;kind&#x60;List\&quot;.
   * @return listKind
  **/
  @JsonProperty("listKind")
  public String getListKind() {
    return listKind;
  }

  public void setListKind(String listKind) {
    this.listKind = listKind;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames listKind(String listKind) {
    this.listKind = listKind;
    return this;
  }

 /**
   * plural is the plural name of the resource to serve. The custom resources are served under &#x60;/apis/&lt;group&gt;/&lt;version&gt;/.../&lt;plural&gt;&#x60;. Must match the name of the CustomResourceDefinition (in the form &#x60;&lt;names.plural&gt;.&lt;group&gt;&#x60;). Must be all lowercase.
   * @return plural
  **/
  @JsonProperty("plural")
  @NotNull
  public String getPlural() {
    return plural;
  }

  public void setPlural(String plural) {
    this.plural = plural;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames plural(String plural) {
    this.plural = plural;
    return this;
  }

 /**
   * shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like &#x60;kubectl get &lt;shortname&gt;&#x60;. It must be all lowercase.
   * @return shortNames
  **/
  @JsonProperty("shortNames")
  public List<String> getShortNames() {
    return shortNames;
  }

  public void setShortNames(List<String> shortNames) {
    this.shortNames = shortNames;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames shortNames(List<String> shortNames) {
    this.shortNames = shortNames;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames addShortNamesItem(String shortNamesItem) {
    this.shortNames.add(shortNamesItem);
    return this;
  }

 /**
   * singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased &#x60;kind&#x60;.
   * @return singular
  **/
  @JsonProperty("singular")
  public String getSingular() {
    return singular;
  }

  public void setSingular(String singular) {
    this.singular = singular;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames singular(String singular) {
    this.singular = singular;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames {\n");
    
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    listKind: ").append(toIndentedString(listKind)).append("\n");
    sb.append("    plural: ").append(toIndentedString(plural)).append("\n");
    sb.append("    shortNames: ").append(toIndentedString(shortNames)).append("\n");
    sb.append("    singular: ").append(toIndentedString(singular)).append("\n");
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

