package com.books.servlet;

import com.books.service.bookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by datei on 2017/5/21 0021.
 */
@WebServlet(name = "displayBookServlet")
public class displayBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        String osid = request.getParameter("osid");

        List books = new bookService().queryAllBook();
        HttpSession session = request.getSession();
        session.setAttribute("books",books);
        if(osid.equals("display"))
            response.sendRedirect("displayBook.jsp");
        else if(osid.equals("modify"))
            response.sendRedirect("modifyBook.jsp");
        else
            response.sendRedirect("deleteBook.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        doPost(request, response);
    }
}
