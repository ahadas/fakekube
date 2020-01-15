package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ConfigMapEnvSource;
import fakekube.io.model.IoK8sApiCoreV1SecretEnvSource;
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
  * EnvFromSource represents the source of a set of ConfigMaps
 **/
@ApiModel(description="EnvFromSource represents the source of a set of ConfigMaps")
public class IoK8sApiCoreV1EnvFromSource  {
  
  @ApiModelProperty(value = "The ConfigMap to select from")
  @Valid
 /**
   * The ConfigMap to select from
  **/
  private IoK8sApiCoreV1ConfigMapEnvSource configMapRef = null;

  @ApiModelProperty(value = "An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.")
 /**
   * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
  **/
  private String prefix = null;

  @ApiModelProperty(value = "The Secret to select from")
  @Valid
 /**
   * The Secret to select from
  **/
  private IoK8sApiCoreV1SecretEnvSource secretRef = null;
 /**
   * The ConfigMap to select from
   * @return configMapRef
  **/
  @JsonProperty("configMapRef")
  public IoK8sApiCoreV1ConfigMapEnvSource getConfigMapRef() {
    return configMapRef;
  }

  public void setConfigMapRef(IoK8sApiCoreV1ConfigMapEnvSource configMapRef) {
    this.configMapRef = configMapRef;
  }

  public IoK8sApiCoreV1EnvFromSource configMapRef(IoK8sApiCoreV1ConfigMapEnvSource configMapRef) {
    this.configMapRef = configMapRef;
    return this;
  }

 /**
   * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
   * @return prefix
  **/
  @JsonProperty("prefix")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public IoK8sApiCoreV1EnvFromSource prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

 /**
   * The Secret to select from
   * @return secretRef
  **/
  @JsonProperty("secretRef")
  public IoK8sApiCoreV1SecretEnvSource getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(IoK8sApiCoreV1SecretEnvSource secretRef) {
    this.secretRef = secretRef;
  }

  public IoK8sApiCoreV1EnvFromSource secretRef(IoK8sApiCoreV1SecretEnvSource secretRef) {
    this.secretRef = secretRef;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1EnvFromSource {\n");
    
    sb.append("    configMapRef: ").append(toIndentedString(configMapRef)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
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

