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
  * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.
 **/
@ApiModel(description="TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.")
public class IoK8sApiCoreV1TypedLocalObjectReference  {
  
  @ApiModelProperty(value = "APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.")
 /**
   * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
  **/
  private String apiGroup = null;

  @ApiModelProperty(required = true, value = "Kind is the type of resource being referenced")
 /**
   * Kind is the type of resource being referenced
  **/
  private String kind = null;

  @ApiModelProperty(required = true, value = "Name is the name of resource being referenced")
 /**
   * Name is the name of resource being referenced
  **/
  private String name = null;
 /**
   * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
   * @return apiGroup
  **/
  @JsonProperty("apiGroup")
  public String getApiGroup() {
    return apiGroup;
  }

  public void setApiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
  }

  public IoK8sApiCoreV1TypedLocalObjectReference apiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
    return this;
  }

 /**
   * Kind is the type of resource being referenced
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

  public IoK8sApiCoreV1TypedLocalObjectReference kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * Name is the name of resource being referenced
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

  public IoK8sApiCoreV1TypedLocalObjectReference name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1TypedLocalObjectReference {\n");
    
    sb.append("    apiGroup: ").append(toIndentedString(apiGroup)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

