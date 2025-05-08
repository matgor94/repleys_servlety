package pl.matgor94.homework.day3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/servlet33")
public class Servlet33 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        String val1 = (String) session.getAttribute("val1");
        String val2 = (String) session.getAttribute("val2");
        String val3 = (String) session.getAttribute("val3");

        response.getWriter().println("<html><body>");
        response.getWriter().println("<form action='/servlet33' method='POST'>");
        response.getWriter().println("1: <input type='text' name='val1' value='" + (val1 != null ? val1 :  "") + "'><br>");
        response.getWriter().println("2: <input type='text' name='val2' value='" + (val2 != null ? val2 :  "") + "'><br>");
        response.getWriter().println("3: <input type='text' name='val3' value='" + (val3 != null ? val3 :  "") + "'><br>");
        response.getWriter().println("<input type='submit' value='Wyślij'>");
        response.getWriter().println("</form>");
        response.getWriter().println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("val1", request.getParameter("val1"));
        session.setAttribute("val2", request.getParameter("val2"));
        session.setAttribute("val3", request.getParameter("val3"));

        response.sendRedirect("/servlet33");
    }
}
