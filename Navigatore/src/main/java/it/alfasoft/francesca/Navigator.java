package it.alfasoft.francesca;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="n", eager=true)
public class Navigator implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pagina;
	
	public Navigator(){
	 }

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	 
}
