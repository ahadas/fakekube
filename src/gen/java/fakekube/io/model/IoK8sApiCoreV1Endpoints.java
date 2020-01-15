package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1EndpointSubset;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1ObjectMeta;
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
  * Endpoints is a collection of endpoints that implement the actual service. Example:   Name: \"mysvc\",   Subsets: [     {       Addresses: [{\"ip\": \"10.10.1.1\"}, {\"ip\": \"10.10.2.2\"}],       Ports: [{\"name\": \"a\", \"port\": 8675}, {\"name\": \"b\", \"port\": 309}]     },     {       Addresses: [{\"ip\": \"10.10.3.3\"}],       Ports: [{\"name\": \"a\", \"port\": 93}, {\"name\": \"b\", \"port\": 76}]     },  ]
 **/
@ApiModel(description="Endpoints is a collection of endpoints that implement the actual service. Example:   Name: \"mysvc\",   Subsets: [     {       Addresses: [{\"ip\": \"10.10.1.1\"}, {\"ip\": \"10.10.2.2\"}],       Ports: [{\"name\": \"a\", \"port\": 8675}, {\"name\": \"b\", \"port\": 309}]     },     {       Addresses: [{\"ip\": \"10.10.3.3\"}],       Ports: [{\"name\": \"a\", \"port\": 93}, {\"name\": \"b\", \"port\": 76}]     },  ]")
public class IoK8sApiCoreV1Endpoints  {
  
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
 /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
  **/
  private String apiVersion = null;

  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
 /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
  **/
  private String kind = null;

  @ApiModelProperty(value = "Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata")
  @Valid
 /**
   * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
  **/
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  @ApiModelProperty(value = "The set of all endpoints is the union of all subsets. Addresses are placed into subsets according to the IPs they share. A single address with multiple ports, some of which are ready and some of which are not (because they come from different containers) will result in the address being displayed in different subsets for the different ports. No address will appear in both Addresses and NotReadyAddresses in the same subset. Sets of addresses and ports that comprise a service.")
  @Valid
 /**
   * The set of all endpoints is the union of all subsets. Addresses are placed into subsets according to the IPs they share. A single address with multiple ports, some of which are ready and some of which are not (because they come from different containers) will result in the address being displayed in different subsets for the different ports. No address will appear in both Addresses and NotReadyAddresses in the same subset. Sets of addresses and ports that comprise a service.
  **/
  private List<IoK8sApiCoreV1EndpointSubset> subsets = null;
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

  public IoK8sApiCoreV1Endpoints apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
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

  public IoK8sApiCoreV1Endpoints kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
   * @return metadata
  **/
  @JsonProperty("metadata")
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public IoK8sApiCoreV1Endpoints metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * The set of all endpoints is the union of all subsets. Addresses are placed into subsets according to the IPs they share. A single address with multiple ports, some of which are ready and some of which are not (because they come from different containers) will result in the address being displayed in different subsets for the different ports. No address will appear in both Addresses and NotReadyAddresses in the same subset. Sets of addresses and ports that comprise a service.
   * @return subsets
  **/
  @JsonProperty("subsets")
  public List<IoK8sApiCoreV1EndpointSubset> getSubsets() {
    return subsets;
  }

  public void setSubsets(List<IoK8sApiCoreV1EndpointSubset> subsets) {
    this.subsets = subsets;
  }

  public IoK8sApiCoreV1Endpoints subsets(List<IoK8sApiCoreV1EndpointSubset> subsets) {
    this.subsets = subsets;
    return this;
  }

  public IoK8sApiCoreV1Endpoints addSubsetsItem(IoK8sApiCoreV1EndpointSubset subsetsItem) {
    this.subsets.add(subsetsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Endpoints {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    subsets: ").append(toIndentedString(subsets)).append("\n");
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

