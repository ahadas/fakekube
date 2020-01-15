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
  * IDRange provides a min/max of an allowed range of IDs.
 **/
@ApiModel(description="IDRange provides a min/max of an allowed range of IDs.")
public class IoK8sApiPolicyV1beta1IDRange  {
  
  @ApiModelProperty(required = true, value = "max is the end of the range, inclusive.")
 /**
   * max is the end of the range, inclusive.
  **/
  private Long max = null;

  @ApiModelProperty(required = true, value = "min is the start of the range, inclusive.")
 /**
   * min is the start of the range, inclusive.
  **/
  private Long min = null;
 /**
   * max is the end of the range, inclusive.
   * @return max
  **/
  @JsonProperty("max")
  @NotNull
  public Long getMax() {
    return max;
  }

  public void setMax(Long max) {
    this.max = max;
  }

  public IoK8sApiPolicyV1beta1IDRange max(Long max) {
    this.max = max;
    return this;
  }

 /**
   * min is the start of the range, inclusive.
   * @return min
  **/
  @JsonProperty("min")
  @NotNull
  public Long getMin() {
    return min;
  }

  public void setMin(Long min) {
    this.min = min;
  }

  public IoK8sApiPolicyV1beta1IDRange min(Long min) {
    this.min = min;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiPolicyV1beta1IDRange {\n");
    
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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

