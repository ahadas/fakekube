package fakekube.io.model;

import fakekube.io.model.IoK8sApiAuditregistrationV1alpha1Policy;
import fakekube.io.model.IoK8sApiAuditregistrationV1alpha1Webhook;
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
  * AuditSinkSpec holds the spec for the audit sink
 **/
@ApiModel(description="AuditSinkSpec holds the spec for the audit sink")
public class IoK8sApiAuditregistrationV1alpha1AuditSinkSpec  {
  
  @ApiModelProperty(required = true, value = "Policy defines the policy for selecting which events should be sent to the webhook required")
  @Valid
 /**
   * Policy defines the policy for selecting which events should be sent to the webhook required
  **/
  private IoK8sApiAuditregistrationV1alpha1Policy policy = null;

  @ApiModelProperty(required = true, value = "Webhook to send events required")
  @Valid
 /**
   * Webhook to send events required
  **/
  private IoK8sApiAuditregistrationV1alpha1Webhook webhook = null;
 /**
   * Policy defines the policy for selecting which events should be sent to the webhook required
   * @return policy
  **/
  @JsonProperty("policy")
  @NotNull
  public IoK8sApiAuditregistrationV1alpha1Policy getPolicy() {
    return policy;
  }

  public void setPolicy(IoK8sApiAuditregistrationV1alpha1Policy policy) {
    this.policy = policy;
  }

  public IoK8sApiAuditregistrationV1alpha1AuditSinkSpec policy(IoK8sApiAuditregistrationV1alpha1Policy policy) {
    this.policy = policy;
    return this;
  }

 /**
   * Webhook to send events required
   * @return webhook
  **/
  @JsonProperty("webhook")
  @NotNull
  public IoK8sApiAuditregistrationV1alpha1Webhook getWebhook() {
    return webhook;
  }

  public void setWebhook(IoK8sApiAuditregistrationV1alpha1Webhook webhook) {
    this.webhook = webhook;
  }

  public IoK8sApiAuditregistrationV1alpha1AuditSinkSpec webhook(IoK8sApiAuditregistrationV1alpha1Webhook webhook) {
    this.webhook = webhook;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuditregistrationV1alpha1AuditSinkSpec {\n");
    
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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

