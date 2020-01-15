package fakekube.io.model;

import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookConversion;
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
  * CustomResourceConversion describes how to convert different versions of a CR.
 **/
@ApiModel(description="CustomResourceConversion describes how to convert different versions of a CR.")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion  {
  
  @ApiModelProperty(required = true, value = "strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.")
 /**
   * strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.
  **/
  private String strategy = null;

  @ApiModelProperty(value = "webhook describes how to call the conversion webhook. Required when `strategy` is set to `Webhook`.")
  @Valid
 /**
   * webhook describes how to call the conversion webhook. Required when `strategy` is set to `Webhook`.
  **/
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookConversion webhook = null;
 /**
   * strategy specifies how custom resources are converted between versions. Allowed values are: - &#x60;None&#x60;: The converter only change the apiVersion and would not touch any other field in the custom resource. - &#x60;Webhook&#x60;: API Server will call to an external webhook to do the conversion. Additional information   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.
   * @return strategy
  **/
  @JsonProperty("strategy")
  @NotNull
  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion strategy(String strategy) {
    this.strategy = strategy;
    return this;
  }

 /**
   * webhook describes how to call the conversion webhook. Required when &#x60;strategy&#x60; is set to &#x60;Webhook&#x60;.
   * @return webhook
  **/
  @JsonProperty("webhook")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookConversion getWebhook() {
    return webhook;
  }

  public void setWebhook(IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookConversion webhook) {
    this.webhook = webhook;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion webhook(IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookConversion webhook) {
    this.webhook = webhook;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion {\n");
    
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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

