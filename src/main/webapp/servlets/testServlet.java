package servlets;   

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;


class testServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html, charset=UTF-8");
        response.getWriter().println("Hello World!");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("meta charset=\"UTF-8\">");
        out.println("<title>testServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet testServlet at " + request.getContextPath() + "</h1>");
        out.println("<p>This page is generated from a servlet</p>");
        out.println("</body");
        out.println("/html");
    }
}