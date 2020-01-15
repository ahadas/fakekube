package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1NodeSelectorTerm;
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
  * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
 **/
@ApiModel(description="An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).")
public class IoK8sApiCoreV1PreferredSchedulingTerm  {
  
  @ApiModelProperty(required = true, value = "A node selector term, associated with the corresponding weight.")
  @Valid
 /**
   * A node selector term, associated with the corresponding weight.
  **/
  private IoK8sApiCoreV1NodeSelectorTerm preference = null;

  @ApiModelProperty(required = true, value = "Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.")
 /**
   * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
  **/
  private Integer weight = null;
 /**
   * A node selector term, associated with the corresponding weight.
   * @return preference
  **/
  @JsonProperty("preference")
  @NotNull
  public IoK8sApiCoreV1NodeSelectorTerm getPreference() {
    return preference;
  }

  public void setPreference(IoK8sApiCoreV1NodeSelectorTerm preference) {
    this.preference = preference;
  }

  public IoK8sApiCoreV1PreferredSchedulingTerm preference(IoK8sApiCoreV1NodeSelectorTerm preference) {
    this.preference = preference;
    return this;
  }

 /**
   * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
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

  public IoK8sApiCoreV1PreferredSchedulingTerm weight(Integer weight) {
    this.weight = weight;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PreferredSchedulingTerm {\n");
    
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
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

