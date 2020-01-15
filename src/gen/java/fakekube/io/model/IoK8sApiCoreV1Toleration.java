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
  * The pod this Toleration is attached to tolerates any taint that matches the triple <key,value,effect> using the matching operator <operator>.
 **/
@ApiModel(description="The pod this Toleration is attached to tolerates any taint that matches the triple <key,value,effect> using the matching operator <operator>.")
public class IoK8sApiCoreV1Toleration  {
  
  @ApiModelProperty(value = "Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.")
 /**
   * Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
  **/
  private String effect = null;

  @ApiModelProperty(value = "Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.")
 /**
   * Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
  **/
  private String key = null;

  @ApiModelProperty(value = "Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.")
 /**
   * Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
  **/
  private String operator = null;

  @ApiModelProperty(value = "TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.")
 /**
   * TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
  **/
  private Long tolerationSeconds = null;

  @ApiModelProperty(value = "Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.")
 /**
   * Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.
  **/
  private String value = null;
 /**
   * Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
   * @return effect
  **/
  @JsonProperty("effect")
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }

  public IoK8sApiCoreV1Toleration effect(String effect) {
    this.effect = effect;
    return this;
  }

 /**
   * Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
   * @return key
  **/
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public IoK8sApiCoreV1Toleration key(String key) {
    this.key = key;
    return this;
  }

 /**
   * Operator represents a key&#39;s relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
   * @return operator
  **/
  @JsonProperty("operator")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public IoK8sApiCoreV1Toleration operator(String operator) {
    this.operator = operator;
    return this;
  }

 /**
   * TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
   * @return tolerationSeconds
  **/
  @JsonProperty("tolerationSeconds")
  public Long getTolerationSeconds() {
    return tolerationSeconds;
  }

  public void setTolerationSeconds(Long tolerationSeconds) {
    this.tolerationSeconds = tolerationSeconds;
  }

  public IoK8sApiCoreV1Toleration tolerationSeconds(Long tolerationSeconds) {
    this.tolerationSeconds = tolerationSeconds;
    return this;
  }

 /**
   * Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public IoK8sApiCoreV1Toleration value(String value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Toleration {\n");
    
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    tolerationSeconds: ").append(toIndentedString(tolerationSeconds)).append("\n");
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

