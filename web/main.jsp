<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>图书管理系统</title>
</head>

<jsp:include page="isLogin.jsp"></jsp:include>

<frameset rows="20%,*,5%">
	<frame src="top.jsp">
	<frameset cols="20%,*">
		<frame src="main_left.jsp">
		<frame src="main_right.jsp" name="main_right">
	</frameset>
	<frameset cols = "*">
		<frame src = "bottom.jsp">
	</frameset>
</frameset>
<body>
	This is my JSP page.
	<br>
</body>
</html>
