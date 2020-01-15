package fakekube.io.model;

import fakekube.io.model.IoK8sApiFlowcontrolV1alpha1LimitResponse;
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
  * LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits. It addresses two issues:  * How are requests for this priority level limited?  * What should be done with requests that exceed the limit?
 **/
@ApiModel(description="LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits. It addresses two issues:  * How are requests for this priority level limited?  * What should be done with requests that exceed the limit?")
public class IoK8sApiFlowcontrolV1alpha1LimitedPriorityLevelConfiguration  {
  
  @ApiModelProperty(value = "`assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server's concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:              ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )  bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.")
 /**
   * `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server's concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:              ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )  bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
  **/
  private Integer assuredConcurrencyShares = null;

  @ApiModelProperty(value = "`limitResponse` indicates what to do with requests that can not be executed right now")
  @Valid
 /**
   * `limitResponse` indicates what to do with requests that can not be executed right now
  **/
  private IoK8sApiFlowcontrolV1alpha1LimitResponse limitResponse = null;
 /**
   * &#x60;assuredConcurrencyShares&#x60; (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server&#39;s concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:              ACV(l) &#x3D; ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )  bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
   * @return assuredConcurrencyShares
  **/
  @JsonProperty("assuredConcurrencyShares")
  public Integer getAssuredConcurrencyShares() {
    return assuredConcurrencyShares;
  }

  public void setAssuredConcurrencyShares(Integer assuredConcurrencyShares) {
    this.assuredConcurrencyShares = assuredConcurrencyShares;
  }

  public IoK8sApiFlowcontrolV1alpha1LimitedPriorityLevelConfiguration assuredConcurrencyShares(Integer assuredConcurrencyShares) {
    this.assuredConcurrencyShares = assuredConcurrencyShares;
    return this;
  }

 /**
   * &#x60;limitResponse&#x60; indicates what to do with requests that can not be executed right now
   * @return limitResponse
  **/
  @JsonProperty("limitResponse")
  public IoK8sApiFlowcontrolV1alpha1LimitResponse getLimitResponse() {
    return limitResponse;
  }

  public void setLimitResponse(IoK8sApiFlowcontrolV1alpha1LimitResponse limitResponse) {
    this.limitResponse = limitResponse;
  }

  public IoK8sApiFlowcontrolV1alpha1LimitedPriorityLevelConfiguration limitResponse(IoK8sApiFlowcontrolV1alpha1LimitResponse limitResponse) {
    this.limitResponse = limitResponse;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiFlowcontrolV1alpha1LimitedPriorityLevelConfiguration {\n");
    
    sb.append("    assuredConcurrencyShares: ").append(toIndentedString(assuredConcurrencyShares)).append("\n");
    sb.append("    limitResponse: ").append(toIndentedString(limitResponse)).append("\n");
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

