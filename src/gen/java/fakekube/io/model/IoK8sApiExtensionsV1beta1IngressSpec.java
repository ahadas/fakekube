package fakekube.io.model;

import fakekube.io.model.IoK8sApiExtensionsV1beta1IngressBackend;
import fakekube.io.model.IoK8sApiExtensionsV1beta1IngressRule;
import fakekube.io.model.IoK8sApiExtensionsV1beta1IngressTLS;
import io.swagger.annotations.ApiModel;
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

/**
  * IngressSpec describes the Ingress the user wishes to exist.
 **/
@ApiModel(description="IngressSpec describes the Ingress the user wishes to exist.")
public class IoK8sApiExtensionsV1beta1IngressSpec  {
  
  @ApiModelProperty(value = "A default backend capable of servicing requests that don't match any rule. At least one of 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.")
  @Valid
 /**
   * A default backend capable of servicing requests that don't match any rule. At least one of 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.
  **/
  private IoK8sApiExtensionsV1beta1IngressBackend backend = null;

  @ApiModelProperty(value = "A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.")
  @Valid
 /**
   * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
  **/
  private List<IoK8sApiExtensionsV1beta1IngressRule> rules = null;

  @ApiModelProperty(value = "TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.")
  @Valid
 /**
   * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
  **/
  private List<IoK8sApiExtensionsV1beta1IngressTLS> tls = null;
 /**
   * A default backend capable of servicing requests that don&#39;t match any rule. At least one of &#39;backend&#39; or &#39;rules&#39; must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.
   * @return backend
  **/
  @JsonProperty("backend")
  public IoK8sApiExtensionsV1beta1IngressBackend getBackend() {
    return backend;
  }

  public void setBackend(IoK8sApiExtensionsV1beta1IngressBackend backend) {
    this.backend = backend;
  }

  public IoK8sApiExtensionsV1beta1IngressSpec backend(IoK8sApiExtensionsV1beta1IngressBackend backend) {
    this.backend = backend;
    return this;
  }

 /**
   * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
   * @return rules
  **/
  @JsonProperty("rules")
  public List<IoK8sApiExtensionsV1beta1IngressRule> getRules() {
    return rules;
  }

  public void setRules(List<IoK8sApiExtensionsV1beta1IngressRule> rules) {
    this.rules = rules;
  }

  public IoK8sApiExtensionsV1beta1IngressSpec rules(List<IoK8sApiExtensionsV1beta1IngressRule> rules) {
    this.rules = rules;
    return this;
  }

  public IoK8sApiExtensionsV1beta1IngressSpec addRulesItem(IoK8sApiExtensionsV1beta1IngressRule rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

 /**
   * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
   * @return tls
  **/
  @JsonProperty("tls")
  public List<IoK8sApiExtensionsV1beta1IngressTLS> getTls() {
    return tls;
  }

  public void setTls(List<IoK8sApiExtensionsV1beta1IngressTLS> tls) {
    this.tls = tls;
  }

  public IoK8sApiExtensionsV1beta1IngressSpec tls(List<IoK8sApiExtensionsV1beta1IngressTLS> tls) {
    this.tls = tls;
    return this;
  }

  public IoK8sApiExtensionsV1beta1IngressSpec addTlsItem(IoK8sApiExtensionsV1beta1IngressTLS tlsItem) {
    this.tls.add(tlsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiExtensionsV1beta1IngressSpec {\n");
    
    sb.append("    backend: ").append(toIndentedString(backend)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
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

