package pl.matgor94.homework.day3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/rememberMe")
public class Servlet36 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        boolean cookieFound = false;
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("rememberMe".equals(cookie.getName())) {
                    response.getWriter().println("Cześć " + cookie.getValue() + "Twoje dane zostały wczytane z ciasteczka");
                    cookieFound = true;
                    break;
                }
            }
        }
        if(!cookieFound){
            response.getWriter().println("<html><body>");
            response.getWriter().println("<form action='/rememberMe' method='post'>");
            response.getWriter().println("Imię <input type='text' name='name'><br>");
            response.getWriter().println("<input type='checkbox' name='rememberMe' value='Zapamiętaj mnie'>");
            response.getWriter().println("<input type='submit' value='Wyślij'>");
            response.getWriter().println("</form>");
            response.getWriter().println("</body></html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String checkbox = request.getParameter("rememberMe");
        response.getWriter().println("Cześć " + name);

        if(checkbox != null){
            Cookie cookie = new Cookie("rememberMe", name);
            cookie.setMaxAge(60 * 60 * 24);
            response.addCookie(cookie);
        }

        response.sendRedirect("/rememberMe");
    }
}
