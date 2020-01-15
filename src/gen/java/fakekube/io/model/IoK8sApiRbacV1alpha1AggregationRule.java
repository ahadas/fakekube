package fakekube.io.model;

import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1LabelSelector;
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
  * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
 **/
@ApiModel(description="AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole")
public class IoK8sApiRbacV1alpha1AggregationRule  {
  
  @ApiModelProperty(value = "ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole's permissions will be added")
  @Valid
 /**
   * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole's permissions will be added
  **/
  private List<IoK8sApimachineryPkgApisMetaV1LabelSelector> clusterRoleSelectors = null;
 /**
   * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole&#39;s permissions will be added
   * @return clusterRoleSelectors
  **/
  @JsonProperty("clusterRoleSelectors")
  public List<IoK8sApimachineryPkgApisMetaV1LabelSelector> getClusterRoleSelectors() {
    return clusterRoleSelectors;
  }

  public void setClusterRoleSelectors(List<IoK8sApimachineryPkgApisMetaV1LabelSelector> clusterRoleSelectors) {
    this.clusterRoleSelectors = clusterRoleSelectors;
  }

  public IoK8sApiRbacV1alpha1AggregationRule clusterRoleSelectors(List<IoK8sApimachineryPkgApisMetaV1LabelSelector> clusterRoleSelectors) {
    this.clusterRoleSelectors = clusterRoleSelectors;
    return this;
  }

  public IoK8sApiRbacV1alpha1AggregationRule addClusterRoleSelectorsItem(IoK8sApimachineryPkgApisMetaV1LabelSelector clusterRoleSelectorsItem) {
    this.clusterRoleSelectors.add(clusterRoleSelectorsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiRbacV1alpha1AggregationRule {\n");
    
    sb.append("    clusterRoleSelectors: ").append(toIndentedString(clusterRoleSelectors)).append("\n");
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

