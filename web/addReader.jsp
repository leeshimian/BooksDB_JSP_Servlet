<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书管理系统</title>
</head>

<jsp:include page="isLogin.jsp"></jsp:include>

<body>
<center>
    <form action="addReader" method="post">
        <table bgColor="#c0c0c0">
            <tr>
                <td align="center" bgcolor=green colspan=2><font color=white>添加读者信息</font></td>
            </tr>
            <tr>
                <td>读者编号：</td>
                <td><input type="text" size=20 name="rdID"></td>
            </tr>
            <tr>
                <td>读者类型：</td>
                <td><input type="text" size=20 name="rdType"></td>
            </tr>
            <tr>
                <td>读者姓名：</td>
                <td><input type="text" size=20 name="rdName"></td>
            </tr>
            <tr>
                <td>读者院系：</td>
                <td><input type="text" size=20 name="rdDept"></td>
            </tr>
            <tr>
                <td>读者QQ：</td>
                <td><input type="text" size=20 name="rdQQ" ></td>
            </tr>
            <tr>
                <td>借书数量：</td>
                <td><input type="text" size=20 name="rdBorrowQty" ></td>
            </tr>
            <tr ><td align="center" colspan="2" ><input type="submit"  value="提交">&nbsp;&nbsp; <input
                    type="reset"  value="重置"></td></tr>
        </table>

    </form>
</center>
</body>
</html>

