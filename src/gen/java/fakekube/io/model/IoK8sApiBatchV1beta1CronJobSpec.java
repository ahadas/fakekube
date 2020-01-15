package fakekube.io.model;

import fakekube.io.model.IoK8sApiBatchV1beta1JobTemplateSpec;
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
  * CronJobSpec describes how the job execution will look like and when it will actually run.
 **/
@ApiModel(description="CronJobSpec describes how the job execution will look like and when it will actually run.")
public class IoK8sApiBatchV1beta1CronJobSpec  {
  
  @ApiModelProperty(value = "Specifies how to treat concurrent executions of a Job. Valid values are: - \"Allow\" (default): allows CronJobs to run concurrently; - \"Forbid\": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - \"Replace\": cancels currently running job and replaces it with a new one")
 /**
   * Specifies how to treat concurrent executions of a Job. Valid values are: - \"Allow\" (default): allows CronJobs to run concurrently; - \"Forbid\": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - \"Replace\": cancels currently running job and replaces it with a new one
  **/
  private String concurrencyPolicy = null;

  @ApiModelProperty(value = "The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.")
 /**
   * The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
  **/
  private Integer failedJobsHistoryLimit = null;

  @ApiModelProperty(required = true, value = "Specifies the job that will be created when executing a CronJob.")
  @Valid
 /**
   * Specifies the job that will be created when executing a CronJob.
  **/
  private IoK8sApiBatchV1beta1JobTemplateSpec jobTemplate = null;

  @ApiModelProperty(required = true, value = "The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.")
 /**
   * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
  **/
  private String schedule = null;

  @ApiModelProperty(value = "Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.")
 /**
   * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
  **/
  private Long startingDeadlineSeconds = null;

  @ApiModelProperty(value = "The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.")
 /**
   * The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
  **/
  private Integer successfulJobsHistoryLimit = null;

  @ApiModelProperty(value = "This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.")
 /**
   * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
  **/
  private Boolean suspend = null;
 /**
   * Specifies how to treat concurrent executions of a Job. Valid values are: - \&quot;Allow\&quot; (default): allows CronJobs to run concurrently; - \&quot;Forbid\&quot;: forbids concurrent runs, skipping next run if previous run hasn&#39;t finished yet; - \&quot;Replace\&quot;: cancels currently running job and replaces it with a new one
   * @return concurrencyPolicy
  **/
  @JsonProperty("concurrencyPolicy")
  public String getConcurrencyPolicy() {
    return concurrencyPolicy;
  }

  public void setConcurrencyPolicy(String concurrencyPolicy) {
    this.concurrencyPolicy = concurrencyPolicy;
  }

  public IoK8sApiBatchV1beta1CronJobSpec concurrencyPolicy(String concurrencyPolicy) {
    this.concurrencyPolicy = concurrencyPolicy;
    return this;
  }

 /**
   * The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
   * @return failedJobsHistoryLimit
  **/
  @JsonProperty("failedJobsHistoryLimit")
  public Integer getFailedJobsHistoryLimit() {
    return failedJobsHistoryLimit;
  }

  public void setFailedJobsHistoryLimit(Integer failedJobsHistoryLimit) {
    this.failedJobsHistoryLimit = failedJobsHistoryLimit;
  }

  public IoK8sApiBatchV1beta1CronJobSpec failedJobsHistoryLimit(Integer failedJobsHistoryLimit) {
    this.failedJobsHistoryLimit = failedJobsHistoryLimit;
    return this;
  }

 /**
   * Specifies the job that will be created when executing a CronJob.
   * @return jobTemplate
  **/
  @JsonProperty("jobTemplate")
  @NotNull
  public IoK8sApiBatchV1beta1JobTemplateSpec getJobTemplate() {
    return jobTemplate;
  }

  public void setJobTemplate(IoK8sApiBatchV1beta1JobTemplateSpec jobTemplate) {
    this.jobTemplate = jobTemplate;
  }

  public IoK8sApiBatchV1beta1CronJobSpec jobTemplate(IoK8sApiBatchV1beta1JobTemplateSpec jobTemplate) {
    this.jobTemplate = jobTemplate;
    return this;
  }

 /**
   * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
   * @return schedule
  **/
  @JsonProperty("schedule")
  @NotNull
  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  public IoK8sApiBatchV1beta1CronJobSpec schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

 /**
   * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
   * @return startingDeadlineSeconds
  **/
  @JsonProperty("startingDeadlineSeconds")
  public Long getStartingDeadlineSeconds() {
    return startingDeadlineSeconds;
  }

  public void setStartingDeadlineSeconds(Long startingDeadlineSeconds) {
    this.startingDeadlineSeconds = startingDeadlineSeconds;
  }

  public IoK8sApiBatchV1beta1CronJobSpec startingDeadlineSeconds(Long startingDeadlineSeconds) {
    this.startingDeadlineSeconds = startingDeadlineSeconds;
    return this;
  }

 /**
   * The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
   * @return successfulJobsHistoryLimit
  **/
  @JsonProperty("successfulJobsHistoryLimit")
  public Integer getSuccessfulJobsHistoryLimit() {
    return successfulJobsHistoryLimit;
  }

  public void setSuccessfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {
    this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
  }

  public IoK8sApiBatchV1beta1CronJobSpec successfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {
    this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
    return this;
  }

 /**
   * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
   * @return suspend
  **/
  @JsonProperty("suspend")
  public Boolean isSuspend() {
    return suspend;
  }

  public void setSuspend(Boolean suspend) {
    this.suspend = suspend;
  }

  public IoK8sApiBatchV1beta1CronJobSpec suspend(Boolean suspend) {
    this.suspend = suspend;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiBatchV1beta1CronJobSpec {\n");
    
    sb.append("    concurrencyPolicy: ").append(toIndentedString(concurrencyPolicy)).append("\n");
    sb.append("    failedJobsHistoryLimit: ").append(toIndentedString(failedJobsHistoryLimit)).append("\n");
    sb.append("    jobTemplate: ").append(toIndentedString(jobTemplate)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    startingDeadlineSeconds: ").append(toIndentedString(startingDeadlineSeconds)).append("\n");
    sb.append("    successfulJobsHistoryLimit: ").append(toIndentedString(successfulJobsHistoryLimit)).append("\n");
    sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
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

