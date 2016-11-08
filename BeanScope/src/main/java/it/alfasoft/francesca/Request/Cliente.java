package it.alfasoft.francesca.Request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
	private String squadra;
	
	private List<String> cities=new ArrayList<String>();
	private List<String> squadre=new ArrayList<String>();
	private List<String> squadreScelte=new ArrayList<String>();

	public Cliente() {
		this.cities.add("Torino");
		this.cities.add("Roma");
		this.cities.add("Napoli");
		this.squadre.add("Torino");
		this.squadre.add("Roma");
		this.squadre.add("Napoli");
		
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

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	public String getSquadra() {
		return squadra;
	}

	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}

	public List<String> getSquadre() {
		return squadre;
	}

	public void setSquadre(List<String> squadre) {
		this.squadre = squadre;
	}

	public List<String> getSquadreScelte() {
		return squadreScelte;
	}

	public void setSquadreScelte(List<String> squadreScelte) {
		this.squadreScelte = squadreScelte;
	}
	
}
