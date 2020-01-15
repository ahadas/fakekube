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
  * BoundObjectReference is a reference to an object that a token is bound to.
 **/
@ApiModel(description="BoundObjectReference is a reference to an object that a token is bound to.")
public class IoK8sApiAuthenticationV1BoundObjectReference  {
  
  @ApiModelProperty(value = "API version of the referent.")
 /**
   * API version of the referent.
  **/
  private String apiVersion = null;

  @ApiModelProperty(value = "Kind of the referent. Valid kinds are 'Pod' and 'Secret'.")
 /**
   * Kind of the referent. Valid kinds are 'Pod' and 'Secret'.
  **/
  private String kind = null;

  @ApiModelProperty(value = "Name of the referent.")
 /**
   * Name of the referent.
  **/
  private String name = null;

  @ApiModelProperty(value = "UID of the referent.")
 /**
   * UID of the referent.
  **/
  private String uid = null;
 /**
   * API version of the referent.
   * @return apiVersion
  **/
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public IoK8sApiAuthenticationV1BoundObjectReference apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

 /**
   * Kind of the referent. Valid kinds are &#39;Pod&#39; and &#39;Secret&#39;.
   * @return kind
  **/
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoK8sApiAuthenticationV1BoundObjectReference kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * Name of the referent.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiAuthenticationV1BoundObjectReference name(String name) {
    this.name = name;
    return this;
  }

 /**
   * UID of the referent.
   * @return uid
  **/
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public IoK8sApiAuthenticationV1BoundObjectReference uid(String uid) {
    this.uid = uid;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthenticationV1BoundObjectReference {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

