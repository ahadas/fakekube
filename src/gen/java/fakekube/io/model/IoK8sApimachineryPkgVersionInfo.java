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
  * Info contains versioning information. how we'll want to distribute that information.
 **/
@ApiModel(description="Info contains versioning information. how we'll want to distribute that information.")
public class IoK8sApimachineryPkgVersionInfo  {
  
  @ApiModelProperty(required = true, value = "")
  private String buildDate = null;

  @ApiModelProperty(required = true, value = "")
  private String compiler = null;

  @ApiModelProperty(required = true, value = "")
  private String gitCommit = null;

  @ApiModelProperty(required = true, value = "")
  private String gitTreeState = null;

  @ApiModelProperty(required = true, value = "")
  private String gitVersion = null;

  @ApiModelProperty(required = true, value = "")
  private String goVersion = null;

  @ApiModelProperty(required = true, value = "")
  private String major = null;

  @ApiModelProperty(required = true, value = "")
  private String minor = null;

  @ApiModelProperty(required = true, value = "")
  private String platform = null;
 /**
   * Get buildDate
   * @return buildDate
  **/
  @JsonProperty("buildDate")
  @NotNull
  public String getBuildDate() {
    return buildDate;
  }

  public void setBuildDate(String buildDate) {
    this.buildDate = buildDate;
  }

  public IoK8sApimachineryPkgVersionInfo buildDate(String buildDate) {
    this.buildDate = buildDate;
    return this;
  }

 /**
   * Get compiler
   * @return compiler
  **/
  @JsonProperty("compiler")
  @NotNull
  public String getCompiler() {
    return compiler;
  }

  public void setCompiler(String compiler) {
    this.compiler = compiler;
  }

  public IoK8sApimachineryPkgVersionInfo compiler(String compiler) {
    this.compiler = compiler;
    return this;
  }

 /**
   * Get gitCommit
   * @return gitCommit
  **/
  @JsonProperty("gitCommit")
  @NotNull
  public String getGitCommit() {
    return gitCommit;
  }

  public void setGitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
  }

  public IoK8sApimachineryPkgVersionInfo gitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
    return this;
  }

 /**
   * Get gitTreeState
   * @return gitTreeState
  **/
  @JsonProperty("gitTreeState")
  @NotNull
  public String getGitTreeState() {
    return gitTreeState;
  }

  public void setGitTreeState(String gitTreeState) {
    this.gitTreeState = gitTreeState;
  }

  public IoK8sApimachineryPkgVersionInfo gitTreeState(String gitTreeState) {
    this.gitTreeState = gitTreeState;
    return this;
  }

 /**
   * Get gitVersion
   * @return gitVersion
  **/
  @JsonProperty("gitVersion")
  @NotNull
  public String getGitVersion() {
    return gitVersion;
  }

  public void setGitVersion(String gitVersion) {
    this.gitVersion = gitVersion;
  }

  public IoK8sApimachineryPkgVersionInfo gitVersion(String gitVersion) {
    this.gitVersion = gitVersion;
    return this;
  }

 /**
   * Get goVersion
   * @return goVersion
  **/
  @JsonProperty("goVersion")
  @NotNull
  public String getGoVersion() {
    return goVersion;
  }

  public void setGoVersion(String goVersion) {
    this.goVersion = goVersion;
  }

  public IoK8sApimachineryPkgVersionInfo goVersion(String goVersion) {
    this.goVersion = goVersion;
    return this;
  }

 /**
   * Get major
   * @return major
  **/
  @JsonProperty("major")
  @NotNull
  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public IoK8sApimachineryPkgVersionInfo major(String major) {
    this.major = major;
    return this;
  }

 /**
   * Get minor
   * @return minor
  **/
  @JsonProperty("minor")
  @NotNull
  public String getMinor() {
    return minor;
  }

  public void setMinor(String minor) {
    this.minor = minor;
  }

  public IoK8sApimachineryPkgVersionInfo minor(String minor) {
    this.minor = minor;
    return this;
  }

 /**
   * Get platform
   * @return platform
  **/
  @JsonProperty("platform")
  @NotNull
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public IoK8sApimachineryPkgVersionInfo platform(String platform) {
    this.platform = platform;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgVersionInfo {\n");
    
    sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
    sb.append("    compiler: ").append(toIndentedString(compiler)).append("\n");
    sb.append("    gitCommit: ").append(toIndentedString(gitCommit)).append("\n");
    sb.append("    gitTreeState: ").append(toIndentedString(gitTreeState)).append("\n");
    sb.append("    gitVersion: ").append(toIndentedString(gitVersion)).append("\n");
    sb.append("    goVersion: ").append(toIndentedString(goVersion)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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

