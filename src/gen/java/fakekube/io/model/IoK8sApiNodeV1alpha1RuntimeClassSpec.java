package fakekube.io.model;

import fakekube.io.model.IoK8sApiNodeV1alpha1Overhead;
import fakekube.io.model.IoK8sApiNodeV1alpha1Scheduling;
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
  * RuntimeClassSpec is a specification of a RuntimeClass. It contains parameters that are required to describe the RuntimeClass to the Container Runtime Interface (CRI) implementation, as well as any other components that need to understand how the pod will be run. The RuntimeClassSpec is immutable.
 **/
@ApiModel(description="RuntimeClassSpec is a specification of a RuntimeClass. It contains parameters that are required to describe the RuntimeClass to the Container Runtime Interface (CRI) implementation, as well as any other components that need to understand how the pod will be run. The RuntimeClassSpec is immutable.")
public class IoK8sApiNodeV1alpha1RuntimeClassSpec  {
  
  @ApiModelProperty(value = "Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.")
  @Valid
 /**
   * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
  **/
  private IoK8sApiNodeV1alpha1Overhead overhead = null;

  @ApiModelProperty(required = true, value = "RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called \"runc\" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123) requirements and is immutable.")
 /**
   * RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called \"runc\" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123) requirements and is immutable.
  **/
  private String runtimeHandler = null;

  @ApiModelProperty(value = "Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.")
  @Valid
 /**
   * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
  **/
  private IoK8sApiNodeV1alpha1Scheduling scheduling = null;
 /**
   * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
   * @return overhead
  **/
  @JsonProperty("overhead")
  public IoK8sApiNodeV1alpha1Overhead getOverhead() {
    return overhead;
  }

  public void setOverhead(IoK8sApiNodeV1alpha1Overhead overhead) {
    this.overhead = overhead;
  }

  public IoK8sApiNodeV1alpha1RuntimeClassSpec overhead(IoK8sApiNodeV1alpha1Overhead overhead) {
    this.overhead = overhead;
    return this;
  }

 /**
   * RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called \&quot;runc\&quot; might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123) requirements and is immutable.
   * @return runtimeHandler
  **/
  @JsonProperty("runtimeHandler")
  @NotNull
  public String getRuntimeHandler() {
    return runtimeHandler;
  }

  public void setRuntimeHandler(String runtimeHandler) {
    this.runtimeHandler = runtimeHandler;
  }

  public IoK8sApiNodeV1alpha1RuntimeClassSpec runtimeHandler(String runtimeHandler) {
    this.runtimeHandler = runtimeHandler;
    return this;
  }

 /**
   * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
   * @return scheduling
  **/
  @JsonProperty("scheduling")
  public IoK8sApiNodeV1alpha1Scheduling getScheduling() {
    return scheduling;
  }

  public void setScheduling(IoK8sApiNodeV1alpha1Scheduling scheduling) {
    this.scheduling = scheduling;
  }

  public IoK8sApiNodeV1alpha1RuntimeClassSpec scheduling(IoK8sApiNodeV1alpha1Scheduling scheduling) {
    this.scheduling = scheduling;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiNodeV1alpha1RuntimeClassSpec {\n");
    
    sb.append("    overhead: ").append(toIndentedString(overhead)).append("\n");
    sb.append("    runtimeHandler: ").append(toIndentedString(runtimeHandler)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
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

