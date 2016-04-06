package com.lister.bll.interfaces;

import java.util.List;

public interface Iservice <T> {
	
	public long save(T e);
	
	public long delete(T e);
	
	public long update(T e);
	
	public T get(Long id);
	
	public List<T> getAll();
	
}
