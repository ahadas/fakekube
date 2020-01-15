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
  * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
 **/
@ApiModel(description="Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.")
public class IoK8sApimachineryPkgApisMetaV1Preconditions  {
  
  @ApiModelProperty(value = "Specifies the target ResourceVersion")
 /**
   * Specifies the target ResourceVersion
  **/
  private String resourceVersion = null;

  @ApiModelProperty(value = "Specifies the target UID.")
 /**
   * Specifies the target UID.
  **/
  private String uid = null;
 /**
   * Specifies the target ResourceVersion
   * @return resourceVersion
  **/
  @JsonProperty("resourceVersion")
  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public IoK8sApimachineryPkgApisMetaV1Preconditions resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

 /**
   * Specifies the target UID.
   * @return uid
  **/
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public IoK8sApimachineryPkgApisMetaV1Preconditions uid(String uid) {
    this.uid = uid;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1Preconditions {\n");
    
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

