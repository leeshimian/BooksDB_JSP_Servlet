<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎使用图书管理系统</title>
</head>
<jsp:include page="isLogin.jsp"></jsp:include>
<body>
<center>
<form action="borrowBook_result.jsp" method="post">
    <table bgcolor="#C0C0C0">
        <tr>
            <td align="center" bgcolor=green colspan=2><font color=white>借书</font></td>
        </tr>
        <tr>
            <td>读者编号：</td>
            <td><input type="text" size=20 name="rdID"></td>
        </tr>
        <tr>
            <td>图书编号：</td>
            <td><input type="text" size=20 name="bkID"></td>
        </tr>
        <tr >
            <td align="center" colspan="2" ><input type="submit"  value="提交">&nbsp;&nbsp; <input
                type="reset"  value="重置"></td>
        </tr>
    </table>
</form>
</center>
</body>
</html>
