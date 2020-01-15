package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1PodDNSConfigOption;
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
  * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
 **/
@ApiModel(description="PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.")
public class IoK8sApiCoreV1PodDNSConfig  {
  
  @ApiModelProperty(value = "A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.")
 /**
   * A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
  **/
  private List<String> nameservers = null;

  @ApiModelProperty(value = "A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.")
  @Valid
 /**
   * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
  **/
  private List<IoK8sApiCoreV1PodDNSConfigOption> options = null;

  @ApiModelProperty(value = "A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.")
 /**
   * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
  **/
  private List<String> searches = null;
 /**
   * A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
   * @return nameservers
  **/
  @JsonProperty("nameservers")
  public List<String> getNameservers() {
    return nameservers;
  }

  public void setNameservers(List<String> nameservers) {
    this.nameservers = nameservers;
  }

  public IoK8sApiCoreV1PodDNSConfig nameservers(List<String> nameservers) {
    this.nameservers = nameservers;
    return this;
  }

  public IoK8sApiCoreV1PodDNSConfig addNameserversItem(String nameserversItem) {
    this.nameservers.add(nameserversItem);
    return this;
  }

 /**
   * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
   * @return options
  **/
  @JsonProperty("options")
  public List<IoK8sApiCoreV1PodDNSConfigOption> getOptions() {
    return options;
  }

  public void setOptions(List<IoK8sApiCoreV1PodDNSConfigOption> options) {
    this.options = options;
  }

  public IoK8sApiCoreV1PodDNSConfig options(List<IoK8sApiCoreV1PodDNSConfigOption> options) {
    this.options = options;
    return this;
  }

  public IoK8sApiCoreV1PodDNSConfig addOptionsItem(IoK8sApiCoreV1PodDNSConfigOption optionsItem) {
    this.options.add(optionsItem);
    return this;
  }

 /**
   * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
   * @return searches
  **/
  @JsonProperty("searches")
  public List<String> getSearches() {
    return searches;
  }

  public void setSearches(List<String> searches) {
    this.searches = searches;
  }

  public IoK8sApiCoreV1PodDNSConfig searches(List<String> searches) {
    this.searches = searches;
    return this;
  }

  public IoK8sApiCoreV1PodDNSConfig addSearchesItem(String searchesItem) {
    this.searches.add(searchesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PodDNSConfig {\n");
    
    sb.append("    nameservers: ").append(toIndentedString(nameservers)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    searches: ").append(toIndentedString(searches)).append("\n");
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

