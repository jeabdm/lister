package com.lister.exceptions;

public class ServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ServiceException(Exception ex){
		super("Ocurrio un error al aplicar la operacion del servicio", ex);
	}
	

}
