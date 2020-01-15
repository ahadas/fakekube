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
  * ScaleStatus represents the current status of a scale subresource.
 **/
@ApiModel(description="ScaleStatus represents the current status of a scale subresource.")
public class IoK8sApiAutoscalingV1ScaleStatus  {
  
  @ApiModelProperty(required = true, value = "actual number of observed instances of the scaled object.")
 /**
   * actual number of observed instances of the scaled object.
  **/
  private Integer replicas = null;

  @ApiModelProperty(value = "label query over pods that should match the replicas count. This is same as the label selector but in the string format to avoid introspection by clients. The string will be in the same format as the query-param syntax. More info about label selectors: http://kubernetes.io/docs/user-guide/labels#label-selectors")
 /**
   * label query over pods that should match the replicas count. This is same as the label selector but in the string format to avoid introspection by clients. The string will be in the same format as the query-param syntax. More info about label selectors: http://kubernetes.io/docs/user-guide/labels#label-selectors
  **/
  private String selector = null;
 /**
   * actual number of observed instances of the scaled object.
   * @return replicas
  **/
  @JsonProperty("replicas")
  @NotNull
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public IoK8sApiAutoscalingV1ScaleStatus replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

 /**
   * label query over pods that should match the replicas count. This is same as the label selector but in the string format to avoid introspection by clients. The string will be in the same format as the query-param syntax. More info about label selectors: http://kubernetes.io/docs/user-guide/labels#label-selectors
   * @return selector
  **/
  @JsonProperty("selector")
  public String getSelector() {
    return selector;
  }

  public void setSelector(String selector) {
    this.selector = selector;
  }

  public IoK8sApiAutoscalingV1ScaleStatus selector(String selector) {
    this.selector = selector;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV1ScaleStatus {\n");
    
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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

