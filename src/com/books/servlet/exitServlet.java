package com.books.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.http.HTTPException;
import java.io.IOException;

/**
 * Created by datei on 2017/5/21 0021.
 */
public class exitServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException,HTTPException{
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        response.sendRedirect("index.jsp");

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException,HTTPException{
        doPost(request, response);
    }
}
