package fakekube.io.model;

import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1LabelSelector;
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
  * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
 **/
@ApiModel(description="PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.")
public class IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec  {
  
  @ApiModelProperty(value = "An eviction is allowed if at most \"maxUnavailable\" pods selected by \"selector\" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with \"minAvailable\".")
 /**
   * An eviction is allowed if at most \"maxUnavailable\" pods selected by \"selector\" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with \"minAvailable\".
  **/
  private String maxUnavailable = null;

  @ApiModelProperty(value = "An eviction is allowed if at least \"minAvailable\" pods selected by \"selector\" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying \"100%\".")
 /**
   * An eviction is allowed if at least \"minAvailable\" pods selected by \"selector\" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying \"100%\".
  **/
  private String minAvailable = null;

  @ApiModelProperty(value = "Label query over pods whose evictions are managed by the disruption budget.")
  @Valid
 /**
   * Label query over pods whose evictions are managed by the disruption budget.
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector selector = null;
 /**
   * An eviction is allowed if at most \&quot;maxUnavailable\&quot; pods selected by \&quot;selector\&quot; are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with \&quot;minAvailable\&quot;.
   * @return maxUnavailable
  **/
  @JsonProperty("maxUnavailable")
  public String getMaxUnavailable() {
    return maxUnavailable;
  }

  public void setMaxUnavailable(String maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
  }

  public IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec maxUnavailable(String maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return this;
  }

 /**
   * An eviction is allowed if at least \&quot;minAvailable\&quot; pods selected by \&quot;selector\&quot; will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying \&quot;100%\&quot;.
   * @return minAvailable
  **/
  @JsonProperty("minAvailable")
  public String getMinAvailable() {
    return minAvailable;
  }

  public void setMinAvailable(String minAvailable) {
    this.minAvailable = minAvailable;
  }

  public IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec minAvailable(String minAvailable) {
    this.minAvailable = minAvailable;
    return this;
  }

 /**
   * Label query over pods whose evictions are managed by the disruption budget.
   * @return selector
  **/
  @JsonProperty("selector")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
  }

  public IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec selector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec {\n");
    
    sb.append("    maxUnavailable: ").append(toIndentedString(maxUnavailable)).append("\n");
    sb.append("    minAvailable: ").append(toIndentedString(minAvailable)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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

