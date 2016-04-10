package com.lister.dal.interfaces;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

public interface IGenericDao <T extends Serializable, ID extends Serializable>{

	public ID insert(T e) throws SQLException;
	
	public void update(T e) throws SQLException;
	
	public void delete (T e) throws SQLException;
	
	public T get(ID id) throws SQLException;
	
	public List<T> get() throws SQLException;
	
}
