package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1HTTPHeader;
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
  * HTTPGetAction describes an action based on HTTP Get requests.
 **/
@ApiModel(description="HTTPGetAction describes an action based on HTTP Get requests.")
public class IoK8sApiCoreV1HTTPGetAction  {
  
  @ApiModelProperty(value = "Host name to connect to, defaults to the pod IP. You probably want to set \"Host\" in httpHeaders instead.")
 /**
   * Host name to connect to, defaults to the pod IP. You probably want to set \"Host\" in httpHeaders instead.
  **/
  private String host = null;

  @ApiModelProperty(value = "Custom headers to set in the request. HTTP allows repeated headers.")
  @Valid
 /**
   * Custom headers to set in the request. HTTP allows repeated headers.
  **/
  private List<IoK8sApiCoreV1HTTPHeader> httpHeaders = null;

  @ApiModelProperty(value = "Path to access on the HTTP server.")
 /**
   * Path to access on the HTTP server.
  **/
  private String path = null;

  @ApiModelProperty(required = true, value = "Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.")
 /**
   * Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
  **/
  private String port = null;

  @ApiModelProperty(value = "Scheme to use for connecting to the host. Defaults to HTTP.")
 /**
   * Scheme to use for connecting to the host. Defaults to HTTP.
  **/
  private String scheme = null;
 /**
   * Host name to connect to, defaults to the pod IP. You probably want to set \&quot;Host\&quot; in httpHeaders instead.
   * @return host
  **/
  @JsonProperty("host")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public IoK8sApiCoreV1HTTPGetAction host(String host) {
    this.host = host;
    return this;
  }

 /**
   * Custom headers to set in the request. HTTP allows repeated headers.
   * @return httpHeaders
  **/
  @JsonProperty("httpHeaders")
  public List<IoK8sApiCoreV1HTTPHeader> getHttpHeaders() {
    return httpHeaders;
  }

  public void setHttpHeaders(List<IoK8sApiCoreV1HTTPHeader> httpHeaders) {
    this.httpHeaders = httpHeaders;
  }

  public IoK8sApiCoreV1HTTPGetAction httpHeaders(List<IoK8sApiCoreV1HTTPHeader> httpHeaders) {
    this.httpHeaders = httpHeaders;
    return this;
  }

  public IoK8sApiCoreV1HTTPGetAction addHttpHeadersItem(IoK8sApiCoreV1HTTPHeader httpHeadersItem) {
    this.httpHeaders.add(httpHeadersItem);
    return this;
  }

 /**
   * Path to access on the HTTP server.
   * @return path
  **/
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public IoK8sApiCoreV1HTTPGetAction path(String path) {
    this.path = path;
    return this;
  }

 /**
   * Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
   * @return port
  **/
  @JsonProperty("port")
  @NotNull
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public IoK8sApiCoreV1HTTPGetAction port(String port) {
    this.port = port;
    return this;
  }

 /**
   * Scheme to use for connecting to the host. Defaults to HTTP.
   * @return scheme
  **/
  @JsonProperty("scheme")
  public String getScheme() {
    return scheme;
  }

  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  public IoK8sApiCoreV1HTTPGetAction scheme(String scheme) {
    this.scheme = scheme;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1HTTPGetAction {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    httpHeaders: ").append(toIndentedString(httpHeaders)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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

