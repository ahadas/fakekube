package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ServicePort;
import fakekube.io.model.IoK8sApiCoreV1SessionAffinityConfig;
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
  * ServiceSpec describes the attributes that a user creates on a service.
 **/
@ApiModel(description="ServiceSpec describes the attributes that a user creates on a service.")
public class IoK8sApiCoreV1ServiceSpec  {
  
  @ApiModelProperty(value = "clusterIP is the IP address of the service and is usually assigned randomly by the master. If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. This field can not be changed through updates. Valid values are \"None\", empty string (\"\"), or a valid IP address. \"None\" can be specified for headless services when proxying is not required. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies")
 /**
   * clusterIP is the IP address of the service and is usually assigned randomly by the master. If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. This field can not be changed through updates. Valid values are \"None\", empty string (\"\"), or a valid IP address. \"None\" can be specified for headless services when proxying is not required. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
  **/
  private String clusterIP = null;

  @ApiModelProperty(value = "externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.  These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.")
 /**
   * externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.  These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.
  **/
  private List<String> externalIPs = null;

  @ApiModelProperty(value = "externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service. No proxying will be involved. Must be a valid RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires Type to be ExternalName.")
 /**
   * externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service. No proxying will be involved. Must be a valid RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires Type to be ExternalName.
  **/
  private String externalName = null;

  @ApiModelProperty(value = "externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints. \"Local\" preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. \"Cluster\" obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading.")
 /**
   * externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints. \"Local\" preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. \"Cluster\" obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading.
  **/
  private String externalTrafficPolicy = null;

  @ApiModelProperty(value = "healthCheckNodePort specifies the healthcheck nodePort for the service. If not specified, HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will use user-specified nodePort value if specified by the client. Only effects when Type is set to LoadBalancer and ExternalTrafficPolicy is set to Local.")
 /**
   * healthCheckNodePort specifies the healthcheck nodePort for the service. If not specified, HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will use user-specified nodePort value if specified by the client. Only effects when Type is set to LoadBalancer and ExternalTrafficPolicy is set to Local.
  **/
  private Integer healthCheckNodePort = null;

  @ApiModelProperty(value = "ipFamily specifies whether this Service has a preference for a particular IP family (e.g. IPv4 vs. IPv6).  If a specific IP family is requested, the clusterIP field will be allocated from that family, if it is available in the cluster.  If no IP family is requested, the cluster's primary IP family will be used. Other IP fields (loadBalancerIP, loadBalancerSourceRanges, externalIPs) and controllers which allocate external load-balancers should use the same IP family.  Endpoints for this Service will be of this family.  This field is immutable after creation. Assigning a ServiceIPFamily not available in the cluster (e.g. IPv6 in IPv4 only cluster) is an error condition and will fail during clusterIP assignment.")
 /**
   * ipFamily specifies whether this Service has a preference for a particular IP family (e.g. IPv4 vs. IPv6).  If a specific IP family is requested, the clusterIP field will be allocated from that family, if it is available in the cluster.  If no IP family is requested, the cluster's primary IP family will be used. Other IP fields (loadBalancerIP, loadBalancerSourceRanges, externalIPs) and controllers which allocate external load-balancers should use the same IP family.  Endpoints for this Service will be of this family.  This field is immutable after creation. Assigning a ServiceIPFamily not available in the cluster (e.g. IPv6 in IPv4 only cluster) is an error condition and will fail during clusterIP assignment.
  **/
  private String ipFamily = null;

  @ApiModelProperty(value = "Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.")
 /**
   * Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.
  **/
  private String loadBalancerIP = null;

  @ApiModelProperty(value = "If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature.\" More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/")
 /**
   * If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature.\" More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
  **/
  private List<String> loadBalancerSourceRanges = null;

  @ApiModelProperty(value = "The list of ports that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies")
  @Valid
 /**
   * The list of ports that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
  **/
  private List<IoK8sApiCoreV1ServicePort> ports = null;

  @ApiModelProperty(value = "publishNotReadyAddresses, when set to true, indicates that DNS implementations must publish the notReadyAddresses of subsets for the Endpoints associated with the Service. The default value is false. The primary use case for setting this field is to use a StatefulSet's Headless Service to propagate SRV records for its Pods without respect to their readiness for purpose of peer discovery.")
 /**
   * publishNotReadyAddresses, when set to true, indicates that DNS implementations must publish the notReadyAddresses of subsets for the Endpoints associated with the Service. The default value is false. The primary use case for setting this field is to use a StatefulSet's Headless Service to propagate SRV records for its Pods without respect to their readiness for purpose of peer discovery.
  **/
  private Boolean publishNotReadyAddresses = null;

  @ApiModelProperty(value = "Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/")
 /**
   * Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
  **/
  private Map<String, String> selector = null;

  @ApiModelProperty(value = "Supports \"ClientIP\" and \"None\". Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies")
 /**
   * Supports \"ClientIP\" and \"None\". Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
  **/
  private String sessionAffinity = null;

  @ApiModelProperty(value = "sessionAffinityConfig contains the configurations of session affinity.")
  @Valid
 /**
   * sessionAffinityConfig contains the configurations of session affinity.
  **/
  private IoK8sApiCoreV1SessionAffinityConfig sessionAffinityConfig = null;

  @ApiModelProperty(value = "topologyKeys is a preference-order list of topology keys which implementations of services should use to preferentially sort endpoints when accessing this Service, it can not be used at the same time as externalTrafficPolicy=Local. Topology keys must be valid label keys and at most 16 keys may be specified. Endpoints are chosen based on the first topology key with available backends. If this field is specified and all entries have no backends that match the topology of the client, the service has no backends for that client and connections should fail. The special value \"*\" may be used to mean \"any topology\". This catch-all value, if used, only makes sense as the last value in the list. If this is not specified or empty, no topology constraints will be applied.")
 /**
   * topologyKeys is a preference-order list of topology keys which implementations of services should use to preferentially sort endpoints when accessing this Service, it can not be used at the same time as externalTrafficPolicy=Local. Topology keys must be valid label keys and at most 16 keys may be specified. Endpoints are chosen based on the first topology key with available backends. If this field is specified and all entries have no backends that match the topology of the client, the service has no backends for that client and connections should fail. The special value \"*\" may be used to mean \"any topology\". This catch-all value, if used, only makes sense as the last value in the list. If this is not specified or empty, no topology constraints will be applied.
  **/
  private List<String> topologyKeys = null;

  @ApiModelProperty(value = "type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. \"ExternalName\" maps to the specified externalName. \"ClusterIP\" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is \"None\", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. \"NodePort\" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. \"LoadBalancer\" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types")
 /**
   * type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. \"ExternalName\" maps to the specified externalName. \"ClusterIP\" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is \"None\", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. \"NodePort\" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. \"LoadBalancer\" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
  **/
  private String type = null;
 /**
   * clusterIP is the IP address of the service and is usually assigned randomly by the master. If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. This field can not be changed through updates. Valid values are \&quot;None\&quot;, empty string (\&quot;\&quot;), or a valid IP address. \&quot;None\&quot; can be specified for headless services when proxying is not required. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   * @return clusterIP
  **/
  @JsonProperty("clusterIP")
  public String getClusterIP() {
    return clusterIP;
  }

  public void setClusterIP(String clusterIP) {
    this.clusterIP = clusterIP;
  }

  public IoK8sApiCoreV1ServiceSpec clusterIP(String clusterIP) {
    this.clusterIP = clusterIP;
    return this;
  }

 /**
   * externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.  These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.
   * @return externalIPs
  **/
  @JsonProperty("externalIPs")
  public List<String> getExternalIPs() {
    return externalIPs;
  }

  public void setExternalIPs(List<String> externalIPs) {
    this.externalIPs = externalIPs;
  }

  public IoK8sApiCoreV1ServiceSpec externalIPs(List<String> externalIPs) {
    this.externalIPs = externalIPs;
    return this;
  }

  public IoK8sApiCoreV1ServiceSpec addExternalIPsItem(String externalIPsItem) {
    this.externalIPs.add(externalIPsItem);
    return this;
  }

 /**
   * externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service. No proxying will be involved. Must be a valid RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires Type to be ExternalName.
   * @return externalName
  **/
  @JsonProperty("externalName")
  public String getExternalName() {
    return externalName;
  }

  public void setExternalName(String externalName) {
    this.externalName = externalName;
  }

  public IoK8sApiCoreV1ServiceSpec externalName(String externalName) {
    this.externalName = externalName;
    return this;
  }

 /**
   * externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints. \&quot;Local\&quot; preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. \&quot;Cluster\&quot; obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading.
   * @return externalTrafficPolicy
  **/
  @JsonProperty("externalTrafficPolicy")
  public String getExternalTrafficPolicy() {
    return externalTrafficPolicy;
  }

  public void setExternalTrafficPolicy(String externalTrafficPolicy) {
    this.externalTrafficPolicy = externalTrafficPolicy;
  }

  public IoK8sApiCoreV1ServiceSpec externalTrafficPolicy(String externalTrafficPolicy) {
    this.externalTrafficPolicy = externalTrafficPolicy;
    return this;
  }

 /**
   * healthCheckNodePort specifies the healthcheck nodePort for the service. If not specified, HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will use user-specified nodePort value if specified by the client. Only effects when Type is set to LoadBalancer and ExternalTrafficPolicy is set to Local.
   * @return healthCheckNodePort
  **/
  @JsonProperty("healthCheckNodePort")
  public Integer getHealthCheckNodePort() {
    return healthCheckNodePort;
  }

  public void setHealthCheckNodePort(Integer healthCheckNodePort) {
    this.healthCheckNodePort = healthCheckNodePort;
  }

  public IoK8sApiCoreV1ServiceSpec healthCheckNodePort(Integer healthCheckNodePort) {
    this.healthCheckNodePort = healthCheckNodePort;
    return this;
  }

 /**
   * ipFamily specifies whether this Service has a preference for a particular IP family (e.g. IPv4 vs. IPv6).  If a specific IP family is requested, the clusterIP field will be allocated from that family, if it is available in the cluster.  If no IP family is requested, the cluster&#39;s primary IP family will be used. Other IP fields (loadBalancerIP, loadBalancerSourceRanges, externalIPs) and controllers which allocate external load-balancers should use the same IP family.  Endpoints for this Service will be of this family.  This field is immutable after creation. Assigning a ServiceIPFamily not available in the cluster (e.g. IPv6 in IPv4 only cluster) is an error condition and will fail during clusterIP assignment.
   * @return ipFamily
  **/
  @JsonProperty("ipFamily")
  public String getIpFamily() {
    return ipFamily;
  }

  public void setIpFamily(String ipFamily) {
    this.ipFamily = ipFamily;
  }

  public IoK8sApiCoreV1ServiceSpec ipFamily(String ipFamily) {
    this.ipFamily = ipFamily;
    return this;
  }

 /**
   * Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.
   * @return loadBalancerIP
  **/
  @JsonProperty("loadBalancerIP")
  public String getLoadBalancerIP() {
    return loadBalancerIP;
  }

  public void setLoadBalancerIP(String loadBalancerIP) {
    this.loadBalancerIP = loadBalancerIP;
  }

  public IoK8sApiCoreV1ServiceSpec loadBalancerIP(String loadBalancerIP) {
    this.loadBalancerIP = loadBalancerIP;
    return this;
  }

 /**
   * If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature.\&quot; More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
   * @return loadBalancerSourceRanges
  **/
  @JsonProperty("loadBalancerSourceRanges")
  public List<String> getLoadBalancerSourceRanges() {
    return loadBalancerSourceRanges;
  }

  public void setLoadBalancerSourceRanges(List<String> loadBalancerSourceRanges) {
    this.loadBalancerSourceRanges = loadBalancerSourceRanges;
  }

  public IoK8sApiCoreV1ServiceSpec loadBalancerSourceRanges(List<String> loadBalancerSourceRanges) {
    this.loadBalancerSourceRanges = loadBalancerSourceRanges;
    return this;
  }

  public IoK8sApiCoreV1ServiceSpec addLoadBalancerSourceRangesItem(String loadBalancerSourceRangesItem) {
    this.loadBalancerSourceRanges.add(loadBalancerSourceRangesItem);
    return this;
  }

 /**
   * The list of ports that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   * @return ports
  **/
  @JsonProperty("ports")
  public List<IoK8sApiCoreV1ServicePort> getPorts() {
    return ports;
  }

  public void setPorts(List<IoK8sApiCoreV1ServicePort> ports) {
    this.ports = ports;
  }

  public IoK8sApiCoreV1ServiceSpec ports(List<IoK8sApiCoreV1ServicePort> ports) {
    this.ports = ports;
    return this;
  }

  public IoK8sApiCoreV1ServiceSpec addPortsItem(IoK8sApiCoreV1ServicePort portsItem) {
    this.ports.add(portsItem);
    return this;
  }

 /**
   * publishNotReadyAddresses, when set to true, indicates that DNS implementations must publish the notReadyAddresses of subsets for the Endpoints associated with the Service. The default value is false. The primary use case for setting this field is to use a StatefulSet&#39;s Headless Service to propagate SRV records for its Pods without respect to their readiness for purpose of peer discovery.
   * @return publishNotReadyAddresses
  **/
  @JsonProperty("publishNotReadyAddresses")
  public Boolean isPublishNotReadyAddresses() {
    return publishNotReadyAddresses;
  }

  public void setPublishNotReadyAddresses(Boolean publishNotReadyAddresses) {
    this.publishNotReadyAddresses = publishNotReadyAddresses;
  }

  public IoK8sApiCoreV1ServiceSpec publishNotReadyAddresses(Boolean publishNotReadyAddresses) {
    this.publishNotReadyAddresses = publishNotReadyAddresses;
    return this;
  }

 /**
   * Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
   * @return selector
  **/
  @JsonProperty("selector")
  public Map<String, String> getSelector() {
    return selector;
  }

  public void setSelector(Map<String, String> selector) {
    this.selector = selector;
  }

  public IoK8sApiCoreV1ServiceSpec selector(Map<String, String> selector) {
    this.selector = selector;
    return this;
  }

  public IoK8sApiCoreV1ServiceSpec putSelectorItem(String key, String selectorItem) {
    this.selector.put(key, selectorItem);
    return this;
  }

 /**
   * Supports \&quot;ClientIP\&quot; and \&quot;None\&quot;. Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   * @return sessionAffinity
  **/
  @JsonProperty("sessionAffinity")
  public String getSessionAffinity() {
    return sessionAffinity;
  }

  public void setSessionAffinity(String sessionAffinity) {
    this.sessionAffinity = sessionAffinity;
  }

  public IoK8sApiCoreV1ServiceSpec sessionAffinity(String sessionAffinity) {
    this.sessionAffinity = sessionAffinity;
    return this;
  }

 /**
   * sessionAffinityConfig contains the configurations of session affinity.
   * @return sessionAffinityConfig
  **/
  @JsonProperty("sessionAffinityConfig")
  public IoK8sApiCoreV1SessionAffinityConfig getSessionAffinityConfig() {
    return sessionAffinityConfig;
  }

  public void setSessionAffinityConfig(IoK8sApiCoreV1SessionAffinityConfig sessionAffinityConfig) {
    this.sessionAffinityConfig = sessionAffinityConfig;
  }

  public IoK8sApiCoreV1ServiceSpec sessionAffinityConfig(IoK8sApiCoreV1SessionAffinityConfig sessionAffinityConfig) {
    this.sessionAffinityConfig = sessionAffinityConfig;
    return this;
  }

 /**
   * topologyKeys is a preference-order list of topology keys which implementations of services should use to preferentially sort endpoints when accessing this Service, it can not be used at the same time as externalTrafficPolicy&#x3D;Local. Topology keys must be valid label keys and at most 16 keys may be specified. Endpoints are chosen based on the first topology key with available backends. If this field is specified and all entries have no backends that match the topology of the client, the service has no backends for that client and connections should fail. The special value \&quot;*\&quot; may be used to mean \&quot;any topology\&quot;. This catch-all value, if used, only makes sense as the last value in the list. If this is not specified or empty, no topology constraints will be applied.
   * @return topologyKeys
  **/
  @JsonProperty("topologyKeys")
  public List<String> getTopologyKeys() {
    return topologyKeys;
  }

  public void setTopologyKeys(List<String> topologyKeys) {
    this.topologyKeys = topologyKeys;
  }

  public IoK8sApiCoreV1ServiceSpec topologyKeys(List<String> topologyKeys) {
    this.topologyKeys = topologyKeys;
    return this;
  }

  public IoK8sApiCoreV1ServiceSpec addTopologyKeysItem(String topologyKeysItem) {
    this.topologyKeys.add(topologyKeysItem);
    return this;
  }

 /**
   * type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. \&quot;ExternalName\&quot; maps to the specified externalName. \&quot;ClusterIP\&quot; allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is \&quot;None\&quot;, no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. \&quot;NodePort\&quot; builds on ClusterIP and allocates a port on every node which routes to the clusterIP. \&quot;LoadBalancer\&quot; builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiCoreV1ServiceSpec type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ServiceSpec {\n");
    
    sb.append("    clusterIP: ").append(toIndentedString(clusterIP)).append("\n");
    sb.append("    externalIPs: ").append(toIndentedString(externalIPs)).append("\n");
    sb.append("    externalName: ").append(toIndentedString(externalName)).append("\n");
    sb.append("    externalTrafficPolicy: ").append(toIndentedString(externalTrafficPolicy)).append("\n");
    sb.append("    healthCheckNodePort: ").append(toIndentedString(healthCheckNodePort)).append("\n");
    sb.append("    ipFamily: ").append(toIndentedString(ipFamily)).append("\n");
    sb.append("    loadBalancerIP: ").append(toIndentedString(loadBalancerIP)).append("\n");
    sb.append("    loadBalancerSourceRanges: ").append(toIndentedString(loadBalancerSourceRanges)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    publishNotReadyAddresses: ").append(toIndentedString(publishNotReadyAddresses)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    sessionAffinity: ").append(toIndentedString(sessionAffinity)).append("\n");
    sb.append("    sessionAffinityConfig: ").append(toIndentedString(sessionAffinityConfig)).append("\n");
    sb.append("    topologyKeys: ").append(toIndentedString(topologyKeys)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

