package it.alfasoft.francesca.Request;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="u", eager=true)
@SessionScoped
public class Utente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private int età;
	
	public Utente() {
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getEtà() {
		return età;
	}

	public void setEtà(int età) {
		this.età = età;
	}
	
	
	
}
