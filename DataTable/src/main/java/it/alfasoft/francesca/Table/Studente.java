package it.alfasoft.francesca.Table;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="s", eager=true)
public class Studente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cognome;
	private String matricola;
	
	public Studente() {
	}
	
	public Studente(String nome, String cognome, String matricola) {
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
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
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
