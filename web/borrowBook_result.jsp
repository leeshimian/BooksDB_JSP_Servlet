<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书管理系统</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8");%>
<jsp:useBean id="borrowBook" class="com.books.model.BorrowBook"></jsp:useBean>
<jsp:setProperty property="*" name="borrowBook"></jsp:setProperty>
<jsp:useBean id="borrowBookSer" class="com.books.service.borrowBookService"></jsp:useBean>
<%
    out.print(borrowBook.getrdID());
    out.print("请求借阅图书编号为： ");
    out.print(borrowBook.getbkID());
%>
<%
    if(borrowBookSer.BorrowBook(borrowBook.getrdID(),borrowBook.getbkID()))
        out.print("成功！");
    else
        out.print("失败！");
%>
</body>
</html>
