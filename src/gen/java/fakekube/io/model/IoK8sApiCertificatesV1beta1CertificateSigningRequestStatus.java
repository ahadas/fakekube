package fakekube.io.model;

import fakekube.io.model.IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition;
import java.util.ArrayList;
import java.util.List;
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

public class IoK8sApiCertificatesV1beta1CertificateSigningRequestStatus  {
  
  @ApiModelProperty(value = "If request was approved, the controller will place the issued certificate here.")
 /**
   * If request was approved, the controller will place the issued certificate here.
  **/
  private byte[] certificate = null;

  @ApiModelProperty(value = "Conditions applied to the request, such as approval or denial.")
  @Valid
 /**
   * Conditions applied to the request, such as approval or denial.
  **/
  private List<IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition> conditions = null;
 /**
   * If request was approved, the controller will place the issued certificate here.
   * @return certificate
  **/
  @JsonProperty("certificate")
 @Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")  public byte[] getCertificate() {
    return certificate;
  }

  public void setCertificate(byte[] certificate) {
    this.certificate = certificate;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestStatus certificate(byte[] certificate) {
    this.certificate = certificate;
    return this;
  }

 /**
   * Conditions applied to the request, such as approval or denial.
   * @return conditions
  **/
  @JsonProperty("conditions")
  public List<IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestStatus conditions(List<IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestStatus addConditionsItem(IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCertificatesV1beta1CertificateSigningRequestStatus {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

