package fakekube.io.utils;

import fakekube.io.model.IoK8sApiCoreV1Node;

public class Selflinks {

	public static String generate(IoK8sApiCoreV1Node node) {
		return String.format("/api/v1/nodes/%s", node.getMetadata().getName());
	}

}
