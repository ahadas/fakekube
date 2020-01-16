package fakekube.io.model;

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
  * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.
 **/
@ApiModel(description="Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.")
public class IoK8sApiCoreV1QuobyteVolumeSource  {
  
  @ApiModelProperty(value = "Group to map volume access to Default is no group")
 /**
   * Group to map volume access to Default is no group
  **/
  private String group = null;

  @ApiModelProperty(value = "ReadOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.")
 /**
   * ReadOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
  **/
  private Boolean readOnly = null;

  @ApiModelProperty(required = true, value = "Registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes")
 /**
   * Registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
  **/
  private String registry = null;

  @ApiModelProperty(value = "Tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin")
 /**
   * Tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
  **/
  private String tenant = null;

  @ApiModelProperty(value = "User to map volume access to Defaults to serivceaccount user")
 /**
   * User to map volume access to Defaults to serivceaccount user
  **/
  private String user = null;

  @ApiModelProperty(required = true, value = "Volume is a string that references an already created Quobyte volume by name.")
 /**
   * Volume is a string that references an already created Quobyte volume by name.
  **/
  private String volume = null;
 /**
   * Group to map volume access to Default is no group
   * @return group
  **/
  @JsonProperty("group")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public IoK8sApiCoreV1QuobyteVolumeSource group(String group) {
    this.group = group;
    return this;
  }

 /**
   * ReadOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
   * @return readOnly
  **/
  @JsonProperty("readOnly")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public IoK8sApiCoreV1QuobyteVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

 /**
   * Registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
   * @return registry
  **/
  @JsonProperty("registry")
  @NotNull
  public String getRegistry() {
    return registry;
  }

  public void setRegistry(String registry) {
    this.registry = registry;
  }

  public IoK8sApiCoreV1QuobyteVolumeSource registry(String registry) {
    this.registry = registry;
    return this;
  }

 /**
   * Tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
   * @return tenant
  **/
  @JsonProperty("tenant")
  public String getTenant() {
    return tenant;
  }

  public void setTenant(String tenant) {
    this.tenant = tenant;
  }

  public IoK8sApiCoreV1QuobyteVolumeSource tenant(String tenant) {
    this.tenant = tenant;
    return this;
  }

 /**
   * User to map volume access to Defaults to serivceaccount user
   * @return user
  **/
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public IoK8sApiCoreV1QuobyteVolumeSource user(String user) {
    this.user = user;
    return this;
  }

 /**
   * Volume is a string that references an already created Quobyte volume by name.
   * @return volume
  **/
  @JsonProperty("volume")
  @NotNull
  public String getVolume() {
    return volume;
  }

  public void setVolume(String volume) {
    this.volume = volume;
  }

  public IoK8sApiCoreV1QuobyteVolumeSource volume(String volume) {
    this.volume = volume;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1QuobyteVolumeSource {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

