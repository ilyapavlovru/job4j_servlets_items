package ru.job4j.servlets.servlet;

import org.json.simple.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GreetingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        JSONObject obj = new JSONObject();
        obj.put("name", name);
        PrintWriter out = resp.getWriter();
        out.print(obj);
        out.flush();
    }
}
