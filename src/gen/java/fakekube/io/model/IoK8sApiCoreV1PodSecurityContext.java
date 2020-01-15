package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1SELinuxOptions;
import fakekube.io.model.IoK8sApiCoreV1Sysctl;
import fakekube.io.model.IoK8sApiCoreV1WindowsSecurityContextOptions;
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
  * PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.
 **/
@ApiModel(description="PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.")
public class IoK8sApiCoreV1PodSecurityContext  {
  
  @ApiModelProperty(value = "A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:  1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----  If unset, the Kubelet will not modify the ownership and permissions of any volume.")
 /**
   * A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:  1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----  If unset, the Kubelet will not modify the ownership and permissions of any volume.
  **/
  private Long fsGroup = null;

  @ApiModelProperty(value = "The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.")
 /**
   * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
  **/
  private Long runAsGroup = null;

  @ApiModelProperty(value = "Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
 /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
  **/
  private Boolean runAsNonRoot = null;

  @ApiModelProperty(value = "The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.")
 /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
  **/
  private Long runAsUser = null;

  @ApiModelProperty(value = "The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.")
  @Valid
 /**
   * The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
  **/
  private IoK8sApiCoreV1SELinuxOptions seLinuxOptions = null;

  @ApiModelProperty(value = "A list of groups applied to the first process run in each container, in addition to the container's primary GID.  If unspecified, no groups will be added to any container.")
 /**
   * A list of groups applied to the first process run in each container, in addition to the container's primary GID.  If unspecified, no groups will be added to any container.
  **/
  private List<Long> supplementalGroups = null;

  @ApiModelProperty(value = "Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch.")
  @Valid
 /**
   * Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch.
  **/
  private List<IoK8sApiCoreV1Sysctl> sysctls = null;

  @ApiModelProperty(value = "The Windows specific settings applied to all containers. If unspecified, the options within a container's SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  @Valid
 /**
   * The Windows specific settings applied to all containers. If unspecified, the options within a container's SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
  **/
  private IoK8sApiCoreV1WindowsSecurityContextOptions windowsOptions = null;
 /**
   * A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:  1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR&#39;d with rw-rw----  If unset, the Kubelet will not modify the ownership and permissions of any volume.
   * @return fsGroup
  **/
  @JsonProperty("fsGroup")
  public Long getFsGroup() {
    return fsGroup;
  }

  public void setFsGroup(Long fsGroup) {
    this.fsGroup = fsGroup;
  }

  public IoK8sApiCoreV1PodSecurityContext fsGroup(Long fsGroup) {
    this.fsGroup = fsGroup;
    return this;
  }

 /**
   * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
   * @return runAsGroup
  **/
  @JsonProperty("runAsGroup")
  public Long getRunAsGroup() {
    return runAsGroup;
  }

  public void setRunAsGroup(Long runAsGroup) {
    this.runAsGroup = runAsGroup;
  }

  public IoK8sApiCoreV1PodSecurityContext runAsGroup(Long runAsGroup) {
    this.runAsGroup = runAsGroup;
    return this;
  }

 /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   * @return runAsNonRoot
  **/
  @JsonProperty("runAsNonRoot")
  public Boolean isRunAsNonRoot() {
    return runAsNonRoot;
  }

  public void setRunAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
  }

  public IoK8sApiCoreV1PodSecurityContext runAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
    return this;
  }

 /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
   * @return runAsUser
  **/
  @JsonProperty("runAsUser")
  public Long getRunAsUser() {
    return runAsUser;
  }

  public void setRunAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
  }

  public IoK8sApiCoreV1PodSecurityContext runAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
    return this;
  }

 /**
   * The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
   * @return seLinuxOptions
  **/
  @JsonProperty("seLinuxOptions")
  public IoK8sApiCoreV1SELinuxOptions getSeLinuxOptions() {
    return seLinuxOptions;
  }

  public void setSeLinuxOptions(IoK8sApiCoreV1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
  }

  public IoK8sApiCoreV1PodSecurityContext seLinuxOptions(IoK8sApiCoreV1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
    return this;
  }

 /**
   * A list of groups applied to the first process run in each container, in addition to the container&#39;s primary GID.  If unspecified, no groups will be added to any container.
   * @return supplementalGroups
  **/
  @JsonProperty("supplementalGroups")
  public List<Long> getSupplementalGroups() {
    return supplementalGroups;
  }

  public void setSupplementalGroups(List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
  }

  public IoK8sApiCoreV1PodSecurityContext supplementalGroups(List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
    return this;
  }

  public IoK8sApiCoreV1PodSecurityContext addSupplementalGroupsItem(Long supplementalGroupsItem) {
    this.supplementalGroups.add(supplementalGroupsItem);
    return this;
  }

 /**
   * Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls (by the container runtime) might fail to launch.
   * @return sysctls
  **/
  @JsonProperty("sysctls")
  public List<IoK8sApiCoreV1Sysctl> getSysctls() {
    return sysctls;
  }

  public void setSysctls(List<IoK8sApiCoreV1Sysctl> sysctls) {
    this.sysctls = sysctls;
  }

  public IoK8sApiCoreV1PodSecurityContext sysctls(List<IoK8sApiCoreV1Sysctl> sysctls) {
    this.sysctls = sysctls;
    return this;
  }

  public IoK8sApiCoreV1PodSecurityContext addSysctlsItem(IoK8sApiCoreV1Sysctl sysctlsItem) {
    this.sysctls.add(sysctlsItem);
    return this;
  }

 /**
   * The Windows specific settings applied to all containers. If unspecified, the options within a container&#39;s SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   * @return windowsOptions
  **/
  @JsonProperty("windowsOptions")
  public IoK8sApiCoreV1WindowsSecurityContextOptions getWindowsOptions() {
    return windowsOptions;
  }

  public void setWindowsOptions(IoK8sApiCoreV1WindowsSecurityContextOptions windowsOptions) {
    this.windowsOptions = windowsOptions;
  }

  public IoK8sApiCoreV1PodSecurityContext windowsOptions(IoK8sApiCoreV1WindowsSecurityContextOptions windowsOptions) {
    this.windowsOptions = windowsOptions;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PodSecurityContext {\n");
    
    sb.append("    fsGroup: ").append(toIndentedString(fsGroup)).append("\n");
    sb.append("    runAsGroup: ").append(toIndentedString(runAsGroup)).append("\n");
    sb.append("    runAsNonRoot: ").append(toIndentedString(runAsNonRoot)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    seLinuxOptions: ").append(toIndentedString(seLinuxOptions)).append("\n");
    sb.append("    supplementalGroups: ").append(toIndentedString(supplementalGroups)).append("\n");
    sb.append("    sysctls: ").append(toIndentedString(sysctls)).append("\n");
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

