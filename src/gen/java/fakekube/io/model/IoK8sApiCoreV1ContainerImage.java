package fakekube.io.model;

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
  * Describe a container image
 **/
@ApiModel(description="Describe a container image")
public class IoK8sApiCoreV1ContainerImage  {
  
  @ApiModelProperty(required = true, value = "Names by which this image is known. e.g. [\"k8s.gcr.io/hyperkube:v1.0.7\", \"dockerhub.io/google_containers/hyperkube:v1.0.7\"]")
 /**
   * Names by which this image is known. e.g. [\"k8s.gcr.io/hyperkube:v1.0.7\", \"dockerhub.io/google_containers/hyperkube:v1.0.7\"]
  **/
  private List<String> names = new ArrayList<String>();

  @ApiModelProperty(value = "The size of the image in bytes.")
 /**
   * The size of the image in bytes.
  **/
  private Long sizeBytes = null;
 /**
   * Names by which this image is known. e.g. [\&quot;k8s.gcr.io/hyperkube:v1.0.7\&quot;, \&quot;dockerhub.io/google_containers/hyperkube:v1.0.7\&quot;]
   * @return names
  **/
  @JsonProperty("names")
  @NotNull
  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }

  public IoK8sApiCoreV1ContainerImage names(List<String> names) {
    this.names = names;
    return this;
  }

  public IoK8sApiCoreV1ContainerImage addNamesItem(String namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
   * The size of the image in bytes.
   * @return sizeBytes
  **/
  @JsonProperty("sizeBytes")
  public Long getSizeBytes() {
    return sizeBytes;
  }

  public void setSizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
  }

  public IoK8sApiCoreV1ContainerImage sizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ContainerImage {\n");
    
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
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

