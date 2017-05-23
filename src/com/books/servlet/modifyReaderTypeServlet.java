package com.books.servlet;

import com.books.model.ReaderType;
import com.books.service.readerTypeService;

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
@WebServlet(name = "modifyReaderTypeServlet")
public class modifyReaderTypeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        Integer rdType = Integer.parseInt(request.getParameter("rdType"));
        ReaderType readerType = new readerTypeService().queryReaderTypebyrdType(rdType);
        HttpSession session = request.getSession();
        session.setAttribute("readerType",readerType);
        response.sendRedirect("modifyOneReaderType.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        doPost(request, response);

    }
}
