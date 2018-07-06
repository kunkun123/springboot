package com.kun.base;

import java.io.Serializable;

public interface BaseService<T extends Serializable> {
	public T select(String id);
	public void delete(String id);
	public void update(T t);
	public void insert(T t);
}
