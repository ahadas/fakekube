package fakekube.io.model;

import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1FieldsV1;
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
  * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
 **/
@ApiModel(description="ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.")
public class IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry  {
  
  @ApiModelProperty(value = "APIVersion defines the version of this resource that this field set applies to. The format is \"group/version\" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.")
 /**
   * APIVersion defines the version of this resource that this field set applies to. The format is \"group/version\" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
  **/
  private String apiVersion = null;

  @ApiModelProperty(value = "FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: \"FieldsV1\"")
 /**
   * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: \"FieldsV1\"
  **/
  private String fieldsType = null;

  @ApiModelProperty(value = "FieldsV1 holds the first JSON version format as described in the \"FieldsV1\" type.")
  @Valid
 /**
   * FieldsV1 holds the first JSON version format as described in the \"FieldsV1\" type.
  **/
  private IoK8sApimachineryPkgApisMetaV1FieldsV1 fieldsV1 = null;

  @ApiModelProperty(value = "Manager is an identifier of the workflow managing these fields.")
 /**
   * Manager is an identifier of the workflow managing these fields.
  **/
  private String manager = null;

  @ApiModelProperty(value = "Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.")
 /**
   * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.
  **/
  private String operation = null;

  @ApiModelProperty(value = "Time is timestamp of when these fields were set. It should always be empty if Operation is 'Apply'")
 /**
   * Time is timestamp of when these fields were set. It should always be empty if Operation is 'Apply'
  **/
  private String time = null;
 /**
   * APIVersion defines the version of this resource that this field set applies to. The format is \&quot;group/version\&quot; just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
   * @return apiVersion
  **/
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

 /**
   * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: \&quot;FieldsV1\&quot;
   * @return fieldsType
  **/
  @JsonProperty("fieldsType")
  public String getFieldsType() {
    return fieldsType;
  }

  public void setFieldsType(String fieldsType) {
    this.fieldsType = fieldsType;
  }

  public IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry fieldsType(String fieldsType) {
    this.fieldsType = fieldsType;
    return this;
  }

 /**
   * FieldsV1 holds the first JSON version format as described in the \&quot;FieldsV1\&quot; type.
   * @return fieldsV1
  **/
  @JsonProperty("fieldsV1")
  public IoK8sApimachineryPkgApisMetaV1FieldsV1 getFieldsV1() {
    return fieldsV1;
  }

  public void setFieldsV1(IoK8sApimachineryPkgApisMetaV1FieldsV1 fieldsV1) {
    this.fieldsV1 = fieldsV1;
  }

  public IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry fieldsV1(IoK8sApimachineryPkgApisMetaV1FieldsV1 fieldsV1) {
    this.fieldsV1 = fieldsV1;
    return this;
  }

 /**
   * Manager is an identifier of the workflow managing these fields.
   * @return manager
  **/
  @JsonProperty("manager")
  public String getManager() {
    return manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  public IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry manager(String manager) {
    this.manager = manager;
    return this;
  }

 /**
   * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are &#39;Apply&#39; and &#39;Update&#39;.
   * @return operation
  **/
  @JsonProperty("operation")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry operation(String operation) {
    this.operation = operation;
    return this;
  }

 /**
   * Time is timestamp of when these fields were set. It should always be empty if Operation is &#39;Apply&#39;
   * @return time
  **/
  @JsonProperty("time")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry time(String time) {
    this.time = time;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1ManagedFieldsEntry {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fieldsType: ").append(toIndentedString(fieldsType)).append("\n");
    sb.append("    fieldsV1: ").append(toIndentedString(fieldsV1)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

