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
  * ResourceFieldSelector represents container resources (cpu, memory) and their output format
 **/
@ApiModel(description="ResourceFieldSelector represents container resources (cpu, memory) and their output format")
public class IoK8sApiCoreV1ResourceFieldSelector  {
  
  @ApiModelProperty(value = "Container name: required for volumes, optional for env vars")
 /**
   * Container name: required for volumes, optional for env vars
  **/
  private String containerName = null;

  @ApiModelProperty(value = "Specifies the output format of the exposed resources, defaults to \"1\"")
 /**
   * Specifies the output format of the exposed resources, defaults to \"1\"
  **/
  private String divisor = null;

  @ApiModelProperty(required = true, value = "Required: resource to select")
 /**
   * Required: resource to select
  **/
  private String resource = null;
 /**
   * Container name: required for volumes, optional for env vars
   * @return containerName
  **/
  @JsonProperty("containerName")
  public String getContainerName() {
    return containerName;
  }

  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }

  public IoK8sApiCoreV1ResourceFieldSelector containerName(String containerName) {
    this.containerName = containerName;
    return this;
  }

 /**
   * Specifies the output format of the exposed resources, defaults to \&quot;1\&quot;
   * @return divisor
  **/
  @JsonProperty("divisor")
  public String getDivisor() {
    return divisor;
  }

  public void setDivisor(String divisor) {
    this.divisor = divisor;
  }

  public IoK8sApiCoreV1ResourceFieldSelector divisor(String divisor) {
    this.divisor = divisor;
    return this;
  }

 /**
   * Required: resource to select
   * @return resource
  **/
  @JsonProperty("resource")
  @NotNull
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public IoK8sApiCoreV1ResourceFieldSelector resource(String resource) {
    this.resource = resource;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ResourceFieldSelector {\n");
    
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    divisor: ").append(toIndentedString(divisor)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

