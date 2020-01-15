package fakekube.io.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import io.kubernetes.client.openapi.JSON;

public class ResourceReader {
	private static final Logger LOGGER = Logger.getLogger(ResourceReader.class.getName());

	public ResourceReader() {
	}

	public <T> T read(String path, Class<T> classOfT) {
		try {
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path);
			byte[] bytes = new byte[inputStream.available()];
			inputStream.read(bytes);
			String str = new String(bytes);
			return new JSON().getGson().fromJson(str, classOfT);
		} catch (IOException e) {
			LOGGER.severe("failed to load APIResourceList, return empty list");
			return null;
		}
	}
}
