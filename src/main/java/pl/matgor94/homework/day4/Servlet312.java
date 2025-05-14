package pl.matgor94.homework.day4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/servlet312")
public class Servlet312 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String form =request.getParameter("language");
        if(form != null && !form.isEmpty()){
            Cookie language = new Cookie("language", form);
            language.setMaxAge(60*60*24);
            response.addCookie(language);
        }
response.sendRedirect("/servlet311");
    }
}
