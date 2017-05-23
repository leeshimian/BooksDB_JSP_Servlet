<%@page import="com.books.model.Book"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<title>图书管理系统</title>

</head>
<jsp:include page="isLogin.jsp"></jsp:include>
<body>
	<jsp:useBean id="bookSer" class="com.books.service.bookService"></jsp:useBean>
	<%
		List books = bookSer.queryAllBook();
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
			<td><a href="deleteBook?bkID=<%=book.getbkID()%>">删除</a></td>
		</tr>
		<%
			i++;
			}
		%>
<!--定义i是为了隔行显示颜色-->
	</table>
</body>
</html>
