<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="error" class="utility.ErrorBean" scope="request"></jsp:useBean>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="Stylesheet" type="text/css" href="css/stat.css">

   <title>Login Page</title>
   </head>
   <body>
   <div id="content">
   <h1>Login</h1>
   
   <%=error.getError() %> 
   <form action="doLogin.jsp" method="post">
   
      Username: <input type="text" name="username"/><br>
      Password: <input type="password" name="password"/><br>
      <input type= "hidden" name="call" value="2"/><br>
      <input type="submit" value="Accedi"/>

   </form>

   </div>
</body>
</html>