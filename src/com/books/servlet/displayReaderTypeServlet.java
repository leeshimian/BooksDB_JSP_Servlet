package com.books.servlet;

import com.books.service.readerTypeService;

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
public class displayReaderTypeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        String osid = request.getParameter("osid");

        List readerTypes = new readerTypeService().queryAllReaderType();
        HttpSession session = request.getSession();
        session.setAttribute("readerTypes",readerTypes);
        if(osid.equals("display"))
            response.sendRedirect("displayReaderType.jsp");
        else if(osid.equals("modify"))
            response.sendRedirect("modifyReaderType.jsp");
        else
            response.sendRedirect("deleteReaderType.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        doPost(request, response);
    }
}
