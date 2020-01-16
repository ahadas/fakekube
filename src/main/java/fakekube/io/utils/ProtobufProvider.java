package fakekube.io.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Struct;

/**
 * Basic implementation of JAX-RS abstractions:
 * <ul>
 *   <li>{@link MessageBodyReader}</li>
 *   <li>{@link MessageBodyWriter}</li>
 * </ul>
 *
 * @author Alexander Shabanov
 */
@Provider
@Consumes({ProtobufMediaType.MIME, ProtobufMediaType.KUBE_MIME, MediaType.APPLICATION_OCTET_STREAM})
@Produces({ProtobufMediaType.MIME, ProtobufMediaType.KUBE_MIME, MediaType.APPLICATION_OCTET_STREAM})
public class ProtobufProvider implements MessageBodyReader<Object>, MessageBodyWriter<Object> {

  private final Map<Class<?>, Method> parseMethods = new ConcurrentHashMap<>();

  @Override
  public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
	  Logger.getLogger("abc").info("arik2: " + type);
    return MessageLite.class.isAssignableFrom(type) && isSupportedMediaType(mediaType);
  }

  @Override
  public Object readFrom(Class<Object> type,
                         Type genericType,
                         Annotation[] annotations,
                         MediaType mediaType,
                         MultivaluedMap<String, String> httpHeaders,
                         InputStream entityStream) throws IOException, WebApplicationException {
    final Method parseMethod = getParseMethod(type);
    try {
      return parseMethod.invoke(null, entityStream);
    } catch (IllegalAccessException | InvocationTargetException e) {
      throw new IllegalStateException(e); // normally shouldn't happen
    }
  }

  @Override
  public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
	  Logger.getLogger("abc").info("arik3: " + type);
    return JsonObject.class.isAssignableFrom(type) && isSupportedMediaType(mediaType);
  }

  @Override
  public long getSize(Object o, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
	  Message.Builder b = Struct.newBuilder();
	  JsonObject obj = (JsonObject) o;
	  String str = new Gson().toJson(obj);
	  InputStream targetStream = new ByteArrayInputStream(str.getBytes());
	  try {
		new com.googlecode.protobuf.format.JsonFormat().merge(targetStream, b);
		b.build().getSerializedSize();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return 0;
  }

  @Override
  public void writeTo(Object o,
                      Class<?> type,
                      Type genericType,
                      Annotation[] annotations,
                      MediaType mediaType,
                      MultivaluedMap<String, Object> httpHeaders,
                      OutputStream entityStream) throws IOException, WebApplicationException {
	  Message.Builder b = Struct.newBuilder();
	  JsonObject obj = (JsonObject) o;
	  String str = new Gson().toJson(obj);
	  InputStream targetStream = new ByteArrayInputStream(str.getBytes());
	  new com.googlecode.protobuf.format.JsonFormat().merge(targetStream, b);
	  entityStream.write(b.build().toByteArray());
//	  b.build().tobwriteTo(entityStream);
  }

  //
  // Protected
  //

  protected boolean isSupportedMediaType(MediaType mediaType) {
	Logger.getLogger("aa").info("arik: " + mediaType);
    return mediaType == null || MediaType.APPLICATION_OCTET_STREAM_TYPE.equals(mediaType) ||
    		ProtobufMediaType.MEDIA_TYPE.isCompatible(mediaType) || ProtobufMediaType.KUBE_MEDIA_TYPE.isCompatible(mediaType);
  }

  protected Method getParseMethod(Class<?> clazz) {
    // short circuit
    final Method m = parseMethods.get(clazz);
    if (m != null) {
      return m;
    }

    // find method and put it to the map
    try {
      final Method method = clazz.getMethod(getParseFromInputStreamMethodName(), InputStream.class);

      // save to cache
      parseMethods.put(clazz, method);

      // return
      return method;
    } catch (NoSuchMethodException e) {
      throw new IllegalStateException("No method parseFrom for class=" + clazz);
    }
  }

  protected void writeTo(@Nullable MessageLite message, @Nonnull OutputStream entityStream) throws IOException {
    if (message == null) {
      return;
    }

    message.writeTo(entityStream);
  }

  @Nonnull
  protected String getParseFromInputStreamMethodName() {
    return "parseFrom";
  }
}
