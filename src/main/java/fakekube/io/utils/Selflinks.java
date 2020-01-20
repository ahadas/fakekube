package fakekube.io.utils;

import fakekube.io.model.IoK8sApiCoreV1Node;
import fakekube.io.model.IoK8sApiCoreV1Pod;

public class Selflinks {

	public static String generate(IoK8sApiCoreV1Node node) {
		return String.format("/api/v1/nodes/%s", node.getMetadata().getName());
	}

	public static String generate(IoK8sApiCoreV1Pod pod) {
		return String.format("/api/v1/namespaces/%s/pods/%s",
				pod.getMetadata().getNamespace(),
				pod.getMetadata().getName());
	}
}
