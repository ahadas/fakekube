package fakekube.io.model;

import io.swagger.annotations.ApiModel;
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
  * Overhead structure represents the resource overhead associated with running a pod.
 **/
@ApiModel(description="Overhead structure represents the resource overhead associated with running a pod.")
public class IoK8sApiNodeV1alpha1Overhead  {
  
  @ApiModelProperty(value = "PodFixed represents the fixed resource overhead associated with running a pod.")
 /**
   * PodFixed represents the fixed resource overhead associated with running a pod.
  **/
  private Map<String, String> podFixed = null;
 /**
   * PodFixed represents the fixed resource overhead associated with running a pod.
   * @return podFixed
  **/
  @JsonProperty("podFixed")
  public Map<String, String> getPodFixed() {
    return podFixed;
  }

  public void setPodFixed(Map<String, String> podFixed) {
    this.podFixed = podFixed;
  }

  public IoK8sApiNodeV1alpha1Overhead podFixed(Map<String, String> podFixed) {
    this.podFixed = podFixed;
    return this;
  }

  public IoK8sApiNodeV1alpha1Overhead putPodFixedItem(String key, String podFixedItem) {
    this.podFixed.put(key, podFixedItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiNodeV1alpha1Overhead {\n");
    
    sb.append("    podFixed: ").append(toIndentedString(podFixed)).append("\n");
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

