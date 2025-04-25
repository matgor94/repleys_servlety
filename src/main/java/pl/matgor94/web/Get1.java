package pl.matgor94.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get1")
public class Get1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String start = request.getParameter("start");
        String end = request.getParameter("end");

        if(start != null && end != null){
            for(int i = Integer.parseInt(start); i<=Integer.parseInt(end); i++){
                response.getWriter().println(i);
            }
        } else {
            response.getWriter().println("BRAK");
        }
    }
}
