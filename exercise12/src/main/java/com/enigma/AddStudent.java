package com.enigma;

import com.enigma.dao.StudentDao;
import com.enigma.model.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class AddStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("addstudent.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String birth_place = req.getParameter("birth_place");
        Date birth_date = java.sql.Date.valueOf(req.getParameter("birth_date"));
        String gender = req.getParameter("gender");
        Student student = new Student(id, name, birth_place, birth_date, gender);
        StudentDao.create(student);
        resp.sendRedirect("./");
    }
}
