package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1EventSeries;
import fakekube.io.model.IoK8sApiCoreV1EventSource;
import fakekube.io.model.IoK8sApiCoreV1ObjectReference;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1ObjectMeta;
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
  * Event is a report of an event somewhere in the cluster.
 **/
@ApiModel(description="Event is a report of an event somewhere in the cluster.")
public class IoK8sApiCoreV1Event  {
  
  @ApiModelProperty(value = "What action was taken/failed regarding to the Regarding object.")
 /**
   * What action was taken/failed regarding to the Regarding object.
  **/
  private String action = null;

  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
 /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
  **/
  private String apiVersion = null;

  @ApiModelProperty(value = "The number of times this event has occurred.")
 /**
   * The number of times this event has occurred.
  **/
  private Integer count = null;

  @ApiModelProperty(value = "Time when this Event was first observed.")
 /**
   * Time when this Event was first observed.
  **/
  private String eventTime = null;

  @ApiModelProperty(value = "The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)")
 /**
   * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
  **/
  private String firstTimestamp = null;

  @ApiModelProperty(required = true, value = "The object that this event is about.")
  @Valid
 /**
   * The object that this event is about.
  **/
  private IoK8sApiCoreV1ObjectReference involvedObject = null;

  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
 /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
  **/
  private String kind = null;

  @ApiModelProperty(value = "The time at which the most recent occurrence of this event was recorded.")
 /**
   * The time at which the most recent occurrence of this event was recorded.
  **/
  private String lastTimestamp = null;

  @ApiModelProperty(value = "A human-readable description of the status of this operation.")
 /**
   * A human-readable description of the status of this operation.
  **/
  private String message = null;

  @ApiModelProperty(required = true, value = "Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata")
  @Valid
 /**
   * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
  **/
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  @ApiModelProperty(value = "This should be a short, machine understandable string that gives the reason for the transition into the object's current status.")
 /**
   * This should be a short, machine understandable string that gives the reason for the transition into the object's current status.
  **/
  private String reason = null;

  @ApiModelProperty(value = "Optional secondary object for more complex actions.")
  @Valid
 /**
   * Optional secondary object for more complex actions.
  **/
  private IoK8sApiCoreV1ObjectReference related = null;

  @ApiModelProperty(value = "Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.")
 /**
   * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
  **/
  private String reportingComponent = null;

  @ApiModelProperty(value = "ID of the controller instance, e.g. `kubelet-xyzf`.")
 /**
   * ID of the controller instance, e.g. `kubelet-xyzf`.
  **/
  private String reportingInstance = null;

  @ApiModelProperty(value = "Data about the Event series this event represents or nil if it's a singleton Event.")
  @Valid
 /**
   * Data about the Event series this event represents or nil if it's a singleton Event.
  **/
  private IoK8sApiCoreV1EventSeries series = null;

  @ApiModelProperty(value = "The component reporting this event. Should be a short machine understandable string.")
  @Valid
 /**
   * The component reporting this event. Should be a short machine understandable string.
  **/
  private IoK8sApiCoreV1EventSource source = null;

  @ApiModelProperty(value = "Type of this event (Normal, Warning), new types could be added in the future")
 /**
   * Type of this event (Normal, Warning), new types could be added in the future
  **/
  private String type = null;
 /**
   * What action was taken/failed regarding to the Regarding object.
   * @return action
  **/
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public IoK8sApiCoreV1Event action(String action) {
    this.action = action;
    return this;
  }

 /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public IoK8sApiCoreV1Event apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

 /**
   * The number of times this event has occurred.
   * @return count
  **/
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public IoK8sApiCoreV1Event count(Integer count) {
    this.count = count;
    return this;
  }

 /**
   * Time when this Event was first observed.
   * @return eventTime
  **/
  @JsonProperty("eventTime")
  public String getEventTime() {
    return eventTime;
  }

  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }

  public IoK8sApiCoreV1Event eventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

 /**
   * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
   * @return firstTimestamp
  **/
  @JsonProperty("firstTimestamp")
  public String getFirstTimestamp() {
    return firstTimestamp;
  }

  public void setFirstTimestamp(String firstTimestamp) {
    this.firstTimestamp = firstTimestamp;
  }

  public IoK8sApiCoreV1Event firstTimestamp(String firstTimestamp) {
    this.firstTimestamp = firstTimestamp;
    return this;
  }

 /**
   * The object that this event is about.
   * @return involvedObject
  **/
  @JsonProperty("involvedObject")
  @NotNull
  public IoK8sApiCoreV1ObjectReference getInvolvedObject() {
    return involvedObject;
  }

  public void setInvolvedObject(IoK8sApiCoreV1ObjectReference involvedObject) {
    this.involvedObject = involvedObject;
  }

  public IoK8sApiCoreV1Event involvedObject(IoK8sApiCoreV1ObjectReference involvedObject) {
    this.involvedObject = involvedObject;
    return this;
  }

 /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoK8sApiCoreV1Event kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * The time at which the most recent occurrence of this event was recorded.
   * @return lastTimestamp
  **/
  @JsonProperty("lastTimestamp")
  public String getLastTimestamp() {
    return lastTimestamp;
  }

  public void setLastTimestamp(String lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
  }

  public IoK8sApiCoreV1Event lastTimestamp(String lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
    return this;
  }

 /**
   * A human-readable description of the status of this operation.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApiCoreV1Event message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
   * @return metadata
  **/
  @JsonProperty("metadata")
  @NotNull
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public IoK8sApiCoreV1Event metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * This should be a short, machine understandable string that gives the reason for the transition into the object&#39;s current status.
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sApiCoreV1Event reason(String reason) {
    this.reason = reason;
    return this;
  }

 /**
   * Optional secondary object for more complex actions.
   * @return related
  **/
  @JsonProperty("related")
  public IoK8sApiCoreV1ObjectReference getRelated() {
    return related;
  }

  public void setRelated(IoK8sApiCoreV1ObjectReference related) {
    this.related = related;
  }

  public IoK8sApiCoreV1Event related(IoK8sApiCoreV1ObjectReference related) {
    this.related = related;
    return this;
  }

 /**
   * Name of the controller that emitted this Event, e.g. &#x60;kubernetes.io/kubelet&#x60;.
   * @return reportingComponent
  **/
  @JsonProperty("reportingComponent")
  public String getReportingComponent() {
    return reportingComponent;
  }

  public void setReportingComponent(String reportingComponent) {
    this.reportingComponent = reportingComponent;
  }

  public IoK8sApiCoreV1Event reportingComponent(String reportingComponent) {
    this.reportingComponent = reportingComponent;
    return this;
  }

 /**
   * ID of the controller instance, e.g. &#x60;kubelet-xyzf&#x60;.
   * @return reportingInstance
  **/
  @JsonProperty("reportingInstance")
  public String getReportingInstance() {
    return reportingInstance;
  }

  public void setReportingInstance(String reportingInstance) {
    this.reportingInstance = reportingInstance;
  }

  public IoK8sApiCoreV1Event reportingInstance(String reportingInstance) {
    this.reportingInstance = reportingInstance;
    return this;
  }

 /**
   * Data about the Event series this event represents or nil if it&#39;s a singleton Event.
   * @return series
  **/
  @JsonProperty("series")
  public IoK8sApiCoreV1EventSeries getSeries() {
    return series;
  }

  public void setSeries(IoK8sApiCoreV1EventSeries series) {
    this.series = series;
  }

  public IoK8sApiCoreV1Event series(IoK8sApiCoreV1EventSeries series) {
    this.series = series;
    return this;
  }

 /**
   * The component reporting this event. Should be a short machine understandable string.
   * @return source
  **/
  @JsonProperty("source")
  public IoK8sApiCoreV1EventSource getSource() {
    return source;
  }

  public void setSource(IoK8sApiCoreV1EventSource source) {
    this.source = source;
  }

  public IoK8sApiCoreV1Event source(IoK8sApiCoreV1EventSource source) {
    this.source = source;
    return this;
  }

 /**
   * Type of this event (Normal, Warning), new types could be added in the future
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiCoreV1Event type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Event {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    firstTimestamp: ").append(toIndentedString(firstTimestamp)).append("\n");
    sb.append("    involvedObject: ").append(toIndentedString(involvedObject)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    lastTimestamp: ").append(toIndentedString(lastTimestamp)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    reportingComponent: ").append(toIndentedString(reportingComponent)).append("\n");
    sb.append("    reportingInstance: ").append(toIndentedString(reportingInstance)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

