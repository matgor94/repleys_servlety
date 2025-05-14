package pl.matgor94.homework.day4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/servlet311")
public class Servlet311 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> lang = new HashMap<>();
        lang.put("en", "Hello");
        lang.put("pl", "Cześć");
        lang.put("de", "Hallo");
        lang.put("es", "Hola");
        lang.put("fr", "Salut");

        String messege = "Cześć";
        Cookie [] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies){
                if (cookie.getName().equals("language")){
                    messege=lang.getOrDefault(cookie.getValue(), "Cześć");
                    break;
                }
            }
        }

        response.getWriter().println("<html>");
        response.getWriter().println("<body>");
        response.getWriter().println(messege);
        response.getWriter().println("<form action='/servlet312' method='POST'>");
        response.getWriter().println("<select name='language'>");
        response.getWriter().println("<option value='en'>English</option>");
        response.getWriter().println("<option value='pl'>Polski</option>");
        response.getWriter().println("<option value='de'>Deutsch</option>");
        response.getWriter().println("<option value='es'>Espaniol</option>");
        response.getWriter().println("<option value='fr'>France</option>");
        response.getWriter().println("</select>");
        response.getWriter().println("<input type='submit' value='Wyślij'>");
        response.getWriter().println("</form>");
        response.getWriter().println("</html>");
        response.getWriter().println("</body>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
