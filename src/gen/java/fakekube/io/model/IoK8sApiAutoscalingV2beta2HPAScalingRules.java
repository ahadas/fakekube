package fakekube.io.model;

import fakekube.io.model.IoK8sApiAutoscalingV2beta2HPAScalingPolicy;
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
  * HPAScalingRules configures the scaling behavior for one direction. These Rules are applied after calculating DesiredReplicas from metrics for the HPA. They can limit the scaling velocity by specifying scaling policies. They can prevent flapping by specifying the stabilization window, so that the number of replicas is not set instantly, instead, the safest value from the stabilization window is chosen.
 **/
@ApiModel(description="HPAScalingRules configures the scaling behavior for one direction. These Rules are applied after calculating DesiredReplicas from metrics for the HPA. They can limit the scaling velocity by specifying scaling policies. They can prevent flapping by specifying the stabilization window, so that the number of replicas is not set instantly, instead, the safest value from the stabilization window is chosen.")
public class IoK8sApiAutoscalingV2beta2HPAScalingRules  {
  
  @ApiModelProperty(value = "policies is a list of potential scaling polices which can be used during scaling. At least one policy must be specified, otherwise the HPAScalingRules will be discarded as invalid")
  @Valid
 /**
   * policies is a list of potential scaling polices which can be used during scaling. At least one policy must be specified, otherwise the HPAScalingRules will be discarded as invalid
  **/
  private List<IoK8sApiAutoscalingV2beta2HPAScalingPolicy> policies = null;

  @ApiModelProperty(value = "selectPolicy is used to specify which policy should be used. If not set, the default value MaxPolicySelect is used.")
 /**
   * selectPolicy is used to specify which policy should be used. If not set, the default value MaxPolicySelect is used.
  **/
  private String selectPolicy = null;

  @ApiModelProperty(value = "StabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up or scaling down. StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).")
 /**
   * StabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up or scaling down. StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).
  **/
  private Integer stabilizationWindowSeconds = null;
 /**
   * policies is a list of potential scaling polices which can be used during scaling. At least one policy must be specified, otherwise the HPAScalingRules will be discarded as invalid
   * @return policies
  **/
  @JsonProperty("policies")
  public List<IoK8sApiAutoscalingV2beta2HPAScalingPolicy> getPolicies() {
    return policies;
  }

  public void setPolicies(List<IoK8sApiAutoscalingV2beta2HPAScalingPolicy> policies) {
    this.policies = policies;
  }

  public IoK8sApiAutoscalingV2beta2HPAScalingRules policies(List<IoK8sApiAutoscalingV2beta2HPAScalingPolicy> policies) {
    this.policies = policies;
    return this;
  }

  public IoK8sApiAutoscalingV2beta2HPAScalingRules addPoliciesItem(IoK8sApiAutoscalingV2beta2HPAScalingPolicy policiesItem) {
    this.policies.add(policiesItem);
    return this;
  }

 /**
   * selectPolicy is used to specify which policy should be used. If not set, the default value MaxPolicySelect is used.
   * @return selectPolicy
  **/
  @JsonProperty("selectPolicy")
  public String getSelectPolicy() {
    return selectPolicy;
  }

  public void setSelectPolicy(String selectPolicy) {
    this.selectPolicy = selectPolicy;
  }

  public IoK8sApiAutoscalingV2beta2HPAScalingRules selectPolicy(String selectPolicy) {
    this.selectPolicy = selectPolicy;
    return this;
  }

 /**
   * StabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up or scaling down. StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).
   * @return stabilizationWindowSeconds
  **/
  @JsonProperty("stabilizationWindowSeconds")
  public Integer getStabilizationWindowSeconds() {
    return stabilizationWindowSeconds;
  }

  public void setStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
    this.stabilizationWindowSeconds = stabilizationWindowSeconds;
  }

  public IoK8sApiAutoscalingV2beta2HPAScalingRules stabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
    this.stabilizationWindowSeconds = stabilizationWindowSeconds;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta2HPAScalingRules {\n");
    
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    selectPolicy: ").append(toIndentedString(selectPolicy)).append("\n");
    sb.append("    stabilizationWindowSeconds: ").append(toIndentedString(stabilizationWindowSeconds)).append("\n");
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

