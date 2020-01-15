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
  * NonResourceRule holds information that describes a rule for the non-resource
 **/
@ApiModel(description="NonResourceRule holds information that describes a rule for the non-resource")
public class IoK8sApiAuthorizationV1NonResourceRule  {
  
  @ApiModelProperty(value = "NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path.  \"*\" means all.")
 /**
   * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path.  \"*\" means all.
  **/
  private List<String> nonResourceURLs = null;

  @ApiModelProperty(required = true, value = "Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  \"*\" means all.")
 /**
   * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  \"*\" means all.
  **/
  private List<String> verbs = new ArrayList<String>();
 /**
   * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path.  \&quot;*\&quot; means all.
   * @return nonResourceURLs
  **/
  @JsonProperty("nonResourceURLs")
  public List<String> getNonResourceURLs() {
    return nonResourceURLs;
  }

  public void setNonResourceURLs(List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
  }

  public IoK8sApiAuthorizationV1NonResourceRule nonResourceURLs(List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
    return this;
  }

  public IoK8sApiAuthorizationV1NonResourceRule addNonResourceURLsItem(String nonResourceURLsItem) {
    this.nonResourceURLs.add(nonResourceURLsItem);
    return this;
  }

 /**
   * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  \&quot;*\&quot; means all.
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

  public IoK8sApiAuthorizationV1NonResourceRule verbs(List<String> verbs) {
    this.verbs = verbs;
    return this;
  }

  public IoK8sApiAuthorizationV1NonResourceRule addVerbsItem(String verbsItem) {
    this.verbs.add(verbsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthorizationV1NonResourceRule {\n");
    
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

