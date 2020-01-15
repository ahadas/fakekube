package fakekube.io.model;

import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1ExternalDocumentation;
import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSON;
import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps;
import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrArray;
import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrBool;
import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrStringArray;
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
  * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
 **/
@ApiModel(description="JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps  {
  
  @ApiModelProperty(value = "")
  private String ref = null;

  @ApiModelProperty(value = "")
  private String schema = null;

  @ApiModelProperty(value = "")
  @Valid
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrBool additionalItems = null;

  @ApiModelProperty(value = "")
  @Valid
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrBool additionalProperties = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> allOf = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> anyOf = null;

  @ApiModelProperty(value = "default is a default value for undefined object fields. Defaulting is a beta feature under the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields to be false.")
  @Valid
 /**
   * default is a default value for undefined object fields. Defaulting is a beta feature under the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields to be false.
  **/
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSON _default = null;

  @ApiModelProperty(value = "")
  @Valid
  private Map<String, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> definitions = null;

  @ApiModelProperty(value = "")
  @Valid
  private Map<String, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrStringArray> dependencies = null;

  @ApiModelProperty(value = "")
  private String description = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSON> _enum = null;

  @ApiModelProperty(value = "")
  @Valid
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSON example = null;

  @ApiModelProperty(value = "")
  private Boolean exclusiveMaximum = null;

  @ApiModelProperty(value = "")
  private Boolean exclusiveMinimum = null;

  @ApiModelProperty(value = "")
  @Valid
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1ExternalDocumentation externalDocs = null;

  @ApiModelProperty(value = "format is an OpenAPI v3 format string. Unknown formats are ignored. The following formats are validated:  - bsonobjectid: a bson object ID, i.e. a 24 characters hex string - uri: an URI as parsed by Golang net/url.ParseRequestURI - email: an email address as parsed by Golang net/mail.ParseAddress - hostname: a valid representation for an Internet host name, as defined by RFC 1034, section 3.1 [RFC1034]. - ipv4: an IPv4 IP as parsed by Golang net.ParseIP - ipv6: an IPv6 IP as parsed by Golang net.ParseIP - cidr: a CIDR as parsed by Golang net.ParseCIDR - mac: a MAC address as parsed by Golang net.ParseMAC - uuid: an UUID that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid3: an UUID3 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?3[0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid4: an UUID4 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?4[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - uuid5: an UUID5 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?5[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - isbn: an ISBN10 or ISBN13 number string like \"0321751043\" or \"978-0321751041\" - isbn10: an ISBN10 number string like \"0321751043\" - isbn13: an ISBN13 number string like \"978-0321751041\" - creditcard: a credit card number defined by the regex ^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\\d{3})\\d{11})$ with any non digit characters mixed in - ssn: a U.S. social security number following the regex ^\\d{3}[- ]?\\d{2}[- ]?\\d{4}$ - hexcolor: an hexadecimal color code like \"#FFFFFF: following the regex ^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$ - rgbcolor: an RGB color code like rgb like \"rgb(255,255,2559\" - byte: base64 encoded binary data - password: any kind of string - date: a date string like \"2006-01-02\" as defined by full-date in RFC3339 - duration: a duration string like \"22 ns\" as parsed by Golang time.ParseDuration or compatible with Scala duration format - datetime: a date time string like \"2014-12-15T19:30:20.000Z\" as defined by date-time in RFC3339.")
 /**
   * format is an OpenAPI v3 format string. Unknown formats are ignored. The following formats are validated:  - bsonobjectid: a bson object ID, i.e. a 24 characters hex string - uri: an URI as parsed by Golang net/url.ParseRequestURI - email: an email address as parsed by Golang net/mail.ParseAddress - hostname: a valid representation for an Internet host name, as defined by RFC 1034, section 3.1 [RFC1034]. - ipv4: an IPv4 IP as parsed by Golang net.ParseIP - ipv6: an IPv6 IP as parsed by Golang net.ParseIP - cidr: a CIDR as parsed by Golang net.ParseCIDR - mac: a MAC address as parsed by Golang net.ParseMAC - uuid: an UUID that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid3: an UUID3 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?3[0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid4: an UUID4 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?4[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - uuid5: an UUID5 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?5[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - isbn: an ISBN10 or ISBN13 number string like \"0321751043\" or \"978-0321751041\" - isbn10: an ISBN10 number string like \"0321751043\" - isbn13: an ISBN13 number string like \"978-0321751041\" - creditcard: a credit card number defined by the regex ^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\\d{3})\\d{11})$ with any non digit characters mixed in - ssn: a U.S. social security number following the regex ^\\d{3}[- ]?\\d{2}[- ]?\\d{4}$ - hexcolor: an hexadecimal color code like \"#FFFFFF: following the regex ^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$ - rgbcolor: an RGB color code like rgb like \"rgb(255,255,2559\" - byte: base64 encoded binary data - password: any kind of string - date: a date string like \"2006-01-02\" as defined by full-date in RFC3339 - duration: a duration string like \"22 ns\" as parsed by Golang time.ParseDuration or compatible with Scala duration format - datetime: a date time string like \"2014-12-15T19:30:20.000Z\" as defined by date-time in RFC3339.
  **/
  private String format = null;

  @ApiModelProperty(value = "")
  private String id = null;

  @ApiModelProperty(value = "")
  @Valid
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrArray items = null;

  @ApiModelProperty(value = "")
  private Long maxItems = null;

  @ApiModelProperty(value = "")
  private Long maxLength = null;

  @ApiModelProperty(value = "")
  private Long maxProperties = null;

  @ApiModelProperty(value = "")
  private Double maximum = null;

  @ApiModelProperty(value = "")
  private Long minItems = null;

  @ApiModelProperty(value = "")
  private Long minLength = null;

  @ApiModelProperty(value = "")
  private Long minProperties = null;

  @ApiModelProperty(value = "")
  private Double minimum = null;

  @ApiModelProperty(value = "")
  private Double multipleOf = null;

  @ApiModelProperty(value = "")
  @Valid
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps not = null;

  @ApiModelProperty(value = "")
  private Boolean nullable = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> oneOf = null;

  @ApiModelProperty(value = "")
  private String pattern = null;

  @ApiModelProperty(value = "")
  @Valid
  private Map<String, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> patternProperties = null;

  @ApiModelProperty(value = "")
  @Valid
  private Map<String, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> properties = null;

  @ApiModelProperty(value = "")
  private List<String> required = null;

  @ApiModelProperty(value = "")
  private String title = null;

  @ApiModelProperty(value = "")
  private String type = null;

  @ApiModelProperty(value = "")
  private Boolean uniqueItems = null;

  @ApiModelProperty(value = "x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to be if the object is fully specified (up to kind, apiVersion, metadata).")
 /**
   * x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to be if the object is fully specified (up to kind, apiVersion, metadata).
  **/
  private Boolean xKubernetesEmbeddedResource = null;

  @ApiModelProperty(value = "x-kubernetes-int-or-string specifies that this value is either an integer or a string. If this is true, an empty type is allowed and type as child of anyOf is permitted if following one of the following patterns:  1) anyOf:    - type: integer    - type: string 2) allOf:    - anyOf:      - type: integer      - type: string    - ... zero or more")
 /**
   * x-kubernetes-int-or-string specifies that this value is either an integer or a string. If this is true, an empty type is allowed and type as child of anyOf is permitted if following one of the following patterns:  1) anyOf:    - type: integer    - type: string 2) allOf:    - anyOf:      - type: integer      - type: string    - ... zero or more
  **/
  private Boolean xKubernetesIntOrString = null;

  @ApiModelProperty(value = "x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by specifying the keys used as the index of the map.  This tag MUST only be used on lists that have the \"x-kubernetes-list-type\" extension set to \"map\". Also, the values specified for this attribute must be a scalar typed field of the child structure (no nesting is supported).")
 /**
   * x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by specifying the keys used as the index of the map.  This tag MUST only be used on lists that have the \"x-kubernetes-list-type\" extension set to \"map\". Also, the values specified for this attribute must be a scalar typed field of the child structure (no nesting is supported).
  **/
  private List<String> xKubernetesListMapKeys = null;

  @ApiModelProperty(value = "x-kubernetes-list-type annotates an array to further describe its topology. This extension must only be used on lists and may have 3 possible values:  1) `atomic`: the list is treated as a single entity, like a scalar.      Atomic lists will be entirely replaced when updated. This extension      may be used on any type of list (struct, scalar, ...). 2) `set`:      Sets are lists that must not have multiple items with the same value. Each      value must be a scalar, an object with x-kubernetes-map-type `atomic` or an      array with x-kubernetes-list-type `atomic`. 3) `map`:      These lists are like maps in that their elements have a non-index key      used to identify them. Order is preserved upon merge. The map tag      must only be used on a list with elements of type object. Defaults to atomic for arrays.")
 /**
   * x-kubernetes-list-type annotates an array to further describe its topology. This extension must only be used on lists and may have 3 possible values:  1) `atomic`: the list is treated as a single entity, like a scalar.      Atomic lists will be entirely replaced when updated. This extension      may be used on any type of list (struct, scalar, ...). 2) `set`:      Sets are lists that must not have multiple items with the same value. Each      value must be a scalar, an object with x-kubernetes-map-type `atomic` or an      array with x-kubernetes-list-type `atomic`. 3) `map`:      These lists are like maps in that their elements have a non-index key      used to identify them. Order is preserved upon merge. The map tag      must only be used on a list with elements of type object. Defaults to atomic for arrays.
  **/
  private String xKubernetesListType = null;

  @ApiModelProperty(value = "x-kubernetes-map-type annotates an object to further describe its topology. This extension must only be used when type is object and may have 2 possible values:  1) `granular`:      These maps are actual maps (key-value pairs) and each fields are independent      from each other (they can each be manipulated by separate actors). This is      the default behaviour for all maps. 2) `atomic`: the list is treated as a single entity, like a scalar.      Atomic maps will be entirely replaced when updated.")
 /**
   * x-kubernetes-map-type annotates an object to further describe its topology. This extension must only be used when type is object and may have 2 possible values:  1) `granular`:      These maps are actual maps (key-value pairs) and each fields are independent      from each other (they can each be manipulated by separate actors). This is      the default behaviour for all maps. 2) `atomic`: the list is treated as a single entity, like a scalar.      Atomic maps will be entirely replaced when updated.
  **/
  private String xKubernetesMapType = null;

  @ApiModelProperty(value = "x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in the validation schema. This affects fields recursively, but switches back to normal pruning behaviour if nested properties or additionalProperties are specified in the schema. This can either be true or undefined. False is forbidden.")
 /**
   * x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in the validation schema. This affects fields recursively, but switches back to normal pruning behaviour if nested properties or additionalProperties are specified in the schema. This can either be true or undefined. False is forbidden.
  **/
  private Boolean xKubernetesPreserveUnknownFields = null;
 /**
   * Get ref
   * @return ref
  **/
  @JsonProperty("$ref")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps ref(String ref) {
    this.ref = ref;
    return this;
  }

 /**
   * Get schema
   * @return schema
  **/
  @JsonProperty("$schema")
  public String getSchema() {
    return schema;
  }

  public void setSchema(String schema) {
    this.schema = schema;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps schema(String schema) {
    this.schema = schema;
    return this;
  }

 /**
   * Get additionalItems
   * @return additionalItems
  **/
  @JsonProperty("additionalItems")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrBool getAdditionalItems() {
    return additionalItems;
  }

  public void setAdditionalItems(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrBool additionalItems) {
    this.additionalItems = additionalItems;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps additionalItems(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrBool additionalItems) {
    this.additionalItems = additionalItems;
    return this;
  }

 /**
   * Get additionalProperties
   * @return additionalProperties
  **/
  @JsonProperty("additionalProperties")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrBool getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrBool additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps additionalProperties(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrBool additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

 /**
   * Get allOf
   * @return allOf
  **/
  @JsonProperty("allOf")
  public List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> getAllOf() {
    return allOf;
  }

  public void setAllOf(List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> allOf) {
    this.allOf = allOf;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps allOf(List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> allOf) {
    this.allOf = allOf;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps addAllOfItem(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps allOfItem) {
    this.allOf.add(allOfItem);
    return this;
  }

 /**
   * Get anyOf
   * @return anyOf
  **/
  @JsonProperty("anyOf")
  public List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> getAnyOf() {
    return anyOf;
  }

  public void setAnyOf(List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> anyOf) {
    this.anyOf = anyOf;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps anyOf(List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps addAnyOfItem(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps anyOfItem) {
    this.anyOf.add(anyOfItem);
    return this;
  }

 /**
   * default is a default value for undefined object fields. Defaulting is a beta feature under the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields to be false.
   * @return _default
  **/
  @JsonProperty("default")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSON getDefault() {
    return _default;
  }

  public void setDefault(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSON _default) {
    this._default = _default;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps _default(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSON _default) {
    this._default = _default;
    return this;
  }

 /**
   * Get definitions
   * @return definitions
  **/
  @JsonProperty("definitions")
  public Map<String, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> getDefinitions() {
    return definitions;
  }

  public void setDefinitions(Map<String, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> definitions) {
    this.definitions = definitions;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps definitions(Map<String, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> definitions) {
    this.definitions = definitions;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps putDefinitionsItem(String key, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps definitionsItem) {
    this.definitions.put(key, definitionsItem);
    return this;
  }

 /**
   * Get dependencies
   * @return dependencies
  **/
  @JsonProperty("dependencies")
  public Map<String, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrStringArray> getDependencies() {
    return dependencies;
  }

  public void setDependencies(Map<String, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrStringArray> dependencies) {
    this.dependencies = dependencies;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps dependencies(Map<String, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrStringArray> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps putDependenciesItem(String key, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrStringArray dependenciesItem) {
    this.dependencies.put(key, dependenciesItem);
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get _enum
   * @return _enum
  **/
  @JsonProperty("enum")
  public List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSON> getEnum() {
    return _enum;
  }

  public void setEnum(List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSON> _enum) {
    this._enum = _enum;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps _enum(List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSON> _enum) {
    this._enum = _enum;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps addEnumItem(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSON _enumItem) {
    this._enum.add(_enumItem);
    return this;
  }

 /**
   * Get example
   * @return example
  **/
  @JsonProperty("example")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSON getExample() {
    return example;
  }

  public void setExample(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSON example) {
    this.example = example;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps example(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSON example) {
    this.example = example;
    return this;
  }

 /**
   * Get exclusiveMaximum
   * @return exclusiveMaximum
  **/
  @JsonProperty("exclusiveMaximum")
  public Boolean isExclusiveMaximum() {
    return exclusiveMaximum;
  }

  public void setExclusiveMaximum(Boolean exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps exclusiveMaximum(Boolean exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
    return this;
  }

 /**
   * Get exclusiveMinimum
   * @return exclusiveMinimum
  **/
  @JsonProperty("exclusiveMinimum")
  public Boolean isExclusiveMinimum() {
    return exclusiveMinimum;
  }

  public void setExclusiveMinimum(Boolean exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps exclusiveMinimum(Boolean exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
    return this;
  }

 /**
   * Get externalDocs
   * @return externalDocs
  **/
  @JsonProperty("externalDocs")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1ExternalDocumentation getExternalDocs() {
    return externalDocs;
  }

  public void setExternalDocs(IoK8sApiextensionsApiserverPkgApisApiextensionsV1ExternalDocumentation externalDocs) {
    this.externalDocs = externalDocs;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps externalDocs(IoK8sApiextensionsApiserverPkgApisApiextensionsV1ExternalDocumentation externalDocs) {
    this.externalDocs = externalDocs;
    return this;
  }

 /**
   * format is an OpenAPI v3 format string. Unknown formats are ignored. The following formats are validated:  - bsonobjectid: a bson object ID, i.e. a 24 characters hex string - uri: an URI as parsed by Golang net/url.ParseRequestURI - email: an email address as parsed by Golang net/mail.ParseAddress - hostname: a valid representation for an Internet host name, as defined by RFC 1034, section 3.1 [RFC1034]. - ipv4: an IPv4 IP as parsed by Golang net.ParseIP - ipv6: an IPv6 IP as parsed by Golang net.ParseIP - cidr: a CIDR as parsed by Golang net.ParseCIDR - mac: a MAC address as parsed by Golang net.ParseMAC - uuid: an UUID that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid3: an UUID3 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?3[0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid4: an UUID4 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?4[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - uuid5: an UUID5 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?5[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - isbn: an ISBN10 or ISBN13 number string like \&quot;0321751043\&quot; or \&quot;978-0321751041\&quot; - isbn10: an ISBN10 number string like \&quot;0321751043\&quot; - isbn13: an ISBN13 number string like \&quot;978-0321751041\&quot; - creditcard: a credit card number defined by the regex ^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\\d{3})\\d{11})$ with any non digit characters mixed in - ssn: a U.S. social security number following the regex ^\\d{3}[- ]?\\d{2}[- ]?\\d{4}$ - hexcolor: an hexadecimal color code like \&quot;#FFFFFF: following the regex ^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$ - rgbcolor: an RGB color code like rgb like \&quot;rgb(255,255,2559\&quot; - byte: base64 encoded binary data - password: any kind of string - date: a date string like \&quot;2006-01-02\&quot; as defined by full-date in RFC3339 - duration: a duration string like \&quot;22 ns\&quot; as parsed by Golang time.ParseDuration or compatible with Scala duration format - datetime: a date time string like \&quot;2014-12-15T19:30:20.000Z\&quot; as defined by date-time in RFC3339.
   * @return format
  **/
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps format(String format) {
    this.format = format;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrArray getItems() {
    return items;
  }

  public void setItems(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrArray items) {
    this.items = items;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps items(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaPropsOrArray items) {
    this.items = items;
    return this;
  }

 /**
   * Get maxItems
   * @return maxItems
  **/
  @JsonProperty("maxItems")
  public Long getMaxItems() {
    return maxItems;
  }

  public void setMaxItems(Long maxItems) {
    this.maxItems = maxItems;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps maxItems(Long maxItems) {
    this.maxItems = maxItems;
    return this;
  }

 /**
   * Get maxLength
   * @return maxLength
  **/
  @JsonProperty("maxLength")
  public Long getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Long maxLength) {
    this.maxLength = maxLength;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps maxLength(Long maxLength) {
    this.maxLength = maxLength;
    return this;
  }

 /**
   * Get maxProperties
   * @return maxProperties
  **/
  @JsonProperty("maxProperties")
  public Long getMaxProperties() {
    return maxProperties;
  }

  public void setMaxProperties(Long maxProperties) {
    this.maxProperties = maxProperties;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps maxProperties(Long maxProperties) {
    this.maxProperties = maxProperties;
    return this;
  }

 /**
   * Get maximum
   * @return maximum
  **/
  @JsonProperty("maximum")
  public Double getMaximum() {
    return maximum;
  }

  public void setMaximum(Double maximum) {
    this.maximum = maximum;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps maximum(Double maximum) {
    this.maximum = maximum;
    return this;
  }

 /**
   * Get minItems
   * @return minItems
  **/
  @JsonProperty("minItems")
  public Long getMinItems() {
    return minItems;
  }

  public void setMinItems(Long minItems) {
    this.minItems = minItems;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps minItems(Long minItems) {
    this.minItems = minItems;
    return this;
  }

 /**
   * Get minLength
   * @return minLength
  **/
  @JsonProperty("minLength")
  public Long getMinLength() {
    return minLength;
  }

  public void setMinLength(Long minLength) {
    this.minLength = minLength;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps minLength(Long minLength) {
    this.minLength = minLength;
    return this;
  }

 /**
   * Get minProperties
   * @return minProperties
  **/
  @JsonProperty("minProperties")
  public Long getMinProperties() {
    return minProperties;
  }

  public void setMinProperties(Long minProperties) {
    this.minProperties = minProperties;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps minProperties(Long minProperties) {
    this.minProperties = minProperties;
    return this;
  }

 /**
   * Get minimum
   * @return minimum
  **/
  @JsonProperty("minimum")
  public Double getMinimum() {
    return minimum;
  }

  public void setMinimum(Double minimum) {
    this.minimum = minimum;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps minimum(Double minimum) {
    this.minimum = minimum;
    return this;
  }

 /**
   * Get multipleOf
   * @return multipleOf
  **/
  @JsonProperty("multipleOf")
  public Double getMultipleOf() {
    return multipleOf;
  }

  public void setMultipleOf(Double multipleOf) {
    this.multipleOf = multipleOf;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps multipleOf(Double multipleOf) {
    this.multipleOf = multipleOf;
    return this;
  }

 /**
   * Get not
   * @return not
  **/
  @JsonProperty("not")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps getNot() {
    return not;
  }

  public void setNot(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps not) {
    this.not = not;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps not(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps not) {
    this.not = not;
    return this;
  }

 /**
   * Get nullable
   * @return nullable
  **/
  @JsonProperty("nullable")
  public Boolean isNullable() {
    return nullable;
  }

  public void setNullable(Boolean nullable) {
    this.nullable = nullable;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps nullable(Boolean nullable) {
    this.nullable = nullable;
    return this;
  }

 /**
   * Get oneOf
   * @return oneOf
  **/
  @JsonProperty("oneOf")
  public List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> getOneOf() {
    return oneOf;
  }

  public void setOneOf(List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> oneOf) {
    this.oneOf = oneOf;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps oneOf(List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> oneOf) {
    this.oneOf = oneOf;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps addOneOfItem(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps oneOfItem) {
    this.oneOf.add(oneOfItem);
    return this;
  }

 /**
   * Get pattern
   * @return pattern
  **/
  @JsonProperty("pattern")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

 /**
   * Get patternProperties
   * @return patternProperties
  **/
  @JsonProperty("patternProperties")
  public Map<String, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> getPatternProperties() {
    return patternProperties;
  }

  public void setPatternProperties(Map<String, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> patternProperties) {
    this.patternProperties = patternProperties;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps patternProperties(Map<String, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> patternProperties) {
    this.patternProperties = patternProperties;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps putPatternPropertiesItem(String key, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps patternPropertiesItem) {
    this.patternProperties.put(key, patternPropertiesItem);
    return this;
  }

 /**
   * Get properties
   * @return properties
  **/
  @JsonProperty("properties")
  public Map<String, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> properties) {
    this.properties = properties;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps properties(Map<String, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps> properties) {
    this.properties = properties;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps putPropertiesItem(String key, IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps propertiesItem) {
    this.properties.put(key, propertiesItem);
    return this;
  }

 /**
   * Get required
   * @return required
  **/
  @JsonProperty("required")
  public List<String> getRequired() {
    return required;
  }

  public void setRequired(List<String> required) {
    this.required = required;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps required(List<String> required) {
    this.required = required;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps addRequiredItem(String requiredItem) {
    this.required.add(requiredItem);
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get uniqueItems
   * @return uniqueItems
  **/
  @JsonProperty("uniqueItems")
  public Boolean isUniqueItems() {
    return uniqueItems;
  }

  public void setUniqueItems(Boolean uniqueItems) {
    this.uniqueItems = uniqueItems;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps uniqueItems(Boolean uniqueItems) {
    this.uniqueItems = uniqueItems;
    return this;
  }

 /**
   * x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to be if the object is fully specified (up to kind, apiVersion, metadata).
   * @return xKubernetesEmbeddedResource
  **/
  @JsonProperty("x-kubernetes-embedded-resource")
  public Boolean isXKubernetesEmbeddedResource() {
    return xKubernetesEmbeddedResource;
  }

  public void setXKubernetesEmbeddedResource(Boolean xKubernetesEmbeddedResource) {
    this.xKubernetesEmbeddedResource = xKubernetesEmbeddedResource;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps xKubernetesEmbeddedResource(Boolean xKubernetesEmbeddedResource) {
    this.xKubernetesEmbeddedResource = xKubernetesEmbeddedResource;
    return this;
  }

 /**
   * x-kubernetes-int-or-string specifies that this value is either an integer or a string. If this is true, an empty type is allowed and type as child of anyOf is permitted if following one of the following patterns:  1) anyOf:    - type: integer    - type: string 2) allOf:    - anyOf:      - type: integer      - type: string    - ... zero or more
   * @return xKubernetesIntOrString
  **/
  @JsonProperty("x-kubernetes-int-or-string")
  public Boolean isXKubernetesIntOrString() {
    return xKubernetesIntOrString;
  }

  public void setXKubernetesIntOrString(Boolean xKubernetesIntOrString) {
    this.xKubernetesIntOrString = xKubernetesIntOrString;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps xKubernetesIntOrString(Boolean xKubernetesIntOrString) {
    this.xKubernetesIntOrString = xKubernetesIntOrString;
    return this;
  }

 /**
   * x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type &#x60;map&#x60; by specifying the keys used as the index of the map.  This tag MUST only be used on lists that have the \&quot;x-kubernetes-list-type\&quot; extension set to \&quot;map\&quot;. Also, the values specified for this attribute must be a scalar typed field of the child structure (no nesting is supported).
   * @return xKubernetesListMapKeys
  **/
  @JsonProperty("x-kubernetes-list-map-keys")
  public List<String> getXKubernetesListMapKeys() {
    return xKubernetesListMapKeys;
  }

  public void setXKubernetesListMapKeys(List<String> xKubernetesListMapKeys) {
    this.xKubernetesListMapKeys = xKubernetesListMapKeys;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps xKubernetesListMapKeys(List<String> xKubernetesListMapKeys) {
    this.xKubernetesListMapKeys = xKubernetesListMapKeys;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps addXKubernetesListMapKeysItem(String xKubernetesListMapKeysItem) {
    this.xKubernetesListMapKeys.add(xKubernetesListMapKeysItem);
    return this;
  }

 /**
   * x-kubernetes-list-type annotates an array to further describe its topology. This extension must only be used on lists and may have 3 possible values:  1) &#x60;atomic&#x60;: the list is treated as a single entity, like a scalar.      Atomic lists will be entirely replaced when updated. This extension      may be used on any type of list (struct, scalar, ...). 2) &#x60;set&#x60;:      Sets are lists that must not have multiple items with the same value. Each      value must be a scalar, an object with x-kubernetes-map-type &#x60;atomic&#x60; or an      array with x-kubernetes-list-type &#x60;atomic&#x60;. 3) &#x60;map&#x60;:      These lists are like maps in that their elements have a non-index key      used to identify them. Order is preserved upon merge. The map tag      must only be used on a list with elements of type object. Defaults to atomic for arrays.
   * @return xKubernetesListType
  **/
  @JsonProperty("x-kubernetes-list-type")
  public String getXKubernetesListType() {
    return xKubernetesListType;
  }

  public void setXKubernetesListType(String xKubernetesListType) {
    this.xKubernetesListType = xKubernetesListType;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps xKubernetesListType(String xKubernetesListType) {
    this.xKubernetesListType = xKubernetesListType;
    return this;
  }

 /**
   * x-kubernetes-map-type annotates an object to further describe its topology. This extension must only be used when type is object and may have 2 possible values:  1) &#x60;granular&#x60;:      These maps are actual maps (key-value pairs) and each fields are independent      from each other (they can each be manipulated by separate actors). This is      the default behaviour for all maps. 2) &#x60;atomic&#x60;: the list is treated as a single entity, like a scalar.      Atomic maps will be entirely replaced when updated.
   * @return xKubernetesMapType
  **/
  @JsonProperty("x-kubernetes-map-type")
  public String getXKubernetesMapType() {
    return xKubernetesMapType;
  }

  public void setXKubernetesMapType(String xKubernetesMapType) {
    this.xKubernetesMapType = xKubernetesMapType;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps xKubernetesMapType(String xKubernetesMapType) {
    this.xKubernetesMapType = xKubernetesMapType;
    return this;
  }

 /**
   * x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in the validation schema. This affects fields recursively, but switches back to normal pruning behaviour if nested properties or additionalProperties are specified in the schema. This can either be true or undefined. False is forbidden.
   * @return xKubernetesPreserveUnknownFields
  **/
  @JsonProperty("x-kubernetes-preserve-unknown-fields")
  public Boolean isXKubernetesPreserveUnknownFields() {
    return xKubernetesPreserveUnknownFields;
  }

  public void setXKubernetesPreserveUnknownFields(Boolean xKubernetesPreserveUnknownFields) {
    this.xKubernetesPreserveUnknownFields = xKubernetesPreserveUnknownFields;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps xKubernetesPreserveUnknownFields(Boolean xKubernetesPreserveUnknownFields) {
    this.xKubernetesPreserveUnknownFields = xKubernetesPreserveUnknownFields;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    additionalItems: ").append(toIndentedString(additionalItems)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    allOf: ").append(toIndentedString(allOf)).append("\n");
    sb.append("    anyOf: ").append(toIndentedString(anyOf)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    definitions: ").append(toIndentedString(definitions)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    exclusiveMaximum: ").append(toIndentedString(exclusiveMaximum)).append("\n");
    sb.append("    exclusiveMinimum: ").append(toIndentedString(exclusiveMinimum)).append("\n");
    sb.append("    externalDocs: ").append(toIndentedString(externalDocs)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    maxProperties: ").append(toIndentedString(maxProperties)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    minItems: ").append(toIndentedString(minItems)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    minProperties: ").append(toIndentedString(minProperties)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    multipleOf: ").append(toIndentedString(multipleOf)).append("\n");
    sb.append("    not: ").append(toIndentedString(not)).append("\n");
    sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
    sb.append("    oneOf: ").append(toIndentedString(oneOf)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    patternProperties: ").append(toIndentedString(patternProperties)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uniqueItems: ").append(toIndentedString(uniqueItems)).append("\n");
    sb.append("    xKubernetesEmbeddedResource: ").append(toIndentedString(xKubernetesEmbeddedResource)).append("\n");
    sb.append("    xKubernetesIntOrString: ").append(toIndentedString(xKubernetesIntOrString)).append("\n");
    sb.append("    xKubernetesListMapKeys: ").append(toIndentedString(xKubernetesListMapKeys)).append("\n");
    sb.append("    xKubernetesListType: ").append(toIndentedString(xKubernetesListType)).append("\n");
    sb.append("    xKubernetesMapType: ").append(toIndentedString(xKubernetesMapType)).append("\n");
    sb.append("    xKubernetesPreserveUnknownFields: ").append(toIndentedString(xKubernetesPreserveUnknownFields)).append("\n");
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

