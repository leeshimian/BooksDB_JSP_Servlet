<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书管理系统</title>
</head>

<jsp:include page="isLogin.jsp"></jsp:include>

<body>
<center>
    <form action="addReaderType" method="post">
        <table bgColor="#c0c0c0">
            <tr>
                <td align="center" bgcolor=green colspan=2><font color=white>添加读者类别信息</font></td>
            </tr>
            <tr>
                <td>读者类型：</td>
                <td><input type="text" size=20 name="rdType"></td>
            </tr>
            <tr>
                <td>类型名称：</td>
                <td><input type="text" size=20 name="rdTypeName"></td>
            </tr>
            <tr>
                <td>可借数量：</td>
                <td><input type="text" size=20 name="canLendQty"></td>
            </tr>
            <tr>
                <td>可借天数：</td>
                <td><input type="text" size=20 name="canLendDay"></td>
            </tr>
            <tr ><td align="center" colspan="2" ><input type="submit"  value="提交">&nbsp;&nbsp; <input
                    type="reset"  value="重置"></td></tr>
        </table>

    </form>
</center>
</body>
</html>


