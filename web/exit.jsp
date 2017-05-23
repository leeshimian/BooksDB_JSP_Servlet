<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
    <title>图书管理系统</title>
    </head>
  <body>
  <%
  session.removeAttribute("user");
   %>
   <jsp:forward page="index.jsp"></jsp:forward>
  </body>
</html>
