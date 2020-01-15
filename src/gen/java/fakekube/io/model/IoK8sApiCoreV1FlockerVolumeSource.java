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
  * Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.
 **/
@ApiModel(description="Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.")
public class IoK8sApiCoreV1FlockerVolumeSource  {
  
  @ApiModelProperty(value = "Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated")
 /**
   * Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated
  **/
  private String datasetName = null;

  @ApiModelProperty(value = "UUID of the dataset. This is unique identifier of a Flocker dataset")
 /**
   * UUID of the dataset. This is unique identifier of a Flocker dataset
  **/
  private String datasetUUID = null;
 /**
   * Name of the dataset stored as metadata -&gt; name on the dataset for Flocker should be considered as deprecated
   * @return datasetName
  **/
  @JsonProperty("datasetName")
  public String getDatasetName() {
    return datasetName;
  }

  public void setDatasetName(String datasetName) {
    this.datasetName = datasetName;
  }

  public IoK8sApiCoreV1FlockerVolumeSource datasetName(String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

 /**
   * UUID of the dataset. This is unique identifier of a Flocker dataset
   * @return datasetUUID
  **/
  @JsonProperty("datasetUUID")
  public String getDatasetUUID() {
    return datasetUUID;
  }

  public void setDatasetUUID(String datasetUUID) {
    this.datasetUUID = datasetUUID;
  }

  public IoK8sApiCoreV1FlockerVolumeSource datasetUUID(String datasetUUID) {
    this.datasetUUID = datasetUUID;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1FlockerVolumeSource {\n");
    
    sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
    sb.append("    datasetUUID: ").append(toIndentedString(datasetUUID)).append("\n");
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

