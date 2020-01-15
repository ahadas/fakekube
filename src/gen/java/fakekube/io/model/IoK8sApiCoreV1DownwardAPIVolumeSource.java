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
  * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.
 **/
@ApiModel(description="DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.")
public class IoK8sApiCoreV1DownwardAPIVolumeSource  {
  
  @ApiModelProperty(value = "Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
 /**
   * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
  **/
  private Integer defaultMode = null;

  @ApiModelProperty(value = "Items is a list of downward API volume file")
  @Valid
 /**
   * Items is a list of downward API volume file
  **/
  private List<IoK8sApiCoreV1DownwardAPIVolumeFile> items = null;
 /**
   * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   * @return defaultMode
  **/
  @JsonProperty("defaultMode")
  public Integer getDefaultMode() {
    return defaultMode;
  }

  public void setDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
  }

  public IoK8sApiCoreV1DownwardAPIVolumeSource defaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
    return this;
  }

 /**
   * Items is a list of downward API volume file
   * @return items
  **/
  @JsonProperty("items")
  public List<IoK8sApiCoreV1DownwardAPIVolumeFile> getItems() {
    return items;
  }

  public void setItems(List<IoK8sApiCoreV1DownwardAPIVolumeFile> items) {
    this.items = items;
  }

  public IoK8sApiCoreV1DownwardAPIVolumeSource items(List<IoK8sApiCoreV1DownwardAPIVolumeFile> items) {
    this.items = items;
    return this;
  }

  public IoK8sApiCoreV1DownwardAPIVolumeSource addItemsItem(IoK8sApiCoreV1DownwardAPIVolumeFile itemsItem) {
    this.items.add(itemsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1DownwardAPIVolumeSource {\n");
    
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
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

