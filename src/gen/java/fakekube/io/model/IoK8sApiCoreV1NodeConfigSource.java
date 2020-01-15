package fakekube.io.model;

import fakekube.io.model.IoK8sApiCoreV1ConfigMapNodeConfigSource;
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
  * NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding metadata) must be non-nil.
 **/
@ApiModel(description="NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding metadata) must be non-nil.")
public class IoK8sApiCoreV1NodeConfigSource  {
  
  @ApiModelProperty(value = "ConfigMap is a reference to a Node's ConfigMap")
  @Valid
 /**
   * ConfigMap is a reference to a Node's ConfigMap
  **/
  private IoK8sApiCoreV1ConfigMapNodeConfigSource configMap = null;
 /**
   * ConfigMap is a reference to a Node&#39;s ConfigMap
   * @return configMap
  **/
  @JsonProperty("configMap")
  public IoK8sApiCoreV1ConfigMapNodeConfigSource getConfigMap() {
    return configMap;
  }

  public void setConfigMap(IoK8sApiCoreV1ConfigMapNodeConfigSource configMap) {
    this.configMap = configMap;
  }

  public IoK8sApiCoreV1NodeConfigSource configMap(IoK8sApiCoreV1ConfigMapNodeConfigSource configMap) {
    this.configMap = configMap;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NodeConfigSource {\n");
    
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
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

