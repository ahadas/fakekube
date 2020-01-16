package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ContainerPort;
import fakekube.io.model.IoK8sApiCoreV1EnvFromSource;
import fakekube.io.model.IoK8sApiCoreV1EnvVar;
import fakekube.io.model.IoK8sApiCoreV1Lifecycle;
import fakekube.io.model.IoK8sApiCoreV1Probe;
import fakekube.io.model.IoK8sApiCoreV1ResourceRequirements;
import fakekube.io.model.IoK8sApiCoreV1SecurityContext;
import fakekube.io.model.IoK8sApiCoreV1VolumeDevice;
import fakekube.io.model.IoK8sApiCoreV1VolumeMount;
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
  * An EphemeralContainer is a container that may be added temporarily to an existing pod for user-initiated activities such as debugging. Ephemeral containers have no resource or scheduling guarantees, and they will not be restarted when they exit or when a pod is removed or restarted. If an ephemeral container causes a pod to exceed its resource allocation, the pod may be evicted. Ephemeral containers may not be added by directly updating the pod spec. They must be added via the pod's ephemeralcontainers subresource, and they will appear in the pod spec once added. This is an alpha feature enabled by the EphemeralContainers feature flag.
 **/
@ApiModel(description="An EphemeralContainer is a container that may be added temporarily to an existing pod for user-initiated activities such as debugging. Ephemeral containers have no resource or scheduling guarantees, and they will not be restarted when they exit or when a pod is removed or restarted. If an ephemeral container causes a pod to exceed its resource allocation, the pod may be evicted. Ephemeral containers may not be added by directly updating the pod spec. They must be added via the pod's ephemeralcontainers subresource, and they will appear in the pod spec once added. This is an alpha feature enabled by the EphemeralContainers feature flag.")
public class IoK8sApiCoreV1EphemeralContainer  {
  
  @ApiModelProperty(value = "Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
 /**
   * Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
  **/
  private List<String> args = null;

  @ApiModelProperty(value = "Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
 /**
   * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
  **/
  private List<String> command = null;

  @ApiModelProperty(value = "List of environment variables to set in the container. Cannot be updated.")
  @Valid
 /**
   * List of environment variables to set in the container. Cannot be updated.
  **/
  private List<IoK8sApiCoreV1EnvVar> env = null;

  @ApiModelProperty(value = "List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.")
  @Valid
 /**
   * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
  **/
  private List<IoK8sApiCoreV1EnvFromSource> envFrom = null;

  @ApiModelProperty(value = "Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images")
 /**
   * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images
  **/
  private String image = null;

  @ApiModelProperty(value = "Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images")
 /**
   * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
  **/
  private String imagePullPolicy = null;

  @ApiModelProperty(value = "Lifecycle is not allowed for ephemeral containers.")
  @Valid
 /**
   * Lifecycle is not allowed for ephemeral containers.
  **/
  private IoK8sApiCoreV1Lifecycle lifecycle = null;

  @ApiModelProperty(value = "Probes are not allowed for ephemeral containers.")
  @Valid
 /**
   * Probes are not allowed for ephemeral containers.
  **/
  private IoK8sApiCoreV1Probe livenessProbe = null;

  @ApiModelProperty(required = true, value = "Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers and ephemeral containers.")
 /**
   * Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers and ephemeral containers.
  **/
  private String name = null;

  @ApiModelProperty(value = "Ports are not allowed for ephemeral containers.")
  @Valid
 /**
   * Ports are not allowed for ephemeral containers.
  **/
  private List<IoK8sApiCoreV1ContainerPort> ports = null;

  @ApiModelProperty(value = "Probes are not allowed for ephemeral containers.")
  @Valid
 /**
   * Probes are not allowed for ephemeral containers.
  **/
  private IoK8sApiCoreV1Probe readinessProbe = null;

  @ApiModelProperty(value = "Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod.")
  @Valid
 /**
   * Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod.
  **/
  private IoK8sApiCoreV1ResourceRequirements resources = null;

  @ApiModelProperty(value = "SecurityContext is not allowed for ephemeral containers.")
  @Valid
 /**
   * SecurityContext is not allowed for ephemeral containers.
  **/
  private IoK8sApiCoreV1SecurityContext securityContext = null;

  @ApiModelProperty(value = "Probes are not allowed for ephemeral containers.")
  @Valid
 /**
   * Probes are not allowed for ephemeral containers.
  **/
  private IoK8sApiCoreV1Probe startupProbe = null;

  @ApiModelProperty(value = "Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.")
 /**
   * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
  **/
  private Boolean stdin = null;

  @ApiModelProperty(value = "Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false")
 /**
   * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
  **/
  private Boolean stdinOnce = null;

  @ApiModelProperty(value = "If set, the name of the container from PodSpec that this ephemeral container targets. The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container is run in whatever namespaces are shared for the pod. Note that the container runtime must support this feature.")
 /**
   * If set, the name of the container from PodSpec that this ephemeral container targets. The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container is run in whatever namespaces are shared for the pod. Note that the container runtime must support this feature.
  **/
  private String targetContainerName = null;

  @ApiModelProperty(value = "Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.")
 /**
   * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
  **/
  private String terminationMessagePath = null;

  @ApiModelProperty(value = "Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.")
 /**
   * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
  **/
  private String terminationMessagePolicy = null;

  @ApiModelProperty(value = "Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.")
 /**
   * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
  **/
  private Boolean tty = null;

  @ApiModelProperty(value = "volumeDevices is the list of block devices to be used by the container. This is a beta feature.")
  @Valid
 /**
   * volumeDevices is the list of block devices to be used by the container. This is a beta feature.
  **/
  private List<IoK8sApiCoreV1VolumeDevice> volumeDevices = null;

  @ApiModelProperty(value = "Pod volumes to mount into the container's filesystem. Cannot be updated.")
  @Valid
 /**
   * Pod volumes to mount into the container's filesystem. Cannot be updated.
  **/
  private List<IoK8sApiCoreV1VolumeMount> volumeMounts = null;

  @ApiModelProperty(value = "Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.")
 /**
   * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
  **/
  private String workingDir = null;
 /**
   * Arguments to the entrypoint. The docker image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   * @return args
  **/
  @JsonProperty("args")
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public IoK8sApiCoreV1EphemeralContainer args(List<String> args) {
    this.args = args;
    return this;
  }

  public IoK8sApiCoreV1EphemeralContainer addArgsItem(String argsItem) {
    this.args.add(argsItem);
    return this;
  }

 /**
   * Entrypoint array. Not executed within a shell. The docker image&#39;s ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   * @return command
  **/
  @JsonProperty("command")
  public List<String> getCommand() {
    return command;
  }

  public void setCommand(List<String> command) {
    this.command = command;
  }

  public IoK8sApiCoreV1EphemeralContainer command(List<String> command) {
    this.command = command;
    return this;
  }

  public IoK8sApiCoreV1EphemeralContainer addCommandItem(String commandItem) {
    this.command.add(commandItem);
    return this;
  }

 /**
   * List of environment variables to set in the container. Cannot be updated.
   * @return env
  **/
  @JsonProperty("env")
  public List<IoK8sApiCoreV1EnvVar> getEnv() {
    return env;
  }

  public void setEnv(List<IoK8sApiCoreV1EnvVar> env) {
    this.env = env;
  }

  public IoK8sApiCoreV1EphemeralContainer env(List<IoK8sApiCoreV1EnvVar> env) {
    this.env = env;
    return this;
  }

  public IoK8sApiCoreV1EphemeralContainer addEnvItem(IoK8sApiCoreV1EnvVar envItem) {
    this.env.add(envItem);
    return this;
  }

 /**
   * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
   * @return envFrom
  **/
  @JsonProperty("envFrom")
  public List<IoK8sApiCoreV1EnvFromSource> getEnvFrom() {
    return envFrom;
  }

  public void setEnvFrom(List<IoK8sApiCoreV1EnvFromSource> envFrom) {
    this.envFrom = envFrom;
  }

  public IoK8sApiCoreV1EphemeralContainer envFrom(List<IoK8sApiCoreV1EnvFromSource> envFrom) {
    this.envFrom = envFrom;
    return this;
  }

  public IoK8sApiCoreV1EphemeralContainer addEnvFromItem(IoK8sApiCoreV1EnvFromSource envFromItem) {
    this.envFrom.add(envFromItem);
    return this;
  }

 /**
   * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images
   * @return image
  **/
  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public IoK8sApiCoreV1EphemeralContainer image(String image) {
    this.image = image;
    return this;
  }

 /**
   * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
   * @return imagePullPolicy
  **/
  @JsonProperty("imagePullPolicy")
  public String getImagePullPolicy() {
    return imagePullPolicy;
  }

  public void setImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }

  public IoK8sApiCoreV1EphemeralContainer imagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

 /**
   * Lifecycle is not allowed for ephemeral containers.
   * @return lifecycle
  **/
  @JsonProperty("lifecycle")
  public IoK8sApiCoreV1Lifecycle getLifecycle() {
    return lifecycle;
  }

  public void setLifecycle(IoK8sApiCoreV1Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
  }

  public IoK8sApiCoreV1EphemeralContainer lifecycle(IoK8sApiCoreV1Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

 /**
   * Probes are not allowed for ephemeral containers.
   * @return livenessProbe
  **/
  @JsonProperty("livenessProbe")
  public IoK8sApiCoreV1Probe getLivenessProbe() {
    return livenessProbe;
  }

  public void setLivenessProbe(IoK8sApiCoreV1Probe livenessProbe) {
    this.livenessProbe = livenessProbe;
  }

  public IoK8sApiCoreV1EphemeralContainer livenessProbe(IoK8sApiCoreV1Probe livenessProbe) {
    this.livenessProbe = livenessProbe;
    return this;
  }

 /**
   * Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers and ephemeral containers.
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

  public IoK8sApiCoreV1EphemeralContainer name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Ports are not allowed for ephemeral containers.
   * @return ports
  **/
  @JsonProperty("ports")
  public List<IoK8sApiCoreV1ContainerPort> getPorts() {
    return ports;
  }

  public void setPorts(List<IoK8sApiCoreV1ContainerPort> ports) {
    this.ports = ports;
  }

  public IoK8sApiCoreV1EphemeralContainer ports(List<IoK8sApiCoreV1ContainerPort> ports) {
    this.ports = ports;
    return this;
  }

  public IoK8sApiCoreV1EphemeralContainer addPortsItem(IoK8sApiCoreV1ContainerPort portsItem) {
    this.ports.add(portsItem);
    return this;
  }

 /**
   * Probes are not allowed for ephemeral containers.
   * @return readinessProbe
  **/
  @JsonProperty("readinessProbe")
  public IoK8sApiCoreV1Probe getReadinessProbe() {
    return readinessProbe;
  }

  public void setReadinessProbe(IoK8sApiCoreV1Probe readinessProbe) {
    this.readinessProbe = readinessProbe;
  }

  public IoK8sApiCoreV1EphemeralContainer readinessProbe(IoK8sApiCoreV1Probe readinessProbe) {
    this.readinessProbe = readinessProbe;
    return this;
  }

 /**
   * Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod.
   * @return resources
  **/
  @JsonProperty("resources")
  public IoK8sApiCoreV1ResourceRequirements getResources() {
    return resources;
  }

  public void setResources(IoK8sApiCoreV1ResourceRequirements resources) {
    this.resources = resources;
  }

  public IoK8sApiCoreV1EphemeralContainer resources(IoK8sApiCoreV1ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

 /**
   * SecurityContext is not allowed for ephemeral containers.
   * @return securityContext
  **/
  @JsonProperty("securityContext")
  public IoK8sApiCoreV1SecurityContext getSecurityContext() {
    return securityContext;
  }

  public void setSecurityContext(IoK8sApiCoreV1SecurityContext securityContext) {
    this.securityContext = securityContext;
  }

  public IoK8sApiCoreV1EphemeralContainer securityContext(IoK8sApiCoreV1SecurityContext securityContext) {
    this.securityContext = securityContext;
    return this;
  }

 /**
   * Probes are not allowed for ephemeral containers.
   * @return startupProbe
  **/
  @JsonProperty("startupProbe")
  public IoK8sApiCoreV1Probe getStartupProbe() {
    return startupProbe;
  }

  public void setStartupProbe(IoK8sApiCoreV1Probe startupProbe) {
    this.startupProbe = startupProbe;
  }

  public IoK8sApiCoreV1EphemeralContainer startupProbe(IoK8sApiCoreV1Probe startupProbe) {
    this.startupProbe = startupProbe;
    return this;
  }

 /**
   * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
   * @return stdin
  **/
  @JsonProperty("stdin")
  public Boolean getStdin() {
    return stdin;
  }

  public void setStdin(Boolean stdin) {
    this.stdin = stdin;
  }

  public IoK8sApiCoreV1EphemeralContainer stdin(Boolean stdin) {
    this.stdin = stdin;
    return this;
  }

 /**
   * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
   * @return stdinOnce
  **/
  @JsonProperty("stdinOnce")
  public Boolean getStdinOnce() {
    return stdinOnce;
  }

  public void setStdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
  }

  public IoK8sApiCoreV1EphemeralContainer stdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
    return this;
  }

 /**
   * If set, the name of the container from PodSpec that this ephemeral container targets. The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container is run in whatever namespaces are shared for the pod. Note that the container runtime must support this feature.
   * @return targetContainerName
  **/
  @JsonProperty("targetContainerName")
  public String getTargetContainerName() {
    return targetContainerName;
  }

  public void setTargetContainerName(String targetContainerName) {
    this.targetContainerName = targetContainerName;
  }

  public IoK8sApiCoreV1EphemeralContainer targetContainerName(String targetContainerName) {
    this.targetContainerName = targetContainerName;
    return this;
  }

 /**
   * Optional: Path at which the file to which the container&#39;s termination message will be written is mounted into the container&#39;s filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
   * @return terminationMessagePath
  **/
  @JsonProperty("terminationMessagePath")
  public String getTerminationMessagePath() {
    return terminationMessagePath;
  }

  public void setTerminationMessagePath(String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
  }

  public IoK8sApiCoreV1EphemeralContainer terminationMessagePath(String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
    return this;
  }

 /**
   * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
   * @return terminationMessagePolicy
  **/
  @JsonProperty("terminationMessagePolicy")
  public String getTerminationMessagePolicy() {
    return terminationMessagePolicy;
  }

  public void setTerminationMessagePolicy(String terminationMessagePolicy) {
    this.terminationMessagePolicy = terminationMessagePolicy;
  }

  public IoK8sApiCoreV1EphemeralContainer terminationMessagePolicy(String terminationMessagePolicy) {
    this.terminationMessagePolicy = terminationMessagePolicy;
    return this;
  }

 /**
   * Whether this container should allocate a TTY for itself, also requires &#39;stdin&#39; to be true. Default is false.
   * @return tty
  **/
  @JsonProperty("tty")
  public Boolean getTty() {
    return tty;
  }

  public void setTty(Boolean tty) {
    this.tty = tty;
  }

  public IoK8sApiCoreV1EphemeralContainer tty(Boolean tty) {
    this.tty = tty;
    return this;
  }

 /**
   * volumeDevices is the list of block devices to be used by the container. This is a beta feature.
   * @return volumeDevices
  **/
  @JsonProperty("volumeDevices")
  public List<IoK8sApiCoreV1VolumeDevice> getVolumeDevices() {
    return volumeDevices;
  }

  public void setVolumeDevices(List<IoK8sApiCoreV1VolumeDevice> volumeDevices) {
    this.volumeDevices = volumeDevices;
  }

  public IoK8sApiCoreV1EphemeralContainer volumeDevices(List<IoK8sApiCoreV1VolumeDevice> volumeDevices) {
    this.volumeDevices = volumeDevices;
    return this;
  }

  public IoK8sApiCoreV1EphemeralContainer addVolumeDevicesItem(IoK8sApiCoreV1VolumeDevice volumeDevicesItem) {
    this.volumeDevices.add(volumeDevicesItem);
    return this;
  }

 /**
   * Pod volumes to mount into the container&#39;s filesystem. Cannot be updated.
   * @return volumeMounts
  **/
  @JsonProperty("volumeMounts")
  public List<IoK8sApiCoreV1VolumeMount> getVolumeMounts() {
    return volumeMounts;
  }

  public void setVolumeMounts(List<IoK8sApiCoreV1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }

  public IoK8sApiCoreV1EphemeralContainer volumeMounts(List<IoK8sApiCoreV1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
    return this;
  }

  public IoK8sApiCoreV1EphemeralContainer addVolumeMountsItem(IoK8sApiCoreV1VolumeMount volumeMountsItem) {
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

 /**
   * Container&#39;s working directory. If not specified, the container runtime&#39;s default will be used, which might be configured in the container image. Cannot be updated.
   * @return workingDir
  **/
  @JsonProperty("workingDir")
  public String getWorkingDir() {
    return workingDir;
  }

  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  }

  public IoK8sApiCoreV1EphemeralContainer workingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1EphemeralContainer {\n");
    
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    envFrom: ").append(toIndentedString(envFrom)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    startupProbe: ").append(toIndentedString(startupProbe)).append("\n");
    sb.append("    stdin: ").append(toIndentedString(stdin)).append("\n");
    sb.append("    stdinOnce: ").append(toIndentedString(stdinOnce)).append("\n");
    sb.append("    targetContainerName: ").append(toIndentedString(targetContainerName)).append("\n");
    sb.append("    terminationMessagePath: ").append(toIndentedString(terminationMessagePath)).append("\n");
    sb.append("    terminationMessagePolicy: ").append(toIndentedString(terminationMessagePolicy)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
    sb.append("    volumeDevices: ").append(toIndentedString(volumeDevices)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
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

