package com.nwq.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri=request.getRequestURI();
        String[] uriArr=uri.split("/");
        String method=uriArr[uriArr.length-1];
        Class clazz=this.getClass();

        try {
            Method m=clazz.getDeclaredMethod(method,HttpServletRequest.class,HttpServletResponse.class);
            m.setAccessible(true);
            m.invoke(this,request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
