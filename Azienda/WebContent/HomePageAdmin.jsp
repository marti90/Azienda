<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>  
<jsp:useBean id="admin" class="modelBean.Admin" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="admin" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="Stylesheet" type="text/css" href="css/stat.css">

<title>Home Page Admin</title>
</head>
<body>



<div id="Container">
  
    <div id="header">
    <h1>Benvenuto ${admin.username}</h1>
    </div>
 
    <div  class="menu">
    <jsp:include page="MenuLateraleAdmin.jsp"></jsp:include>
    </div>
    
    <div id="content">
    <h1>Welcome to Home Page </h1>
    </div>
    
    <div id="footer">
    <h1>Footer</h1>
    </div>
  
  
</div> <!--  end of container -->
</body>
</html>

