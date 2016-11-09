package it.alfasoft.Francesca.Validazione;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

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
	private String telefono;
	private String codiceFiscale;
	
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	//deve per forza avere questi tre argomenti e devo per forza mettere l'eccezione
	public void validazioneCF(FacesContext context, UIComponent component, Object value) throws ValidatorException{
		
		if(value==null){
			return;
		}
		String cf = value.toString();
		if(!cf.startsWith("aaa")){
			FacesMessage msg= new FacesMessage("Il codice fiscale non è corretto");
			throw new ValidatorException(msg);
		}
	}
	
	
}
