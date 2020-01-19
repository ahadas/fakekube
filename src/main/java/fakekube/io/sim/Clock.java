package fakekube.io.sim;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import org.joda.time.DateTime;

@Named
@ApplicationScoped
public class Clock {

	private DateTime creation;

	protected void init() {
		creation = DateTime.now();
	}

	public String creationTimestamp() {
		return creation.toString();
	}
}
