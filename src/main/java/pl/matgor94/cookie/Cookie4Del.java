package pl.matgor94.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/removeCookie")
public class Cookie4Del extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Cookie [] cookies = request.getCookies();

        if (cookies != null) {
        for(Cookie cookie:cookies) {
            if (name.equals(cookie.getName())) {
                cookie.setMaxAge(0);
                response.addCookie(cookie);
                }
            }
        }
        response.sendRedirect("/showAllCookies");
    }
}
