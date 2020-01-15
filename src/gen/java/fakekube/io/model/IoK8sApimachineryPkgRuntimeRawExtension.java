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
  * RawExtension is used to hold extensions in external versions.  To use this, make a field which has RawExtension as its type in your external, versioned struct, and Object in your internal struct. You also need to register your various plugin types.  // Internal package: type MyAPIObject struct {  runtime.TypeMeta `json:\",inline\"`  MyPlugin runtime.Object `json:\"myPlugin\"` } type PluginA struct {  AOption string `json:\"aOption\"` }  // External package: type MyAPIObject struct {  runtime.TypeMeta `json:\",inline\"`  MyPlugin runtime.RawExtension `json:\"myPlugin\"` } type PluginA struct {  AOption string `json:\"aOption\"` }  // On the wire, the JSON will look something like this: {  \"kind\":\"MyAPIObject\",  \"apiVersion\":\"v1\",  \"myPlugin\": {   \"kind\":\"PluginA\",   \"aOption\":\"foo\",  }, }  So what happens? Decode first uses json or yaml to unmarshal the serialized data into your external MyAPIObject. That causes the raw JSON to be stored, but not unpacked. The next step is to copy (using pkg/conversion) into the internal struct. The runtime package's DefaultScheme has conversion functions installed which will unpack the JSON stored in RawExtension, turning it into the correct object type, and storing it in the Object. (TODO: In the case where the object is of an unknown type, a runtime.Unknown object will be created and stored.)
 **/
@ApiModel(description="RawExtension is used to hold extensions in external versions.  To use this, make a field which has RawExtension as its type in your external, versioned struct, and Object in your internal struct. You also need to register your various plugin types.  // Internal package: type MyAPIObject struct {  runtime.TypeMeta `json:\",inline\"`  MyPlugin runtime.Object `json:\"myPlugin\"` } type PluginA struct {  AOption string `json:\"aOption\"` }  // External package: type MyAPIObject struct {  runtime.TypeMeta `json:\",inline\"`  MyPlugin runtime.RawExtension `json:\"myPlugin\"` } type PluginA struct {  AOption string `json:\"aOption\"` }  // On the wire, the JSON will look something like this: {  \"kind\":\"MyAPIObject\",  \"apiVersion\":\"v1\",  \"myPlugin\": {   \"kind\":\"PluginA\",   \"aOption\":\"foo\",  }, }  So what happens? Decode first uses json or yaml to unmarshal the serialized data into your external MyAPIObject. That causes the raw JSON to be stored, but not unpacked. The next step is to copy (using pkg/conversion) into the internal struct. The runtime package's DefaultScheme has conversion functions installed which will unpack the JSON stored in RawExtension, turning it into the correct object type, and storing it in the Object. (TODO: In the case where the object is of an unknown type, a runtime.Unknown object will be created and stored.)")
public class IoK8sApimachineryPkgRuntimeRawExtension  {
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgRuntimeRawExtension {\n");
    
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

