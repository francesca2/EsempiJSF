package it.alfasoft.francesca.managedProperty;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name= "primo", eager=true)
public class MessageServiceFirstImpl implements Serializable, MessageService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MessageServiceFirstImpl(){
		
	}
	
	@Override
	public String getMessage() {
		
		return "Prima implementazione";
	}

}
