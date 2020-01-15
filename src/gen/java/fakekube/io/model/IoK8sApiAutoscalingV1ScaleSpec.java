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
  * ScaleSpec describes the attributes of a scale subresource.
 **/
@ApiModel(description="ScaleSpec describes the attributes of a scale subresource.")
public class IoK8sApiAutoscalingV1ScaleSpec  {
  
  @ApiModelProperty(value = "desired number of instances for the scaled object.")
 /**
   * desired number of instances for the scaled object.
  **/
  private Integer replicas = null;
 /**
   * desired number of instances for the scaled object.
   * @return replicas
  **/
  @JsonProperty("replicas")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public IoK8sApiAutoscalingV1ScaleSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV1ScaleSpec {\n");
    
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
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

