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
  * NonResourcePolicyRule is a predicate that matches non-resource requests according to their verb and the target non-resource URL. A NonResourcePolicyRule matches a request if and only if both (a) at least one member of verbs matches the request and (b) at least one member of nonResourceURLs matches the request.
 **/
@ApiModel(description="NonResourcePolicyRule is a predicate that matches non-resource requests according to their verb and the target non-resource URL. A NonResourcePolicyRule matches a request if and only if both (a) at least one member of verbs matches the request and (b) at least one member of nonResourceURLs matches the request.")
public class IoK8sApiFlowcontrolV1alpha1NonResourcePolicyRule  {
  
  @ApiModelProperty(required = true, value = "`nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example:   - \"/healthz\" is legal   - \"/hea*\" is illegal   - \"/hea\" is legal but matches nothing   - \"/hea/_*\" also matches nothing   - \"/healthz/_*\" matches all per-component health checks. \"*\" matches all non-resource urls. if it is present, it must be the only entry. Required.")
 /**
   * `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example:   - \"/healthz\" is legal   - \"/hea*\" is illegal   - \"/hea\" is legal but matches nothing   - \"/hea/_*\" also matches nothing   - \"/healthz/_*\" matches all per-component health checks. \"*\" matches all non-resource urls. if it is present, it must be the only entry. Required.
  **/
  private List<String> nonResourceURLs = new ArrayList<String>();

  @ApiModelProperty(required = true, value = "`verbs` is a list of matching verbs and may not be empty. \"*\" matches all verbs. If it is present, it must be the only entry. Required.")
 /**
   * `verbs` is a list of matching verbs and may not be empty. \"*\" matches all verbs. If it is present, it must be the only entry. Required.
  **/
  private List<String> verbs = new ArrayList<String>();
 /**
   * &#x60;nonResourceURLs&#x60; is a set of url prefixes that a user should have access to and may not be empty. For example:   - \&quot;/healthz\&quot; is legal   - \&quot;/hea*\&quot; is illegal   - \&quot;/hea\&quot; is legal but matches nothing   - \&quot;/hea/_*\&quot; also matches nothing   - \&quot;/healthz/_*\&quot; matches all per-component health checks. \&quot;*\&quot; matches all non-resource urls. if it is present, it must be the only entry. Required.
   * @return nonResourceURLs
  **/
  @JsonProperty("nonResourceURLs")
  @NotNull
  public List<String> getNonResourceURLs() {
    return nonResourceURLs;
  }

  public void setNonResourceURLs(List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
  }

  public IoK8sApiFlowcontrolV1alpha1NonResourcePolicyRule nonResourceURLs(List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
    return this;
  }

  public IoK8sApiFlowcontrolV1alpha1NonResourcePolicyRule addNonResourceURLsItem(String nonResourceURLsItem) {
    this.nonResourceURLs.add(nonResourceURLsItem);
    return this;
  }

 /**
   * &#x60;verbs&#x60; is a list of matching verbs and may not be empty. \&quot;*\&quot; matches all verbs. If it is present, it must be the only entry. Required.
   * @return verbs
  **/
  @JsonProperty("verbs")
  @NotNull
  public List<String> getVerbs() {
    return verbs;
  }

  public void setVerbs(List<String> verbs) {
    this.verbs = verbs;
  }

  public IoK8sApiFlowcontrolV1alpha1NonResourcePolicyRule verbs(List<String> verbs) {
    this.verbs = verbs;
    return this;
  }

  public IoK8sApiFlowcontrolV1alpha1NonResourcePolicyRule addVerbsItem(String verbsItem) {
    this.verbs.add(verbsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiFlowcontrolV1alpha1NonResourcePolicyRule {\n");
    
    sb.append("    nonResourceURLs: ").append(toIndentedString(nonResourceURLs)).append("\n");
    sb.append("    verbs: ").append(toIndentedString(verbs)).append("\n");
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

