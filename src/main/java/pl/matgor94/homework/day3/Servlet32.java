package pl.matgor94.homework.day3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/servlet32")
public class Servlet32 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        String val = request.getParameter("val");
        int returnedVal = 0;
        if(isBinary(val)){
            int ctr = 0;
            for(int i = val.length()-1; i>=0; i--){
                if(val.charAt(i) != '0'){
                    returnedVal += Math.pow(2,ctr);
                }
                ctr++;
            }
            response.getWriter().println("Wartość dziesiętna podanej liczby to: " + returnedVal);
        }else {
            response.getWriter().println("Podana liczba nie jest liczb binarną");
        }


    }
    public static boolean isBinary(String binary){
        return binary != null && binary.matches("[01]+");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
