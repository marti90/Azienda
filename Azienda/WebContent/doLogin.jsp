<%@page import="service.Gestione"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:useBean id="utente" class="modelBean.Utente" scope="session"></jsp:useBean>
<jsp:useBean id="error" class="utility.ErrorBean" scope="request"></jsp:useBean>

<jsp:setProperty property="*" name="utente" />
    <%
	    String call=request.getParameter("call");
        if(call==null)
        {
    %>
    <jsp:forward page="Login.jsp" />
    <%
        }
        else {
        Gestione g= new Gestione();
    
        String username = utente.getUsername();
        String password = utente.getPassword();
        password=g.convertiPass(password);
    
        if(g.esisteUtente(username, password))
        {
        	if(utente.getRuolo()=='D'){
        		%>
        	    <jsp:forward page="HomePageDipendente.jsp" />
        	    <%
        	} else if(utente.getRuolo()=='C'){
        		%>
        	    <jsp:forward page="HomePageCliente.jsp" />
        	    <%
        	} else{
        		%>
        	    <jsp:forward page="HomePageAdmin.jsp" />
        	    <%
        	}
        		
        }
        else{
    	    error.setError("Errore! Username o Password non corretti!");
    %>
    <jsp:forward page="Login.jsp" />
    <%
        }
    }
    
    %>