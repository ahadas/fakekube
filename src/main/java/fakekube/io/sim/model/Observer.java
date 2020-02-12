package fakekube.io.sim.model;

import java.util.Collection;

public interface Observer<T> {

	void added(T entity);
	void deleted(T entity);
	void generate(Collection<T> entities);
}
