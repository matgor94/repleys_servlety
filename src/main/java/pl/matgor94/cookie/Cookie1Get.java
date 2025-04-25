package pl.matgor94.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/showCookie")
public class Cookie1Get extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cookieValue;
        Cookie [] cookies = request.getCookies();
        for(Cookie cookie:cookies){
            if("User".equals(cookie.getName())){
                cookieValue = cookie.getValue();
                response.getWriter().println(cookieValue);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
