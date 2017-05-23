package com.books.servlet;

import com.books.service.bookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by datei on 2017/5/21 0021.
 */
@WebServlet(name = "deleteBookServlet")
public class deleteBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        String bkID = request.getParameter("bkID");
        if(new bookService().deleteBook(bkID))
            response.sendRedirect("displayBook?osid=display");
        else
            response.sendRedirect("displayBook?osid=delete");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        doPost(request, response);

    }
}
