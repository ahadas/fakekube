package fakekube.io.sim;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import fakekube.io.sim.metrics.Metrics;

@WebServlet(name = "Simulator", loadOnStartup = 1, urlPatterns = {"/simulator"})
public class Simulator extends HttpServlet {
	private static final Logger LOGGER = Logger.getLogger(Simulator.class.getName());

	@Inject
	private Clock clock;
	@Inject
	private Metrics metrics;

	@Override
	public void init() throws ServletException {
		LOGGER.info("starting simulator servlet");
		clock.init();
		metrics.init();
	}
}
