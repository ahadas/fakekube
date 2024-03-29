package fakekube.io.api;

import fakekube.io.model.IoK8sApiAuthorizationV1LocalSubjectAccessReview;
import fakekube.io.model.IoK8sApiAuthorizationV1SelfSubjectAccessReview;
import fakekube.io.model.IoK8sApiAuthorizationV1SelfSubjectRulesReview;
import fakekube.io.model.IoK8sApiAuthorizationV1SubjectAccessReview;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1APIResourceList;

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
public interface AuthorizationV1Api  {

    @POST
    @Path("/apis/authorization.k8s.io/v1/namespaces/{namespace}/localsubjectaccessreviews")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "authorization_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiAuthorizationV1LocalSubjectAccessReview.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiAuthorizationV1LocalSubjectAccessReview.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApiAuthorizationV1LocalSubjectAccessReview.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response createAuthorizationV1NamespacedLocalSubjectAccessReview(@PathParam("namespace") String namespace, @Valid IoK8sApiAuthorizationV1LocalSubjectAccessReview body, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager, @QueryParam("pretty") String pretty);

    @POST
    @Path("/apis/authorization.k8s.io/v1/selfsubjectaccessreviews")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "authorization_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiAuthorizationV1SelfSubjectAccessReview.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiAuthorizationV1SelfSubjectAccessReview.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApiAuthorizationV1SelfSubjectAccessReview.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response createAuthorizationV1SelfSubjectAccessReview(@Valid IoK8sApiAuthorizationV1SelfSubjectAccessReview body, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager, @QueryParam("pretty") String pretty);

    @POST
    @Path("/apis/authorization.k8s.io/v1/selfsubjectrulesreviews")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "authorization_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiAuthorizationV1SelfSubjectRulesReview.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiAuthorizationV1SelfSubjectRulesReview.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApiAuthorizationV1SelfSubjectRulesReview.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response createAuthorizationV1SelfSubjectRulesReview(@Valid IoK8sApiAuthorizationV1SelfSubjectRulesReview body, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager, @QueryParam("pretty") String pretty);

    @POST
    @Path("/apis/authorization.k8s.io/v1/subjectaccessreviews")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "authorization_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiAuthorizationV1SubjectAccessReview.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiAuthorizationV1SubjectAccessReview.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApiAuthorizationV1SubjectAccessReview.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response createAuthorizationV1SubjectAccessReview(@Valid IoK8sApiAuthorizationV1SubjectAccessReview body, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager, @QueryParam("pretty") String pretty);

    @GET
    @Path("/apis/authorization.k8s.io/v1/")
    @Consumes({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "authorization_v1" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1APIResourceList.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response getAuthorizationV1APIResources();
}

