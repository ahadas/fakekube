package fakekube.io.model;

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
  * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
 **/
@ApiModel(description="NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface")
public class IoK8sApiAuthorizationV1NonResourceAttributes  {
  
  @ApiModelProperty(value = "Path is the URL path of the request")
 /**
   * Path is the URL path of the request
  **/
  private String path = null;

  @ApiModelProperty(value = "Verb is the standard HTTP verb")
 /**
   * Verb is the standard HTTP verb
  **/
  private String verb = null;
 /**
   * Path is the URL path of the request
   * @return path
  **/
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public IoK8sApiAuthorizationV1NonResourceAttributes path(String path) {
    this.path = path;
    return this;
  }

 /**
   * Verb is the standard HTTP verb
   * @return verb
  **/
  @JsonProperty("verb")
  public String getVerb() {
    return verb;
  }

  public void setVerb(String verb) {
    this.verb = verb;
  }

  public IoK8sApiAuthorizationV1NonResourceAttributes verb(String verb) {
    this.verb = verb;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthorizationV1NonResourceAttributes {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
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

