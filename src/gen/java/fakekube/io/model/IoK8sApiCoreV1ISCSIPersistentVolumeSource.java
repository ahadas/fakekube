package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1SecretReference;
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
  * ISCSIPersistentVolumeSource represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
 **/
@ApiModel(description="ISCSIPersistentVolumeSource represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.")
public class IoK8sApiCoreV1ISCSIPersistentVolumeSource  {
  
  @ApiModelProperty(value = "whether support iSCSI Discovery CHAP authentication")
 /**
   * whether support iSCSI Discovery CHAP authentication
  **/
  private Boolean chapAuthDiscovery = null;

  @ApiModelProperty(value = "whether support iSCSI Session CHAP authentication")
 /**
   * whether support iSCSI Session CHAP authentication
  **/
  private Boolean chapAuthSession = null;

  @ApiModelProperty(value = "Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi")
 /**
   * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
  **/
  private String fsType = null;

  @ApiModelProperty(value = "Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.")
 /**
   * Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.
  **/
  private String initiatorName = null;

  @ApiModelProperty(required = true, value = "Target iSCSI Qualified Name.")
 /**
   * Target iSCSI Qualified Name.
  **/
  private String iqn = null;

  @ApiModelProperty(value = "iSCSI Interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).")
 /**
   * iSCSI Interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).
  **/
  private String iscsiInterface = null;

  @ApiModelProperty(required = true, value = "iSCSI Target Lun number.")
 /**
   * iSCSI Target Lun number.
  **/
  private Integer lun = null;

  @ApiModelProperty(value = "iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).")
 /**
   * iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
  **/
  private List<String> portals = null;

  @ApiModelProperty(value = "ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.")
 /**
   * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
  **/
  private Boolean readOnly = null;

  @ApiModelProperty(value = "CHAP Secret for iSCSI target and initiator authentication")
  @Valid
 /**
   * CHAP Secret for iSCSI target and initiator authentication
  **/
  private IoK8sApiCoreV1SecretReference secretRef = null;

  @ApiModelProperty(required = true, value = "iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).")
 /**
   * iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
  **/
  private String targetPortal = null;
 /**
   * whether support iSCSI Discovery CHAP authentication
   * @return chapAuthDiscovery
  **/
  @JsonProperty("chapAuthDiscovery")
  public Boolean isChapAuthDiscovery() {
    return chapAuthDiscovery;
  }

  public void setChapAuthDiscovery(Boolean chapAuthDiscovery) {
    this.chapAuthDiscovery = chapAuthDiscovery;
  }

  public IoK8sApiCoreV1ISCSIPersistentVolumeSource chapAuthDiscovery(Boolean chapAuthDiscovery) {
    this.chapAuthDiscovery = chapAuthDiscovery;
    return this;
  }

 /**
   * whether support iSCSI Session CHAP authentication
   * @return chapAuthSession
  **/
  @JsonProperty("chapAuthSession")
  public Boolean isChapAuthSession() {
    return chapAuthSession;
  }

  public void setChapAuthSession(Boolean chapAuthSession) {
    this.chapAuthSession = chapAuthSession;
  }

  public IoK8sApiCoreV1ISCSIPersistentVolumeSource chapAuthSession(Boolean chapAuthSession) {
    this.chapAuthSession = chapAuthSession;
    return this;
  }

 /**
   * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
   * @return fsType
  **/
  @JsonProperty("fsType")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public IoK8sApiCoreV1ISCSIPersistentVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

 /**
   * Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface &lt;target portal&gt;:&lt;volume name&gt; will be created for the connection.
   * @return initiatorName
  **/
  @JsonProperty("initiatorName")
  public String getInitiatorName() {
    return initiatorName;
  }

  public void setInitiatorName(String initiatorName) {
    this.initiatorName = initiatorName;
  }

  public IoK8sApiCoreV1ISCSIPersistentVolumeSource initiatorName(String initiatorName) {
    this.initiatorName = initiatorName;
    return this;
  }

 /**
   * Target iSCSI Qualified Name.
   * @return iqn
  **/
  @JsonProperty("iqn")
  @NotNull
  public String getIqn() {
    return iqn;
  }

  public void setIqn(String iqn) {
    this.iqn = iqn;
  }

  public IoK8sApiCoreV1ISCSIPersistentVolumeSource iqn(String iqn) {
    this.iqn = iqn;
    return this;
  }

 /**
   * iSCSI Interface Name that uses an iSCSI transport. Defaults to &#39;default&#39; (tcp).
   * @return iscsiInterface
  **/
  @JsonProperty("iscsiInterface")
  public String getIscsiInterface() {
    return iscsiInterface;
  }

  public void setIscsiInterface(String iscsiInterface) {
    this.iscsiInterface = iscsiInterface;
  }

  public IoK8sApiCoreV1ISCSIPersistentVolumeSource iscsiInterface(String iscsiInterface) {
    this.iscsiInterface = iscsiInterface;
    return this;
  }

 /**
   * iSCSI Target Lun number.
   * @return lun
  **/
  @JsonProperty("lun")
  @NotNull
  public Integer getLun() {
    return lun;
  }

  public void setLun(Integer lun) {
    this.lun = lun;
  }

  public IoK8sApiCoreV1ISCSIPersistentVolumeSource lun(Integer lun) {
    this.lun = lun;
    return this;
  }

 /**
   * iSCSI Target Portal List. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
   * @return portals
  **/
  @JsonProperty("portals")
  public List<String> getPortals() {
    return portals;
  }

  public void setPortals(List<String> portals) {
    this.portals = portals;
  }

  public IoK8sApiCoreV1ISCSIPersistentVolumeSource portals(List<String> portals) {
    this.portals = portals;
    return this;
  }

  public IoK8sApiCoreV1ISCSIPersistentVolumeSource addPortalsItem(String portalsItem) {
    this.portals.add(portalsItem);
    return this;
  }

 /**
   * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
   * @return readOnly
  **/
  @JsonProperty("readOnly")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public IoK8sApiCoreV1ISCSIPersistentVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

 /**
   * CHAP Secret for iSCSI target and initiator authentication
   * @return secretRef
  **/
  @JsonProperty("secretRef")
  public IoK8sApiCoreV1SecretReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(IoK8sApiCoreV1SecretReference secretRef) {
    this.secretRef = secretRef;
  }

  public IoK8sApiCoreV1ISCSIPersistentVolumeSource secretRef(IoK8sApiCoreV1SecretReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

 /**
   * iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
   * @return targetPortal
  **/
  @JsonProperty("targetPortal")
  @NotNull
  public String getTargetPortal() {
    return targetPortal;
  }

  public void setTargetPortal(String targetPortal) {
    this.targetPortal = targetPortal;
  }

  public IoK8sApiCoreV1ISCSIPersistentVolumeSource targetPortal(String targetPortal) {
    this.targetPortal = targetPortal;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ISCSIPersistentVolumeSource {\n");
    
    sb.append("    chapAuthDiscovery: ").append(toIndentedString(chapAuthDiscovery)).append("\n");
    sb.append("    chapAuthSession: ").append(toIndentedString(chapAuthSession)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    initiatorName: ").append(toIndentedString(initiatorName)).append("\n");
    sb.append("    iqn: ").append(toIndentedString(iqn)).append("\n");
    sb.append("    iscsiInterface: ").append(toIndentedString(iscsiInterface)).append("\n");
    sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
    sb.append("    portals: ").append(toIndentedString(portals)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    targetPortal: ").append(toIndentedString(targetPortal)).append("\n");
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

