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
  * NodeSystemInfo is a set of ids/uuids to uniquely identify the node.
 **/
@ApiModel(description="NodeSystemInfo is a set of ids/uuids to uniquely identify the node.")
public class IoK8sApiCoreV1NodeSystemInfo  {
  
  @ApiModelProperty(required = true, value = "The Architecture reported by the node")
 /**
   * The Architecture reported by the node
  **/
  private String architecture = null;

  @ApiModelProperty(required = true, value = "Boot ID reported by the node.")
 /**
   * Boot ID reported by the node.
  **/
  private String bootID = null;

  @ApiModelProperty(required = true, value = "ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0).")
 /**
   * ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0).
  **/
  private String containerRuntimeVersion = null;

  @ApiModelProperty(required = true, value = "Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64).")
 /**
   * Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64).
  **/
  private String kernelVersion = null;

  @ApiModelProperty(required = true, value = "KubeProxy Version reported by the node.")
 /**
   * KubeProxy Version reported by the node.
  **/
  private String kubeProxyVersion = null;

  @ApiModelProperty(required = true, value = "Kubelet Version reported by the node.")
 /**
   * Kubelet Version reported by the node.
  **/
  private String kubeletVersion = null;

  @ApiModelProperty(required = true, value = "MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html")
 /**
   * MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html
  **/
  private String machineID = null;

  @ApiModelProperty(required = true, value = "The Operating System reported by the node")
 /**
   * The Operating System reported by the node
  **/
  private String operatingSystem = null;

  @ApiModelProperty(required = true, value = "OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).")
 /**
   * OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
  **/
  private String osImage = null;

  @ApiModelProperty(required = true, value = "SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-US/Red_Hat_Subscription_Management/1/html/RHSM/getting-system-uuid.html")
 /**
   * SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-US/Red_Hat_Subscription_Management/1/html/RHSM/getting-system-uuid.html
  **/
  private String systemUUID = null;
 /**
   * The Architecture reported by the node
   * @return architecture
  **/
  @JsonProperty("architecture")
  @NotNull
  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public IoK8sApiCoreV1NodeSystemInfo architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

 /**
   * Boot ID reported by the node.
   * @return bootID
  **/
  @JsonProperty("bootID")
  @NotNull
  public String getBootID() {
    return bootID;
  }

  public void setBootID(String bootID) {
    this.bootID = bootID;
  }

  public IoK8sApiCoreV1NodeSystemInfo bootID(String bootID) {
    this.bootID = bootID;
    return this;
  }

 /**
   * ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0).
   * @return containerRuntimeVersion
  **/
  @JsonProperty("containerRuntimeVersion")
  @NotNull
  public String getContainerRuntimeVersion() {
    return containerRuntimeVersion;
  }

  public void setContainerRuntimeVersion(String containerRuntimeVersion) {
    this.containerRuntimeVersion = containerRuntimeVersion;
  }

  public IoK8sApiCoreV1NodeSystemInfo containerRuntimeVersion(String containerRuntimeVersion) {
    this.containerRuntimeVersion = containerRuntimeVersion;
    return this;
  }

 /**
   * Kernel Version reported by the node from &#39;uname -r&#39; (e.g. 3.16.0-0.bpo.4-amd64).
   * @return kernelVersion
  **/
  @JsonProperty("kernelVersion")
  @NotNull
  public String getKernelVersion() {
    return kernelVersion;
  }

  public void setKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
  }

  public IoK8sApiCoreV1NodeSystemInfo kernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
    return this;
  }

 /**
   * KubeProxy Version reported by the node.
   * @return kubeProxyVersion
  **/
  @JsonProperty("kubeProxyVersion")
  @NotNull
  public String getKubeProxyVersion() {
    return kubeProxyVersion;
  }

  public void setKubeProxyVersion(String kubeProxyVersion) {
    this.kubeProxyVersion = kubeProxyVersion;
  }

  public IoK8sApiCoreV1NodeSystemInfo kubeProxyVersion(String kubeProxyVersion) {
    this.kubeProxyVersion = kubeProxyVersion;
    return this;
  }

 /**
   * Kubelet Version reported by the node.
   * @return kubeletVersion
  **/
  @JsonProperty("kubeletVersion")
  @NotNull
  public String getKubeletVersion() {
    return kubeletVersion;
  }

  public void setKubeletVersion(String kubeletVersion) {
    this.kubeletVersion = kubeletVersion;
  }

  public IoK8sApiCoreV1NodeSystemInfo kubeletVersion(String kubeletVersion) {
    this.kubeletVersion = kubeletVersion;
    return this;
  }

 /**
   * MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html
   * @return machineID
  **/
  @JsonProperty("machineID")
  @NotNull
  public String getMachineID() {
    return machineID;
  }

  public void setMachineID(String machineID) {
    this.machineID = machineID;
  }

  public IoK8sApiCoreV1NodeSystemInfo machineID(String machineID) {
    this.machineID = machineID;
    return this;
  }

 /**
   * The Operating System reported by the node
   * @return operatingSystem
  **/
  @JsonProperty("operatingSystem")
  @NotNull
  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public IoK8sApiCoreV1NodeSystemInfo operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

 /**
   * OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
   * @return osImage
  **/
  @JsonProperty("osImage")
  @NotNull
  public String getOsImage() {
    return osImage;
  }

  public void setOsImage(String osImage) {
    this.osImage = osImage;
  }

  public IoK8sApiCoreV1NodeSystemInfo osImage(String osImage) {
    this.osImage = osImage;
    return this;
  }

 /**
   * SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-US/Red_Hat_Subscription_Management/1/html/RHSM/getting-system-uuid.html
   * @return systemUUID
  **/
  @JsonProperty("systemUUID")
  @NotNull
  public String getSystemUUID() {
    return systemUUID;
  }

  public void setSystemUUID(String systemUUID) {
    this.systemUUID = systemUUID;
  }

  public IoK8sApiCoreV1NodeSystemInfo systemUUID(String systemUUID) {
    this.systemUUID = systemUUID;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NodeSystemInfo {\n");
    
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    bootID: ").append(toIndentedString(bootID)).append("\n");
    sb.append("    containerRuntimeVersion: ").append(toIndentedString(containerRuntimeVersion)).append("\n");
    sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
    sb.append("    kubeProxyVersion: ").append(toIndentedString(kubeProxyVersion)).append("\n");
    sb.append("    kubeletVersion: ").append(toIndentedString(kubeletVersion)).append("\n");
    sb.append("    machineID: ").append(toIndentedString(machineID)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    osImage: ").append(toIndentedString(osImage)).append("\n");
    sb.append("    systemUUID: ").append(toIndentedString(systemUUID)).append("\n");
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

