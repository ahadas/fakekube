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
  * QueuingConfiguration holds the configuration parameters for queuing
 **/
@ApiModel(description="QueuingConfiguration holds the configuration parameters for queuing")
public class IoK8sApiFlowcontrolV1alpha1QueuingConfiguration  {
  
  @ApiModelProperty(value = "`handSize` is a small positive number that configures the shuffle sharding of requests into queues.  When enqueuing a request at this priority level the request's flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. `handSize` must be no larger than `queues`, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.")
 /**
   * `handSize` is a small positive number that configures the shuffle sharding of requests into queues.  When enqueuing a request at this priority level the request's flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. `handSize` must be no larger than `queues`, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.
  **/
  private Integer handSize = null;

  @ApiModelProperty(value = "`queueLengthLimit` is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time; excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.")
 /**
   * `queueLengthLimit` is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time; excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.
  **/
  private Integer queueLengthLimit = null;

  @ApiModelProperty(value = "`queues` is the number of queues for this priority level. The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.")
 /**
   * `queues` is the number of queues for this priority level. The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.
  **/
  private Integer queues = null;
 /**
   * &#x60;handSize&#x60; is a small positive number that configures the shuffle sharding of requests into queues.  When enqueuing a request at this priority level the request&#39;s flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. &#x60;handSize&#x60; must be no larger than &#x60;queues&#x60;, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.
   * @return handSize
  **/
  @JsonProperty("handSize")
  public Integer getHandSize() {
    return handSize;
  }

  public void setHandSize(Integer handSize) {
    this.handSize = handSize;
  }

  public IoK8sApiFlowcontrolV1alpha1QueuingConfiguration handSize(Integer handSize) {
    this.handSize = handSize;
    return this;
  }

 /**
   * &#x60;queueLengthLimit&#x60; is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time; excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.
   * @return queueLengthLimit
  **/
  @JsonProperty("queueLengthLimit")
  public Integer getQueueLengthLimit() {
    return queueLengthLimit;
  }

  public void setQueueLengthLimit(Integer queueLengthLimit) {
    this.queueLengthLimit = queueLengthLimit;
  }

  public IoK8sApiFlowcontrolV1alpha1QueuingConfiguration queueLengthLimit(Integer queueLengthLimit) {
    this.queueLengthLimit = queueLengthLimit;
    return this;
  }

 /**
   * &#x60;queues&#x60; is the number of queues for this priority level. The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.
   * @return queues
  **/
  @JsonProperty("queues")
  public Integer getQueues() {
    return queues;
  }

  public void setQueues(Integer queues) {
    this.queues = queues;
  }

  public IoK8sApiFlowcontrolV1alpha1QueuingConfiguration queues(Integer queues) {
    this.queues = queues;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiFlowcontrolV1alpha1QueuingConfiguration {\n");
    
    sb.append("    handSize: ").append(toIndentedString(handSize)).append("\n");
    sb.append("    queueLengthLimit: ").append(toIndentedString(queueLengthLimit)).append("\n");
    sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
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

