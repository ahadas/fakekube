package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ObjectReference;
import fakekube.io.model.IoK8sApiDiscoveryV1beta1EndpointConditions;
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
  * Endpoint represents a single logical \"backend\" implementing a service.
 **/
@ApiModel(description="Endpoint represents a single logical \"backend\" implementing a service.")
public class IoK8sApiDiscoveryV1beta1Endpoint  {
  
  @ApiModelProperty(required = true, value = "addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.")
 /**
   * addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
  **/
  private List<String> addresses = new ArrayList<String>();

  @ApiModelProperty(value = "conditions contains information about the current status of the endpoint.")
  @Valid
 /**
   * conditions contains information about the current status of the endpoint.
  **/
  private IoK8sApiDiscoveryV1beta1EndpointConditions conditions = null;

  @ApiModelProperty(value = "hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must pass DNS Label (RFC 1123) validation.")
 /**
   * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must pass DNS Label (RFC 1123) validation.
  **/
  private String hostname = null;

  @ApiModelProperty(value = "targetRef is a reference to a Kubernetes object that represents this endpoint.")
  @Valid
 /**
   * targetRef is a reference to a Kubernetes object that represents this endpoint.
  **/
  private IoK8sApiCoreV1ObjectReference targetRef = null;

  @ApiModelProperty(value = "topology contains arbitrary topology information associated with the endpoint. These key/value pairs must conform with the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: * kubernetes.io/hostname: the value indicates the hostname of the node   where the endpoint is located. This should match the corresponding   node label. * topology.kubernetes.io/zone: the value indicates the zone where the   endpoint is located. This should match the corresponding node label. * topology.kubernetes.io/region: the value indicates the region where the   endpoint is located. This should match the corresponding node label.")
 /**
   * topology contains arbitrary topology information associated with the endpoint. These key/value pairs must conform with the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: * kubernetes.io/hostname: the value indicates the hostname of the node   where the endpoint is located. This should match the corresponding   node label. * topology.kubernetes.io/zone: the value indicates the zone where the   endpoint is located. This should match the corresponding node label. * topology.kubernetes.io/region: the value indicates the region where the   endpoint is located. This should match the corresponding node label.
  **/
  private Map<String, String> topology = null;
 /**
   * addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
   * @return addresses
  **/
  @JsonProperty("addresses")
  @NotNull
  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  public IoK8sApiDiscoveryV1beta1Endpoint addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public IoK8sApiDiscoveryV1beta1Endpoint addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

 /**
   * conditions contains information about the current status of the endpoint.
   * @return conditions
  **/
  @JsonProperty("conditions")
  public IoK8sApiDiscoveryV1beta1EndpointConditions getConditions() {
    return conditions;
  }

  public void setConditions(IoK8sApiDiscoveryV1beta1EndpointConditions conditions) {
    this.conditions = conditions;
  }

  public IoK8sApiDiscoveryV1beta1Endpoint conditions(IoK8sApiDiscoveryV1beta1EndpointConditions conditions) {
    this.conditions = conditions;
    return this;
  }

 /**
   * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must pass DNS Label (RFC 1123) validation.
   * @return hostname
  **/
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public IoK8sApiDiscoveryV1beta1Endpoint hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

 /**
   * targetRef is a reference to a Kubernetes object that represents this endpoint.
   * @return targetRef
  **/
  @JsonProperty("targetRef")
  public IoK8sApiCoreV1ObjectReference getTargetRef() {
    return targetRef;
  }

  public void setTargetRef(IoK8sApiCoreV1ObjectReference targetRef) {
    this.targetRef = targetRef;
  }

  public IoK8sApiDiscoveryV1beta1Endpoint targetRef(IoK8sApiCoreV1ObjectReference targetRef) {
    this.targetRef = targetRef;
    return this;
  }

 /**
   * topology contains arbitrary topology information associated with the endpoint. These key/value pairs must conform with the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: * kubernetes.io/hostname: the value indicates the hostname of the node   where the endpoint is located. This should match the corresponding   node label. * topology.kubernetes.io/zone: the value indicates the zone where the   endpoint is located. This should match the corresponding node label. * topology.kubernetes.io/region: the value indicates the region where the   endpoint is located. This should match the corresponding node label.
   * @return topology
  **/
  @JsonProperty("topology")
  public Map<String, String> getTopology() {
    return topology;
  }

  public void setTopology(Map<String, String> topology) {
    this.topology = topology;
  }

  public IoK8sApiDiscoveryV1beta1Endpoint topology(Map<String, String> topology) {
    this.topology = topology;
    return this;
  }

  public IoK8sApiDiscoveryV1beta1Endpoint putTopologyItem(String key, String topologyItem) {
    this.topology.put(key, topologyItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiDiscoveryV1beta1Endpoint {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
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

