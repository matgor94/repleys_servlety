package pl.matgor94.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/getForm3")
public class Form3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int number = Integer.parseInt(request.getParameter("page"));
        List<Integer> dividers = new ArrayList<>();

        if(number > 1) {
            for (int i = 1; i <= number; i++) {
                if(number % i == 0){
                    dividers.add(i);
                }
            }
        }
        for (Integer num : dividers){
            response.getWriter().println(num);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
