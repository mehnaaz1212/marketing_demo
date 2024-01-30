<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
   <h2>Update Lead</h2>
   <form action="updatelead" method="post">
      <pre>
          <input type="hidden" name="id" value="${lead.id}"/>
          firstname<input type="text" name="firstname" value="${lead.firstname}"/>
          lastname<input type="text" name="lastname" value="${lead.lastname}"/>
          email<input type="text" name="email" value="${lead.email}"/>
          mobile<input type="text" name="mobile" value="${lead.mobile}"/>
          <input type="submit" value="update"/>
      </pre>
   </form>
</body>
</html>