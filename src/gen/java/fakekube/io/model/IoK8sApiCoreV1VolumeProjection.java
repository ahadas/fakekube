package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ConfigMapProjection;
import fakekube.io.model.IoK8sApiCoreV1DownwardAPIProjection;
import fakekube.io.model.IoK8sApiCoreV1SecretProjection;
import fakekube.io.model.IoK8sApiCoreV1ServiceAccountTokenProjection;
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
  * Projection that may be projected along with other supported volume types
 **/
@ApiModel(description="Projection that may be projected along with other supported volume types")
public class IoK8sApiCoreV1VolumeProjection  {
  
  @ApiModelProperty(value = "information about the configMap data to project")
  @Valid
 /**
   * information about the configMap data to project
  **/
  private IoK8sApiCoreV1ConfigMapProjection configMap = null;

  @ApiModelProperty(value = "information about the downwardAPI data to project")
  @Valid
 /**
   * information about the downwardAPI data to project
  **/
  private IoK8sApiCoreV1DownwardAPIProjection downwardAPI = null;

  @ApiModelProperty(value = "information about the secret data to project")
  @Valid
 /**
   * information about the secret data to project
  **/
  private IoK8sApiCoreV1SecretProjection secret = null;

  @ApiModelProperty(value = "information about the serviceAccountToken data to project")
  @Valid
 /**
   * information about the serviceAccountToken data to project
  **/
  private IoK8sApiCoreV1ServiceAccountTokenProjection serviceAccountToken = null;
 /**
   * information about the configMap data to project
   * @return configMap
  **/
  @JsonProperty("configMap")
  public IoK8sApiCoreV1ConfigMapProjection getConfigMap() {
    return configMap;
  }

  public void setConfigMap(IoK8sApiCoreV1ConfigMapProjection configMap) {
    this.configMap = configMap;
  }

  public IoK8sApiCoreV1VolumeProjection configMap(IoK8sApiCoreV1ConfigMapProjection configMap) {
    this.configMap = configMap;
    return this;
  }

 /**
   * information about the downwardAPI data to project
   * @return downwardAPI
  **/
  @JsonProperty("downwardAPI")
  public IoK8sApiCoreV1DownwardAPIProjection getDownwardAPI() {
    return downwardAPI;
  }

  public void setDownwardAPI(IoK8sApiCoreV1DownwardAPIProjection downwardAPI) {
    this.downwardAPI = downwardAPI;
  }

  public IoK8sApiCoreV1VolumeProjection downwardAPI(IoK8sApiCoreV1DownwardAPIProjection downwardAPI) {
    this.downwardAPI = downwardAPI;
    return this;
  }

 /**
   * information about the secret data to project
   * @return secret
  **/
  @JsonProperty("secret")
  public IoK8sApiCoreV1SecretProjection getSecret() {
    return secret;
  }

  public void setSecret(IoK8sApiCoreV1SecretProjection secret) {
    this.secret = secret;
  }

  public IoK8sApiCoreV1VolumeProjection secret(IoK8sApiCoreV1SecretProjection secret) {
    this.secret = secret;
    return this;
  }

 /**
   * information about the serviceAccountToken data to project
   * @return serviceAccountToken
  **/
  @JsonProperty("serviceAccountToken")
  public IoK8sApiCoreV1ServiceAccountTokenProjection getServiceAccountToken() {
    return serviceAccountToken;
  }

  public void setServiceAccountToken(IoK8sApiCoreV1ServiceAccountTokenProjection serviceAccountToken) {
    this.serviceAccountToken = serviceAccountToken;
  }

  public IoK8sApiCoreV1VolumeProjection serviceAccountToken(IoK8sApiCoreV1ServiceAccountTokenProjection serviceAccountToken) {
    this.serviceAccountToken = serviceAccountToken;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1VolumeProjection {\n");
    
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    downwardAPI: ").append(toIndentedString(downwardAPI)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    serviceAccountToken: ").append(toIndentedString(serviceAccountToken)).append("\n");
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

