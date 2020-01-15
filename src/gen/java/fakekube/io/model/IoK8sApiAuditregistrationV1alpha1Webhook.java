package fakekube.io.model;

import fakekube.io.model.IoK8sApiAuditregistrationV1alpha1WebhookClientConfig;
import fakekube.io.model.IoK8sApiAuditregistrationV1alpha1WebhookThrottleConfig;
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
  * Webhook holds the configuration of the webhook
 **/
@ApiModel(description="Webhook holds the configuration of the webhook")
public class IoK8sApiAuditregistrationV1alpha1Webhook  {
  
  @ApiModelProperty(required = true, value = "ClientConfig holds the connection parameters for the webhook required")
  @Valid
 /**
   * ClientConfig holds the connection parameters for the webhook required
  **/
  private IoK8sApiAuditregistrationV1alpha1WebhookClientConfig clientConfig = null;

  @ApiModelProperty(value = "Throttle holds the options for throttling the webhook")
  @Valid
 /**
   * Throttle holds the options for throttling the webhook
  **/
  private IoK8sApiAuditregistrationV1alpha1WebhookThrottleConfig throttle = null;
 /**
   * ClientConfig holds the connection parameters for the webhook required
   * @return clientConfig
  **/
  @JsonProperty("clientConfig")
  @NotNull
  public IoK8sApiAuditregistrationV1alpha1WebhookClientConfig getClientConfig() {
    return clientConfig;
  }

  public void setClientConfig(IoK8sApiAuditregistrationV1alpha1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
  }

  public IoK8sApiAuditregistrationV1alpha1Webhook clientConfig(IoK8sApiAuditregistrationV1alpha1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
    return this;
  }

 /**
   * Throttle holds the options for throttling the webhook
   * @return throttle
  **/
  @JsonProperty("throttle")
  public IoK8sApiAuditregistrationV1alpha1WebhookThrottleConfig getThrottle() {
    return throttle;
  }

  public void setThrottle(IoK8sApiAuditregistrationV1alpha1WebhookThrottleConfig throttle) {
    this.throttle = throttle;
  }

  public IoK8sApiAuditregistrationV1alpha1Webhook throttle(IoK8sApiAuditregistrationV1alpha1WebhookThrottleConfig throttle) {
    this.throttle = throttle;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuditregistrationV1alpha1Webhook {\n");
    
    sb.append("    clientConfig: ").append(toIndentedString(clientConfig)).append("\n");
    sb.append("    throttle: ").append(toIndentedString(throttle)).append("\n");
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

