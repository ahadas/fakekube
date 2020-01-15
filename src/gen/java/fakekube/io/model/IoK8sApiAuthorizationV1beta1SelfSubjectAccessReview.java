package fakekube.io.model;

import fakekube.io.model.IoK8sApiAuthorizationV1beta1SelfSubjectAccessReviewSpec;
import fakekube.io.model.IoK8sApiAuthorizationV1beta1SubjectAccessReviewStatus;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1ObjectMeta;
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
  * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not filling in a spec.namespace means \"in all namespaces\".  Self is a special case, because users should always be able to check whether they can perform an action
 **/
@ApiModel(description="SelfSubjectAccessReview checks whether or the current user can perform an action.  Not filling in a spec.namespace means \"in all namespaces\".  Self is a special case, because users should always be able to check whether they can perform an action")
public class IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview  {
  
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
 /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
  **/
  private String apiVersion = null;

  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
 /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
  **/
  private String kind = null;

  @ApiModelProperty(value = "")
  @Valid
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  @ApiModelProperty(required = true, value = "Spec holds information about the request being evaluated.  user and groups must be empty")
  @Valid
 /**
   * Spec holds information about the request being evaluated.  user and groups must be empty
  **/
  private IoK8sApiAuthorizationV1beta1SelfSubjectAccessReviewSpec spec = null;

  @ApiModelProperty(value = "Status is filled in by the server and indicates whether the request is allowed or not")
  @Valid
 /**
   * Status is filled in by the server and indicates whether the request is allowed or not
  **/
  private IoK8sApiAuthorizationV1beta1SubjectAccessReviewStatus status = null;
 /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

 /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * Get metadata
   * @return metadata
  **/
  @JsonProperty("metadata")
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * Spec holds information about the request being evaluated.  user and groups must be empty
   * @return spec
  **/
  @JsonProperty("spec")
  @NotNull
  public IoK8sApiAuthorizationV1beta1SelfSubjectAccessReviewSpec getSpec() {
    return spec;
  }

  public void setSpec(IoK8sApiAuthorizationV1beta1SelfSubjectAccessReviewSpec spec) {
    this.spec = spec;
  }

  public IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview spec(IoK8sApiAuthorizationV1beta1SelfSubjectAccessReviewSpec spec) {
    this.spec = spec;
    return this;
  }

 /**
   * Status is filled in by the server and indicates whether the request is allowed or not
   * @return status
  **/
  @JsonProperty("status")
  public IoK8sApiAuthorizationV1beta1SubjectAccessReviewStatus getStatus() {
    return status;
  }

  public void setStatus(IoK8sApiAuthorizationV1beta1SubjectAccessReviewStatus status) {
    this.status = status;
  }

  public IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview status(IoK8sApiAuthorizationV1beta1SubjectAccessReviewStatus status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

