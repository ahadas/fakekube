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
  * Policy defines the configuration of how audit events are logged
 **/
@ApiModel(description="Policy defines the configuration of how audit events are logged")
public class IoK8sApiAuditregistrationV1alpha1Policy  {
  
  @ApiModelProperty(required = true, value = "The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required")
 /**
   * The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
  **/
  private String level = null;

  @ApiModelProperty(value = "Stages is a list of stages for which events are created.")
 /**
   * Stages is a list of stages for which events are created.
  **/
  private List<String> stages = null;
 /**
   * The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
   * @return level
  **/
  @JsonProperty("level")
  @NotNull
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public IoK8sApiAuditregistrationV1alpha1Policy level(String level) {
    this.level = level;
    return this;
  }

 /**
   * Stages is a list of stages for which events are created.
   * @return stages
  **/
  @JsonProperty("stages")
  public List<String> getStages() {
    return stages;
  }

  public void setStages(List<String> stages) {
    this.stages = stages;
  }

  public IoK8sApiAuditregistrationV1alpha1Policy stages(List<String> stages) {
    this.stages = stages;
    return this;
  }

  public IoK8sApiAuditregistrationV1alpha1Policy addStagesItem(String stagesItem) {
    this.stages.add(stagesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuditregistrationV1alpha1Policy {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    stages: ").append(toIndentedString(stages)).append("\n");
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

