package com.kun.base;

import java.io.Serializable;

public interface BaseMapper<T extends Serializable> {
	public void insert(T t);
	public void update(T t);
	public void delete(String id);
	public void select(String id);
}
