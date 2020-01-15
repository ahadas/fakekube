package fakekube.io.model;

import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1WebhookClientConfig;
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
  * CustomResourceConversion describes how to convert different versions of a CR.
 **/
@ApiModel(description="CustomResourceConversion describes how to convert different versions of a CR.")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceConversion  {
  
  @ApiModelProperty(value = "conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Defaults to `[\"v1beta1\"]`.")
 /**
   * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Defaults to `[\"v1beta1\"]`.
  **/
  private List<String> conversionReviewVersions = null;

  @ApiModelProperty(required = true, value = "strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhookClientConfig to be set.")
 /**
   * strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhookClientConfig to be set.
  **/
  private String strategy = null;

  @ApiModelProperty(value = "webhookClientConfig is the instructions for how to call the webhook if strategy is `Webhook`. Required when `strategy` is set to `Webhook`.")
  @Valid
 /**
   * webhookClientConfig is the instructions for how to call the webhook if strategy is `Webhook`. Required when `strategy` is set to `Webhook`.
  **/
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1WebhookClientConfig webhookClientConfig = null;
 /**
   * conversionReviewVersions is an ordered list of preferred &#x60;ConversionReview&#x60; versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Defaults to &#x60;[\&quot;v1beta1\&quot;]&#x60;.
   * @return conversionReviewVersions
  **/
  @JsonProperty("conversionReviewVersions")
  public List<String> getConversionReviewVersions() {
    return conversionReviewVersions;
  }

  public void setConversionReviewVersions(List<String> conversionReviewVersions) {
    this.conversionReviewVersions = conversionReviewVersions;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceConversion conversionReviewVersions(List<String> conversionReviewVersions) {
    this.conversionReviewVersions = conversionReviewVersions;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceConversion addConversionReviewVersionsItem(String conversionReviewVersionsItem) {
    this.conversionReviewVersions.add(conversionReviewVersionsItem);
    return this;
  }

 /**
   * strategy specifies how custom resources are converted between versions. Allowed values are: - &#x60;None&#x60;: The converter only change the apiVersion and would not touch any other field in the custom resource. - &#x60;Webhook&#x60;: API Server will call to an external webhook to do the conversion. Additional information   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhookClientConfig to be set.
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

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceConversion strategy(String strategy) {
    this.strategy = strategy;
    return this;
  }

 /**
   * webhookClientConfig is the instructions for how to call the webhook if strategy is &#x60;Webhook&#x60;. Required when &#x60;strategy&#x60; is set to &#x60;Webhook&#x60;.
   * @return webhookClientConfig
  **/
  @JsonProperty("webhookClientConfig")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1WebhookClientConfig getWebhookClientConfig() {
    return webhookClientConfig;
  }

  public void setWebhookClientConfig(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1WebhookClientConfig webhookClientConfig) {
    this.webhookClientConfig = webhookClientConfig;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceConversion webhookClientConfig(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1WebhookClientConfig webhookClientConfig) {
    this.webhookClientConfig = webhookClientConfig;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceConversion {\n");
    
    sb.append("    conversionReviewVersions: ").append(toIndentedString(conversionReviewVersions)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    webhookClientConfig: ").append(toIndentedString(webhookClientConfig)).append("\n");
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

