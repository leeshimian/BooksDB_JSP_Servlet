package com.books.servlet;

import com.books.model.Reader;
import com.books.service.readerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by datei on 2017/5/21 0021.
 */
@WebServlet(name = "modifyOneReaderServlet")
public class modifyOneReaderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        String rdID = request.getParameter("rdID");
        Integer rdType = Integer.parseInt(request.getParameter("rdType"));
        String rdName = request.getParameter("rdName");
        String rdDept = request.getParameter("rdDept");
        String rdQQ = request.getParameter("rdQQ");
        Integer rdBorrowQty = Integer.parseInt(request.getParameter("rdBorrowQty"));

        Reader reader = new Reader();

        reader.setrdID(rdID);
        reader.setrdType(rdType);
        reader.setrdName(rdName);
        reader.setrdDept(rdDept);
        reader.setrdQQ(rdQQ);
        reader.setrdBorrowQty(rdBorrowQty);

        if(new readerService().updateReader(reader))
            response.sendRedirect("displayReader?osid=display");
        else
            response.sendRedirect("displayReader?osid=modify");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        doPost(request, response);

    }
}
