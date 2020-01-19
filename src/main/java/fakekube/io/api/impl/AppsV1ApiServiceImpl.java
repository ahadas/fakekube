package fakekube.io.api.impl;

import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.joda.time.DateTime;

import fakekube.io.api.AppsV1Api;
import fakekube.io.model.IoK8sApiAppsV1ControllerRevision;
import fakekube.io.model.IoK8sApiAppsV1DaemonSet;
import fakekube.io.model.IoK8sApiAppsV1Deployment;
import fakekube.io.model.IoK8sApiAppsV1ReplicaSet;
import fakekube.io.model.IoK8sApiAppsV1StatefulSet;
import fakekube.io.model.IoK8sApiAutoscalingV1Scale;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1APIResourceList;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1DeleteOptions;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1Patch;
import fakekube.io.sim.model.Deployments;
import fakekube.io.utils.ResourceReader;

/**
 * Kubernetes
 *
 * <p>No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 */
public class AppsV1ApiServiceImpl implements AppsV1Api {
	@Inject
	private Deployments deployments;

    public Response createAppsV1NamespacedControllerRevision(String namespace, IoK8sApiAppsV1ControllerRevision body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response createAppsV1NamespacedDaemonSet(String namespace, IoK8sApiAppsV1DaemonSet body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response createAppsV1NamespacedDeployment(String namespace, IoK8sApiAppsV1Deployment body, String pretty, String dryRun, String fieldManager) {
    	body.getMetadata().creationTimestamp(DateTime.now().toString());
        deployments.add(body);
        return Response.ok(body).build();
    }
    
    public Response createAppsV1NamespacedReplicaSet(String namespace, IoK8sApiAppsV1ReplicaSet body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response createAppsV1NamespacedStatefulSet(String namespace, IoK8sApiAppsV1StatefulSet body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteAppsV1CollectionNamespacedControllerRevision(String namespace, String pretty, Boolean allowWatchBookmarks, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteAppsV1CollectionNamespacedDaemonSet(String namespace, String pretty, Boolean allowWatchBookmarks, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteAppsV1CollectionNamespacedDeployment(String namespace, String pretty, Boolean allowWatchBookmarks, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteAppsV1CollectionNamespacedReplicaSet(String namespace, String pretty, Boolean allowWatchBookmarks, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteAppsV1CollectionNamespacedStatefulSet(String namespace, String pretty, Boolean allowWatchBookmarks, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteAppsV1NamespacedControllerRevision(String name, String namespace, String pretty, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteAppsV1NamespacedDaemonSet(String name, String namespace, String pretty, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteAppsV1NamespacedDeployment(String name, String namespace, String pretty, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteAppsV1NamespacedReplicaSet(String name, String namespace, String pretty, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteAppsV1NamespacedStatefulSet(String name, String namespace, String pretty, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response getAppsV1APIResources() {
    	IoK8sApimachineryPkgApisMetaV1APIResourceList obj = new ResourceReader().read("apps_resources.json", IoK8sApimachineryPkgApisMetaV1APIResourceList.class);
        return (obj != null ? Response.ok(obj) : Response.status(Status.BAD_REQUEST)).build();
    }
    
    public Response listAppsV1ControllerRevisionForAllNamespaces(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response listAppsV1DaemonSetForAllNamespaces(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response listAppsV1DeploymentForAllNamespaces(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response listAppsV1NamespacedControllerRevision(String namespace, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response listAppsV1NamespacedDaemonSet(String namespace, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response listAppsV1NamespacedDeployment(String namespace, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response listAppsV1NamespacedReplicaSet(String namespace, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response listAppsV1NamespacedStatefulSet(String namespace, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response listAppsV1ReplicaSetForAllNamespaces(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response listAppsV1StatefulSetForAllNamespaces(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response patchAppsV1NamespacedControllerRevision(String name, String namespace, IoK8sApimachineryPkgApisMetaV1Patch body, String pretty, String dryRun, String fieldManager, Boolean force) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response patchAppsV1NamespacedDaemonSet(String name, String namespace, IoK8sApimachineryPkgApisMetaV1Patch body, String pretty, String dryRun, String fieldManager, Boolean force) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response patchAppsV1NamespacedDaemonSetStatus(String name, String namespace, IoK8sApimachineryPkgApisMetaV1Patch body, String pretty, String dryRun, String fieldManager, Boolean force) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response patchAppsV1NamespacedDeployment(String name, String namespace, IoK8sApimachineryPkgApisMetaV1Patch body, String pretty, String dryRun, String fieldManager, Boolean force) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response patchAppsV1NamespacedDeploymentScale(String name, String namespace, IoK8sApimachineryPkgApisMetaV1Patch body, String pretty, String dryRun, String fieldManager, Boolean force) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response patchAppsV1NamespacedDeploymentStatus(String name, String namespace, IoK8sApimachineryPkgApisMetaV1Patch body, String pretty, String dryRun, String fieldManager, Boolean force) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response patchAppsV1NamespacedReplicaSet(String name, String namespace, IoK8sApimachineryPkgApisMetaV1Patch body, String pretty, String dryRun, String fieldManager, Boolean force) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response patchAppsV1NamespacedReplicaSetScale(String name, String namespace, IoK8sApimachineryPkgApisMetaV1Patch body, String pretty, String dryRun, String fieldManager, Boolean force) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response patchAppsV1NamespacedReplicaSetStatus(String name, String namespace, IoK8sApimachineryPkgApisMetaV1Patch body, String pretty, String dryRun, String fieldManager, Boolean force) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response patchAppsV1NamespacedStatefulSet(String name, String namespace, IoK8sApimachineryPkgApisMetaV1Patch body, String pretty, String dryRun, String fieldManager, Boolean force) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response patchAppsV1NamespacedStatefulSetScale(String name, String namespace, IoK8sApimachineryPkgApisMetaV1Patch body, String pretty, String dryRun, String fieldManager, Boolean force) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response patchAppsV1NamespacedStatefulSetStatus(String name, String namespace, IoK8sApimachineryPkgApisMetaV1Patch body, String pretty, String dryRun, String fieldManager, Boolean force) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response readAppsV1NamespacedControllerRevision(String name, String namespace, String pretty, Boolean exact, Boolean export) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response readAppsV1NamespacedDaemonSet(String name, String namespace, String pretty, Boolean exact, Boolean export) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response readAppsV1NamespacedDaemonSetStatus(String name, String namespace, String pretty) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response readAppsV1NamespacedDeployment(String name, String namespace, String pretty, Boolean exact, Boolean export) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response readAppsV1NamespacedDeploymentScale(String name, String namespace, String pretty) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response readAppsV1NamespacedDeploymentStatus(String name, String namespace, String pretty) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response readAppsV1NamespacedReplicaSet(String name, String namespace, String pretty, Boolean exact, Boolean export) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response readAppsV1NamespacedReplicaSetScale(String name, String namespace, String pretty) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response readAppsV1NamespacedReplicaSetStatus(String name, String namespace, String pretty) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response readAppsV1NamespacedStatefulSet(String name, String namespace, String pretty, Boolean exact, Boolean export) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response readAppsV1NamespacedStatefulSetScale(String name, String namespace, String pretty) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response readAppsV1NamespacedStatefulSetStatus(String name, String namespace, String pretty) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response replaceAppsV1NamespacedControllerRevision(String name, String namespace, IoK8sApiAppsV1ControllerRevision body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response replaceAppsV1NamespacedDaemonSet(String name, String namespace, IoK8sApiAppsV1DaemonSet body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response replaceAppsV1NamespacedDaemonSetStatus(String name, String namespace, IoK8sApiAppsV1DaemonSet body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response replaceAppsV1NamespacedDeployment(String name, String namespace, IoK8sApiAppsV1Deployment body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response replaceAppsV1NamespacedDeploymentScale(String name, String namespace, IoK8sApiAutoscalingV1Scale body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response replaceAppsV1NamespacedDeploymentStatus(String name, String namespace, IoK8sApiAppsV1Deployment body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response replaceAppsV1NamespacedReplicaSet(String name, String namespace, IoK8sApiAppsV1ReplicaSet body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response replaceAppsV1NamespacedReplicaSetScale(String name, String namespace, IoK8sApiAutoscalingV1Scale body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response replaceAppsV1NamespacedReplicaSetStatus(String name, String namespace, IoK8sApiAppsV1ReplicaSet body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response replaceAppsV1NamespacedStatefulSet(String name, String namespace, IoK8sApiAppsV1StatefulSet body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response replaceAppsV1NamespacedStatefulSetScale(String name, String namespace, IoK8sApiAutoscalingV1Scale body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response replaceAppsV1NamespacedStatefulSetStatus(String name, String namespace, IoK8sApiAppsV1StatefulSet body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAppsV1ControllerRevisionListForAllNamespaces(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAppsV1DaemonSetListForAllNamespaces(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAppsV1DeploymentListForAllNamespaces(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAppsV1NamespacedControllerRevision(String name, String namespace, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAppsV1NamespacedControllerRevisionList(String namespace, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAppsV1NamespacedDaemonSet(String name, String namespace, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAppsV1NamespacedDaemonSetList(String namespace, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAppsV1NamespacedDeployment(String name, String namespace, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAppsV1NamespacedDeploymentList(String namespace, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAppsV1NamespacedReplicaSet(String name, String namespace, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAppsV1NamespacedReplicaSetList(String namespace, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAppsV1NamespacedStatefulSet(String name, String namespace, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAppsV1NamespacedStatefulSetList(String namespace, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAppsV1ReplicaSetListForAllNamespaces(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchAppsV1StatefulSetListForAllNamespaces(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
}

