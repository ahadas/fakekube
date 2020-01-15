package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ObjectReference;
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
  * CronJobStatus represents the current state of a cron job.
 **/
@ApiModel(description="CronJobStatus represents the current state of a cron job.")
public class IoK8sApiBatchV2alpha1CronJobStatus  {
  
  @ApiModelProperty(value = "A list of pointers to currently running jobs.")
  @Valid
 /**
   * A list of pointers to currently running jobs.
  **/
  private List<IoK8sApiCoreV1ObjectReference> active = null;

  @ApiModelProperty(value = "Information when was the last time the job was successfully scheduled.")
 /**
   * Information when was the last time the job was successfully scheduled.
  **/
  private String lastScheduleTime = null;
 /**
   * A list of pointers to currently running jobs.
   * @return active
  **/
  @JsonProperty("active")
  public List<IoK8sApiCoreV1ObjectReference> getActive() {
    return active;
  }

  public void setActive(List<IoK8sApiCoreV1ObjectReference> active) {
    this.active = active;
  }

  public IoK8sApiBatchV2alpha1CronJobStatus active(List<IoK8sApiCoreV1ObjectReference> active) {
    this.active = active;
    return this;
  }

  public IoK8sApiBatchV2alpha1CronJobStatus addActiveItem(IoK8sApiCoreV1ObjectReference activeItem) {
    this.active.add(activeItem);
    return this;
  }

 /**
   * Information when was the last time the job was successfully scheduled.
   * @return lastScheduleTime
  **/
  @JsonProperty("lastScheduleTime")
  public String getLastScheduleTime() {
    return lastScheduleTime;
  }

  public void setLastScheduleTime(String lastScheduleTime) {
    this.lastScheduleTime = lastScheduleTime;
  }

  public IoK8sApiBatchV2alpha1CronJobStatus lastScheduleTime(String lastScheduleTime) {
    this.lastScheduleTime = lastScheduleTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiBatchV2alpha1CronJobStatus {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    lastScheduleTime: ").append(toIndentedString(lastScheduleTime)).append("\n");
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

