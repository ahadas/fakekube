package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1SELinuxOptions;
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
  * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.
 **/
@ApiModel(description="SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.")
public class IoK8sApiPolicyV1beta1SELinuxStrategyOptions  {
  
  @ApiModelProperty(required = true, value = "rule is the strategy that will dictate the allowable labels that may be set.")
 /**
   * rule is the strategy that will dictate the allowable labels that may be set.
  **/
  private String rule = null;

  @ApiModelProperty(value = "seLinuxOptions required to run as; required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/")
  @Valid
 /**
   * seLinuxOptions required to run as; required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
  **/
  private IoK8sApiCoreV1SELinuxOptions seLinuxOptions = null;
 /**
   * rule is the strategy that will dictate the allowable labels that may be set.
   * @return rule
  **/
  @JsonProperty("rule")
  @NotNull
  public String getRule() {
    return rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }

  public IoK8sApiPolicyV1beta1SELinuxStrategyOptions rule(String rule) {
    this.rule = rule;
    return this;
  }

 /**
   * seLinuxOptions required to run as; required for MustRunAs More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
   * @return seLinuxOptions
  **/
  @JsonProperty("seLinuxOptions")
  public IoK8sApiCoreV1SELinuxOptions getSeLinuxOptions() {
    return seLinuxOptions;
  }

  public void setSeLinuxOptions(IoK8sApiCoreV1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
  }

  public IoK8sApiPolicyV1beta1SELinuxStrategyOptions seLinuxOptions(IoK8sApiCoreV1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiPolicyV1beta1SELinuxStrategyOptions {\n");
    
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    seLinuxOptions: ").append(toIndentedString(seLinuxOptions)).append("\n");
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

