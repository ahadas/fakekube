package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1VolumeProjection;
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
  * Represents a projected volume source
 **/
@ApiModel(description="Represents a projected volume source")
public class IoK8sApiCoreV1ProjectedVolumeSource  {
  
  @ApiModelProperty(value = "Mode bits to use on created files by default. Must be a value between 0 and 0777. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
 /**
   * Mode bits to use on created files by default. Must be a value between 0 and 0777. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
  **/
  private Integer defaultMode = null;

  @ApiModelProperty(required = true, value = "list of volume projections")
  @Valid
 /**
   * list of volume projections
  **/
  private List<IoK8sApiCoreV1VolumeProjection> sources = new ArrayList<IoK8sApiCoreV1VolumeProjection>();
 /**
   * Mode bits to use on created files by default. Must be a value between 0 and 0777. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   * @return defaultMode
  **/
  @JsonProperty("defaultMode")
  public Integer getDefaultMode() {
    return defaultMode;
  }

  public void setDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
  }

  public IoK8sApiCoreV1ProjectedVolumeSource defaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
    return this;
  }

 /**
   * list of volume projections
   * @return sources
  **/
  @JsonProperty("sources")
  @NotNull
  public List<IoK8sApiCoreV1VolumeProjection> getSources() {
    return sources;
  }

  public void setSources(List<IoK8sApiCoreV1VolumeProjection> sources) {
    this.sources = sources;
  }

  public IoK8sApiCoreV1ProjectedVolumeSource sources(List<IoK8sApiCoreV1VolumeProjection> sources) {
    this.sources = sources;
    return this;
  }

  public IoK8sApiCoreV1ProjectedVolumeSource addSourcesItem(IoK8sApiCoreV1VolumeProjection sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ProjectedVolumeSource {\n");
    
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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

