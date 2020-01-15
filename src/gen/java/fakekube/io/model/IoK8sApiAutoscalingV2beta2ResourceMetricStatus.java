package fakekube.io.model;

import fakekube.io.model.IoK8sApiAutoscalingV2beta2MetricValueStatus;
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
public class IoK8sApiAutoscalingV2beta2ResourceMetricStatus  {
  
  @ApiModelProperty(required = true, value = "current contains the current value for the given metric")
  @Valid
 /**
   * current contains the current value for the given metric
  **/
  private IoK8sApiAutoscalingV2beta2MetricValueStatus current = null;

  @ApiModelProperty(required = true, value = "Name is the name of the resource in question.")
 /**
   * Name is the name of the resource in question.
  **/
  private String name = null;
 /**
   * current contains the current value for the given metric
   * @return current
  **/
  @JsonProperty("current")
  @NotNull
  public IoK8sApiAutoscalingV2beta2MetricValueStatus getCurrent() {
    return current;
  }

  public void setCurrent(IoK8sApiAutoscalingV2beta2MetricValueStatus current) {
    this.current = current;
  }

  public IoK8sApiAutoscalingV2beta2ResourceMetricStatus current(IoK8sApiAutoscalingV2beta2MetricValueStatus current) {
    this.current = current;
    return this;
  }

 /**
   * Name is the name of the resource in question.
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

  public IoK8sApiAutoscalingV2beta2ResourceMetricStatus name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta2ResourceMetricStatus {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
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

