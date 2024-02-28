package io.kodlama.business.abstarcts;

import java.util.List;

import io.kodlama.core.utilities.result.DataResult;
import io.kodlama.core.utilities.result.Result;

public interface GenericService<T> {
	DataResult<List<T>> getAll();

	Result add(T entity);
}
