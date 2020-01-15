package fakekube.io.model;

import fakekube.io.model.IoK8sApiCertificatesV1beta1CertificateSigningRequestSpec;
import fakekube.io.model.IoK8sApiCertificatesV1beta1CertificateSigningRequestStatus;
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
  * Describes a certificate signing request
 **/
@ApiModel(description="Describes a certificate signing request")
public class IoK8sApiCertificatesV1beta1CertificateSigningRequest  {
  
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

  @ApiModelProperty(value = "The certificate request itself and any additional information.")
  @Valid
 /**
   * The certificate request itself and any additional information.
  **/
  private IoK8sApiCertificatesV1beta1CertificateSigningRequestSpec spec = null;

  @ApiModelProperty(value = "Derived information about the request.")
  @Valid
 /**
   * Derived information about the request.
  **/
  private IoK8sApiCertificatesV1beta1CertificateSigningRequestStatus status = null;
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

  public IoK8sApiCertificatesV1beta1CertificateSigningRequest apiVersion(String apiVersion) {
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

  public IoK8sApiCertificatesV1beta1CertificateSigningRequest kind(String kind) {
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

  public IoK8sApiCertificatesV1beta1CertificateSigningRequest metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * The certificate request itself and any additional information.
   * @return spec
  **/
  @JsonProperty("spec")
  public IoK8sApiCertificatesV1beta1CertificateSigningRequestSpec getSpec() {
    return spec;
  }

  public void setSpec(IoK8sApiCertificatesV1beta1CertificateSigningRequestSpec spec) {
    this.spec = spec;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequest spec(IoK8sApiCertificatesV1beta1CertificateSigningRequestSpec spec) {
    this.spec = spec;
    return this;
  }

 /**
   * Derived information about the request.
   * @return status
  **/
  @JsonProperty("status")
  public IoK8sApiCertificatesV1beta1CertificateSigningRequestStatus getStatus() {
    return status;
  }

  public void setStatus(IoK8sApiCertificatesV1beta1CertificateSigningRequestStatus status) {
    this.status = status;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequest status(IoK8sApiCertificatesV1beta1CertificateSigningRequestStatus status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCertificatesV1beta1CertificateSigningRequest {\n");
    
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

