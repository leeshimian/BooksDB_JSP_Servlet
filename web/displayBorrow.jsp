<%@page import="com.books.model.Borrow"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>
<head>
    <title>图书管理系统</title>
</head>
<jsp:include page="isLogin.jsp"></jsp:include>
<body>
<jsp:useBean id="borrowSer" class="com.books.service.borrowService"></jsp:useBean>
<%
    List borrows = borrowSer.queryAllBorrow();
    Iterator iter = borrows.iterator();
%>
<table>
    <tr>
        <td>读者编号</td>
        <td>图书编号</td>
        <td>借书日期</td>
        <td>最终应还日期</td>
        <td>实际还书日期</td>
    </tr>
    <%
        int i = 0;
        while (iter.hasNext()) {
            Borrow borrow = (Borrow) iter.next();
    %>
    <tr <%if (i % 2 == 0) {%> bgcolor="#F0F8FF" <%}%>>
        <td><%=borrow.getRdID()%></td>
        <td><%=borrow.getBkID()%></td>
        <td><%=borrow.getDateBorrow()%></td>
        <td><%=borrow.getDateLendPlan()%></td>
        <td><%=borrow.getDateLendAct()%></td>
            <%
				i++;
				}
			%>
</table>
</body>
</html>
