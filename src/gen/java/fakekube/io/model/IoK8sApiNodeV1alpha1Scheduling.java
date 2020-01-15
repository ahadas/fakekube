package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1Toleration;
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
  * Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.
 **/
@ApiModel(description="Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.")
public class IoK8sApiNodeV1alpha1Scheduling  {
  
  @ApiModelProperty(value = "nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.")
 /**
   * nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
  **/
  private Map<String, String> nodeSelector = null;

  @ApiModelProperty(value = "tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.")
  @Valid
 /**
   * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
  **/
  private List<IoK8sApiCoreV1Toleration> tolerations = null;
 /**
   * nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod&#39;s existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
   * @return nodeSelector
  **/
  @JsonProperty("nodeSelector")
  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }

  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }

  public IoK8sApiNodeV1alpha1Scheduling nodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  public IoK8sApiNodeV1alpha1Scheduling putNodeSelectorItem(String key, String nodeSelectorItem) {
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

 /**
   * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
   * @return tolerations
  **/
  @JsonProperty("tolerations")
  public List<IoK8sApiCoreV1Toleration> getTolerations() {
    return tolerations;
  }

  public void setTolerations(List<IoK8sApiCoreV1Toleration> tolerations) {
    this.tolerations = tolerations;
  }

  public IoK8sApiNodeV1alpha1Scheduling tolerations(List<IoK8sApiCoreV1Toleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public IoK8sApiNodeV1alpha1Scheduling addTolerationsItem(IoK8sApiCoreV1Toleration tolerationsItem) {
    this.tolerations.add(tolerationsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiNodeV1alpha1Scheduling {\n");
    
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
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

