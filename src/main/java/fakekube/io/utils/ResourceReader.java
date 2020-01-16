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
		String str = read(path);
		return str != null ? new JSON().getGson().fromJson(str, classOfT) : null;
	}

	public String read(String path) {
		try {
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path);
			byte[] bytes = new byte[inputStream.available()];
			inputStream.read(bytes);
			return new String(bytes);
		} catch (IOException e) {
			LOGGER.severe("failed to load APIResourceList, return empty list");
			return null;
		}
	}
}
