package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1AzureDiskVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1AzureFilePersistentVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1CSIPersistentVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1CephFSPersistentVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1CinderPersistentVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1FCVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1FlexPersistentVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1FlockerVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1GCEPersistentDiskVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1GlusterfsPersistentVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1HostPathVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1ISCSIPersistentVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1LocalVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1NFSVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1ObjectReference;
import fakekube.io.model.IoK8sApiCoreV1PhotonPersistentDiskVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1PortworxVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1QuobyteVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1RBDPersistentVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1ScaleIOPersistentVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1StorageOSPersistentVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1VolumeNodeAffinity;
import fakekube.io.model.IoK8sApiCoreV1VsphereVirtualDiskVolumeSource;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
  * PersistentVolumeSpec is the specification of a persistent volume.
 **/
@ApiModel(description="PersistentVolumeSpec is the specification of a persistent volume.")
public class IoK8sApiCoreV1PersistentVolumeSpec  {
  
  @ApiModelProperty(value = "AccessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes")
 /**
   * AccessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
  **/
  private List<String> accessModes = null;

  @ApiModelProperty(value = "AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore")
  @Valid
 /**
   * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
  **/
  private IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource awsElasticBlockStore = null;

  @ApiModelProperty(value = "AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.")
  @Valid
 /**
   * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
  **/
  private IoK8sApiCoreV1AzureDiskVolumeSource azureDisk = null;

  @ApiModelProperty(value = "AzureFile represents an Azure File Service mount on the host and bind mount to the pod.")
  @Valid
 /**
   * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
  **/
  private IoK8sApiCoreV1AzureFilePersistentVolumeSource azureFile = null;

  @ApiModelProperty(value = "A description of the persistent volume's resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity")
 /**
   * A description of the persistent volume's resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
  **/
  private Map<String, String> capacity = null;

  @ApiModelProperty(value = "CephFS represents a Ceph FS mount on the host that shares a pod's lifetime")
  @Valid
 /**
   * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
  **/
  private IoK8sApiCoreV1CephFSPersistentVolumeSource cephfs = null;

  @ApiModelProperty(value = "Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
  @Valid
 /**
   * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
  **/
  private IoK8sApiCoreV1CinderPersistentVolumeSource cinder = null;

  @ApiModelProperty(value = "ClaimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding")
  @Valid
 /**
   * ClaimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
  **/
  private IoK8sApiCoreV1ObjectReference claimRef = null;

  @ApiModelProperty(value = "CSI represents storage that is handled by an external CSI driver (Beta feature).")
  @Valid
 /**
   * CSI represents storage that is handled by an external CSI driver (Beta feature).
  **/
  private IoK8sApiCoreV1CSIPersistentVolumeSource csi = null;

  @ApiModelProperty(value = "FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.")
  @Valid
 /**
   * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
  **/
  private IoK8sApiCoreV1FCVolumeSource fc = null;

  @ApiModelProperty(value = "FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.")
  @Valid
 /**
   * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
  **/
  private IoK8sApiCoreV1FlexPersistentVolumeSource flexVolume = null;

  @ApiModelProperty(value = "Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage. This depends on the Flocker control service being running")
  @Valid
 /**
   * Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage. This depends on the Flocker control service being running
  **/
  private IoK8sApiCoreV1FlockerVolumeSource flocker = null;

  @ApiModelProperty(value = "GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
  @Valid
 /**
   * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
  **/
  private IoK8sApiCoreV1GCEPersistentDiskVolumeSource gcePersistentDisk = null;

  @ApiModelProperty(value = "Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md")
  @Valid
 /**
   * Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md
  **/
  private IoK8sApiCoreV1GlusterfsPersistentVolumeSource glusterfs = null;

  @ApiModelProperty(value = "HostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath")
  @Valid
 /**
   * HostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
  **/
  private IoK8sApiCoreV1HostPathVolumeSource hostPath = null;

  @ApiModelProperty(value = "ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin.")
  @Valid
 /**
   * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin.
  **/
  private IoK8sApiCoreV1ISCSIPersistentVolumeSource iscsi = null;

  @ApiModelProperty(value = "Local represents directly-attached storage with node affinity")
  @Valid
 /**
   * Local represents directly-attached storage with node affinity
  **/
  private IoK8sApiCoreV1LocalVolumeSource local = null;

  @ApiModelProperty(value = "A list of mount options, e.g. [\"ro\", \"soft\"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options")
 /**
   * A list of mount options, e.g. [\"ro\", \"soft\"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options
  **/
  private List<String> mountOptions = null;

  @ApiModelProperty(value = "NFS represents an NFS mount on the host. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
  @Valid
 /**
   * NFS represents an NFS mount on the host. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
  **/
  private IoK8sApiCoreV1NFSVolumeSource nfs = null;

  @ApiModelProperty(value = "NodeAffinity defines constraints that limit what nodes this volume can be accessed from. This field influences the scheduling of pods that use this volume.")
  @Valid
 /**
   * NodeAffinity defines constraints that limit what nodes this volume can be accessed from. This field influences the scheduling of pods that use this volume.
  **/
  private IoK8sApiCoreV1VolumeNodeAffinity nodeAffinity = null;

  @ApiModelProperty(value = "What happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming")
 /**
   * What happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
  **/
  private String persistentVolumeReclaimPolicy = null;

  @ApiModelProperty(value = "PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine")
  @Valid
 /**
   * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
  **/
  private IoK8sApiCoreV1PhotonPersistentDiskVolumeSource photonPersistentDisk = null;

  @ApiModelProperty(value = "PortworxVolume represents a portworx volume attached and mounted on kubelets host machine")
  @Valid
 /**
   * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine
  **/
  private IoK8sApiCoreV1PortworxVolumeSource portworxVolume = null;

  @ApiModelProperty(value = "Quobyte represents a Quobyte mount on the host that shares a pod's lifetime")
  @Valid
 /**
   * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime
  **/
  private IoK8sApiCoreV1QuobyteVolumeSource quobyte = null;

  @ApiModelProperty(value = "RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md")
  @Valid
 /**
   * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
  **/
  private IoK8sApiCoreV1RBDPersistentVolumeSource rbd = null;

  @ApiModelProperty(value = "ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.")
  @Valid
 /**
   * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
  **/
  private IoK8sApiCoreV1ScaleIOPersistentVolumeSource scaleIO = null;

  @ApiModelProperty(value = "Name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass.")
 /**
   * Name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass.
  **/
  private String storageClassName = null;

  @ApiModelProperty(value = "StorageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md")
  @Valid
 /**
   * StorageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md
  **/
  private IoK8sApiCoreV1StorageOSPersistentVolumeSource storageos = null;

  @ApiModelProperty(value = "volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec. This is a beta feature.")
 /**
   * volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec. This is a beta feature.
  **/
  private String volumeMode = null;

  @ApiModelProperty(value = "VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine")
  @Valid
 /**
   * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
  **/
  private IoK8sApiCoreV1VsphereVirtualDiskVolumeSource vsphereVolume = null;
 /**
   * AccessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
   * @return accessModes
  **/
  @JsonProperty("accessModes")
  public List<String> getAccessModes() {
    return accessModes;
  }

  public void setAccessModes(List<String> accessModes) {
    this.accessModes = accessModes;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec accessModes(List<String> accessModes) {
    this.accessModes = accessModes;
    return this;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec addAccessModesItem(String accessModesItem) {
    this.accessModes.add(accessModesItem);
    return this;
  }

 /**
   * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet&#39;s host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
   * @return awsElasticBlockStore
  **/
  @JsonProperty("awsElasticBlockStore")
  public IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
    return awsElasticBlockStore;
  }

  public void setAwsElasticBlockStore(IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec awsElasticBlockStore(IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
    return this;
  }

 /**
   * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
   * @return azureDisk
  **/
  @JsonProperty("azureDisk")
  public IoK8sApiCoreV1AzureDiskVolumeSource getAzureDisk() {
    return azureDisk;
  }

  public void setAzureDisk(IoK8sApiCoreV1AzureDiskVolumeSource azureDisk) {
    this.azureDisk = azureDisk;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec azureDisk(IoK8sApiCoreV1AzureDiskVolumeSource azureDisk) {
    this.azureDisk = azureDisk;
    return this;
  }

 /**
   * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
   * @return azureFile
  **/
  @JsonProperty("azureFile")
  public IoK8sApiCoreV1AzureFilePersistentVolumeSource getAzureFile() {
    return azureFile;
  }

  public void setAzureFile(IoK8sApiCoreV1AzureFilePersistentVolumeSource azureFile) {
    this.azureFile = azureFile;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec azureFile(IoK8sApiCoreV1AzureFilePersistentVolumeSource azureFile) {
    this.azureFile = azureFile;
    return this;
  }

 /**
   * A description of the persistent volume&#39;s resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
   * @return capacity
  **/
  @JsonProperty("capacity")
  public Map<String, String> getCapacity() {
    return capacity;
  }

  public void setCapacity(Map<String, String> capacity) {
    this.capacity = capacity;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec capacity(Map<String, String> capacity) {
    this.capacity = capacity;
    return this;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec putCapacityItem(String key, String capacityItem) {
    this.capacity.put(key, capacityItem);
    return this;
  }

 /**
   * CephFS represents a Ceph FS mount on the host that shares a pod&#39;s lifetime
   * @return cephfs
  **/
  @JsonProperty("cephfs")
  public IoK8sApiCoreV1CephFSPersistentVolumeSource getCephfs() {
    return cephfs;
  }

  public void setCephfs(IoK8sApiCoreV1CephFSPersistentVolumeSource cephfs) {
    this.cephfs = cephfs;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec cephfs(IoK8sApiCoreV1CephFSPersistentVolumeSource cephfs) {
    this.cephfs = cephfs;
    return this;
  }

 /**
   * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   * @return cinder
  **/
  @JsonProperty("cinder")
  public IoK8sApiCoreV1CinderPersistentVolumeSource getCinder() {
    return cinder;
  }

  public void setCinder(IoK8sApiCoreV1CinderPersistentVolumeSource cinder) {
    this.cinder = cinder;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec cinder(IoK8sApiCoreV1CinderPersistentVolumeSource cinder) {
    this.cinder = cinder;
    return this;
  }

 /**
   * ClaimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
   * @return claimRef
  **/
  @JsonProperty("claimRef")
  public IoK8sApiCoreV1ObjectReference getClaimRef() {
    return claimRef;
  }

  public void setClaimRef(IoK8sApiCoreV1ObjectReference claimRef) {
    this.claimRef = claimRef;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec claimRef(IoK8sApiCoreV1ObjectReference claimRef) {
    this.claimRef = claimRef;
    return this;
  }

 /**
   * CSI represents storage that is handled by an external CSI driver (Beta feature).
   * @return csi
  **/
  @JsonProperty("csi")
  public IoK8sApiCoreV1CSIPersistentVolumeSource getCsi() {
    return csi;
  }

  public void setCsi(IoK8sApiCoreV1CSIPersistentVolumeSource csi) {
    this.csi = csi;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec csi(IoK8sApiCoreV1CSIPersistentVolumeSource csi) {
    this.csi = csi;
    return this;
  }

 /**
   * FC represents a Fibre Channel resource that is attached to a kubelet&#39;s host machine and then exposed to the pod.
   * @return fc
  **/
  @JsonProperty("fc")
  public IoK8sApiCoreV1FCVolumeSource getFc() {
    return fc;
  }

  public void setFc(IoK8sApiCoreV1FCVolumeSource fc) {
    this.fc = fc;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec fc(IoK8sApiCoreV1FCVolumeSource fc) {
    this.fc = fc;
    return this;
  }

 /**
   * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
   * @return flexVolume
  **/
  @JsonProperty("flexVolume")
  public IoK8sApiCoreV1FlexPersistentVolumeSource getFlexVolume() {
    return flexVolume;
  }

  public void setFlexVolume(IoK8sApiCoreV1FlexPersistentVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec flexVolume(IoK8sApiCoreV1FlexPersistentVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
    return this;
  }

 /**
   * Flocker represents a Flocker volume attached to a kubelet&#39;s host machine and exposed to the pod for its usage. This depends on the Flocker control service being running
   * @return flocker
  **/
  @JsonProperty("flocker")
  public IoK8sApiCoreV1FlockerVolumeSource getFlocker() {
    return flocker;
  }

  public void setFlocker(IoK8sApiCoreV1FlockerVolumeSource flocker) {
    this.flocker = flocker;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec flocker(IoK8sApiCoreV1FlockerVolumeSource flocker) {
    this.flocker = flocker;
    return this;
  }

 /**
   * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet&#39;s host machine and then exposed to the pod. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
   * @return gcePersistentDisk
  **/
  @JsonProperty("gcePersistentDisk")
  public IoK8sApiCoreV1GCEPersistentDiskVolumeSource getGcePersistentDisk() {
    return gcePersistentDisk;
  }

  public void setGcePersistentDisk(IoK8sApiCoreV1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec gcePersistentDisk(IoK8sApiCoreV1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
    return this;
  }

 /**
   * Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md
   * @return glusterfs
  **/
  @JsonProperty("glusterfs")
  public IoK8sApiCoreV1GlusterfsPersistentVolumeSource getGlusterfs() {
    return glusterfs;
  }

  public void setGlusterfs(IoK8sApiCoreV1GlusterfsPersistentVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec glusterfs(IoK8sApiCoreV1GlusterfsPersistentVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
    return this;
  }

 /**
   * HostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
   * @return hostPath
  **/
  @JsonProperty("hostPath")
  public IoK8sApiCoreV1HostPathVolumeSource getHostPath() {
    return hostPath;
  }

  public void setHostPath(IoK8sApiCoreV1HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec hostPath(IoK8sApiCoreV1HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
    return this;
  }

 /**
   * ISCSI represents an ISCSI Disk resource that is attached to a kubelet&#39;s host machine and then exposed to the pod. Provisioned by an admin.
   * @return iscsi
  **/
  @JsonProperty("iscsi")
  public IoK8sApiCoreV1ISCSIPersistentVolumeSource getIscsi() {
    return iscsi;
  }

  public void setIscsi(IoK8sApiCoreV1ISCSIPersistentVolumeSource iscsi) {
    this.iscsi = iscsi;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec iscsi(IoK8sApiCoreV1ISCSIPersistentVolumeSource iscsi) {
    this.iscsi = iscsi;
    return this;
  }

 /**
   * Local represents directly-attached storage with node affinity
   * @return local
  **/
  @JsonProperty("local")
  public IoK8sApiCoreV1LocalVolumeSource getLocal() {
    return local;
  }

  public void setLocal(IoK8sApiCoreV1LocalVolumeSource local) {
    this.local = local;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec local(IoK8sApiCoreV1LocalVolumeSource local) {
    this.local = local;
    return this;
  }

 /**
   * A list of mount options, e.g. [\&quot;ro\&quot;, \&quot;soft\&quot;]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options
   * @return mountOptions
  **/
  @JsonProperty("mountOptions")
  public List<String> getMountOptions() {
    return mountOptions;
  }

  public void setMountOptions(List<String> mountOptions) {
    this.mountOptions = mountOptions;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec mountOptions(List<String> mountOptions) {
    this.mountOptions = mountOptions;
    return this;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec addMountOptionsItem(String mountOptionsItem) {
    this.mountOptions.add(mountOptionsItem);
    return this;
  }

 /**
   * NFS represents an NFS mount on the host. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
   * @return nfs
  **/
  @JsonProperty("nfs")
  public IoK8sApiCoreV1NFSVolumeSource getNfs() {
    return nfs;
  }

  public void setNfs(IoK8sApiCoreV1NFSVolumeSource nfs) {
    this.nfs = nfs;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec nfs(IoK8sApiCoreV1NFSVolumeSource nfs) {
    this.nfs = nfs;
    return this;
  }

 /**
   * NodeAffinity defines constraints that limit what nodes this volume can be accessed from. This field influences the scheduling of pods that use this volume.
   * @return nodeAffinity
  **/
  @JsonProperty("nodeAffinity")
  public IoK8sApiCoreV1VolumeNodeAffinity getNodeAffinity() {
    return nodeAffinity;
  }

  public void setNodeAffinity(IoK8sApiCoreV1VolumeNodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec nodeAffinity(IoK8sApiCoreV1VolumeNodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
    return this;
  }

 /**
   * What happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
   * @return persistentVolumeReclaimPolicy
  **/
  @JsonProperty("persistentVolumeReclaimPolicy")
  public String getPersistentVolumeReclaimPolicy() {
    return persistentVolumeReclaimPolicy;
  }

  public void setPersistentVolumeReclaimPolicy(String persistentVolumeReclaimPolicy) {
    this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec persistentVolumeReclaimPolicy(String persistentVolumeReclaimPolicy) {
    this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
    return this;
  }

 /**
   * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
   * @return photonPersistentDisk
  **/
  @JsonProperty("photonPersistentDisk")
  public IoK8sApiCoreV1PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
    return photonPersistentDisk;
  }

  public void setPhotonPersistentDisk(IoK8sApiCoreV1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec photonPersistentDisk(IoK8sApiCoreV1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
    return this;
  }

 /**
   * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine
   * @return portworxVolume
  **/
  @JsonProperty("portworxVolume")
  public IoK8sApiCoreV1PortworxVolumeSource getPortworxVolume() {
    return portworxVolume;
  }

  public void setPortworxVolume(IoK8sApiCoreV1PortworxVolumeSource portworxVolume) {
    this.portworxVolume = portworxVolume;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec portworxVolume(IoK8sApiCoreV1PortworxVolumeSource portworxVolume) {
    this.portworxVolume = portworxVolume;
    return this;
  }

 /**
   * Quobyte represents a Quobyte mount on the host that shares a pod&#39;s lifetime
   * @return quobyte
  **/
  @JsonProperty("quobyte")
  public IoK8sApiCoreV1QuobyteVolumeSource getQuobyte() {
    return quobyte;
  }

  public void setQuobyte(IoK8sApiCoreV1QuobyteVolumeSource quobyte) {
    this.quobyte = quobyte;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec quobyte(IoK8sApiCoreV1QuobyteVolumeSource quobyte) {
    this.quobyte = quobyte;
    return this;
  }

 /**
   * RBD represents a Rados Block Device mount on the host that shares a pod&#39;s lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
   * @return rbd
  **/
  @JsonProperty("rbd")
  public IoK8sApiCoreV1RBDPersistentVolumeSource getRbd() {
    return rbd;
  }

  public void setRbd(IoK8sApiCoreV1RBDPersistentVolumeSource rbd) {
    this.rbd = rbd;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec rbd(IoK8sApiCoreV1RBDPersistentVolumeSource rbd) {
    this.rbd = rbd;
    return this;
  }

 /**
   * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
   * @return scaleIO
  **/
  @JsonProperty("scaleIO")
  public IoK8sApiCoreV1ScaleIOPersistentVolumeSource getScaleIO() {
    return scaleIO;
  }

  public void setScaleIO(IoK8sApiCoreV1ScaleIOPersistentVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec scaleIO(IoK8sApiCoreV1ScaleIOPersistentVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
    return this;
  }

 /**
   * Name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass.
   * @return storageClassName
  **/
  @JsonProperty("storageClassName")
  public String getStorageClassName() {
    return storageClassName;
  }

  public void setStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec storageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
    return this;
  }

 /**
   * StorageOS represents a StorageOS volume that is attached to the kubelet&#39;s host machine and mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md
   * @return storageos
  **/
  @JsonProperty("storageos")
  public IoK8sApiCoreV1StorageOSPersistentVolumeSource getStorageos() {
    return storageos;
  }

  public void setStorageos(IoK8sApiCoreV1StorageOSPersistentVolumeSource storageos) {
    this.storageos = storageos;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec storageos(IoK8sApiCoreV1StorageOSPersistentVolumeSource storageos) {
    this.storageos = storageos;
    return this;
  }

 /**
   * volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec. This is a beta feature.
   * @return volumeMode
  **/
  @JsonProperty("volumeMode")
  public String getVolumeMode() {
    return volumeMode;
  }

  public void setVolumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec volumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
    return this;
  }

 /**
   * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
   * @return vsphereVolume
  **/
  @JsonProperty("vsphereVolume")
  public IoK8sApiCoreV1VsphereVirtualDiskVolumeSource getVsphereVolume() {
    return vsphereVolume;
  }

  public void setVsphereVolume(IoK8sApiCoreV1VsphereVirtualDiskVolumeSource vsphereVolume) {
    this.vsphereVolume = vsphereVolume;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec vsphereVolume(IoK8sApiCoreV1VsphereVirtualDiskVolumeSource vsphereVolume) {
    this.vsphereVolume = vsphereVolume;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PersistentVolumeSpec {\n");
    
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    awsElasticBlockStore: ").append(toIndentedString(awsElasticBlockStore)).append("\n");
    sb.append("    azureDisk: ").append(toIndentedString(azureDisk)).append("\n");
    sb.append("    azureFile: ").append(toIndentedString(azureFile)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    cephfs: ").append(toIndentedString(cephfs)).append("\n");
    sb.append("    cinder: ").append(toIndentedString(cinder)).append("\n");
    sb.append("    claimRef: ").append(toIndentedString(claimRef)).append("\n");
    sb.append("    csi: ").append(toIndentedString(csi)).append("\n");
    sb.append("    fc: ").append(toIndentedString(fc)).append("\n");
    sb.append("    flexVolume: ").append(toIndentedString(flexVolume)).append("\n");
    sb.append("    flocker: ").append(toIndentedString(flocker)).append("\n");
    sb.append("    gcePersistentDisk: ").append(toIndentedString(gcePersistentDisk)).append("\n");
    sb.append("    glusterfs: ").append(toIndentedString(glusterfs)).append("\n");
    sb.append("    hostPath: ").append(toIndentedString(hostPath)).append("\n");
    sb.append("    iscsi: ").append(toIndentedString(iscsi)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    mountOptions: ").append(toIndentedString(mountOptions)).append("\n");
    sb.append("    nfs: ").append(toIndentedString(nfs)).append("\n");
    sb.append("    nodeAffinity: ").append(toIndentedString(nodeAffinity)).append("\n");
    sb.append("    persistentVolumeReclaimPolicy: ").append(toIndentedString(persistentVolumeReclaimPolicy)).append("\n");
    sb.append("    photonPersistentDisk: ").append(toIndentedString(photonPersistentDisk)).append("\n");
    sb.append("    portworxVolume: ").append(toIndentedString(portworxVolume)).append("\n");
    sb.append("    quobyte: ").append(toIndentedString(quobyte)).append("\n");
    sb.append("    rbd: ").append(toIndentedString(rbd)).append("\n");
    sb.append("    scaleIO: ").append(toIndentedString(scaleIO)).append("\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
    sb.append("    storageos: ").append(toIndentedString(storageos)).append("\n");
    sb.append("    volumeMode: ").append(toIndentedString(volumeMode)).append("\n");
    sb.append("    vsphereVolume: ").append(toIndentedString(vsphereVolume)).append("\n");
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

