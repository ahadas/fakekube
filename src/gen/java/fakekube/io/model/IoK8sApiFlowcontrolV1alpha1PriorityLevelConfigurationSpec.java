package fakekube.io.model;

import fakekube.io.model.IoK8sApiFlowcontrolV1alpha1LimitedPriorityLevelConfiguration;
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
  * PriorityLevelConfigurationSpec specifies the configuration of a priority level.
 **/
@ApiModel(description="PriorityLevelConfigurationSpec specifies the configuration of a priority level.")
public class IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationSpec  {
  
  @ApiModelProperty(value = "`limited` specifies how requests are handled for a Limited priority level. This field must be non-empty if and only if `type` is `\"Limited\"`.")
  @Valid
 /**
   * `limited` specifies how requests are handled for a Limited priority level. This field must be non-empty if and only if `type` is `\"Limited\"`.
  **/
  private IoK8sApiFlowcontrolV1alpha1LimitedPriorityLevelConfiguration limited = null;

  @ApiModelProperty(required = true, value = "`type` indicates whether this priority level is subject to limitation on request execution.  A value of `\"Exempt\"` means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of `\"Limited\"` means that (a) requests of this priority level _are_ subject to limits and (b) some of the server's limited capacity is made available exclusively to this priority level. Required.")
 /**
   * `type` indicates whether this priority level is subject to limitation on request execution.  A value of `\"Exempt\"` means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of `\"Limited\"` means that (a) requests of this priority level _are_ subject to limits and (b) some of the server's limited capacity is made available exclusively to this priority level. Required.
  **/
  private String type = null;
 /**
   * &#x60;limited&#x60; specifies how requests are handled for a Limited priority level. This field must be non-empty if and only if &#x60;type&#x60; is &#x60;\&quot;Limited\&quot;&#x60;.
   * @return limited
  **/
  @JsonProperty("limited")
  public IoK8sApiFlowcontrolV1alpha1LimitedPriorityLevelConfiguration getLimited() {
    return limited;
  }

  public void setLimited(IoK8sApiFlowcontrolV1alpha1LimitedPriorityLevelConfiguration limited) {
    this.limited = limited;
  }

  public IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationSpec limited(IoK8sApiFlowcontrolV1alpha1LimitedPriorityLevelConfiguration limited) {
    this.limited = limited;
    return this;
  }

 /**
   * &#x60;type&#x60; indicates whether this priority level is subject to limitation on request execution.  A value of &#x60;\&quot;Exempt\&quot;&#x60; means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of &#x60;\&quot;Limited\&quot;&#x60; means that (a) requests of this priority level _are_ subject to limits and (b) some of the server&#39;s limited capacity is made available exclusively to this priority level. Required.
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationSpec type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationSpec {\n");
    
    sb.append("    limited: ").append(toIndentedString(limited)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

