package com.books.servlet;

import com.books.model.Book;
import com.books.service.bookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "addBookServlet")
public class addBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        String bkID = request.getParameter("bkID");
        String bkName = request.getParameter("bkName");
        String bkAuthor = request.getParameter("bkAuthor");
        String bkPress = request.getParameter("bkPress");
        Double bkPrice = Double.parseDouble(request.getParameter("bkPrice"));
        Integer bkState = Integer.parseInt(request.getParameter("bkState"));

        Book book = new Book();

        book.setbkID(bkID);
        book.setbkName(bkName);
        book.setbkAuthor(bkAuthor);
        book.setbkPress(bkPress);
        book.setbkPrice(bkPrice);
        book.setbkState(bkState);

        if(new bookService().addBook(book))
            response.sendRedirect("displayBook.jsp");
        else
            response.sendRedirect("addBook.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        doPost(request, response);
    }
}
