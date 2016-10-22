package service;

import java.util.List;

import modelBean.Utente;
import dao.UtenteDAO;
import utility.PasswordCodification;

public class Gestione {
	
private UtenteDAO uDao = new UtenteDAO();
	
	public boolean registraUtente(Utente u){
		
		boolean res = false;
		res = uDao.createUtente(u);
		
		return res;
	}
	
	public boolean esisteUtente(String username, String password){
		
		boolean res = false;
		Utente u = uDao.readUtente(username, password);
		if(u!=null){
			res = true;
		}
		
		return res;
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

}
