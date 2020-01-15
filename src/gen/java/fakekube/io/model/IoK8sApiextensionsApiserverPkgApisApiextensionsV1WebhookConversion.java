package fakekube.io.model;

import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookClientConfig;
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
  * WebhookConversion describes how to call a conversion webhook
 **/
@ApiModel(description="WebhookConversion describes how to call a conversion webhook")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookConversion  {
  
  @ApiModelProperty(value = "clientConfig is the instructions for how to call the webhook if strategy is `Webhook`.")
  @Valid
 /**
   * clientConfig is the instructions for how to call the webhook if strategy is `Webhook`.
  **/
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookClientConfig clientConfig = null;

  @ApiModelProperty(required = true, value = "conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail.")
 /**
   * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail.
  **/
  private List<String> conversionReviewVersions = new ArrayList<String>();
 /**
   * clientConfig is the instructions for how to call the webhook if strategy is &#x60;Webhook&#x60;.
   * @return clientConfig
  **/
  @JsonProperty("clientConfig")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookClientConfig getClientConfig() {
    return clientConfig;
  }

  public void setClientConfig(IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookConversion clientConfig(IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookClientConfig clientConfig) {
    this.clientConfig = clientConfig;
    return this;
  }

 /**
   * conversionReviewVersions is an ordered list of preferred &#x60;ConversionReview&#x60; versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail.
   * @return conversionReviewVersions
  **/
  @JsonProperty("conversionReviewVersions")
  @NotNull
  public List<String> getConversionReviewVersions() {
    return conversionReviewVersions;
  }

  public void setConversionReviewVersions(List<String> conversionReviewVersions) {
    this.conversionReviewVersions = conversionReviewVersions;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookConversion conversionReviewVersions(List<String> conversionReviewVersions) {
    this.conversionReviewVersions = conversionReviewVersions;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookConversion addConversionReviewVersionsItem(String conversionReviewVersionsItem) {
    this.conversionReviewVersions.add(conversionReviewVersionsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookConversion {\n");
    
    sb.append("    clientConfig: ").append(toIndentedString(clientConfig)).append("\n");
    sb.append("    conversionReviewVersions: ").append(toIndentedString(conversionReviewVersions)).append("\n");
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

