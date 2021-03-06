/**
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: unversioned
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package fakekube.io.api;

import fakekube.io.model.IoK8sApiAuthorizationV1beta1LocalSubjectAccessReview;
import fakekube.io.model.IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview;
import fakekube.io.model.IoK8sApiAuthorizationV1beta1SelfSubjectRulesReview;
import fakekube.io.model.IoK8sApiAuthorizationV1beta1SubjectAccessReview;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1APIResourceList;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Kubernetes
 *
 * <p>No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * API tests for AuthorizationV1beta1Api 
 */
public class AuthorizationV1beta1ApiTest {


    private AuthorizationV1beta1Api api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://localhost", AuthorizationV1beta1Api.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAuthorizationV1beta1NamespacedLocalSubjectAccessReviewTest() {
        String namespace = null;
        IoK8sApiAuthorizationV1beta1LocalSubjectAccessReview body = null;
        String dryRun = null;
        String fieldManager = null;
        String pretty = null;
        //Response response = api.createAuthorizationV1beta1NamespacedLocalSubjectAccessReview(namespace, body, dryRun, fieldManager, pretty);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAuthorizationV1beta1SelfSubjectAccessReviewTest() {
        IoK8sApiAuthorizationV1beta1SelfSubjectAccessReview body = null;
        String dryRun = null;
        String fieldManager = null;
        String pretty = null;
        //Response response = api.createAuthorizationV1beta1SelfSubjectAccessReview(body, dryRun, fieldManager, pretty);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAuthorizationV1beta1SelfSubjectRulesReviewTest() {
        IoK8sApiAuthorizationV1beta1SelfSubjectRulesReview body = null;
        String dryRun = null;
        String fieldManager = null;
        String pretty = null;
        //Response response = api.createAuthorizationV1beta1SelfSubjectRulesReview(body, dryRun, fieldManager, pretty);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAuthorizationV1beta1SubjectAccessReviewTest() {
        IoK8sApiAuthorizationV1beta1SubjectAccessReview body = null;
        String dryRun = null;
        String fieldManager = null;
        String pretty = null;
        //Response response = api.createAuthorizationV1beta1SubjectAccessReview(body, dryRun, fieldManager, pretty);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuthorizationV1beta1APIResourcesTest() {
        //Response response = api.getAuthorizationV1beta1APIResources();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}
