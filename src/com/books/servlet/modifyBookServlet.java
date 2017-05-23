package com.books.servlet;

import com.books.model.Book;
import com.books.service.bookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by datei on 2017/5/21 0021.
 */
@WebServlet(name = "modifyBookServlet")
public class modifyBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        String bkID = request.getParameter("bkID");
        Book book = new bookService().queryBookbybkID(bkID);
        HttpSession session = request.getSession();
        session.setAttribute("book", book);
        response.sendRedirect("modifyOneBook.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        doPost(request, response);
    }
}
