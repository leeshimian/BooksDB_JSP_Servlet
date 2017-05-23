<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.books.model.Book" pageEncoding="UTF-8"%>
<html>
<head>
	<title>图书管理系统</title>
</head>

<body>
<center>
	<%request.setCharacterEncoding("utf-8"); %>
	<%
		Book book = (Book)session.getAttribute("book");
	%>
	<form action="modifyOneBook" method="post">
		<table bgColor="#c0c0c0">
		
			<tr>
				<td align="center" bgcolor=green colspan=2><font color=white>修改图书信息</font></td>
			</tr>
			<tr>
				<td>图书编号：</td>
				<td><input type="text" size=20 name="bkID"
					value="<%=book.getbkID()%>"></td>
			</tr>
			<tr>
				<td>图书名字：</td>
				<td><input type="text" size=20 name="bkName"
					value="<%=book.getbkName()%>"></td>
			</tr>
			<tr>
				<td>图书作者</td>
				<td><input type="text" size=20 name="bkAuthor"
							value="<%=book.getbkAuthor()%>"></td>
			</tr>
			<tr>
				<td>出版社：</td>
				<td><input type="text" size=20 name="bkPress"
						   value="<%=book.getbkPress()%>"></td>
			</tr>
			<tr>
				<td>图书价格：</td>
				<td><input type="text" size=20 name="bkPrice"
						   value="<%=book.getbkPrice()%>"></td>
			</tr>
			<tr>
				<td>图书状态：</td>
				<td><input type="text" size=20 name="bkState"
						   value="<%=book.getbkState()%>"></td>
			</tr>

			<tr>
				<td align="center" colspan="2"><input type="hidden" name="bkID" value="<%=book.getbkID()%>"/><input type="submit" value="提交">&nbsp;&nbsp;
					<input type="reset" value="重置"></td>
			</tr>
		</table>

	</form>
</center>
</body>
</html>
