package fakekube.io.utils;

import javax.ws.rs.core.MediaType;

public class ProtobufMediaType {
	private ProtobufMediaType() {}

	public static final String MIME = "application/x-protobuf";
	public static final String KUBE_MIME = "application/com.github.proto-openapi.spec.v2@v1.0+protobuf";

	public static final MediaType MEDIA_TYPE = new MediaType("application", "x-protobuf");
	public static final MediaType KUBE_MEDIA_TYPE = new MediaType("application", "com.github.proto-openapi.spec.v2@v1.0+protobuf");
}
