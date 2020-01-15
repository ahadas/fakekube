package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1EnvFromSource;
import fakekube.io.model.IoK8sApiCoreV1EnvVar;
import fakekube.io.model.IoK8sApiCoreV1Volume;
import fakekube.io.model.IoK8sApiCoreV1VolumeMount;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1LabelSelector;
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
  * PodPresetSpec is a description of a pod preset.
 **/
@ApiModel(description="PodPresetSpec is a description of a pod preset.")
public class IoK8sApiSettingsV1alpha1PodPresetSpec  {
  
  @ApiModelProperty(value = "Env defines the collection of EnvVar to inject into containers.")
  @Valid
 /**
   * Env defines the collection of EnvVar to inject into containers.
  **/
  private List<IoK8sApiCoreV1EnvVar> env = null;

  @ApiModelProperty(value = "EnvFrom defines the collection of EnvFromSource to inject into containers.")
  @Valid
 /**
   * EnvFrom defines the collection of EnvFromSource to inject into containers.
  **/
  private List<IoK8sApiCoreV1EnvFromSource> envFrom = null;

  @ApiModelProperty(value = "Selector is a label query over a set of resources, in this case pods. Required.")
  @Valid
 /**
   * Selector is a label query over a set of resources, in this case pods. Required.
  **/
  private IoK8sApimachineryPkgApisMetaV1LabelSelector selector = null;

  @ApiModelProperty(value = "VolumeMounts defines the collection of VolumeMount to inject into containers.")
  @Valid
 /**
   * VolumeMounts defines the collection of VolumeMount to inject into containers.
  **/
  private List<IoK8sApiCoreV1VolumeMount> volumeMounts = null;

  @ApiModelProperty(value = "Volumes defines the collection of Volume to inject into the pod.")
  @Valid
 /**
   * Volumes defines the collection of Volume to inject into the pod.
  **/
  private List<IoK8sApiCoreV1Volume> volumes = null;
 /**
   * Env defines the collection of EnvVar to inject into containers.
   * @return env
  **/
  @JsonProperty("env")
  public List<IoK8sApiCoreV1EnvVar> getEnv() {
    return env;
  }

  public void setEnv(List<IoK8sApiCoreV1EnvVar> env) {
    this.env = env;
  }

  public IoK8sApiSettingsV1alpha1PodPresetSpec env(List<IoK8sApiCoreV1EnvVar> env) {
    this.env = env;
    return this;
  }

  public IoK8sApiSettingsV1alpha1PodPresetSpec addEnvItem(IoK8sApiCoreV1EnvVar envItem) {
    this.env.add(envItem);
    return this;
  }

 /**
   * EnvFrom defines the collection of EnvFromSource to inject into containers.
   * @return envFrom
  **/
  @JsonProperty("envFrom")
  public List<IoK8sApiCoreV1EnvFromSource> getEnvFrom() {
    return envFrom;
  }

  public void setEnvFrom(List<IoK8sApiCoreV1EnvFromSource> envFrom) {
    this.envFrom = envFrom;
  }

  public IoK8sApiSettingsV1alpha1PodPresetSpec envFrom(List<IoK8sApiCoreV1EnvFromSource> envFrom) {
    this.envFrom = envFrom;
    return this;
  }

  public IoK8sApiSettingsV1alpha1PodPresetSpec addEnvFromItem(IoK8sApiCoreV1EnvFromSource envFromItem) {
    this.envFrom.add(envFromItem);
    return this;
  }

 /**
   * Selector is a label query over a set of resources, in this case pods. Required.
   * @return selector
  **/
  @JsonProperty("selector")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
  }

  public IoK8sApiSettingsV1alpha1PodPresetSpec selector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

 /**
   * VolumeMounts defines the collection of VolumeMount to inject into containers.
   * @return volumeMounts
  **/
  @JsonProperty("volumeMounts")
  public List<IoK8sApiCoreV1VolumeMount> getVolumeMounts() {
    return volumeMounts;
  }

  public void setVolumeMounts(List<IoK8sApiCoreV1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }

  public IoK8sApiSettingsV1alpha1PodPresetSpec volumeMounts(List<IoK8sApiCoreV1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
    return this;
  }

  public IoK8sApiSettingsV1alpha1PodPresetSpec addVolumeMountsItem(IoK8sApiCoreV1VolumeMount volumeMountsItem) {
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

 /**
   * Volumes defines the collection of Volume to inject into the pod.
   * @return volumes
  **/
  @JsonProperty("volumes")
  public List<IoK8sApiCoreV1Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<IoK8sApiCoreV1Volume> volumes) {
    this.volumes = volumes;
  }

  public IoK8sApiSettingsV1alpha1PodPresetSpec volumes(List<IoK8sApiCoreV1Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public IoK8sApiSettingsV1alpha1PodPresetSpec addVolumesItem(IoK8sApiCoreV1Volume volumesItem) {
    this.volumes.add(volumesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiSettingsV1alpha1PodPresetSpec {\n");
    
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    envFrom: ").append(toIndentedString(envFrom)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
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

