package pl.matgor94.web;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.IOException;

public class Servlet12 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("Content12");
    }
}
