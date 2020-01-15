package fakekube.io.model;

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
  * IPBlock describes a particular CIDR (Ex. \"192.168.1.1/24\",\"2001:db9::/64\") that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should not be included within this rule.
 **/
@ApiModel(description="IPBlock describes a particular CIDR (Ex. \"192.168.1.1/24\",\"2001:db9::/64\") that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should not be included within this rule.")
public class IoK8sApiNetworkingV1IPBlock  {
  
  @ApiModelProperty(required = true, value = "CIDR is a string representing the IP Block Valid examples are \"192.168.1.1/24\" or \"2001:db9::/64\"")
 /**
   * CIDR is a string representing the IP Block Valid examples are \"192.168.1.1/24\" or \"2001:db9::/64\"
  **/
  private String cidr = null;

  @ApiModelProperty(value = "Except is a slice of CIDRs that should not be included within an IP Block Valid examples are \"192.168.1.1/24\" or \"2001:db9::/64\" Except values will be rejected if they are outside the CIDR range")
 /**
   * Except is a slice of CIDRs that should not be included within an IP Block Valid examples are \"192.168.1.1/24\" or \"2001:db9::/64\" Except values will be rejected if they are outside the CIDR range
  **/
  private List<String> except = null;
 /**
   * CIDR is a string representing the IP Block Valid examples are \&quot;192.168.1.1/24\&quot; or \&quot;2001:db9::/64\&quot;
   * @return cidr
  **/
  @JsonProperty("cidr")
  @NotNull
  public String getCidr() {
    return cidr;
  }

  public void setCidr(String cidr) {
    this.cidr = cidr;
  }

  public IoK8sApiNetworkingV1IPBlock cidr(String cidr) {
    this.cidr = cidr;
    return this;
  }

 /**
   * Except is a slice of CIDRs that should not be included within an IP Block Valid examples are \&quot;192.168.1.1/24\&quot; or \&quot;2001:db9::/64\&quot; Except values will be rejected if they are outside the CIDR range
   * @return except
  **/
  @JsonProperty("except")
  public List<String> getExcept() {
    return except;
  }

  public void setExcept(List<String> except) {
    this.except = except;
  }

  public IoK8sApiNetworkingV1IPBlock except(List<String> except) {
    this.except = except;
    return this;
  }

  public IoK8sApiNetworkingV1IPBlock addExceptItem(String exceptItem) {
    this.except.add(exceptItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiNetworkingV1IPBlock {\n");
    
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    except: ").append(toIndentedString(except)).append("\n");
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

