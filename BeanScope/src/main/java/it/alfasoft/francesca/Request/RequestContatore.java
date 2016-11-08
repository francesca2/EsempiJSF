package it.alfasoft.francesca.Request;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="contatore", eager=true)
@RequestScoped
public class RequestContatore implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cnt;
	
	public RequestContatore() {
		cnt=0;
	}	
	
	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public void incrementa(){
		this.cnt=(this.getCnt()+1);
	}
	

}
