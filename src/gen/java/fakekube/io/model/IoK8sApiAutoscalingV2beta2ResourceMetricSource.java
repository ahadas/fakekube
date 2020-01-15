package fakekube.io.model;

import fakekube.io.model.IoK8sApiAutoscalingV2beta2MetricTarget;
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
public class IoK8sApiAutoscalingV2beta2ResourceMetricSource  {
  
  @ApiModelProperty(required = true, value = "name is the name of the resource in question.")
 /**
   * name is the name of the resource in question.
  **/
  private String name = null;

  @ApiModelProperty(required = true, value = "target specifies the target value for the given metric")
  @Valid
 /**
   * target specifies the target value for the given metric
  **/
  private IoK8sApiAutoscalingV2beta2MetricTarget target = null;
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

  public IoK8sApiAutoscalingV2beta2ResourceMetricSource name(String name) {
    this.name = name;
    return this;
  }

 /**
   * target specifies the target value for the given metric
   * @return target
  **/
  @JsonProperty("target")
  @NotNull
  public IoK8sApiAutoscalingV2beta2MetricTarget getTarget() {
    return target;
  }

  public void setTarget(IoK8sApiAutoscalingV2beta2MetricTarget target) {
    this.target = target;
  }

  public IoK8sApiAutoscalingV2beta2ResourceMetricSource target(IoK8sApiAutoscalingV2beta2MetricTarget target) {
    this.target = target;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta2ResourceMetricSource {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

