package pl.matgor94.homework.day3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/servlet34")
public class Servlet34 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        Cookie[] cookies = request.getCookies();
        boolean found = false;
        if (cookies!= null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("visits")) {
                    int visitCount = Integer.parseInt(cookie.getValue());
                    visitCount++;
                    response.getWriter().println("Witaj, odwiedziłeś nas już " + visitCount + " razy.");
                    cookie.setValue(String.valueOf(visitCount));
                    response.addCookie(cookie);
                    found = true;
                    break;
                }
            }
        }
        if(!found){
            Cookie newCookie = new Cookie("visit", "1");
            newCookie.setMaxAge(60*60*24);
            response.addCookie(newCookie);
            response.getWriter().println("Witaj pierwszy raz na naszej stronie");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
