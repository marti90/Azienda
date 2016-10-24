package service;

import java.util.List;

import modelBean.Cliente;
import modelBean.Dipendente;
import modelBean.Utente;
import dao.ClienteDAO;
import dao.DipendenteDAO;
import dao.UtenteDAO;
import utility.PasswordCodification;

public class Gestione {
	
private UtenteDAO uDao = new UtenteDAO();
private ClienteDAO cDao = new ClienteDAO();
private DipendenteDAO dDao = new DipendenteDAO();
	
	public boolean registraUtente(Utente u){
		
		boolean res = false;
		res = uDao.createUtente(u);
		
		return res;
	}
	
	public Utente esisteUtente(String username, String password){
		Utente u = uDao.readUtente(username, password);
		
		return u;
	}
	
	public Utente getUtenteConUsername(String username){
		
		Utente u = uDao.readUtente(username);
		
		return u;
	}
	
	public List<Utente> getTuttiUtenti(){
		
		return uDao.readUtenti();
	}

	
    public String convertiPass(String pass){
		
		return PasswordCodification.codificatePass(pass);	
	}
    
    public boolean registraCliente(Cliente c){
    	boolean res = false;
		res = cDao.createCliente(c);
		
		return res;
    }
    
    public boolean registraDipendente(Dipendente d){
    	boolean res = false;
		res = dDao.createDipendente(d);
		
		return res;
    }
    
    public List<Cliente> getTuttiClienti(){
		
		return cDao.readClienti();
	}

}
