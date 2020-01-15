package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1AzureDiskVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1AzureFileVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1CSIVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1CephFSVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1CinderVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1ConfigMapVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1DownwardAPIVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1EmptyDirVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1FCVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1FlexVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1FlockerVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1GCEPersistentDiskVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1GitRepoVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1GlusterfsVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1HostPathVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1ISCSIVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1NFSVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1PersistentVolumeClaimVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1PhotonPersistentDiskVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1PortworxVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1ProjectedVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1QuobyteVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1RBDVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1ScaleIOVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1SecretVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1StorageOSVolumeSource;
import fakekube.io.model.IoK8sApiCoreV1VsphereVirtualDiskVolumeSource;
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
  * Volume represents a named volume in a pod that may be accessed by any container in the pod.
 **/
@ApiModel(description="Volume represents a named volume in a pod that may be accessed by any container in the pod.")
public class IoK8sApiCoreV1Volume  {
  
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
  private IoK8sApiCoreV1AzureFileVolumeSource azureFile = null;

  @ApiModelProperty(value = "CephFS represents a Ceph FS mount on the host that shares a pod's lifetime")
  @Valid
 /**
   * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
  **/
  private IoK8sApiCoreV1CephFSVolumeSource cephfs = null;

  @ApiModelProperty(value = "Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
  @Valid
 /**
   * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
  **/
  private IoK8sApiCoreV1CinderVolumeSource cinder = null;

  @ApiModelProperty(value = "ConfigMap represents a configMap that should populate this volume")
  @Valid
 /**
   * ConfigMap represents a configMap that should populate this volume
  **/
  private IoK8sApiCoreV1ConfigMapVolumeSource configMap = null;

  @ApiModelProperty(value = "CSI (Container Storage Interface) represents storage that is handled by an external CSI driver (Alpha feature).")
  @Valid
 /**
   * CSI (Container Storage Interface) represents storage that is handled by an external CSI driver (Alpha feature).
  **/
  private IoK8sApiCoreV1CSIVolumeSource csi = null;

  @ApiModelProperty(value = "DownwardAPI represents downward API about the pod that should populate this volume")
  @Valid
 /**
   * DownwardAPI represents downward API about the pod that should populate this volume
  **/
  private IoK8sApiCoreV1DownwardAPIVolumeSource downwardAPI = null;

  @ApiModelProperty(value = "EmptyDir represents a temporary directory that shares a pod's lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir")
  @Valid
 /**
   * EmptyDir represents a temporary directory that shares a pod's lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
  **/
  private IoK8sApiCoreV1EmptyDirVolumeSource emptyDir = null;

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
  private IoK8sApiCoreV1FlexVolumeSource flexVolume = null;

  @ApiModelProperty(value = "Flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running")
  @Valid
 /**
   * Flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running
  **/
  private IoK8sApiCoreV1FlockerVolumeSource flocker = null;

  @ApiModelProperty(value = "GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
  @Valid
 /**
   * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
  **/
  private IoK8sApiCoreV1GCEPersistentDiskVolumeSource gcePersistentDisk = null;

  @ApiModelProperty(value = "GitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.")
  @Valid
 /**
   * GitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
  **/
  private IoK8sApiCoreV1GitRepoVolumeSource gitRepo = null;

  @ApiModelProperty(value = "Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md")
  @Valid
 /**
   * Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md
  **/
  private IoK8sApiCoreV1GlusterfsVolumeSource glusterfs = null;

  @ApiModelProperty(value = "HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath")
  @Valid
 /**
   * HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
  **/
  private IoK8sApiCoreV1HostPathVolumeSource hostPath = null;

  @ApiModelProperty(value = "ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md")
  @Valid
 /**
   * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md
  **/
  private IoK8sApiCoreV1ISCSIVolumeSource iscsi = null;

  @ApiModelProperty(required = true, value = "Volume's name. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
 /**
   * Volume's name. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
  **/
  private String name = null;

  @ApiModelProperty(value = "NFS represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
  @Valid
 /**
   * NFS represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
  **/
  private IoK8sApiCoreV1NFSVolumeSource nfs = null;

  @ApiModelProperty(value = "PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
  @Valid
 /**
   * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
  **/
  private IoK8sApiCoreV1PersistentVolumeClaimVolumeSource persistentVolumeClaim = null;

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

  @ApiModelProperty(value = "Items for all in one resources secrets, configmaps, and downward API")
  @Valid
 /**
   * Items for all in one resources secrets, configmaps, and downward API
  **/
  private IoK8sApiCoreV1ProjectedVolumeSource projected = null;

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
  private IoK8sApiCoreV1RBDVolumeSource rbd = null;

  @ApiModelProperty(value = "ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.")
  @Valid
 /**
   * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
  **/
  private IoK8sApiCoreV1ScaleIOVolumeSource scaleIO = null;

  @ApiModelProperty(value = "Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret")
  @Valid
 /**
   * Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
  **/
  private IoK8sApiCoreV1SecretVolumeSource secret = null;

  @ApiModelProperty(value = "StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.")
  @Valid
 /**
   * StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
  **/
  private IoK8sApiCoreV1StorageOSVolumeSource storageos = null;

  @ApiModelProperty(value = "VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine")
  @Valid
 /**
   * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
  **/
  private IoK8sApiCoreV1VsphereVirtualDiskVolumeSource vsphereVolume = null;
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

  public IoK8sApiCoreV1Volume awsElasticBlockStore(IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
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

  public IoK8sApiCoreV1Volume azureDisk(IoK8sApiCoreV1AzureDiskVolumeSource azureDisk) {
    this.azureDisk = azureDisk;
    return this;
  }

 /**
   * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
   * @return azureFile
  **/
  @JsonProperty("azureFile")
  public IoK8sApiCoreV1AzureFileVolumeSource getAzureFile() {
    return azureFile;
  }

  public void setAzureFile(IoK8sApiCoreV1AzureFileVolumeSource azureFile) {
    this.azureFile = azureFile;
  }

  public IoK8sApiCoreV1Volume azureFile(IoK8sApiCoreV1AzureFileVolumeSource azureFile) {
    this.azureFile = azureFile;
    return this;
  }

 /**
   * CephFS represents a Ceph FS mount on the host that shares a pod&#39;s lifetime
   * @return cephfs
  **/
  @JsonProperty("cephfs")
  public IoK8sApiCoreV1CephFSVolumeSource getCephfs() {
    return cephfs;
  }

  public void setCephfs(IoK8sApiCoreV1CephFSVolumeSource cephfs) {
    this.cephfs = cephfs;
  }

  public IoK8sApiCoreV1Volume cephfs(IoK8sApiCoreV1CephFSVolumeSource cephfs) {
    this.cephfs = cephfs;
    return this;
  }

 /**
   * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   * @return cinder
  **/
  @JsonProperty("cinder")
  public IoK8sApiCoreV1CinderVolumeSource getCinder() {
    return cinder;
  }

  public void setCinder(IoK8sApiCoreV1CinderVolumeSource cinder) {
    this.cinder = cinder;
  }

  public IoK8sApiCoreV1Volume cinder(IoK8sApiCoreV1CinderVolumeSource cinder) {
    this.cinder = cinder;
    return this;
  }

 /**
   * ConfigMap represents a configMap that should populate this volume
   * @return configMap
  **/
  @JsonProperty("configMap")
  public IoK8sApiCoreV1ConfigMapVolumeSource getConfigMap() {
    return configMap;
  }

  public void setConfigMap(IoK8sApiCoreV1ConfigMapVolumeSource configMap) {
    this.configMap = configMap;
  }

  public IoK8sApiCoreV1Volume configMap(IoK8sApiCoreV1ConfigMapVolumeSource configMap) {
    this.configMap = configMap;
    return this;
  }

 /**
   * CSI (Container Storage Interface) represents storage that is handled by an external CSI driver (Alpha feature).
   * @return csi
  **/
  @JsonProperty("csi")
  public IoK8sApiCoreV1CSIVolumeSource getCsi() {
    return csi;
  }

  public void setCsi(IoK8sApiCoreV1CSIVolumeSource csi) {
    this.csi = csi;
  }

  public IoK8sApiCoreV1Volume csi(IoK8sApiCoreV1CSIVolumeSource csi) {
    this.csi = csi;
    return this;
  }

 /**
   * DownwardAPI represents downward API about the pod that should populate this volume
   * @return downwardAPI
  **/
  @JsonProperty("downwardAPI")
  public IoK8sApiCoreV1DownwardAPIVolumeSource getDownwardAPI() {
    return downwardAPI;
  }

  public void setDownwardAPI(IoK8sApiCoreV1DownwardAPIVolumeSource downwardAPI) {
    this.downwardAPI = downwardAPI;
  }

  public IoK8sApiCoreV1Volume downwardAPI(IoK8sApiCoreV1DownwardAPIVolumeSource downwardAPI) {
    this.downwardAPI = downwardAPI;
    return this;
  }

 /**
   * EmptyDir represents a temporary directory that shares a pod&#39;s lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
   * @return emptyDir
  **/
  @JsonProperty("emptyDir")
  public IoK8sApiCoreV1EmptyDirVolumeSource getEmptyDir() {
    return emptyDir;
  }

  public void setEmptyDir(IoK8sApiCoreV1EmptyDirVolumeSource emptyDir) {
    this.emptyDir = emptyDir;
  }

  public IoK8sApiCoreV1Volume emptyDir(IoK8sApiCoreV1EmptyDirVolumeSource emptyDir) {
    this.emptyDir = emptyDir;
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

  public IoK8sApiCoreV1Volume fc(IoK8sApiCoreV1FCVolumeSource fc) {
    this.fc = fc;
    return this;
  }

 /**
   * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
   * @return flexVolume
  **/
  @JsonProperty("flexVolume")
  public IoK8sApiCoreV1FlexVolumeSource getFlexVolume() {
    return flexVolume;
  }

  public void setFlexVolume(IoK8sApiCoreV1FlexVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
  }

  public IoK8sApiCoreV1Volume flexVolume(IoK8sApiCoreV1FlexVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
    return this;
  }

 /**
   * Flocker represents a Flocker volume attached to a kubelet&#39;s host machine. This depends on the Flocker control service being running
   * @return flocker
  **/
  @JsonProperty("flocker")
  public IoK8sApiCoreV1FlockerVolumeSource getFlocker() {
    return flocker;
  }

  public void setFlocker(IoK8sApiCoreV1FlockerVolumeSource flocker) {
    this.flocker = flocker;
  }

  public IoK8sApiCoreV1Volume flocker(IoK8sApiCoreV1FlockerVolumeSource flocker) {
    this.flocker = flocker;
    return this;
  }

 /**
   * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet&#39;s host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
   * @return gcePersistentDisk
  **/
  @JsonProperty("gcePersistentDisk")
  public IoK8sApiCoreV1GCEPersistentDiskVolumeSource getGcePersistentDisk() {
    return gcePersistentDisk;
  }

  public void setGcePersistentDisk(IoK8sApiCoreV1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
  }

  public IoK8sApiCoreV1Volume gcePersistentDisk(IoK8sApiCoreV1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
    return this;
  }

 /**
   * GitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod&#39;s container.
   * @return gitRepo
  **/
  @JsonProperty("gitRepo")
  public IoK8sApiCoreV1GitRepoVolumeSource getGitRepo() {
    return gitRepo;
  }

  public void setGitRepo(IoK8sApiCoreV1GitRepoVolumeSource gitRepo) {
    this.gitRepo = gitRepo;
  }

  public IoK8sApiCoreV1Volume gitRepo(IoK8sApiCoreV1GitRepoVolumeSource gitRepo) {
    this.gitRepo = gitRepo;
    return this;
  }

 /**
   * Glusterfs represents a Glusterfs mount on the host that shares a pod&#39;s lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md
   * @return glusterfs
  **/
  @JsonProperty("glusterfs")
  public IoK8sApiCoreV1GlusterfsVolumeSource getGlusterfs() {
    return glusterfs;
  }

  public void setGlusterfs(IoK8sApiCoreV1GlusterfsVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
  }

  public IoK8sApiCoreV1Volume glusterfs(IoK8sApiCoreV1GlusterfsVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
    return this;
  }

 /**
   * HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
   * @return hostPath
  **/
  @JsonProperty("hostPath")
  public IoK8sApiCoreV1HostPathVolumeSource getHostPath() {
    return hostPath;
  }

  public void setHostPath(IoK8sApiCoreV1HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
  }

  public IoK8sApiCoreV1Volume hostPath(IoK8sApiCoreV1HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
    return this;
  }

 /**
   * ISCSI represents an ISCSI Disk resource that is attached to a kubelet&#39;s host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md
   * @return iscsi
  **/
  @JsonProperty("iscsi")
  public IoK8sApiCoreV1ISCSIVolumeSource getIscsi() {
    return iscsi;
  }

  public void setIscsi(IoK8sApiCoreV1ISCSIVolumeSource iscsi) {
    this.iscsi = iscsi;
  }

  public IoK8sApiCoreV1Volume iscsi(IoK8sApiCoreV1ISCSIVolumeSource iscsi) {
    this.iscsi = iscsi;
    return this;
  }

 /**
   * Volume&#39;s name. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiCoreV1Volume name(String name) {
    this.name = name;
    return this;
  }

 /**
   * NFS represents an NFS mount on the host that shares a pod&#39;s lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
   * @return nfs
  **/
  @JsonProperty("nfs")
  public IoK8sApiCoreV1NFSVolumeSource getNfs() {
    return nfs;
  }

  public void setNfs(IoK8sApiCoreV1NFSVolumeSource nfs) {
    this.nfs = nfs;
  }

  public IoK8sApiCoreV1Volume nfs(IoK8sApiCoreV1NFSVolumeSource nfs) {
    this.nfs = nfs;
    return this;
  }

 /**
   * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
   * @return persistentVolumeClaim
  **/
  @JsonProperty("persistentVolumeClaim")
  public IoK8sApiCoreV1PersistentVolumeClaimVolumeSource getPersistentVolumeClaim() {
    return persistentVolumeClaim;
  }

  public void setPersistentVolumeClaim(IoK8sApiCoreV1PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
  }

  public IoK8sApiCoreV1Volume persistentVolumeClaim(IoK8sApiCoreV1PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
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

  public IoK8sApiCoreV1Volume photonPersistentDisk(IoK8sApiCoreV1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
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

  public IoK8sApiCoreV1Volume portworxVolume(IoK8sApiCoreV1PortworxVolumeSource portworxVolume) {
    this.portworxVolume = portworxVolume;
    return this;
  }

 /**
   * Items for all in one resources secrets, configmaps, and downward API
   * @return projected
  **/
  @JsonProperty("projected")
  public IoK8sApiCoreV1ProjectedVolumeSource getProjected() {
    return projected;
  }

  public void setProjected(IoK8sApiCoreV1ProjectedVolumeSource projected) {
    this.projected = projected;
  }

  public IoK8sApiCoreV1Volume projected(IoK8sApiCoreV1ProjectedVolumeSource projected) {
    this.projected = projected;
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

  public IoK8sApiCoreV1Volume quobyte(IoK8sApiCoreV1QuobyteVolumeSource quobyte) {
    this.quobyte = quobyte;
    return this;
  }

 /**
   * RBD represents a Rados Block Device mount on the host that shares a pod&#39;s lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
   * @return rbd
  **/
  @JsonProperty("rbd")
  public IoK8sApiCoreV1RBDVolumeSource getRbd() {
    return rbd;
  }

  public void setRbd(IoK8sApiCoreV1RBDVolumeSource rbd) {
    this.rbd = rbd;
  }

  public IoK8sApiCoreV1Volume rbd(IoK8sApiCoreV1RBDVolumeSource rbd) {
    this.rbd = rbd;
    return this;
  }

 /**
   * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
   * @return scaleIO
  **/
  @JsonProperty("scaleIO")
  public IoK8sApiCoreV1ScaleIOVolumeSource getScaleIO() {
    return scaleIO;
  }

  public void setScaleIO(IoK8sApiCoreV1ScaleIOVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
  }

  public IoK8sApiCoreV1Volume scaleIO(IoK8sApiCoreV1ScaleIOVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
    return this;
  }

 /**
   * Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
   * @return secret
  **/
  @JsonProperty("secret")
  public IoK8sApiCoreV1SecretVolumeSource getSecret() {
    return secret;
  }

  public void setSecret(IoK8sApiCoreV1SecretVolumeSource secret) {
    this.secret = secret;
  }

  public IoK8sApiCoreV1Volume secret(IoK8sApiCoreV1SecretVolumeSource secret) {
    this.secret = secret;
    return this;
  }

 /**
   * StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
   * @return storageos
  **/
  @JsonProperty("storageos")
  public IoK8sApiCoreV1StorageOSVolumeSource getStorageos() {
    return storageos;
  }

  public void setStorageos(IoK8sApiCoreV1StorageOSVolumeSource storageos) {
    this.storageos = storageos;
  }

  public IoK8sApiCoreV1Volume storageos(IoK8sApiCoreV1StorageOSVolumeSource storageos) {
    this.storageos = storageos;
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

  public IoK8sApiCoreV1Volume vsphereVolume(IoK8sApiCoreV1VsphereVirtualDiskVolumeSource vsphereVolume) {
    this.vsphereVolume = vsphereVolume;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Volume {\n");
    
    sb.append("    awsElasticBlockStore: ").append(toIndentedString(awsElasticBlockStore)).append("\n");
    sb.append("    azureDisk: ").append(toIndentedString(azureDisk)).append("\n");
    sb.append("    azureFile: ").append(toIndentedString(azureFile)).append("\n");
    sb.append("    cephfs: ").append(toIndentedString(cephfs)).append("\n");
    sb.append("    cinder: ").append(toIndentedString(cinder)).append("\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    csi: ").append(toIndentedString(csi)).append("\n");
    sb.append("    downwardAPI: ").append(toIndentedString(downwardAPI)).append("\n");
    sb.append("    emptyDir: ").append(toIndentedString(emptyDir)).append("\n");
    sb.append("    fc: ").append(toIndentedString(fc)).append("\n");
    sb.append("    flexVolume: ").append(toIndentedString(flexVolume)).append("\n");
    sb.append("    flocker: ").append(toIndentedString(flocker)).append("\n");
    sb.append("    gcePersistentDisk: ").append(toIndentedString(gcePersistentDisk)).append("\n");
    sb.append("    gitRepo: ").append(toIndentedString(gitRepo)).append("\n");
    sb.append("    glusterfs: ").append(toIndentedString(glusterfs)).append("\n");
    sb.append("    hostPath: ").append(toIndentedString(hostPath)).append("\n");
    sb.append("    iscsi: ").append(toIndentedString(iscsi)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nfs: ").append(toIndentedString(nfs)).append("\n");
    sb.append("    persistentVolumeClaim: ").append(toIndentedString(persistentVolumeClaim)).append("\n");
    sb.append("    photonPersistentDisk: ").append(toIndentedString(photonPersistentDisk)).append("\n");
    sb.append("    portworxVolume: ").append(toIndentedString(portworxVolume)).append("\n");
    sb.append("    projected: ").append(toIndentedString(projected)).append("\n");
    sb.append("    quobyte: ").append(toIndentedString(quobyte)).append("\n");
    sb.append("    rbd: ").append(toIndentedString(rbd)).append("\n");
    sb.append("    scaleIO: ").append(toIndentedString(scaleIO)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    storageos: ").append(toIndentedString(storageos)).append("\n");
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

