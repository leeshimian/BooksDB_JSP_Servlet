<%@page import="com.books.model.ReaderType"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
    <title>图书管理系统</title>

</head>
<jsp:include page="isLogin.jsp"></jsp:include>
<body>
<%
    List readerTypes = (List)session.getAttribute("readerTypes");
    Iterator iter = readerTypes.iterator();
%>
<table>
    <tr>
        <td>读者类型：</td>
        <td>类型名称：</td>
        <td>可借数量：</td>
        <td>可借天数：</td>
    </tr>
    <%
        int i = 0;
        while (iter.hasNext()) {
            ReaderType readerType = (ReaderType) iter.next();
    %>
    <tr <%if (i % 2 == 0) {%> bgcolor="#F0F8FF" <%}%>>
        <td><%=readerType.getrdType()%></td>
        <td><%=readerType.getrdTypeName()%></td>
        <td><%=readerType.getcanLendQty()%></td>
        <td><%=readerType.getcanLendDay()%></td>
        <td><a href="modifyReaderType?rdType=<%=readerType.getrdType()%>">修改</a></td>
    </tr>
    <%
            i++;
        }
    %>
    <!--定义i是为了隔行显示颜色-->
</table>
</body>
</html>
