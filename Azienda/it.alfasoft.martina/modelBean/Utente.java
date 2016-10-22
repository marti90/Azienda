package modelBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Utente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected long id_utente;
	
	protected String nome;
	protected String cognome;
	protected String username;
	protected String password;
	protected char ruolo;
	
	public Utente(){
		
	}
	
	public Utente(String nome, String cognome, String username,	String password) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		
	}

	public long getId_utente() {
		return id_utente;
	}

	public void setId_utente(long id_utente) {
		this.id_utente = id_utente;
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

	public char getRuolo() {
		return ruolo;
	}

	public void setRuolo(char ruolo) {
		this.ruolo = ruolo;
	}

}
