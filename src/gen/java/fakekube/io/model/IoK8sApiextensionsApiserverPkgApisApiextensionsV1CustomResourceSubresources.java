package fakekube.io.model;

import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresourceScale;
import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresourceStatus;
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
  * CustomResourceSubresources defines the status and scale subresources for CustomResources.
 **/
@ApiModel(description="CustomResourceSubresources defines the status and scale subresources for CustomResources.")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresources  {
  
  @ApiModelProperty(value = "scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object.")
  @Valid
 /**
   * scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object.
  **/
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresourceScale scale = null;

  @ApiModelProperty(value = "status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource `/status` subresource ignore changes to anything other than the `status` stanza of the object.")
  @Valid
 /**
   * status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource `/status` subresource ignore changes to anything other than the `status` stanza of the object.
  **/
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresourceStatus status = null;
 /**
   * scale indicates the custom resource should serve a &#x60;/scale&#x60; subresource that returns an &#x60;autoscaling/v1&#x60; Scale object.
   * @return scale
  **/
  @JsonProperty("scale")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresourceScale getScale() {
    return scale;
  }

  public void setScale(IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresourceScale scale) {
    this.scale = scale;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresources scale(IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresourceScale scale) {
    this.scale = scale;
    return this;
  }

 /**
   * status indicates the custom resource should serve a &#x60;/status&#x60; subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the &#x60;status&#x60; stanza of the object. 2. requests to the custom resource &#x60;/status&#x60; subresource ignore changes to anything other than the &#x60;status&#x60; stanza of the object.
   * @return status
  **/
  @JsonProperty("status")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresourceStatus getStatus() {
    return status;
  }

  public void setStatus(IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresourceStatus status) {
    this.status = status;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresources status(IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresourceStatus status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceSubresources {\n");
    
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

