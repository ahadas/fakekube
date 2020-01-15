package fakekube.io.model;

import io.swagger.annotations.ApiModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
  * LimitRangeItem defines a min/max usage limit for any resource that matches on kind.
 **/
@ApiModel(description="LimitRangeItem defines a min/max usage limit for any resource that matches on kind.")
public class IoK8sApiCoreV1LimitRangeItem  {
  
  @ApiModelProperty(value = "Default resource requirement limit value by resource name if resource limit is omitted.")
 /**
   * Default resource requirement limit value by resource name if resource limit is omitted.
  **/
  private Map<String, String> _default = null;

  @ApiModelProperty(value = "DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.")
 /**
   * DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.
  **/
  private Map<String, String> defaultRequest = null;

  @ApiModelProperty(value = "Max usage constraints on this kind by resource name.")
 /**
   * Max usage constraints on this kind by resource name.
  **/
  private Map<String, String> max = null;

  @ApiModelProperty(value = "MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.")
 /**
   * MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.
  **/
  private Map<String, String> maxLimitRequestRatio = null;

  @ApiModelProperty(value = "Min usage constraints on this kind by resource name.")
 /**
   * Min usage constraints on this kind by resource name.
  **/
  private Map<String, String> min = null;

  @ApiModelProperty(value = "Type of resource that this limit applies to.")
 /**
   * Type of resource that this limit applies to.
  **/
  private String type = null;
 /**
   * Default resource requirement limit value by resource name if resource limit is omitted.
   * @return _default
  **/
  @JsonProperty("default")
  public Map<String, String> getDefault() {
    return _default;
  }

  public void setDefault(Map<String, String> _default) {
    this._default = _default;
  }

  public IoK8sApiCoreV1LimitRangeItem _default(Map<String, String> _default) {
    this._default = _default;
    return this;
  }

  public IoK8sApiCoreV1LimitRangeItem putDefaultItem(String key, String _defaultItem) {
    this._default.put(key, _defaultItem);
    return this;
  }

 /**
   * DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.
   * @return defaultRequest
  **/
  @JsonProperty("defaultRequest")
  public Map<String, String> getDefaultRequest() {
    return defaultRequest;
  }

  public void setDefaultRequest(Map<String, String> defaultRequest) {
    this.defaultRequest = defaultRequest;
  }

  public IoK8sApiCoreV1LimitRangeItem defaultRequest(Map<String, String> defaultRequest) {
    this.defaultRequest = defaultRequest;
    return this;
  }

  public IoK8sApiCoreV1LimitRangeItem putDefaultRequestItem(String key, String defaultRequestItem) {
    this.defaultRequest.put(key, defaultRequestItem);
    return this;
  }

 /**
   * Max usage constraints on this kind by resource name.
   * @return max
  **/
  @JsonProperty("max")
  public Map<String, String> getMax() {
    return max;
  }

  public void setMax(Map<String, String> max) {
    this.max = max;
  }

  public IoK8sApiCoreV1LimitRangeItem max(Map<String, String> max) {
    this.max = max;
    return this;
  }

  public IoK8sApiCoreV1LimitRangeItem putMaxItem(String key, String maxItem) {
    this.max.put(key, maxItem);
    return this;
  }

 /**
   * MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.
   * @return maxLimitRequestRatio
  **/
  @JsonProperty("maxLimitRequestRatio")
  public Map<String, String> getMaxLimitRequestRatio() {
    return maxLimitRequestRatio;
  }

  public void setMaxLimitRequestRatio(Map<String, String> maxLimitRequestRatio) {
    this.maxLimitRequestRatio = maxLimitRequestRatio;
  }

  public IoK8sApiCoreV1LimitRangeItem maxLimitRequestRatio(Map<String, String> maxLimitRequestRatio) {
    this.maxLimitRequestRatio = maxLimitRequestRatio;
    return this;
  }

  public IoK8sApiCoreV1LimitRangeItem putMaxLimitRequestRatioItem(String key, String maxLimitRequestRatioItem) {
    this.maxLimitRequestRatio.put(key, maxLimitRequestRatioItem);
    return this;
  }

 /**
   * Min usage constraints on this kind by resource name.
   * @return min
  **/
  @JsonProperty("min")
  public Map<String, String> getMin() {
    return min;
  }

  public void setMin(Map<String, String> min) {
    this.min = min;
  }

  public IoK8sApiCoreV1LimitRangeItem min(Map<String, String> min) {
    this.min = min;
    return this;
  }

  public IoK8sApiCoreV1LimitRangeItem putMinItem(String key, String minItem) {
    this.min.put(key, minItem);
    return this;
  }

 /**
   * Type of resource that this limit applies to.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiCoreV1LimitRangeItem type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1LimitRangeItem {\n");
    
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    defaultRequest: ").append(toIndentedString(defaultRequest)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    maxLimitRequestRatio: ").append(toIndentedString(maxLimitRequestRatio)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

