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
  * RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.
 **/
@ApiModel(description="RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.")
public class IoK8sApiAppsV1RollingUpdateStatefulSetStrategy  {
  
  @ApiModelProperty(value = "Partition indicates the ordinal at which the StatefulSet should be partitioned. Default value is 0.")
 /**
   * Partition indicates the ordinal at which the StatefulSet should be partitioned. Default value is 0.
  **/
  private Integer partition = null;
 /**
   * Partition indicates the ordinal at which the StatefulSet should be partitioned. Default value is 0.
   * @return partition
  **/
  @JsonProperty("partition")
  public Integer getPartition() {
    return partition;
  }

  public void setPartition(Integer partition) {
    this.partition = partition;
  }

  public IoK8sApiAppsV1RollingUpdateStatefulSetStrategy partition(Integer partition) {
    this.partition = partition;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAppsV1RollingUpdateStatefulSetStrategy {\n");
    
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
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

