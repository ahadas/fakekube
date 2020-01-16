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
  * A single application container that you want to run within a pod.
 **/
@ApiModel(description="A single application container that you want to run within a pod.")
public class IoK8sApiCoreV1Container  {
  
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

  @ApiModelProperty(value = "Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.")
 /**
   * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
  **/
  private String image = null;

  @ApiModelProperty(value = "Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images")
 /**
   * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
  **/
  private String imagePullPolicy = null;

  @ApiModelProperty(value = "Actions that the management system should take in response to container lifecycle events. Cannot be updated.")
  @Valid
 /**
   * Actions that the management system should take in response to container lifecycle events. Cannot be updated.
  **/
  private IoK8sApiCoreV1Lifecycle lifecycle = null;

  @ApiModelProperty(value = "Periodic probe of container liveness. Container will be restarted if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
  @Valid
 /**
   * Periodic probe of container liveness. Container will be restarted if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
  **/
  private IoK8sApiCoreV1Probe livenessProbe = null;

  @ApiModelProperty(required = true, value = "Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.")
 /**
   * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
  **/
  private String name = null;

  @ApiModelProperty(value = "List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default \"0.0.0.0\" address inside a container will be accessible from the network. Cannot be updated.")
  @Valid
 /**
   * List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default \"0.0.0.0\" address inside a container will be accessible from the network. Cannot be updated.
  **/
  private List<IoK8sApiCoreV1ContainerPort> ports = null;

  @ApiModelProperty(value = "Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
  @Valid
 /**
   * Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
  **/
  private IoK8sApiCoreV1Probe readinessProbe = null;

  @ApiModelProperty(value = "Compute Resources required by this container. Cannot be updated. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/")
  @Valid
 /**
   * Compute Resources required by this container. Cannot be updated. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
  **/
  private IoK8sApiCoreV1ResourceRequirements resources = null;

  @ApiModelProperty(value = "Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/")
  @Valid
 /**
   * Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
  **/
  private IoK8sApiCoreV1SecurityContext securityContext = null;

  @ApiModelProperty(value = "StartupProbe indicates that the Pod has successfully initialized. If specified, no other probes are executed until this completes successfully. If this probe fails, the Pod will be restarted, just as if the livenessProbe failed. This can be used to provide different probe parameters at the beginning of a Pod's lifecycle, when it might take a long time to load data or warm a cache, than during steady-state operation. This cannot be updated. This is a beta feature enabled by the StartupProbe feature flag. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
  @Valid
 /**
   * StartupProbe indicates that the Pod has successfully initialized. If specified, no other probes are executed until this completes successfully. If this probe fails, the Pod will be restarted, just as if the livenessProbe failed. This can be used to provide different probe parameters at the beginning of a Pod's lifecycle, when it might take a long time to load data or warm a cache, than during steady-state operation. This cannot be updated. This is a beta feature enabled by the StartupProbe feature flag. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
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

  public IoK8sApiCoreV1Container args(List<String> args) {
    this.args = args;
    return this;
  }

  public IoK8sApiCoreV1Container addArgsItem(String argsItem) {
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

  public IoK8sApiCoreV1Container command(List<String> command) {
    this.command = command;
    return this;
  }

  public IoK8sApiCoreV1Container addCommandItem(String commandItem) {
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

  public IoK8sApiCoreV1Container env(List<IoK8sApiCoreV1EnvVar> env) {
    this.env = env;
    return this;
  }

  public IoK8sApiCoreV1Container addEnvItem(IoK8sApiCoreV1EnvVar envItem) {
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

  public IoK8sApiCoreV1Container envFrom(List<IoK8sApiCoreV1EnvFromSource> envFrom) {
    this.envFrom = envFrom;
    return this;
  }

  public IoK8sApiCoreV1Container addEnvFromItem(IoK8sApiCoreV1EnvFromSource envFromItem) {
    this.envFrom.add(envFromItem);
    return this;
  }

 /**
   * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
   * @return image
  **/
  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public IoK8sApiCoreV1Container image(String image) {
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

  public IoK8sApiCoreV1Container imagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

 /**
   * Actions that the management system should take in response to container lifecycle events. Cannot be updated.
   * @return lifecycle
  **/
  @JsonProperty("lifecycle")
  public IoK8sApiCoreV1Lifecycle getLifecycle() {
    return lifecycle;
  }

  public void setLifecycle(IoK8sApiCoreV1Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
  }

  public IoK8sApiCoreV1Container lifecycle(IoK8sApiCoreV1Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

 /**
   * Periodic probe of container liveness. Container will be restarted if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * @return livenessProbe
  **/
  @JsonProperty("livenessProbe")
  public IoK8sApiCoreV1Probe getLivenessProbe() {
    return livenessProbe;
  }

  public void setLivenessProbe(IoK8sApiCoreV1Probe livenessProbe) {
    this.livenessProbe = livenessProbe;
  }

  public IoK8sApiCoreV1Container livenessProbe(IoK8sApiCoreV1Probe livenessProbe) {
    this.livenessProbe = livenessProbe;
    return this;
  }

 /**
   * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
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

  public IoK8sApiCoreV1Container name(String name) {
    this.name = name;
    return this;
  }

 /**
   * List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default \&quot;0.0.0.0\&quot; address inside a container will be accessible from the network. Cannot be updated.
   * @return ports
  **/
  @JsonProperty("ports")
  public List<IoK8sApiCoreV1ContainerPort> getPorts() {
    return ports;
  }

  public void setPorts(List<IoK8sApiCoreV1ContainerPort> ports) {
    this.ports = ports;
  }

  public IoK8sApiCoreV1Container ports(List<IoK8sApiCoreV1ContainerPort> ports) {
    this.ports = ports;
    return this;
  }

  public IoK8sApiCoreV1Container addPortsItem(IoK8sApiCoreV1ContainerPort portsItem) {
    this.ports.add(portsItem);
    return this;
  }

 /**
   * Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * @return readinessProbe
  **/
  @JsonProperty("readinessProbe")
  public IoK8sApiCoreV1Probe getReadinessProbe() {
    return readinessProbe;
  }

  public void setReadinessProbe(IoK8sApiCoreV1Probe readinessProbe) {
    this.readinessProbe = readinessProbe;
  }

  public IoK8sApiCoreV1Container readinessProbe(IoK8sApiCoreV1Probe readinessProbe) {
    this.readinessProbe = readinessProbe;
    return this;
  }

 /**
   * Compute Resources required by this container. Cannot be updated. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
   * @return resources
  **/
  @JsonProperty("resources")
  public IoK8sApiCoreV1ResourceRequirements getResources() {
    return resources;
  }

  public void setResources(IoK8sApiCoreV1ResourceRequirements resources) {
    this.resources = resources;
  }

  public IoK8sApiCoreV1Container resources(IoK8sApiCoreV1ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

 /**
   * Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
   * @return securityContext
  **/
  @JsonProperty("securityContext")
  public IoK8sApiCoreV1SecurityContext getSecurityContext() {
    return securityContext;
  }

  public void setSecurityContext(IoK8sApiCoreV1SecurityContext securityContext) {
    this.securityContext = securityContext;
  }

  public IoK8sApiCoreV1Container securityContext(IoK8sApiCoreV1SecurityContext securityContext) {
    this.securityContext = securityContext;
    return this;
  }

 /**
   * StartupProbe indicates that the Pod has successfully initialized. If specified, no other probes are executed until this completes successfully. If this probe fails, the Pod will be restarted, just as if the livenessProbe failed. This can be used to provide different probe parameters at the beginning of a Pod&#39;s lifecycle, when it might take a long time to load data or warm a cache, than during steady-state operation. This cannot be updated. This is a beta feature enabled by the StartupProbe feature flag. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * @return startupProbe
  **/
  @JsonProperty("startupProbe")
  public IoK8sApiCoreV1Probe getStartupProbe() {
    return startupProbe;
  }

  public void setStartupProbe(IoK8sApiCoreV1Probe startupProbe) {
    this.startupProbe = startupProbe;
  }

  public IoK8sApiCoreV1Container startupProbe(IoK8sApiCoreV1Probe startupProbe) {
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

  public IoK8sApiCoreV1Container stdin(Boolean stdin) {
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

  public IoK8sApiCoreV1Container stdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
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

  public IoK8sApiCoreV1Container terminationMessagePath(String terminationMessagePath) {
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

  public IoK8sApiCoreV1Container terminationMessagePolicy(String terminationMessagePolicy) {
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

  public IoK8sApiCoreV1Container tty(Boolean tty) {
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

  public IoK8sApiCoreV1Container volumeDevices(List<IoK8sApiCoreV1VolumeDevice> volumeDevices) {
    this.volumeDevices = volumeDevices;
    return this;
  }

  public IoK8sApiCoreV1Container addVolumeDevicesItem(IoK8sApiCoreV1VolumeDevice volumeDevicesItem) {
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

  public IoK8sApiCoreV1Container volumeMounts(List<IoK8sApiCoreV1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
    return this;
  }

  public IoK8sApiCoreV1Container addVolumeMountsItem(IoK8sApiCoreV1VolumeMount volumeMountsItem) {
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

  public IoK8sApiCoreV1Container workingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Container {\n");
    
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

