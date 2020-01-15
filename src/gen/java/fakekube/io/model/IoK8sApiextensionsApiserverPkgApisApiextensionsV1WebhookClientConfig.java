package fakekube.io.model;

import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1ServiceReference;
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
  * WebhookClientConfig contains the information to make a TLS connection with the webhook.
 **/
@ApiModel(description="WebhookClientConfig contains the information to make a TLS connection with the webhook.")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookClientConfig  {
  
  @ApiModelProperty(value = "caBundle is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified, system trust roots on the apiserver are used.")
 /**
   * caBundle is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified, system trust roots on the apiserver are used.
  **/
  private byte[] caBundle = null;

  @ApiModelProperty(value = "service is a reference to the service for this webhook. Either service or url must be specified.  If the webhook is running within the cluster, then you should use `service`.")
  @Valid
 /**
   * service is a reference to the service for this webhook. Either service or url must be specified.  If the webhook is running within the cluster, then you should use `service`.
  **/
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1ServiceReference service = null;

  @ApiModelProperty(value = "url gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or `service` must be specified.  The `host` should not refer to a service running in the cluster; use the `service` field instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation). `host` may also be an IP address.  Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.  The scheme must be \"https\"; the URL must begin with \"https://\".  A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.  Attempting to use a user or basic auth e.g. \"user:password@\" is not allowed. Fragments (\"#...\") and query parameters (\"?...\") are not allowed, either.")
 /**
   * url gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or `service` must be specified.  The `host` should not refer to a service running in the cluster; use the `service` field instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation). `host` may also be an IP address.  Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.  The scheme must be \"https\"; the URL must begin with \"https://\".  A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.  Attempting to use a user or basic auth e.g. \"user:password@\" is not allowed. Fragments (\"#...\") and query parameters (\"?...\") are not allowed, either.
  **/
  private String url = null;
 /**
   * caBundle is a PEM encoded CA bundle which will be used to validate the webhook&#39;s server certificate. If unspecified, system trust roots on the apiserver are used.
   * @return caBundle
  **/
  @JsonProperty("caBundle")
 @Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")  public byte[] getCaBundle() {
    return caBundle;
  }

  public void setCaBundle(byte[] caBundle) {
    this.caBundle = caBundle;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookClientConfig caBundle(byte[] caBundle) {
    this.caBundle = caBundle;
    return this;
  }

 /**
   * service is a reference to the service for this webhook. Either service or url must be specified.  If the webhook is running within the cluster, then you should use &#x60;service&#x60;.
   * @return service
  **/
  @JsonProperty("service")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1ServiceReference getService() {
    return service;
  }

  public void setService(IoK8sApiextensionsApiserverPkgApisApiextensionsV1ServiceReference service) {
    this.service = service;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookClientConfig service(IoK8sApiextensionsApiserverPkgApisApiextensionsV1ServiceReference service) {
    this.service = service;
    return this;
  }

 /**
   * url gives the location of the webhook, in standard URL form (&#x60;scheme://host:port/path&#x60;). Exactly one of &#x60;url&#x60; or &#x60;service&#x60; must be specified.  The &#x60;host&#x60; should not refer to a service running in the cluster; use the &#x60;service&#x60; field instead. The host might be resolved via external DNS in some apiservers (e.g., &#x60;kube-apiserver&#x60; cannot resolve in-cluster DNS as that would be a layering violation). &#x60;host&#x60; may also be an IP address.  Please note that using &#x60;localhost&#x60; or &#x60;127.0.0.1&#x60; as a &#x60;host&#x60; is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.  The scheme must be \&quot;https\&quot;; the URL must begin with \&quot;https://\&quot;.  A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.  Attempting to use a user or basic auth e.g. \&quot;user:password@\&quot; is not allowed. Fragments (\&quot;#...\&quot;) and query parameters (\&quot;?...\&quot;) are not allowed, either.
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookClientConfig url(String url) {
    this.url = url;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookClientConfig {\n");
    
    sb.append("    caBundle: ").append(toIndentedString(caBundle)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

