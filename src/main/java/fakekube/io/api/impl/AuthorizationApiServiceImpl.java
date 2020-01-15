package fakekube.io.api.impl;

import fakekube.io.api.*;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1APIGroup;

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
public class AuthorizationApiServiceImpl implements AuthorizationApi {
    public Response getAuthorizationAPIGroup() {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
}

