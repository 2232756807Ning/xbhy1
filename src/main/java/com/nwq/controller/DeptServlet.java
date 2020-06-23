package com.nwq.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dept/*")
public class DeptServlet extends BaseServlet{
    public void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("dept list");

    }
}
