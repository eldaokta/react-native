package com.enigma;

import com.enigma.model.Directions;
import com.enigma.model.Robot;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RobotServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String position = req.getParameter("position");
        String [] posts = position.split(",");
        String fuel = req.getParameter("fuel");
        Robot robot = new Robot(Integer.parseInt(posts[0]), Integer.parseInt(posts[1]), Directions.valueOf(posts[2]));
        robot.setFuel(Integer.parseInt(fuel));
        String commands = req.getParameter("commands");
        robot.comand(commands);
        robot.run();

        req.setAttribute("position",robot.print());
        req.getRequestDispatcher("/hasil/robothasil.jsp").forward(req, resp);



    }
}
