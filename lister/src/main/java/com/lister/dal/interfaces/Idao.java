package com.lister.dal.interfaces;

import java.util.List;

public interface Idao<T> {

	public long insert(T e);
	
	public long update(T e);
	
	public long delete (T e);
	
	public T get(Long id);
	
	public List<T> getAll();
	
}
