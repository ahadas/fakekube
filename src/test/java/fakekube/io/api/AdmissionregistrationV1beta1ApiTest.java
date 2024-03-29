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

import fakekube.io.model.IoK8sApiAdmissionregistrationV1beta1MutatingWebhookConfiguration;
import fakekube.io.model.IoK8sApiAdmissionregistrationV1beta1MutatingWebhookConfigurationList;
import fakekube.io.model.IoK8sApiAdmissionregistrationV1beta1ValidatingWebhookConfiguration;
import fakekube.io.model.IoK8sApiAdmissionregistrationV1beta1ValidatingWebhookConfigurationList;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1APIResourceList;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1DeleteOptions;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1Patch;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1Status;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1WatchEvent;
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
 * API tests for AdmissionregistrationV1beta1Api 
 */
public class AdmissionregistrationV1beta1ApiTest {


    private AdmissionregistrationV1beta1Api api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://localhost", AdmissionregistrationV1beta1Api.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAdmissionregistrationV1beta1MutatingWebhookConfigurationTest() {
        IoK8sApiAdmissionregistrationV1beta1MutatingWebhookConfiguration body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        //Response response = api.createAdmissionregistrationV1beta1MutatingWebhookConfiguration(body, pretty, dryRun, fieldManager);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAdmissionregistrationV1beta1ValidatingWebhookConfigurationTest() {
        IoK8sApiAdmissionregistrationV1beta1ValidatingWebhookConfiguration body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        //Response response = api.createAdmissionregistrationV1beta1ValidatingWebhookConfiguration(body, pretty, dryRun, fieldManager);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAdmissionregistrationV1beta1CollectionMutatingWebhookConfigurationTest() {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String _continue = null;
        String dryRun = null;
        String fieldSelector = null;
        Integer gracePeriodSeconds = null;
        String labelSelector = null;
        Integer limit = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        //Response response = api.deleteAdmissionregistrationV1beta1CollectionMutatingWebhookConfiguration(pretty, allowWatchBookmarks, body, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, timeoutSeconds, watch);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAdmissionregistrationV1beta1CollectionValidatingWebhookConfigurationTest() {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String _continue = null;
        String dryRun = null;
        String fieldSelector = null;
        Integer gracePeriodSeconds = null;
        String labelSelector = null;
        Integer limit = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        //Response response = api.deleteAdmissionregistrationV1beta1CollectionValidatingWebhookConfiguration(pretty, allowWatchBookmarks, body, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, timeoutSeconds, watch);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAdmissionregistrationV1beta1MutatingWebhookConfigurationTest() {
        String name = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        //Response response = api.deleteAdmissionregistrationV1beta1MutatingWebhookConfiguration(name, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAdmissionregistrationV1beta1ValidatingWebhookConfigurationTest() {
        String name = null;
        String pretty = null;
        IoK8sApimachineryPkgApisMetaV1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        //Response response = api.deleteAdmissionregistrationV1beta1ValidatingWebhookConfiguration(name, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAdmissionregistrationV1beta1APIResourcesTest() {
        //Response response = api.getAdmissionregistrationV1beta1APIResources();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAdmissionregistrationV1beta1MutatingWebhookConfigurationTest() {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        //Response response = api.listAdmissionregistrationV1beta1MutatingWebhookConfiguration(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAdmissionregistrationV1beta1ValidatingWebhookConfigurationTest() {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        //Response response = api.listAdmissionregistrationV1beta1ValidatingWebhookConfiguration(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchAdmissionregistrationV1beta1MutatingWebhookConfigurationTest() {
        String name = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        //Response response = api.patchAdmissionregistrationV1beta1MutatingWebhookConfiguration(name, body, pretty, dryRun, fieldManager, force);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchAdmissionregistrationV1beta1ValidatingWebhookConfigurationTest() {
        String name = null;
        IoK8sApimachineryPkgApisMetaV1Patch body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        //Response response = api.patchAdmissionregistrationV1beta1ValidatingWebhookConfiguration(name, body, pretty, dryRun, fieldManager, force);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAdmissionregistrationV1beta1MutatingWebhookConfigurationTest() {
        String name = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        //Response response = api.readAdmissionregistrationV1beta1MutatingWebhookConfiguration(name, pretty, exact, export);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAdmissionregistrationV1beta1ValidatingWebhookConfigurationTest() {
        String name = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        //Response response = api.readAdmissionregistrationV1beta1ValidatingWebhookConfiguration(name, pretty, exact, export);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAdmissionregistrationV1beta1MutatingWebhookConfigurationTest() {
        String name = null;
        IoK8sApiAdmissionregistrationV1beta1MutatingWebhookConfiguration body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        //Response response = api.replaceAdmissionregistrationV1beta1MutatingWebhookConfiguration(name, body, pretty, dryRun, fieldManager);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceAdmissionregistrationV1beta1ValidatingWebhookConfigurationTest() {
        String name = null;
        IoK8sApiAdmissionregistrationV1beta1ValidatingWebhookConfiguration body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        //Response response = api.replaceAdmissionregistrationV1beta1ValidatingWebhookConfiguration(name, body, pretty, dryRun, fieldManager);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAdmissionregistrationV1beta1MutatingWebhookConfigurationTest() {
        String name = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        //Response response = api.watchAdmissionregistrationV1beta1MutatingWebhookConfiguration(name, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAdmissionregistrationV1beta1MutatingWebhookConfigurationListTest() {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        //Response response = api.watchAdmissionregistrationV1beta1MutatingWebhookConfigurationList(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAdmissionregistrationV1beta1ValidatingWebhookConfigurationTest() {
        String name = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        //Response response = api.watchAdmissionregistrationV1beta1ValidatingWebhookConfiguration(name, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void watchAdmissionregistrationV1beta1ValidatingWebhookConfigurationListTest() {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        //Response response = api.watchAdmissionregistrationV1beta1ValidatingWebhookConfigurationList(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}
