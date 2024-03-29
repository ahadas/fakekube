package fakekube.io.api;

import fakekube.io.model.IoK8sApiCoordinationV1beta1Lease;
import fakekube.io.model.IoK8sApiCoordinationV1beta1LeaseList;
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
public interface CoordinationV1beta1Api  {

    @POST
    @Path("/apis/coordination.k8s.io/v1beta1/namespaces/{namespace}/leases")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "coordination_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiCoordinationV1beta1Lease.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiCoordinationV1beta1Lease.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApiCoordinationV1beta1Lease.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response createCoordinationV1beta1NamespacedLease(@PathParam("namespace") String namespace, @Valid IoK8sApiCoordinationV1beta1Lease body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager);

    @DELETE
    @Path("/apis/coordination.k8s.io/v1beta1/namespaces/{namespace}/leases")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "coordination_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response deleteCoordinationV1beta1CollectionNamespacedLease(@PathParam("namespace") String namespace, @QueryParam("pretty") String pretty, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @Valid IoK8sApimachineryPkgApisMetaV1DeleteOptions body, @QueryParam("continue") String _continue, @QueryParam("dryRun") String dryRun, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("gracePeriodSeconds") Integer gracePeriodSeconds, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("orphanDependents") Boolean orphanDependents, @QueryParam("propagationPolicy") String propagationPolicy, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @DELETE
    @Path("/apis/coordination.k8s.io/v1beta1/namespaces/{namespace}/leases/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "coordination_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response deleteCoordinationV1beta1NamespacedLease(@PathParam("name") String name, @PathParam("namespace") String namespace, @QueryParam("pretty") String pretty, @Valid IoK8sApimachineryPkgApisMetaV1DeleteOptions body, @QueryParam("dryRun") String dryRun, @QueryParam("gracePeriodSeconds") Integer gracePeriodSeconds, @QueryParam("orphanDependents") Boolean orphanDependents, @QueryParam("propagationPolicy") String propagationPolicy);

    @GET
    @Path("/apis/coordination.k8s.io/v1beta1/")
    @Consumes({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "coordination_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1APIResourceList.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response getCoordinationV1beta1APIResources();

    @GET
    @Path("/apis/coordination.k8s.io/v1beta1/leases")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "coordination_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiCoordinationV1beta1LeaseList.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response listCoordinationV1beta1LeaseForAllNamespaces(@QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("pretty") String pretty, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @GET
    @Path("/apis/coordination.k8s.io/v1beta1/namespaces/{namespace}/leases")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "coordination_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiCoordinationV1beta1LeaseList.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response listCoordinationV1beta1NamespacedLease(@PathParam("namespace") String namespace, @QueryParam("pretty") String pretty, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @PATCH
    @Path("/apis/coordination.k8s.io/v1beta1/namespaces/{namespace}/leases/{name}")
    @Consumes({ "application/json-patch+json", "application/merge-patch+json", "application/strategic-merge-patch+json", "application/apply-patch+yaml" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "coordination_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiCoordinationV1beta1Lease.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response patchCoordinationV1beta1NamespacedLease(@PathParam("name") String name, @PathParam("namespace") String namespace, @Valid IoK8sApimachineryPkgApisMetaV1Patch body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager, @QueryParam("force") Boolean force);

    @GET
    @Path("/apis/coordination.k8s.io/v1beta1/namespaces/{namespace}/leases/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "coordination_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiCoordinationV1beta1Lease.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response readCoordinationV1beta1NamespacedLease(@PathParam("name") String name, @PathParam("namespace") String namespace, @QueryParam("pretty") String pretty, @QueryParam("exact") Boolean exact, @QueryParam("export") Boolean export);

    @PUT
    @Path("/apis/coordination.k8s.io/v1beta1/namespaces/{namespace}/leases/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "coordination_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiCoordinationV1beta1Lease.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiCoordinationV1beta1Lease.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response replaceCoordinationV1beta1NamespacedLease(@PathParam("name") String name, @PathParam("namespace") String namespace, @Valid IoK8sApiCoordinationV1beta1Lease body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager);

    @GET
    @Path("/apis/coordination.k8s.io/v1beta1/watch/leases")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "coordination_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1WatchEvent.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response watchCoordinationV1beta1LeaseListForAllNamespaces(@QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("pretty") String pretty, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @GET
    @Path("/apis/coordination.k8s.io/v1beta1/watch/namespaces/{namespace}/leases/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "coordination_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1WatchEvent.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response watchCoordinationV1beta1NamespacedLease(@PathParam("name") String name, @PathParam("namespace") String namespace, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("pretty") String pretty, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @GET
    @Path("/apis/coordination.k8s.io/v1beta1/watch/namespaces/{namespace}/leases")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "coordination_v1beta1" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1WatchEvent.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response watchCoordinationV1beta1NamespacedLeaseList(@PathParam("namespace") String namespace, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("pretty") String pretty, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);
}

