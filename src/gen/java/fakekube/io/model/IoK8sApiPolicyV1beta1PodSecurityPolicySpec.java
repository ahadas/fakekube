package fakekube.io.model;

import fakekube.io.model.IoK8sApiPolicyV1beta1AllowedCSIDriver;
import fakekube.io.model.IoK8sApiPolicyV1beta1AllowedFlexVolume;
import fakekube.io.model.IoK8sApiPolicyV1beta1AllowedHostPath;
import fakekube.io.model.IoK8sApiPolicyV1beta1FSGroupStrategyOptions;
import fakekube.io.model.IoK8sApiPolicyV1beta1HostPortRange;
import fakekube.io.model.IoK8sApiPolicyV1beta1RunAsGroupStrategyOptions;
import fakekube.io.model.IoK8sApiPolicyV1beta1RunAsUserStrategyOptions;
import fakekube.io.model.IoK8sApiPolicyV1beta1RuntimeClassStrategyOptions;
import fakekube.io.model.IoK8sApiPolicyV1beta1SELinuxStrategyOptions;
import fakekube.io.model.IoK8sApiPolicyV1beta1SupplementalGroupsStrategyOptions;
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
  * PodSecurityPolicySpec defines the policy enforced.
 **/
@ApiModel(description="PodSecurityPolicySpec defines the policy enforced.")
public class IoK8sApiPolicyV1beta1PodSecurityPolicySpec  {
  
  @ApiModelProperty(value = "allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to true.")
 /**
   * allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to true.
  **/
  private Boolean allowPrivilegeEscalation = null;

  @ApiModelProperty(value = "AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An empty value indicates that any CSI driver can be used for inline ephemeral volumes. This is an alpha field, and is only honored if the API server enables the CSIInlineVolume feature gate.")
  @Valid
 /**
   * AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An empty value indicates that any CSI driver can be used for inline ephemeral volumes. This is an alpha field, and is only honored if the API server enables the CSIInlineVolume feature gate.
  **/
  private List<IoK8sApiPolicyV1beta1AllowedCSIDriver> allowedCSIDrivers = null;

  @ApiModelProperty(value = "allowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author's discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities.")
 /**
   * allowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author's discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
  **/
  private List<String> allowedCapabilities = null;

  @ApiModelProperty(value = "allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the \"volumes\" field.")
  @Valid
 /**
   * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the \"volumes\" field.
  **/
  private List<IoK8sApiPolicyV1beta1AllowedFlexVolume> allowedFlexVolumes = null;

  @ApiModelProperty(value = "allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths may be used.")
  @Valid
 /**
   * allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths may be used.
  **/
  private List<IoK8sApiPolicyV1beta1AllowedHostPath> allowedHostPaths = null;

  @ApiModelProperty(value = "AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled.")
 /**
   * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled.
  **/
  private List<String> allowedProcMountTypes = null;

  @ApiModelProperty(value = "allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \"*\" in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.  Examples: e.g. \"foo/_*\" allows \"foo/bar\", \"foo/baz\", etc. e.g. \"foo.*\" allows \"foo.bar\", \"foo.baz\", etc.")
 /**
   * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \"*\" in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.  Examples: e.g. \"foo/_*\" allows \"foo/bar\", \"foo/baz\", etc. e.g. \"foo.*\" allows \"foo.bar\", \"foo.baz\", etc.
  **/
  private List<String> allowedUnsafeSysctls = null;

  @ApiModelProperty(value = "defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list.")
 /**
   * defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list.
  **/
  private List<String> defaultAddCapabilities = null;

  @ApiModelProperty(value = "defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.")
 /**
   * defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.
  **/
  private Boolean defaultAllowPrivilegeEscalation = null;

  @ApiModelProperty(value = "forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \"*\" in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.  Examples: e.g. \"foo/_*\" forbids \"foo/bar\", \"foo/baz\", etc. e.g. \"foo.*\" forbids \"foo.bar\", \"foo.baz\", etc.")
 /**
   * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \"*\" in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.  Examples: e.g. \"foo/_*\" forbids \"foo/bar\", \"foo/baz\", etc. e.g. \"foo.*\" forbids \"foo.bar\", \"foo.baz\", etc.
  **/
  private List<String> forbiddenSysctls = null;

  @ApiModelProperty(required = true, value = "fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.")
  @Valid
 /**
   * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
  **/
  private IoK8sApiPolicyV1beta1FSGroupStrategyOptions fsGroup = null;

  @ApiModelProperty(value = "hostIPC determines if the policy allows the use of HostIPC in the pod spec.")
 /**
   * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
  **/
  private Boolean hostIPC = null;

  @ApiModelProperty(value = "hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.")
 /**
   * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
  **/
  private Boolean hostNetwork = null;

  @ApiModelProperty(value = "hostPID determines if the policy allows the use of HostPID in the pod spec.")
 /**
   * hostPID determines if the policy allows the use of HostPID in the pod spec.
  **/
  private Boolean hostPID = null;

  @ApiModelProperty(value = "hostPorts determines which host port ranges are allowed to be exposed.")
  @Valid
 /**
   * hostPorts determines which host port ranges are allowed to be exposed.
  **/
  private List<IoK8sApiPolicyV1beta1HostPortRange> hostPorts = null;

  @ApiModelProperty(value = "privileged determines if a pod can request to be run as privileged.")
 /**
   * privileged determines if a pod can request to be run as privileged.
  **/
  private Boolean privileged = null;

  @ApiModelProperty(value = "readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.")
 /**
   * readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.
  **/
  private Boolean readOnlyRootFilesystem = null;

  @ApiModelProperty(value = "requiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added.")
 /**
   * requiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added.
  **/
  private List<String> requiredDropCapabilities = null;

  @ApiModelProperty(value = "RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set. If this field is omitted, the pod's RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled.")
  @Valid
 /**
   * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set. If this field is omitted, the pod's RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled.
  **/
  private IoK8sApiPolicyV1beta1RunAsGroupStrategyOptions runAsGroup = null;

  @ApiModelProperty(required = true, value = "runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.")
  @Valid
 /**
   * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
  **/
  private IoK8sApiPolicyV1beta1RunAsUserStrategyOptions runAsUser = null;

  @ApiModelProperty(value = "runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod. If this field is omitted, the pod's runtimeClassName field is unrestricted. Enforcement of this field depends on the RuntimeClass feature gate being enabled.")
  @Valid
 /**
   * runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod. If this field is omitted, the pod's runtimeClassName field is unrestricted. Enforcement of this field depends on the RuntimeClass feature gate being enabled.
  **/
  private IoK8sApiPolicyV1beta1RuntimeClassStrategyOptions runtimeClass = null;

  @ApiModelProperty(required = true, value = "seLinux is the strategy that will dictate the allowable labels that may be set.")
  @Valid
 /**
   * seLinux is the strategy that will dictate the allowable labels that may be set.
  **/
  private IoK8sApiPolicyV1beta1SELinuxStrategyOptions seLinux = null;

  @ApiModelProperty(required = true, value = "supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.")
  @Valid
 /**
   * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
  **/
  private IoK8sApiPolicyV1beta1SupplementalGroupsStrategyOptions supplementalGroups = null;

  @ApiModelProperty(value = "volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be used. To allow all volumes you may use '*'.")
 /**
   * volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be used. To allow all volumes you may use '*'.
  **/
  private List<String> volumes = null;
 /**
   * allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to true.
   * @return allowPrivilegeEscalation
  **/
  @JsonProperty("allowPrivilegeEscalation")
  public Boolean isAllowPrivilegeEscalation() {
    return allowPrivilegeEscalation;
  }

  public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec allowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    return this;
  }

 /**
   * AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An empty value indicates that any CSI driver can be used for inline ephemeral volumes. This is an alpha field, and is only honored if the API server enables the CSIInlineVolume feature gate.
   * @return allowedCSIDrivers
  **/
  @JsonProperty("allowedCSIDrivers")
  public List<IoK8sApiPolicyV1beta1AllowedCSIDriver> getAllowedCSIDrivers() {
    return allowedCSIDrivers;
  }

  public void setAllowedCSIDrivers(List<IoK8sApiPolicyV1beta1AllowedCSIDriver> allowedCSIDrivers) {
    this.allowedCSIDrivers = allowedCSIDrivers;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec allowedCSIDrivers(List<IoK8sApiPolicyV1beta1AllowedCSIDriver> allowedCSIDrivers) {
    this.allowedCSIDrivers = allowedCSIDrivers;
    return this;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec addAllowedCSIDriversItem(IoK8sApiPolicyV1beta1AllowedCSIDriver allowedCSIDriversItem) {
    this.allowedCSIDrivers.add(allowedCSIDriversItem);
    return this;
  }

 /**
   * allowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author&#39;s discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
   * @return allowedCapabilities
  **/
  @JsonProperty("allowedCapabilities")
  public List<String> getAllowedCapabilities() {
    return allowedCapabilities;
  }

  public void setAllowedCapabilities(List<String> allowedCapabilities) {
    this.allowedCapabilities = allowedCapabilities;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec allowedCapabilities(List<String> allowedCapabilities) {
    this.allowedCapabilities = allowedCapabilities;
    return this;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec addAllowedCapabilitiesItem(String allowedCapabilitiesItem) {
    this.allowedCapabilities.add(allowedCapabilitiesItem);
    return this;
  }

 /**
   * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the \&quot;volumes\&quot; field.
   * @return allowedFlexVolumes
  **/
  @JsonProperty("allowedFlexVolumes")
  public List<IoK8sApiPolicyV1beta1AllowedFlexVolume> getAllowedFlexVolumes() {
    return allowedFlexVolumes;
  }

  public void setAllowedFlexVolumes(List<IoK8sApiPolicyV1beta1AllowedFlexVolume> allowedFlexVolumes) {
    this.allowedFlexVolumes = allowedFlexVolumes;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec allowedFlexVolumes(List<IoK8sApiPolicyV1beta1AllowedFlexVolume> allowedFlexVolumes) {
    this.allowedFlexVolumes = allowedFlexVolumes;
    return this;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec addAllowedFlexVolumesItem(IoK8sApiPolicyV1beta1AllowedFlexVolume allowedFlexVolumesItem) {
    this.allowedFlexVolumes.add(allowedFlexVolumesItem);
    return this;
  }

 /**
   * allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths may be used.
   * @return allowedHostPaths
  **/
  @JsonProperty("allowedHostPaths")
  public List<IoK8sApiPolicyV1beta1AllowedHostPath> getAllowedHostPaths() {
    return allowedHostPaths;
  }

  public void setAllowedHostPaths(List<IoK8sApiPolicyV1beta1AllowedHostPath> allowedHostPaths) {
    this.allowedHostPaths = allowedHostPaths;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec allowedHostPaths(List<IoK8sApiPolicyV1beta1AllowedHostPath> allowedHostPaths) {
    this.allowedHostPaths = allowedHostPaths;
    return this;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec addAllowedHostPathsItem(IoK8sApiPolicyV1beta1AllowedHostPath allowedHostPathsItem) {
    this.allowedHostPaths.add(allowedHostPathsItem);
    return this;
  }

 /**
   * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled.
   * @return allowedProcMountTypes
  **/
  @JsonProperty("allowedProcMountTypes")
  public List<String> getAllowedProcMountTypes() {
    return allowedProcMountTypes;
  }

  public void setAllowedProcMountTypes(List<String> allowedProcMountTypes) {
    this.allowedProcMountTypes = allowedProcMountTypes;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec allowedProcMountTypes(List<String> allowedProcMountTypes) {
    this.allowedProcMountTypes = allowedProcMountTypes;
    return this;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec addAllowedProcMountTypesItem(String allowedProcMountTypesItem) {
    this.allowedProcMountTypes.add(allowedProcMountTypesItem);
    return this;
  }

 /**
   * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \&quot;*\&quot; in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.  Examples: e.g. \&quot;foo/_*\&quot; allows \&quot;foo/bar\&quot;, \&quot;foo/baz\&quot;, etc. e.g. \&quot;foo.*\&quot; allows \&quot;foo.bar\&quot;, \&quot;foo.baz\&quot;, etc.
   * @return allowedUnsafeSysctls
  **/
  @JsonProperty("allowedUnsafeSysctls")
  public List<String> getAllowedUnsafeSysctls() {
    return allowedUnsafeSysctls;
  }

  public void setAllowedUnsafeSysctls(List<String> allowedUnsafeSysctls) {
    this.allowedUnsafeSysctls = allowedUnsafeSysctls;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec allowedUnsafeSysctls(List<String> allowedUnsafeSysctls) {
    this.allowedUnsafeSysctls = allowedUnsafeSysctls;
    return this;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec addAllowedUnsafeSysctlsItem(String allowedUnsafeSysctlsItem) {
    this.allowedUnsafeSysctls.add(allowedUnsafeSysctlsItem);
    return this;
  }

 /**
   * defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list.
   * @return defaultAddCapabilities
  **/
  @JsonProperty("defaultAddCapabilities")
  public List<String> getDefaultAddCapabilities() {
    return defaultAddCapabilities;
  }

  public void setDefaultAddCapabilities(List<String> defaultAddCapabilities) {
    this.defaultAddCapabilities = defaultAddCapabilities;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec defaultAddCapabilities(List<String> defaultAddCapabilities) {
    this.defaultAddCapabilities = defaultAddCapabilities;
    return this;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec addDefaultAddCapabilitiesItem(String defaultAddCapabilitiesItem) {
    this.defaultAddCapabilities.add(defaultAddCapabilitiesItem);
    return this;
  }

 /**
   * defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.
   * @return defaultAllowPrivilegeEscalation
  **/
  @JsonProperty("defaultAllowPrivilegeEscalation")
  public Boolean isDefaultAllowPrivilegeEscalation() {
    return defaultAllowPrivilegeEscalation;
  }

  public void setDefaultAllowPrivilegeEscalation(Boolean defaultAllowPrivilegeEscalation) {
    this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec defaultAllowPrivilegeEscalation(Boolean defaultAllowPrivilegeEscalation) {
    this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
    return this;
  }

 /**
   * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \&quot;*\&quot; in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.  Examples: e.g. \&quot;foo/_*\&quot; forbids \&quot;foo/bar\&quot;, \&quot;foo/baz\&quot;, etc. e.g. \&quot;foo.*\&quot; forbids \&quot;foo.bar\&quot;, \&quot;foo.baz\&quot;, etc.
   * @return forbiddenSysctls
  **/
  @JsonProperty("forbiddenSysctls")
  public List<String> getForbiddenSysctls() {
    return forbiddenSysctls;
  }

  public void setForbiddenSysctls(List<String> forbiddenSysctls) {
    this.forbiddenSysctls = forbiddenSysctls;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec forbiddenSysctls(List<String> forbiddenSysctls) {
    this.forbiddenSysctls = forbiddenSysctls;
    return this;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec addForbiddenSysctlsItem(String forbiddenSysctlsItem) {
    this.forbiddenSysctls.add(forbiddenSysctlsItem);
    return this;
  }

 /**
   * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
   * @return fsGroup
  **/
  @JsonProperty("fsGroup")
  @NotNull
  public IoK8sApiPolicyV1beta1FSGroupStrategyOptions getFsGroup() {
    return fsGroup;
  }

  public void setFsGroup(IoK8sApiPolicyV1beta1FSGroupStrategyOptions fsGroup) {
    this.fsGroup = fsGroup;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec fsGroup(IoK8sApiPolicyV1beta1FSGroupStrategyOptions fsGroup) {
    this.fsGroup = fsGroup;
    return this;
  }

 /**
   * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
   * @return hostIPC
  **/
  @JsonProperty("hostIPC")
  public Boolean isHostIPC() {
    return hostIPC;
  }

  public void setHostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec hostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
    return this;
  }

 /**
   * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
   * @return hostNetwork
  **/
  @JsonProperty("hostNetwork")
  public Boolean isHostNetwork() {
    return hostNetwork;
  }

  public void setHostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec hostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
    return this;
  }

 /**
   * hostPID determines if the policy allows the use of HostPID in the pod spec.
   * @return hostPID
  **/
  @JsonProperty("hostPID")
  public Boolean isHostPID() {
    return hostPID;
  }

  public void setHostPID(Boolean hostPID) {
    this.hostPID = hostPID;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec hostPID(Boolean hostPID) {
    this.hostPID = hostPID;
    return this;
  }

 /**
   * hostPorts determines which host port ranges are allowed to be exposed.
   * @return hostPorts
  **/
  @JsonProperty("hostPorts")
  public List<IoK8sApiPolicyV1beta1HostPortRange> getHostPorts() {
    return hostPorts;
  }

  public void setHostPorts(List<IoK8sApiPolicyV1beta1HostPortRange> hostPorts) {
    this.hostPorts = hostPorts;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec hostPorts(List<IoK8sApiPolicyV1beta1HostPortRange> hostPorts) {
    this.hostPorts = hostPorts;
    return this;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec addHostPortsItem(IoK8sApiPolicyV1beta1HostPortRange hostPortsItem) {
    this.hostPorts.add(hostPortsItem);
    return this;
  }

 /**
   * privileged determines if a pod can request to be run as privileged.
   * @return privileged
  **/
  @JsonProperty("privileged")
  public Boolean isPrivileged() {
    return privileged;
  }

  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec privileged(Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

 /**
   * readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.
   * @return readOnlyRootFilesystem
  **/
  @JsonProperty("readOnlyRootFilesystem")
  public Boolean isReadOnlyRootFilesystem() {
    return readOnlyRootFilesystem;
  }

  public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    return this;
  }

 /**
   * requiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added.
   * @return requiredDropCapabilities
  **/
  @JsonProperty("requiredDropCapabilities")
  public List<String> getRequiredDropCapabilities() {
    return requiredDropCapabilities;
  }

  public void setRequiredDropCapabilities(List<String> requiredDropCapabilities) {
    this.requiredDropCapabilities = requiredDropCapabilities;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec requiredDropCapabilities(List<String> requiredDropCapabilities) {
    this.requiredDropCapabilities = requiredDropCapabilities;
    return this;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec addRequiredDropCapabilitiesItem(String requiredDropCapabilitiesItem) {
    this.requiredDropCapabilities.add(requiredDropCapabilitiesItem);
    return this;
  }

 /**
   * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set. If this field is omitted, the pod&#39;s RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled.
   * @return runAsGroup
  **/
  @JsonProperty("runAsGroup")
  public IoK8sApiPolicyV1beta1RunAsGroupStrategyOptions getRunAsGroup() {
    return runAsGroup;
  }

  public void setRunAsGroup(IoK8sApiPolicyV1beta1RunAsGroupStrategyOptions runAsGroup) {
    this.runAsGroup = runAsGroup;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec runAsGroup(IoK8sApiPolicyV1beta1RunAsGroupStrategyOptions runAsGroup) {
    this.runAsGroup = runAsGroup;
    return this;
  }

 /**
   * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
   * @return runAsUser
  **/
  @JsonProperty("runAsUser")
  @NotNull
  public IoK8sApiPolicyV1beta1RunAsUserStrategyOptions getRunAsUser() {
    return runAsUser;
  }

  public void setRunAsUser(IoK8sApiPolicyV1beta1RunAsUserStrategyOptions runAsUser) {
    this.runAsUser = runAsUser;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec runAsUser(IoK8sApiPolicyV1beta1RunAsUserStrategyOptions runAsUser) {
    this.runAsUser = runAsUser;
    return this;
  }

 /**
   * runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod. If this field is omitted, the pod&#39;s runtimeClassName field is unrestricted. Enforcement of this field depends on the RuntimeClass feature gate being enabled.
   * @return runtimeClass
  **/
  @JsonProperty("runtimeClass")
  public IoK8sApiPolicyV1beta1RuntimeClassStrategyOptions getRuntimeClass() {
    return runtimeClass;
  }

  public void setRuntimeClass(IoK8sApiPolicyV1beta1RuntimeClassStrategyOptions runtimeClass) {
    this.runtimeClass = runtimeClass;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec runtimeClass(IoK8sApiPolicyV1beta1RuntimeClassStrategyOptions runtimeClass) {
    this.runtimeClass = runtimeClass;
    return this;
  }

 /**
   * seLinux is the strategy that will dictate the allowable labels that may be set.
   * @return seLinux
  **/
  @JsonProperty("seLinux")
  @NotNull
  public IoK8sApiPolicyV1beta1SELinuxStrategyOptions getSeLinux() {
    return seLinux;
  }

  public void setSeLinux(IoK8sApiPolicyV1beta1SELinuxStrategyOptions seLinux) {
    this.seLinux = seLinux;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec seLinux(IoK8sApiPolicyV1beta1SELinuxStrategyOptions seLinux) {
    this.seLinux = seLinux;
    return this;
  }

 /**
   * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
   * @return supplementalGroups
  **/
  @JsonProperty("supplementalGroups")
  @NotNull
  public IoK8sApiPolicyV1beta1SupplementalGroupsStrategyOptions getSupplementalGroups() {
    return supplementalGroups;
  }

  public void setSupplementalGroups(IoK8sApiPolicyV1beta1SupplementalGroupsStrategyOptions supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec supplementalGroups(IoK8sApiPolicyV1beta1SupplementalGroupsStrategyOptions supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
    return this;
  }

 /**
   * volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be used. To allow all volumes you may use &#39;*&#39;.
   * @return volumes
  **/
  @JsonProperty("volumes")
  public List<String> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<String> volumes) {
    this.volumes = volumes;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec volumes(List<String> volumes) {
    this.volumes = volumes;
    return this;
  }

  public IoK8sApiPolicyV1beta1PodSecurityPolicySpec addVolumesItem(String volumesItem) {
    this.volumes.add(volumesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiPolicyV1beta1PodSecurityPolicySpec {\n");
    
    sb.append("    allowPrivilegeEscalation: ").append(toIndentedString(allowPrivilegeEscalation)).append("\n");
    sb.append("    allowedCSIDrivers: ").append(toIndentedString(allowedCSIDrivers)).append("\n");
    sb.append("    allowedCapabilities: ").append(toIndentedString(allowedCapabilities)).append("\n");
    sb.append("    allowedFlexVolumes: ").append(toIndentedString(allowedFlexVolumes)).append("\n");
    sb.append("    allowedHostPaths: ").append(toIndentedString(allowedHostPaths)).append("\n");
    sb.append("    allowedProcMountTypes: ").append(toIndentedString(allowedProcMountTypes)).append("\n");
    sb.append("    allowedUnsafeSysctls: ").append(toIndentedString(allowedUnsafeSysctls)).append("\n");
    sb.append("    defaultAddCapabilities: ").append(toIndentedString(defaultAddCapabilities)).append("\n");
    sb.append("    defaultAllowPrivilegeEscalation: ").append(toIndentedString(defaultAllowPrivilegeEscalation)).append("\n");
    sb.append("    forbiddenSysctls: ").append(toIndentedString(forbiddenSysctls)).append("\n");
    sb.append("    fsGroup: ").append(toIndentedString(fsGroup)).append("\n");
    sb.append("    hostIPC: ").append(toIndentedString(hostIPC)).append("\n");
    sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
    sb.append("    hostPID: ").append(toIndentedString(hostPID)).append("\n");
    sb.append("    hostPorts: ").append(toIndentedString(hostPorts)).append("\n");
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
    sb.append("    readOnlyRootFilesystem: ").append(toIndentedString(readOnlyRootFilesystem)).append("\n");
    sb.append("    requiredDropCapabilities: ").append(toIndentedString(requiredDropCapabilities)).append("\n");
    sb.append("    runAsGroup: ").append(toIndentedString(runAsGroup)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    runtimeClass: ").append(toIndentedString(runtimeClass)).append("\n");
    sb.append("    seLinux: ").append(toIndentedString(seLinux)).append("\n");
    sb.append("    supplementalGroups: ").append(toIndentedString(supplementalGroups)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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

