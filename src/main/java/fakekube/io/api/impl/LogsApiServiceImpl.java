package fakekube.io.api.impl;

import fakekube.io.api.*;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Kubernetes
 *
 * <p>No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 */
public class LogsApiServiceImpl implements LogsApi {
    public Response logFileHandler(String logpath) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response logFileListHandler() {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
}

