package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1Capabilities;
import fakekube.io.model.IoK8sApiCoreV1SELinuxOptions;
import fakekube.io.model.IoK8sApiCoreV1WindowsSecurityContextOptions;
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
  * SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.
 **/
@ApiModel(description="SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.")
public class IoK8sApiCoreV1SecurityContext  {
  
  @ApiModelProperty(value = "AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN")
 /**
   * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN
  **/
  private Boolean allowPrivilegeEscalation = null;

  @ApiModelProperty(value = "The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the container runtime.")
  @Valid
 /**
   * The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the container runtime.
  **/
  private IoK8sApiCoreV1Capabilities capabilities = null;

  @ApiModelProperty(value = "Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.")
 /**
   * Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.
  **/
  private Boolean privileged = null;

  @ApiModelProperty(value = "procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled.")
 /**
   * procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled.
  **/
  private String procMount = null;

  @ApiModelProperty(value = "Whether this container has a read-only root filesystem. Default is false.")
 /**
   * Whether this container has a read-only root filesystem. Default is false.
  **/
  private Boolean readOnlyRootFilesystem = null;

  @ApiModelProperty(value = "The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
 /**
   * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
  **/
  private Long runAsGroup = null;

  @ApiModelProperty(value = "Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
 /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
  **/
  private Boolean runAsNonRoot = null;

  @ApiModelProperty(value = "The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
 /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
  **/
  private Long runAsUser = null;

  @ApiModelProperty(value = "The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  @Valid
 /**
   * The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
  **/
  private IoK8sApiCoreV1SELinuxOptions seLinuxOptions = null;

  @ApiModelProperty(value = "The Windows specific settings applied to all containers. If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  @Valid
 /**
   * The Windows specific settings applied to all containers. If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
  **/
  private IoK8sApiCoreV1WindowsSecurityContextOptions windowsOptions = null;
 /**
   * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN
   * @return allowPrivilegeEscalation
  **/
  @JsonProperty("allowPrivilegeEscalation")
  public Boolean isAllowPrivilegeEscalation() {
    return allowPrivilegeEscalation;
  }

  public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
  }

  public IoK8sApiCoreV1SecurityContext allowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    return this;
  }

 /**
   * The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the container runtime.
   * @return capabilities
  **/
  @JsonProperty("capabilities")
  public IoK8sApiCoreV1Capabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(IoK8sApiCoreV1Capabilities capabilities) {
    this.capabilities = capabilities;
  }

  public IoK8sApiCoreV1SecurityContext capabilities(IoK8sApiCoreV1Capabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }

 /**
   * Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.
   * @return privileged
  **/
  @JsonProperty("privileged")
  public Boolean isPrivileged() {
    return privileged;
  }

  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }

  public IoK8sApiCoreV1SecurityContext privileged(Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

 /**
   * procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled.
   * @return procMount
  **/
  @JsonProperty("procMount")
  public String getProcMount() {
    return procMount;
  }

  public void setProcMount(String procMount) {
    this.procMount = procMount;
  }

  public IoK8sApiCoreV1SecurityContext procMount(String procMount) {
    this.procMount = procMount;
    return this;
  }

 /**
   * Whether this container has a read-only root filesystem. Default is false.
   * @return readOnlyRootFilesystem
  **/
  @JsonProperty("readOnlyRootFilesystem")
  public Boolean isReadOnlyRootFilesystem() {
    return readOnlyRootFilesystem;
  }

  public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
  }

  public IoK8sApiCoreV1SecurityContext readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    return this;
  }

 /**
   * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   * @return runAsGroup
  **/
  @JsonProperty("runAsGroup")
  public Long getRunAsGroup() {
    return runAsGroup;
  }

  public void setRunAsGroup(Long runAsGroup) {
    this.runAsGroup = runAsGroup;
  }

  public IoK8sApiCoreV1SecurityContext runAsGroup(Long runAsGroup) {
    this.runAsGroup = runAsGroup;
    return this;
  }

 /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   * @return runAsNonRoot
  **/
  @JsonProperty("runAsNonRoot")
  public Boolean isRunAsNonRoot() {
    return runAsNonRoot;
  }

  public void setRunAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
  }

  public IoK8sApiCoreV1SecurityContext runAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
    return this;
  }

 /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   * @return runAsUser
  **/
  @JsonProperty("runAsUser")
  public Long getRunAsUser() {
    return runAsUser;
  }

  public void setRunAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
  }

  public IoK8sApiCoreV1SecurityContext runAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
    return this;
  }

 /**
   * The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   * @return seLinuxOptions
  **/
  @JsonProperty("seLinuxOptions")
  public IoK8sApiCoreV1SELinuxOptions getSeLinuxOptions() {
    return seLinuxOptions;
  }

  public void setSeLinuxOptions(IoK8sApiCoreV1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
  }

  public IoK8sApiCoreV1SecurityContext seLinuxOptions(IoK8sApiCoreV1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
    return this;
  }

 /**
   * The Windows specific settings applied to all containers. If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   * @return windowsOptions
  **/
  @JsonProperty("windowsOptions")
  public IoK8sApiCoreV1WindowsSecurityContextOptions getWindowsOptions() {
    return windowsOptions;
  }

  public void setWindowsOptions(IoK8sApiCoreV1WindowsSecurityContextOptions windowsOptions) {
    this.windowsOptions = windowsOptions;
  }

  public IoK8sApiCoreV1SecurityContext windowsOptions(IoK8sApiCoreV1WindowsSecurityContextOptions windowsOptions) {
    this.windowsOptions = windowsOptions;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1SecurityContext {\n");
    
    sb.append("    allowPrivilegeEscalation: ").append(toIndentedString(allowPrivilegeEscalation)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
    sb.append("    procMount: ").append(toIndentedString(procMount)).append("\n");
    sb.append("    readOnlyRootFilesystem: ").append(toIndentedString(readOnlyRootFilesystem)).append("\n");
    sb.append("    runAsGroup: ").append(toIndentedString(runAsGroup)).append("\n");
    sb.append("    runAsNonRoot: ").append(toIndentedString(runAsNonRoot)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    seLinuxOptions: ").append(toIndentedString(seLinuxOptions)).append("\n");
    sb.append("    windowsOptions: ").append(toIndentedString(windowsOptions)).append("\n");
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

