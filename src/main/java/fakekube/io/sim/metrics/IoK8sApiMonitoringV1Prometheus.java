package fakekube.io.sim.metrics;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1ObjectMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
  * Deployment enables declarative updates for Pods and ReplicaSets.
 **/
@ApiModel(description="Deployment enables declarative updates for Pods and ReplicaSets.")
public class IoK8sApiMonitoringV1Prometheus  {
  
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

  @ApiModelProperty(value = "Standard object metadata.")
  @Valid
 /**
   * Standard object metadata.
  **/
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  @ApiModelProperty(value = "Specification of the desired behavior of the Deployment.")
  @Valid
 /**
   * Specification of the desired behavior of the Deployment.
  **/
  private IoK8sApiMonitoringV1PrometheusSpec spec = null;

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

  public IoK8sApiMonitoringV1Prometheus apiVersion(String apiVersion) {
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

  public IoK8sApiMonitoringV1Prometheus kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * Standard object metadata.
   * @return metadata
  **/
  @JsonProperty("metadata")
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public IoK8sApiMonitoringV1Prometheus metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * Specification of the desired behavior of the Deployment.
   * @return spec
  **/
  @JsonProperty("spec")
  public IoK8sApiMonitoringV1PrometheusSpec getSpec() {
    return spec;
  }

  public void setSpec(IoK8sApiMonitoringV1PrometheusSpec spec) {
    this.spec = spec;
  }

  public IoK8sApiMonitoringV1Prometheus spec(IoK8sApiMonitoringV1PrometheusSpec spec) {
    this.spec = spec;
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAppsV1Deployment {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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

