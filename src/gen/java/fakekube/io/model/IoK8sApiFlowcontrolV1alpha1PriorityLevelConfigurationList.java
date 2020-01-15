package fakekube.io.model;

import fakekube.io.model.IoK8sApiFlowcontrolV1alpha1PriorityLevelConfiguration;
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
  * PriorityLevelConfigurationList is a list of PriorityLevelConfiguration objects.
 **/
@ApiModel(description="PriorityLevelConfigurationList is a list of PriorityLevelConfiguration objects.")
public class IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationList  {
  
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
 /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
  **/
  private String apiVersion = null;

  @ApiModelProperty(required = true, value = "`items` is a list of request-priorities.")
  @Valid
 /**
   * `items` is a list of request-priorities.
  **/
  private List<IoK8sApiFlowcontrolV1alpha1PriorityLevelConfiguration> items = new ArrayList<IoK8sApiFlowcontrolV1alpha1PriorityLevelConfiguration>();

  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
 /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
  **/
  private String kind = null;

  @ApiModelProperty(value = "`metadata` is the standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
  @Valid
 /**
   * `metadata` is the standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
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

  public IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

 /**
   * &#x60;items&#x60; is a list of request-priorities.
   * @return items
  **/
  @JsonProperty("items")
  @NotNull
  public List<IoK8sApiFlowcontrolV1alpha1PriorityLevelConfiguration> getItems() {
    return items;
  }

  public void setItems(List<IoK8sApiFlowcontrolV1alpha1PriorityLevelConfiguration> items) {
    this.items = items;
  }

  public IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationList items(List<IoK8sApiFlowcontrolV1alpha1PriorityLevelConfiguration> items) {
    this.items = items;
    return this;
  }

  public IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationList addItemsItem(IoK8sApiFlowcontrolV1alpha1PriorityLevelConfiguration itemsItem) {
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

  public IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationList kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * &#x60;metadata&#x60; is the standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * @return metadata
  **/
  @JsonProperty("metadata")
  public IoK8sApimachineryPkgApisMetaV1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ListMeta metadata) {
    this.metadata = metadata;
  }

  public IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationList metadata(IoK8sApimachineryPkgApisMetaV1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiFlowcontrolV1alpha1PriorityLevelConfigurationList {\n");
    
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

