package fakekube.io.api;

import fakekube.io.model.IoK8sApiNetworkingV1NetworkPolicy;
import fakekube.io.model.IoK8sApiNetworkingV1NetworkPolicyList;
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
public interface NetworkingV1Api  {

    @POST
    @Path("/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "networking_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiNetworkingV1NetworkPolicy.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiNetworkingV1NetworkPolicy.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApiNetworkingV1NetworkPolicy.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response createNetworkingV1NamespacedNetworkPolicy(@PathParam("namespace") String namespace, @Valid IoK8sApiNetworkingV1NetworkPolicy body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager);

    @DELETE
    @Path("/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "networking_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response deleteNetworkingV1CollectionNamespacedNetworkPolicy(@PathParam("namespace") String namespace, @QueryParam("pretty") String pretty, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @Valid IoK8sApimachineryPkgApisMetaV1DeleteOptions body, @QueryParam("continue") String _continue, @QueryParam("dryRun") String dryRun, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("gracePeriodSeconds") Integer gracePeriodSeconds, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("orphanDependents") Boolean orphanDependents, @QueryParam("propagationPolicy") String propagationPolicy, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @DELETE
    @Path("/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "networking_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response deleteNetworkingV1NamespacedNetworkPolicy(@PathParam("name") String name, @PathParam("namespace") String namespace, @QueryParam("pretty") String pretty, @Valid IoK8sApimachineryPkgApisMetaV1DeleteOptions body, @QueryParam("dryRun") String dryRun, @QueryParam("gracePeriodSeconds") Integer gracePeriodSeconds, @QueryParam("orphanDependents") Boolean orphanDependents, @QueryParam("propagationPolicy") String propagationPolicy);

    @GET
    @Path("/apis/networking.k8s.io/v1/")
    @Consumes({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "networking_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1APIResourceList.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response getNetworkingV1APIResources();

    @GET
    @Path("/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "networking_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiNetworkingV1NetworkPolicyList.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response listNetworkingV1NamespacedNetworkPolicy(@PathParam("namespace") String namespace, @QueryParam("pretty") String pretty, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @GET
    @Path("/apis/networking.k8s.io/v1/networkpolicies")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "networking_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiNetworkingV1NetworkPolicyList.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response listNetworkingV1NetworkPolicyForAllNamespaces(@QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("pretty") String pretty, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @PATCH
    @Path("/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies/{name}")
    @Consumes({ "application/json-patch+json", "application/merge-patch+json", "application/strategic-merge-patch+json", "application/apply-patch+yaml" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "networking_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiNetworkingV1NetworkPolicy.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response patchNetworkingV1NamespacedNetworkPolicy(@PathParam("name") String name, @PathParam("namespace") String namespace, @Valid IoK8sApimachineryPkgApisMetaV1Patch body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager, @QueryParam("force") Boolean force);

    @GET
    @Path("/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "networking_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiNetworkingV1NetworkPolicy.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response readNetworkingV1NamespacedNetworkPolicy(@PathParam("name") String name, @PathParam("namespace") String namespace, @QueryParam("pretty") String pretty, @QueryParam("exact") Boolean exact, @QueryParam("export") Boolean export);

    @PUT
    @Path("/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "networking_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiNetworkingV1NetworkPolicy.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiNetworkingV1NetworkPolicy.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response replaceNetworkingV1NamespacedNetworkPolicy(@PathParam("name") String name, @PathParam("namespace") String namespace, @Valid IoK8sApiNetworkingV1NetworkPolicy body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager);

    @GET
    @Path("/apis/networking.k8s.io/v1/watch/namespaces/{namespace}/networkpolicies/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "networking_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1WatchEvent.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response watchNetworkingV1NamespacedNetworkPolicy(@PathParam("name") String name, @PathParam("namespace") String namespace, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("pretty") String pretty, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @GET
    @Path("/apis/networking.k8s.io/v1/watch/namespaces/{namespace}/networkpolicies")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "networking_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1WatchEvent.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response watchNetworkingV1NamespacedNetworkPolicyList(@PathParam("namespace") String namespace, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("pretty") String pretty, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @GET
    @Path("/apis/networking.k8s.io/v1/watch/networkpolicies")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "networking_v1" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1WatchEvent.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response watchNetworkingV1NetworkPolicyListForAllNamespaces(@QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("pretty") String pretty, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);
}

