package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1AttachedVolume;
import fakekube.io.model.IoK8sApiCoreV1ContainerImage;
import fakekube.io.model.IoK8sApiCoreV1NodeAddress;
import fakekube.io.model.IoK8sApiCoreV1NodeCondition;
import fakekube.io.model.IoK8sApiCoreV1NodeConfigStatus;
import fakekube.io.model.IoK8sApiCoreV1NodeDaemonEndpoints;
import fakekube.io.model.IoK8sApiCoreV1NodeSystemInfo;
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
  * NodeStatus is information about the current status of a node.
 **/
@ApiModel(description="NodeStatus is information about the current status of a node.")
public class IoK8sApiCoreV1NodeStatus  {
  
  @ApiModelProperty(value = "List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See http://pr.k8s.io/79391 for an example.")
  @Valid
 /**
   * List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See http://pr.k8s.io/79391 for an example.
  **/
  private List<IoK8sApiCoreV1NodeAddress> addresses = null;

  @ApiModelProperty(value = "Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.")
 /**
   * Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
  **/
  private Map<String, String> allocatable = null;

  @ApiModelProperty(value = "Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity")
 /**
   * Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
  **/
  private Map<String, String> capacity = null;

  @ApiModelProperty(value = "Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition")
  @Valid
 /**
   * Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
  **/
  private List<IoK8sApiCoreV1NodeCondition> conditions = null;

  @ApiModelProperty(value = "Status of the config assigned to the node via the dynamic Kubelet config feature.")
  @Valid
 /**
   * Status of the config assigned to the node via the dynamic Kubelet config feature.
  **/
  private IoK8sApiCoreV1NodeConfigStatus config = null;

  @ApiModelProperty(value = "Endpoints of daemons running on the Node.")
  @Valid
 /**
   * Endpoints of daemons running on the Node.
  **/
  private IoK8sApiCoreV1NodeDaemonEndpoints daemonEndpoints = null;

  @ApiModelProperty(value = "List of container images on this node")
  @Valid
 /**
   * List of container images on this node
  **/
  private List<IoK8sApiCoreV1ContainerImage> images = null;

  @ApiModelProperty(value = "Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info")
  @Valid
 /**
   * Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info
  **/
  private IoK8sApiCoreV1NodeSystemInfo nodeInfo = null;

  @ApiModelProperty(value = "NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.")
 /**
   * NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
  **/
  private String phase = null;

  @ApiModelProperty(value = "List of volumes that are attached to the node.")
  @Valid
 /**
   * List of volumes that are attached to the node.
  **/
  private List<IoK8sApiCoreV1AttachedVolume> volumesAttached = null;

  @ApiModelProperty(value = "List of attachable volumes in use (mounted) by the node.")
 /**
   * List of attachable volumes in use (mounted) by the node.
  **/
  private List<String> volumesInUse = null;
 /**
   * List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See http://pr.k8s.io/79391 for an example.
   * @return addresses
  **/
  @JsonProperty("addresses")
  public List<IoK8sApiCoreV1NodeAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<IoK8sApiCoreV1NodeAddress> addresses) {
    this.addresses = addresses;
  }

  public IoK8sApiCoreV1NodeStatus addresses(List<IoK8sApiCoreV1NodeAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public IoK8sApiCoreV1NodeStatus addAddressesItem(IoK8sApiCoreV1NodeAddress addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

 /**
   * Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
   * @return allocatable
  **/
  @JsonProperty("allocatable")
  public Map<String, String> getAllocatable() {
    return allocatable;
  }

  public void setAllocatable(Map<String, String> allocatable) {
    this.allocatable = allocatable;
  }

  public IoK8sApiCoreV1NodeStatus allocatable(Map<String, String> allocatable) {
    this.allocatable = allocatable;
    return this;
  }

  public IoK8sApiCoreV1NodeStatus putAllocatableItem(String key, String allocatableItem) {
    this.allocatable.put(key, allocatableItem);
    return this;
  }

 /**
   * Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
   * @return capacity
  **/
  @JsonProperty("capacity")
  public Map<String, String> getCapacity() {
    return capacity;
  }

  public void setCapacity(Map<String, String> capacity) {
    this.capacity = capacity;
  }

  public IoK8sApiCoreV1NodeStatus capacity(Map<String, String> capacity) {
    this.capacity = capacity;
    return this;
  }

  public IoK8sApiCoreV1NodeStatus putCapacityItem(String key, String capacityItem) {
    this.capacity.put(key, capacityItem);
    return this;
  }

 /**
   * Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
   * @return conditions
  **/
  @JsonProperty("conditions")
  public List<IoK8sApiCoreV1NodeCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sApiCoreV1NodeCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sApiCoreV1NodeStatus conditions(List<IoK8sApiCoreV1NodeCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sApiCoreV1NodeStatus addConditionsItem(IoK8sApiCoreV1NodeCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

 /**
   * Status of the config assigned to the node via the dynamic Kubelet config feature.
   * @return config
  **/
  @JsonProperty("config")
  public IoK8sApiCoreV1NodeConfigStatus getConfig() {
    return config;
  }

  public void setConfig(IoK8sApiCoreV1NodeConfigStatus config) {
    this.config = config;
  }

  public IoK8sApiCoreV1NodeStatus config(IoK8sApiCoreV1NodeConfigStatus config) {
    this.config = config;
    return this;
  }

 /**
   * Endpoints of daemons running on the Node.
   * @return daemonEndpoints
  **/
  @JsonProperty("daemonEndpoints")
  public IoK8sApiCoreV1NodeDaemonEndpoints getDaemonEndpoints() {
    return daemonEndpoints;
  }

  public void setDaemonEndpoints(IoK8sApiCoreV1NodeDaemonEndpoints daemonEndpoints) {
    this.daemonEndpoints = daemonEndpoints;
  }

  public IoK8sApiCoreV1NodeStatus daemonEndpoints(IoK8sApiCoreV1NodeDaemonEndpoints daemonEndpoints) {
    this.daemonEndpoints = daemonEndpoints;
    return this;
  }

 /**
   * List of container images on this node
   * @return images
  **/
  @JsonProperty("images")
  public List<IoK8sApiCoreV1ContainerImage> getImages() {
    return images;
  }

  public void setImages(List<IoK8sApiCoreV1ContainerImage> images) {
    this.images = images;
  }

  public IoK8sApiCoreV1NodeStatus images(List<IoK8sApiCoreV1ContainerImage> images) {
    this.images = images;
    return this;
  }

  public IoK8sApiCoreV1NodeStatus addImagesItem(IoK8sApiCoreV1ContainerImage imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

 /**
   * Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info
   * @return nodeInfo
  **/
  @JsonProperty("nodeInfo")
  public IoK8sApiCoreV1NodeSystemInfo getNodeInfo() {
    return nodeInfo;
  }

  public void setNodeInfo(IoK8sApiCoreV1NodeSystemInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
  }

  public IoK8sApiCoreV1NodeStatus nodeInfo(IoK8sApiCoreV1NodeSystemInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
    return this;
  }

 /**
   * NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
   * @return phase
  **/
  @JsonProperty("phase")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public IoK8sApiCoreV1NodeStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

 /**
   * List of volumes that are attached to the node.
   * @return volumesAttached
  **/
  @JsonProperty("volumesAttached")
  public List<IoK8sApiCoreV1AttachedVolume> getVolumesAttached() {
    return volumesAttached;
  }

  public void setVolumesAttached(List<IoK8sApiCoreV1AttachedVolume> volumesAttached) {
    this.volumesAttached = volumesAttached;
  }

  public IoK8sApiCoreV1NodeStatus volumesAttached(List<IoK8sApiCoreV1AttachedVolume> volumesAttached) {
    this.volumesAttached = volumesAttached;
    return this;
  }

  public IoK8sApiCoreV1NodeStatus addVolumesAttachedItem(IoK8sApiCoreV1AttachedVolume volumesAttachedItem) {
    this.volumesAttached.add(volumesAttachedItem);
    return this;
  }

 /**
   * List of attachable volumes in use (mounted) by the node.
   * @return volumesInUse
  **/
  @JsonProperty("volumesInUse")
  public List<String> getVolumesInUse() {
    return volumesInUse;
  }

  public void setVolumesInUse(List<String> volumesInUse) {
    this.volumesInUse = volumesInUse;
  }

  public IoK8sApiCoreV1NodeStatus volumesInUse(List<String> volumesInUse) {
    this.volumesInUse = volumesInUse;
    return this;
  }

  public IoK8sApiCoreV1NodeStatus addVolumesInUseItem(String volumesInUseItem) {
    this.volumesInUse.add(volumesInUseItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NodeStatus {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    allocatable: ").append(toIndentedString(allocatable)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    daemonEndpoints: ").append(toIndentedString(daemonEndpoints)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    volumesAttached: ").append(toIndentedString(volumesAttached)).append("\n");
    sb.append("    volumesInUse: ").append(toIndentedString(volumesInUse)).append("\n");
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

