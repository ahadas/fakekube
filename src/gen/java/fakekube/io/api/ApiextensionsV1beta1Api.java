package fakekube.io.api;

import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition;
import fakekube.io.model.IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionList;
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
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Kubernetes
 *
 * <p>No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ApiextensionsV1beta1Api  {

    @POST
    @Path("/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "apiextensions_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response createApiextensionsV1beta1CustomResourceDefinition(@Valid IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager);

    @DELETE
    @Path("/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "apiextensions_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response deleteApiextensionsV1beta1CollectionCustomResourceDefinition(@QueryParam("pretty") String pretty, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @Valid IoK8sApimachineryPkgApisMetaV1DeleteOptions body, @QueryParam("continue") String _continue, @QueryParam("dryRun") String dryRun, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("gracePeriodSeconds") Integer gracePeriodSeconds, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("orphanDependents") Boolean orphanDependents, @QueryParam("propagationPolicy") String propagationPolicy, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @DELETE
    @Path("/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "apiextensions_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response deleteApiextensionsV1beta1CustomResourceDefinition(@PathParam("name") String name, @QueryParam("pretty") String pretty, @Valid IoK8sApimachineryPkgApisMetaV1DeleteOptions body, @QueryParam("dryRun") String dryRun, @QueryParam("gracePeriodSeconds") Integer gracePeriodSeconds, @QueryParam("orphanDependents") Boolean orphanDependents, @QueryParam("propagationPolicy") String propagationPolicy);

    @GET
    @Path("/apis/apiextensions.k8s.io/v1beta1/")
    @Consumes({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "apiextensions_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1APIResourceList.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response getApiextensionsV1beta1APIResources();

    @GET
    @Path("/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "apiextensions_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionList.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response listApiextensionsV1beta1CustomResourceDefinition(@QueryParam("pretty") String pretty, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @PATCH
    @Path("/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}")
    @Consumes({ "application/json-patch+json", "application/merge-patch+json", "application/strategic-merge-patch+json", "application/apply-patch+yaml" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "apiextensions_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response patchApiextensionsV1beta1CustomResourceDefinition(@PathParam("name") String name, @Valid IoK8sApimachineryPkgApisMetaV1Patch body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager, @QueryParam("force") Boolean force);

    @PATCH
    @Path("/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}/status")
    @Consumes({ "application/json-patch+json", "application/merge-patch+json", "application/strategic-merge-patch+json", "application/apply-patch+yaml" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "apiextensions_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response patchApiextensionsV1beta1CustomResourceDefinitionStatus(@PathParam("name") String name, @Valid IoK8sApimachineryPkgApisMetaV1Patch body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager, @QueryParam("force") Boolean force);

    @GET
    @Path("/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "apiextensions_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response readApiextensionsV1beta1CustomResourceDefinition(@PathParam("name") String name, @QueryParam("pretty") String pretty, @QueryParam("exact") Boolean exact, @QueryParam("export") Boolean export);

    @GET
    @Path("/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}/status")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "apiextensions_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response readApiextensionsV1beta1CustomResourceDefinitionStatus(@PathParam("name") String name, @QueryParam("pretty") String pretty);

    @PUT
    @Path("/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "apiextensions_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response replaceApiextensionsV1beta1CustomResourceDefinition(@PathParam("name") String name, @Valid IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager);

    @PUT
    @Path("/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}/status")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "apiextensions_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response replaceApiextensionsV1beta1CustomResourceDefinitionStatus(@PathParam("name") String name, @Valid IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinition body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager);

    @GET
    @Path("/apis/apiextensions.k8s.io/v1beta1/watch/customresourcedefinitions/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "apiextensions_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1WatchEvent.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response watchApiextensionsV1beta1CustomResourceDefinition(@PathParam("name") String name, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("pretty") String pretty, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @GET
    @Path("/apis/apiextensions.k8s.io/v1beta1/watch/customresourcedefinitions")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "apiextensions_v1beta1" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1WatchEvent.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response watchApiextensionsV1beta1CustomResourceDefinitionList(@QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("pretty") String pretty, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);
}

