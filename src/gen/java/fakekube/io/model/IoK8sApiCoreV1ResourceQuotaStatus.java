package fakekube.io.model;

import io.swagger.annotations.ApiModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
  * ResourceQuotaStatus defines the enforced hard limits and observed use.
 **/
@ApiModel(description="ResourceQuotaStatus defines the enforced hard limits and observed use.")
public class IoK8sApiCoreV1ResourceQuotaStatus  {
  
  @ApiModelProperty(value = "Hard is the set of enforced hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/")
 /**
   * Hard is the set of enforced hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
  **/
  private Map<String, String> hard = null;

  @ApiModelProperty(value = "Used is the current observed total usage of the resource in the namespace.")
 /**
   * Used is the current observed total usage of the resource in the namespace.
  **/
  private Map<String, String> used = null;
 /**
   * Hard is the set of enforced hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
   * @return hard
  **/
  @JsonProperty("hard")
  public Map<String, String> getHard() {
    return hard;
  }

  public void setHard(Map<String, String> hard) {
    this.hard = hard;
  }

  public IoK8sApiCoreV1ResourceQuotaStatus hard(Map<String, String> hard) {
    this.hard = hard;
    return this;
  }

  public IoK8sApiCoreV1ResourceQuotaStatus putHardItem(String key, String hardItem) {
    this.hard.put(key, hardItem);
    return this;
  }

 /**
   * Used is the current observed total usage of the resource in the namespace.
   * @return used
  **/
  @JsonProperty("used")
  public Map<String, String> getUsed() {
    return used;
  }

  public void setUsed(Map<String, String> used) {
    this.used = used;
  }

  public IoK8sApiCoreV1ResourceQuotaStatus used(Map<String, String> used) {
    this.used = used;
    return this;
  }

  public IoK8sApiCoreV1ResourceQuotaStatus putUsedItem(String key, String usedItem) {
    this.used.put(key, usedItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ResourceQuotaStatus {\n");
    
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
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

