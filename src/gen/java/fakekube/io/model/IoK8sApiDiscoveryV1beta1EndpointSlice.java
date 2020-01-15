package fakekube.io.model;

import fakekube.io.model.IoK8sApiDiscoveryV1beta1Endpoint;
import fakekube.io.model.IoK8sApiDiscoveryV1beta1EndpointPort;
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
  * EndpointSlice represents a subset of the endpoints that implement a service. For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.
 **/
@ApiModel(description="EndpointSlice represents a subset of the endpoints that implement a service. For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.")
public class IoK8sApiDiscoveryV1beta1EndpointSlice  {
  
  @ApiModelProperty(required = true, value = "addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.")
 /**
   * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
  **/
  private String addressType = null;

  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
 /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
  **/
  private String apiVersion = null;

  @ApiModelProperty(required = true, value = "endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.")
  @Valid
 /**
   * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
  **/
  private List<IoK8sApiDiscoveryV1beta1Endpoint> endpoints = new ArrayList<IoK8sApiDiscoveryV1beta1Endpoint>();

  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
 /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
  **/
  private String kind = null;

  @ApiModelProperty(value = "Standard object's metadata.")
  @Valid
 /**
   * Standard object's metadata.
  **/
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  @ApiModelProperty(value = "ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates \"all ports\". Each slice may include a maximum of 100 ports.")
  @Valid
 /**
   * ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates \"all ports\". Each slice may include a maximum of 100 ports.
  **/
  private List<IoK8sApiDiscoveryV1beta1EndpointPort> ports = null;
 /**
   * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
   * @return addressType
  **/
  @JsonProperty("addressType")
  @NotNull
  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public IoK8sApiDiscoveryV1beta1EndpointSlice addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

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

  public IoK8sApiDiscoveryV1beta1EndpointSlice apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

 /**
   * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
   * @return endpoints
  **/
  @JsonProperty("endpoints")
  @NotNull
  public List<IoK8sApiDiscoveryV1beta1Endpoint> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(List<IoK8sApiDiscoveryV1beta1Endpoint> endpoints) {
    this.endpoints = endpoints;
  }

  public IoK8sApiDiscoveryV1beta1EndpointSlice endpoints(List<IoK8sApiDiscoveryV1beta1Endpoint> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public IoK8sApiDiscoveryV1beta1EndpointSlice addEndpointsItem(IoK8sApiDiscoveryV1beta1Endpoint endpointsItem) {
    this.endpoints.add(endpointsItem);
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

  public IoK8sApiDiscoveryV1beta1EndpointSlice kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * Standard object&#39;s metadata.
   * @return metadata
  **/
  @JsonProperty("metadata")
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public IoK8sApiDiscoveryV1beta1EndpointSlice metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates \&quot;all ports\&quot;. Each slice may include a maximum of 100 ports.
   * @return ports
  **/
  @JsonProperty("ports")
  public List<IoK8sApiDiscoveryV1beta1EndpointPort> getPorts() {
    return ports;
  }

  public void setPorts(List<IoK8sApiDiscoveryV1beta1EndpointPort> ports) {
    this.ports = ports;
  }

  public IoK8sApiDiscoveryV1beta1EndpointSlice ports(List<IoK8sApiDiscoveryV1beta1EndpointPort> ports) {
    this.ports = ports;
    return this;
  }

  public IoK8sApiDiscoveryV1beta1EndpointSlice addPortsItem(IoK8sApiDiscoveryV1beta1EndpointPort portsItem) {
    this.ports.add(portsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiDiscoveryV1beta1EndpointSlice {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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

