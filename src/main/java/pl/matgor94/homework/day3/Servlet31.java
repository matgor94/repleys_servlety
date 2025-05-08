package pl.matgor94.homework.day3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/servlet31")
public class Servlet31 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int kwota = Integer.parseInt(request.getParameter("value"));
        String doPrzeliczenia = request.getParameter("waluta");
        if(doPrzeliczenia.equals("eur-usd")){
            response.getWriter().println(kwota*1.12);
        }else if (doPrzeliczenia.equals("pln-eur")){
            response.getWriter().println(kwota*0.24);
        }else {
            response.getWriter().println(kwota*3.79);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
