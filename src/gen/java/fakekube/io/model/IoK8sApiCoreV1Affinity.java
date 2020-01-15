package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1NodeAffinity;
import fakekube.io.model.IoK8sApiCoreV1PodAffinity;
import fakekube.io.model.IoK8sApiCoreV1PodAntiAffinity;
import io.swagger.annotations.ApiModel;
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
  * Affinity is a group of affinity scheduling rules.
 **/
@ApiModel(description="Affinity is a group of affinity scheduling rules.")
public class IoK8sApiCoreV1Affinity  {
  
  @ApiModelProperty(value = "Describes node affinity scheduling rules for the pod.")
  @Valid
 /**
   * Describes node affinity scheduling rules for the pod.
  **/
  private IoK8sApiCoreV1NodeAffinity nodeAffinity = null;

  @ApiModelProperty(value = "Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).")
  @Valid
 /**
   * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
  **/
  private IoK8sApiCoreV1PodAffinity podAffinity = null;

  @ApiModelProperty(value = "Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).")
  @Valid
 /**
   * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
  **/
  private IoK8sApiCoreV1PodAntiAffinity podAntiAffinity = null;
 /**
   * Describes node affinity scheduling rules for the pod.
   * @return nodeAffinity
  **/
  @JsonProperty("nodeAffinity")
  public IoK8sApiCoreV1NodeAffinity getNodeAffinity() {
    return nodeAffinity;
  }

  public void setNodeAffinity(IoK8sApiCoreV1NodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
  }

  public IoK8sApiCoreV1Affinity nodeAffinity(IoK8sApiCoreV1NodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
    return this;
  }

 /**
   * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
   * @return podAffinity
  **/
  @JsonProperty("podAffinity")
  public IoK8sApiCoreV1PodAffinity getPodAffinity() {
    return podAffinity;
  }

  public void setPodAffinity(IoK8sApiCoreV1PodAffinity podAffinity) {
    this.podAffinity = podAffinity;
  }

  public IoK8sApiCoreV1Affinity podAffinity(IoK8sApiCoreV1PodAffinity podAffinity) {
    this.podAffinity = podAffinity;
    return this;
  }

 /**
   * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
   * @return podAntiAffinity
  **/
  @JsonProperty("podAntiAffinity")
  public IoK8sApiCoreV1PodAntiAffinity getPodAntiAffinity() {
    return podAntiAffinity;
  }

  public void setPodAntiAffinity(IoK8sApiCoreV1PodAntiAffinity podAntiAffinity) {
    this.podAntiAffinity = podAntiAffinity;
  }

  public IoK8sApiCoreV1Affinity podAntiAffinity(IoK8sApiCoreV1PodAntiAffinity podAntiAffinity) {
    this.podAntiAffinity = podAntiAffinity;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Affinity {\n");
    
    sb.append("    nodeAffinity: ").append(toIndentedString(nodeAffinity)).append("\n");
    sb.append("    podAffinity: ").append(toIndentedString(podAffinity)).append("\n");
    sb.append("    podAntiAffinity: ").append(toIndentedString(podAntiAffinity)).append("\n");
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

