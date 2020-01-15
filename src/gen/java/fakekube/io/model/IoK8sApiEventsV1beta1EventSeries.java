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
  * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
 **/
@ApiModel(description="EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.")
public class IoK8sApiEventsV1beta1EventSeries  {
  
  @ApiModelProperty(required = true, value = "Number of occurrences in this series up to the last heartbeat time")
 /**
   * Number of occurrences in this series up to the last heartbeat time
  **/
  private Integer count = null;

  @ApiModelProperty(required = true, value = "Time when last Event from the series was seen before last heartbeat.")
 /**
   * Time when last Event from the series was seen before last heartbeat.
  **/
  private String lastObservedTime = null;

  @ApiModelProperty(required = true, value = "Information whether this series is ongoing or finished. Deprecated. Planned removal for 1.18")
 /**
   * Information whether this series is ongoing or finished. Deprecated. Planned removal for 1.18
  **/
  private String state = null;
 /**
   * Number of occurrences in this series up to the last heartbeat time
   * @return count
  **/
  @JsonProperty("count")
  @NotNull
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public IoK8sApiEventsV1beta1EventSeries count(Integer count) {
    this.count = count;
    return this;
  }

 /**
   * Time when last Event from the series was seen before last heartbeat.
   * @return lastObservedTime
  **/
  @JsonProperty("lastObservedTime")
  @NotNull
  public String getLastObservedTime() {
    return lastObservedTime;
  }

  public void setLastObservedTime(String lastObservedTime) {
    this.lastObservedTime = lastObservedTime;
  }

  public IoK8sApiEventsV1beta1EventSeries lastObservedTime(String lastObservedTime) {
    this.lastObservedTime = lastObservedTime;
    return this;
  }

 /**
   * Information whether this series is ongoing or finished. Deprecated. Planned removal for 1.18
   * @return state
  **/
  @JsonProperty("state")
  @NotNull
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public IoK8sApiEventsV1beta1EventSeries state(String state) {
    this.state = state;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiEventsV1beta1EventSeries {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    lastObservedTime: ").append(toIndentedString(lastObservedTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

