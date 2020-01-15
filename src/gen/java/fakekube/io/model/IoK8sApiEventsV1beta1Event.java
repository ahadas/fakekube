package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1EventSource;
import fakekube.io.model.IoK8sApiCoreV1ObjectReference;
import fakekube.io.model.IoK8sApiEventsV1beta1EventSeries;
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
  * Event is a report of an event somewhere in the cluster. It generally denotes some state change in the system.
 **/
@ApiModel(description="Event is a report of an event somewhere in the cluster. It generally denotes some state change in the system.")
public class IoK8sApiEventsV1beta1Event  {
  
  @ApiModelProperty(value = "What action was taken/failed regarding to the regarding object.")
 /**
   * What action was taken/failed regarding to the regarding object.
  **/
  private String action = null;

  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
 /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
  **/
  private String apiVersion = null;

  @ApiModelProperty(value = "Deprecated field assuring backward compatibility with core.v1 Event type")
 /**
   * Deprecated field assuring backward compatibility with core.v1 Event type
  **/
  private Integer deprecatedCount = null;

  @ApiModelProperty(value = "Deprecated field assuring backward compatibility with core.v1 Event type")
 /**
   * Deprecated field assuring backward compatibility with core.v1 Event type
  **/
  private String deprecatedFirstTimestamp = null;

  @ApiModelProperty(value = "Deprecated field assuring backward compatibility with core.v1 Event type")
 /**
   * Deprecated field assuring backward compatibility with core.v1 Event type
  **/
  private String deprecatedLastTimestamp = null;

  @ApiModelProperty(value = "Deprecated field assuring backward compatibility with core.v1 Event type")
  @Valid
 /**
   * Deprecated field assuring backward compatibility with core.v1 Event type
  **/
  private IoK8sApiCoreV1EventSource deprecatedSource = null;

  @ApiModelProperty(required = true, value = "Required. Time when this Event was first observed.")
 /**
   * Required. Time when this Event was first observed.
  **/
  private String eventTime = null;

  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
 /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
  **/
  private String kind = null;

  @ApiModelProperty(value = "")
  @Valid
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  @ApiModelProperty(value = "Optional. A human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.")
 /**
   * Optional. A human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
  **/
  private String note = null;

  @ApiModelProperty(value = "Why the action was taken.")
 /**
   * Why the action was taken.
  **/
  private String reason = null;

  @ApiModelProperty(value = "The object this Event is about. In most cases it's an Object reporting controller implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.")
  @Valid
 /**
   * The object this Event is about. In most cases it's an Object reporting controller implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
  **/
  private IoK8sApiCoreV1ObjectReference regarding = null;

  @ApiModelProperty(value = "Optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.")
  @Valid
 /**
   * Optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
  **/
  private IoK8sApiCoreV1ObjectReference related = null;

  @ApiModelProperty(value = "Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.")
 /**
   * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
  **/
  private String reportingController = null;

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
  private IoK8sApiEventsV1beta1EventSeries series = null;

  @ApiModelProperty(value = "Type of this event (Normal, Warning), new types could be added in the future.")
 /**
   * Type of this event (Normal, Warning), new types could be added in the future.
  **/
  private String type = null;
 /**
   * What action was taken/failed regarding to the regarding object.
   * @return action
  **/
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public IoK8sApiEventsV1beta1Event action(String action) {
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

  public IoK8sApiEventsV1beta1Event apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

 /**
   * Deprecated field assuring backward compatibility with core.v1 Event type
   * @return deprecatedCount
  **/
  @JsonProperty("deprecatedCount")
  public Integer getDeprecatedCount() {
    return deprecatedCount;
  }

  public void setDeprecatedCount(Integer deprecatedCount) {
    this.deprecatedCount = deprecatedCount;
  }

  public IoK8sApiEventsV1beta1Event deprecatedCount(Integer deprecatedCount) {
    this.deprecatedCount = deprecatedCount;
    return this;
  }

 /**
   * Deprecated field assuring backward compatibility with core.v1 Event type
   * @return deprecatedFirstTimestamp
  **/
  @JsonProperty("deprecatedFirstTimestamp")
  public String getDeprecatedFirstTimestamp() {
    return deprecatedFirstTimestamp;
  }

  public void setDeprecatedFirstTimestamp(String deprecatedFirstTimestamp) {
    this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
  }

  public IoK8sApiEventsV1beta1Event deprecatedFirstTimestamp(String deprecatedFirstTimestamp) {
    this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
    return this;
  }

 /**
   * Deprecated field assuring backward compatibility with core.v1 Event type
   * @return deprecatedLastTimestamp
  **/
  @JsonProperty("deprecatedLastTimestamp")
  public String getDeprecatedLastTimestamp() {
    return deprecatedLastTimestamp;
  }

  public void setDeprecatedLastTimestamp(String deprecatedLastTimestamp) {
    this.deprecatedLastTimestamp = deprecatedLastTimestamp;
  }

  public IoK8sApiEventsV1beta1Event deprecatedLastTimestamp(String deprecatedLastTimestamp) {
    this.deprecatedLastTimestamp = deprecatedLastTimestamp;
    return this;
  }

 /**
   * Deprecated field assuring backward compatibility with core.v1 Event type
   * @return deprecatedSource
  **/
  @JsonProperty("deprecatedSource")
  public IoK8sApiCoreV1EventSource getDeprecatedSource() {
    return deprecatedSource;
  }

  public void setDeprecatedSource(IoK8sApiCoreV1EventSource deprecatedSource) {
    this.deprecatedSource = deprecatedSource;
  }

  public IoK8sApiEventsV1beta1Event deprecatedSource(IoK8sApiCoreV1EventSource deprecatedSource) {
    this.deprecatedSource = deprecatedSource;
    return this;
  }

 /**
   * Required. Time when this Event was first observed.
   * @return eventTime
  **/
  @JsonProperty("eventTime")
  @NotNull
  public String getEventTime() {
    return eventTime;
  }

  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }

  public IoK8sApiEventsV1beta1Event eventTime(String eventTime) {
    this.eventTime = eventTime;
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

  public IoK8sApiEventsV1beta1Event kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * Get metadata
   * @return metadata
  **/
  @JsonProperty("metadata")
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public IoK8sApiEventsV1beta1Event metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * Optional. A human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
   * @return note
  **/
  @JsonProperty("note")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public IoK8sApiEventsV1beta1Event note(String note) {
    this.note = note;
    return this;
  }

 /**
   * Why the action was taken.
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sApiEventsV1beta1Event reason(String reason) {
    this.reason = reason;
    return this;
  }

 /**
   * The object this Event is about. In most cases it&#39;s an Object reporting controller implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
   * @return regarding
  **/
  @JsonProperty("regarding")
  public IoK8sApiCoreV1ObjectReference getRegarding() {
    return regarding;
  }

  public void setRegarding(IoK8sApiCoreV1ObjectReference regarding) {
    this.regarding = regarding;
  }

  public IoK8sApiEventsV1beta1Event regarding(IoK8sApiCoreV1ObjectReference regarding) {
    this.regarding = regarding;
    return this;
  }

 /**
   * Optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
   * @return related
  **/
  @JsonProperty("related")
  public IoK8sApiCoreV1ObjectReference getRelated() {
    return related;
  }

  public void setRelated(IoK8sApiCoreV1ObjectReference related) {
    this.related = related;
  }

  public IoK8sApiEventsV1beta1Event related(IoK8sApiCoreV1ObjectReference related) {
    this.related = related;
    return this;
  }

 /**
   * Name of the controller that emitted this Event, e.g. &#x60;kubernetes.io/kubelet&#x60;.
   * @return reportingController
  **/
  @JsonProperty("reportingController")
  public String getReportingController() {
    return reportingController;
  }

  public void setReportingController(String reportingController) {
    this.reportingController = reportingController;
  }

  public IoK8sApiEventsV1beta1Event reportingController(String reportingController) {
    this.reportingController = reportingController;
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

  public IoK8sApiEventsV1beta1Event reportingInstance(String reportingInstance) {
    this.reportingInstance = reportingInstance;
    return this;
  }

 /**
   * Data about the Event series this event represents or nil if it&#39;s a singleton Event.
   * @return series
  **/
  @JsonProperty("series")
  public IoK8sApiEventsV1beta1EventSeries getSeries() {
    return series;
  }

  public void setSeries(IoK8sApiEventsV1beta1EventSeries series) {
    this.series = series;
  }

  public IoK8sApiEventsV1beta1Event series(IoK8sApiEventsV1beta1EventSeries series) {
    this.series = series;
    return this;
  }

 /**
   * Type of this event (Normal, Warning), new types could be added in the future.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiEventsV1beta1Event type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiEventsV1beta1Event {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    deprecatedCount: ").append(toIndentedString(deprecatedCount)).append("\n");
    sb.append("    deprecatedFirstTimestamp: ").append(toIndentedString(deprecatedFirstTimestamp)).append("\n");
    sb.append("    deprecatedLastTimestamp: ").append(toIndentedString(deprecatedLastTimestamp)).append("\n");
    sb.append("    deprecatedSource: ").append(toIndentedString(deprecatedSource)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    regarding: ").append(toIndentedString(regarding)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    reportingController: ").append(toIndentedString(reportingController)).append("\n");
    sb.append("    reportingInstance: ").append(toIndentedString(reportingInstance)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
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

