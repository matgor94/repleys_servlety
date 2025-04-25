package pl.matgor94.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/post5")
public class Form5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String conversionType = request.getParameter("conversionType");
        int value = Integer.parseInt(request.getParameter("degrees"));

        if(conversionType.equals("calcToFahr")){
            response.getWriter().println((2*value)+32);
        }else {
            response.getWriter().println((value-32)/2);
        }
    }
}
