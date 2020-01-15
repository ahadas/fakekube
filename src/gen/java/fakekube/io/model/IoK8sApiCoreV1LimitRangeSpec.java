package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1LimitRangeItem;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
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
  * LimitRangeSpec defines a min/max usage limit for resources that match on kind.
 **/
@ApiModel(description="LimitRangeSpec defines a min/max usage limit for resources that match on kind.")
public class IoK8sApiCoreV1LimitRangeSpec  {
  
  @ApiModelProperty(required = true, value = "Limits is the list of LimitRangeItem objects that are enforced.")
  @Valid
 /**
   * Limits is the list of LimitRangeItem objects that are enforced.
  **/
  private List<IoK8sApiCoreV1LimitRangeItem> limits = new ArrayList<IoK8sApiCoreV1LimitRangeItem>();
 /**
   * Limits is the list of LimitRangeItem objects that are enforced.
   * @return limits
  **/
  @JsonProperty("limits")
  @NotNull
  public List<IoK8sApiCoreV1LimitRangeItem> getLimits() {
    return limits;
  }

  public void setLimits(List<IoK8sApiCoreV1LimitRangeItem> limits) {
    this.limits = limits;
  }

  public IoK8sApiCoreV1LimitRangeSpec limits(List<IoK8sApiCoreV1LimitRangeItem> limits) {
    this.limits = limits;
    return this;
  }

  public IoK8sApiCoreV1LimitRangeSpec addLimitsItem(IoK8sApiCoreV1LimitRangeItem limitsItem) {
    this.limits.add(limitsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1LimitRangeSpec {\n");
    
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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

