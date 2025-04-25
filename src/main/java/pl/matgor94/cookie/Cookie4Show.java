package pl.matgor94.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/showAllCookies")
public class Cookie4Show extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie [] cookies = request.getCookies();
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        if(cookies!= null) {
            for (Cookie cookie : cookies) {
                response.getWriter().println(cookie.getName() + " " + cookie.getValue());
                response.getWriter().println("<a href ='/removeCookie?name=" + cookie.getName() + "'>Usuń ciasteczko</a><br>");
            }
        }else response.getWriter().println("Brak ciasteczek");
    }
}
