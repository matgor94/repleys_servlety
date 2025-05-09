package pl.matgor94.mvc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/mvc13")
public class Mvc13 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Book book = new Book(request.getParameter("title"), request.getParameter("author"),
                Integer.parseInt(request.getParameter("isbn")));

        request.setAttribute("book", book);
        getServletContext().getRequestDispatcher("/result.jsp").forward(request,response);

    }
}
