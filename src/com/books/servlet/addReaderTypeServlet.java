package com.books.servlet;

import com.books.model.ReaderType;
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
@WebServlet(name = "addReaderTypeServlet")
public class addReaderTypeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        Integer rdType = Integer.parseInt(request.getParameter("rdType"));
        String rdTypeName = request.getParameter("rdTypeName");
        Integer canLendQty = Integer.parseInt(request.getParameter("canLendQty"));
        Integer canLendDay = Integer.parseInt(request.getParameter("canLendDay"));

        ReaderType readerType = new ReaderType();

        readerType.setrdType(rdType);
        readerType.setrdTypeName(rdTypeName);
        readerType.setcanLendQty(canLendQty);
        readerType.setcanLendDay(canLendDay);

        if(new readerTypeService().addReaderType(readerType))
            response.sendRedirect("displayReaderType?osid=display");
        else
            response.sendRedirect("addReaderType.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        doPost(request, response);
    }
}
