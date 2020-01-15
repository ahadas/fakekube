package fakekube.io.model;

import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec;
import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionStatus;
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
  * CustomResourceDefinition represents a resource that should be exposed on the API server.  Its name MUST be in the format <.spec.name>.<.spec.group>. Deprecated in v1.16, planned for removal in v1.19. Use apiextensions.k8s.io/v1 CustomResourceDefinition instead.
 **/
@ApiModel(description="CustomResourceDefinition represents a resource that should be exposed on the API server.  Its name MUST be in the format <.spec.name>.<.spec.group>. Deprecated in v1.16, planned for removal in v1.19. Use apiextensions.k8s.io/v1 CustomResourceDefinition instead.")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition  {
  
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

  @ApiModelProperty(required = true, value = "spec describes how the user wants the resources to appear")
  @Valid
 /**
   * spec describes how the user wants the resources to appear
  **/
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec spec = null;

  @ApiModelProperty(value = "status indicates the actual state of the CustomResourceDefinition")
  @Valid
 /**
   * status indicates the actual state of the CustomResourceDefinition
  **/
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionStatus status = null;
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

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition apiVersion(String apiVersion) {
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

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition kind(String kind) {
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

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * spec describes how the user wants the resources to appear
   * @return spec
  **/
  @JsonProperty("spec")
  @NotNull
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec getSpec() {
    return spec;
  }

  public void setSpec(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec spec) {
    this.spec = spec;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition spec(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionSpec spec) {
    this.spec = spec;
    return this;
  }

 /**
   * status indicates the actual state of the CustomResourceDefinition
   * @return status
  **/
  @JsonProperty("status")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionStatus getStatus() {
    return status;
  }

  public void setStatus(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionStatus status) {
    this.status = status;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition status(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionStatus status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition {\n");
    
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

