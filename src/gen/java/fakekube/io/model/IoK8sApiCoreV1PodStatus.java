package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ContainerStatus;
import fakekube.io.model.IoK8sApiCoreV1PodCondition;
import fakekube.io.model.IoK8sApiCoreV1PodIP;
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
  * PodStatus represents information about the status of a pod. Status may trail the actual state of a system, especially if the node that hosts the pod cannot contact the control plane.
 **/
@ApiModel(description="PodStatus represents information about the status of a pod. Status may trail the actual state of a system, especially if the node that hosts the pod cannot contact the control plane.")
public class IoK8sApiCoreV1PodStatus  {
  
  @ApiModelProperty(value = "Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions")
  @Valid
 /**
   * Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
  **/
  private List<IoK8sApiCoreV1PodCondition> conditions = null;

  @ApiModelProperty(value = "The list has one entry per container in the manifest. Each entry is currently the output of `docker inspect`. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status")
  @Valid
 /**
   * The list has one entry per container in the manifest. Each entry is currently the output of `docker inspect`. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
  **/
  private List<IoK8sApiCoreV1ContainerStatus> containerStatuses = null;

  @ApiModelProperty(value = "Status for any ephemeral containers that have run in this pod. This field is alpha-level and is only populated by servers that enable the EphemeralContainers feature.")
  @Valid
 /**
   * Status for any ephemeral containers that have run in this pod. This field is alpha-level and is only populated by servers that enable the EphemeralContainers feature.
  **/
  private List<IoK8sApiCoreV1ContainerStatus> ephemeralContainerStatuses = null;

  @ApiModelProperty(value = "IP address of the host to which the pod is assigned. Empty if not yet scheduled.")
 /**
   * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
  **/
  private String hostIP = null;

  @ApiModelProperty(value = "The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status")
  @Valid
 /**
   * The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
  **/
  private List<IoK8sApiCoreV1ContainerStatus> initContainerStatuses = null;

  @ApiModelProperty(value = "A human readable message indicating details about why the pod is in this condition.")
 /**
   * A human readable message indicating details about why the pod is in this condition.
  **/
  private String message = null;

  @ApiModelProperty(value = "nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.")
 /**
   * nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.
  **/
  private String nominatedNodeName = null;

  @ApiModelProperty(value = "The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod's status. There are five possible phase values:  Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.  More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase")
 /**
   * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod's status. There are five possible phase values:  Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.  More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
  **/
  private String phase = null;

  @ApiModelProperty(value = "IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.")
 /**
   * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
  **/
  private String podIP = null;

  @ApiModelProperty(value = "podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.")
  @Valid
 /**
   * podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.
  **/
  private List<IoK8sApiCoreV1PodIP> podIPs = null;

  @ApiModelProperty(value = "The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md")
 /**
   * The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
  **/
  private String qosClass = null;

  @ApiModelProperty(value = "A brief CamelCase message indicating details about why the pod is in this state. e.g. 'Evicted'")
 /**
   * A brief CamelCase message indicating details about why the pod is in this state. e.g. 'Evicted'
  **/
  private String reason = null;

  @ApiModelProperty(value = "RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.")
 /**
   * RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.
  **/
  private String startTime = null;
 /**
   * Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
   * @return conditions
  **/
  @JsonProperty("conditions")
  public List<IoK8sApiCoreV1PodCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sApiCoreV1PodCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sApiCoreV1PodStatus conditions(List<IoK8sApiCoreV1PodCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sApiCoreV1PodStatus addConditionsItem(IoK8sApiCoreV1PodCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

 /**
   * The list has one entry per container in the manifest. Each entry is currently the output of &#x60;docker inspect&#x60;. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
   * @return containerStatuses
  **/
  @JsonProperty("containerStatuses")
  public List<IoK8sApiCoreV1ContainerStatus> getContainerStatuses() {
    return containerStatuses;
  }

  public void setContainerStatuses(List<IoK8sApiCoreV1ContainerStatus> containerStatuses) {
    this.containerStatuses = containerStatuses;
  }

  public IoK8sApiCoreV1PodStatus containerStatuses(List<IoK8sApiCoreV1ContainerStatus> containerStatuses) {
    this.containerStatuses = containerStatuses;
    return this;
  }

  public IoK8sApiCoreV1PodStatus addContainerStatusesItem(IoK8sApiCoreV1ContainerStatus containerStatusesItem) {
    this.containerStatuses.add(containerStatusesItem);
    return this;
  }

 /**
   * Status for any ephemeral containers that have run in this pod. This field is alpha-level and is only populated by servers that enable the EphemeralContainers feature.
   * @return ephemeralContainerStatuses
  **/
  @JsonProperty("ephemeralContainerStatuses")
  public List<IoK8sApiCoreV1ContainerStatus> getEphemeralContainerStatuses() {
    return ephemeralContainerStatuses;
  }

  public void setEphemeralContainerStatuses(List<IoK8sApiCoreV1ContainerStatus> ephemeralContainerStatuses) {
    this.ephemeralContainerStatuses = ephemeralContainerStatuses;
  }

  public IoK8sApiCoreV1PodStatus ephemeralContainerStatuses(List<IoK8sApiCoreV1ContainerStatus> ephemeralContainerStatuses) {
    this.ephemeralContainerStatuses = ephemeralContainerStatuses;
    return this;
  }

  public IoK8sApiCoreV1PodStatus addEphemeralContainerStatusesItem(IoK8sApiCoreV1ContainerStatus ephemeralContainerStatusesItem) {
    this.ephemeralContainerStatuses.add(ephemeralContainerStatusesItem);
    return this;
  }

 /**
   * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
   * @return hostIP
  **/
  @JsonProperty("hostIP")
  public String getHostIP() {
    return hostIP;
  }

  public void setHostIP(String hostIP) {
    this.hostIP = hostIP;
  }

  public IoK8sApiCoreV1PodStatus hostIP(String hostIP) {
    this.hostIP = hostIP;
    return this;
  }

 /**
   * The list has one entry per init container in the manifest. The most recent successful init container will have ready &#x3D; true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
   * @return initContainerStatuses
  **/
  @JsonProperty("initContainerStatuses")
  public List<IoK8sApiCoreV1ContainerStatus> getInitContainerStatuses() {
    return initContainerStatuses;
  }

  public void setInitContainerStatuses(List<IoK8sApiCoreV1ContainerStatus> initContainerStatuses) {
    this.initContainerStatuses = initContainerStatuses;
  }

  public IoK8sApiCoreV1PodStatus initContainerStatuses(List<IoK8sApiCoreV1ContainerStatus> initContainerStatuses) {
    this.initContainerStatuses = initContainerStatuses;
    return this;
  }

  public IoK8sApiCoreV1PodStatus addInitContainerStatusesItem(IoK8sApiCoreV1ContainerStatus initContainerStatusesItem) {
    this.initContainerStatuses.add(initContainerStatusesItem);
    return this;
  }

 /**
   * A human readable message indicating details about why the pod is in this condition.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApiCoreV1PodStatus message(String message) {
    this.message = message;
    return this;
  }

 /**
   * nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.
   * @return nominatedNodeName
  **/
  @JsonProperty("nominatedNodeName")
  public String getNominatedNodeName() {
    return nominatedNodeName;
  }

  public void setNominatedNodeName(String nominatedNodeName) {
    this.nominatedNodeName = nominatedNodeName;
  }

  public IoK8sApiCoreV1PodStatus nominatedNodeName(String nominatedNodeName) {
    this.nominatedNodeName = nominatedNodeName;
    return this;
  }

 /**
   * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod&#39;s status. There are five possible phase values:  Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.  More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
   * @return phase
  **/
  @JsonProperty("phase")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public IoK8sApiCoreV1PodStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

 /**
   * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
   * @return podIP
  **/
  @JsonProperty("podIP")
  public String getPodIP() {
    return podIP;
  }

  public void setPodIP(String podIP) {
    this.podIP = podIP;
  }

  public IoK8sApiCoreV1PodStatus podIP(String podIP) {
    this.podIP = podIP;
    return this;
  }

 /**
   * podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.
   * @return podIPs
  **/
  @JsonProperty("podIPs")
  public List<IoK8sApiCoreV1PodIP> getPodIPs() {
    return podIPs;
  }

  public void setPodIPs(List<IoK8sApiCoreV1PodIP> podIPs) {
    this.podIPs = podIPs;
  }

  public IoK8sApiCoreV1PodStatus podIPs(List<IoK8sApiCoreV1PodIP> podIPs) {
    this.podIPs = podIPs;
    return this;
  }

  public IoK8sApiCoreV1PodStatus addPodIPsItem(IoK8sApiCoreV1PodIP podIPsItem) {
    this.podIPs.add(podIPsItem);
    return this;
  }

 /**
   * The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
   * @return qosClass
  **/
  @JsonProperty("qosClass")
  public String getQosClass() {
    return qosClass;
  }

  public void setQosClass(String qosClass) {
    this.qosClass = qosClass;
  }

  public IoK8sApiCoreV1PodStatus qosClass(String qosClass) {
    this.qosClass = qosClass;
    return this;
  }

 /**
   * A brief CamelCase message indicating details about why the pod is in this state. e.g. &#39;Evicted&#39;
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sApiCoreV1PodStatus reason(String reason) {
    this.reason = reason;
    return this;
  }

 /**
   * RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.
   * @return startTime
  **/
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public IoK8sApiCoreV1PodStatus startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PodStatus {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    containerStatuses: ").append(toIndentedString(containerStatuses)).append("\n");
    sb.append("    ephemeralContainerStatuses: ").append(toIndentedString(ephemeralContainerStatuses)).append("\n");
    sb.append("    hostIP: ").append(toIndentedString(hostIP)).append("\n");
    sb.append("    initContainerStatuses: ").append(toIndentedString(initContainerStatuses)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nominatedNodeName: ").append(toIndentedString(nominatedNodeName)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    podIP: ").append(toIndentedString(podIP)).append("\n");
    sb.append("    podIPs: ").append(toIndentedString(podIPs)).append("\n");
    sb.append("    qosClass: ").append(toIndentedString(qosClass)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

