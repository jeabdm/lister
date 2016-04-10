package com.lister.bll.interfaces;

import java.io.Serializable;
import java.util.List;

public interface IGenericService <T extends Serializable, ID extends Serializable> {
	
	public boolean create(T e);
	
	public boolean delete(T e);
	
	public boolean update(T e);
	
	public T get(ID id);
	
	public List<T> get();
	
}
