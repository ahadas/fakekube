package fakekube.io.model;

import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1APIResource;
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
  * APIResourceList is a list of APIResource, it is used to expose the name of the resources supported in a specific group and version, and if the resource is namespaced.
 **/
@ApiModel(description="APIResourceList is a list of APIResource, it is used to expose the name of the resources supported in a specific group and version, and if the resource is namespaced.")
public class IoK8sApimachineryPkgApisMetaV1APIResourceList  {
  
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
 /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
  **/
  private String apiVersion = null;

  @ApiModelProperty(required = true, value = "groupVersion is the group and version this APIResourceList is for.")
 /**
   * groupVersion is the group and version this APIResourceList is for.
  **/
  private String groupVersion = null;

  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
 /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
  **/
  private String kind = null;

  @ApiModelProperty(required = true, value = "resources contains the name of the resources and if they are namespaced.")
  @Valid
 /**
   * resources contains the name of the resources and if they are namespaced.
  **/
  private List<IoK8sApimachineryPkgApisMetaV1APIResource> resources = new ArrayList<IoK8sApimachineryPkgApisMetaV1APIResource>();
 /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public IoK8sApimachineryPkgApisMetaV1APIResourceList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

 /**
   * groupVersion is the group and version this APIResourceList is for.
   * @return groupVersion
  **/
  @JsonProperty("groupVersion")
  @NotNull
  public String getGroupVersion() {
    return groupVersion;
  }

  public void setGroupVersion(String groupVersion) {
    this.groupVersion = groupVersion;
  }

  public IoK8sApimachineryPkgApisMetaV1APIResourceList groupVersion(String groupVersion) {
    this.groupVersion = groupVersion;
    return this;
  }

 /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoK8sApimachineryPkgApisMetaV1APIResourceList kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * resources contains the name of the resources and if they are namespaced.
   * @return resources
  **/
  @JsonProperty("resources")
  @NotNull
  public List<IoK8sApimachineryPkgApisMetaV1APIResource> getResources() {
    return resources;
  }

  public void setResources(List<IoK8sApimachineryPkgApisMetaV1APIResource> resources) {
    this.resources = resources;
  }

  public IoK8sApimachineryPkgApisMetaV1APIResourceList resources(List<IoK8sApimachineryPkgApisMetaV1APIResource> resources) {
    this.resources = resources;
    return this;
  }

  public IoK8sApimachineryPkgApisMetaV1APIResourceList addResourcesItem(IoK8sApimachineryPkgApisMetaV1APIResource resourcesItem) {
    this.resources.add(resourcesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1APIResourceList {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    groupVersion: ").append(toIndentedString(groupVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

