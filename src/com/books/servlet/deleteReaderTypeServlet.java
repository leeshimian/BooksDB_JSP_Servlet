package com.books.servlet;

import com.books.service.readerTypeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by datei on 2017/5/21 0021.
 */
@WebServlet(name = "deleteReaderTypeServlet")
public class deleteReaderTypeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        Integer rdType = Integer.parseInt(request.getParameter("rdType"));

        if(new readerTypeService().deleteReaderType(rdType))
            response.sendRedirect("displayReaderType?osid=display");
        else
            response.sendRedirect("displayReaderType?osid=delete");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        doPost(request, response);

    }
}
