<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.books.model.Reader" pageEncoding="UTF-8"%>
<html>
<head>
    <title>图书管理系统</title>
</head>

<body>
<center>
    <%request.setCharacterEncoding("utf-8"); %>
    <%
        Reader reader = (Reader)session.getAttribute("reader");
    %>
    <form action="modifyOneReader" method="post">
        <table bgColor="#c0c0c0">

            <tr>
                <td align="center" bgcolor=green colspan=2><font color=white>修改读者信息</font></td>
            </tr>
            <tr>
                <td>读者编号：</td>
                <td><input type="text" size=20 name="rdID"
                           value="<%=reader.getrdID()%>"></td>
            </tr>
            <tr>
                <td>读者类型：</td>
                <td><input type="text" size=20 name="rdType"
                           value="<%=reader.getrdType()%>"></td>
            </tr>
            <tr>
                <td>读者姓名：</td>
                <td><input type="text" size=20 name="rdName"
                           value="<%=reader.getrdName()%>"></td>
            </tr>

            <tr>
                <td>读者院系：</td>
                <td><input type="text" size=20 name="rdDept"
                           value="<%=reader.getrdDept()%>"></td>
            </tr>
            <tr>
                <td>读者QQ：</td>
                <td><input type="text" size=20 name="rdQQ"
                           value="<%=reader.getrdQQ()%>"></td>
            </tr>
            <tr>
                <td>借书数量：</td>
                <td><input type="text" size=20 name="rdBorrowQty"
                           value="<%=reader.getrdBorrowQty()%>"></td>
            </tr>

            <tr>
                <td align="center" colspan="2"><input type="hidden" name="rdID" value="<%=reader.getrdID()%>"/><input type="submit" value="提交">&nbsp;&nbsp;
                    <input type="reset" value="重置"></td>
            </tr>
        </table>

    </form>
</center>
</body>
</html>
