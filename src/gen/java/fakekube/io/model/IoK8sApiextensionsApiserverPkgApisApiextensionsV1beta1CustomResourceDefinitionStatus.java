package fakekube.io.model;

import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionCondition;
import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames;
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
  * CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition
 **/
@ApiModel(description="CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionStatus  {
  
  @ApiModelProperty(required = true, value = "acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in spec.")
  @Valid
 /**
   * acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in spec.
  **/
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames acceptedNames = null;

  @ApiModelProperty(value = "conditions indicate state for particular aspects of a CustomResourceDefinition")
  @Valid
 /**
   * conditions indicate state for particular aspects of a CustomResourceDefinition
  **/
  private List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionCondition> conditions = null;

  @ApiModelProperty(required = true, value = "storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from `spec.versions` while they exist in this list.")
 /**
   * storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from `spec.versions` while they exist in this list.
  **/
  private List<String> storedVersions = new ArrayList<String>();
 /**
   * acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in spec.
   * @return acceptedNames
  **/
  @JsonProperty("acceptedNames")
  @NotNull
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames getAcceptedNames() {
    return acceptedNames;
  }

  public void setAcceptedNames(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames acceptedNames) {
    this.acceptedNames = acceptedNames;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionStatus acceptedNames(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames acceptedNames) {
    this.acceptedNames = acceptedNames;
    return this;
  }

 /**
   * conditions indicate state for particular aspects of a CustomResourceDefinition
   * @return conditions
  **/
  @JsonProperty("conditions")
  public List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionStatus conditions(List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionStatus addConditionsItem(IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

 /**
   * storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from &#x60;spec.versions&#x60; while they exist in this list.
   * @return storedVersions
  **/
  @JsonProperty("storedVersions")
  @NotNull
  public List<String> getStoredVersions() {
    return storedVersions;
  }

  public void setStoredVersions(List<String> storedVersions) {
    this.storedVersions = storedVersions;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionStatus storedVersions(List<String> storedVersions) {
    this.storedVersions = storedVersions;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionStatus addStoredVersionsItem(String storedVersionsItem) {
    this.storedVersions.add(storedVersionsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionStatus {\n");
    
    sb.append("    acceptedNames: ").append(toIndentedString(acceptedNames)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    storedVersions: ").append(toIndentedString(storedVersions)).append("\n");
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

