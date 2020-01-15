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
  * The node this Taint is attached to has the \"effect\" on any pod that does not tolerate the Taint.
 **/
@ApiModel(description="The node this Taint is attached to has the \"effect\" on any pod that does not tolerate the Taint.")
public class IoK8sApiCoreV1Taint  {
  
  @ApiModelProperty(required = true, value = "Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.")
 /**
   * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.
  **/
  private String effect = null;

  @ApiModelProperty(required = true, value = "Required. The taint key to be applied to a node.")
 /**
   * Required. The taint key to be applied to a node.
  **/
  private String key = null;

  @ApiModelProperty(value = "TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints.")
 /**
   * TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints.
  **/
  private String timeAdded = null;

  @ApiModelProperty(value = "Required. The taint value corresponding to the taint key.")
 /**
   * Required. The taint value corresponding to the taint key.
  **/
  private String value = null;
 /**
   * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.
   * @return effect
  **/
  @JsonProperty("effect")
  @NotNull
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }

  public IoK8sApiCoreV1Taint effect(String effect) {
    this.effect = effect;
    return this;
  }

 /**
   * Required. The taint key to be applied to a node.
   * @return key
  **/
  @JsonProperty("key")
  @NotNull
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public IoK8sApiCoreV1Taint key(String key) {
    this.key = key;
    return this;
  }

 /**
   * TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints.
   * @return timeAdded
  **/
  @JsonProperty("timeAdded")
  public String getTimeAdded() {
    return timeAdded;
  }

  public void setTimeAdded(String timeAdded) {
    this.timeAdded = timeAdded;
  }

  public IoK8sApiCoreV1Taint timeAdded(String timeAdded) {
    this.timeAdded = timeAdded;
    return this;
  }

 /**
   * Required. The taint value corresponding to the taint key.
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public IoK8sApiCoreV1Taint value(String value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Taint {\n");
    
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    timeAdded: ").append(toIndentedString(timeAdded)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

