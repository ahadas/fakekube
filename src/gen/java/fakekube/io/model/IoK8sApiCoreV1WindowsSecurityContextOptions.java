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
  * WindowsSecurityContextOptions contain Windows-specific options and credentials.
 **/
@ApiModel(description="WindowsSecurityContextOptions contain Windows-specific options and credentials.")
public class IoK8sApiCoreV1WindowsSecurityContextOptions  {
  
  @ApiModelProperty(value = "GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.")
 /**
   * GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
  **/
  private String gmsaCredentialSpec = null;

  @ApiModelProperty(value = "GMSACredentialSpecName is the name of the GMSA credential spec to use. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.")
 /**
   * GMSACredentialSpecName is the name of the GMSA credential spec to use. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
  **/
  private String gmsaCredentialSpecName = null;

  @ApiModelProperty(value = "The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is beta-level and may be disabled with the WindowsRunAsUserName feature flag.")
 /**
   * The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is beta-level and may be disabled with the WindowsRunAsUserName feature flag.
  **/
  private String runAsUserName = null;
 /**
   * GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
   * @return gmsaCredentialSpec
  **/
  @JsonProperty("gmsaCredentialSpec")
  public String getGmsaCredentialSpec() {
    return gmsaCredentialSpec;
  }

  public void setGmsaCredentialSpec(String gmsaCredentialSpec) {
    this.gmsaCredentialSpec = gmsaCredentialSpec;
  }

  public IoK8sApiCoreV1WindowsSecurityContextOptions gmsaCredentialSpec(String gmsaCredentialSpec) {
    this.gmsaCredentialSpec = gmsaCredentialSpec;
    return this;
  }

 /**
   * GMSACredentialSpecName is the name of the GMSA credential spec to use. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
   * @return gmsaCredentialSpecName
  **/
  @JsonProperty("gmsaCredentialSpecName")
  public String getGmsaCredentialSpecName() {
    return gmsaCredentialSpecName;
  }

  public void setGmsaCredentialSpecName(String gmsaCredentialSpecName) {
    this.gmsaCredentialSpecName = gmsaCredentialSpecName;
  }

  public IoK8sApiCoreV1WindowsSecurityContextOptions gmsaCredentialSpecName(String gmsaCredentialSpecName) {
    this.gmsaCredentialSpecName = gmsaCredentialSpecName;
    return this;
  }

 /**
   * The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is beta-level and may be disabled with the WindowsRunAsUserName feature flag.
   * @return runAsUserName
  **/
  @JsonProperty("runAsUserName")
  public String getRunAsUserName() {
    return runAsUserName;
  }

  public void setRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
  }

  public IoK8sApiCoreV1WindowsSecurityContextOptions runAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1WindowsSecurityContextOptions {\n");
    
    sb.append("    gmsaCredentialSpec: ").append(toIndentedString(gmsaCredentialSpec)).append("\n");
    sb.append("    gmsaCredentialSpecName: ").append(toIndentedString(gmsaCredentialSpecName)).append("\n");
    sb.append("    runAsUserName: ").append(toIndentedString(runAsUserName)).append("\n");
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

