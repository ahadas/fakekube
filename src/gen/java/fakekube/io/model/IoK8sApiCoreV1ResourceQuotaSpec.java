package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ScopeSelector;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
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
  * ResourceQuotaSpec defines the desired hard limits to enforce for Quota.
 **/
@ApiModel(description="ResourceQuotaSpec defines the desired hard limits to enforce for Quota.")
public class IoK8sApiCoreV1ResourceQuotaSpec  {
  
  @ApiModelProperty(value = "hard is the set of desired hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/")
 /**
   * hard is the set of desired hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
  **/
  private Map<String, String> hard = null;

  @ApiModelProperty(value = "scopeSelector is also a collection of filters like scopes that must match each object tracked by a quota but expressed using ScopeSelectorOperator in combination with possible values. For a resource to match, both scopes AND scopeSelector (if specified in spec), must be matched.")
  @Valid
 /**
   * scopeSelector is also a collection of filters like scopes that must match each object tracked by a quota but expressed using ScopeSelectorOperator in combination with possible values. For a resource to match, both scopes AND scopeSelector (if specified in spec), must be matched.
  **/
  private IoK8sApiCoreV1ScopeSelector scopeSelector = null;

  @ApiModelProperty(value = "A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects.")
 /**
   * A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects.
  **/
  private List<String> scopes = null;
 /**
   * hard is the set of desired hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
   * @return hard
  **/
  @JsonProperty("hard")
  public Map<String, String> getHard() {
    return hard;
  }

  public void setHard(Map<String, String> hard) {
    this.hard = hard;
  }

  public IoK8sApiCoreV1ResourceQuotaSpec hard(Map<String, String> hard) {
    this.hard = hard;
    return this;
  }

  public IoK8sApiCoreV1ResourceQuotaSpec putHardItem(String key, String hardItem) {
    this.hard.put(key, hardItem);
    return this;
  }

 /**
   * scopeSelector is also a collection of filters like scopes that must match each object tracked by a quota but expressed using ScopeSelectorOperator in combination with possible values. For a resource to match, both scopes AND scopeSelector (if specified in spec), must be matched.
   * @return scopeSelector
  **/
  @JsonProperty("scopeSelector")
  public IoK8sApiCoreV1ScopeSelector getScopeSelector() {
    return scopeSelector;
  }

  public void setScopeSelector(IoK8sApiCoreV1ScopeSelector scopeSelector) {
    this.scopeSelector = scopeSelector;
  }

  public IoK8sApiCoreV1ResourceQuotaSpec scopeSelector(IoK8sApiCoreV1ScopeSelector scopeSelector) {
    this.scopeSelector = scopeSelector;
    return this;
  }

 /**
   * A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects.
   * @return scopes
  **/
  @JsonProperty("scopes")
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  public IoK8sApiCoreV1ResourceQuotaSpec scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public IoK8sApiCoreV1ResourceQuotaSpec addScopesItem(String scopesItem) {
    this.scopes.add(scopesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ResourceQuotaSpec {\n");
    
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
    sb.append("    scopeSelector: ").append(toIndentedString(scopeSelector)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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

