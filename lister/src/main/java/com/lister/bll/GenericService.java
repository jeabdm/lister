package com.lister.bll;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.lister.bll.interfaces.IGenericService;
import com.lister.dal.impl.GenericDao;

public abstract class GenericService <T extends Serializable , ID extends Serializable> implements IGenericService<T, ID>{

	@Autowired
	protected GenericDao<T, ID> dao;

	@Override
	public boolean create(T e) {
		try {
			dao.insert(e);
			return true;
		}catch (Exception ex) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public boolean delete(T e) {
		try {
			dao.delete(e);
			return true;
		}catch (Exception ex) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public boolean update(T e) {
		try {
			dao.update(e);
			return true;
		}catch (Exception ex) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public T get(ID id) {
		try {
			return dao.get(id);
		}catch (Exception ex) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<T> get() {
		try {
			return dao.get();
		}catch (Exception ex) {
			// TODO: handle exception
			return null;
		}
	}
}
