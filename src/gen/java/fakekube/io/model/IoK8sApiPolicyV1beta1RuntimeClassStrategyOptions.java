package fakekube.io.model;

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
  * RuntimeClassStrategyOptions define the strategy that will dictate the allowable RuntimeClasses for a pod.
 **/
@ApiModel(description="RuntimeClassStrategyOptions define the strategy that will dictate the allowable RuntimeClasses for a pod.")
public class IoK8sApiPolicyV1beta1RuntimeClassStrategyOptions  {
  
  @ApiModelProperty(required = true, value = "allowedRuntimeClassNames is a whitelist of RuntimeClass names that may be specified on a pod. A value of \"*\" means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.")
 /**
   * allowedRuntimeClassNames is a whitelist of RuntimeClass names that may be specified on a pod. A value of \"*\" means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.
  **/
  private List<String> allowedRuntimeClassNames = new ArrayList<String>();

  @ApiModelProperty(value = "defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.")
 /**
   * defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.
  **/
  private String defaultRuntimeClassName = null;
 /**
   * allowedRuntimeClassNames is a whitelist of RuntimeClass names that may be specified on a pod. A value of \&quot;*\&quot; means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.
   * @return allowedRuntimeClassNames
  **/
  @JsonProperty("allowedRuntimeClassNames")
  @NotNull
  public List<String> getAllowedRuntimeClassNames() {
    return allowedRuntimeClassNames;
  }

  public void setAllowedRuntimeClassNames(List<String> allowedRuntimeClassNames) {
    this.allowedRuntimeClassNames = allowedRuntimeClassNames;
  }

  public IoK8sApiPolicyV1beta1RuntimeClassStrategyOptions allowedRuntimeClassNames(List<String> allowedRuntimeClassNames) {
    this.allowedRuntimeClassNames = allowedRuntimeClassNames;
    return this;
  }

  public IoK8sApiPolicyV1beta1RuntimeClassStrategyOptions addAllowedRuntimeClassNamesItem(String allowedRuntimeClassNamesItem) {
    this.allowedRuntimeClassNames.add(allowedRuntimeClassNamesItem);
    return this;
  }

 /**
   * defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.
   * @return defaultRuntimeClassName
  **/
  @JsonProperty("defaultRuntimeClassName")
  public String getDefaultRuntimeClassName() {
    return defaultRuntimeClassName;
  }

  public void setDefaultRuntimeClassName(String defaultRuntimeClassName) {
    this.defaultRuntimeClassName = defaultRuntimeClassName;
  }

  public IoK8sApiPolicyV1beta1RuntimeClassStrategyOptions defaultRuntimeClassName(String defaultRuntimeClassName) {
    this.defaultRuntimeClassName = defaultRuntimeClassName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiPolicyV1beta1RuntimeClassStrategyOptions {\n");
    
    sb.append("    allowedRuntimeClassNames: ").append(toIndentedString(allowedRuntimeClassNames)).append("\n");
    sb.append("    defaultRuntimeClassName: ").append(toIndentedString(defaultRuntimeClassName)).append("\n");
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

