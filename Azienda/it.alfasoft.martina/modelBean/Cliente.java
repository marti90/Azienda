package modelBean;

import javax.persistence.Entity;

@Entity
public class Cliente extends Utente{
	
	private String ragioneSociale;
	private String pIva;
	
	public Cliente(){
		
	}
	
	public Cliente(String nome, String cognome, String username, String password, String ragioneSociale, String pIva) {
		super(nome,cognome,username,password);
		this.ragioneSociale = ragioneSociale;
		this.pIva = pIva;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getpIva() {
		return pIva;
	}

	public void setpIva(String pIva) {
		this.pIva = pIva;
	}
	
}
