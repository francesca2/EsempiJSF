package it.alfasoft.francesca.Request;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

//@ManagedBean //annotazione per dichiarare che è un bean
//@ManagedBean(name="c") //se voglio nominare la classe
@ManagedBean(name="c", eager=true) //gli dico di usare il metodo eager per prendere i dati
@SessionScoped //anotazione per dichiarare lo scope del bean che di default è request
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String nome;
	private String cognome;
	private String città;

	public Cliente() {
	}

	public Cliente(String nome, String cognome, String città) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.città = città;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCittà() {
		return città;
	}

	public void setCittà(String città) {
		this.città = città;
	}
	
}
