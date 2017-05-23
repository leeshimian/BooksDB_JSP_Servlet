<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书管理系统</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8");%>
<jsp:useBean id="returnBook" class="com.books.model.ReturnBook"></jsp:useBean>
<jsp:setProperty property="*" name="returnBook"></jsp:setProperty>
<jsp:useBean id="returnBookSer" class="com.books.service.returnBookService"></jsp:useBean>
<%
    out.print(returnBook.getrdID());
    out.print("请求还书编号为：");
    out.print(returnBook.getbkID());
%>
<%
    if(returnBookSer.ReturnBook(returnBook.getrdID(),returnBook.getbkID()))
        out.print("成功！");
    else
        out.print("失败!");
%>
</body>
</html>
