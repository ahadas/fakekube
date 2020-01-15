package fakekube.io.model;

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
  * WebhookThrottleConfig holds the configuration for throttling events
 **/
@ApiModel(description="WebhookThrottleConfig holds the configuration for throttling events")
public class IoK8sApiAuditregistrationV1alpha1WebhookThrottleConfig  {
  
  @ApiModelProperty(value = "ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS")
 /**
   * ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
  **/
  private Long burst = null;

  @ApiModelProperty(value = "ThrottleQPS maximum number of batches per second default 10 QPS")
 /**
   * ThrottleQPS maximum number of batches per second default 10 QPS
  **/
  private Long qps = null;
 /**
   * ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
   * @return burst
  **/
  @JsonProperty("burst")
  public Long getBurst() {
    return burst;
  }

  public void setBurst(Long burst) {
    this.burst = burst;
  }

  public IoK8sApiAuditregistrationV1alpha1WebhookThrottleConfig burst(Long burst) {
    this.burst = burst;
    return this;
  }

 /**
   * ThrottleQPS maximum number of batches per second default 10 QPS
   * @return qps
  **/
  @JsonProperty("qps")
  public Long getQps() {
    return qps;
  }

  public void setQps(Long qps) {
    this.qps = qps;
  }

  public IoK8sApiAuditregistrationV1alpha1WebhookThrottleConfig qps(Long qps) {
    this.qps = qps;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuditregistrationV1alpha1WebhookThrottleConfig {\n");
    
    sb.append("    burst: ").append(toIndentedString(burst)).append("\n");
    sb.append("    qps: ").append(toIndentedString(qps)).append("\n");
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

