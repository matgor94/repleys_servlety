package pl.matgor94.homework.day3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/servlet35")
public class Servlet35 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        int first = Integer.parseInt(request.getParameter("first"));
        int second = Integer.parseInt(request.getParameter("second"));
        int third = Integer.parseInt(request.getParameter("third"));
        int fourth = Integer.parseInt(request.getParameter("fourth"));

        float average = (first+second+third+fourth)/4;

        response.getWriter().println("Liczby:");
        response.getWriter().println("  - " + first);
        response.getWriter().println("  - " + second);
        response.getWriter().println("  - " + third);
        response.getWriter().println("  - " + fourth);
        response.getWriter().println("Średnia: ");
        response.getWriter().println("  - " + average);
        response.getWriter().println("Suma: ");
        response.getWriter().println("  - " + (first+second+third+fourth));
        response.getWriter().println("Iloczyn: ");
        response.getWriter().println("  - " + (first*second*third*fourth));

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
