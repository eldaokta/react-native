package com.enigma;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Hello  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String output = "<html>"+
                "<body>"+
                "<h1>AING "+name+"</h1>"+
                "</body>"+
                "</html>";
        resp.setContentType("text/html");
        resp.getWriter().print(output);
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("servis dipanggil !!");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("init dipanggil!!");
    }
}
