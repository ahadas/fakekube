package fakekube.io.model;

import fakekube.io.model.IoK8sApiFlowcontrolV1alpha1FlowSchemaSpec;
import fakekube.io.model.IoK8sApiFlowcontrolV1alpha1FlowSchemaStatus;
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
  * FlowSchema defines the schema of a group of flows. Note that a flow is made up of a set of inbound API requests with similar attributes and is identified by a pair of strings: the name of the FlowSchema and a \"flow distinguisher\".
 **/
@ApiModel(description="FlowSchema defines the schema of a group of flows. Note that a flow is made up of a set of inbound API requests with similar attributes and is identified by a pair of strings: the name of the FlowSchema and a \"flow distinguisher\".")
public class IoK8sApiFlowcontrolV1alpha1FlowSchema  {
  
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

  @ApiModelProperty(value = "`metadata` is the standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
  @Valid
 /**
   * `metadata` is the standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
  **/
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  @ApiModelProperty(value = "`spec` is the specification of the desired behavior of a FlowSchema. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
  @Valid
 /**
   * `spec` is the specification of the desired behavior of a FlowSchema. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
  **/
  private IoK8sApiFlowcontrolV1alpha1FlowSchemaSpec spec = null;

  @ApiModelProperty(value = "`status` is the current status of a FlowSchema. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
  @Valid
 /**
   * `status` is the current status of a FlowSchema. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
  **/
  private IoK8sApiFlowcontrolV1alpha1FlowSchemaStatus status = null;
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

  public IoK8sApiFlowcontrolV1alpha1FlowSchema apiVersion(String apiVersion) {
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

  public IoK8sApiFlowcontrolV1alpha1FlowSchema kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * &#x60;metadata&#x60; is the standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * @return metadata
  **/
  @JsonProperty("metadata")
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public IoK8sApiFlowcontrolV1alpha1FlowSchema metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * &#x60;spec&#x60; is the specification of the desired behavior of a FlowSchema. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
   * @return spec
  **/
  @JsonProperty("spec")
  public IoK8sApiFlowcontrolV1alpha1FlowSchemaSpec getSpec() {
    return spec;
  }

  public void setSpec(IoK8sApiFlowcontrolV1alpha1FlowSchemaSpec spec) {
    this.spec = spec;
  }

  public IoK8sApiFlowcontrolV1alpha1FlowSchema spec(IoK8sApiFlowcontrolV1alpha1FlowSchemaSpec spec) {
    this.spec = spec;
    return this;
  }

 /**
   * &#x60;status&#x60; is the current status of a FlowSchema. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
   * @return status
  **/
  @JsonProperty("status")
  public IoK8sApiFlowcontrolV1alpha1FlowSchemaStatus getStatus() {
    return status;
  }

  public void setStatus(IoK8sApiFlowcontrolV1alpha1FlowSchemaStatus status) {
    this.status = status;
  }

  public IoK8sApiFlowcontrolV1alpha1FlowSchema status(IoK8sApiFlowcontrolV1alpha1FlowSchemaStatus status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiFlowcontrolV1alpha1FlowSchema {\n");
    
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

