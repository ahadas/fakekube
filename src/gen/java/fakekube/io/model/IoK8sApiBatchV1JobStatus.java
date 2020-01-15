package fakekube.io.model;

import fakekube.io.model.IoK8sApiBatchV1JobCondition;
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
  * JobStatus represents the current state of a Job.
 **/
@ApiModel(description="JobStatus represents the current state of a Job.")
public class IoK8sApiBatchV1JobStatus  {
  
  @ApiModelProperty(value = "The number of actively running pods.")
 /**
   * The number of actively running pods.
  **/
  private Integer active = null;

  @ApiModelProperty(value = "Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.")
 /**
   * Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
  **/
  private String completionTime = null;

  @ApiModelProperty(value = "The latest available observations of an object's current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/")
  @Valid
 /**
   * The latest available observations of an object's current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
  **/
  private List<IoK8sApiBatchV1JobCondition> conditions = null;

  @ApiModelProperty(value = "The number of pods which reached phase Failed.")
 /**
   * The number of pods which reached phase Failed.
  **/
  private Integer failed = null;

  @ApiModelProperty(value = "Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.")
 /**
   * Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
  **/
  private String startTime = null;

  @ApiModelProperty(value = "The number of pods which reached phase Succeeded.")
 /**
   * The number of pods which reached phase Succeeded.
  **/
  private Integer succeeded = null;
 /**
   * The number of actively running pods.
   * @return active
  **/
  @JsonProperty("active")
  public Integer getActive() {
    return active;
  }

  public void setActive(Integer active) {
    this.active = active;
  }

  public IoK8sApiBatchV1JobStatus active(Integer active) {
    this.active = active;
    return this;
  }

 /**
   * Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
   * @return completionTime
  **/
  @JsonProperty("completionTime")
  public String getCompletionTime() {
    return completionTime;
  }

  public void setCompletionTime(String completionTime) {
    this.completionTime = completionTime;
  }

  public IoK8sApiBatchV1JobStatus completionTime(String completionTime) {
    this.completionTime = completionTime;
    return this;
  }

 /**
   * The latest available observations of an object&#39;s current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   * @return conditions
  **/
  @JsonProperty("conditions")
  public List<IoK8sApiBatchV1JobCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sApiBatchV1JobCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sApiBatchV1JobStatus conditions(List<IoK8sApiBatchV1JobCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sApiBatchV1JobStatus addConditionsItem(IoK8sApiBatchV1JobCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

 /**
   * The number of pods which reached phase Failed.
   * @return failed
  **/
  @JsonProperty("failed")
  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public IoK8sApiBatchV1JobStatus failed(Integer failed) {
    this.failed = failed;
    return this;
  }

 /**
   * Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
   * @return startTime
  **/
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public IoK8sApiBatchV1JobStatus startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
   * The number of pods which reached phase Succeeded.
   * @return succeeded
  **/
  @JsonProperty("succeeded")
  public Integer getSucceeded() {
    return succeeded;
  }

  public void setSucceeded(Integer succeeded) {
    this.succeeded = succeeded;
  }

  public IoK8sApiBatchV1JobStatus succeeded(Integer succeeded) {
    this.succeeded = succeeded;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiBatchV1JobStatus {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
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

