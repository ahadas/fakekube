package fakekube.io.sim;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import fakekube.io.model.IoK8sApiCoreV1Namespace;
import fakekube.io.model.IoK8sApiCoreV1NamespaceStatus;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1ObjectMeta;
import fakekube.io.sim.metrics.Metrics;
import fakekube.io.sim.model.Namespaces;

@WebServlet(name = "Simulator", loadOnStartup = 1, urlPatterns = {"/simulator"})
public class Simulator extends HttpServlet {
	private static final Logger LOGGER = Logger.getLogger(Simulator.class.getName());

	@Inject
	private Clock clock;
	@Inject
	private Metrics metrics;
	@Inject
	private Namespaces namespaces;

	@Override
	public void init() throws ServletException {
		LOGGER.info("starting simulator servlet");
		clock.init();
		addDefaultNamespace();
		metrics.init();
	}

	private void addDefaultNamespace() {
		IoK8sApiCoreV1Namespace defaultNamespace = new IoK8sApiCoreV1Namespace()
				.apiVersion("v1")
				.kind("Namespace")
				.metadata(new IoK8sApimachineryPkgApisMetaV1ObjectMeta().name("default").creationTimestamp(clock.creationTimestamp()))
				.status(new IoK8sApiCoreV1NamespaceStatus().phase("Active"));
		namespaces.add(defaultNamespace);
	}
}
