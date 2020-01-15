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
  * NamespaceSpec describes the attributes on a Namespace.
 **/
@ApiModel(description="NamespaceSpec describes the attributes on a Namespace.")
public class IoK8sApiCoreV1NamespaceSpec  {
  
  @ApiModelProperty(value = "Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/")
 /**
   * Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
  **/
  private List<String> finalizers = null;
 /**
   * Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
   * @return finalizers
  **/
  @JsonProperty("finalizers")
  public List<String> getFinalizers() {
    return finalizers;
  }

  public void setFinalizers(List<String> finalizers) {
    this.finalizers = finalizers;
  }

  public IoK8sApiCoreV1NamespaceSpec finalizers(List<String> finalizers) {
    this.finalizers = finalizers;
    return this;
  }

  public IoK8sApiCoreV1NamespaceSpec addFinalizersItem(String finalizersItem) {
    this.finalizers.add(finalizersItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NamespaceSpec {\n");
    
    sb.append("    finalizers: ").append(toIndentedString(finalizers)).append("\n");
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

