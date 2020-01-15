package fakekube.io.model;

import fakekube.io.model.IoK8sApiExtensionsV1beta1HTTPIngressPath;
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
  * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://<host>/<path>?<searchpart> -> backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last '/' and before the first '?' or '#'.
 **/
@ApiModel(description="HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://<host>/<path>?<searchpart> -> backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last '/' and before the first '?' or '#'.")
public class IoK8sApiExtensionsV1beta1HTTPIngressRuleValue  {
  
  @ApiModelProperty(required = true, value = "A collection of paths that map requests to backends.")
  @Valid
 /**
   * A collection of paths that map requests to backends.
  **/
  private List<IoK8sApiExtensionsV1beta1HTTPIngressPath> paths = new ArrayList<IoK8sApiExtensionsV1beta1HTTPIngressPath>();
 /**
   * A collection of paths that map requests to backends.
   * @return paths
  **/
  @JsonProperty("paths")
  @NotNull
  public List<IoK8sApiExtensionsV1beta1HTTPIngressPath> getPaths() {
    return paths;
  }

  public void setPaths(List<IoK8sApiExtensionsV1beta1HTTPIngressPath> paths) {
    this.paths = paths;
  }

  public IoK8sApiExtensionsV1beta1HTTPIngressRuleValue paths(List<IoK8sApiExtensionsV1beta1HTTPIngressPath> paths) {
    this.paths = paths;
    return this;
  }

  public IoK8sApiExtensionsV1beta1HTTPIngressRuleValue addPathsItem(IoK8sApiExtensionsV1beta1HTTPIngressPath pathsItem) {
    this.paths.add(pathsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiExtensionsV1beta1HTTPIngressRuleValue {\n");
    
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
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

