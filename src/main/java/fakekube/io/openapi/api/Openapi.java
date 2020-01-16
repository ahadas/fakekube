package fakekube.io.openapi.api;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Openapi {

	private String specification;

	public Openapi(String specification) {
		this.specification = specification;
	}

	public InputStream toInputStream() {
		return new ByteArrayInputStream(specification.getBytes());
	}
}
