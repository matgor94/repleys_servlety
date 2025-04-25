package pl.matgor94.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/post4")
public class Form4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        int c = Integer.parseInt(request.getParameter("c"));

        double delta = (b*b) - (4*a*c);
        if(delta < 0 ){
            response.getWriter().println("Brak miejsc zerowych");
        }else if (delta == 0){
            double tmpX = -(b/(2*a));
            response.getWriter().println("Miejsce zerowe funkcji to: " + Math.round(tmpX*100)/100);
        }else {
            double x1 = Math.round((-b-Math.sqrt(delta)) / (2*a));
            double x2 = Math.round((-b+Math.sqrt(delta)) / (2*a));
            response.getWriter().println("Miejsca zerowe funkcji to: " + Math.round(x1*100)/100 + " " + Math.round(x2*100)/100);
        }
    }
}
