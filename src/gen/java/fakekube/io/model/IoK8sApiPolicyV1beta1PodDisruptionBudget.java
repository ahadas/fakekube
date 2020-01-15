package fakekube.io.model;

import fakekube.io.model.IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec;
import fakekube.io.model.IoK8sApiPolicyV1beta1PodDisruptionBudgetStatus;
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
  * PodDisruptionBudget is an object to define the max disruption that can be caused to a collection of pods
 **/
@ApiModel(description="PodDisruptionBudget is an object to define the max disruption that can be caused to a collection of pods")
public class IoK8sApiPolicyV1beta1PodDisruptionBudget  {
  
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

  @ApiModelProperty(value = "Specification of the desired behavior of the PodDisruptionBudget.")
  @Valid
 /**
   * Specification of the desired behavior of the PodDisruptionBudget.
  **/
  private IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec spec = null;

  @ApiModelProperty(value = "Most recently observed status of the PodDisruptionBudget.")
  @Valid
 /**
   * Most recently observed status of the PodDisruptionBudget.
  **/
  private IoK8sApiPolicyV1beta1PodDisruptionBudgetStatus status = null;
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

  public IoK8sApiPolicyV1beta1PodDisruptionBudget apiVersion(String apiVersion) {
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

  public IoK8sApiPolicyV1beta1PodDisruptionBudget kind(String kind) {
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

  public IoK8sApiPolicyV1beta1PodDisruptionBudget metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * Specification of the desired behavior of the PodDisruptionBudget.
   * @return spec
  **/
  @JsonProperty("spec")
  public IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec getSpec() {
    return spec;
  }

  public void setSpec(IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec spec) {
    this.spec = spec;
  }

  public IoK8sApiPolicyV1beta1PodDisruptionBudget spec(IoK8sApiPolicyV1beta1PodDisruptionBudgetSpec spec) {
    this.spec = spec;
    return this;
  }

 /**
   * Most recently observed status of the PodDisruptionBudget.
   * @return status
  **/
  @JsonProperty("status")
  public IoK8sApiPolicyV1beta1PodDisruptionBudgetStatus getStatus() {
    return status;
  }

  public void setStatus(IoK8sApiPolicyV1beta1PodDisruptionBudgetStatus status) {
    this.status = status;
  }

  public IoK8sApiPolicyV1beta1PodDisruptionBudget status(IoK8sApiPolicyV1beta1PodDisruptionBudgetStatus status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiPolicyV1beta1PodDisruptionBudget {\n");
    
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

