package pl.matgor94.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet14 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.getWriter().println("Adres IP: " + request.getRemoteAddr());
        response.getWriter().println("Przegladarka: " + request.getHeader("User-Agent"));

    }
}
