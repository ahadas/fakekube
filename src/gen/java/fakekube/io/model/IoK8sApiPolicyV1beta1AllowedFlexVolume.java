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
  * AllowedFlexVolume represents a single Flexvolume that is allowed to be used.
 **/
@ApiModel(description="AllowedFlexVolume represents a single Flexvolume that is allowed to be used.")
public class IoK8sApiPolicyV1beta1AllowedFlexVolume  {
  
  @ApiModelProperty(required = true, value = "driver is the name of the Flexvolume driver.")
 /**
   * driver is the name of the Flexvolume driver.
  **/
  private String driver = null;
 /**
   * driver is the name of the Flexvolume driver.
   * @return driver
  **/
  @JsonProperty("driver")
  @NotNull
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public IoK8sApiPolicyV1beta1AllowedFlexVolume driver(String driver) {
    this.driver = driver;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiPolicyV1beta1AllowedFlexVolume {\n");
    
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
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

