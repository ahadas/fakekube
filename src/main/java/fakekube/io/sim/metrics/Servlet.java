package fakekube.io.sim.metrics;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.exporter.common.TextFormat;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Path("/")
@Api(value = "/", description = "")
public class Servlet {
	private static final Logger LOGGER = Logger.getLogger(Servlet.class.getName());

	private CollectorRegistry registry;

	public Servlet() {
		this.registry = CollectorRegistry.defaultRegistry;
	}

	@GET
    @Path("/metrics")
    @Consumes({ "*/*" })
    @Produces({ "*/*" })
    @ApiOperation(value = "", tags={ "core_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response metrics(@PathParam("name[]") String[] names) throws IOException {
	    MetricsWriter writer = new MetricsWriter();
	    TextFormat.write004(writer, registry.filteredMetricFamilySamples(parse(names)));
	    String metrics = writer.toString();
	    LOGGER.info("metrics: " + metrics);
	    return Response.ok().entity(metrics).build();
	}

	private Set<String> parse(String[] includedParam) {
//		if (includedParam == null) {
			return Collections.emptySet();
//		} else {
//			return new HashSet<>(Arrays.asList(includedParam));
//		}
	}

	static class MetricsWriter extends Writer {
		private StringBuilder builder = new StringBuilder();

		@Override
		public void write(char[] cbuf, int off, int len) throws IOException {
			builder.append(Arrays.copyOfRange(cbuf, off, off+len));
		}
		@Override
		public void flush() throws IOException {
		}
		
		@Override
		public void close() throws IOException {
		}

		@Override
		public String toString() {
			return builder.toString();
		}
	}
}
