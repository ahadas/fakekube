package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1NodeSelector;
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
  * VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.
 **/
@ApiModel(description="VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.")
public class IoK8sApiCoreV1VolumeNodeAffinity  {
  
  @ApiModelProperty(value = "Required specifies hard node constraints that must be met.")
  @Valid
 /**
   * Required specifies hard node constraints that must be met.
  **/
  private IoK8sApiCoreV1NodeSelector required = null;
 /**
   * Required specifies hard node constraints that must be met.
   * @return required
  **/
  @JsonProperty("required")
  public IoK8sApiCoreV1NodeSelector getRequired() {
    return required;
  }

  public void setRequired(IoK8sApiCoreV1NodeSelector required) {
    this.required = required;
  }

  public IoK8sApiCoreV1VolumeNodeAffinity required(IoK8sApiCoreV1NodeSelector required) {
    this.required = required;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1VolumeNodeAffinity {\n");
    
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

