package it.alfasoft.francesca.managedProperty;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name="p", eager=true)
public class EsempioManagedProperty implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value="#{primo}")
	private MessageService msgService;
	
	public EsempioManagedProperty(){
		
	}

	public MessageService getMsgService() {
		return msgService;
	}


	public void setMsgService(MessageService msgService) {
		this.msgService = msgService;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getMessage(){
		return msgService.getMessage();
	}
	
}
