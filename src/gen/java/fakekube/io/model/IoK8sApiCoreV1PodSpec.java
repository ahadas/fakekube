package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1Affinity;
import fakekube.io.model.IoK8sApiCoreV1Container;
import fakekube.io.model.IoK8sApiCoreV1EphemeralContainer;
import fakekube.io.model.IoK8sApiCoreV1HostAlias;
import fakekube.io.model.IoK8sApiCoreV1LocalObjectReference;
import fakekube.io.model.IoK8sApiCoreV1PodDNSConfig;
import fakekube.io.model.IoK8sApiCoreV1PodReadinessGate;
import fakekube.io.model.IoK8sApiCoreV1PodSecurityContext;
import fakekube.io.model.IoK8sApiCoreV1Toleration;
import fakekube.io.model.IoK8sApiCoreV1TopologySpreadConstraint;
import fakekube.io.model.IoK8sApiCoreV1Volume;
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
  * PodSpec is a description of a pod.
 **/
@ApiModel(description="PodSpec is a description of a pod.")
public class IoK8sApiCoreV1PodSpec  {
  
  @ApiModelProperty(value = "Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.")
 /**
   * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.
  **/
  private Long activeDeadlineSeconds = null;

  @ApiModelProperty(value = "If specified, the pod's scheduling constraints")
  @Valid
 /**
   * If specified, the pod's scheduling constraints
  **/
  private IoK8sApiCoreV1Affinity affinity = null;

  @ApiModelProperty(value = "AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.")
 /**
   * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
  **/
  private Boolean automountServiceAccountToken = null;

  @ApiModelProperty(required = true, value = "List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.")
  @Valid
 /**
   * List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
  **/
  private List<IoK8sApiCoreV1Container> containers = new ArrayList<IoK8sApiCoreV1Container>();

  @ApiModelProperty(value = "Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.")
  @Valid
 /**
   * Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.
  **/
  private IoK8sApiCoreV1PodDNSConfig dnsConfig = null;

  @ApiModelProperty(value = "Set DNS policy for the pod. Defaults to \"ClusterFirst\". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.")
 /**
   * Set DNS policy for the pod. Defaults to \"ClusterFirst\". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
  **/
  private String dnsPolicy = null;

  @ApiModelProperty(value = "EnableServiceLinks indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links. Optional: Defaults to true.")
 /**
   * EnableServiceLinks indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links. Optional: Defaults to true.
  **/
  private Boolean enableServiceLinks = null;

  @ApiModelProperty(value = "List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers subresource. This field is alpha-level and is only honored by servers that enable the EphemeralContainers feature.")
  @Valid
 /**
   * List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers subresource. This field is alpha-level and is only honored by servers that enable the EphemeralContainers feature.
  **/
  private List<IoK8sApiCoreV1EphemeralContainer> ephemeralContainers = null;

  @ApiModelProperty(value = "HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is only valid for non-hostNetwork pods.")
  @Valid
 /**
   * HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is only valid for non-hostNetwork pods.
  **/
  private List<IoK8sApiCoreV1HostAlias> hostAliases = null;

  @ApiModelProperty(value = "Use the host's ipc namespace. Optional: Default to false.")
 /**
   * Use the host's ipc namespace. Optional: Default to false.
  **/
  private Boolean hostIPC = null;

  @ApiModelProperty(value = "Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.")
 /**
   * Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.
  **/
  private Boolean hostNetwork = null;

  @ApiModelProperty(value = "Use the host's pid namespace. Optional: Default to false.")
 /**
   * Use the host's pid namespace. Optional: Default to false.
  **/
  private Boolean hostPID = null;

  @ApiModelProperty(value = "Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.")
 /**
   * Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.
  **/
  private String hostname = null;

  @ApiModelProperty(value = "ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod")
  @Valid
 /**
   * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
  **/
  private List<IoK8sApiCoreV1LocalObjectReference> imagePullSecrets = null;

  @ApiModelProperty(value = "List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/")
  @Valid
 /**
   * List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
  **/
  private List<IoK8sApiCoreV1Container> initContainers = null;

  @ApiModelProperty(value = "NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.")
 /**
   * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
  **/
  private String nodeName = null;

  @ApiModelProperty(value = "NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/")
 /**
   * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
  **/
  private Map<String, String> nodeSelector = null;

  @ApiModelProperty(value = "Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More info: https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.16, and is only honored by servers that enable the PodOverhead feature.")
 /**
   * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More info: https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.16, and is only honored by servers that enable the PodOverhead feature.
  **/
  private Map<String, String> overhead = null;

  @ApiModelProperty(value = "PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.")
 /**
   * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
  **/
  private String preemptionPolicy = null;

  @ApiModelProperty(value = "The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.")
 /**
   * The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.
  **/
  private Integer priority = null;

  @ApiModelProperty(value = "If specified, indicates the pod's priority. \"system-node-critical\" and \"system-cluster-critical\" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.")
 /**
   * If specified, indicates the pod's priority. \"system-node-critical\" and \"system-cluster-critical\" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
  **/
  private String priorityClassName = null;

  @ApiModelProperty(value = "If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to \"True\" More info: https://git.k8s.io/enhancements/keps/sig-network/0007-pod-ready%2B%2B.md")
  @Valid
 /**
   * If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to \"True\" More info: https://git.k8s.io/enhancements/keps/sig-network/0007-pod-ready%2B%2B.md
  **/
  private List<IoK8sApiCoreV1PodReadinessGate> readinessGates = null;

  @ApiModelProperty(value = "Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy")
 /**
   * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
  **/
  private String restartPolicy = null;

  @ApiModelProperty(value = "RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the \"legacy\" RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md This is a beta feature as of Kubernetes v1.14.")
 /**
   * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the \"legacy\" RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md This is a beta feature as of Kubernetes v1.14.
  **/
  private String runtimeClassName = null;

  @ApiModelProperty(value = "If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.")
 /**
   * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
  **/
  private String schedulerName = null;

  @ApiModelProperty(value = "SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty.  See type description for default values of each field.")
  @Valid
 /**
   * SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty.  See type description for default values of each field.
  **/
  private IoK8sApiCoreV1PodSecurityContext securityContext = null;

  @ApiModelProperty(value = "DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.")
 /**
   * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.
  **/
  private String serviceAccount = null;

  @ApiModelProperty(value = "ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/")
 /**
   * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
  **/
  private String serviceAccountName = null;

  @ApiModelProperty(value = "Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false.")
 /**
   * Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false.
  **/
  private Boolean shareProcessNamespace = null;

  @ApiModelProperty(value = "If specified, the fully qualified Pod hostname will be \"<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>\". If not specified, the pod will not have a domainname at all.")
 /**
   * If specified, the fully qualified Pod hostname will be \"<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>\". If not specified, the pod will not have a domainname at all.
  **/
  private String subdomain = null;

  @ApiModelProperty(value = "Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.")
 /**
   * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
  **/
  private Long terminationGracePeriodSeconds = null;

  @ApiModelProperty(value = "If specified, the pod's tolerations.")
  @Valid
 /**
   * If specified, the pod's tolerations.
  **/
  private List<IoK8sApiCoreV1Toleration> tolerations = null;

  @ApiModelProperty(value = "TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule pods in a way which abides by the constraints. This field is alpha-level and is only honored by clusters that enables the EvenPodsSpread feature. All topologySpreadConstraints are ANDed.")
  @Valid
 /**
   * TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule pods in a way which abides by the constraints. This field is alpha-level and is only honored by clusters that enables the EvenPodsSpread feature. All topologySpreadConstraints are ANDed.
  **/
  private List<IoK8sApiCoreV1TopologySpreadConstraint> topologySpreadConstraints = null;

  @ApiModelProperty(value = "List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes")
  @Valid
 /**
   * List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes
  **/
  private List<IoK8sApiCoreV1Volume> volumes = null;
 /**
   * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.
   * @return activeDeadlineSeconds
  **/
  @JsonProperty("activeDeadlineSeconds")
  public Long getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }

  public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }

  public IoK8sApiCoreV1PodSpec activeDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

 /**
   * If specified, the pod&#39;s scheduling constraints
   * @return affinity
  **/
  @JsonProperty("affinity")
  public IoK8sApiCoreV1Affinity getAffinity() {
    return affinity;
  }

  public void setAffinity(IoK8sApiCoreV1Affinity affinity) {
    this.affinity = affinity;
  }

  public IoK8sApiCoreV1PodSpec affinity(IoK8sApiCoreV1Affinity affinity) {
    this.affinity = affinity;
    return this;
  }

 /**
   * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
   * @return automountServiceAccountToken
  **/
  @JsonProperty("automountServiceAccountToken")
  public Boolean isAutomountServiceAccountToken() {
    return automountServiceAccountToken;
  }

  public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
  }

  public IoK8sApiCoreV1PodSpec automountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
    return this;
  }

 /**
   * List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
   * @return containers
  **/
  @JsonProperty("containers")
  @NotNull
  public List<IoK8sApiCoreV1Container> getContainers() {
    return containers;
  }

  public void setContainers(List<IoK8sApiCoreV1Container> containers) {
    this.containers = containers;
  }

  public IoK8sApiCoreV1PodSpec containers(List<IoK8sApiCoreV1Container> containers) {
    this.containers = containers;
    return this;
  }

  public IoK8sApiCoreV1PodSpec addContainersItem(IoK8sApiCoreV1Container containersItem) {
    this.containers.add(containersItem);
    return this;
  }

 /**
   * Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.
   * @return dnsConfig
  **/
  @JsonProperty("dnsConfig")
  public IoK8sApiCoreV1PodDNSConfig getDnsConfig() {
    return dnsConfig;
  }

  public void setDnsConfig(IoK8sApiCoreV1PodDNSConfig dnsConfig) {
    this.dnsConfig = dnsConfig;
  }

  public IoK8sApiCoreV1PodSpec dnsConfig(IoK8sApiCoreV1PodDNSConfig dnsConfig) {
    this.dnsConfig = dnsConfig;
    return this;
  }

 /**
   * Set DNS policy for the pod. Defaults to \&quot;ClusterFirst\&quot;. Valid values are &#39;ClusterFirstWithHostNet&#39;, &#39;ClusterFirst&#39;, &#39;Default&#39; or &#39;None&#39;. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to &#39;ClusterFirstWithHostNet&#39;.
   * @return dnsPolicy
  **/
  @JsonProperty("dnsPolicy")
  public String getDnsPolicy() {
    return dnsPolicy;
  }

  public void setDnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
  }

  public IoK8sApiCoreV1PodSpec dnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
    return this;
  }

 /**
   * EnableServiceLinks indicates whether information about services should be injected into pod&#39;s environment variables, matching the syntax of Docker links. Optional: Defaults to true.
   * @return enableServiceLinks
  **/
  @JsonProperty("enableServiceLinks")
  public Boolean isEnableServiceLinks() {
    return enableServiceLinks;
  }

  public void setEnableServiceLinks(Boolean enableServiceLinks) {
    this.enableServiceLinks = enableServiceLinks;
  }

  public IoK8sApiCoreV1PodSpec enableServiceLinks(Boolean enableServiceLinks) {
    this.enableServiceLinks = enableServiceLinks;
    return this;
  }

 /**
   * List of ephemeral containers run in this pod. Ephemeral containers may be run in an existing pod to perform user-initiated actions such as debugging. This list cannot be specified when creating a pod, and it cannot be modified by updating the pod spec. In order to add an ephemeral container to an existing pod, use the pod&#39;s ephemeralcontainers subresource. This field is alpha-level and is only honored by servers that enable the EphemeralContainers feature.
   * @return ephemeralContainers
  **/
  @JsonProperty("ephemeralContainers")
  public List<IoK8sApiCoreV1EphemeralContainer> getEphemeralContainers() {
    return ephemeralContainers;
  }

  public void setEphemeralContainers(List<IoK8sApiCoreV1EphemeralContainer> ephemeralContainers) {
    this.ephemeralContainers = ephemeralContainers;
  }

  public IoK8sApiCoreV1PodSpec ephemeralContainers(List<IoK8sApiCoreV1EphemeralContainer> ephemeralContainers) {
    this.ephemeralContainers = ephemeralContainers;
    return this;
  }

  public IoK8sApiCoreV1PodSpec addEphemeralContainersItem(IoK8sApiCoreV1EphemeralContainer ephemeralContainersItem) {
    this.ephemeralContainers.add(ephemeralContainersItem);
    return this;
  }

 /**
   * HostAliases is an optional list of hosts and IPs that will be injected into the pod&#39;s hosts file if specified. This is only valid for non-hostNetwork pods.
   * @return hostAliases
  **/
  @JsonProperty("hostAliases")
  public List<IoK8sApiCoreV1HostAlias> getHostAliases() {
    return hostAliases;
  }

  public void setHostAliases(List<IoK8sApiCoreV1HostAlias> hostAliases) {
    this.hostAliases = hostAliases;
  }

  public IoK8sApiCoreV1PodSpec hostAliases(List<IoK8sApiCoreV1HostAlias> hostAliases) {
    this.hostAliases = hostAliases;
    return this;
  }

  public IoK8sApiCoreV1PodSpec addHostAliasesItem(IoK8sApiCoreV1HostAlias hostAliasesItem) {
    this.hostAliases.add(hostAliasesItem);
    return this;
  }

 /**
   * Use the host&#39;s ipc namespace. Optional: Default to false.
   * @return hostIPC
  **/
  @JsonProperty("hostIPC")
  public Boolean isHostIPC() {
    return hostIPC;
  }

  public void setHostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
  }

  public IoK8sApiCoreV1PodSpec hostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
    return this;
  }

 /**
   * Host networking requested for this pod. Use the host&#39;s network namespace. If this option is set, the ports that will be used must be specified. Default to false.
   * @return hostNetwork
  **/
  @JsonProperty("hostNetwork")
  public Boolean isHostNetwork() {
    return hostNetwork;
  }

  public void setHostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
  }

  public IoK8sApiCoreV1PodSpec hostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
    return this;
  }

 /**
   * Use the host&#39;s pid namespace. Optional: Default to false.
   * @return hostPID
  **/
  @JsonProperty("hostPID")
  public Boolean isHostPID() {
    return hostPID;
  }

  public void setHostPID(Boolean hostPID) {
    this.hostPID = hostPID;
  }

  public IoK8sApiCoreV1PodSpec hostPID(Boolean hostPID) {
    this.hostPID = hostPID;
    return this;
  }

 /**
   * Specifies the hostname of the Pod If not specified, the pod&#39;s hostname will be set to a system-defined value.
   * @return hostname
  **/
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public IoK8sApiCoreV1PodSpec hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

 /**
   * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
   * @return imagePullSecrets
  **/
  @JsonProperty("imagePullSecrets")
  public List<IoK8sApiCoreV1LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }

  public void setImagePullSecrets(List<IoK8sApiCoreV1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }

  public IoK8sApiCoreV1PodSpec imagePullSecrets(List<IoK8sApiCoreV1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public IoK8sApiCoreV1PodSpec addImagePullSecretsItem(IoK8sApiCoreV1LocalObjectReference imagePullSecretsItem) {
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

 /**
   * List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
   * @return initContainers
  **/
  @JsonProperty("initContainers")
  public List<IoK8sApiCoreV1Container> getInitContainers() {
    return initContainers;
  }

  public void setInitContainers(List<IoK8sApiCoreV1Container> initContainers) {
    this.initContainers = initContainers;
  }

  public IoK8sApiCoreV1PodSpec initContainers(List<IoK8sApiCoreV1Container> initContainers) {
    this.initContainers = initContainers;
    return this;
  }

  public IoK8sApiCoreV1PodSpec addInitContainersItem(IoK8sApiCoreV1Container initContainersItem) {
    this.initContainers.add(initContainersItem);
    return this;
  }

 /**
   * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
   * @return nodeName
  **/
  @JsonProperty("nodeName")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public IoK8sApiCoreV1PodSpec nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

 /**
   * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node&#39;s labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
   * @return nodeSelector
  **/
  @JsonProperty("nodeSelector")
  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }

  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }

  public IoK8sApiCoreV1PodSpec nodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  public IoK8sApiCoreV1PodSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

 /**
   * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass admission controller. If the RuntimeClass admission controller is enabled, overhead must not be set in Pod create requests. The RuntimeClass admission controller will reject Pod create requests which have the overhead already set. If RuntimeClass is configured and selected in the PodSpec, Overhead will be set to the value defined in the corresponding RuntimeClass, otherwise it will remain unset and treated as zero. More info: https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.16, and is only honored by servers that enable the PodOverhead feature.
   * @return overhead
  **/
  @JsonProperty("overhead")
  public Map<String, String> getOverhead() {
    return overhead;
  }

  public void setOverhead(Map<String, String> overhead) {
    this.overhead = overhead;
  }

  public IoK8sApiCoreV1PodSpec overhead(Map<String, String> overhead) {
    this.overhead = overhead;
    return this;
  }

  public IoK8sApiCoreV1PodSpec putOverheadItem(String key, String overheadItem) {
    this.overhead.put(key, overheadItem);
    return this;
  }

 /**
   * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
   * @return preemptionPolicy
  **/
  @JsonProperty("preemptionPolicy")
  public String getPreemptionPolicy() {
    return preemptionPolicy;
  }

  public void setPreemptionPolicy(String preemptionPolicy) {
    this.preemptionPolicy = preemptionPolicy;
  }

  public IoK8sApiCoreV1PodSpec preemptionPolicy(String preemptionPolicy) {
    this.preemptionPolicy = preemptionPolicy;
    return this;
  }

 /**
   * The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.
   * @return priority
  **/
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public IoK8sApiCoreV1PodSpec priority(Integer priority) {
    this.priority = priority;
    return this;
  }

 /**
   * If specified, indicates the pod&#39;s priority. \&quot;system-node-critical\&quot; and \&quot;system-cluster-critical\&quot; are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
   * @return priorityClassName
  **/
  @JsonProperty("priorityClassName")
  public String getPriorityClassName() {
    return priorityClassName;
  }

  public void setPriorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
  }

  public IoK8sApiCoreV1PodSpec priorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
    return this;
  }

 /**
   * If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to \&quot;True\&quot; More info: https://git.k8s.io/enhancements/keps/sig-network/0007-pod-ready%2B%2B.md
   * @return readinessGates
  **/
  @JsonProperty("readinessGates")
  public List<IoK8sApiCoreV1PodReadinessGate> getReadinessGates() {
    return readinessGates;
  }

  public void setReadinessGates(List<IoK8sApiCoreV1PodReadinessGate> readinessGates) {
    this.readinessGates = readinessGates;
  }

  public IoK8sApiCoreV1PodSpec readinessGates(List<IoK8sApiCoreV1PodReadinessGate> readinessGates) {
    this.readinessGates = readinessGates;
    return this;
  }

  public IoK8sApiCoreV1PodSpec addReadinessGatesItem(IoK8sApiCoreV1PodReadinessGate readinessGatesItem) {
    this.readinessGates.add(readinessGatesItem);
    return this;
  }

 /**
   * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
   * @return restartPolicy
  **/
  @JsonProperty("restartPolicy")
  public String getRestartPolicy() {
    return restartPolicy;
  }

  public void setRestartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
  }

  public IoK8sApiCoreV1PodSpec restartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
    return this;
  }

 /**
   * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the \&quot;legacy\&quot; RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md This is a beta feature as of Kubernetes v1.14.
   * @return runtimeClassName
  **/
  @JsonProperty("runtimeClassName")
  public String getRuntimeClassName() {
    return runtimeClassName;
  }

  public void setRuntimeClassName(String runtimeClassName) {
    this.runtimeClassName = runtimeClassName;
  }

  public IoK8sApiCoreV1PodSpec runtimeClassName(String runtimeClassName) {
    this.runtimeClassName = runtimeClassName;
    return this;
  }

 /**
   * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
   * @return schedulerName
  **/
  @JsonProperty("schedulerName")
  public String getSchedulerName() {
    return schedulerName;
  }

  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }

  public IoK8sApiCoreV1PodSpec schedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
    return this;
  }

 /**
   * SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty.  See type description for default values of each field.
   * @return securityContext
  **/
  @JsonProperty("securityContext")
  public IoK8sApiCoreV1PodSecurityContext getSecurityContext() {
    return securityContext;
  }

  public void setSecurityContext(IoK8sApiCoreV1PodSecurityContext securityContext) {
    this.securityContext = securityContext;
  }

  public IoK8sApiCoreV1PodSpec securityContext(IoK8sApiCoreV1PodSecurityContext securityContext) {
    this.securityContext = securityContext;
    return this;
  }

 /**
   * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.
   * @return serviceAccount
  **/
  @JsonProperty("serviceAccount")
  public String getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
  }

  public IoK8sApiCoreV1PodSpec serviceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

 /**
   * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
   * @return serviceAccountName
  **/
  @JsonProperty("serviceAccountName")
  public String getServiceAccountName() {
    return serviceAccountName;
  }

  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }

  public IoK8sApiCoreV1PodSpec serviceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return this;
  }

 /**
   * Share a single process namespace between all of the containers in a pod. When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false.
   * @return shareProcessNamespace
  **/
  @JsonProperty("shareProcessNamespace")
  public Boolean isShareProcessNamespace() {
    return shareProcessNamespace;
  }

  public void setShareProcessNamespace(Boolean shareProcessNamespace) {
    this.shareProcessNamespace = shareProcessNamespace;
  }

  public IoK8sApiCoreV1PodSpec shareProcessNamespace(Boolean shareProcessNamespace) {
    this.shareProcessNamespace = shareProcessNamespace;
    return this;
  }

 /**
   * If specified, the fully qualified Pod hostname will be \&quot;&lt;hostname&gt;.&lt;subdomain&gt;.&lt;pod namespace&gt;.svc.&lt;cluster domain&gt;\&quot;. If not specified, the pod will not have a domainname at all.
   * @return subdomain
  **/
  @JsonProperty("subdomain")
  public String getSubdomain() {
    return subdomain;
  }

  public void setSubdomain(String subdomain) {
    this.subdomain = subdomain;
  }

  public IoK8sApiCoreV1PodSpec subdomain(String subdomain) {
    this.subdomain = subdomain;
    return this;
  }

 /**
   * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
   * @return terminationGracePeriodSeconds
  **/
  @JsonProperty("terminationGracePeriodSeconds")
  public Long getTerminationGracePeriodSeconds() {
    return terminationGracePeriodSeconds;
  }

  public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
  }

  public IoK8sApiCoreV1PodSpec terminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    return this;
  }

 /**
   * If specified, the pod&#39;s tolerations.
   * @return tolerations
  **/
  @JsonProperty("tolerations")
  public List<IoK8sApiCoreV1Toleration> getTolerations() {
    return tolerations;
  }

  public void setTolerations(List<IoK8sApiCoreV1Toleration> tolerations) {
    this.tolerations = tolerations;
  }

  public IoK8sApiCoreV1PodSpec tolerations(List<IoK8sApiCoreV1Toleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public IoK8sApiCoreV1PodSpec addTolerationsItem(IoK8sApiCoreV1Toleration tolerationsItem) {
    this.tolerations.add(tolerationsItem);
    return this;
  }

 /**
   * TopologySpreadConstraints describes how a group of pods ought to spread across topology domains. Scheduler will schedule pods in a way which abides by the constraints. This field is alpha-level and is only honored by clusters that enables the EvenPodsSpread feature. All topologySpreadConstraints are ANDed.
   * @return topologySpreadConstraints
  **/
  @JsonProperty("topologySpreadConstraints")
  public List<IoK8sApiCoreV1TopologySpreadConstraint> getTopologySpreadConstraints() {
    return topologySpreadConstraints;
  }

  public void setTopologySpreadConstraints(List<IoK8sApiCoreV1TopologySpreadConstraint> topologySpreadConstraints) {
    this.topologySpreadConstraints = topologySpreadConstraints;
  }

  public IoK8sApiCoreV1PodSpec topologySpreadConstraints(List<IoK8sApiCoreV1TopologySpreadConstraint> topologySpreadConstraints) {
    this.topologySpreadConstraints = topologySpreadConstraints;
    return this;
  }

  public IoK8sApiCoreV1PodSpec addTopologySpreadConstraintsItem(IoK8sApiCoreV1TopologySpreadConstraint topologySpreadConstraintsItem) {
    this.topologySpreadConstraints.add(topologySpreadConstraintsItem);
    return this;
  }

 /**
   * List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes
   * @return volumes
  **/
  @JsonProperty("volumes")
  public List<IoK8sApiCoreV1Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<IoK8sApiCoreV1Volume> volumes) {
    this.volumes = volumes;
  }

  public IoK8sApiCoreV1PodSpec volumes(List<IoK8sApiCoreV1Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public IoK8sApiCoreV1PodSpec addVolumesItem(IoK8sApiCoreV1Volume volumesItem) {
    this.volumes.add(volumesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PodSpec {\n");
    
    sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    automountServiceAccountToken: ").append(toIndentedString(automountServiceAccountToken)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    dnsConfig: ").append(toIndentedString(dnsConfig)).append("\n");
    sb.append("    dnsPolicy: ").append(toIndentedString(dnsPolicy)).append("\n");
    sb.append("    enableServiceLinks: ").append(toIndentedString(enableServiceLinks)).append("\n");
    sb.append("    ephemeralContainers: ").append(toIndentedString(ephemeralContainers)).append("\n");
    sb.append("    hostAliases: ").append(toIndentedString(hostAliases)).append("\n");
    sb.append("    hostIPC: ").append(toIndentedString(hostIPC)).append("\n");
    sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
    sb.append("    hostPID: ").append(toIndentedString(hostPID)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    overhead: ").append(toIndentedString(overhead)).append("\n");
    sb.append("    preemptionPolicy: ").append(toIndentedString(preemptionPolicy)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    readinessGates: ").append(toIndentedString(readinessGates)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
    sb.append("    runtimeClassName: ").append(toIndentedString(runtimeClassName)).append("\n");
    sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    shareProcessNamespace: ").append(toIndentedString(shareProcessNamespace)).append("\n");
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
    sb.append("    terminationGracePeriodSeconds: ").append(toIndentedString(terminationGracePeriodSeconds)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    topologySpreadConstraints: ").append(toIndentedString(topologySpreadConstraints)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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

