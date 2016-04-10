package com.lister.dal.interfaces;

import java.io.Serializable;
import java.util.List;

public interface IGenericDao <T extends Serializable, ID extends Serializable>{

	public ID insert(T e);
	
	public void update(T e);
	
	public void delete (T e);
	
	public T get(ID id);
	
	public List<T> get();
	
}
