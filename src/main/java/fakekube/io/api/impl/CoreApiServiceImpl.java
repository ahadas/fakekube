package fakekube.io.api.impl;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import fakekube.io.api.CoreApi;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1APIVersions;
import fakekube.io.utils.ResourceReader;

/**
 * Kubernetes
 *
 * <p>No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 */
public class CoreApiServiceImpl implements CoreApi {
    public Response getCoreAPIVersions() {
    	IoK8sApimachineryPkgApisMetaV1APIVersions obj = new ResourceReader().read("api.json", IoK8sApimachineryPkgApisMetaV1APIVersions.class);
        return (obj != null ? Response.ok(obj) : Response.status(Status.BAD_REQUEST)).build();
    }
    
}
