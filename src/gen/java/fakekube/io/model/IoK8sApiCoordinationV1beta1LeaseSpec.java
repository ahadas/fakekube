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
  * LeaseSpec is a specification of a Lease.
 **/
@ApiModel(description="LeaseSpec is a specification of a Lease.")
public class IoK8sApiCoordinationV1beta1LeaseSpec  {
  
  @ApiModelProperty(value = "acquireTime is a time when the current lease was acquired.")
 /**
   * acquireTime is a time when the current lease was acquired.
  **/
  private String acquireTime = null;

  @ApiModelProperty(value = "holderIdentity contains the identity of the holder of a current lease.")
 /**
   * holderIdentity contains the identity of the holder of a current lease.
  **/
  private String holderIdentity = null;

  @ApiModelProperty(value = "leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.")
 /**
   * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
  **/
  private Integer leaseDurationSeconds = null;

  @ApiModelProperty(value = "leaseTransitions is the number of transitions of a lease between holders.")
 /**
   * leaseTransitions is the number of transitions of a lease between holders.
  **/
  private Integer leaseTransitions = null;

  @ApiModelProperty(value = "renewTime is a time when the current holder of a lease has last updated the lease.")
 /**
   * renewTime is a time when the current holder of a lease has last updated the lease.
  **/
  private String renewTime = null;
 /**
   * acquireTime is a time when the current lease was acquired.
   * @return acquireTime
  **/
  @JsonProperty("acquireTime")
  public String getAcquireTime() {
    return acquireTime;
  }

  public void setAcquireTime(String acquireTime) {
    this.acquireTime = acquireTime;
  }

  public IoK8sApiCoordinationV1beta1LeaseSpec acquireTime(String acquireTime) {
    this.acquireTime = acquireTime;
    return this;
  }

 /**
   * holderIdentity contains the identity of the holder of a current lease.
   * @return holderIdentity
  **/
  @JsonProperty("holderIdentity")
  public String getHolderIdentity() {
    return holderIdentity;
  }

  public void setHolderIdentity(String holderIdentity) {
    this.holderIdentity = holderIdentity;
  }

  public IoK8sApiCoordinationV1beta1LeaseSpec holderIdentity(String holderIdentity) {
    this.holderIdentity = holderIdentity;
    return this;
  }

 /**
   * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
   * @return leaseDurationSeconds
  **/
  @JsonProperty("leaseDurationSeconds")
  public Integer getLeaseDurationSeconds() {
    return leaseDurationSeconds;
  }

  public void setLeaseDurationSeconds(Integer leaseDurationSeconds) {
    this.leaseDurationSeconds = leaseDurationSeconds;
  }

  public IoK8sApiCoordinationV1beta1LeaseSpec leaseDurationSeconds(Integer leaseDurationSeconds) {
    this.leaseDurationSeconds = leaseDurationSeconds;
    return this;
  }

 /**
   * leaseTransitions is the number of transitions of a lease between holders.
   * @return leaseTransitions
  **/
  @JsonProperty("leaseTransitions")
  public Integer getLeaseTransitions() {
    return leaseTransitions;
  }

  public void setLeaseTransitions(Integer leaseTransitions) {
    this.leaseTransitions = leaseTransitions;
  }

  public IoK8sApiCoordinationV1beta1LeaseSpec leaseTransitions(Integer leaseTransitions) {
    this.leaseTransitions = leaseTransitions;
    return this;
  }

 /**
   * renewTime is a time when the current holder of a lease has last updated the lease.
   * @return renewTime
  **/
  @JsonProperty("renewTime")
  public String getRenewTime() {
    return renewTime;
  }

  public void setRenewTime(String renewTime) {
    this.renewTime = renewTime;
  }

  public IoK8sApiCoordinationV1beta1LeaseSpec renewTime(String renewTime) {
    this.renewTime = renewTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoordinationV1beta1LeaseSpec {\n");
    
    sb.append("    acquireTime: ").append(toIndentedString(acquireTime)).append("\n");
    sb.append("    holderIdentity: ").append(toIndentedString(holderIdentity)).append("\n");
    sb.append("    leaseDurationSeconds: ").append(toIndentedString(leaseDurationSeconds)).append("\n");
    sb.append("    leaseTransitions: ").append(toIndentedString(leaseTransitions)).append("\n");
    sb.append("    renewTime: ").append(toIndentedString(renewTime)).append("\n");
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

