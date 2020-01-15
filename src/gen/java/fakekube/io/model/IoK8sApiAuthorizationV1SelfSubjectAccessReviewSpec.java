package fakekube.io.model;

import fakekube.io.model.IoK8sApiAuthorizationV1NonResourceAttributes;
import fakekube.io.model.IoK8sApiAuthorizationV1ResourceAttributes;
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
  * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 **/
@ApiModel(description="SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set")
public class IoK8sApiAuthorizationV1SelfSubjectAccessReviewSpec  {
  
  @ApiModelProperty(value = "NonResourceAttributes describes information for a non-resource access request")
  @Valid
 /**
   * NonResourceAttributes describes information for a non-resource access request
  **/
  private IoK8sApiAuthorizationV1NonResourceAttributes nonResourceAttributes = null;

  @ApiModelProperty(value = "ResourceAuthorizationAttributes describes information for a resource access request")
  @Valid
 /**
   * ResourceAuthorizationAttributes describes information for a resource access request
  **/
  private IoK8sApiAuthorizationV1ResourceAttributes resourceAttributes = null;
 /**
   * NonResourceAttributes describes information for a non-resource access request
   * @return nonResourceAttributes
  **/
  @JsonProperty("nonResourceAttributes")
  public IoK8sApiAuthorizationV1NonResourceAttributes getNonResourceAttributes() {
    return nonResourceAttributes;
  }

  public void setNonResourceAttributes(IoK8sApiAuthorizationV1NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
  }

  public IoK8sApiAuthorizationV1SelfSubjectAccessReviewSpec nonResourceAttributes(IoK8sApiAuthorizationV1NonResourceAttributes nonResourceAttributes) {
    this.nonResourceAttributes = nonResourceAttributes;
    return this;
  }

 /**
   * ResourceAuthorizationAttributes describes information for a resource access request
   * @return resourceAttributes
  **/
  @JsonProperty("resourceAttributes")
  public IoK8sApiAuthorizationV1ResourceAttributes getResourceAttributes() {
    return resourceAttributes;
  }

  public void setResourceAttributes(IoK8sApiAuthorizationV1ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
  }

  public IoK8sApiAuthorizationV1SelfSubjectAccessReviewSpec resourceAttributes(IoK8sApiAuthorizationV1ResourceAttributes resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthorizationV1SelfSubjectAccessReviewSpec {\n");
    
    sb.append("    nonResourceAttributes: ").append(toIndentedString(nonResourceAttributes)).append("\n");
    sb.append("    resourceAttributes: ").append(toIndentedString(resourceAttributes)).append("\n");
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

