<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.books.model.userTable" %>
<%
userTable user=(userTable)session.getAttribute("user");
if(user==null)
{
 %>
 <jsp:forward page="index.jsp"></jsp:forward>
 <%}
 %>
