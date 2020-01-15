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
  * CrossVersionObjectReference contains enough information to let you identify the referred resource.
 **/
@ApiModel(description="CrossVersionObjectReference contains enough information to let you identify the referred resource.")
public class IoK8sApiAutoscalingV1CrossVersionObjectReference  {
  
  @ApiModelProperty(value = "API version of the referent")
 /**
   * API version of the referent
  **/
  private String apiVersion = null;

  @ApiModelProperty(required = true, value = "Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds\"")
 /**
   * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds\"
  **/
  private String kind = null;

  @ApiModelProperty(required = true, value = "Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names")
 /**
   * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
  **/
  private String name = null;
 /**
   * API version of the referent
   * @return apiVersion
  **/
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public IoK8sApiAutoscalingV1CrossVersionObjectReference apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

 /**
   * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds\&quot;
   * @return kind
  **/
  @JsonProperty("kind")
  @NotNull
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoK8sApiAutoscalingV1CrossVersionObjectReference kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiAutoscalingV1CrossVersionObjectReference name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV1CrossVersionObjectReference {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

