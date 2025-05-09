package pl.matgor94.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/zad4jsp")
public class Zad4jsp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("foo", "bar");
        cookie.setMaxAge(60*60*24);
        response.addCookie(cookie);
        response.getWriter().println("Dodano ciasteczko!");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
