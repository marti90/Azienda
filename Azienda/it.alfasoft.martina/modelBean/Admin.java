package modelBean;

public class Admin extends Utente{
	
	private String livelloAccesso;
	
	public Admin(){
		
	}

	public Admin(String nome, String cognome, String username, String password, String livelloAccesso) {
		super(nome,cognome,username,password);
		this.setLivelloAccesso(livelloAccesso);
	}

	public String getLivelloAccesso() {
		return livelloAccesso;
	}

	public void setLivelloAccesso(String livelloAccesso) {
		this.livelloAccesso = livelloAccesso;
	}
	
	

}
