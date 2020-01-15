package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1PodAffinityTerm;
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
  * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)
 **/
@ApiModel(description="The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)")
public class IoK8sApiCoreV1WeightedPodAffinityTerm  {
  
  @ApiModelProperty(required = true, value = "Required. A pod affinity term, associated with the corresponding weight.")
  @Valid
 /**
   * Required. A pod affinity term, associated with the corresponding weight.
  **/
  private IoK8sApiCoreV1PodAffinityTerm podAffinityTerm = null;

  @ApiModelProperty(required = true, value = "weight associated with matching the corresponding podAffinityTerm, in the range 1-100.")
 /**
   * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
  **/
  private Integer weight = null;
 /**
   * Required. A pod affinity term, associated with the corresponding weight.
   * @return podAffinityTerm
  **/
  @JsonProperty("podAffinityTerm")
  @NotNull
  public IoK8sApiCoreV1PodAffinityTerm getPodAffinityTerm() {
    return podAffinityTerm;
  }

  public void setPodAffinityTerm(IoK8sApiCoreV1PodAffinityTerm podAffinityTerm) {
    this.podAffinityTerm = podAffinityTerm;
  }

  public IoK8sApiCoreV1WeightedPodAffinityTerm podAffinityTerm(IoK8sApiCoreV1PodAffinityTerm podAffinityTerm) {
    this.podAffinityTerm = podAffinityTerm;
    return this;
  }

 /**
   * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
   * @return weight
  **/
  @JsonProperty("weight")
  @NotNull
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public IoK8sApiCoreV1WeightedPodAffinityTerm weight(Integer weight) {
    this.weight = weight;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1WeightedPodAffinityTerm {\n");
    
    sb.append("    podAffinityTerm: ").append(toIndentedString(podAffinityTerm)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

