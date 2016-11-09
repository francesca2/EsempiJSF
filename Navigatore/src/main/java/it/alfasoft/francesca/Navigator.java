package it.alfasoft.francesca;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name="n", eager=true)
public class Navigator implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pagina;
	private String msg;
	
	public Navigator(){
	 }

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String nextPage(){
		
		if(pagina.isEmpty())
		{
			msg="Devi Scegliere una pagina!";
			return "NavigationPage";
		}
		//per cambiare l'url quando vengo reinderezzata alla pagina
		return pagina + "?faces-redirect=true";
	}

	public void redirectPage() throws IOException{
		
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		context.redirect(context.getRequestContextPath() + "/paginaUno.xhtml");
	}
	 
}
