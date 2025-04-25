package pl.matgor94.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/cookie52")
public class Cookie52 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie [] cookies = request.getCookies();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        boolean test = false;
        if(cookies!=null){
            for (Cookie cookie : cookies){
                if("cookie51".equals(cookie.getName())){
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                    response.getWriter().println("Witamy na stronie Cookie52");
                    test = true;
                }
            }
        }
        if(!test){
                String msg = "FirstVisitCookie51";
                response.sendRedirect("/cookie51?msg="+msg);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
