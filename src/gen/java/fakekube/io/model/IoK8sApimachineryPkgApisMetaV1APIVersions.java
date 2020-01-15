package fakekube.io.model;

import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR;
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
  * APIVersions lists the versions that are available, to allow clients to discover the API at /api, which is the root path of the legacy v1 API.
 **/
@ApiModel(description="APIVersions lists the versions that are available, to allow clients to discover the API at /api, which is the root path of the legacy v1 API.")
public class IoK8sApimachineryPkgApisMetaV1APIVersions  {
  
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

  @ApiModelProperty(required = true, value = "a map of client CIDR to server address that is serving this group. This is to help clients reach servers in the most network-efficient way possible. Clients can use the appropriate server address as per the CIDR that they match. In case of multiple matches, clients should use the longest matching CIDR. The server returns only those CIDRs that it thinks that the client can match. For example: the master will return an internal IP CIDR only, if the client reaches the server using an internal IP. Server looks at X-Forwarded-For header or X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.")
  @Valid
 /**
   * a map of client CIDR to server address that is serving this group. This is to help clients reach servers in the most network-efficient way possible. Clients can use the appropriate server address as per the CIDR that they match. In case of multiple matches, clients should use the longest matching CIDR. The server returns only those CIDRs that it thinks that the client can match. For example: the master will return an internal IP CIDR only, if the client reaches the server using an internal IP. Server looks at X-Forwarded-For header or X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.
  **/
  private List<IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR> serverAddressByClientCIDRs = new ArrayList<IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR>();

  @ApiModelProperty(required = true, value = "versions are the api versions that are available.")
 /**
   * versions are the api versions that are available.
  **/
  private List<String> versions = new ArrayList<String>();
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

  public IoK8sApimachineryPkgApisMetaV1APIVersions apiVersion(String apiVersion) {
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

  public IoK8sApimachineryPkgApisMetaV1APIVersions kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * a map of client CIDR to server address that is serving this group. This is to help clients reach servers in the most network-efficient way possible. Clients can use the appropriate server address as per the CIDR that they match. In case of multiple matches, clients should use the longest matching CIDR. The server returns only those CIDRs that it thinks that the client can match. For example: the master will return an internal IP CIDR only, if the client reaches the server using an internal IP. Server looks at X-Forwarded-For header or X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.
   * @return serverAddressByClientCIDRs
  **/
  @JsonProperty("serverAddressByClientCIDRs")
  @NotNull
  public List<IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR> getServerAddressByClientCIDRs() {
    return serverAddressByClientCIDRs;
  }

  public void setServerAddressByClientCIDRs(List<IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR> serverAddressByClientCIDRs) {
    this.serverAddressByClientCIDRs = serverAddressByClientCIDRs;
  }

  public IoK8sApimachineryPkgApisMetaV1APIVersions serverAddressByClientCIDRs(List<IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR> serverAddressByClientCIDRs) {
    this.serverAddressByClientCIDRs = serverAddressByClientCIDRs;
    return this;
  }

  public IoK8sApimachineryPkgApisMetaV1APIVersions addServerAddressByClientCIDRsItem(IoK8sApimachineryPkgApisMetaV1ServerAddressByClientCIDR serverAddressByClientCIDRsItem) {
    this.serverAddressByClientCIDRs.add(serverAddressByClientCIDRsItem);
    return this;
  }

 /**
   * versions are the api versions that are available.
   * @return versions
  **/
  @JsonProperty("versions")
  @NotNull
  public List<String> getVersions() {
    return versions;
  }

  public void setVersions(List<String> versions) {
    this.versions = versions;
  }

  public IoK8sApimachineryPkgApisMetaV1APIVersions versions(List<String> versions) {
    this.versions = versions;
    return this;
  }

  public IoK8sApimachineryPkgApisMetaV1APIVersions addVersionsItem(String versionsItem) {
    this.versions.add(versionsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1APIVersions {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    serverAddressByClientCIDRs: ").append(toIndentedString(serverAddressByClientCIDRs)).append("\n");
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

