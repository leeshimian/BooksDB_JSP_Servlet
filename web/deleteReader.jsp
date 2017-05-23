<%@page import="com.books.model.Reader"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
    <title>图书管理系统</title>

</head>
<jsp:include page="isLogin.jsp"></jsp:include>
<body>
<jsp:useBean id="readerSer" class="com.books.service.readerService"></jsp:useBean>
<%
    List readers = readerSer.queryAllReader();
    Iterator iter = readers.iterator();
%>
<table>
    <tr>
        <td>读者编号</td>
        <td>读者类型</td>
        <td>读者姓名</td>
        <td>读者院系</td>
        <td>读者QQ</td>
        <td>借书数量</td>
    </tr>
    <%
        int i = 0;
        while (iter.hasNext()) {
            Reader reader = (Reader) iter.next();
    %>
    <tr <%if (i % 2 == 0) {%> bgcolor="#F0F8FF" <%}%>>
        <td><%=reader.getrdID()%></td>
        <td><%=reader.getrdType()%></td>
        <td><%=reader.getrdName()%></td>
        <td><%=reader.getrdDept()%></td>
        <td><%=reader.getrdQQ()%></td>
        <td><%=reader.getrdBorrowQty()%></td>
        <td><a href="deleteReader?rdID=<%=reader.getrdID()%>">删除</a></td>
    </tr>
    <%
            i++;
        }
    %>
    <!--定义i是为了隔行显示颜色-->
</table>
</body>
</html>
