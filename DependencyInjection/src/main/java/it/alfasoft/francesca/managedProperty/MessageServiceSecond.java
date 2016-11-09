package it.alfasoft.francesca.managedProperty;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="secondo", eager=true)
public class MessageServiceSecond implements Serializable, MessageService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Seconda implementazione";
	}

}
