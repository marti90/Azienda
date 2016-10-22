package main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utility.HibernateUtility;
import modelBean.Admin;
import modelBean.Utente;

public class EsempioMain {

	public static void main(String[] args) {
		
		Admin a = new Admin();
		a.setNome("Martina");
		a.setCognome("Debernardi");
		a.setUsername("marti90");
		a.setPassword("ml90");
		a.setRuolo('A');
		
		Session session=HibernateUtility.openSession();
		Transaction tx=null;
		
		try{
	        tx=session.getTransaction();
	        tx.begin();
	       
	        session.persist(a);
	       
	        tx.commit(); 
            
	    }catch(Exception ex){
	         tx.rollback();

	    }finally{
	         session.close();
	    }

	}

}
