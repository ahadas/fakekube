package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1DownwardAPIVolumeFile;
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
  * Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.
 **/
@ApiModel(description="Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.")
public class IoK8sApiCoreV1DownwardAPIProjection  {
  
  @ApiModelProperty(value = "Items is a list of DownwardAPIVolume file")
  @Valid
 /**
   * Items is a list of DownwardAPIVolume file
  **/
  private List<IoK8sApiCoreV1DownwardAPIVolumeFile> items = null;
 /**
   * Items is a list of DownwardAPIVolume file
   * @return items
  **/
  @JsonProperty("items")
  public List<IoK8sApiCoreV1DownwardAPIVolumeFile> getItems() {
    return items;
  }

  public void setItems(List<IoK8sApiCoreV1DownwardAPIVolumeFile> items) {
    this.items = items;
  }

  public IoK8sApiCoreV1DownwardAPIProjection items(List<IoK8sApiCoreV1DownwardAPIVolumeFile> items) {
    this.items = items;
    return this;
  }

  public IoK8sApiCoreV1DownwardAPIProjection addItemsItem(IoK8sApiCoreV1DownwardAPIVolumeFile itemsItem) {
    this.items.add(itemsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1DownwardAPIProjection {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

