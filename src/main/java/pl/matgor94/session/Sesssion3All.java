package pl.matgor94.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/showAllSessions")
public class Sesssion3All extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        List<String> stringList = new ArrayList<>();
        HttpSession session = request.getSession();
        stringList = (List<String>) session.getAttribute("sessionKeys");

        if(stringList != null && !stringList.isEmpty()){
            for (String key : stringList){
                response.getWriter().println("Klucz to: " + key + "wartość spod tego klucza to: "+ session.getAttribute(key));
            }
        }else response.getWriter().println("Sesja pusta");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
