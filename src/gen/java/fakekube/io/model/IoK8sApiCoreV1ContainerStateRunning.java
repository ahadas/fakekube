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
  * ContainerStateRunning is a running state of a container.
 **/
@ApiModel(description="ContainerStateRunning is a running state of a container.")
public class IoK8sApiCoreV1ContainerStateRunning  {
  
  @ApiModelProperty(value = "Time at which the container was last (re-)started")
 /**
   * Time at which the container was last (re-)started
  **/
  private String startedAt = null;
 /**
   * Time at which the container was last (re-)started
   * @return startedAt
  **/
  @JsonProperty("startedAt")
  public String getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }

  public IoK8sApiCoreV1ContainerStateRunning startedAt(String startedAt) {
    this.startedAt = startedAt;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ContainerStateRunning {\n");
    
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
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

