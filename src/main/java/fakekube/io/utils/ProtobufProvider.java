package fakekube.io.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.google.protobuf.Message;
import com.google.protobuf.Struct;

import fakekube.io.api.impl.CoreV1ApiServiceImpl;
import fakekube.io.openapi.api.Openapi;

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
  private static final Logger LOGGER = Logger.getLogger(CoreV1ApiServiceImpl.class.getName());

  @Override
  public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
    return false;
  }

  @Override
  public Object readFrom(Class<Object> type,
                         Type genericType,
                         Annotation[] annotations,
                         MediaType mediaType,
                         MultivaluedMap<String, String> httpHeaders,
                         InputStream entityStream) throws IOException, WebApplicationException {
    return null;
  }

  @Override
  public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
	  return Openapi.class == type;
  }

  @Override
  public long getSize(Object o, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
	  return -1;
  }

  @Override
  public void writeTo(Object o,
                      Class<?> type,
                      Type genericType,
                      Annotation[] annotations,
                      MediaType mediaType,
                      MultivaluedMap<String, Object> httpHeaders,
                      OutputStream entityStream) throws IOException, WebApplicationException {
	  Message.Builder builder = Struct.newBuilder();
	  Openapi openapi = (Openapi) o;
	  new com.googlecode.protobuf.format.JsonFormat().merge(openapi.toInputStream(), builder);
	  entityStream.write(builder.build().toByteArray());
  }
}
