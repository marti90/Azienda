<%@page import="service.Gestione"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<div id="content">

			<h2>Rubrica</h2>

			<table border="1">
				<thead>

					<tr>
						<th>n.</th>
						<th>nome</th>
						<th>cognome</th>
						<th>telefono</th>
					</tr>

				</thead>

				<%
// 					Gestione g = new Gestione();
// 					String usnm = cliente.getUsername();
// 					Rubrica rbean = s.trovaRubrica(usnm);
// 					List<Voce> lista = s.getVoci(rbean);
// 					session.setAttribute("lista", lista);
				%>
				<c:set var="i" value="1" scope="page" />

				<c:forEach items="${lista}" var="u">

					<tr>
						<td><c:out value="${i}" /></td>
						<td><c:out value="${u.nomeVoce}" /></td>
						<td><c:out value="${u.cognomeVoce}" /></td>
						<td><c:out value="${u.telefono}" /></td>
					</tr>
					<c:set var="i" value="${i + 1}" scope="page" />
				</c:forEach>


			</table>
		</div>