<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create</title>
</head>
<body>
  <h2>Create Lead</h2>
  <form action="savelead" method="post">
  <pre>
  firstname<input type="text" name="firstname"/>
  lastname<input type="text" name="lastname"/>
  email<input type="text" name="email"/>
  mobile<input type="text" name="mobile"/>
  <input type="submit" value="save"/>
  </pre>
  </form>
  ${msg}
</body>
</html>