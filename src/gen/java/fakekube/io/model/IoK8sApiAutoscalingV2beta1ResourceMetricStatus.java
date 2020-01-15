package fakekube.io.model;

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
  * ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \"pods\" source.
 **/
@ApiModel(description="ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \"pods\" source.")
public class IoK8sApiAutoscalingV2beta1ResourceMetricStatus  {
  
  @ApiModelProperty(value = "currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.  It will only be present if `targetAverageValue` was set in the corresponding metric specification.")
 /**
   * currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.  It will only be present if `targetAverageValue` was set in the corresponding metric specification.
  **/
  private Integer currentAverageUtilization = null;

  @ApiModelProperty(required = true, value = "currentAverageValue is the current value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the \"pods\" metric source type. It will always be set, regardless of the corresponding metric specification.")
 /**
   * currentAverageValue is the current value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the \"pods\" metric source type. It will always be set, regardless of the corresponding metric specification.
  **/
  private String currentAverageValue = null;

  @ApiModelProperty(required = true, value = "name is the name of the resource in question.")
 /**
   * name is the name of the resource in question.
  **/
  private String name = null;
 /**
   * currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.  It will only be present if &#x60;targetAverageValue&#x60; was set in the corresponding metric specification.
   * @return currentAverageUtilization
  **/
  @JsonProperty("currentAverageUtilization")
  public Integer getCurrentAverageUtilization() {
    return currentAverageUtilization;
  }

  public void setCurrentAverageUtilization(Integer currentAverageUtilization) {
    this.currentAverageUtilization = currentAverageUtilization;
  }

  public IoK8sApiAutoscalingV2beta1ResourceMetricStatus currentAverageUtilization(Integer currentAverageUtilization) {
    this.currentAverageUtilization = currentAverageUtilization;
    return this;
  }

 /**
   * currentAverageValue is the current value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the \&quot;pods\&quot; metric source type. It will always be set, regardless of the corresponding metric specification.
   * @return currentAverageValue
  **/
  @JsonProperty("currentAverageValue")
  @NotNull
  public String getCurrentAverageValue() {
    return currentAverageValue;
  }

  public void setCurrentAverageValue(String currentAverageValue) {
    this.currentAverageValue = currentAverageValue;
  }

  public IoK8sApiAutoscalingV2beta1ResourceMetricStatus currentAverageValue(String currentAverageValue) {
    this.currentAverageValue = currentAverageValue;
    return this;
  }

 /**
   * name is the name of the resource in question.
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

  public IoK8sApiAutoscalingV2beta1ResourceMetricStatus name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta1ResourceMetricStatus {\n");
    
    sb.append("    currentAverageUtilization: ").append(toIndentedString(currentAverageUtilization)).append("\n");
    sb.append("    currentAverageValue: ").append(toIndentedString(currentAverageValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

