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
  * ResourceRequirements describes the compute resource requirements.
 **/
@ApiModel(description="ResourceRequirements describes the compute resource requirements.")
public class IoK8sApiCoreV1ResourceRequirements  {
  
  @ApiModelProperty(value = "Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/")
 /**
   * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
  **/
  private Map<String, String> limits = null;

  @ApiModelProperty(value = "Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/")
 /**
   * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
  **/
  private Map<String, String> requests = null;
 /**
   * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
   * @return limits
  **/
  @JsonProperty("limits")
  public Map<String, String> getLimits() {
    return limits;
  }

  public void setLimits(Map<String, String> limits) {
    this.limits = limits;
  }

  public IoK8sApiCoreV1ResourceRequirements limits(Map<String, String> limits) {
    this.limits = limits;
    return this;
  }

  public IoK8sApiCoreV1ResourceRequirements putLimitsItem(String key, String limitsItem) {
    this.limits.put(key, limitsItem);
    return this;
  }

 /**
   * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
   * @return requests
  **/
  @JsonProperty("requests")
  public Map<String, String> getRequests() {
    return requests;
  }

  public void setRequests(Map<String, String> requests) {
    this.requests = requests;
  }

  public IoK8sApiCoreV1ResourceRequirements requests(Map<String, String> requests) {
    this.requests = requests;
    return this;
  }

  public IoK8sApiCoreV1ResourceRequirements putRequestsItem(String key, String requestsItem) {
    this.requests.put(key, requestsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ResourceRequirements {\n");
    
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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

