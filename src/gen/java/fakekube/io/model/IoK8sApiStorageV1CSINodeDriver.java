package fakekube.io.model;

import fakekube.io.model.IoK8sApiStorageV1VolumeNodeResources;
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
  * CSINodeDriver holds information about the specification of one CSI driver installed on a node
 **/
@ApiModel(description="CSINodeDriver holds information about the specification of one CSI driver installed on a node")
public class IoK8sApiStorageV1CSINodeDriver  {
  
  @ApiModelProperty(value = "allocatable represents the volume resources of a node that are available for scheduling. This field is beta.")
  @Valid
 /**
   * allocatable represents the volume resources of a node that are available for scheduling. This field is beta.
  **/
  private IoK8sApiStorageV1VolumeNodeResources allocatable = null;

  @ApiModelProperty(required = true, value = "This is the name of the CSI driver that this object refers to. This MUST be the same name returned by the CSI GetPluginName() call for that driver.")
 /**
   * This is the name of the CSI driver that this object refers to. This MUST be the same name returned by the CSI GetPluginName() call for that driver.
  **/
  private String name = null;

  @ApiModelProperty(required = true, value = "nodeID of the node from the driver point of view. This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as \"node1\", but the storage system may refer to the same node as \"nodeA\". When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. \"nodeA\" instead of \"node1\". This field is required.")
 /**
   * nodeID of the node from the driver point of view. This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as \"node1\", but the storage system may refer to the same node as \"nodeA\". When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. \"nodeA\" instead of \"node1\". This field is required.
  **/
  private String nodeID = null;

  @ApiModelProperty(value = "topologyKeys is the list of keys supported by the driver. When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. \"company.com/zone\", \"company.com/region\"). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.")
 /**
   * topologyKeys is the list of keys supported by the driver. When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. \"company.com/zone\", \"company.com/region\"). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.
  **/
  private List<String> topologyKeys = null;
 /**
   * allocatable represents the volume resources of a node that are available for scheduling. This field is beta.
   * @return allocatable
  **/
  @JsonProperty("allocatable")
  public IoK8sApiStorageV1VolumeNodeResources getAllocatable() {
    return allocatable;
  }

  public void setAllocatable(IoK8sApiStorageV1VolumeNodeResources allocatable) {
    this.allocatable = allocatable;
  }

  public IoK8sApiStorageV1CSINodeDriver allocatable(IoK8sApiStorageV1VolumeNodeResources allocatable) {
    this.allocatable = allocatable;
    return this;
  }

 /**
   * This is the name of the CSI driver that this object refers to. This MUST be the same name returned by the CSI GetPluginName() call for that driver.
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

  public IoK8sApiStorageV1CSINodeDriver name(String name) {
    this.name = name;
    return this;
  }

 /**
   * nodeID of the node from the driver point of view. This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as \&quot;node1\&quot;, but the storage system may refer to the same node as \&quot;nodeA\&quot;. When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. \&quot;nodeA\&quot; instead of \&quot;node1\&quot;. This field is required.
   * @return nodeID
  **/
  @JsonProperty("nodeID")
  @NotNull
  public String getNodeID() {
    return nodeID;
  }

  public void setNodeID(String nodeID) {
    this.nodeID = nodeID;
  }

  public IoK8sApiStorageV1CSINodeDriver nodeID(String nodeID) {
    this.nodeID = nodeID;
    return this;
  }

 /**
   * topologyKeys is the list of keys supported by the driver. When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. \&quot;company.com/zone\&quot;, \&quot;company.com/region\&quot;). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.
   * @return topologyKeys
  **/
  @JsonProperty("topologyKeys")
  public List<String> getTopologyKeys() {
    return topologyKeys;
  }

  public void setTopologyKeys(List<String> topologyKeys) {
    this.topologyKeys = topologyKeys;
  }

  public IoK8sApiStorageV1CSINodeDriver topologyKeys(List<String> topologyKeys) {
    this.topologyKeys = topologyKeys;
    return this;
  }

  public IoK8sApiStorageV1CSINodeDriver addTopologyKeysItem(String topologyKeysItem) {
    this.topologyKeys.add(topologyKeysItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiStorageV1CSINodeDriver {\n");
    
    sb.append("    allocatable: ").append(toIndentedString(allocatable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
    sb.append("    topologyKeys: ").append(toIndentedString(topologyKeys)).append("\n");
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

