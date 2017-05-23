<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>图书管理系统</title>
</head>

<jsp:include page="isLogin.jsp"></jsp:include>

<body>
	<center>
		<form action="addBook" method="post">
			<table bgColor="#c0c0c0">
				<tr>
					<td align="center" bgcolor=green colspan=2><font color=white>添加图书信息</font></td>
				</tr>
				<tr>
					<td>图书编号：</td>
					<td><input type="text" size=20 name="bkID"></td>
				</tr>
				<tr>
					<td>图书名字：</td>
					<td><input type="text" size=20 name="bkName"></td>
				</tr>
				<tr>
					<td>图书作者：</td>
					<td><input type="text" size=20 name="bkAuthor"></td>
				</tr>
				<tr>
					<td>出版社：</td>
					<td><input type="text" size=20 name="bkPress"></td>
				</tr>
				<tr>
					<td>图书价格：</td>
					<td><input type="text" size=20 name="bkPrice" ></td>
				</tr>
				<tr>
					<td>图书状态：</td>
					<td><input type="text" size=20 name="bkState" ></td>
				</tr>
				<tr ><td align="center" colspan="2" ><input type="submit"  value="提交">&nbsp;&nbsp; <input
				type="reset"  value="重置"></td></tr>				
			</table>
			
		</form>
	</center>
</body>
</html>
