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
  * GroupVersion contains the \"group/version\" and \"version\" string of a version. It is made a struct to keep extensibility.
 **/
@ApiModel(description="GroupVersion contains the \"group/version\" and \"version\" string of a version. It is made a struct to keep extensibility.")
public class IoK8sApimachineryPkgApisMetaV1GroupVersionForDiscovery  {
  
  @ApiModelProperty(required = true, value = "groupVersion specifies the API group and version in the form \"group/version\"")
 /**
   * groupVersion specifies the API group and version in the form \"group/version\"
  **/
  private String groupVersion = null;

  @ApiModelProperty(required = true, value = "version specifies the version in the form of \"version\". This is to save the clients the trouble of splitting the GroupVersion.")
 /**
   * version specifies the version in the form of \"version\". This is to save the clients the trouble of splitting the GroupVersion.
  **/
  private String version = null;
 /**
   * groupVersion specifies the API group and version in the form \&quot;group/version\&quot;
   * @return groupVersion
  **/
  @JsonProperty("groupVersion")
  @NotNull
  public String getGroupVersion() {
    return groupVersion;
  }

  public void setGroupVersion(String groupVersion) {
    this.groupVersion = groupVersion;
  }

  public IoK8sApimachineryPkgApisMetaV1GroupVersionForDiscovery groupVersion(String groupVersion) {
    this.groupVersion = groupVersion;
    return this;
  }

 /**
   * version specifies the version in the form of \&quot;version\&quot;. This is to save the clients the trouble of splitting the GroupVersion.
   * @return version
  **/
  @JsonProperty("version")
  @NotNull
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public IoK8sApimachineryPkgApisMetaV1GroupVersionForDiscovery version(String version) {
    this.version = version;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1GroupVersionForDiscovery {\n");
    
    sb.append("    groupVersion: ").append(toIndentedString(groupVersion)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

