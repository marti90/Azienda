package modelBean;

public class Dipendente extends Utente{
	
	private double stipendio;
	private String posizione;
	
	public Dipendente(){
		
	}

	public Dipendente(String nome, String cognome, String username, String password, double stipendio, String posizione) {
		super(nome,cognome,username,password);
		this.stipendio = stipendio;
		this.posizione = posizione;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	public String getPosizione() {
		return posizione;
	}

	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}
	
}
