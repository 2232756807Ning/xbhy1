package com.nwq.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/*")
public class UserServlet extends BaseServlet{
    public void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("user list");
        request.getRequestDispatcher("/jsp/user/list.jsp").forward(request, response);
    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("user add");

    }

    public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
