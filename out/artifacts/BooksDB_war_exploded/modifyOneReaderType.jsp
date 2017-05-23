<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.books.model.ReaderType" %>
<html>
<head>
    <title>图书管理系统</title>
</head>

<body>
<center>
    <%request.setCharacterEncoding("utf-8"); %>
    <%
        ReaderType readerType = (ReaderType)session.getAttribute("readerType");
    %>
    <form action="modifyOneReaderType" method="post">
        <table bgColor="#c0c0c0">

            <tr>
                <td align="center" bgcolor=green colspan=2><font color=white>修改读者类型信息</font></td>
            </tr>
            <tr>
                <td>读者类型：</td>
                <td><input type="text" size=20 name="rdType"
                           value="<%=readerType.getrdType()%>"></td>
            </tr>
            <tr>
                <td>类型名称：</td>
                <td><input type="text" size=20 name="rdTypeName"
                           value="<%=readerType.getrdTypeName()%>"></td>
            </tr>

            <tr>
                <td>可借数量：</td>
                <td><input type="text" size=20 name="canLendQty"
                           value="<%=readerType.getcanLendQty()%>"></td>
            </tr>
            <tr>
                <td>可借天数：</td>
                <td><input type="text" size=20 name="canLendDay"
                           value="<%=readerType.getcanLendDay()%>"></td>
            </tr>
            <tr>
                <td align="center" colspan="2"><input type="hidden" name="rdType" value="<%=readerType.getrdType()%>"/><input type="submit" value="提交">&nbsp;&nbsp;
                    <input type="reset" value="重置"></td>
            </tr>
        </table>

    </form>
</center>
</body>
</html>
