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
  * ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \"pods\" source.  Only one \"target\" type should be set.
 **/
@ApiModel(description="ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \"pods\" source.  Only one \"target\" type should be set.")
public class IoK8sApiAutoscalingV2beta1ResourceMetricSource  {
  
  @ApiModelProperty(required = true, value = "name is the name of the resource in question.")
 /**
   * name is the name of the resource in question.
  **/
  private String name = null;

  @ApiModelProperty(value = "targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.")
 /**
   * targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
  **/
  private Integer targetAverageUtilization = null;

  @ApiModelProperty(value = "targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the \"pods\" metric source type.")
 /**
   * targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the \"pods\" metric source type.
  **/
  private String targetAverageValue = null;
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

  public IoK8sApiAutoscalingV2beta1ResourceMetricSource name(String name) {
    this.name = name;
    return this;
  }

 /**
   * targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
   * @return targetAverageUtilization
  **/
  @JsonProperty("targetAverageUtilization")
  public Integer getTargetAverageUtilization() {
    return targetAverageUtilization;
  }

  public void setTargetAverageUtilization(Integer targetAverageUtilization) {
    this.targetAverageUtilization = targetAverageUtilization;
  }

  public IoK8sApiAutoscalingV2beta1ResourceMetricSource targetAverageUtilization(Integer targetAverageUtilization) {
    this.targetAverageUtilization = targetAverageUtilization;
    return this;
  }

 /**
   * targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the \&quot;pods\&quot; metric source type.
   * @return targetAverageValue
  **/
  @JsonProperty("targetAverageValue")
  public String getTargetAverageValue() {
    return targetAverageValue;
  }

  public void setTargetAverageValue(String targetAverageValue) {
    this.targetAverageValue = targetAverageValue;
  }

  public IoK8sApiAutoscalingV2beta1ResourceMetricSource targetAverageValue(String targetAverageValue) {
    this.targetAverageValue = targetAverageValue;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta1ResourceMetricSource {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetAverageUtilization: ").append(toIndentedString(targetAverageUtilization)).append("\n");
    sb.append("    targetAverageValue: ").append(toIndentedString(targetAverageValue)).append("\n");
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

