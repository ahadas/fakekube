package fakekube.io.model;

import fakekube.io.model.IoK8sApiDiscoveryV1beta1EndpointSlice;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1ListMeta;
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
  * EndpointSliceList represents a list of endpoint slices
 **/
@ApiModel(description="EndpointSliceList represents a list of endpoint slices")
public class IoK8sApiDiscoveryV1beta1EndpointSliceList  {
  
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
 /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
  **/
  private String apiVersion = null;

  @ApiModelProperty(required = true, value = "List of endpoint slices")
  @Valid
 /**
   * List of endpoint slices
  **/
  private List<IoK8sApiDiscoveryV1beta1EndpointSlice> items = new ArrayList<IoK8sApiDiscoveryV1beta1EndpointSlice>();

  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
 /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
  **/
  private String kind = null;

  @ApiModelProperty(value = "Standard list metadata.")
  @Valid
 /**
   * Standard list metadata.
  **/
  private IoK8sApimachineryPkgApisMetaV1ListMeta metadata = null;
 /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public IoK8sApiDiscoveryV1beta1EndpointSliceList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

 /**
   * List of endpoint slices
   * @return items
  **/
  @JsonProperty("items")
  @NotNull
  public List<IoK8sApiDiscoveryV1beta1EndpointSlice> getItems() {
    return items;
  }

  public void setItems(List<IoK8sApiDiscoveryV1beta1EndpointSlice> items) {
    this.items = items;
  }

  public IoK8sApiDiscoveryV1beta1EndpointSliceList items(List<IoK8sApiDiscoveryV1beta1EndpointSlice> items) {
    this.items = items;
    return this;
  }

  public IoK8sApiDiscoveryV1beta1EndpointSliceList addItemsItem(IoK8sApiDiscoveryV1beta1EndpointSlice itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoK8sApiDiscoveryV1beta1EndpointSliceList kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * Standard list metadata.
   * @return metadata
  **/
  @JsonProperty("metadata")
  public IoK8sApimachineryPkgApisMetaV1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ListMeta metadata) {
    this.metadata = metadata;
  }

  public IoK8sApiDiscoveryV1beta1EndpointSliceList metadata(IoK8sApimachineryPkgApisMetaV1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiDiscoveryV1beta1EndpointSliceList {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

