package fakekube.io.api;

import fakekube.io.model.IoK8sApiStorageV1beta1CSIDriver;
import fakekube.io.model.IoK8sApiStorageV1beta1CSIDriverList;
import fakekube.io.model.IoK8sApiStorageV1beta1CSINode;
import fakekube.io.model.IoK8sApiStorageV1beta1CSINodeList;
import fakekube.io.model.IoK8sApiStorageV1beta1StorageClass;
import fakekube.io.model.IoK8sApiStorageV1beta1StorageClassList;
import fakekube.io.model.IoK8sApiStorageV1beta1VolumeAttachment;
import fakekube.io.model.IoK8sApiStorageV1beta1VolumeAttachmentList;
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
public interface StorageV1beta1Api  {

    @POST
    @Path("/apis/storage.k8s.io/v1beta1/csidrivers")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1CSIDriver.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiStorageV1beta1CSIDriver.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApiStorageV1beta1CSIDriver.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response createStorageV1beta1CSIDriver(@Valid IoK8sApiStorageV1beta1CSIDriver body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager);

    @POST
    @Path("/apis/storage.k8s.io/v1beta1/csinodes")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1CSINode.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiStorageV1beta1CSINode.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApiStorageV1beta1CSINode.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response createStorageV1beta1CSINode(@Valid IoK8sApiStorageV1beta1CSINode body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager);

    @POST
    @Path("/apis/storage.k8s.io/v1beta1/storageclasses")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1StorageClass.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiStorageV1beta1StorageClass.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApiStorageV1beta1StorageClass.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response createStorageV1beta1StorageClass(@Valid IoK8sApiStorageV1beta1StorageClass body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager);

    @POST
    @Path("/apis/storage.k8s.io/v1beta1/volumeattachments")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1VolumeAttachment.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiStorageV1beta1VolumeAttachment.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApiStorageV1beta1VolumeAttachment.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response createStorageV1beta1VolumeAttachment(@Valid IoK8sApiStorageV1beta1VolumeAttachment body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager);

    @DELETE
    @Path("/apis/storage.k8s.io/v1beta1/csidrivers/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response deleteStorageV1beta1CSIDriver(@PathParam("name") String name, @QueryParam("pretty") String pretty, @Valid IoK8sApimachineryPkgApisMetaV1DeleteOptions body, @QueryParam("dryRun") String dryRun, @QueryParam("gracePeriodSeconds") Integer gracePeriodSeconds, @QueryParam("orphanDependents") Boolean orphanDependents, @QueryParam("propagationPolicy") String propagationPolicy);

    @DELETE
    @Path("/apis/storage.k8s.io/v1beta1/csinodes/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response deleteStorageV1beta1CSINode(@PathParam("name") String name, @QueryParam("pretty") String pretty, @Valid IoK8sApimachineryPkgApisMetaV1DeleteOptions body, @QueryParam("dryRun") String dryRun, @QueryParam("gracePeriodSeconds") Integer gracePeriodSeconds, @QueryParam("orphanDependents") Boolean orphanDependents, @QueryParam("propagationPolicy") String propagationPolicy);

    @DELETE
    @Path("/apis/storage.k8s.io/v1beta1/csidrivers")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response deleteStorageV1beta1CollectionCSIDriver(@QueryParam("pretty") String pretty, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @Valid IoK8sApimachineryPkgApisMetaV1DeleteOptions body, @QueryParam("continue") String _continue, @QueryParam("dryRun") String dryRun, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("gracePeriodSeconds") Integer gracePeriodSeconds, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("orphanDependents") Boolean orphanDependents, @QueryParam("propagationPolicy") String propagationPolicy, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @DELETE
    @Path("/apis/storage.k8s.io/v1beta1/csinodes")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response deleteStorageV1beta1CollectionCSINode(@QueryParam("pretty") String pretty, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @Valid IoK8sApimachineryPkgApisMetaV1DeleteOptions body, @QueryParam("continue") String _continue, @QueryParam("dryRun") String dryRun, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("gracePeriodSeconds") Integer gracePeriodSeconds, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("orphanDependents") Boolean orphanDependents, @QueryParam("propagationPolicy") String propagationPolicy, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @DELETE
    @Path("/apis/storage.k8s.io/v1beta1/storageclasses")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response deleteStorageV1beta1CollectionStorageClass(@QueryParam("pretty") String pretty, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @Valid IoK8sApimachineryPkgApisMetaV1DeleteOptions body, @QueryParam("continue") String _continue, @QueryParam("dryRun") String dryRun, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("gracePeriodSeconds") Integer gracePeriodSeconds, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("orphanDependents") Boolean orphanDependents, @QueryParam("propagationPolicy") String propagationPolicy, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @DELETE
    @Path("/apis/storage.k8s.io/v1beta1/volumeattachments")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response deleteStorageV1beta1CollectionVolumeAttachment(@QueryParam("pretty") String pretty, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @Valid IoK8sApimachineryPkgApisMetaV1DeleteOptions body, @QueryParam("continue") String _continue, @QueryParam("dryRun") String dryRun, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("gracePeriodSeconds") Integer gracePeriodSeconds, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("orphanDependents") Boolean orphanDependents, @QueryParam("propagationPolicy") String propagationPolicy, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @DELETE
    @Path("/apis/storage.k8s.io/v1beta1/storageclasses/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response deleteStorageV1beta1StorageClass(@PathParam("name") String name, @QueryParam("pretty") String pretty, @Valid IoK8sApimachineryPkgApisMetaV1DeleteOptions body, @QueryParam("dryRun") String dryRun, @QueryParam("gracePeriodSeconds") Integer gracePeriodSeconds, @QueryParam("orphanDependents") Boolean orphanDependents, @QueryParam("propagationPolicy") String propagationPolicy);

    @DELETE
    @Path("/apis/storage.k8s.io/v1beta1/volumeattachments/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApimachineryPkgApisMetaV1Status.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response deleteStorageV1beta1VolumeAttachment(@PathParam("name") String name, @QueryParam("pretty") String pretty, @Valid IoK8sApimachineryPkgApisMetaV1DeleteOptions body, @QueryParam("dryRun") String dryRun, @QueryParam("gracePeriodSeconds") Integer gracePeriodSeconds, @QueryParam("orphanDependents") Boolean orphanDependents, @QueryParam("propagationPolicy") String propagationPolicy);

    @GET
    @Path("/apis/storage.k8s.io/v1beta1/")
    @Consumes({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1APIResourceList.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response getStorageV1beta1APIResources();

    @GET
    @Path("/apis/storage.k8s.io/v1beta1/csidrivers")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1CSIDriverList.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response listStorageV1beta1CSIDriver(@QueryParam("pretty") String pretty, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @GET
    @Path("/apis/storage.k8s.io/v1beta1/csinodes")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1CSINodeList.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response listStorageV1beta1CSINode(@QueryParam("pretty") String pretty, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @GET
    @Path("/apis/storage.k8s.io/v1beta1/storageclasses")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1StorageClassList.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response listStorageV1beta1StorageClass(@QueryParam("pretty") String pretty, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @GET
    @Path("/apis/storage.k8s.io/v1beta1/volumeattachments")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1VolumeAttachmentList.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response listStorageV1beta1VolumeAttachment(@QueryParam("pretty") String pretty, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @PATCH
    @Path("/apis/storage.k8s.io/v1beta1/csidrivers/{name}")
    @Consumes({ "application/json-patch+json", "application/merge-patch+json", "application/strategic-merge-patch+json", "application/apply-patch+yaml" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1CSIDriver.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response patchStorageV1beta1CSIDriver(@PathParam("name") String name, @Valid IoK8sApimachineryPkgApisMetaV1Patch body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager, @QueryParam("force") Boolean force);

    @PATCH
    @Path("/apis/storage.k8s.io/v1beta1/csinodes/{name}")
    @Consumes({ "application/json-patch+json", "application/merge-patch+json", "application/strategic-merge-patch+json", "application/apply-patch+yaml" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1CSINode.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response patchStorageV1beta1CSINode(@PathParam("name") String name, @Valid IoK8sApimachineryPkgApisMetaV1Patch body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager, @QueryParam("force") Boolean force);

    @PATCH
    @Path("/apis/storage.k8s.io/v1beta1/storageclasses/{name}")
    @Consumes({ "application/json-patch+json", "application/merge-patch+json", "application/strategic-merge-patch+json", "application/apply-patch+yaml" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1StorageClass.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response patchStorageV1beta1StorageClass(@PathParam("name") String name, @Valid IoK8sApimachineryPkgApisMetaV1Patch body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager, @QueryParam("force") Boolean force);

    @PATCH
    @Path("/apis/storage.k8s.io/v1beta1/volumeattachments/{name}")
    @Consumes({ "application/json-patch+json", "application/merge-patch+json", "application/strategic-merge-patch+json", "application/apply-patch+yaml" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1VolumeAttachment.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response patchStorageV1beta1VolumeAttachment(@PathParam("name") String name, @Valid IoK8sApimachineryPkgApisMetaV1Patch body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager, @QueryParam("force") Boolean force);

    @GET
    @Path("/apis/storage.k8s.io/v1beta1/csidrivers/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1CSIDriver.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response readStorageV1beta1CSIDriver(@PathParam("name") String name, @QueryParam("pretty") String pretty, @QueryParam("exact") Boolean exact, @QueryParam("export") Boolean export);

    @GET
    @Path("/apis/storage.k8s.io/v1beta1/csinodes/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1CSINode.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response readStorageV1beta1CSINode(@PathParam("name") String name, @QueryParam("pretty") String pretty, @QueryParam("exact") Boolean exact, @QueryParam("export") Boolean export);

    @GET
    @Path("/apis/storage.k8s.io/v1beta1/storageclasses/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1StorageClass.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response readStorageV1beta1StorageClass(@PathParam("name") String name, @QueryParam("pretty") String pretty, @QueryParam("exact") Boolean exact, @QueryParam("export") Boolean export);

    @GET
    @Path("/apis/storage.k8s.io/v1beta1/volumeattachments/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1VolumeAttachment.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response readStorageV1beta1VolumeAttachment(@PathParam("name") String name, @QueryParam("pretty") String pretty, @QueryParam("exact") Boolean exact, @QueryParam("export") Boolean export);

    @PUT
    @Path("/apis/storage.k8s.io/v1beta1/csidrivers/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1CSIDriver.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiStorageV1beta1CSIDriver.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response replaceStorageV1beta1CSIDriver(@PathParam("name") String name, @Valid IoK8sApiStorageV1beta1CSIDriver body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager);

    @PUT
    @Path("/apis/storage.k8s.io/v1beta1/csinodes/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1CSINode.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiStorageV1beta1CSINode.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response replaceStorageV1beta1CSINode(@PathParam("name") String name, @Valid IoK8sApiStorageV1beta1CSINode body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager);

    @PUT
    @Path("/apis/storage.k8s.io/v1beta1/storageclasses/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1StorageClass.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiStorageV1beta1StorageClass.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response replaceStorageV1beta1StorageClass(@PathParam("name") String name, @Valid IoK8sApiStorageV1beta1StorageClass body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager);

    @PUT
    @Path("/apis/storage.k8s.io/v1beta1/volumeattachments/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiStorageV1beta1VolumeAttachment.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiStorageV1beta1VolumeAttachment.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response replaceStorageV1beta1VolumeAttachment(@PathParam("name") String name, @Valid IoK8sApiStorageV1beta1VolumeAttachment body, @QueryParam("pretty") String pretty, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager);

    @GET
    @Path("/apis/storage.k8s.io/v1beta1/watch/csidrivers/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1WatchEvent.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response watchStorageV1beta1CSIDriver(@PathParam("name") String name, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("pretty") String pretty, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @GET
    @Path("/apis/storage.k8s.io/v1beta1/watch/csidrivers")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1WatchEvent.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response watchStorageV1beta1CSIDriverList(@QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("pretty") String pretty, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @GET
    @Path("/apis/storage.k8s.io/v1beta1/watch/csinodes/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1WatchEvent.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response watchStorageV1beta1CSINode(@PathParam("name") String name, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("pretty") String pretty, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @GET
    @Path("/apis/storage.k8s.io/v1beta1/watch/csinodes")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1WatchEvent.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response watchStorageV1beta1CSINodeList(@QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("pretty") String pretty, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @GET
    @Path("/apis/storage.k8s.io/v1beta1/watch/storageclasses/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1WatchEvent.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response watchStorageV1beta1StorageClass(@PathParam("name") String name, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("pretty") String pretty, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @GET
    @Path("/apis/storage.k8s.io/v1beta1/watch/storageclasses")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1WatchEvent.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response watchStorageV1beta1StorageClassList(@QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("pretty") String pretty, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @GET
    @Path("/apis/storage.k8s.io/v1beta1/watch/volumeattachments/{name}")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "storage_v1beta1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1WatchEvent.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response watchStorageV1beta1VolumeAttachment(@PathParam("name") String name, @QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("pretty") String pretty, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);

    @GET
    @Path("/apis/storage.k8s.io/v1beta1/watch/volumeattachments")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch" })
    @ApiOperation(value = "", tags={ "storage_v1beta1" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1WatchEvent.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response watchStorageV1beta1VolumeAttachmentList(@QueryParam("allowWatchBookmarks") Boolean allowWatchBookmarks, @QueryParam("continue") String _continue, @QueryParam("fieldSelector") String fieldSelector, @QueryParam("labelSelector") String labelSelector, @QueryParam("limit") Integer limit, @QueryParam("pretty") String pretty, @QueryParam("resourceVersion") String resourceVersion, @QueryParam("timeoutSeconds") Integer timeoutSeconds, @QueryParam("watch") Boolean watch);
}

