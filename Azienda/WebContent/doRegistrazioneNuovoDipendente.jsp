<%@page import="service.Gestione"%>
<%@page import="modelBean.Dipendente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="utente" class="modelBean.Utente" scope="request"></jsp:useBean>
<jsp:useBean id="dipendente" class="modelBean.Dipendente" scope="request"></jsp:useBean>
<jsp:useBean id="error" class="utility.ErrorBean" scope="request"></jsp:useBean>
 
 
 <jsp:setProperty property="*" name="dipendente"/>   
<%
   
    dipendente.setRuolo('D');
    
    Gestione g= new Gestione();
    
    if(utente.isValid() && g.getUtenteConUsername(dipendente.getPassword())==null) {
    	
    	String password=g.convertiPass(utente.getPassword());
    	dipendente.setPassword(password);
        g.registraDipendente(dipendente);
        
        %>
    	<jsp:forward page="HomePageAdmin.jsp"/>
    <%
    }
    else{
    	error.setError("ATTENZIONE! i dati non sono validi!");
        %>
    	<jsp:forward page="RegistrazioneNuovoCliente.jsp"/>
    <%
    }
    
    %>