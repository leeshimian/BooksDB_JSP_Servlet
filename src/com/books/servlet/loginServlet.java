package com.books.servlet;

import com.books.model.userTable;
import com.books.service.userService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class loginServlet extends HttpServlet{

    //重写doPost方法
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        userTable user = new userTable();
        user.setUsername(username);
        user.setPassword(password);
        try {
            if (new userService().valiUser(user)) {

                HttpSession session =request.getSession();
                session.setAttribute("user",user);

                response.sendRedirect("main.jsp");
            }
            else
                response.sendRedirect("index.jsp");
        }catch (IOException e) {
            e.printStackTrace();
                }
    }

    //重写doGet方法
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        doPost(request, response);
    }
}
