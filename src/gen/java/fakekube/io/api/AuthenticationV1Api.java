package fakekube.io.api;

import fakekube.io.model.IoK8sApiAuthenticationV1TokenReview;
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
public interface AuthenticationV1Api  {

    @POST
    @Path("/apis/authentication.k8s.io/v1/tokenreviews")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "authentication_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiAuthenticationV1TokenReview.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiAuthenticationV1TokenReview.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApiAuthenticationV1TokenReview.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response createAuthenticationV1TokenReview(@Valid IoK8sApiAuthenticationV1TokenReview body, @QueryParam("dryRun") String dryRun, @QueryParam("fieldManager") String fieldManager, @QueryParam("pretty") String pretty);

    @GET
    @Path("/apis/authentication.k8s.io/v1/")
    @Consumes({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "authentication_v1" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1APIResourceList.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response getAuthenticationV1APIResources();
}

