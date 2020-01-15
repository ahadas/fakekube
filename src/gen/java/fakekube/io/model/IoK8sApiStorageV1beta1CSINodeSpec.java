package fakekube.io.model;

import fakekube.io.model.IoK8sApiStorageV1beta1CSINodeDriver;
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
  * CSINodeSpec holds information about the specification of all CSI drivers installed on a node
 **/
@ApiModel(description="CSINodeSpec holds information about the specification of all CSI drivers installed on a node")
public class IoK8sApiStorageV1beta1CSINodeSpec  {
  
  @ApiModelProperty(required = true, value = "drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.")
  @Valid
 /**
   * drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.
  **/
  private List<IoK8sApiStorageV1beta1CSINodeDriver> drivers = new ArrayList<IoK8sApiStorageV1beta1CSINodeDriver>();
 /**
   * drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.
   * @return drivers
  **/
  @JsonProperty("drivers")
  @NotNull
  public List<IoK8sApiStorageV1beta1CSINodeDriver> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<IoK8sApiStorageV1beta1CSINodeDriver> drivers) {
    this.drivers = drivers;
  }

  public IoK8sApiStorageV1beta1CSINodeSpec drivers(List<IoK8sApiStorageV1beta1CSINodeDriver> drivers) {
    this.drivers = drivers;
    return this;
  }

  public IoK8sApiStorageV1beta1CSINodeSpec addDriversItem(IoK8sApiStorageV1beta1CSINodeDriver driversItem) {
    this.drivers.add(driversItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiStorageV1beta1CSINodeSpec {\n");
    
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
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

