package com.books.servlet;


import com.books.model.Reader;
import com.books.service.readerService;

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
@WebServlet(name = "modifyReaderServlet")
public class modifyReaderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        String rdID = request.getParameter("rdID");
        Reader reader = new readerService().queryReaderbyrdID(rdID);
        HttpSession session = request.getSession();
        session.setAttribute("reader",reader);
        response.sendRedirect("modifyOneReader.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        doPost(request, response);

    }
}
