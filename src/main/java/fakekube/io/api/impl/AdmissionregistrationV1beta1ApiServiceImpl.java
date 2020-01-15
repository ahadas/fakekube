package fakekube.io.api.impl;

import fakekube.io.api.*;
import fakekube.io.model.IoK8sApiAdmissionregistrationV1beta1MutatingWebhookConfiguration;
import fakekube.io.model.IoK8sApiAdmissionregistrationV1beta1MutatingWebhookConfigurationList;
import fakekube.io.model.IoK8sApiAdmissionregistrationV1beta1ValidatingWebhookConfiguration;
import fakekube.io.model.IoK8sApiAdmissionregistrationV1beta1ValidatingWebhookConfigurationList;
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
public class AdmissionregistrationV1beta1ApiServiceImpl implements AdmissionregistrationV1beta1Api {
    public Response createAdmissionregistrationV1beta1MutatingWebhookConfiguration(IoK8sApiAdmissionregistrationV1beta1MutatingWebhookConfiguration body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response createAdmissionregistrationV1beta1ValidatingWebhookConfiguration(IoK8sApiAdmissionregistrationV1beta1ValidatingWebhookConfiguration body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteAdmissionregistrationV1beta1CollectionMutatingWebhookConfiguration(String pretty, Boolean allowWatchBookmarks, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteAdmissionregistrationV1beta1CollectionValidatingWebhookConfiguration(String pretty, Boolean allowWatchBookmarks, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteAdmissionregistrationV1beta1MutatingWebhookConfiguration(String name, String pretty, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteAdmissionregistrationV1beta1ValidatingWebhookConfiguration(String name, String pretty, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response getAdmissionregistrationV1beta1APIResources() {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response listAdmissionregistrationV1beta1MutatingWebhookConfiguration(String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response listAdmissionregistrationV1beta1ValidatingWebhookConfiguration(String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response patchAdmissionregistrationV1beta1MutatingWebhookConfiguration(String name, IoK8sApimachineryPkgApisMetaV1Patch body, String pretty, String dryRun, String fieldManager, Boolean force) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response patchAdmissionregistrationV1beta1ValidatingWebhookConfiguration(String name, IoK8sApimachineryPkgApisMetaV1Patch body, String pretty, String dryRun, String fieldManager, Boolean force) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response readAdmissionregistrationV1beta1MutatingWebhookConfiguration(String name, String pretty, Boolean exact, Boolean export) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response readAdmissionregistrationV1beta1ValidatingWebhookConfiguration(String name, String pretty, Boolean exact, Boolean export) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response replaceAdmissionregistrationV1beta1MutatingWebhookConfiguration(String name, IoK8sApiAdmissionregistrationV1beta1MutatingWebhookConfiguration body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response replaceAdmissionregistrationV1beta1ValidatingWebhookConfiguration(String name, IoK8sApiAdmissionregistrationV1beta1ValidatingWebhookConfiguration body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAdmissionregistrationV1beta1MutatingWebhookConfiguration(String name, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAdmissionregistrationV1beta1MutatingWebhookConfigurationList(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAdmissionregistrationV1beta1ValidatingWebhookConfiguration(String name, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAdmissionregistrationV1beta1ValidatingWebhookConfigurationList(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
}

