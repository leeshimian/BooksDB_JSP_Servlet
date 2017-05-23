<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" import="com.books.model.Book"%>
<html>
<head>
	<title>图书管理系统</title>
</head>
<jsp:include page="isLogin.jsp"></jsp:include>
<body>
	<%
		List books = (List)session.getAttribute("books");
		Iterator iter = books.iterator();
	%>
	<table>
		<tr>
			<td>图书编号</td>
			<td>图书名字</td>
			<td>图书作者</td>
			<td>出版社</td>
			<td>图书价格</td>
			<td>图书状态</td>
		</tr>
		<%
			int i = 0;
			while (iter.hasNext()) {
				Book book = (Book) iter.next();
		%>
		<tr <%if (i % 2 == 0) {%> bgcolor="#F0F8FF" <%}%>>
			<td><%=book.getbkID()%></td>
			<td><%=book.getbkName()%></td>
			<td><%=book.getbkAuthor()%></td>
			<td><%=book.getbkPress()%></td>
			<td><%=book.getbkPrice()%></td>
			<td><%=book.getbkState()%></td>
			<td><a href="modifyBook?bkID=<%=book.getbkID()%>">修改</a></td>
		</tr>
		<%
			i++;
			}
		%>

	</table>
</body>
</html>
