package it.alfasoft.francesca.Table;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="data", eager=true)
public class DataTables implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Studente> studenti;

	public DataTables() {
		this.studenti=new ArrayList<Studente>();
		
		Studente s1= new Studente("uno","uno","111");
		Studente s2=new Studente("due","due","222");
		Studente s3=new Studente("tre","tre","333");
		
		studenti.add(s1);
		studenti.add(s2);
		studenti.add(s3);
	}

	public List<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Studente> studenti) {
		this.studenti = studenti;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
