package fakekube.io.model;

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

public class IoK8sApiAuthorizationV1SelfSubjectRulesReviewSpec  {
  
  @ApiModelProperty(value = "Namespace to evaluate rules for. Required.")
 /**
   * Namespace to evaluate rules for. Required.
  **/
  private String namespace = null;
 /**
   * Namespace to evaluate rules for. Required.
   * @return namespace
  **/
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public IoK8sApiAuthorizationV1SelfSubjectRulesReviewSpec namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthorizationV1SelfSubjectRulesReviewSpec {\n");
    
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

