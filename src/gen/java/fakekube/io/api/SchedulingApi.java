package fakekube.io.api;

import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1APIGroup;

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
public interface SchedulingApi  {

    @GET
    @Path("/apis/scheduling.k8s.io/")
    @Consumes({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "scheduling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1APIGroup.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response getSchedulingAPIGroup();
}

