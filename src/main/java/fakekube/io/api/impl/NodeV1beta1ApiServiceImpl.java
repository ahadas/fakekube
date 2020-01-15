package fakekube.io.api.impl;

import fakekube.io.api.*;
import fakekube.io.model.IoK8sApiNodeV1beta1RuntimeClass;
import fakekube.io.model.IoK8sApiNodeV1beta1RuntimeClassList;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1APIResourceList;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1DeleteOptions;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1Patch;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1Status;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1WatchEvent;

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
public class NodeV1beta1ApiServiceImpl implements NodeV1beta1Api {
    public Response createNodeV1beta1RuntimeClass(IoK8sApiNodeV1beta1RuntimeClass body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteNodeV1beta1CollectionRuntimeClass(String pretty, Boolean allowWatchBookmarks, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteNodeV1beta1RuntimeClass(String name, String pretty, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response getNodeV1beta1APIResources() {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response listNodeV1beta1RuntimeClass(String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response patchNodeV1beta1RuntimeClass(String name, IoK8sApimachineryPkgApisMetaV1Patch body, String pretty, String dryRun, String fieldManager, Boolean force) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response readNodeV1beta1RuntimeClass(String name, String pretty, Boolean exact, Boolean export) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response replaceNodeV1beta1RuntimeClass(String name, IoK8sApiNodeV1beta1RuntimeClass body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchNodeV1beta1RuntimeClass(String name, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchNodeV1beta1RuntimeClassList(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
}

