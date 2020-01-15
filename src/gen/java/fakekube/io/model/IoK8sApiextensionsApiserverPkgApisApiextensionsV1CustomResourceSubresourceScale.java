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
  * CustomResourceSubresourceScale defines how to serve the scale subresource for CustomResources.
 **/
@ApiModel(description="CustomResourceSubresourceScale defines how to serve the scale subresource for CustomResources.")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresourceScale  {
  
  @ApiModelProperty(value = "labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource will default to the empty string.")
 /**
   * labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource will default to the empty string.
  **/
  private String labelSelectorPath = null;

  @ApiModelProperty(required = true, value = "specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given path in the custom resource, the `/scale` subresource will return an error on GET.")
 /**
   * specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given path in the custom resource, the `/scale` subresource will return an error on GET.
  **/
  private String specReplicasPath = null;

  @ApiModelProperty(required = true, value = "statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0.")
 /**
   * statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0.
  **/
  private String statusReplicasPath = null;
 /**
   * labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale &#x60;status.selector&#x60;. Only JSON paths without the array notation are allowed. Must be a JSON Path under &#x60;.status&#x60; or &#x60;.spec&#x60;. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the &#x60;status.selector&#x60; value in the &#x60;/scale&#x60; subresource will default to the empty string.
   * @return labelSelectorPath
  **/
  @JsonProperty("labelSelectorPath")
  public String getLabelSelectorPath() {
    return labelSelectorPath;
  }

  public void setLabelSelectorPath(String labelSelectorPath) {
    this.labelSelectorPath = labelSelectorPath;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresourceScale labelSelectorPath(String labelSelectorPath) {
    this.labelSelectorPath = labelSelectorPath;
    return this;
  }

 /**
   * specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale &#x60;spec.replicas&#x60;. Only JSON paths without the array notation are allowed. Must be a JSON Path under &#x60;.spec&#x60;. If there is no value under the given path in the custom resource, the &#x60;/scale&#x60; subresource will return an error on GET.
   * @return specReplicasPath
  **/
  @JsonProperty("specReplicasPath")
  @NotNull
  public String getSpecReplicasPath() {
    return specReplicasPath;
  }

  public void setSpecReplicasPath(String specReplicasPath) {
    this.specReplicasPath = specReplicasPath;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresourceScale specReplicasPath(String specReplicasPath) {
    this.specReplicasPath = specReplicasPath;
    return this;
  }

 /**
   * statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale &#x60;status.replicas&#x60;. Only JSON paths without the array notation are allowed. Must be a JSON Path under &#x60;.status&#x60;. If there is no value under the given path in the custom resource, the &#x60;status.replicas&#x60; value in the &#x60;/scale&#x60; subresource will default to 0.
   * @return statusReplicasPath
  **/
  @JsonProperty("statusReplicasPath")
  @NotNull
  public String getStatusReplicasPath() {
    return statusReplicasPath;
  }

  public void setStatusReplicasPath(String statusReplicasPath) {
    this.statusReplicasPath = statusReplicasPath;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresourceScale statusReplicasPath(String statusReplicasPath) {
    this.statusReplicasPath = statusReplicasPath;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresourceScale {\n");
    
    sb.append("    labelSelectorPath: ").append(toIndentedString(labelSelectorPath)).append("\n");
    sb.append("    specReplicasPath: ").append(toIndentedString(specReplicasPath)).append("\n");
    sb.append("    statusReplicasPath: ").append(toIndentedString(statusReplicasPath)).append("\n");
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

