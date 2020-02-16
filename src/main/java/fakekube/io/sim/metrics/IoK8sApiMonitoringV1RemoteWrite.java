package fakekube.io.sim.metrics;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="TBD")
public class IoK8sApiMonitoringV1RemoteWrite {

	@ApiModelProperty(value = "Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)")
	private String url = null;

	  @JsonProperty("url")
	  public String getUrl() {
	    return url;
	  }

	  public void setUrl(String url) {
	    this.url = url;
	  }

	  public IoK8sApiMonitoringV1RemoteWrite url(String url) {
	    this.url = url;
	    return this;
	  }

}
